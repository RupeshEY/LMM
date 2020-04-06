package gw.plugin.policy.refresh.matcher


/**
 * EntityMatcher for policy locations.
 */
@Export
class PolicyLocationMatcher extends InitializablePolicyGraphMatcherBase<PolicyLocation>
{ 
  /**
   * Matches on the policy location address.
   */
  override function doEntitiesMatch(p1:PolicyLocation, p2:PolicyLocation) : boolean {
    if (areBothNotNull(p1.PolicySystemId, p2.PolicySystemId)) {
      return p1.PolicySystemId == p2.PolicySystemId
    }

    var nullAddress = isAtLeastOneNull(p1.Address, p2.Address)
    if (nullAddress) {
      return false
    }

    var addressesOK = doRelatedEntitiesMatch(p1.Address, p2.Address)
    
    return addressesOK
  }
}
