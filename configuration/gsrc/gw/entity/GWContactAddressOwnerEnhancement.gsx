package gw.entity
uses gw.api.address.ContactAddressOwner
uses gw.api.address.CCAddressOwner

@Export
enhancement GWContactAddressOwnerEnhancement : Contact
{
  property get AddressOwner() : CCAddressOwner { 
    return new ContactAddressOwner(this)
  }
}