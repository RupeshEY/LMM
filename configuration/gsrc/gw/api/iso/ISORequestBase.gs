package gw.api.iso

uses gw.api.util.DateUtil
uses gw.xml.date.XmlDateTime
uses xsd.iso.req.ClaimInvestigationAddRq
uses xsd.iso.req.ClaimsSvcRq
uses xsd.iso.req.CodeList

uses java.util.Date
uses java.util.UUID

/**
 * Base class for all ISO request construction. Provides utilities common to
 * constructing both key field update and claim search requests
 */
@Export
class ISORequestBase {

  /** Root of the ACORD XML */
  private var _acordRequest : xsd.iso.req.ACORD as readonly AcordRequest

  /** The ClaimInvestigationAddRq, contains most of the data in the ACORD request */
  private var _addRequest : ClaimInvestigationAddRq as readonly AddRequest

  /** Contents of ISO properties file */
  private var _properties : ISOProperties as readonly Properties

  /** Translator for typecodes, coverage codes and phone numbers */
  private var _translate : ISOTranslate as readonly Translate

  /** The claim about which this request is being constructed */
  private var _claim : Claim as readonly Claim

  /** Counter used to construct unique ids (unique within this request's XML) */
  private var _idCounter = 0
  
  /**
   * Construct new request object. Saves a reference to the given claim and
   * gets a reference to the ISO properties and translator. Initializes
   * the ACORD request and fills in a skeleton ClaimInvestigationAddRq
   */
  protected construct(inClaim : Claim) {
    _properties = ISOProperties.instance()
    _translate = ISOTranslate.instance()
    _claim = inClaim
    initRequests()
  }

  private function initRequests() {
    _acordRequest = createAcordRequest()
    _addRequest = createClaimsServiceRequest(_acordRequest)
  }
  
  /**
   * Construct the ACORD request with enclosed sign on and client app
   * aggregates
   */
  protected function createAcordRequest() : xsd.iso.req.ACORD {
    var acord = new xsd.iso.req.ACORD()
    createSignOnRequest(acord)
    // need to format to ISO8601format?
    acord.SignonRq.ClientDt = new XmlDateTime(DateUtil.currentDate().toCalendar(), true)
    acord.SignonRq.CustLangPref = Properties.CustomerLanguagePreference
    createClientApp(acord)
    return acord
  }

  /**
   * Construct the skeleton ClaimInvestigationAddRq request and link it to
   * the main ACORD request via a ClaimsSvcRq
   */
  protected function createClaimsServiceRequest(acord : xsd.iso.req.ACORD) : ClaimInvestigationAddRq {
    var claimsSvcRq = new ClaimsSvcRq()
    // can't set to empty string as this violates xs:string facet
    /**
    *    <xs:restriction base="String">
    *      <xs:minLength value="1"/>
    *    </xs:restriction>
    */
    //claimsSvcRq.RqUID = "" // Request id is populated when message is sent
    claimsSvcRq.RqUID = UUID.randomUUID().toString()  // here initialized to some unique string
    claimsSvcRq.SPName = Properties.SPName
    var addReq : ClaimInvestigationAddRq = createClaimInvestigationAddRequest()
    claimsSvcRq.ClaimInvestigationAddRq.add(addReq)
    acord.ClaimsSvcRq.add(claimsSvcRq)
    return addReq
  }

  /**
   * Fill in the ACORD request's SignonRq, using information from ISO properties
   */
  protected function createSignOnRequest(acord : xsd.iso.req.ACORD) {
    acord.SignonRq.SignonPswd.CustId.SPName = Properties.SPName
    acord.SignonRq.SignonPswd.CustId.CustPermId = Properties.CustomerLoginId
    acord.SignonRq.SignonPswd.CustId.CustLoginId = Properties.CustomerLoginId
    acord.SignonRq.SignonPswd.CustPswd.EncryptionTypeCd = Properties.EncryptionTypeCode
    acord.SignonRq.SignonPswd.CustPswd.Pswd = Properties.CustomerPassword
  }
  
  /**
   * Fill in the ACORD request's SignonRq.ClientApp, using information from
   * ISO properties
   */
  protected function createClientApp(acord : xsd.iso.req.ACORD) {
    acord.SignonRq.ClientApp.Org = Properties.Org
    acord.SignonRq.ClientApp.Name = Properties.Name
    acord.SignonRq.ClientApp.Version = Properties.Version
  }
  
  /**
   * Utility to create the Policy sub aggregate within the ClaimInvestigationAddRq,
   * using information from the provided arguments and the claim.
   */
  protected function createPolicy(effectiveDate : Date, expirationDate : Date, assignedRisk : Boolean, lobCode : String) {
    AddRequest.Policy.PolicyNumber = Claim.Policy.PolicyNumber                                       
    AddRequest.Policy.LOBCd = lobCode
    AddRequest.Policy.LOBCd_elem.Codelistref = findOrCreateCodeList(ISOCodeList.POLICY_TYPE_CODE.Id)
    if (effectiveDate != null && expirationDate != null) {
      AddRequest.Policy.ContractTerm.EffectiveDt = Translate.formatClaimDate(effectiveDate)
      AddRequest.Policy.ContractTerm.ExpirationDt = Translate.formatClaimDate(expirationDate)
    }
    if (assignedRisk != null) {
      AddRequest.Policy.AssignedRiskInd = assignedRisk ? ISOConstants.TRUE : ISOConstants.FALSE
    }
    createMiscParty()
  }
    
  /**
   * Utility to create the ClaimsOccurrence sub aggregate within the
   * ClaimInvestigationAddRq, using information from the provided arguments
   * and the claim.
   */
  protected function createClaimsOccurrence(lossDate : Date, reportedDate : Date, insurerId : String) {
    AddRequest.ClaimsOccurrence.ItemIdInfo.InsurerId = insurerId
    if (reportedDate != null) {
      var claimsReported = new xsd.iso.req.ClaimsReported()
      claimsReported.ReportedToRef = AddRequest.Policy.MiscParty.firstWhere( \ elt -> elt.Id == ISOConstants.MISC_PARTY_ID)
      if (reportedDate != null) {
        claimsReported.ReportedDt = Translate.formatClaimDate(reportedDate)
      }
      AddRequest.ClaimsOccurrence.ClaimsReported.add(claimsReported)
    }
    AddRequest.ClaimsOccurrence.LossDt = Translate.formatClaimDate(lossDate)
  }
  
  /**
   * Allocate a new unique id (unique only within this request). Typically
   * used to construct references between different items within the request.
   */
  protected function getNextId() : String {
    _idCounter = _idCounter + 1
    return "id" + _idCounter
  }
  
  /**
   * Utility to create an Addr sub aggregate from the given address
   */
  protected function createAddr(address : Address) : xsd.iso.req.Addr {
    var addr = new xsd.iso.req.Addr()
    addr.Addr1 = truncateString(address.AddressLine1, 50)
    addr.Addr2 = truncateString(address.AddressLine2, 50)
    addr.Addr3 = truncateString(address.AddressLine3, 50)
    addr.City = truncateString(address.City, 25)
    addr.StateProvCd = address.State.Abbreviation.Code
    addr.PostalCode = truncateString(address.PostalCode, 9)
    addr.CountryCd = address.Country.Code
    return addr
  }
  
  /**
   * Utility to create a MiscParty sub aggregate from the claim information
   * and add it to the Policy sub aggregate's MiscPartys
   */
  protected function createMiscParty() {
    var miscParty = new xsd.iso.req.MiscParty()
    miscParty.Id = ISOConstants.MISC_PARTY_ID
    miscParty.ItemIdInfo.AgencyId = (Claim.AgencyId == null) ? Properties.AgencyId : Claim.AgencyId
    var miscPartyInfo = new xsd.iso.req.MiscPartyInfo()
    miscPartyInfo.MiscPartyRoleCd = ISOConstants.MISC_PARTY_ROLE
    miscParty.MiscPartyInfo.add(miscPartyInfo)
    AddRequest.Policy.MiscParty.add(miscParty)
  }
  
  /**
   * Construct a skeleton ClaimInvestigationAddRq, populated with the current
   * date and the currency specified in ISO properties
   */
  protected function createClaimInvestigationAddRequest() : xsd.iso.req.ClaimInvestigationAddRq {
    var addRq = new xsd.iso.req.ClaimInvestigationAddRq()
    // can't set to empty string as this violates xs:string facet
    /**
     *    <xs:restriction base="String">
     *      <xs:minLength value="1"/>
     *    </xs:restriction>
     */
    //addRq.RqUID = "" // Request id is populated when message is sent
    addRq.RqUID = UUID.randomUUID().toString()  // here initialized to some unique string
    addRq.TransactionRequestDt = Translate.formatRequestDate(Date.CurrentDate)
    addRq.CurCd = Properties.CurrencyCode
    return addRq
  }
  
  /**
   * Utility to ensure that there is a code list entry in the request header
   * for the given code list. If there isn't already an entry a new one is
   * added, with the CodeListOwnerCd "ISOUS"
   */
  protected function findOrCreateCodeList(name : String) : CodeList {
    return findOrCreateCodeList(name, ISOConstants.CODE_LIST_OWNER_CODE)
  }
  
  /**
   * Utility to ensure that there is a code list entry in the request header
   * for the given code list, with the given CodeListOwnerCd. If there isn't
   * already an entry a new one is added, with the given owner
   */
  protected function findOrCreateCodeList(name : String, codeListOwnerCd : String) : CodeList {

    var codelist = AddRequest.CodeList.firstWhere(
        \ elt -> elt.CodeListName.equalsIgnoreCase(name)
            and
            elt.CodeListOwnerCd.equalsIgnoreCase(codeListOwnerCd))
    if (codelist == null) {
      codelist = createCodeList(name, codeListOwnerCd)
      AddRequest.CodeList.add(codelist)
    }
    return codelist
  }

  /**
   * Utility to create a new code list entry, in the event that
   * findOrCreateCodeList cannot find an existing entry
   */
  protected function createCodeList(name : String, codeListOwnerCd : String) : CodeList {
    var codeList = new CodeList()
    codeList.Id = name
    codeList.CodeListName = name
    codeList.CodeListOwnerCd = codeListOwnerCd
    return codeList
  }

  /**
   * String truncation utility, used to truncate string values that cannot
   * exceed a particular length
   */
  protected function truncateString(string : String, maxLength : int) : String {
    if (string == null or string.length <= maxLength) {
      return string
    } else {
      return string.substring(0, maxLength)
    }
  }
}
