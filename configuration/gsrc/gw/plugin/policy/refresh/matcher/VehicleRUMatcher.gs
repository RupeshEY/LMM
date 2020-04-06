package gw.plugin.policy.refresh.matcher


/**
 * Entity matcher for a VehicleRU.
 */
@Export
class VehicleRUMatcher extends InitializablePolicyGraphMatcherBase<VehicleRU>
{  
  var ruMatcher = new RiskUnitMatcher()
  
  /**
   * Matches on RiskUnit criteria as well as related vehicle.
   */
  override function doEntitiesMatch(vehicleRU1 : VehicleRU, vehicleRU2 : VehicleRU) : boolean {
    if(areBothNotNull(vehicleRU1.PolicySystemId, vehicleRU2.PolicySystemId)) {
      return vehicleRU1.PolicySystemId==vehicleRU2.PolicySystemId
    }
    if(not ruMatcher.doUniqueFieldsMatch(vehicleRU1, vehicleRU2)) {
      return false
    }
    return areBothNull(vehicleRU1.Vehicle, vehicleRU2.Vehicle) or 
                (areBothNotNull(vehicleRU1.Vehicle, vehicleRU2.Vehicle) and doRelatedEntitiesMatch(vehicleRU1.Vehicle, vehicleRU2.Vehicle))
  }

}
