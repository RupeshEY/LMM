package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/workload/conditions/ExposureConditionsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ExposureConditionsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/workload/conditions/ExposureConditionsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExposureConditionsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ExposureConditionsLV.pcf: line 29, column 44
    function sortValue_0 (exposure :  entity.ExposureConditionFilter) : java.lang.Object {
      return exposure.CoverageType
    }
    
    // 'value' attribute on RowIterator at ExposureConditionsLV.pcf: line 39, column 47
    function sortValue_1 (exposure :  entity.ExposureConditionFilter) : java.lang.Object {
      return exposure.CoverageSubType
    }
    
    // 'value' attribute on RowIterator at ExposureConditionsLV.pcf: line 50, column 46
    function sortValue_2 (exposure :  entity.ExposureConditionFilter) : java.lang.Object {
      return exposure.LossPartyType
    }
    
    // 'toAdd' attribute on RowIterator at ExposureConditionsLV.pcf: line 20, column 52
    function toAdd_20 (exposure :  entity.ExposureConditionFilter) : void {
      classification.ExposureCondition.addToConditionFilters(exposure)
    }
    
    // 'toRemove' attribute on RowIterator at ExposureConditionsLV.pcf: line 20, column 52
    function toRemove_21 (exposure :  entity.ExposureConditionFilter) : void {
      classification.ExposureCondition.removeFromConditionFilters(exposure)
    }
    
    // 'value' attribute on RowIterator at ExposureConditionsLV.pcf: line 20, column 52
    function value_22 () : entity.ExposureConditionFilter[] {
      return classification.ExposureCondition.ConditionFilters
    }
    
    property get classification () : WorkloadClassification {
      return getRequireValue("classification", 0) as WorkloadClassification
    }
    
    property set classification ($arg :  WorkloadClassification) {
      setRequireValue("classification", 0, $arg)
    }
    
    function getValidCoverageTypeRange(policyType : PolicyType) : java.util.List<CoverageType> {
        var allCoverageTypes = typekey.CoverageType.getTypeKeys(false)
        if (policyType != null) {
          return allCoverageTypes.where(\ ct -> ct.hasCategory(policyType))
        }
        return allCoverageTypes
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/workload/conditions/ExposureConditionsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ExposureConditionsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyCell (id=CoverageSubtype) at ExposureConditionsLV.pcf: line 39, column 47
    function defaultSetter_14 (__VALUE_TO_SET :  java.lang.Object) : void {
      exposure.CoverageSubType = (__VALUE_TO_SET as typekey.CoverageSubtype)
    }
    
    // 'value' attribute on TypeKeyCell (id=LossPartyType) at ExposureConditionsLV.pcf: line 50, column 46
    function defaultSetter_18 (__VALUE_TO_SET :  java.lang.Object) : void {
      exposure.LossPartyType = (__VALUE_TO_SET as typekey.LossPartyType)
    }
    
    // 'value' attribute on RangeCell (id=CoverageType) at ExposureConditionsLV.pcf: line 29, column 44
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      exposure.CoverageType = (__VALUE_TO_SET as typekey.CoverageType)
    }
    
    // 'onChange' attribute on PostOnChange at ExposureConditionsLV.pcf: line 42, column 33
    function onChange_11 () : void {
      gw.api.assignment.workload.util.WorkloadClassificationUIHelper.validateAndUpdateExposureCondition(exposure)
    }
    
    // 'onChange' attribute on PostOnChange at ExposureConditionsLV.pcf: line 31, column 133
    function onChange_3 () : void {
      gw.api.assignment.workload.util.WorkloadClassificationUIHelper.validateAndUpdateExposureCondition(exposure)
    }
    
    // 'valueRange' attribute on RangeCell (id=CoverageType) at ExposureConditionsLV.pcf: line 29, column 44
    function valueRange_8 () : java.lang.Object {
      return getValidCoverageTypeRange(classification.ClaimPolicyType)
    }
    
    // 'value' attribute on RangeCell (id=CoverageType) at ExposureConditionsLV.pcf: line 29, column 44
    function valueRoot_7 () : java.lang.Object {
      return exposure
    }
    
    // 'value' attribute on TypeKeyCell (id=CoverageSubtype) at ExposureConditionsLV.pcf: line 39, column 47
    function value_12 () : typekey.CoverageSubtype {
      return exposure.CoverageSubType
    }
    
    // 'value' attribute on TypeKeyCell (id=LossPartyType) at ExposureConditionsLV.pcf: line 50, column 46
    function value_16 () : typekey.LossPartyType {
      return exposure.LossPartyType
    }
    
    // 'value' attribute on RangeCell (id=CoverageType) at ExposureConditionsLV.pcf: line 29, column 44
    function value_4 () : typekey.CoverageType {
      return exposure.CoverageType
    }
    
    // 'valueRange' attribute on RangeCell (id=CoverageType) at ExposureConditionsLV.pcf: line 29, column 44
    function verifyValueRangeIsAllowedType_9 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=CoverageType) at ExposureConditionsLV.pcf: line 29, column 44
    function verifyValueRangeIsAllowedType_9 ($$arg :  typekey.CoverageType[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=CoverageType) at ExposureConditionsLV.pcf: line 29, column 44
    function verifyValueRange_10 () : void {
      var __valueRangeArg = getValidCoverageTypeRange(classification.ClaimPolicyType)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_9(__valueRangeArg)
    }
    
    property get exposure () : entity.ExposureConditionFilter {
      return getIteratedValue(1) as entity.ExposureConditionFilter
    }
    
    
  }
  
  
}