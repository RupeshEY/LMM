package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/check/CheckRecurrenceDetailInputSet.single.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CheckRecurrenceDetailInputSet_singleExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newtransaction/check/CheckRecurrenceDetailInputSet.single.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CheckRecurrenceDetailInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on DateInput (id=ScheduledSendDate) at CheckRecurrenceDetailInputSet.single.pcf: line 21, column 40
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      check.ScheduledSendDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'editable' attribute on InputSet (id=CheckRecurrenceDetailInputSet) at CheckRecurrenceDetailInputSet.single.pcf: line 8, column 19
    function editable_6 () : java.lang.Boolean {
      return check.New
    }
    
    // 'validationExpression' attribute on DateInput (id=ScheduledSendDate) at CheckRecurrenceDetailInputSet.single.pcf: line 21, column 40
    function validationExpression_0 () : java.lang.Object {
      return check.New and check.ScheduledSendDate.before(java.util.Date.Today) ? DisplayKey.get("Java.Validation.Date.ForbidPast") : null
    }
    
    // 'value' attribute on DateInput (id=ScheduledSendDate) at CheckRecurrenceDetailInputSet.single.pcf: line 21, column 40
    function valueRoot_5 () : java.lang.Object {
      return check
    }
    
    // 'value' attribute on DateInput (id=ScheduledSendDate) at CheckRecurrenceDetailInputSet.single.pcf: line 21, column 40
    function value_1 () : java.util.Date {
      return check.ScheduledSendDate
    }
    
    property get check () : Check {
      return getRequireValue("check", 0) as Check
    }
    
    property set check ($arg :  Check) {
      setRequireValue("check", 0, $arg)
    }
    
    property get checkRecurrence () : gw.financials.CheckRecurrenceUIHelper {
      return getRequireValue("checkRecurrence", 0) as gw.financials.CheckRecurrenceUIHelper
    }
    
    property set checkRecurrence ($arg :  gw.financials.CheckRecurrenceUIHelper) {
      setRequireValue("checkRecurrence", 0, $arg)
    }
    
    
  }
  
  
}