package gw.entity
uses gw.api.address.ClaimAddressOwner
uses gw.api.address.CCAddressOwner

/**
 * Address owner utilities, allowing the claim's loss location to be modified
 * by the generic AddressInputSet PCF file.
 */
@Export
enhancement GWClaimAddressOwnerEnhancement : Claim {

  /** The address owner object required by the AddressInputSet */
  property get AddressOwner() : CCAddressOwner {
    return new ClaimAddressOwner(this)
  }

}
