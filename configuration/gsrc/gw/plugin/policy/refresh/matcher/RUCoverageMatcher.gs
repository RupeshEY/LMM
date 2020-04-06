package gw.plugin.policy.refresh.matcher


/**
 * Entity matcher for a risk unit coverage.
 */
@Export
class RUCoverageMatcher extends InitializablePolicyGraphMatcherBase<RUCoverage> {
  
  /**
   * Matches on type and related risk unit
   */
  override function doEntitiesMatch(ruCov1:RUCoverage, ruCov2:RUCoverage) : boolean {
    if (areBothNotNull(ruCov1.PolicySystemId, ruCov2.PolicySystemId))
      return ruCov1.PolicySystemId == ruCov2.PolicySystemId

    return ruCov1.Subtype.equals(ruCov2.Subtype) and ruCov1.Type==ruCov2.Type
      and doRelatedEntitiesMatch(ruCov1.RiskUnit, ruCov2.RiskUnit)
  }
}
