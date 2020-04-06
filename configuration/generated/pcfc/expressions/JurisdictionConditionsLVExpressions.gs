package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/workload/conditions/JurisdictionConditionsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class JurisdictionConditionsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/workload/conditions/JurisdictionConditionsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends JurisdictionConditionsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyCell (id=Jurisdiction) at JurisdictionConditionsLV.pcf: line 29, column 45
    function defaultSetter_3 (__VALUE_TO_SET :  java.lang.Object) : void {
      jurisdiction.Jurisdiction = (__VALUE_TO_SET as typekey.Jurisdiction)
    }
    
    // 'filter' attribute on TypeKeyCell (id=Jurisdiction) at JurisdictionConditionsLV.pcf: line 29, column 45
    function filter_5 (VALUE :  typekey.Jurisdiction, VALUES :  typekey.Jurisdiction[]) : java.lang.Boolean {
      return VALUE.hasCategory(JurisdictionType.TC_INSURANCE)
    }
    
    // 'value' attribute on TypeKeyCell (id=Jurisdiction) at JurisdictionConditionsLV.pcf: line 29, column 45
    function valueRoot_4 () : java.lang.Object {
      return jurisdiction
    }
    
    // 'value' attribute on TypeKeyCell (id=Jurisdiction) at JurisdictionConditionsLV.pcf: line 29, column 45
    function value_1 () : typekey.Jurisdiction {
      return jurisdiction.Jurisdiction
    }
    
    property get jurisdiction () : entity.JurisdictionConditionFilter {
      return getIteratedValue(1) as entity.JurisdictionConditionFilter
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/workload/conditions/JurisdictionConditionsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class JurisdictionConditionsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at JurisdictionConditionsLV.pcf: line 29, column 45
    function sortValue_0 (jurisdiction :  entity.JurisdictionConditionFilter) : java.lang.Object {
      return jurisdiction.Jurisdiction
    }
    
    // 'toAdd' attribute on RowIterator at JurisdictionConditionsLV.pcf: line 20, column 56
    function toAdd_6 (jurisdiction :  entity.JurisdictionConditionFilter) : void {
      classification.JurisdictionCondition.addToConditionFilters(jurisdiction)
    }
    
    // 'toRemove' attribute on RowIterator at JurisdictionConditionsLV.pcf: line 20, column 56
    function toRemove_7 (jurisdiction :  entity.JurisdictionConditionFilter) : void {
      classification.JurisdictionCondition.removeFromConditionFilters(jurisdiction)
    }
    
    // 'value' attribute on RowIterator at JurisdictionConditionsLV.pcf: line 20, column 56
    function value_8 () : entity.JurisdictionConditionFilter[] {
      return classification.JurisdictionCondition.ConditionFilters
    }
    
    property get classification () : WorkloadClassification {
      return getRequireValue("classification", 0) as WorkloadClassification
    }
    
    property set classification ($arg :  WorkloadClassification) {
      setRequireValue("classification", 0, $arg)
    }
    
    
  }
  
  
}