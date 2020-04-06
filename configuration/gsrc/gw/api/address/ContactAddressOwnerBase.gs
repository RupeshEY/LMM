package gw.api.address
uses java.util.Set
uses java.util.Collections
uses java.lang.UnsupportedOperationException

/**
 * Base class for address owners that populate the primary address of a contact.
 * In this case we hide the drop down list of addresses (Addresses returns null)
 * and don't have any required fields except for Places which require a postal code.
 */
@Export
abstract class ContactAddressOwnerBase extends CCAddressOwnerBase {

  construct() {
    super(getAddressProperty(entity.Contact, "PrimaryAddress"))
  }

  override property get Addresses() : Address[] {
    return null
  }

  override property get NonEditableAddresses() : Set<Address> {
    return Collections.emptySet<Address>()
  }
  
  override property get RequiredFields() : Set<AddressOwnerFieldId> {
    return AddressFields.getContactRequiredFields(Owner)
  }

  override property get HiddenFields() : Set<AddressOwnerFieldId> {
    return AddressFields.getContactHiddenFields(Owner)
  }
  
  override property get Owner() : Contact {
    // Must be overridden in subclass
    throw new UnsupportedOperationException("Must override ContactAddressOwnerBase.Owner in subclass")
  }
}
