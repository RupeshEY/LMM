package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/workload/conditions/LossCauseConditionsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class LossCauseConditionsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/workload/conditions/LossCauseConditionsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends LossCauseConditionsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RangeCell (id=LossCause) at LossCauseConditionsLV.pcf: line 29, column 41
    function defaultSetter_3 (__VALUE_TO_SET :  java.lang.Object) : void {
      losscause.LossCause = (__VALUE_TO_SET as typekey.LossCause)
    }
    
    // 'valueRange' attribute on RangeCell (id=LossCause) at LossCauseConditionsLV.pcf: line 29, column 41
    function valueRange_5 () : java.lang.Object {
      return getValidLossCauseRange(classification.ClaimLossType)
    }
    
    // 'value' attribute on RangeCell (id=LossCause) at LossCauseConditionsLV.pcf: line 29, column 41
    function valueRoot_4 () : java.lang.Object {
      return losscause
    }
    
    // 'value' attribute on RangeCell (id=LossCause) at LossCauseConditionsLV.pcf: line 29, column 41
    function value_1 () : typekey.LossCause {
      return losscause.LossCause
    }
    
    // 'valueRange' attribute on RangeCell (id=LossCause) at LossCauseConditionsLV.pcf: line 29, column 41
    function verifyValueRangeIsAllowedType_6 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=LossCause) at LossCauseConditionsLV.pcf: line 29, column 41
    function verifyValueRangeIsAllowedType_6 ($$arg :  typekey.LossCause[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=LossCause) at LossCauseConditionsLV.pcf: line 29, column 41
    function verifyValueRange_7 () : void {
      var __valueRangeArg = getValidLossCauseRange(classification.ClaimLossType)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_6(__valueRangeArg)
    }
    
    property get losscause () : entity.LossCauseConditionFilter {
      return getIteratedValue(1) as entity.LossCauseConditionFilter
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/workload/conditions/LossCauseConditionsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LossCauseConditionsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at LossCauseConditionsLV.pcf: line 29, column 41
    function sortValue_0 (losscause :  entity.LossCauseConditionFilter) : java.lang.Object {
      return losscause.LossCause
    }
    
    // 'toAdd' attribute on RowIterator at LossCauseConditionsLV.pcf: line 20, column 53
    function toAdd_8 (losscause :  entity.LossCauseConditionFilter) : void {
      classification.LossCauseCondition.addToConditionFilters(losscause)
    }
    
    // 'toRemove' attribute on RowIterator at LossCauseConditionsLV.pcf: line 20, column 53
    function toRemove_9 (losscause :  entity.LossCauseConditionFilter) : void {
      classification.LossCauseCondition.removeFromConditionFilters(losscause)
    }
    
    // 'value' attribute on RowIterator at LossCauseConditionsLV.pcf: line 20, column 53
    function value_10 () : entity.LossCauseConditionFilter[] {
      return classification.LossCauseCondition.ConditionFilters
    }
    
    property get classification () : WorkloadClassification {
      return getRequireValue("classification", 0) as WorkloadClassification
    }
    
    property set classification ($arg :  WorkloadClassification) {
      setRequireValue("classification", 0, $arg)
    }
    
    function getValidLossCauseRange(lossType : LossType) : java.util.List<LossCause> {
      var allLossCauses = typekey.LossCause.getTypeKeys(false)
      if (lossType != null) {
        return allLossCauses.where(\ t -> t.hasCategory(lossType))
      }
      
      return allLossCauses
    }
    
    
  }
  
  
}