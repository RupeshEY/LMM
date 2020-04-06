package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentItem/VehAssessItemDetailsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class VehAssessItemDetailsDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentItem/VehAssessItemDetailsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VehAssessItemDetailsDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyInput (id=Action) at VehAssessItemDetailsDV.pcf: line 30, column 47
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      AssessmentItem.Action = (__VALUE_TO_SET as typekey.AssessmentAction)
    }
    
    // 'value' attribute on CurrencyInput (id=EstimateAmount) at VehAssessItemDetailsDV.pcf: line 35, column 48
    function defaultSetter_14 (__VALUE_TO_SET :  java.lang.Object) : void {
      AssessmentItem.EstimateAmount = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on TypeKeyInput (id=Category) at VehAssessItemDetailsDV.pcf: line 18, column 54
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      AssessmentItem.VehicleCategory = (__VALUE_TO_SET as typekey.VehicleLineItemCategory)
    }
    
    // 'value' attribute on TextInput (id=Comment) at VehAssessItemDetailsDV.pcf: line 44, column 45
    function defaultSetter_21 (__VALUE_TO_SET :  java.lang.Object) : void {
      AssessmentItem.ItemComment = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on RangeInput (id=AssessmentSource) at VehAssessItemDetailsDV.pcf: line 51, column 46
    function defaultSetter_25 (__VALUE_TO_SET :  java.lang.Object) : void {
      AssessmentItem.AssessmentSource = (__VALUE_TO_SET as entity.AssessmentSource)
    }
    
    // 'value' attribute on TextInput (id=Description) at VehAssessItemDetailsDV.pcf: line 24, column 45
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      AssessmentItem.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'valueRange' attribute on RangeInput (id=AssessmentSource) at VehAssessItemDetailsDV.pcf: line 51, column 46
    function valueRange_27 () : java.lang.Object {
      return AssessmentItem.Incident.SourceLine
    }
    
    // 'value' attribute on TypeKeyInput (id=Category) at VehAssessItemDetailsDV.pcf: line 18, column 54
    function valueRoot_3 () : java.lang.Object {
      return AssessmentItem
    }
    
    // 'value' attribute on TypeKeyInput (id=Category) at VehAssessItemDetailsDV.pcf: line 18, column 54
    function value_0 () : typekey.VehicleLineItemCategory {
      return AssessmentItem.VehicleCategory
    }
    
    // 'value' attribute on CurrencyInput (id=EstimateAmount) at VehAssessItemDetailsDV.pcf: line 35, column 48
    function value_12 () : gw.api.financials.CurrencyAmount {
      return AssessmentItem.EstimateAmount
    }
    
    // 'value' attribute on DateInput (id=CreateTime) at VehAssessItemDetailsDV.pcf: line 39, column 44
    function value_16 () : java.util.Date {
      return AssessmentItem.CreateTime
    }
    
    // 'value' attribute on TextInput (id=Comment) at VehAssessItemDetailsDV.pcf: line 44, column 45
    function value_19 () : java.lang.String {
      return AssessmentItem.ItemComment
    }
    
    // 'value' attribute on RangeInput (id=AssessmentSource) at VehAssessItemDetailsDV.pcf: line 51, column 46
    function value_23 () : entity.AssessmentSource {
      return AssessmentItem.AssessmentSource
    }
    
    // 'value' attribute on TextInput (id=Description) at VehAssessItemDetailsDV.pcf: line 24, column 45
    function value_4 () : java.lang.String {
      return AssessmentItem.Description
    }
    
    // 'value' attribute on TypeKeyInput (id=Action) at VehAssessItemDetailsDV.pcf: line 30, column 47
    function value_8 () : typekey.AssessmentAction {
      return AssessmentItem.Action
    }
    
    // 'valueRange' attribute on RangeInput (id=AssessmentSource) at VehAssessItemDetailsDV.pcf: line 51, column 46
    function verifyValueRangeIsAllowedType_28 ($$arg :  entity.AssessmentSource[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=AssessmentSource) at VehAssessItemDetailsDV.pcf: line 51, column 46
    function verifyValueRangeIsAllowedType_28 ($$arg :  gw.api.database.IQueryBeanResult<entity.AssessmentSource>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=AssessmentSource) at VehAssessItemDetailsDV.pcf: line 51, column 46
    function verifyValueRangeIsAllowedType_28 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=AssessmentSource) at VehAssessItemDetailsDV.pcf: line 51, column 46
    function verifyValueRange_29 () : void {
      var __valueRangeArg = AssessmentItem.Incident.SourceLine
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_28(__valueRangeArg)
    }
    
    property get AssessmentItem () : AssessmentItem {
      return getRequireValue("AssessmentItem", 0) as AssessmentItem
    }
    
    property set AssessmentItem ($arg :  AssessmentItem) {
      setRequireValue("AssessmentItem", 0, $arg)
    }
    
    
  }
  
  
}