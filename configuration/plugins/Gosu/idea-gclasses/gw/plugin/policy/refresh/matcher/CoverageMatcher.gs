package gw.plugin.policy.refresh.matcher


/**
 * Entity matcher for coverages.
 */
@Export
class CoverageMatcher extends PolicyGraphMatcherBase<Coverage> {
  
  /**
   * Matches on subtype and coverage type.
   */
  override function doEntitiesMatch(cov1 : Coverage, cov2 : Coverage) : boolean {
    if (areBothNotNull(cov1.PolicySystemId, cov2.PolicySystemId))
      return cov1.PolicySystemId == cov2.PolicySystemId

    return cov1.Subtype.equals(cov2.Subtype) and cov1.Type.equals(cov2.Type)
  }
}
