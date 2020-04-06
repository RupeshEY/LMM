package gw.fnolmapper.acord.impl

uses gw.api.address.AddressFillableExtensionImpl
uses gw.api.address.AddressJurisdictionHandler
uses gw.fnolmapper.acord.AcordConfig
uses gw.fnolmapper.acord.IContactMapper
uses gw.pl.logging.LoggerCategory
uses xsd.acord.BusinessInfo
uses xsd.acord.ClaimsParty
uses xsd.acord.GeneralPartyInfo
uses xsd.acord.InsuredOrPrincipalInfo
uses xsd.acord.InsuredOrPrincipal
uses xsd.acord.NameInfo
uses xsd.acord.PersonInfo

uses java.util.ArrayList
uses java.util.List

/**
 * Maps the appropriate XML elements to ClaimContact/Contact entities
 */
@Export
class AcordContactMapper implements IContactMapper
{
  static var logger = LoggerCategory.API
  
  var config:AcordConfig
  
  construct(configuration:AcordConfig) {
    this.config = configuration
  }
  
  //Main method to get the Insured or Principal ClaimContact
  override function getContact(principal:InsuredOrPrincipal, policy:Policy) : ClaimContact {
    var partyInfo = principal.GeneralPartyInfo
    //if does not validate, dump contact
    if(!validate(partyInfo))
      return null
    var contact = getContact2(partyInfo, principal.InsuredOrPrincipalInfo)
    var claimContact = getClaimContact(contact, partyInfo)
    for(roleElem in principal.InsuredOrPrincipalInfo.InsuredOrPrincipalRoleCd) {
      var cr = getRole(roleElem.StringValue)
      if(cr.Role==ContactRole.TC_INSURED)
        cr.Policy = policy
      claimContact.addToRoles(cr)
    }
    return claimContact
  }
  
  //Main method to get the Claim Party ClaimContact
  override function getContact(claimParty:ClaimsParty) : ClaimContact {
    var partyInfo = claimParty.GeneralPartyInfo
    //if does not validate, dump contact
    if(!validate(partyInfo))
      return null
    var ct = getContact(claimParty.GeneralPartyInfo, claimParty)
    var claimContact = getClaimContact(ct, partyInfo)
    for(roleElem in claimParty.ClaimsPartyInfo.ClaimsPartyRoleCd) {
      claimContact.addToRoles(getRole(roleElem.StringValue))
    }
    return claimContact
  }
  
  //returns new ClaimContact from Contact with additional info populated
  private function getClaimContact(contact:Contact, partyInfo:GeneralPartyInfo) : ClaimContact {
     var claimContact = new ClaimContact()
     claimContact.Contact = contact
     if(partyInfo.EffectiveDt_elem!=null)
       claimContact.ContactValidFrom = partyInfo.EffectiveDt_elem.$TypeInstance.toDate()
     return claimContact
  }
  
  //returns the claim role for the contact
  private function getRole(roleName:String) : ClaimContactRole {
    var claimRole = new ClaimContactRole()
    claimRole.Role = config.getContactRoleMap().get(roleName)
    return claimRole
  }
  
  //get a claim party contact
  private function getContact(partyInfo:GeneralPartyInfo, claimPartyInfo:ClaimsParty) : Contact {
    var contact:Person
    if(partyInfo.NameInfo.HasElements)
      contact = getPerson(partyInfo.NameInfo[0], claimPartyInfo.PersonInfo)
    else
      contact = getPerson(null, claimPartyInfo.PersonInfo)
    if(claimPartyInfo.ClaimsDriverInfo!=null) {
      if(claimPartyInfo.ClaimsDriverInfo.DriversLicense.HasElements) {
        var dl = claimPartyInfo.ClaimsDriverInfo.DriversLicense.first()
        contact.LicenseNumber = dl.DriversLicenseNumber
        contact.LicenseState = Jurisdiction.get(dl.StateProvCd)
      }
    }
    populateContactInfo(contact, partyInfo)
    return contact
  }
  
  //get a given Principal/Insured contact
  private function getContact2(partyInfo:GeneralPartyInfo, principalInfo:InsuredOrPrincipalInfo) : Contact 
  {
      var nameInfo = partyInfo.NameInfo.HasElements ? partyInfo.NameInfo[0] : null
      
      var contact:Contact
      //get the appropriate contact type
      if(nameInfo==null or nameInfo.PersonName!=null) {
        contact = getPerson(nameInfo, principalInfo.PersonInfo)
      } else if(nameInfo.CommlName!=null) {
        contact = getCompany(nameInfo, principalInfo.BusinessInfo)
      } else {
         return UnknownContact
      }
      populateContactInfo(contact, partyInfo)
      return contact
  }
  
  //populate the addresses and communications
  private function populateContactInfo(contact:Contact, partyInfo:GeneralPartyInfo) {
      //get the contact addresses
      getAddresses(partyInfo).eachWithIndex(\ address, i -> {
        if(i==0)
          contact.PrimaryAddress = address
        else
          contact.addAddress(address)
      })
      //get contact communications info
      populateCommunications(contact, partyInfo.Communications)
  }
  
  //gets phone numbers
  private function populateCommunications(contact:Contact, comm:xsd.acord.Communications) {
    if(comm==null) return;
    comm.PhoneInfo.eachWithIndex(\ phoneInfo, i -> {
      if(i==0) {
        if(phoneInfo.PhoneTypeCd_elem.$Text.equalsIgnoreCase("Cell"))
          contact.PrimaryPhone = PrimaryPhoneType.TC_MOBILE
        else if(matchesCommunicationUse({"Business"}, phoneInfo.CommunicationUseCd))
          contact.PrimaryPhone = PrimaryPhoneType.TC_WORK
        else
          contact.PrimaryPhone = PrimaryPhoneType.TC_HOME        
      }
      //populate phone #s
      if(matchesCommunicationUse({"Home"}, phoneInfo.CommunicationUseCd))
          contact.HomePhone = phoneInfo.PhoneNumber
      else if(matchesCommunicationUse({"Business"}, phoneInfo.CommunicationUseCd))
          contact.WorkPhone = phoneInfo.PhoneNumber
      //populate emails
      comm.EmailInfo.eachWithIndex(\ emailInfo, j -> {
          if(j==0)
            contact.EmailAddress1 = emailInfo.EmailAddr
          else
            contact.EmailAddress2 = emailInfo.EmailAddr
      })
    })
  }
  
  //tests that a given code exists in the communications uses
  private function matchesCommunicationUse(codes:String[], phoneUses:List<xsd.acord.enums.CommunicationUse>) : boolean {
    for(phoneUse in phoneUses) {
      for(code in codes) {
        if(phoneUse.StringValue.equalsIgnoreCase(code))
          return true
      }
    }
    return false
  }
  
  //validates the NameInfo list
  private function validate(partyInfo:GeneralPartyInfo) : boolean {
    if(partyInfo.NameInfo.Count==0) {
      logger.warn("Missing contact name information <NameInfo>: using 'Unknown'")
      return true
    } else if(partyInfo.NameInfo.Count>1) {
      logger.warn("More than one contact name information <NameInfo>: only processing the first")
    }
    return true
  }
  
  //gets the list of all addresses under GeneralPartyInfo
  private function getAddresses(partyInfo : GeneralPartyInfo) : List<Address> {
    var mapper = new AcordAddressMapper(config)
    var addresses = new ArrayList<Address>()
    partyInfo.Addr.each(\ addr -> {
      addresses.add(mapper.getAddress(addr))
    })
    return addresses
  }
    
  //creates an unknown Person contact

  private property get UnknownContact() : Person {
    var unknownPerson = new Person()
    unknownPerson.LastName = "Unknown"
    return unknownPerson
  }
  
  //gets the Person contact
  private function getPerson(nameInfo:NameInfo, personInfo:PersonInfo) : Person {
      var person:Person
      if(nameInfo==null) {
        person = UnknownContact
      } else {
        person = new Person()
        var personNameInfo = nameInfo.PersonName
        person.FirstName = personNameInfo.GivenName
        person.LastName = personNameInfo.Surname!=null ? personNameInfo.Surname : "Unknown"
      }
      if(personInfo!=null) {
        person.DateOfBirth = personInfo.BirthDt_elem.$TypeInstance.toDate()
        person.Gender = GenderType.get(personInfo.GenderCd_elem.$Text)
        person.MaritalStatus = config.getMaritalStatusTypeMap().get(personInfo.MaritalStatusCd_elem.$Text)
        person.Occupation = personInfo.OccupationDesc
      }
      return person
  }
  
  //get the Company contact
  private function getCompany(nameInfo:NameInfo, businessInfo:BusinessInfo) : Company {
      var company = new Company()
      company.Name = nameInfo.CommlName.CommercialName
      if(businessInfo!=null) {
        company.NCCIIDOfficialID = businessInfo.NCCIIDNumber
      }
      return company
  }

  private function getLicenseState(driversLicense: xsd.acord.DriversLicense) : Jurisdiction {
      var country = driversLicense.CountryCd!=null ? Country.get(driversLicense.CountryCd) : Country.TC_US
      return AddressJurisdictionHandler.getJurisdiction(new AddressFillableExtensionImpl() {
          :Country = country, :State = typekey.State.get(driversLicense.StateProvCd)
      })
  }
}
