package gw.plugin.policy.refresh.matcher


/**
 * Entity matcher for ContactContact.
 */
@Export
class ContactContactMatcher extends InitializablePolicyGraphMatcherBase<ContactContact> {
  /**
   * Matches on relationship typekey and related contacts (source and related).
   */
  override function doEntitiesMatch(cc1 : ContactContact, cc2 : ContactContact) : boolean {
    return cc1.Relationship==cc2.Relationship and 
      doRelatedEntitiesMatch(cc1.RelatedContact, cc2.RelatedContact) and 
      doRelatedEntitiesMatch(cc1.SourceContact, cc2.SourceContact)
  }

}
