package gw.plugin.policy.refresh.matcher


/**
 * Entity matcher for StatCodes.
 */
@Export
class StatCodeMatcher extends PolicyGraphMatcherBase<StatCode> {
  /**
   * Matches on line number and insurance line.
   */
  override function doEntitiesMatch(sc1:StatCode, sc2:StatCode) : boolean {
    return sc1.LineNumber==sc2.LineNumber and 
      areBothNullOrEqual(sc1.InsuranceLine, sc2.InsuranceLine) and
      areBothNullOrEqual(sc2.InsuranceSubLine, sc2.InsuranceSubLine)
  }
}
