package gw.plugin.policy.refresh.matcher


/**
 * Entity matcher for CovTerms.
 */
@Export
class CovTermMatcher extends InitializablePolicyGraphMatcherBase<CovTerm> {
  
  /**
   * Matches on the associated coverage, pattern, model aggregation, and
   * model restriction.
   */
  override function doEntitiesMatch(ct1 : CovTerm, ct2 : CovTerm) : boolean {
    if (areBothNotNull(ct1.PolicySystemId, ct2.PolicySystemId)) {
      return ct1.PolicySystemId == ct2.PolicySystemId
    }

    return doRelatedEntitiesMatch(ct1.Coverage, ct2.Coverage) and
      ct1.Subtype==ct2.Subtype and
      areBothNullOrEqual(ct1.CovTermPattern, ct2.CovTermPattern) and
      areBothNullOrEqual(ct1.ModelAggregation, ct2.ModelAggregation) and
      areBothNullOrEqual(ct1.ModelRestriction, ct2.ModelRestriction)
  }
}
