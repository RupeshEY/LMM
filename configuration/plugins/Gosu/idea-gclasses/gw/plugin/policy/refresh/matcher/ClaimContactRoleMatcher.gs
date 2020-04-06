package gw.plugin.policy.refresh.matcher

uses java.util.Comparator

/**
 * Entity matcher implementation for ClaimContactRoles.
 */
@Export
class ClaimContactRoleMatcher extends InitializablePolicyGraphMatcherBase<ClaimContactRole> {
  /**
   * Matches on the role and related ClaimContact.
   */
  override function doEntitiesMatch(cr1:ClaimContactRole, cr2:ClaimContactRole) : boolean {
    return cr1.Role.equals(cr2.Role)  and doRelatedEntitiesMatch(cr1.ClaimContact, cr2.ClaimContact)
  }

  /**
   * Prioritizes multiple matches based on the associated Contact
   */
  override function getMatchPrioritizer(toBeMatched:ClaimContactRole) : Comparator<ClaimContactRole> {
    return new TransformingIdPropertyMatchPrioritizer<ClaimContactRole,Contact>(toBeMatched, \ ccr -> ccr.Contact)
  }
}
