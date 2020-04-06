package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentItem/VehAssessItemLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class VehAssessItemLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentItem/VehAssessItemLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends VehAssessItemLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Description) at VehAssessItemLV.pcf: line 35, column 24
    function action_11 () : void {
      VehAssessItemPopup.push(AssessmentItem)
    }
    
    // 'action' attribute on TextCell (id=Description) at VehAssessItemLV.pcf: line 35, column 24
    function action_dest_12 () : pcf.api.Destination {
      return pcf.VehAssessItemPopup.createDestination(AssessmentItem)
    }
    
    // 'value' attribute on TypeKeyCell (id=Action) at VehAssessItemLV.pcf: line 41, column 49
    function defaultSetter_17 (__VALUE_TO_SET :  java.lang.Object) : void {
      AssessmentItem.Action = (__VALUE_TO_SET as typekey.AssessmentAction)
    }
    
    // 'value' attribute on CurrencyCell (id=EstimateAmount) at VehAssessItemLV.pcf: line 48, column 27
    function defaultSetter_21 (__VALUE_TO_SET :  java.lang.Object) : void {
      AssessmentItem.EstimateAmount = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on TextCell (id=Comment) at VehAssessItemLV.pcf: line 54, column 24
    function defaultSetter_25 (__VALUE_TO_SET :  java.lang.Object) : void {
      AssessmentItem.ItemComment = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on RangeCell (id=AssessmentSource) at VehAssessItemLV.pcf: line 61, column 48
    function defaultSetter_29 (__VALUE_TO_SET :  java.lang.Object) : void {
      AssessmentItem.AssessmentSource = (__VALUE_TO_SET as entity.AssessmentSource)
    }
    
    // 'value' attribute on TypeKeyCell (id=Category) at VehAssessItemLV.pcf: line 28, column 56
    function defaultSetter_8 (__VALUE_TO_SET :  java.lang.Object) : void {
      AssessmentItem.VehicleCategory = (__VALUE_TO_SET as typekey.VehicleLineItemCategory)
    }
    
    // 'valueRange' attribute on RangeCell (id=AssessmentSource) at VehAssessItemLV.pcf: line 61, column 48
    function valueRange_31 () : java.lang.Object {
      return AssessmentItem.Incident.SourceLine
    }
    
    // 'value' attribute on TypeKeyCell (id=Category) at VehAssessItemLV.pcf: line 28, column 56
    function valueRoot_9 () : java.lang.Object {
      return AssessmentItem
    }
    
    // 'value' attribute on TextCell (id=Description) at VehAssessItemLV.pcf: line 35, column 24
    function value_10 () : java.lang.String {
      return AssessmentItem.Description
    }
    
    // 'value' attribute on TypeKeyCell (id=Action) at VehAssessItemLV.pcf: line 41, column 49
    function value_15 () : typekey.AssessmentAction {
      return AssessmentItem.Action
    }
    
    // 'value' attribute on CurrencyCell (id=EstimateAmount) at VehAssessItemLV.pcf: line 48, column 27
    function value_19 () : gw.api.financials.CurrencyAmount {
      return AssessmentItem.EstimateAmount
    }
    
    // 'value' attribute on TextCell (id=Comment) at VehAssessItemLV.pcf: line 54, column 24
    function value_23 () : java.lang.String {
      return AssessmentItem.ItemComment
    }
    
    // 'value' attribute on RangeCell (id=AssessmentSource) at VehAssessItemLV.pcf: line 61, column 48
    function value_27 () : entity.AssessmentSource {
      return AssessmentItem.AssessmentSource
    }
    
    // 'value' attribute on TypeKeyCell (id=Category) at VehAssessItemLV.pcf: line 28, column 56
    function value_6 () : typekey.VehicleLineItemCategory {
      return AssessmentItem.VehicleCategory
    }
    
    // 'valueRange' attribute on RangeCell (id=AssessmentSource) at VehAssessItemLV.pcf: line 61, column 48
    function verifyValueRangeIsAllowedType_32 ($$arg :  entity.AssessmentSource[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=AssessmentSource) at VehAssessItemLV.pcf: line 61, column 48
    function verifyValueRangeIsAllowedType_32 ($$arg :  gw.api.database.IQueryBeanResult<entity.AssessmentSource>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=AssessmentSource) at VehAssessItemLV.pcf: line 61, column 48
    function verifyValueRangeIsAllowedType_32 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=AssessmentSource) at VehAssessItemLV.pcf: line 61, column 48
    function verifyValueRange_33 () : void {
      var __valueRangeArg = AssessmentItem.Incident.SourceLine
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_32(__valueRangeArg)
    }
    
    property get AssessmentItem () : entity.AssessmentItem {
      return getIteratedValue(1) as entity.AssessmentItem
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentItem/VehAssessItemLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VehAssessItemLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'pickLocation' attribute on RowIterator at VehAssessItemLV.pcf: line 21, column 43
    function pickLocation_34 () : void {
      NewVehAssessItemPopup.push(VehicleIncident)
    }
    
    // 'value' attribute on RowIterator at VehAssessItemLV.pcf: line 28, column 56
    function sortValue_0 (AssessmentItem :  entity.AssessmentItem) : java.lang.Object {
      return AssessmentItem.VehicleCategory
    }
    
    // 'value' attribute on RowIterator at VehAssessItemLV.pcf: line 35, column 24
    function sortValue_1 (AssessmentItem :  entity.AssessmentItem) : java.lang.Object {
      return AssessmentItem.Description
    }
    
    // 'value' attribute on RowIterator at VehAssessItemLV.pcf: line 41, column 49
    function sortValue_2 (AssessmentItem :  entity.AssessmentItem) : java.lang.Object {
      return AssessmentItem.Action
    }
    
    // 'value' attribute on RowIterator at VehAssessItemLV.pcf: line 48, column 27
    function sortValue_3 (AssessmentItem :  entity.AssessmentItem) : java.lang.Object {
      return AssessmentItem.EstimateAmount
    }
    
    // 'value' attribute on RowIterator at VehAssessItemLV.pcf: line 54, column 24
    function sortValue_4 (AssessmentItem :  entity.AssessmentItem) : java.lang.Object {
      return AssessmentItem.ItemComment
    }
    
    // 'value' attribute on RowIterator at VehAssessItemLV.pcf: line 61, column 48
    function sortValue_5 (AssessmentItem :  entity.AssessmentItem) : java.lang.Object {
      return AssessmentItem.AssessmentSource
    }
    
    // 'toAdd' attribute on RowIterator at VehAssessItemLV.pcf: line 21, column 43
    function toAdd_35 (AssessmentItem :  entity.AssessmentItem) : void {
      VehicleIncident.addToItemLine(AssessmentItem)
    }
    
    // 'toRemove' attribute on RowIterator at VehAssessItemLV.pcf: line 21, column 43
    function toRemove_36 (AssessmentItem :  entity.AssessmentItem) : void {
      VehicleIncident.removeFromItemLine(AssessmentItem)
    }
    
    // 'value' attribute on RowIterator at VehAssessItemLV.pcf: line 21, column 43
    function value_37 () : entity.AssessmentItem[] {
      return VehicleIncident.ItemLine
    }
    
    property get VehicleIncident () : VehicleIncident {
      return getRequireValue("VehicleIncident", 0) as VehicleIncident
    }
    
    property set VehicleIncident ($arg :  VehicleIncident) {
      setRequireValue("VehicleIncident", 0, $arg)
    }
    
    
  }
  
  
}