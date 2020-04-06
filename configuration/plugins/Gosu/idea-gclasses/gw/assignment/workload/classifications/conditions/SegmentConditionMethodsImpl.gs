package gw.assignment.workload.classifications.conditions

uses gw.api.database.Query
uses gw.pl.persistence.core.Bean

/**
 * Delegate that provides filtering by Segment of Assignables that support Weighted Workload
 * Assignment Load Balancing.
 */
@Export
public class SegmentConditionMethodsImpl extends AbstractConditionMethodsImpl {

  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Constructors
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  

  /**
   * Constructor used by delegation. Do not access.
   */  
  public construct(filterSet : SegmentCondition) {
    super(filterSet)
  }


  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Public Methods
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  

  public override function filterQuery(query : Query) {
    var segmentCondition = (Condition as SegmentCondition)
    
    // claim or exposure workload classification? if not, then not supported
    if (not (segmentCondition.WorkloadClassification typeis ClaimWorkloadClassification 
            or segmentCondition.WorkloadClassification typeis ExposureWorkloadClassification)) {
      return
    }
    
    
    // Filter by specific exposure segments if requested
    if (not Condition.IncludeAll and segmentCondition.ConditionFilters.HasElements) {
      var segments = segmentCondition.ConditionFilters.map(\ sf -> sf.Segment)
      query.and(\ andExp ->{
              andExp.compareIn("Segment", segments)
      })
    }    
  }


  public override function isMatch(entity : Object) : boolean {    
    switch(typeof entity) {
      case Claim:      
        return matchesSegment(entity.Segment)
      case Exposure:
        return matchesSegment(entity.Segment)
      default:
        // ignore as if it didn't exist
        return true
    }    
  }


  public override property get HasFilters() : boolean {
    return not (Condition as SegmentCondition).ConditionFilters.IsEmpty
  }


  public override function clearFilters() { 
    var cond = (Condition as SegmentCondition)
    for (filter in cond.ConditionFilters) {
      cond.removeFromConditionFilters(filter)
    }
  }


  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Private Methods
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
  
  private function matchesSegment(segment : ClaimSegment) : boolean {
    var result = false    
    if (not Condition.IncludeAll) {
      var filterSet = (Condition as SegmentCondition)
      if (not filterSet.ConditionFilters.IsEmpty) {
        result = (filterSet.ConditionFilters).hasMatch(\ segmentFilter -> segmentFilter.Segment == segment)
      }
    } else {
      result = true
    }
    
    return result
  }
  
}
