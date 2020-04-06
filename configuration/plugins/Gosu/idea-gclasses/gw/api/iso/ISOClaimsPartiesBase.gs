package gw.api.iso
uses xsd.iso.req.ClaimsParty
uses xsd.iso.req.anonymous.elements.Communications_PhoneInfo
uses xsd.iso.req.NameInfo
uses xsd.iso.req.Communications
uses xsd.iso.req.GeneralPartyInfo
uses xsd.iso.req.DriversLicense
uses xsd.iso.req.TaxIdentity
uses java.util.HashMap
uses java.lang.IllegalArgumentException
uses xsd.iso.req.anonymous.elements.ClaimInvestigationAddRq_ClaimsPartyRelationship
uses xsd.iso.req.anonymous.elements.ClaimsPartyInfo_ClaimsPartyRoleCd

/**
 * Manages the ClaimsParty aggregates associated with an ISO ClaimSearch
 * request. A ClaimsParty represents a contact (person or company) associated
 * with a claim. Each ClaimsParty must only appear once in the request and
 * each party has a single role specifying its purpose (for example claimant,
 * insured or witness). See ISOClaimsPartyRole for the list of possible roles.
 * <p>
 * ClaimsParties fall into two broad categories, depending on their role:
 * individual and service provider. ClaimsParties with an individual role,
 * such as claimant, insured or witness can be included directly in the
 * request. ClaimsParties with a service provider role have to be attached
 * to another ClaimsParty via a ClaimsPartyRelationship aggregate. This
 * aggregate specifies the ids and roles of the two ClaimsParties that it
 * links together. So, for example, we might have a service provider
 * ClaimsParty with role TW (Towing Company) linked via a
 * ClaimsPartyRelationship to a ClaimsParty with role CL (claimant).
 * <p>
 * Because each ClaimsParty can only appear once, and can only have one role,
 * it is possible to have a conflict - for example somebody might be both
 * a witness and a claimant. In that case the "most important" role wins.
 * In general CI (both claimant and insured) is the most important role,
 * followed by the claimant roles (CL etc.) and insured roles (IN etc.),
 * then the individual roles and finally the service provider roles. See
 * ISOClaimsPartyRole for more details. This class, ISOClaimsParties, manages
 * such conflicts automatically. So, for example, if a contact is already
 * added as a low priority role, such as MD (Docter - a service provider role)
 * and is then added again as CL (Claimant - high priority) then this class
 * will update the existing role from MD to CL (cleaning up any 
 * ClaimsPartyRelationship aggregates if necessary). Conversely, if a contact
 * is already present with a high priority role then adding it again with
 * a low priority role will have no effect.
 * <p>
 * Another complication is that there are some roles that have a dual meaning,
 * for example CD (Claimant Driver). These roles are all some variant of
 * claimant or insured. ISOClaimsParties handles these by providing methods
 * of the form setDriver, setPassenger etc. These take a contact and they
 * check if the contact is already added with the role CL (Claimant) or
 * IN (Insured). If so, and if there is a variant of that role that is
 * appropriate (e.g. CD if the current role is CL and the call is setDriver)
 * then the role is updated. Otherwise the call has no effect.
 */
@Export
class ISOClaimsPartiesBase {
  
  protected var _isoRequest : ISOClaimSearchRequestBase
  protected var _partiesByContact : HashMap<Contact,ClaimsParty> = new HashMap<Contact,ClaimsParty>()
   
  /**
   * Create new ISOClaimsParties object to manage the ClaimsParties
   * for the given claim search request.
   */
  construct(isoRequest : ISOClaimSearchRequestBase) {
    _isoRequest = isoRequest
  }
  
  /**
   * Add a ClaimsParty to the search request with the given individual role. If
   * there is no existing ClaimsParty for the given contact then a new one is
   * created and the ClaimsPartyInfo ClaimsPartyRoleCd is set to the role.
   * <p>
   * If there is already a ClaimsParty for this contact then check its current
   * role and use the new role if it is more important than the current one
   * (see ISOClaimsPartyRole for more details on role importance). If the new
   * role is not more important than the current one, do nothing. This method
   * will automatically handle any ClaimsPartyRelationship changes, for example
   * if it results in the upgrade of a service provider role to an individual
   * role then it will automatically remove the ClaimsPartyRelationship used
   * for the old service provider role.
   * <p>
   * This method returns the ClaimsParty aggregate created or reused for this
   * contact. It may return null if the contact does not have the information
   * required to fill out the aggregate. Person contacts must have a first and
   * last name, company contacts must have a name. In addition all contacts
   * must have an address with at least city and state. Contacts with
   * individual roles also require the Addr1 field.
   */
  @Throws(IllegalArgumentException, "If the given role is not an individual role")
  public function addIndividualParty(contact : Contact, role : ISOClaimsPartyRole) : ClaimsParty {
    if (!role.IsIndividual) {
      throw new IllegalArgumentException("addIndividualParty called with '" + role + "' which is not an individual role")
    }
    return addParty(null, contact, role)
  }
  
  /**
   * Add a ClaimsParty to the search request with the given individual role. If
   * there is no existing ClaimsParty for the given contact then a new one is
   * created and the ClaimsPartyInfo ClaimsPartyRoleCd is set to the role.
   * If the given role is a service provider role it will be linked to the
   * given owner ClaimsParty via a ClaimsPartyRelationship aggregate.
   * <p>
   * This call can be used with either an individual or a service provider
   * role. The owner argument can be null if, and only if, the role is an
   * individual role. It is required to be non null for service provider roles.
   * <p>
   * If there is already a ClaimsParty for this contact then check its current
   * role and use the new role if it is more important than the current one
   * (see ISOClaimsPartyRole for more details on role importance). If the new
   * role is not more important than the current one, do nothing. This method
   * will automatically handle any ClaimsPartyRelationship changes, for example
   * if it results in the upgrade of a service provider role to an individual
   * role then it will automatically remove the ClaimsPartyRelationship used
   * for the old service provider role.
   * <p>
   * This method returns the ClaimsParty aggregate created or reused for this
   * contact. It may return null if the contact does not have the information
   * required to fill out the aggregate. Person contacts must have a first and
   * last name, company contacts must have a name. In addition all contacts
   * must have an address with at least city and state. Contacts with
   * individual roles also require the Addr1 field.
   */
  @Throws(IllegalArgumentException, "If owner is null and the given role is not an individual role")
  public function addParty(owner : ClaimsParty, contact : Contact, role : ISOClaimsPartyRole) : ClaimsParty {
    if (owner == null && !role.IsIndividual) {
      throw new IllegalArgumentException("addParty called with non individual role '" + role + "' but a null owner ClaimsParty; an owner is required for non individual roles")
    }
    var claimsParty = _partiesByContact[contact]
    if (claimsParty == null) {
      if (isContactReadyForISO(contact, role)) {
        claimsParty = addNewClaimsParty(owner, contact, role)
        _partiesByContact[contact] = claimsParty
      }
    } else {
      updateExistingPartyRole(owner, claimsParty, role)
    }
    return claimsParty
  }
  
  /**
   * Return the existing claim party for the given contact, or null if there is
   * no existing party
   */
  public function getExistingParty(contact : Contact) : ClaimsParty {
    return _partiesByContact[contact]
  }
  
  /**
   * Check if the given person has an existing ClaimsParty in this request with
   * either the CL or the IN role. If so update the role to be CD or ID, as
   * appropriate. Also adds drivers license information to the ClaimsParty, if
   * available.
   * <p>
   * Does nothing if there is no existing ClaimsParty for the given person
   */
  public function setDriver(driver : Person) {
    var claimsParty = makeClaimantOrInsuredMoreSpecific(driver, CD, ID)
    if (claimsParty != null && driver.LicenseNumber.HasContent && claimsParty.ClaimsDriverInfo == null) {
      claimsParty.ClaimsDriverInfo.DriversLicense = {createDriversLicense(driver)}
    }
  }
  
  /**
   * Check if the given person has an existing ClaimsParty in this request with
   * either the CL or the IN role. If so update the role to be CP or IP, as
   * appropriate. 
   * <p>
   * Does nothing if there is no existing ClaimsParty for the given person
   */
  public function setPassenger(passenger : Person) {
    makeClaimantOrInsuredMoreSpecific(passenger, CP, IP)
  }
  
  /**
   * Check if the given person has an existing ClaimsParty in this request with
   * CL role. If so updates the role to be CE.
   * <p>
   * Does nothing if there is no existing ClaimsParty for the given person
   */
  public function setPedestrian(pedestrian : Person) {
    makeClaimantOrInsuredMoreSpecific(pedestrian, CE, null)
  }
  
  /**
   * Check if the given person has an existing ClaimsParty in this request with
   * IN role. If so updates the role to be IE.
   * <p>
   * Does nothing if there is no existing ClaimsParty for the given person
   */
  public function setEmployee(employee : Person) {
    makeClaimantOrInsuredMoreSpecific(employee, null, IE)
  }
  
  /**
   * Does the given contact have all the fields required for it to be
   * reported to ISO with the given role?
   */
  protected function isContactReadyForISO(contact : Contact, role : ISOClaimsPartyRole) : boolean {
    var readyForISO = true
    if(contact typeis Person){
      readyForISO = contact.FirstName.length > 0 && contact.LastName.length > 0
    } else if (contact typeis Company) {
      readyForISO = contact.Name.length > 0
    }
    return readyForISO && isAddressReadyForISO(contact.PrimaryAddress, role)
  }
  
  /**
   * Does the given address have all the fields required for it to be
   * reported to ISO on a contact with the given role?
   */
  protected function isAddressReadyForISO(address : Address, role : ISOClaimsPartyRole) : boolean {
    return (address.AddressLine1.HasContent || !role.IsIndividual) &&
           address.City.HasContent &&
           address.State != null
  }
  
  /**
   * Adds a new ClaimsParty aggregate for the given contact in the given role.
   * The owner is used if the role is one of the ISO roles that requires that
   * the ClaimsParty be linked to another party via a ClaimsPartyRelationship
   * aggregate. So owner should always be non null if this method is called
   * with a role that requires such a link. You can tell whether a role
   * requires a ClaimsPartyRelationship by its IsIndividual property. If
   * role.IsIndividual is true it does <b>not</b> require a
   * ClaimsPartyRelationship, if role.IsIndividual is false then it does
   * require one.
   */
  protected function addNewClaimsParty(owner : ClaimsParty,
                                       contact : Contact,
                                       role : ISOClaimsPartyRole) : ClaimsParty {
    var claimsParty = new xsd.iso.req.ClaimsParty()
    claimsParty.Id = _isoRequest.getNextId()
    claimsParty.GeneralPartyInfo = createFullGeneralPartyInfo(contact)
    if (contact typeis Person) {
      populatePersonInfo(claimsParty, contact)
    }
    setRole(owner, claimsParty, role)
    _isoRequest.AddRequest.ClaimsParty.add(claimsParty)
    return claimsParty
  }
  
  /**
   * Creates a GeneralPartyInfo aggregate for the given contact, including
   * any tax ids, home/cell phone and the contact's address
   */
  protected function createFullGeneralPartyInfo(contact : Contact) : GeneralPartyInfo{
    return createGeneralPartyInfo(contact, true)
  }
   
  /**
   * Creates a GeneralPartyInfo aggregate for the given contact, omitting
   * any tax ids, home/cell phone and the contact's address
   */
  protected function createLimitedGeneralPartyInfo(contact : Contact) : GeneralPartyInfo {
    return createGeneralPartyInfo(contact, false)
  }

  /**
   * See if the given contact already has a ClaimsParty aggregate and, if so,
   * try to make the CL or INS role more specific e.g. by changing CL (claimant)
   * to CD (claimant driver). Does nothing if there is no existing ClaimsParty
   * or if the existing role is not simply CL or INS (note that this means it
   * won't update a role if it has already been made more specific).
   * <p>
   * Either of specificClaimantRole and specificInsuredRole may be null, in
   * which case they are ignored. If non null they must be appropriate values,
   * that is specificClaimantRole must be one of the claimant roles, such as
   * CD, CP, CE etc.
   */
  protected function makeClaimantOrInsuredMoreSpecific(
          contact : Contact,
          specificClaimantRole : ISOClaimsPartyRole,
          specificInsuredRole : ISOClaimsPartyRole) : ClaimsParty {
    var claimsParty = _partiesByContact[contact]
    if (claimsParty != null) {
      var currentRole = getRole(claimsParty)
      if (currentRole == CL && specificClaimantRole != null) {
        updateExistingPartyRole(null, claimsParty, specificClaimantRole)
      } else if (currentRole == INS && specificInsuredRole != null) {
        updateExistingPartyRole(null, claimsParty, specificInsuredRole)
      }
    }
    return claimsParty
  }

  /**
   * Tries to update the existing role on the given party with a more specific
   * one. Follows these rules, in order:
   * <ul>
   * <li>If the existing role is CI, leave it alone
   * <li>If the existing role is a claimant role and the new one is an insured
   *     role, or vice versa, then set the role to CI (claimant/insured)
   * <li>If the existing role is CL or INS and the new role is a more specific
   *     version of that role (such as CD or ID) then update the role to the
   *     more specific version
   * <li>Otherwise if the existing role is a claimant or insured role, leave
   *     it alone
   * <li>If the existing role is not a claimant or insured role but the new
   *     role is then update the role
   * <li>If the existing role requires a linking ClaimsPartyRelationship) but
   *     the new role doesn't then update the role (and remove the linking
   *     relationship) 
   * <li>If none of the above apply, leave the existing role in place
   * </ul>
   * Note that in the above description "a claimant role" and "an insured role"
   * are more general than just CL or INS. "A claimant role" means any claimant
   * role: CL, CD etc. Likewise for "an insured role".
   */
  protected function updateExistingPartyRole(owner : ClaimsParty, claimsParty : ClaimsParty, role : ISOClaimsPartyRole) {
    var existingRole = getRole(claimsParty)
    if (role != existingRole) {
      if (existingRole.IsClaimant || existingRole.IsInsured) {
        if (existingRole.IsClaimant && existingRole.IsInsured) {
          // Leave alone; already marked as CI (both claimant and insured)
        } else if ((existingRole.IsClaimant && role.IsInsured) || (existingRole.IsInsured && role.IsClaimant)) {
          // Party is both claimant and insured
          setRole(owner, claimsParty, CI)
        } else if ((existingRole == CL && role.IsClaimant) || (existingRole == INS && role.IsInsured)) {
          // Party is a specific type of claimant/insured
          setRole(owner, claimsParty, role)
        } else {
          // Leave alone; new role is no more specific than the old one, or it's not a claimant/insured role at all
        }
      } else if (role.IsClaimant || role.IsInsured) {
        setRole(owner, claimsParty, role)
      } else if (role.IsIndividual && !existingRole.IsIndividual) {
        setRole(owner, claimsParty, role)
      } else {
        // Leave alone, new role is no more specific than the old one
      }
    }
  }
 
  /**
   * Sets the role on the given claim party. Does nothing if the party already
   * has the given role. Otherwise updates the role. If the new or the existing
   * role requires a ClaimsPartyRelationship then this relationship is added
   * or removed automatically. If the new role requires a ClaimsPartyRelationship
   * (that is if role.IsIndividual is false) then owner must be non null, as it
   * will be used as the other end of the ClaimsPartyRelationship.
   */
  protected function setRole(owner : ClaimsParty, claimsParty : ClaimsParty, role : ISOClaimsPartyRole) {
    if (role != getRole(claimsParty)) {
      claimsParty.ClaimsPartyInfo.ClaimsPartyRoleCd_elem = {createClaimsPartyRoleCd(role)}
      removeRelationships(claimsParty)
      if (!role.IsIndividual) {
        addRelationship(owner, claimsParty)
      }
    }
  }
  
  /**
   * Clean up any existing ClaimsPartyRelationship aggregates that refer to
   * the given ClaimsParty
   */
  protected function removeRelationships(claimsParty : ClaimsParty) {
    _isoRequest.AddRequest.ClaimsPartyRelationship.removeWhere(\ r -> r.ClaimsParty2Ref == claimsParty)
  }
  
  /**
   * Adds a new ClaimsPartyRelationship aggregate linking party2 to party1
   */
  protected function addRelationship(party1 : ClaimsParty, party2 : ClaimsParty) {
    var relationship = new ClaimInvestigationAddRq_ClaimsPartyRelationship()
    relationship.ClaimsParty1Ref = party1
    relationship.ClaimsPartyRole1Cd = getRole(party1).InternalCode
    relationship.ClaimsParty2Ref = party2
    relationship.ClaimsPartyRole2Cd = getRole(party2).InternalCode
    _isoRequest.AddRequest.ClaimsPartyRelationship.add(relationship)
  }
  
  /**
   * Creates a new StringCd aggregate for the given role, adding in a
   * code list reference to ClaimsPartyRoleCd if it is not an ACORD standard
   * role
   */
  protected function createClaimsPartyRoleCd(role : ISOClaimsPartyRole) : ClaimsPartyInfo_ClaimsPartyRoleCd {
    var roleCd = new ClaimsPartyInfo_ClaimsPartyRoleCd()
    if (!role.IsAcordStandard) {
      roleCd.Codelistref = _isoRequest.findOrCreateCodeList(ISOCodeList.CLAIMS_PARTY_ROLE_CODE.Id)
    }
    roleCd.Value = role.InternalCode
    return roleCd
  }

  /**
   * Creates a DriversLicense aggregate for the given person
   */
  protected function createDriversLicense(person : Person) : DriversLicense {
    var driversLicense = new DriversLicense()
    driversLicense.DriversLicenseNumber = _isoRequest.truncateString(person.LicenseNumber, 20)
    if (person.LicenseState != null) {
      driversLicense.StateProvCd = person.LicenseState.Code
    }
    return driversLicense
  }
  
  /**
   * Creates a GeneralPartyInfo aggregate for the given contact. If full is
   * true, includes the tax id, home/cell phone and address of the contact.
   */
  protected function createGeneralPartyInfo(contact : Contact, full : boolean) : GeneralPartyInfo {
    var generalPartyInfo = new xsd.iso.req.GeneralPartyInfo()
    generalPartyInfo.NameInfo.add( createNameInfo(contact, full) )
    var address = contact.PrimaryAddress
    if (full && address != null) {
      generalPartyInfo.Addr.add(_isoRequest.createAddr(address))
    }
    if (contact.WorkPhone != null ||
        contact.HomePhone != null ||
        (contact typeis Person && contact.CellPhone != null)) {
      generalPartyInfo.Communications = createCommunications(contact, full)      
    }
    return generalPartyInfo
  }
  
  /**
   * Create a Communications aggregate for the given contact (sub aggregate of
   * GeneralPartyInfo). If full is true includes home and cell phone number
   * (if available)
   */
  protected function createCommunications(contact :  Contact, full : boolean) : Communications {
    var communications = new xsd.iso.req.Communications()
    var workPhone = _isoRequest.Translate.formatPhoneNumber(contact.WorkPhone)
    if (workPhone != null) {
      communications.PhoneInfo.add(createPhoneInfo(ISOConstants.PHONE, ISOConstants.WORK_PHONE, workPhone))
    }
    if (full) {
      var homePhone = _isoRequest.Translate.formatPhoneNumber(contact.HomePhone)
      if (homePhone != null) {
        communications.PhoneInfo.add(createPhoneInfo(ISOConstants.PHONE, ISOConstants.HOME_PHONE, homePhone))
      }
      if (contact typeis Person) {
        var cellPhone = _isoRequest.Translate.formatPhoneNumber(contact.CellPhone)
        if (cellPhone != null) {
          communications.PhoneInfo.add(createPhoneInfo(ISOConstants.CELL_PHONE, ISOConstants.ALTERNATE_PHONE, cellPhone))
        }
      } 
    }
    return communications
  }
  
  /**
   * Create a Communications.PhoneInfo aggregate (sub aggregate of
   * Communications). Phone type is nearly always just "Phone"; communication
   * type is one of "Work", "Home" or "Cell".
   */
  protected function createPhoneInfo(phoneType : String, communicationType : String, number : String) : 
      Communications_PhoneInfo{
    var phoneInfo = new Communications_PhoneInfo()
    phoneInfo.PhoneTypeCd = phoneType
    phoneInfo.CommunicationUseCd.add(communicationType)
    phoneInfo.PhoneNumber = number
    return phoneInfo
  }

  /**
   * Creates a NameInfo aggregate (sub aggregate of GeneralPartyInfo) for the
   * given contact. If full is true includes contact tax ids.
   */
  protected function createNameInfo(contact : Contact, full : boolean) : NameInfo {
    var nameInfo = new xsd.iso.req.NameInfo()
    if (contact typeis Person) {
      nameInfo.PersonName.Surname = _isoRequest.truncateString(contact.LastName, 30) // 30
      nameInfo.PersonName.GivenName = _isoRequest.truncateString(contact.FirstName, 20) // 20
      var middleName = new String()
      middleName = _isoRequest.truncateString(contact.MiddleName, 20)
      nameInfo.PersonName.OtherGivenName.add(middleName)
    } else {
      var company = contact as Company
      nameInfo.CommlName.CommercialName = _isoRequest.truncateString(company.Name, 55)
    }
    if(full && contact.TaxID != null) {
      nameInfo.TaxIdentity.add( createTaxIdentity(contact) )
    }
    return nameInfo
  }
  
  /**
   * Creates a TaxIdentity aggregate (sub aggregate of NameInfo) for the
   * given contact. If full is true includes contact tax ids.
   */
  protected function createTaxIdentity(contact : Contact) : TaxIdentity {
    var taxId = contact.TaxID.replaceAll("-", "")
    var taxIdentity = new xsd.iso.req.TaxIdentity()
    taxIdentity.TaxIdTypeCd = (contact typeis Person) ? ISOConstants.TAX_IDENTITY_SSN : ISOConstants.TAX_IDENTITY_TIN
    taxIdentity.TaxId = taxId
    return taxIdentity
  }
  
  /**
   * Populates the PersonInfo sub aggregate of the given ClaimsParty with
   * information from the given person.
   */
  private function populatePersonInfo(claimParty : ClaimsParty, person : Person) {
    if (person.Gender != null) {
      claimParty.PersonInfo.GenderCd = _isoRequest.Translate.optionallyTranslateTypeCode(person.Gender)
    }
    if (person.DateOfBirth != null) {
      claimParty.PersonInfo.BirthDt = _isoRequest.Translate.formatClaimDate(person.DateOfBirth)
    }
    claimParty.PersonInfo.OccupationDesc = _isoRequest.truncateString(person.Occupation, 50)
  }
  
  /**
   * Get the current role of the given ClaimsParty aggregate
   */
  protected function getRole(claimsParty : ClaimsParty) : ISOClaimsPartyRole {
    return ISOClaimsPartyRole.byCode(claimsParty.ClaimsPartyInfo.ClaimsPartyRoleCd[0])
  }
}
