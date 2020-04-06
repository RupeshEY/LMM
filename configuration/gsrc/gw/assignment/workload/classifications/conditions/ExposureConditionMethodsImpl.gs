package gw.assignment.workload.classifications.conditions

uses gw.api.database.Query

/**
 * Delegate that provides filtering by Exposure attributes of Assignables that support Weighted Workload
 * Assignment Load Balancing.
 */
@Export
public class ExposureConditionMethodsImpl extends AbstractConditionMethodsImpl {

  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Constructors
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  

  /**
   * Constructor used by delegation. Do not access.
   */  
  public construct(newCondition : ExposureCondition) {
    super(newCondition)
  }


  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Public Methods
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  

  public override function filterQuery(query : Query) {
    var exposureCondition = (Condition as ExposureCondition)    
    if (not exposureCondition.IncludeAll and exposureCondition.ConditionFilters.HasElements) {
      
      // In the case of a claim, we have to do a subselect
      if (exposureCondition.WorkloadClassification typeis ClaimWorkloadClassification) {
        query.and(\ andExp ->{ 
          query.or(\ orExp ->{
              exposureCondition.ConditionFilters.each(\ exp ->{
                orExp.subselect("ID", CompareIn, entity.Exposure, "Claim")
                .compare(Exposure#PrimaryCoverage, Equals, exp.CoverageType)
                .compare(Exposure#CoverageSubType, Equals, exp.CoverageSubType)
                .compare(Exposure#LossParty, Equals, exp.LossPartyType)
              })              
          })
        })
      }
      
      // handle exposure case
      else if (exposureCondition.WorkloadClassification typeis ExposureWorkloadClassification) {
        query.or(\ orExp ->{
          exposureCondition.ConditionFilters.each(\ wf ->{
           orExp.and(\ and1 ->{
              and1.compare(Exposure#PrimaryCoverage, Equals, wf.CoverageType )
                  .compare(Exposure#CoverageSubType, Equals, wf.CoverageSubType)
                  .compare(Exposure#LossParty, Equals, wf.LossPartyType)})
          })
        })               
      } 
      
      // unknown type
      else {
        return
      }
    }    
  }


  public override function isMatch(entity : Object) : boolean {    
    switch(typeof entity) {
      case Claim:
        return matchesExposureByClaim(entity)
        
      case Exposure:
        return matchesExposureByExposure(entity)
        
      default:
        // ignore as if it didn't exist
        return true
    }    
  }


  public override property get HasFilters() : boolean {
    return not (Condition as ExposureCondition).ConditionFilters.IsEmpty
  }


  public override function clearFilters() { 
    var cond = (Condition as ExposureCondition)
    for (filter in cond.ConditionFilters) {
      cond.removeFromConditionFilters(filter)
    }
  }


  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Private Methods
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
  
  private function matchesExposureByClaim(cl : Claim) : boolean {
    var result = false
    if (not Condition.IncludeAll) {
      for (exp in cl.Exposures) {
        if (checkConditionFilterCriteria(exp)) {
          result = true
          break
        }
      }
    } else {    
      result = true
    }
    
    return result    
  }


  private function matchesExposureByExposure(exp : Exposure) : boolean {
    var result = false
    if (not Condition.IncludeAll) {
      result = checkConditionFilterCriteria(exp)
    } else {    
      result = true
    }
    
    return result
  }


  private function checkConditionFilterCriteria(exp : Exposure) : boolean {
    var result = false
    var filterSet = (Condition as ExposureCondition)
    if (not filterSet.ConditionFilters.IsEmpty) {
      result = filterSet.ConditionFilters.hasMatch(\ expFilter ->
              expFilter.CoverageType == exp.PrimaryCoverage and
              expFilter.CoverageSubType == exp.CoverageSubType and
              expFilter.LossPartyType == exp.LossParty)
    }
    return result
  }
  
}
