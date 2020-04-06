package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/workload/conditions/IncidentSeverityConditionsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class IncidentSeverityConditionsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/workload/conditions/IncidentSeverityConditionsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IncidentSeverityConditionsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at IncidentSeverityConditionsLV.pcf: line 28, column 45
    function sortValue_0 (incidentseverity :  entity.IncidentSeverityConditionFilter) : java.lang.Object {
      return incidentseverity.IncidentSeverity
    }
    
    // 'toAdd' attribute on RowIterator at IncidentSeverityConditionsLV.pcf: line 20, column 60
    function toAdd_5 (incidentseverity :  entity.IncidentSeverityConditionFilter) : void {
      classification.IncidentSeverityCondition.addToConditionFilters(incidentseverity)
    }
    
    // 'toRemove' attribute on RowIterator at IncidentSeverityConditionsLV.pcf: line 20, column 60
    function toRemove_6 (incidentseverity :  entity.IncidentSeverityConditionFilter) : void {
      classification.IncidentSeverityCondition.removeFromConditionFilters(incidentseverity)
    }
    
    // 'value' attribute on RowIterator at IncidentSeverityConditionsLV.pcf: line 20, column 60
    function value_7 () : entity.IncidentSeverityConditionFilter[] {
      return classification.IncidentSeverityCondition.ConditionFilters
    }
    
    property get classification () : WorkloadClassification {
      return getRequireValue("classification", 0) as WorkloadClassification
    }
    
    property set classification ($arg :  WorkloadClassification) {
      setRequireValue("classification", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/workload/conditions/IncidentSeverityConditionsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends IncidentSeverityConditionsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyCell (id=IncidentSeverity) at IncidentSeverityConditionsLV.pcf: line 28, column 45
    function defaultSetter_3 (__VALUE_TO_SET :  java.lang.Object) : void {
      incidentseverity.IncidentSeverity = (__VALUE_TO_SET as typekey.SeverityType)
    }
    
    // 'value' attribute on TypeKeyCell (id=IncidentSeverity) at IncidentSeverityConditionsLV.pcf: line 28, column 45
    function valueRoot_4 () : java.lang.Object {
      return incidentseverity
    }
    
    // 'value' attribute on TypeKeyCell (id=IncidentSeverity) at IncidentSeverityConditionsLV.pcf: line 28, column 45
    function value_1 () : typekey.SeverityType {
      return incidentseverity.IncidentSeverity
    }
    
    property get incidentseverity () : entity.IncidentSeverityConditionFilter {
      return getIteratedValue(1) as entity.IncidentSeverityConditionFilter
    }
    
    
  }
  
  
}