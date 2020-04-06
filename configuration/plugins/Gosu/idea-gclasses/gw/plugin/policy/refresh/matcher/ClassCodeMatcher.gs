package gw.plugin.policy.refresh.matcher


/**
 * Entity matcher for class codes.
 */
@Export
class ClassCodeMatcher  extends PolicyGraphMatcherBase<ClassCode> {
  /**
   * Matches on the code.
   */
  override function doEntitiesMatch(cc1 : ClassCode, cc2 : ClassCode) : boolean {
    return cc1.Code.equals(cc2.Code) and cc1.Description==cc2.Description
  }
}
