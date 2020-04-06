package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/specialhandling/AutomatedHandlerTriggerInputSet.financialthresholdtrigger.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AutomatedHandlerTriggerInputSet_financialthresholdtriggerExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/specialhandling/AutomatedHandlerTriggerInputSet.financialthresholdtrigger.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AutomatedHandlerTriggerInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyInput (id=Currency) at AutomatedHandlerTriggerInputSet.financialthresholdtrigger.pcf: line 37, column 64
    function defaultSetter_15 (__VALUE_TO_SET :  java.lang.Object) : void {
      trigger.Currency = (__VALUE_TO_SET as typekey.Currency)
    }
    
    // 'value' attribute on CurrencyInput (id=Amount) at AutomatedHandlerTriggerInputSet.financialthresholdtrigger.pcf: line 46, column 40
    function defaultSetter_21 (__VALUE_TO_SET :  java.lang.Object) : void {
      trigger.ThresholdAmount = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on RangeInput (id=AutomatedHandlerFinancialThreshold) at AutomatedHandlerTriggerInputSet.financialthresholdtrigger.pcf: line 23, column 47
    function defaultSetter_3 (__VALUE_TO_SET :  java.lang.Object) : void {
      trigger.FinancialThreshold = (__VALUE_TO_SET as typekey.FinancialThreshold)
    }
    
    // 'initialValue' attribute on Variable at AutomatedHandlerTriggerInputSet.financialthresholdtrigger.pcf: line 14, column 41
    function initialValue_0 () : FinancialThresholdTrigger {
      return automatedHandler.Trigger as FinancialThresholdTrigger
    }
    
    // 'validationExpression' attribute on CurrencyInput (id=Amount) at AutomatedHandlerTriggerInputSet.financialthresholdtrigger.pcf: line 46, column 40
    function validationExpression_17 () : java.lang.Object {
      return trigger.ThresholdAmount.Amount >= 0 ? null : DisplayKey.get("Web.Admin.AutomatedHandlerTrigger.FinancialThreshold.ThresholdAmount.ValidationError.NotPositive")
    }
    
    // 'valueRange' attribute on RangeInput (id=AutomatedHandlerFinancialThreshold) at AutomatedHandlerTriggerInputSet.financialthresholdtrigger.pcf: line 23, column 47
    function valueRange_5 () : java.lang.Object {
      return FinancialThreshold.getTypeKeys(false)
    }
    
    // 'value' attribute on RangeInput (id=AutomatedHandlerFinancialThreshold) at AutomatedHandlerTriggerInputSet.financialthresholdtrigger.pcf: line 23, column 47
    function valueRoot_4 () : java.lang.Object {
      return trigger
    }
    
    // 'value' attribute on RangeInput (id=AutomatedHandlerFinancialThreshold) at AutomatedHandlerTriggerInputSet.financialthresholdtrigger.pcf: line 23, column 47
    function value_1 () : typekey.FinancialThreshold {
      return trigger.FinancialThreshold
    }
    
    // 'value' attribute on TypeKeyInput (id=Currency) at AutomatedHandlerTriggerInputSet.financialthresholdtrigger.pcf: line 37, column 64
    function value_12 () : typekey.Currency {
      return trigger.Currency
    }
    
    // 'value' attribute on CurrencyInput (id=Amount) at AutomatedHandlerTriggerInputSet.financialthresholdtrigger.pcf: line 46, column 40
    function value_18 () : gw.api.financials.CurrencyAmount {
      return trigger.ThresholdAmount
    }
    
    // 'value' attribute on TextInput (id=Cause) at AutomatedHandlerTriggerInputSet.financialthresholdtrigger.pcf: line 29, column 50
    function value_8 () : typekey.FinancialTriggerCause {
      return trigger.TriggeringCause
    }
    
    // 'valueRange' attribute on RangeInput (id=AutomatedHandlerFinancialThreshold) at AutomatedHandlerTriggerInputSet.financialthresholdtrigger.pcf: line 23, column 47
    function verifyValueRangeIsAllowedType_6 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=AutomatedHandlerFinancialThreshold) at AutomatedHandlerTriggerInputSet.financialthresholdtrigger.pcf: line 23, column 47
    function verifyValueRangeIsAllowedType_6 ($$arg :  typekey.FinancialThreshold[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=AutomatedHandlerFinancialThreshold) at AutomatedHandlerTriggerInputSet.financialthresholdtrigger.pcf: line 23, column 47
    function verifyValueRange_7 () : void {
      var __valueRangeArg = FinancialThreshold.getTypeKeys(false)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_6(__valueRangeArg)
    }
    
    // 'visible' attribute on TypeKeyInput (id=Currency) at AutomatedHandlerTriggerInputSet.financialthresholdtrigger.pcf: line 37, column 64
    function visible_11 () : java.lang.Boolean {
      return gw.api.util.CurrencyUtil.isMultiCurrencyMode()
    }
    
    property get automatedHandler () : AutomatedHandler {
      return getRequireValue("automatedHandler", 0) as AutomatedHandler
    }
    
    property set automatedHandler ($arg :  AutomatedHandler) {
      setRequireValue("automatedHandler", 0, $arg)
    }
    
    property get trigger () : FinancialThresholdTrigger {
      return getVariableValue("trigger", 0) as FinancialThresholdTrigger
    }
    
    property set trigger ($arg :  FinancialThresholdTrigger) {
      setVariableValue("trigger", 0, $arg)
    }
    
    
  }
  
  
}