package gw.acc.iplm.services.claim.contacts.builder

uses gw.acc.iplm.services.claim.contacts.ContactDetailsDTO
uses org.apache.commons.lang3.StringUtils

/**
 * This class create Broker Contact (Party)
 */
class BrokerContactBuilder extends ContactBuilder {

  private final var SPACE = " "

  override function createContacts() : List<ClaimContact> {
    var newClaimContacts = new ArrayList<ClaimContact>()
    for(contactDetail in _contactDetails) {
      var id = contactDetail.Id
      var newClaimContact = getClaimContactFromCurrentContacts(_contactRole, id)

      if (newClaimContact == null) {
        var newContact = new Company(_newClaim)
        newClaimContact = new ClaimContact(_newClaim)

        newClaimContact.Contact = newContact
        newClaimContact.Contact.LMContactID_Ext = id
      }
      var primaryContact = new Person(_newClaim)
      primaryContact = gw.transaction.Transaction.Current.add(primaryContact)
      fillPrimaryContact(primaryContact, contactDetail)

      newClaimContact = gw.transaction.Transaction.Current.add(newClaimContact)
      newClaimContact.Contact.PrimaryContact = primaryContact

      //A primary contact
      newClaimContact.Contact.Name = contactDetail.Name
      newClaimContact.Contact.VendorNumber = id
      newClaimContact.Contact.PrimaryPhone = newClaimContact.Contact.PrimaryContact.PrimaryPhone
      newClaimContact.Contact.WorkPhone = newClaimContact.Contact.PrimaryContact.WorkPhone

      newClaimContacts.add(newClaimContact)
    }
    return newClaimContacts
  }

  /**
   * Sets Primary contact details.
   * For firstName and lastName a special algorithm has been used here.
   * It checks for a space starting from the end and coming back. If there is a space in the ContactName,
   * it sets lastName from that space on and firstName with the data before the space.
   *
   * @param primaryContact Primary contact {@link Person}
   * @param contactDetail Contact detail
   */
  private function fillPrimaryContact(primaryContact: Person, contactDetail: ContactDetailsDTO) {
    var lastIndex = contactDetail.ContactName?.trim()?.lastIndexOf(SPACE)
    if(StringUtils.isNotBlank(contactDetail.ContactName) and lastIndex > -1) {
      primaryContact.FirstName = contactDetail.ContactName.substring(0, lastIndex)
      primaryContact.LastName = contactDetail.ContactName.substring(lastIndex + 1)
    } else {
      primaryContact.FirstName = contactDetail.ContactName
    }
    primaryContact.PrimaryPhone = PrimaryPhoneType.TC_WORK
    primaryContact.WorkPhone = contactDetail.ContactPhone

  }
}