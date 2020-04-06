package gw.plugin.policy.refresh.matcher

uses java.util.Comparator

/**
 * Entity matcher for ClaimContacts.
 */
@Export
class ClaimContactMatcher extends InitializablePolicyGraphMatcherBase<ClaimContact>
{
  /**
   * Matches on the linked contact.
   */
  override function doEntitiesMatch(cc1:ClaimContact, cc2:ClaimContact) : boolean {
    return doRelatedEntitiesMatch(cc1.Contact, cc2.Contact)
  }

  /**
   * Prioritizes multiple matches based on the associated Contact
   */  
  override function getMatchPrioritizer(toBeMatched:ClaimContact) : Comparator<ClaimContact> {
    return new TransformingIdPropertyMatchPrioritizer<ClaimContact,Contact>(toBeMatched, \ cc -> cc.Contact)
  }
}
