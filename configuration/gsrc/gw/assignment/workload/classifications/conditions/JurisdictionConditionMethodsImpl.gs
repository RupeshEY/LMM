package gw.assignment.workload.classifications.conditions

uses gw.api.database.Query
uses gw.pl.persistence.core.Bean

/**
 * Delegate that provides filtering by Jurisdiction of Assignables that support Weighted Workload
 * Assignment Load Balancing.
 */
@Export
public class JurisdictionConditionMethodsImpl extends AbstractConditionMethodsImpl {

  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Constructors
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  

  /**
   * Constructor used by delegation. Do not access.
   */  
  public construct(filterSet : JurisdictionCondition) {
    super(filterSet)
  }


  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Public Methods
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  

  public override function filterQuery(query : Query) {
    var jurisdictionCondition = (Condition as JurisdictionCondition)    
    if (not (jurisdictionCondition.WorkloadClassification typeis ExposureWorkloadClassification)) {
      return
    }
    
    // Filter by specific jurisdiction causes if requested
    if (not Condition.IncludeAll and jurisdictionCondition.ConditionFilters.HasElements) {
      var jurisdictions = jurisdictionCondition.ConditionFilters.map(\ cause ->cause.Jurisdiction)
      query.and(\ andExp ->{
              andExp.compareIn(Exposure#JurisdictionState, jurisdictions)
      })
    }    
  }


  public override function isMatch(entity : Object) : boolean {    
    switch(typeof entity) {
      case Exposure:
        return matchesJurisdiction(entity.JurisdictionState)
        
      default:
        // ignore as if it didn't exist
        return true
    }    
  }


  public override property get HasFilters() : boolean {
    return not (Condition as JurisdictionCondition).ConditionFilters.IsEmpty
  }


  public override function clearFilters() { 
    var cond = (Condition as JurisdictionCondition)
    for (filter in cond.ConditionFilters) {
      cond.removeFromConditionFilters(filter)
    }
  }


  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Private Methods
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  

  private function matchesJurisdiction(juris : Jurisdiction) : boolean {
    var result = false
    if (not Condition.IncludeAll) {
      var filterSet = Condition as JurisdictionCondition
      if (not filterSet.ConditionFilters.IsEmpty) {
        result = filterSet.ConditionFilters.hasMatch(\ jf ->jf.Jurisdiction == juris)
      }
    } else {
      result = true
    }
    return result    
  }

}
