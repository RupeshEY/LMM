package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentItem/FixPropAssessItemLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FixPropAssessItemLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentItem/FixPropAssessItemLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FixPropAssessItemLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'pickLocation' attribute on RowIterator at FixPropAssessItemLV.pcf: line 21, column 43
    function pickLocation_33 () : void {
      NewFixPropAssessItemPopup.push(FixedPropertyIncident)
    }
    
    // 'value' attribute on RowIterator at FixPropAssessItemLV.pcf: line 27, column 57
    function sortValue_0 (AssessmentItem :  entity.AssessmentItem) : java.lang.Object {
      return AssessmentItem.PropertyCategory
    }
    
    // 'value' attribute on RowIterator at FixPropAssessItemLV.pcf: line 34, column 24
    function sortValue_1 (AssessmentItem :  entity.AssessmentItem) : java.lang.Object {
      return AssessmentItem.Description
    }
    
    // 'value' attribute on RowIterator at FixPropAssessItemLV.pcf: line 40, column 49
    function sortValue_2 (AssessmentItem :  entity.AssessmentItem) : java.lang.Object {
      return AssessmentItem.Action
    }
    
    // 'value' attribute on RowIterator at FixPropAssessItemLV.pcf: line 47, column 27
    function sortValue_3 (AssessmentItem :  entity.AssessmentItem) : java.lang.Object {
      return AssessmentItem.EstimateAmount
    }
    
    // 'value' attribute on RowIterator at FixPropAssessItemLV.pcf: line 58, column 24
    function sortValue_4 (AssessmentItem :  entity.AssessmentItem) : java.lang.Object {
      return AssessmentItem.ItemComment
    }
    
    // 'value' attribute on RowIterator at FixPropAssessItemLV.pcf: line 65, column 48
    function sortValue_5 (AssessmentItem :  entity.AssessmentItem) : java.lang.Object {
      return AssessmentItem.AssessmentSource
    }
    
    // 'toAdd' attribute on RowIterator at FixPropAssessItemLV.pcf: line 21, column 43
    function toAdd_34 (AssessmentItem :  entity.AssessmentItem) : void {
      FixedPropertyIncident.addToItemLine(AssessmentItem)
    }
    
    // 'toRemove' attribute on RowIterator at FixPropAssessItemLV.pcf: line 21, column 43
    function toRemove_35 (AssessmentItem :  entity.AssessmentItem) : void {
      FixedPropertyIncident.removeFromItemLine(AssessmentItem)
    }
    
    // 'value' attribute on RowIterator at FixPropAssessItemLV.pcf: line 21, column 43
    function value_36 () : entity.AssessmentItem[] {
      return FixedPropertyIncident.ItemLine
    }
    
    property get FixedPropertyIncident () : FixedPropertyIncident {
      return getRequireValue("FixedPropertyIncident", 0) as FixedPropertyIncident
    }
    
    property set FixedPropertyIncident ($arg :  FixedPropertyIncident) {
      setRequireValue("FixedPropertyIncident", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentItem/FixPropAssessItemLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends FixPropAssessItemLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Description) at FixPropAssessItemLV.pcf: line 34, column 24
    function action_10 () : void {
      FixPropAssessItemPopup.push(AssessmentItem)
    }
    
    // 'action' attribute on TextCell (id=Description) at FixPropAssessItemLV.pcf: line 34, column 24
    function action_dest_11 () : pcf.api.Destination {
      return pcf.FixPropAssessItemPopup.createDestination(AssessmentItem)
    }
    
    // 'value' attribute on TypeKeyCell (id=Action) at FixPropAssessItemLV.pcf: line 40, column 49
    function defaultSetter_16 (__VALUE_TO_SET :  java.lang.Object) : void {
      AssessmentItem.Action = (__VALUE_TO_SET as typekey.AssessmentAction)
    }
    
    // 'value' attribute on CurrencyCell (id=EstimateAmount) at FixPropAssessItemLV.pcf: line 47, column 27
    function defaultSetter_20 (__VALUE_TO_SET :  java.lang.Object) : void {
      AssessmentItem.EstimateAmount = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on TextCell (id=Comment) at FixPropAssessItemLV.pcf: line 58, column 24
    function defaultSetter_24 (__VALUE_TO_SET :  java.lang.Object) : void {
      AssessmentItem.ItemComment = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on RangeCell (id=AssessmentSource) at FixPropAssessItemLV.pcf: line 65, column 48
    function defaultSetter_28 (__VALUE_TO_SET :  java.lang.Object) : void {
      AssessmentItem.AssessmentSource = (__VALUE_TO_SET as entity.AssessmentSource)
    }
    
    // 'valueRange' attribute on RangeCell (id=AssessmentSource) at FixPropAssessItemLV.pcf: line 65, column 48
    function valueRange_30 () : java.lang.Object {
      return AssessmentItem.Incident.SourceLine
    }
    
    // 'value' attribute on TypeKeyCell (id=Category) at FixPropAssessItemLV.pcf: line 27, column 57
    function valueRoot_8 () : java.lang.Object {
      return AssessmentItem
    }
    
    // 'value' attribute on TypeKeyCell (id=Action) at FixPropAssessItemLV.pcf: line 40, column 49
    function value_14 () : typekey.AssessmentAction {
      return AssessmentItem.Action
    }
    
    // 'value' attribute on CurrencyCell (id=EstimateAmount) at FixPropAssessItemLV.pcf: line 47, column 27
    function value_18 () : gw.api.financials.CurrencyAmount {
      return AssessmentItem.EstimateAmount
    }
    
    // 'value' attribute on TextCell (id=Comment) at FixPropAssessItemLV.pcf: line 58, column 24
    function value_22 () : java.lang.String {
      return AssessmentItem.ItemComment
    }
    
    // 'value' attribute on RangeCell (id=AssessmentSource) at FixPropAssessItemLV.pcf: line 65, column 48
    function value_26 () : entity.AssessmentSource {
      return AssessmentItem.AssessmentSource
    }
    
    // 'value' attribute on TypeKeyCell (id=Category) at FixPropAssessItemLV.pcf: line 27, column 57
    function value_6 () : typekey.PropertyLineItemCategory {
      return AssessmentItem.PropertyCategory
    }
    
    // 'value' attribute on TextCell (id=Description) at FixPropAssessItemLV.pcf: line 34, column 24
    function value_9 () : java.lang.String {
      return AssessmentItem.Description
    }
    
    // 'valueRange' attribute on RangeCell (id=AssessmentSource) at FixPropAssessItemLV.pcf: line 65, column 48
    function verifyValueRangeIsAllowedType_31 ($$arg :  entity.AssessmentSource[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=AssessmentSource) at FixPropAssessItemLV.pcf: line 65, column 48
    function verifyValueRangeIsAllowedType_31 ($$arg :  gw.api.database.IQueryBeanResult<entity.AssessmentSource>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=AssessmentSource) at FixPropAssessItemLV.pcf: line 65, column 48
    function verifyValueRangeIsAllowedType_31 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=AssessmentSource) at FixPropAssessItemLV.pcf: line 65, column 48
    function verifyValueRange_32 () : void {
      var __valueRangeArg = AssessmentItem.Incident.SourceLine
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_31(__valueRangeArg)
    }
    
    property get AssessmentItem () : entity.AssessmentItem {
      return getIteratedValue(1) as entity.AssessmentItem
    }
    
    
  }
  
  
}