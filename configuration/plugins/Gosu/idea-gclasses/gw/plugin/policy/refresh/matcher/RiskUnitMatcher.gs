package gw.plugin.policy.refresh.matcher


/**
 * EntityMatcher for RiskUnits. 
 */
@Export
class RiskUnitMatcher extends PolicyGraphMatcherBase<RiskUnit>{
  /**
   * Matches on PolicySystemId or unique fields.
   */
  override function doEntitiesMatch(sourceRU : RiskUnit, compareRU : RiskUnit) : boolean {
    if(areBothNotNull(sourceRU.PolicySystemId,compareRU.PolicySystemId)) {
      return sourceRU.PolicySystemId==compareRU.PolicySystemId
    }
    //or must match on unique fields
    return doUniqueFieldsMatch(sourceRU, compareRU)
  }
  
  /**
   * Do fields other than PolicySystemId match?
   */
  protected function doUniqueFieldsMatch(sourceRU : RiskUnit, compareRU : RiskUnit) : boolean {
    //or must match on unique fields
    return sourceRU.Subtype==compareRU.Subtype 
//      and sourceRU.RUNumber==compareRU.RUNumber
      and areBothNullOrEqual(sourceRU.ClassCode, compareRU.ClassCode)
  }
}
