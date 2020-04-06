package gw.entity

uses gw.api.database.IQueryResult
uses gw.api.database.Query
uses gw.api.database.QuerySelectColumns
uses gw.api.path.Paths

/**
 * Extension to ExposureWorkloadClassification which adds methods to find exposure-specific classifications.
 */
@Export
enhancement GWExposureWorkloadClassificationEnhancement : entity.ExposureWorkloadClassification {

  /**
   * Returns query which finds all Exposure Workload Classifications in the system.
   * This includes both active and inactive classifications.
   */
  public static property get ExposureWorkloadClassificationsQuery() : Query<ExposureWorkloadClassification> {
    return Query.make(ExposureWorkloadClassification)
  }
    
  /**
   * Finds all Exposure Workload Classifications in the system. This includes both active and inactive classifications.
   */
  public static function findAllExposureWorkloadClassifications() : IQueryResult<ExposureWorkloadClassification, ExposureWorkloadClassification> {
    return ExposureWorkloadClassificationsQuery
            .select()
            .orderBy(QuerySelectColumns.path(Paths.make(ExposureWorkloadClassification#Priority)))
  }
  
  /**
   * Finds all active Exposure Workload Classifications in the system.
   */
  public static function findActiveExposureWorkloadClassifications() : IQueryResult<ExposureWorkloadClassification, ExposureWorkloadClassification> {
    return ExposureWorkloadClassificationsQuery
            .compare("Active", Equals, true)    
            .select()
            .orderBy(QuerySelectColumns.path(Paths.make(ExposureWorkloadClassification#Priority)))
  }
 
}
