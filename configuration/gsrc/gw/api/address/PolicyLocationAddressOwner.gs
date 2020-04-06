package gw.api.address

/**
 * A CCAddressOwner for Policy Locations
 */
@Export
class PolicyLocationAddressOwner extends PolicyRelatedAddressOwner {
  var policyLocation:PolicyLocation

  construct(pLocation:PolicyLocation) {
    super(getAddressProperty(entity.PolicyLocation, "Address"), pLocation.Policy)
    policyLocation = pLocation
  }

  /**
   * The owner is the PolicyLocation.
   */
  override property get Owner() : KeyableBean {
    return policyLocation
  }

  override property get InputSetMode() : Country {
    return policyLocation==null ? DefaultCountry : super.InputSetMode
  }
}
