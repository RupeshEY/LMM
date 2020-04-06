package gw.acc.iplm.services.claim.contacts.builder

uses gw.acc.iplm.services.claim.contacts.ContactDetailsDTO


/**
 * This abstract class is extended by specific types of concrete contact builder classes
 * It has common functionality which is used by sub classes
 */
abstract class ContactBuilder {

  internal var _newClaim: Claim
  internal var _contactRole: ContactRole
  internal var _contactDetails: List<ContactDetailsDTO>

  /**
   * Creates a list of ClaimContacts for a specified role from the ContactDetails provided
   * and adds them to the Claim provided.
   *
   * @param contactRole
   * @param claim
   * @param contactDetails
   * @return List<ClaimContact>
   */
  public function createNewClaimContacts(contactRole: ContactRole, claim: Claim, final contactDetails: List<ContactDetailsDTO>) : List<ClaimContact> {
    _newClaim = claim
    _contactRole = contactRole
    _contactDetails = contactDetails

    var newClaimContacts = createContacts()

    newClaimContacts.each(\elt -> {
      elt = addRoleToClaimContact(elt)
      elt = addToBundleAndClaim(elt)
    })

    return newClaimContacts
  }

  /**
   * Each contacts (parties) being created differently within Services
   * <p>
   * It is overridden by specific concrete types
   * e.g Claimant, Adjuster, Broker Lead
   *
   * @return List<ClaimContact>
   */
  protected abstract function createContacts() : List<ClaimContact>

  /**
   * Returns the first found ClaimContact on the Claim with a matching
   * Contact.ECFContactID.
   *
   * @param id
   * @return ClaimContact
   */
  protected function getClaimContactFromCurrentContacts(role: ContactRole, id: String): ClaimContact {
    return _newClaim.ClaimContactsForAllRoles.toList().firstWhere(\claimContact -> claimContact.RoleNames.contains(role.DisplayName) and claimContact.Contact.LMContactID_Ext == id)
  }

  protected function addRoleToClaimContact(claimContact: ClaimContact) : ClaimContact {
    if (not claimContact.Roles*.Role.contains(_contactRole)) {
      var ccRole = new ClaimContactRole()
      ccRole.Role = _contactRole
      claimContact.addToRoles(ccRole)
    }

    return claimContact
  }

  protected function addToBundleAndClaim(claimContact : ClaimContact) : ClaimContact {
    claimContact = gw.transaction.Transaction.Current.add(claimContact)

    if (claimContact.New) {
      _newClaim.addToContacts(claimContact)
    }

    return claimContact
  }

}