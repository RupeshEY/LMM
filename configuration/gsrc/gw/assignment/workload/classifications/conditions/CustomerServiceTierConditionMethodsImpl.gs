package gw.assignment.workload.classifications.conditions

uses gw.api.database.Query
uses gw.pl.persistence.core.Bean

/**
 * Delegate that provides filtering by CustomerServiceTier of Assignables that support Weighted Workload
 * Assignment Load Balancing.
 */
@Export
public class CustomerServiceTierConditionMethodsImpl extends AbstractConditionMethodsImpl {

  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Constructors
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  

  /**
   * Constructor used by delegation. Do not access.
   */  
  public construct(filterSet : CustomerServiceTierCondition) {
    super(filterSet)
  }


  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Public Methods
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  

  public override function filterQuery(query : Query) {
    var customerServiceTierCondition = (Condition as CustomerServiceTierCondition)
    if (not (customerServiceTierCondition.WorkloadClassification typeis ClaimWorkloadClassification)) {
      return
    }
    
    // Filter by specific CustomerServiceTier causes if requested
    if (not customerServiceTierCondition.IncludeAll and customerServiceTierCondition.ConditionFilters.HasElements) {
      var policyJoin = query.join(Claim#Policy)
      var pps = customerServiceTierCondition.ConditionFilters.map(\ wf -> wf.CustomerServiceTier)
      policyJoin.compareIn(Policy#CustomerServiceTier, pps)
    }
  }


  public override function isMatch(entity : Object) : boolean {    
    switch(typeof entity) {
      case Claim:
        return matchesCustomerServiceTier(entity)

      default:
        // ignore as if it didn't exist
        return true
    }    
  }


  public override property get HasFilters() : boolean {
    return not (Condition as CustomerServiceTierCondition).ConditionFilters.IsEmpty
  }


  public override function clearFilters() { 
    var cond = (Condition as CustomerServiceTierCondition)
    for (filter in cond.ConditionFilters) {
      cond.removeFromConditionFilters(filter)
    }
  }

  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Private Methods
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  

  private function matchesCustomerServiceTier(claim : Claim) : boolean {
    var result = false
    if (not Condition.IncludeAll) {
      var filterSet = Condition as CustomerServiceTierCondition
      if (not filterSet.ConditionFilters.IsEmpty) {
        result = filterSet.ConditionFilters.hasMatch(\ ppf ->ppf.CustomerServiceTier == claim.Policy.CustomerServiceTier)
      }
    } else {
      result = true
    }
    return result    
  }

}
