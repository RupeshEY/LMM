package gw.api.assignment.workload.util

uses gw.api.database.IQueryBuilder
uses gw.api.database.Relop
uses gw.api.filters.StandardQueryFilter

/**
 * List view filters used on the Administration - Weighted Assignment Classification listview.
 */
@Export
public abstract class WorkloadClassificationToolbarFiltersBase {

  ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Public Methods
  ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  /**
   * Listview filter which filters out all but Active Workload Classifications.
   */
  public function onlyActiveWorkloadClassifications() : StandardQueryFilter {
    return new StandardQueryFilter("Active Workload Classifications",
        \ query: IQueryBuilder -> {
          query.compare(WorkloadClassification#Active, Relop.Equals, true)
        })
  }


  /**
   * Listview filter which filters out all but Claim Workload Classifications.
   */
  public function onlyClaimWorkloadClassifications() : StandardQueryFilter {
    return new StandardQueryFilter("Claim Workload Classifications",
        \ query: IQueryBuilder -> {
          query.compare(WorkloadClassification#Subtype, Relop.Equals, typekey.WorkloadClassification.TC_CLAIMWORKLOADCLASSIFICATION)
        })
  }


  /**
   * Listview filter which filters out all but Active Claim Workload Classifications.
   */
  public function onlyActiveClaimWorkloadClassifications() : StandardQueryFilter {
    return new StandardQueryFilter("Active Claim Workload Classifications",
        \ query: IQueryBuilder -> {
          query.compare(WorkloadClassification#Subtype, Relop.Equals, typekey.WorkloadClassification.TC_CLAIMWORKLOADCLASSIFICATION).compare(WorkloadClassification#Active, Relop.Equals, true)
        })
  }


  /**
   * Listview filter which filters out all but Exposure Workload Classifications.
   */
  public function onlyExposureWorkloadClassifications() : StandardQueryFilter {
    return new StandardQueryFilter("Exposure Workload Classifications",
        \ query: IQueryBuilder -> {
          query.compare(WorkloadClassification#Subtype, Relop.Equals, typekey.WorkloadClassification.TC_EXPOSUREWORKLOADCLASSIFICATION)
        })
  }


  /**-
   * Listview filter which filters out all but Active Exposure Workload Classifications.
   */
  public function onlyActiveExposureWorkloadClassifications() : StandardQueryFilter {
    return new StandardQueryFilter("Active Exposure Workload Classifications",
        \ query: IQueryBuilder -> {
          query.compare(WorkloadClassification#Subtype, Relop.Equals, typekey.WorkloadClassification.TC_EXPOSUREWORKLOADCLASSIFICATION).compare(WorkloadClassification#Active, Relop.Equals, true)
        })
  }


  /**
   * Listview filter which filters out nothing. All listview elements are available.
   */
  public function all() : StandardQueryFilter {
    return new StandardQueryFilter("All", \ query: IQueryBuilder -> {})
  }
}
