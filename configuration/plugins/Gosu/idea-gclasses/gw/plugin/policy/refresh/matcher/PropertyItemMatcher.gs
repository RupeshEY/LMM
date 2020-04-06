package gw.plugin.policy.refresh.matcher


/**
 * Entity matcher for PropertyItems.
 */
 @Export
class PropertyItemMatcher extends InitializablePolicyGraphMatcherBase<PropertyItem>
{  
  /**
   * Matches on associated PolicyLocation and the Description of the item.
   */
  override function doEntitiesMatch(pi1:PropertyItem, pi2:PropertyItem) : boolean {
    if (areBothNotNull(pi1.PolicySystemId, pi2.PolicySystemId))
      return pi1.PolicySystemId == pi2.PolicySystemId

    return doRelatedEntitiesMatch(pi1.Property, pi2.Property) and
      areBothNotNullAndEqual(pi1.Description, pi2.Description)
  }
}
