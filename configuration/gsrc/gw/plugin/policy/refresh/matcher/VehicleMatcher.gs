package gw.plugin.policy.refresh.matcher

/**
 * Entity matcher for Vehicle.
 */
@Export
class VehicleMatcher extends PolicyGraphMatcherBase<Vehicle> {
  /**
   * Matches on identifying information, or a combination of unique
   * characteristics.
   */
  override function doEntitiesMatch(v1 : Vehicle, v2 : Vehicle) : boolean {
    if (areBothNotNull(v1.PolicySystemId, v2.PolicySystemId))
      return v1.PolicySystemId == v2.PolicySystemId

    if(areBothNotNull(v1.Vin, v2.Vin)) {
      return v1.Vin==v2.Vin
    } else if(areBothNotNull(v1.SerialNumber, v2.SerialNumber)) {
      return v1.SerialNumber==v2.SerialNumber
    } else if(areBothNotNull(v1.LicensePlate, v2.LicensePlate) and areBothNotNull(v1.State, v2.State)) {
      return v1.LicensePlate==v2.LicensePlate and v1.State==v2.State
    }
    return false
  }
}
