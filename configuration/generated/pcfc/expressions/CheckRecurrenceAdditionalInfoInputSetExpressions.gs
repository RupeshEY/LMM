package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/check/CheckRecurrenceAdditionalInfoInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CheckRecurrenceAdditionalInfoInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newtransaction/check/CheckRecurrenceAdditionalInfoInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CheckRecurrenceAdditionalInfoInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextInput (id=TotalNumOfChecks) at CheckRecurrenceAdditionalInfoInputSet.pcf: line 18, column 37
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      recurrenceHelper.CheckRecurrence.NumChecks = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'validationExpression' attribute on TextInput (id=TotalNumOfChecks) at CheckRecurrenceAdditionalInfoInputSet.pcf: line 18, column 37
    function validationExpression_0 () : java.lang.Object {
      if(recurrenceHelper.CheckRecurrence.NumChecks < 2) {return DisplayKey.get("Wizard.NewCheckWizard.CheckInstructions.Recurrence.AdditionalInfo.NumChecks.LessThanTwo")} else return null
    }
    
    // 'value' attribute on TextInput (id=TotalNumOfChecks) at CheckRecurrenceAdditionalInfoInputSet.pcf: line 18, column 37
    function valueRoot_5 () : java.lang.Object {
      return recurrenceHelper.CheckRecurrence
    }
    
    // 'value' attribute on CurrencyInput (id=TotalRecurrenceAmount) at CheckRecurrenceAdditionalInfoInputSet.pcf: line 26, column 57
    function valueRoot_8 () : java.lang.Object {
      return recurrenceHelper
    }
    
    // 'value' attribute on TextInput (id=TotalNumOfChecks) at CheckRecurrenceAdditionalInfoInputSet.pcf: line 18, column 37
    function value_1 () : java.lang.Integer {
      return recurrenceHelper.CheckRecurrence.NumChecks
    }
    
    // 'value' attribute on CurrencyInput (id=TotalRecurrenceAmount) at CheckRecurrenceAdditionalInfoInputSet.pcf: line 26, column 57
    function value_6 () : gw.api.financials.CurrencyAmountPair {
      return recurrenceHelper.TotalAmount
    }
    
    property get recurrenceHelper () : gw.financials.CheckRecurrenceUIHelper {
      return getRequireValue("recurrenceHelper", 0) as gw.financials.CheckRecurrenceUIHelper
    }
    
    property set recurrenceHelper ($arg :  gw.financials.CheckRecurrenceUIHelper) {
      setRequireValue("recurrenceHelper", 0, $arg)
    }
    
    
  }
  
  
}