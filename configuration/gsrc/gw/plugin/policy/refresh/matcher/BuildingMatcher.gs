package gw.plugin.policy.refresh.matcher


/**
 * Entity matcher for buildings.
 */
@Export
class BuildingMatcher extends InitializablePolicyGraphMatcherBase<Building> {

  /**
   * Matches on policy location and building number.
   */
  override function doEntitiesMatch(b1 : Building, b2 : Building) : boolean {
    if (areBothNotNull(b1.PolicySystemId, b2.PolicySystemId))
      return b1.PolicySystemId == b2.PolicySystemId

    return doRelatedEntitiesMatch(b1.PolicyLocation, b2.PolicyLocation)
      and areBothNullOrEqual(b1.BuildingNumber, b2.BuildingNumber)
  }

}
