package gw.entity
uses gw.api.address.ExposureAddressOwner
uses gw.api.address.CCAddressOwner

@Export
enhancement GWExposureAddressOwnerEnhancement : Exposure
{
   property get AddressOwner() : CCAddressOwner { 
    return new ExposureAddressOwner(this)
  }
}
