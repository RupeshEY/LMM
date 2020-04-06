package gw.plugin.policy.refresh.matcher


/**
 * Entity matcher for property owners.
 */
@Export
class PropertyOwnerMatcher extends InitializablePolicyGraphMatcherBase<PropertyOwner>
{ 
  /**
   * Matches on linked Policy location and lienholder.
   */
  override function doEntitiesMatch(po1 : PropertyOwner, po2 : PropertyOwner) : boolean {
    return doRelatedEntitiesMatch(po1.Property, po2.Property) and
      doRelatedEntitiesMatch(po1.Lienholder, po2.Lienholder)
  }
}
