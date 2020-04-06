package gw.entity
uses gw.api.address.ContactHandleAddressOwner
uses gw.api.contact.ContactHandle
uses gw.api.address.CCAddressOwner

@Export
enhancement GWContactHandleAddressOwnerEnhancement : ContactHandle
{
  property get AddressOwner() : CCAddressOwner { 
    return new ContactHandleAddressOwner(this)
  }
}