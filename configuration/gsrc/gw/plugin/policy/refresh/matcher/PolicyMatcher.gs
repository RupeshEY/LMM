package gw.plugin.policy.refresh.matcher


/**
 * EntityMatcher for Policy entities.
 */
@Export
class PolicyMatcher extends PolicyGraphMatcherBase<Policy>  {

  /**
   * Will always return true, because you can select a different policy (i.e., different policy number)
   * that can be compared.
   */
  override function doEntitiesMatch(sourcePolicy : Policy, comparePolicy : Policy) : boolean {
    return true
  }

}
