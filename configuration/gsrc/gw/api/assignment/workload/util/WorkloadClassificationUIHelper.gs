package gw.api.assignment.workload.util

/**
 * Utility helper class for Weighted Workload Classification Creation UI.
 */
@Export
public class WorkloadClassificationUIHelper {

  /**
   * This class is not instantiated.
   */
  private construct() {}

  static function validateAndUpdateWorkloadClassification(workloadClass: WorkloadClassification) {
    //If the LOB does not match the current Loss Type, remove it and the attached Policy Type
    if(workloadClass.ClaimLossType != null and !workloadClass.ClaimLOBCode?.hasCategory(workloadClass.ClaimLossType)) {
      workloadClass.ClaimLOBCode = null
      workloadClass.ClaimPolicyType = null
    }

    //If the Policy Type does match the current LOB, remove it
    if(workloadClass.ClaimLOBCode != null and !workloadClass.ClaimPolicyType?.hasCategory(workloadClass.ClaimLOBCode)) {
      workloadClass.ClaimPolicyType = null
    }

    //If any of the ExposureCondition filters have Coverages that don't match the Policy Type, remove the Coverage
    if(workloadClass.ClaimPolicyType != null) {
      workloadClass.ExposureCondition.ConditionFilters?.each( \ exposureFilter -> {
        if(!exposureFilter.CoverageType?.hasCategory(workloadClass.ClaimPolicyType)) {
          exposureFilter.CoverageType = null
          exposureFilter.CoverageSubType = null
          exposureFilter.LossPartyType = null
        }
      })
    }

    //If any SegmentCondition filters have Segments that don't match the Loss Type, remove the Segment
    if(workloadClass.ClaimLossType != null) {
      workloadClass.SegmentCondition.ConditionFilters?.each( \ segmentFilter -> {
        if(!segmentFilter.Segment?.hasCategory(workloadClass.ClaimLossType)) {
          segmentFilter.Segment = null
        }
      })
    }

    if(workloadClass typeis ClaimWorkloadClassification) { //Only Claim Workloads Classes have Loss Cause Condition Filters
      //If any LossCauseCondition filters have LossCauses that do not match the LossType, remove them
      if(workloadClass.ClaimLossType != null) {
        workloadClass.LossCauseCondition.ConditionFilters?.each( \ lossCauseFilter -> {
          if(!lossCauseFilter.LossCause?.hasCategory(workloadClass.ClaimLossType)) {
            lossCauseFilter.LossCause = null
          }
        })
      }
    }
  }

  static function validateAndUpdateExposureCondition(exposureCondition : ExposureConditionFilter) {
    if(exposureCondition.CoverageType != null and
       !exposureCondition.CoverageSubType?.hasCategory(exposureCondition.CoverageType)) {
      exposureCondition.CoverageSubType = null
    }
    if(exposureCondition.CoverageSubType == null or
        (exposureCondition.CoverageSubType != null and
         !exposureCondition.LossPartyType?.hasCategory(exposureCondition.CoverageSubType))) {
      exposureCondition.LossPartyType = null
    }
  }

  static function isLossTypeWarningApplicable(workloadClass : WorkloadClassification) : boolean {
    return (workloadClass.ClaimLOBCode != null or
             workloadClass.SegmentCondition.ConditionFilters?.hasMatch( \ segmentFilter -> segmentFilter.Segment != null) or
                (workloadClass typeis ClaimWorkloadClassification and //Only Claim Workloads have Loss Cause Condition Filters
                 workloadClass.LossCauseCondition.ConditionFilters?.hasMatch( \ lossCauseFilter -> lossCauseFilter.LossCause != null)))
  }

  static function isLOBWarningApplicable(workloadClass : WorkloadClassification) : boolean {
    return workloadClass.ClaimPolicyType != null
  }

  static function isPolicyTypeWarningApplicable(workloadClass : WorkloadClassification) : boolean {
    return workloadClass.ExposureCondition.ConditionFilters?.hasMatch( \ exposureFilter -> exposureFilter.CoverageType != null)
  }
}