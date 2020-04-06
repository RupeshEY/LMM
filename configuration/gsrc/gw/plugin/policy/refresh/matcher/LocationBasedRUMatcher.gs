package gw.plugin.policy.refresh.matcher


/**
 * Entity matcher for Location-based Risk Units.
 */
@Export
class LocationBasedRUMatcher extends InitializablePolicyGraphMatcherBase<LocationBasedRU>
{
  //for matching on RiskUnit fields
  var ruMatcher = new RiskUnitMatcher()
   
  /**
   * Matches based on the the RiskUnit fields, PolicyLocation, and Building (if present)
   */
  override function doEntitiesMatch(locationBasedRU1 : LocationBasedRU, locationBasedRU2 : LocationBasedRU) : boolean {
    if(areBothNotNull(locationBasedRU1.PolicySystemId, locationBasedRU2.PolicySystemId)) {
      return locationBasedRU1.PolicySystemId==locationBasedRU2.PolicySystemId
    }
    return ruMatcher.doUniqueFieldsMatch(locationBasedRU1, locationBasedRU2)
      and doRelatedEntitiesMatch(locationBasedRU1.PolicyLocation, locationBasedRU2.PolicyLocation)
      and (isAtLeastOneNull(locationBasedRU1.Building, locationBasedRU2.Building) or
        doRelatedEntitiesMatch(locationBasedRU1.Building, locationBasedRU2.Building))
  }
}
