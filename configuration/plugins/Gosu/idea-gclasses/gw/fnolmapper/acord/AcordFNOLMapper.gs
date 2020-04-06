package gw.fnolmapper.acord

uses gw.api.fnolmapper.FNOLMapper
uses gw.api.fnolmapper.FNOLMapperException
uses java.util.Date

uses xsd.acord.ACORD
uses xsd.acord.ClaimsNotificationAddRq

uses gw.xml.xsd.types.XSDTime
uses gw.api.address.AddressJurisdictionHandler

/**
 * Main class for mapping an ACORD XML document to an FNOL Claim. This is a reference
 * implementation only: not all ACORD properties or codes are mapped. Specific additional requirements
 * may require extension or modification of this and related classes. Type list mappings are configurable
 * using the standard TypecodeMapping mechanism with the "acord" namespace.
 * PRE: requires (and only processes) a <ClaimsNotificationAddRq> child element in the XML document
 */
@Export
class AcordFNOLMapper implements FNOLMapper 
{   
  var config:AcordConfig
  var mapperFactory:IMapperFactory
  var contactMapper:IContactMapper
  var contactManager:ContactManager
  
  construct() {
    config = new AcordConfig()
    mapperFactory = config.MapperFactory
    contactManager = new ContactManager()
    contactMapper = mapperFactory.getContactMapper()
  }
  
  /**
   * Populates Claim data from ACORD XML.
   */
  override function populateClaim(claim:Claim, acordXML:String) {
    var acordRequest = ACORD.parse(acordXML)
    //get first "Add Request" for Claim
    var addRequest = this.getFirstValidRequest(acordRequest)
    if(addRequest==null)
      throw new FNOLMapperException("No Claims Notification Add Request (<ClaimsNotificationAddRq>) in document")
    config.getLogger().info("Processing Claim Service Request UID=" + addRequest.RqUID!=null ? addRequest.RqUID : "Not Given")
    populatePolicy(claim.Policy, addRequest)
    populateClaimInfo(claim, addRequest.ClaimsOccurrence)
    populatePrincipals(claim, addRequest)
    populateClaimParties(claim, addRequest)
    populateLossDetails(claim, addRequest)
    populateIncidentsAndExposures(claim, addRequest)
  }
  
  //Finds the first valid Claim Add Request or returns null
  private function getFirstValidRequest(acordReq:ACORD): ClaimsNotificationAddRq {
    var addRequest:ClaimsNotificationAddRq = null
    for(claimSvcReq in acordReq.ClaimsSvcRq) {
      if(addRequest!=null) break;
      for(addRq in claimSvcReq.ClaimsNotificationAddRq) {
          if(addRq !=null) {
            addRequest = addRq
            break;
          }
      }
    }
    return addRequest
  }
  
  /**
   * Sets basic info on the claim.
   */
  private function populateClaimInfo(claim:Claim, claimInfo:xsd.acord.ClaimsOccurrence) {
    //set loss date if present
    if(claimInfo.LossDt_elem!=null) {
      if(claimInfo.LossTime!=null)
        claim.LossDate = getDateTime(claimInfo.LossDt_elem.$TypeInstance, claimInfo.LossTime)
      else
        claim.LossDate = claimInfo.LossDt_elem.$TypeInstance.toDate()
    }
    if(claimInfo.Addr!=null)
      claim.LossLocation = mapperFactory.getAddressMapper().getAddress(claimInfo.Addr)
  }
    
  //populates Claim policy information
  private function populatePolicy(claimPolicy:Policy, req:ClaimsNotificationAddRq) {
      mapperFactory.getPolicyMapper().populate(claimPolicy, req)
  }
  
  //populates Insured or Principal contacts as Claim contacts
  private function populatePrincipals(claim:Claim, req:ClaimsNotificationAddRq) {
      for(contact in req.InsuredOrPrincipal) {
          var claimContact = contactMapper.getContact(contact, claim.Policy)
          if(claimContact!=null) {
            contactManager.addContact(contact.Id, claimContact)
            claim.addToContacts(claimContact)
          }
      }
  }
  
  //populates the Claim parties as Claim contacts
  private function populateClaimParties(claim:Claim, claimReq:ClaimsNotificationAddRq) {
      for(claimParty in claimReq.ClaimsParty) {
        var claimContact = contactMapper.getContact(claimParty)
        if(claimContact!=null) {
          contactManager.addContact(claimParty.Id, claimContact)
          claim.addToContacts(claimContact)
        }
      }
  }
  
  //populates the Loss details on the Claim
  private function populateLossDetails(claim: Claim, claimReq:ClaimsNotificationAddRq) {
      var claimOccur =  claimReq.ClaimsOccurrence
      claim.LossType = config.getLossTypeMap().get(claimReq.Policy.LOBCd_elem.$Text)
      claim.LossDate = getDateTime(claimOccur.LossDt_elem.$TypeInstance, claimOccur.LossTime)
      var address = claimReq.ClaimsOccurrence.Addr==null ? new Address() : 
        mapperFactory.getAddressMapper().getAddress(claimReq.ClaimsOccurrence.Addr)
      claim.LossLocation = address
      var country = address.Country
      claim.JurisdictionState = AddressJurisdictionHandler.getJurisdiction(address)
      claim.LOBCode = config.getLOBTypeMap().get(claimReq.Policy.LOBCd_elem.$Text)
      claim.ReportedDate = claimOccur.ClaimsReported[0].ReportedDt_elem.$TypeInstance.toDate()
      claim.Description = claimOccur.IncidentDesc
  }
  
  //populates the incidents and exposures on the Claim
  private function populateIncidentsAndExposures(claim: Claim, claimReq:ClaimsNotificationAddRq) {
      var exposureMapper = mapperFactory.getExposureMapper(contactManager)
      var incidentMapper = mapperFactory.getIncidentMapper(contactManager)
      //Choice of one of the following...
      //auto loss
      for(autoLoss in claimReq.AutoLossInfo) {
        var incident = incidentMapper.getVehicleIncident(claim, autoLoss)
        exposureMapper.getVehicleExposure(claim, autoLoss, incident)
      }
      //general liability loss
      for(liabilityLoss in claimReq.LiabilityLossInfo) {
        var incident = incidentMapper.getGenLiabilityIncident(claim, liabilityLoss)
        exposureMapper.getGenLiabilityExposure(claim, liabilityLoss, incident)
      }
      //property loss
      for(propertyLoss in claimReq.PropertyLossInfo) {
        var incident = incidentMapper.getPropertyIncident(claim, propertyLoss)
        exposureMapper.getPropertyExposure(claim, propertyLoss, incident)
      }
      //worker's comp loss
      for(wcLoss in claimReq.WorkCompLossInfo) {
        if(wcLoss.EmployeeInfo!=null)
          addEmploymentData(claim, wcLoss.EmployeeInfo)
        var incident = incidentMapper.getWorkCompIncident(claim, wcLoss)
        exposureMapper.getWorkCompExposure(claim, wcLoss, incident)
      }

      //create incidents and exposures for claimant's ClaimsInjuredInfo, if present
      for(claimParty in claimReq.ClaimsParty) {
        if(claimParty.hasRole(AcordUtil.ROLE_CLAIMANT)) {
          if(claimParty.ClaimsInjuredInfo!=null) {
            var incident = incidentMapper.getInjuryIncident(claim, claimParty.ClaimsInjuredInfo)
            exposureMapper.getInjuryExposure(claim, claimParty.ClaimsInjuredInfo, incident)
          }
        }
      }
  }
  
  /**
   * Additional data for Worker's Comp claims
   */
  private function addEmploymentData(claim:Claim, employeeInfo:xsd.acord.EmployeeInfo) {
    var employmentData = claim.newEmploymentData()
    claim.EmploymentData = employmentData
    employmentData.HireDate = employeeInfo.HiredDt_elem.$TypeInstance.toDate()
    employmentData.HireState = State.get(employeeInfo.HiredStateProvCd);
    employmentData.EmploymentStatus = config.getEmploymentStatusTypeMap().get(employeeInfo.EmploymentStatusCd_elem.$Text)
    employmentData.DepartmentCode = employeeInfo.RegularDept
    if(employeeInfo.EmployeePay.HasElements) {
      var pay = employeeInfo.EmployeePay.first()
      employmentData.WageAmount = AcordUtil.getCurrencyAmount(pay.AvgAmt.Amt,pay.AvgAmt.CurCd)
    }
    employmentData.WagePaymentCont = employeeInfo.SalaryContinuanceInd
    employmentData.PaidFull = employeeInfo.FullPayDayInjuredInd
    if(employeeInfo.EmployeeSchedule!=null) {
      var schedule = employeeInfo.EmployeeSchedule.first()
      employmentData.NumDaysWorked = schedule.NumDaysPerWeek
      employmentData.NumHoursWorked = schedule.NumHoursPerDay
    }
    claim.InjuredOnPremises = employeeInfo.OccurredPremisesCd_elem.$Text.equalsIgnoreCase("Employer")
    claim.SafetyEquipProv = employeeInfo.SafeguardsProvidedInd
    claim.SafetyEquipUsed = employeeInfo.SafeguardsUsedInd
  }
  
  //returns a java.util.Date that reflects the appropriate Date & Time
  private function getDateTime(dateElem:xsd.acord.types.complex.Date, xsdTime:gw.xml.date.XmlTime) : Date {
    return dateElem.toDateTime(xsdTime)
  }
}
