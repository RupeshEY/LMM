package gw.plugin.policy.refresh.matcher


/**
 * An EntityMatcher for Endorsements.
 */
@Export
class EndorsementMatcher extends PolicyGraphMatcherBase<Endorsement>
{
  /**
   * Matches on the FormNumber field.
   */
  override function doEntitiesMatch(e1 : Endorsement, e2 : Endorsement) : boolean {
    if (areBothNotNull(e1.PolicySystemId, e2.PolicySystemId))
      return e1.PolicySystemId == e2.PolicySystemId

    return areBothNullOrEqual(e1.FormNumber, e2.FormNumber)
  }

}
