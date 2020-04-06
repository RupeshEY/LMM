package gw.entity

uses gw.api.database.IQueryResult
uses gw.api.database.Query
uses gw.api.database.QuerySelectColumns
uses gw.api.path.Paths

/**
 * Extension ClaimWorkloadClassification which adds methods to find claim-specific classifications.
 */
@Export
enhancement GWClaimWorkloadClassificationEnhancement : entity.ClaimWorkloadClassification {

  /**
   * Returns a query which searches for all Claim Workload Classifications in the system.
   * This includes both active and inactive classifications.
   */
  public static property get ClaimWorkloadClassificationsQuery() : Query<ClaimWorkloadClassification> {
    return Query.make(ClaimWorkloadClassification)
  }
  
  /**
   * Finds all Claim Workload Classifications in the system. This includes both active and inactive classifications.
   */
  public static function findAllClaimWorkloadClassifications() : IQueryResult<ClaimWorkloadClassification, ClaimWorkloadClassification> {
    return ClaimWorkloadClassificationsQuery
            .select()
            .orderBy(QuerySelectColumns.path(Paths.make(ClaimWorkloadClassification#Priority)))
  }
  
  /**
   * Finds all active Claim Workload Classifications in the system.
   */
  public static function findActiveClaimWorkloadClassifications() : IQueryResult<ClaimWorkloadClassification, ClaimWorkloadClassification> {
    return ClaimWorkloadClassificationsQuery
            .compare("Active", Equals, true)    
            .select()
            .orderBy(QuerySelectColumns.path(Paths.make(ClaimWorkloadClassification#Priority)))
  }

}
