package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/check/CheckRecurrenceInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CheckRecurrenceInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newtransaction/check/CheckRecurrenceInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CheckRecurrenceInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at CheckRecurrenceInputSet.pcf: line 28, column 47
    function def_onEnter_12 (def :  pcf.CheckRecurrenceDetailInputSet_monthly) : void {
      def.onEnter(check, recurrenceHelper)
    }
    
    // 'def' attribute on InputSetRef at CheckRecurrenceInputSet.pcf: line 28, column 47
    function def_onEnter_14 (def :  pcf.CheckRecurrenceDetailInputSet_single) : void {
      def.onEnter(check, recurrenceHelper)
    }
    
    // 'def' attribute on InputSetRef at CheckRecurrenceInputSet.pcf: line 28, column 47
    function def_onEnter_16 (def :  pcf.CheckRecurrenceDetailInputSet_weekly) : void {
      def.onEnter(check, recurrenceHelper)
    }
    
    // 'def' attribute on InputSetRef at CheckRecurrenceInputSet.pcf: line 28, column 47
    function def_refreshVariables_13 (def :  pcf.CheckRecurrenceDetailInputSet_monthly) : void {
      def.refreshVariables(check, recurrenceHelper)
    }
    
    // 'def' attribute on InputSetRef at CheckRecurrenceInputSet.pcf: line 28, column 47
    function def_refreshVariables_15 (def :  pcf.CheckRecurrenceDetailInputSet_single) : void {
      def.refreshVariables(check, recurrenceHelper)
    }
    
    // 'def' attribute on InputSetRef at CheckRecurrenceInputSet.pcf: line 28, column 47
    function def_refreshVariables_17 (def :  pcf.CheckRecurrenceDetailInputSet_weekly) : void {
      def.refreshVariables(check, recurrenceHelper)
    }
    
    // 'value' attribute on RangeInput (id=RecurrenceType) at CheckRecurrenceInputSet.pcf: line 23, column 42
    function defaultSetter_7 (__VALUE_TO_SET :  java.lang.Object) : void {
      recurrenceHelper.RecurrenceType = (__VALUE_TO_SET as gw.financials.CheckRecurrenceType)
    }
    
    // 'editable' attribute on RangeInput (id=RecurrenceType) at CheckRecurrenceInputSet.pcf: line 23, column 42
    function editable_1 () : java.lang.Boolean {
      return !check.CheckSet.Approved
    }
    
    // 'initialValue' attribute on Variable at CheckRecurrenceInputSet.pcf: line 13, column 53
    function initialValue_0 () : gw.financials.CheckRecurrenceUIHelper {
      return new gw.financials.CheckRecurrenceUIHelper(check)
    }
    
    // 'mode' attribute on InputSetRef at CheckRecurrenceInputSet.pcf: line 28, column 47
    function mode_18 () : java.lang.Object {
      return recurrenceHelper.RecurrenceType
    }
    
    // 'valueRange' attribute on RangeInput (id=RecurrenceType) at CheckRecurrenceInputSet.pcf: line 23, column 42
    function valueRange_9 () : java.lang.Object {
      return recurrenceHelper.RecurrenceTypes
    }
    
    // 'value' attribute on RangeInput (id=RecurrenceType) at CheckRecurrenceInputSet.pcf: line 23, column 42
    function valueRoot_8 () : java.lang.Object {
      return recurrenceHelper
    }
    
    // 'value' attribute on RangeInput (id=RecurrenceType) at CheckRecurrenceInputSet.pcf: line 23, column 42
    function value_3 () : gw.financials.CheckRecurrenceType {
      return recurrenceHelper.RecurrenceType
    }
    
    // 'valueRange' attribute on RangeInput (id=RecurrenceType) at CheckRecurrenceInputSet.pcf: line 23, column 42
    function verifyValueRangeIsAllowedType_10 ($$arg :  gw.financials.CheckRecurrenceType[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=RecurrenceType) at CheckRecurrenceInputSet.pcf: line 23, column 42
    function verifyValueRangeIsAllowedType_10 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=RecurrenceType) at CheckRecurrenceInputSet.pcf: line 23, column 42
    function verifyValueRange_11 () : void {
      var __valueRangeArg = recurrenceHelper.RecurrenceTypes
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_10(__valueRangeArg)
    }
    
    // 'visible' attribute on RangeInput (id=RecurrenceType) at CheckRecurrenceInputSet.pcf: line 23, column 42
    function visible_2 () : java.lang.Boolean {
      return recurrenceHelper.Visible
    }
    
    property get check () : Check {
      return getRequireValue("check", 0) as Check
    }
    
    property set check ($arg :  Check) {
      setRequireValue("check", 0, $arg)
    }
    
    property get recurrenceHelper () : gw.financials.CheckRecurrenceUIHelper {
      return getVariableValue("recurrenceHelper", 0) as gw.financials.CheckRecurrenceUIHelper
    }
    
    property set recurrenceHelper ($arg :  gw.financials.CheckRecurrenceUIHelper) {
      setVariableValue("recurrenceHelper", 0, $arg)
    }
    
    
  }
  
  
}