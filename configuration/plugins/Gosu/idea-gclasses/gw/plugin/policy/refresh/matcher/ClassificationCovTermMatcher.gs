package gw.plugin.policy.refresh.matcher


/**
 * Entity matcher for ClassificationCovTerms.
 */
@Export
class ClassificationCovTermMatcher extends InitializablePolicyGraphMatcherBase<ClassificationCovTerm>
{
  /**
   * Matches on associated Coverage, pattern, and code.
   */
  override function doEntitiesMatch(ct1:ClassificationCovTerm, ct2:ClassificationCovTerm) : boolean {
    if (areBothNotNull(ct1.PolicySystemId, ct2.PolicySystemId)) {
      return ct1.PolicySystemId == ct2.PolicySystemId
    }

    return doRelatedEntitiesMatch(ct1.Coverage, ct2.Coverage) and
      areBothNullOrEqual(ct1.CovTermPattern, ct2.CovTermPattern) and
      areBothNullOrEqual(ct1.ModelAggregation, ct2.ModelAggregation) and
      areBothNullOrEqual(ct1.ModelRestriction, ct2.ModelRestriction) and 
      areBothNullOrEqual(ct1.Code, ct2.Code)
  }
}
