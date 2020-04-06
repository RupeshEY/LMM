package gw.financials

uses gw.api.util.DateUtil
uses gw.pl.persistence.core.Bundle
uses gw.webservice.contactapi.beanmodel.XmlBackedInstance
uses gw.xml.convert.XmlValueConverter

/**
 * Utility class for updating future checks.
 */
@Export
class CheckUpdater {
  
  var _bundle:Bundle
  
  construct(bundle:Bundle) {
    _bundle = bundle
  }

  /**
   * Updates all future checks with the given contact as payee.
   *
   * If a second argument is provided, it should be the xml representation of the contact's address prior to any update.
   * That address is used to compare with the check's exsting mailing address, and if they are equivalent, the check's
   * mailing address is updated to match the contact's primary address.
   *
   * If no second argument is provided, the check's existing mailing address is compared to the contact's original primary address
   * (each field from the former is compared with the original value of the corresponding field on the latter).
   * If they are equivalent, the check's mailing address is updated to match the contact's new primary address.
   */
  function updateMailingAddress(contact : Contact, xml : XmlBackedInstance = null) {
    var subQueryOnCheckTable = gw.api.database.Query.make(Check)
                                                .compare(Check#ScheduledSendDate, NotEquals, null)
                                                .compare(Check#ScheduledSendDate, GreaterThanOrEquals, DateUtil.currentDate())
    var checkpayees = gw.api.database.Query.make(CheckPayee)
                              .compare(CheckPayee#PayeeDenorm, Equals, contact)
                              .subselect("Check", CompareIn, subQueryOnCheckTable, "ID").select()

    for (payee in checkpayees) {
      // If the Check for this CheckPayee is already in the current bundle, use that bean (especially since
      // it may contain changes that are not yet in the database). Otherwise, move the Check returned by
      // the find expression (which will be in a read-only bundle) and add it to the current bundle (which
      // should be writable).

      var check = _bundle.loadBean(payee.Check?.ID) as Check
      if (check == null) {
        check = payee.Check
        _bundle.add(check)
      }

      if (check.MailingAddress == null and check.PaymentMethod == PaymentMethod.TC_CHECK) {
        check.MailingAddress = contact.PrimaryAddress.cloneAddress(_bundle)
      } else if (check.ScheduledSendDateInFuture) {
        if (xml == null) {
          if (addressesEquivalent(check.MailingAddress, contact)) {
            check.MailingAddress.syncAddressFields(contact.PrimaryAddress)
          }
        } else {
          if (addressesEquivalent(check.MailingAddress, populateOrigAddress(contact, xml))) {
            check.MailingAddress.syncAddressFields(contact.PrimaryAddress)
          }
        }
      }
    }
  }

  /**
   * Returns true if all the fields on mailingAddress match the original values of the respective fields on the given contact's primary address.
   * If this method returns false, it implies that the check's mailing address was deliberately modified to be different
   * from its payee's primary address, and thus updating the payee's address should not update the check's mailing address.
   * This method should be edited to compare any other desired fields.
   */
  private function addressesEquivalent(mailingAddress : Address, contact : Contact) : boolean {
    var newAddress = contact.PrimaryAddress
    return mailingAddress.AddressLine1 == newAddress.getOriginalValue(Address#AddressLine1) and
        mailingAddress.AddressLine2 == newAddress.getOriginalValue(Address#AddressLine2) and
        mailingAddress.AddressLine3 == newAddress.getOriginalValue(Address#AddressLine3) and
        mailingAddress.City == newAddress.getOriginalValue(Address#City) and
        mailingAddress.State == newAddress.getOriginalValue(Address#State) and
        mailingAddress.PostalCode == newAddress.getOriginalValue(Address#PostalCode)
  }

  /**
   * Returns true if all the fields on mailing address match the respective fields on original address.
   * If this method returns false, it implies that the check's mailing address was deliberately modified to be different
   * from its payee's primary address, and thus updating the payee's address should not update the check's mailing address.
   * This method should be edited to compare any other desired fields.
   */
  private function addressesEquivalent(mailingAddress : Address, originalAddress : Address) : boolean {
    return mailingAddress.AddressLine1 == originalAddress.AddressLine1 and
        mailingAddress.AddressLine2 == originalAddress.AddressLine2 and
        mailingAddress.AddressLine3 == originalAddress.AddressLine3 and
        mailingAddress.City == originalAddress.City and
        mailingAddress.State == originalAddress.State and
        mailingAddress.PostalCode == originalAddress.PostalCode
  }

  /**
   * Constructs a temporary address that is a copy of the given contact's primary address.
   * Fields specified in the given xml overwrite the respective fields in the constructed address.
   */
  private function populateOrigAddress(contact : Contact, xml : XmlBackedInstance) : Address {
    var address = contact.PrimaryAddress.copy() as Address
    contact.Bundle.delete(address) //don't persist
    var converter = new XmlValueConverter()
    xml.Field.each(\ field -> {
      if(Address.Type.TypeInfo.getProperty(field.Name)!=null) {
        converter.populateField(address, field.Name, field.OrigValue)
      }
    })
    return address
  }
}
