package gw.api.address

uses java.util.Set
uses java.util.Collections
uses gw.api.locale.DisplayKey

@Export
class CheckAddressOwner extends ClaimRelatedAddressOwner implements SimpleAddressOwner {

  private var _check : Check

  construct(check : Check) {
    super(getAddressProperty(entity.Check,"MailingAddress"), check.Claim)
    _check = check
  }

  override property get Owner() : KeyableBean {
    return _check
  }

  override property get NonEditableAddresses() : Set<Address> {
    return Collections.emptySet<Address>()
  }

  override property get RequiredFields() : Set<AddressOwnerFieldId> {
    return {CCAddressOwnerFieldId.CITY, CCAddressOwnerFieldId.STATE}
  }
  
  override property get Addresses() : Address[] {
    return null
  }
  
  override property get AddressNameLabel() : String {
    return DisplayKey.get('NVV.Financials.Check.MailingAddress')
  }
}
