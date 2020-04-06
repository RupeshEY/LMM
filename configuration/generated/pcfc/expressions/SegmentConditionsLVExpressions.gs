package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/workload/conditions/SegmentConditionsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class SegmentConditionsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/workload/conditions/SegmentConditionsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends SegmentConditionsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RangeCell (id=SegmentType) at SegmentConditionsLV.pcf: line 29, column 44
    function defaultSetter_3 (__VALUE_TO_SET :  java.lang.Object) : void {
      segment.Segment = (__VALUE_TO_SET as typekey.ClaimSegment)
    }
    
    // 'valueRange' attribute on RangeCell (id=SegmentType) at SegmentConditionsLV.pcf: line 29, column 44
    function valueRange_5 () : java.lang.Object {
      return getValidClaimSegmentRange(classification.ClaimLossType)
    }
    
    // 'value' attribute on RangeCell (id=SegmentType) at SegmentConditionsLV.pcf: line 29, column 44
    function valueRoot_4 () : java.lang.Object {
      return segment
    }
    
    // 'value' attribute on RangeCell (id=SegmentType) at SegmentConditionsLV.pcf: line 29, column 44
    function value_1 () : typekey.ClaimSegment {
      return segment.Segment
    }
    
    // 'valueRange' attribute on RangeCell (id=SegmentType) at SegmentConditionsLV.pcf: line 29, column 44
    function verifyValueRangeIsAllowedType_6 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=SegmentType) at SegmentConditionsLV.pcf: line 29, column 44
    function verifyValueRangeIsAllowedType_6 ($$arg :  typekey.ClaimSegment[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=SegmentType) at SegmentConditionsLV.pcf: line 29, column 44
    function verifyValueRange_7 () : void {
      var __valueRangeArg = getValidClaimSegmentRange(classification.ClaimLossType)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_6(__valueRangeArg)
    }
    
    property get segment () : entity.SegmentConditionFilter {
      return getIteratedValue(1) as entity.SegmentConditionFilter
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/workload/conditions/SegmentConditionsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SegmentConditionsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at SegmentConditionsLV.pcf: line 29, column 44
    function sortValue_0 (segment :  entity.SegmentConditionFilter) : java.lang.Object {
      return segment.Segment
    }
    
    // 'toAdd' attribute on RowIterator at SegmentConditionsLV.pcf: line 20, column 51
    function toAdd_8 (segment :  entity.SegmentConditionFilter) : void {
      classification.SegmentCondition.addToConditionFilters(segment)
    }
    
    // 'toRemove' attribute on RowIterator at SegmentConditionsLV.pcf: line 20, column 51
    function toRemove_9 (segment :  entity.SegmentConditionFilter) : void {
      classification.SegmentCondition.removeFromConditionFilters(segment)
    }
    
    // 'value' attribute on RowIterator at SegmentConditionsLV.pcf: line 20, column 51
    function value_10 () : entity.SegmentConditionFilter[] {
      return classification.SegmentCondition.ConditionFilters
    }
    
    property get classification () : WorkloadClassification {
      return getRequireValue("classification", 0) as WorkloadClassification
    }
    
    property set classification ($arg :  WorkloadClassification) {
      setRequireValue("classification", 0, $arg)
    }
    
    function getValidClaimSegmentRange(lossType : LossType) : java.util.List<ClaimSegment> {
      var codes = ClaimSegment.getTypeKeys(false)
      if (lossType != null) {
        codes = codes.where(\ claimSegment ->claimSegment.hasCategory(lossType))
      }
      return codes
    }
    
    
  }
  
  
}