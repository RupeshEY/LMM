package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentContentItem/FixPropContentItemDetailsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FixPropContentItemDetailsDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentContentItem/FixPropContentItemDetailsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FixPropContentItemDetailsDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextInput (id=NumberOfItems) at FixPropContentItemDetailsDV.pcf: line 30, column 40
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      AssessmentContentItem.NumberOfItems = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on TextInput (id=Brand) at FixPropContentItemDetailsDV.pcf: line 35, column 46
    function defaultSetter_14 (__VALUE_TO_SET :  java.lang.Object) : void {
      AssessmentContentItem.Brand = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=Description) at FixPropContentItemDetailsDV.pcf: line 41, column 52
    function defaultSetter_18 (__VALUE_TO_SET :  java.lang.Object) : void {
      AssessmentContentItem.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Schedule) at FixPropContentItemDetailsDV.pcf: line 18, column 54
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      AssessmentContentItem.ContentSchedule = (__VALUE_TO_SET as typekey.ContentLineItemSchedule)
    }
    
    // 'value' attribute on DateInput (id=DateAcquired) at FixPropContentItemDetailsDV.pcf: line 46, column 53
    function defaultSetter_22 (__VALUE_TO_SET :  java.lang.Object) : void {
      AssessmentContentItem.DateAcquired = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TypeKeyInput (id=Action) at FixPropContentItemDetailsDV.pcf: line 52, column 54
    function defaultSetter_26 (__VALUE_TO_SET :  java.lang.Object) : void {
      AssessmentContentItem.Action = (__VALUE_TO_SET as typekey.AssessmentContentAction)
    }
    
    // 'value' attribute on RangeInput (id=AssessmentSource) at FixPropContentItemDetailsDV.pcf: line 59, column 46
    function defaultSetter_30 (__VALUE_TO_SET :  java.lang.Object) : void {
      AssessmentContentItem.AssessmentSource = (__VALUE_TO_SET as entity.AssessmentSource)
    }
    
    // 'value' attribute on TextInput (id=Comment) at FixPropContentItemDetailsDV.pcf: line 68, column 52
    function defaultSetter_40 (__VALUE_TO_SET :  java.lang.Object) : void {
      AssessmentContentItem.ItemComment = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on CurrencyInput (id=PurchaseCost) at FixPropContentItemDetailsDV.pcf: line 77, column 52
    function defaultSetter_44 (__VALUE_TO_SET :  java.lang.Object) : void {
      AssessmentContentItem.PurchaseCost = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on CurrencyInput (id=Depreciation) at FixPropContentItemDetailsDV.pcf: line 85, column 52
    function defaultSetter_48 (__VALUE_TO_SET :  java.lang.Object) : void {
      AssessmentContentItem.Depreciation = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on CurrencyInput (id=Salvage) at FixPropContentItemDetailsDV.pcf: line 93, column 47
    function defaultSetter_52 (__VALUE_TO_SET :  java.lang.Object) : void {
      AssessmentContentItem.Salvage = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on TypeKeyInput (id=Category) at FixPropContentItemDetailsDV.pcf: line 24, column 54
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      AssessmentContentItem.ContentCategory = (__VALUE_TO_SET as typekey.ContentLineItemCategory)
    }
    
    // 'valueRange' attribute on RangeInput (id=AssessmentSource) at FixPropContentItemDetailsDV.pcf: line 59, column 46
    function valueRange_32 () : java.lang.Object {
      return AssessmentContentItem.Incident.SourceLine
    }
    
    // 'value' attribute on TypeKeyInput (id=Schedule) at FixPropContentItemDetailsDV.pcf: line 18, column 54
    function valueRoot_3 () : java.lang.Object {
      return AssessmentContentItem
    }
    
    // 'value' attribute on TypeKeyInput (id=Schedule) at FixPropContentItemDetailsDV.pcf: line 18, column 54
    function value_0 () : typekey.ContentLineItemSchedule {
      return AssessmentContentItem.ContentSchedule
    }
    
    // 'value' attribute on TextInput (id=Brand) at FixPropContentItemDetailsDV.pcf: line 35, column 46
    function value_12 () : java.lang.String {
      return AssessmentContentItem.Brand
    }
    
    // 'value' attribute on TextInput (id=Description) at FixPropContentItemDetailsDV.pcf: line 41, column 52
    function value_16 () : java.lang.String {
      return AssessmentContentItem.Description
    }
    
    // 'value' attribute on DateInput (id=DateAcquired) at FixPropContentItemDetailsDV.pcf: line 46, column 53
    function value_20 () : java.util.Date {
      return AssessmentContentItem.DateAcquired
    }
    
    // 'value' attribute on TypeKeyInput (id=Action) at FixPropContentItemDetailsDV.pcf: line 52, column 54
    function value_24 () : typekey.AssessmentContentAction {
      return AssessmentContentItem.Action
    }
    
    // 'value' attribute on RangeInput (id=AssessmentSource) at FixPropContentItemDetailsDV.pcf: line 59, column 46
    function value_28 () : entity.AssessmentSource {
      return AssessmentContentItem.AssessmentSource
    }
    
    // 'value' attribute on DateInput (id=CreateTime) at FixPropContentItemDetailsDV.pcf: line 63, column 51
    function value_35 () : java.util.Date {
      return AssessmentContentItem.CreateTime
    }
    
    // 'value' attribute on TextInput (id=Comment) at FixPropContentItemDetailsDV.pcf: line 68, column 52
    function value_38 () : java.lang.String {
      return AssessmentContentItem.ItemComment
    }
    
    // 'value' attribute on TypeKeyInput (id=Category) at FixPropContentItemDetailsDV.pcf: line 24, column 54
    function value_4 () : typekey.ContentLineItemCategory {
      return AssessmentContentItem.ContentCategory
    }
    
    // 'value' attribute on CurrencyInput (id=PurchaseCost) at FixPropContentItemDetailsDV.pcf: line 77, column 52
    function value_42 () : gw.api.financials.CurrencyAmount {
      return AssessmentContentItem.PurchaseCost
    }
    
    // 'value' attribute on CurrencyInput (id=Depreciation) at FixPropContentItemDetailsDV.pcf: line 85, column 52
    function value_46 () : gw.api.financials.CurrencyAmount {
      return AssessmentContentItem.Depreciation
    }
    
    // 'value' attribute on CurrencyInput (id=Salvage) at FixPropContentItemDetailsDV.pcf: line 93, column 47
    function value_50 () : gw.api.financials.CurrencyAmount {
      return AssessmentContentItem.Salvage
    }
    
    // 'value' attribute on CurrencyInput (id=ItemValue) at FixPropContentItemDetailsDV.pcf: line 102, column 59
    function value_54 () : gw.api.financials.CurrencyAmount {
      return AssessmentContentItem.contentItemValue()
    }
    
    // 'value' attribute on TextInput (id=NumberOfItems) at FixPropContentItemDetailsDV.pcf: line 30, column 40
    function value_8 () : java.lang.Integer {
      return AssessmentContentItem.NumberOfItems
    }
    
    // 'valueRange' attribute on RangeInput (id=AssessmentSource) at FixPropContentItemDetailsDV.pcf: line 59, column 46
    function verifyValueRangeIsAllowedType_33 ($$arg :  entity.AssessmentSource[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=AssessmentSource) at FixPropContentItemDetailsDV.pcf: line 59, column 46
    function verifyValueRangeIsAllowedType_33 ($$arg :  gw.api.database.IQueryBeanResult<entity.AssessmentSource>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=AssessmentSource) at FixPropContentItemDetailsDV.pcf: line 59, column 46
    function verifyValueRangeIsAllowedType_33 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=AssessmentSource) at FixPropContentItemDetailsDV.pcf: line 59, column 46
    function verifyValueRange_34 () : void {
      var __valueRangeArg = AssessmentContentItem.Incident.SourceLine
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_33(__valueRangeArg)
    }
    
    property get AssessmentContentItem () : AssessmentContentItem {
      return getRequireValue("AssessmentContentItem", 0) as AssessmentContentItem
    }
    
    property set AssessmentContentItem ($arg :  AssessmentContentItem) {
      setRequireValue("AssessmentContentItem", 0, $arg)
    }
    
    
  }
  
  
}