package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/workload/conditions/CustomerServiceTierConditionsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CustomerServiceTierConditionsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/workload/conditions/CustomerServiceTierConditionsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CustomerServiceTierConditionsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at CustomerServiceTierConditionsLV.pcf: line 11, column 65
    function initialValue_0 () : java.util.List<typekey.CustomerServiceTier> {
      return CustomerServiceTier.findAvailableCustomerTiers()
    }
    
    // 'value' attribute on RowIterator at CustomerServiceTierConditionsLV.pcf: line 34, column 52
    function sortValue_1 (customerServiceTierFilter :  entity.CustomerServiceTierConditionFilter) : java.lang.Object {
      return customerServiceTierFilter.CustomerServiceTier
    }
    
    // 'toAdd' attribute on RowIterator at CustomerServiceTierConditionsLV.pcf: line 25, column 63
    function toAdd_9 (customerServiceTierFilter :  entity.CustomerServiceTierConditionFilter) : void {
      classification.CustomerServiceTierCondition.addToConditionFilters(customerServiceTierFilter)
    }
    
    // 'toRemove' attribute on RowIterator at CustomerServiceTierConditionsLV.pcf: line 25, column 63
    function toRemove_10 (customerServiceTierFilter :  entity.CustomerServiceTierConditionFilter) : void {
      classification.CustomerServiceTierCondition.removeFromConditionFilters(customerServiceTierFilter)
    }
    
    // 'value' attribute on RowIterator at CustomerServiceTierConditionsLV.pcf: line 25, column 63
    function value_11 () : entity.CustomerServiceTierConditionFilter[] {
      return classification.CustomerServiceTierCondition.ConditionFilters
    }
    
    property get availableCustomerServiceTiers () : java.util.List<typekey.CustomerServiceTier> {
      return getVariableValue("availableCustomerServiceTiers", 0) as java.util.List<typekey.CustomerServiceTier>
    }
    
    property set availableCustomerServiceTiers ($arg :  java.util.List<typekey.CustomerServiceTier>) {
      setVariableValue("availableCustomerServiceTiers", 0, $arg)
    }
    
    property get classification () : WorkloadClassification {
      return getRequireValue("classification", 0) as WorkloadClassification
    }
    
    property set classification ($arg :  WorkloadClassification) {
      setRequireValue("classification", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/workload/conditions/CustomerServiceTierConditionsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends CustomerServiceTierConditionsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RangeCell (id=CustomerServiceTierConditionFilter) at CustomerServiceTierConditionsLV.pcf: line 34, column 52
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      customerServiceTierFilter.CustomerServiceTier = (__VALUE_TO_SET as typekey.CustomerServiceTier)
    }
    
    // 'valueRange' attribute on RangeCell (id=CustomerServiceTierConditionFilter) at CustomerServiceTierConditionsLV.pcf: line 34, column 52
    function valueRange_6 () : java.lang.Object {
      return availableCustomerServiceTiers
    }
    
    // 'value' attribute on RangeCell (id=CustomerServiceTierConditionFilter) at CustomerServiceTierConditionsLV.pcf: line 34, column 52
    function valueRoot_5 () : java.lang.Object {
      return customerServiceTierFilter
    }
    
    // 'value' attribute on RangeCell (id=CustomerServiceTierConditionFilter) at CustomerServiceTierConditionsLV.pcf: line 34, column 52
    function value_2 () : typekey.CustomerServiceTier {
      return customerServiceTierFilter.CustomerServiceTier
    }
    
    // 'valueRange' attribute on RangeCell (id=CustomerServiceTierConditionFilter) at CustomerServiceTierConditionsLV.pcf: line 34, column 52
    function verifyValueRangeIsAllowedType_7 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=CustomerServiceTierConditionFilter) at CustomerServiceTierConditionsLV.pcf: line 34, column 52
    function verifyValueRangeIsAllowedType_7 ($$arg :  typekey.CustomerServiceTier[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=CustomerServiceTierConditionFilter) at CustomerServiceTierConditionsLV.pcf: line 34, column 52
    function verifyValueRange_8 () : void {
      var __valueRangeArg = availableCustomerServiceTiers
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_7(__valueRangeArg)
    }
    
    property get customerServiceTierFilter () : entity.CustomerServiceTierConditionFilter {
      return getIteratedValue(1) as entity.CustomerServiceTierConditionFilter
    }
    
    
  }
  
  
}