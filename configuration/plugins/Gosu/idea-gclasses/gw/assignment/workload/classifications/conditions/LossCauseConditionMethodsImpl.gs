package gw.assignment.workload.classifications.conditions

uses gw.api.database.Query
uses gw.pl.persistence.core.Bean

/**
 * Delegate that provides filtering by Loss Cause of Assignables that support Weighted Workload
 * Assignment Load Balancing.
 */
@Export
public class LossCauseConditionMethodsImpl extends AbstractConditionMethodsImpl {

  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Constructors
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  

  /**
   * Constructor used by delegation. Do not access.
   */  
  public construct(filterSet : LossCauseCondition) {
    super(filterSet)
  }


  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Public Methods
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  

  public override function filterQuery(query : Query) {
    var lossCauseCondition = (Condition as LossCauseCondition)
    if (not (lossCauseCondition.WorkloadClassification typeis ClaimWorkloadClassification)) {
      return
    }
    
    // Filter by specific claim loss causes if requested
    if (not Condition.IncludeAll and lossCauseCondition.ConditionFilters.HasElements) {
      var lossCauses = lossCauseCondition.ConditionFilters.map(\ cause -> cause.LossCause)
      query.and(\ andExp ->{
              query.compareIn(Claim#LossCause, lossCauses)
      })
    }    
  }


  public override function isMatch(entity : Object) : boolean {    
    switch(typeof entity) {
      case Claim:
        return matchesLossCause(entity.LossCause)
        
      default:
        // ignore as if it didn't exist
        return true
    }    
  }


  public override property get HasFilters() : boolean {
    return not (Condition as LossCauseCondition).ConditionFilters.IsEmpty
  }
  
  
  public override function clearFilters() { 
    var cond = (Condition as LossCauseCondition)
    for (filter in cond.ConditionFilters) {
      cond.removeFromConditionFilters(filter)
    }
  }


  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Private Methods
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  

  private function matchesLossCause(lossCause : LossCause) : boolean {
    var result = false
    if (not Condition.IncludeAll) {
      var filterSet = (Condition as LossCauseCondition)
      if (not filterSet.ConditionFilters.IsEmpty) {
        result = filterSet.ConditionFilters.hasMatch(\ lcf ->lcf.LossCause == lossCause)
      }
    } else {
      result = true
    }    
    return result
  }

}
