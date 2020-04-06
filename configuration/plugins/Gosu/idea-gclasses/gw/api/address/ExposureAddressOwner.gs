package gw.api.address

/**
 * CCAddressOwner object for the Exposure entity.
 * See AddressOwner and CCAddressOwner for details of what an
 * AddressOwner object does.
 */
@Export
class ExposureAddressOwner extends ClaimRelatedAddressOwner {
  
  private var _exposure : Exposure

  construct(exposure : Exposure) {
    super(getAddressProperty(entity.Exposure, "TempLocation"), exposure.Claim)
    _exposure = exposure
  }

  override property get Owner() : KeyableBean {
    return _exposure
  }
}