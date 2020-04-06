package gw.plugin.policy.refresh.matcher


/**
 * Entity matcher for VehicleOwners.
 */
@Export
class VehicleOwnerMatcher extends InitializablePolicyGraphMatcherBase<VehicleOwner>
{
  /**
   * Matches on the linked Vehicle and Lienholder.
   */
  override function doEntitiesMatch(vo1 : VehicleOwner, vo2 : VehicleOwner) : boolean {
    return doRelatedEntitiesMatch(vo1.Vehicle, vo2.Vehicle) 
      and doRelatedEntitiesMatch(vo1.Lienholder, vo2.Lienholder)
  }

}
