package gw.assignment.workload.classifications.conditions

uses gw.api.database.Query
uses gw.pl.persistence.core.Bean

/**
 * Delegate that provides filtering by Incident Severity of Assignables that support Weighted Workload
 * Assignment Load Balancing.
 */
@Export
public class IncidentSeverityConditionMethodsImpl extends AbstractConditionMethodsImpl {

  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Constructors
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  

  /**
   * Constructor used by delegation. Do not access.
   */  
  public construct(filterSet : IncidentSeverityCondition) {
    super(filterSet)
  }


  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Public Methods
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  

  public override function filterQuery(query : Query) {
    var incidentSeverityCondition = Condition as IncidentSeverityCondition
    if (not (incidentSeverityCondition.WorkloadClassification typeis ExposureWorkloadClassification)) {
      return
    }
    
    if (not incidentSeverityCondition.IncludeAll and incidentSeverityCondition.ConditionFilters.HasElements) {
      var incidentJoin = query.join(Exposure#Incident)
      var isc = incidentSeverityCondition.ConditionFilters.map(\ wf ->wf.IncidentSeverity)
      incidentJoin.compareIn(Incident#Severity, isc)
    }    
  }
  
  
  public override function isMatch(entity : Object) : boolean {    
    switch(typeof entity) {
      case Exposure:
        return matchesIncident(entity.Incident)
        
      default:
        // ignore as if it didn't exist
        return true
    }    
  }
  
  
  public function matchesIncident(incid : Incident) : boolean {
    var result = false
    if (not Condition.IncludeAll) {
      var filterSet = Condition as IncidentSeverityCondition
      if (not filterSet.ConditionFilters.IsEmpty) {
        result = filterSet.ConditionFilters.hasMatch(\ incidentFilter ->incidentFilter.IncidentSeverity == incid.Severity)
      } 
    } else {
      result = true
    }    
    return result
  }
  
  
  public override property get HasFilters() : boolean {
    return not (Condition as IncidentSeverityCondition).ConditionFilters.IsEmpty
  }


  public override function clearFilters() { 
    var cond = (Condition as IncidentSeverityCondition)
    for (filter in cond.ConditionFilters) {
      cond.removeFromConditionFilters(filter)
    }
  }

}
