package gw.api.address

uses java.util.Collections
uses java.util.Set
uses gw.api.locale.DisplayKey

@Export
class BulkInvoiceAddressOwner extends CCAddressOwnerBase {
  private var _invoice : BulkInvoice

  construct(invoice : BulkInvoice) {
    super(getAddressProperty(entity.BulkInvoice, "MailingAddress"))
    _invoice = invoice
  }

  override property get RequiredFields(): Set<AddressOwnerFieldId> {
    return {CCAddressOwnerFieldId.CITY, CCAddressOwnerFieldId.STATE}
  }

  override property get HiddenFields(): Set<AddressOwnerFieldId> {
    return CCAddressOwnerFieldId.VALIDUNTIL_ADDRESSTYPE_HIDDEN.union(CCAddressOwnerFieldId.NON_ADDRESS_FIELDS).freeze()
  }

  override property get Owner(): KeyableBean {
    return _invoice
  }

  override property get NonEditableAddresses() : Set<Address> {
    return Collections.emptySet<Address>()
  }

  override property get Addresses() : Address[] {
    return null
  }

  override property get AddressNameLabel() : String {
    return DisplayKey.get('Web.Financials.BulkPay.Invoice.MailingAddress')
  }

  property get AddressComplete() : boolean {
    return not RequiredFields.hasMatch( \ field -> Address.getFieldValue(field.Name) == null)
  }
}