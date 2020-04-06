package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/checks/VoidStopCheckDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class VoidStopCheckDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/checks/VoidStopCheckDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VoidStopCheckDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on ListViewInput at VoidStopCheckDV.pcf: line 52, column 27
    function def_onEnter_22 (def :  pcf.CheckSummaryPaymentsLV) : void {
      def.onEnter(Check.Payments)
    }
    
    // 'def' attribute on ListViewInput at VoidStopCheckDV.pcf: line 52, column 27
    function def_refreshVariables_23 (def :  pcf.CheckSummaryPaymentsLV) : void {
      def.refreshVariables(Check.Payments)
    }
    
    // 'value' attribute on TextInput (id=Comments) at VoidStopCheckDV.pcf: line 17, column 33
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      Check.Comments = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=CreateUser) at VoidStopCheckDV.pcf: line 41, column 55
    function valueRoot_18 () : java.lang.Object {
      return Check.CreateUser.Contact
    }
    
    // 'value' attribute on TextInput (id=Comments) at VoidStopCheckDV.pcf: line 17, column 33
    function valueRoot_3 () : java.lang.Object {
      return Check
    }
    
    // 'value' attribute on TextInput (id=Comments) at VoidStopCheckDV.pcf: line 17, column 33
    function value_0 () : java.lang.String {
      return Check.Comments
    }
    
    // 'value' attribute on CurrencyInput (id=GrossAmount) at VoidStopCheckDV.pcf: line 33, column 59
    function value_10 () : gw.api.financials.CurrencyAmountPair {
      return Check.GrossAmountPair
    }
    
    // 'value' attribute on DateInput (id=IssueDate) at VoidStopCheckDV.pcf: line 37, column 34
    function value_13 () : java.util.Date {
      return Check.IssueDate
    }
    
    // 'value' attribute on TextInput (id=CreateUser) at VoidStopCheckDV.pcf: line 41, column 55
    function value_16 () : java.lang.String {
      return Check.CreateUser.Contact.DisplayName
    }
    
    // 'value' attribute on DateInput (id=CreateTime) at VoidStopCheckDV.pcf: line 45, column 35
    function value_19 () : java.util.Date {
      return Check.CreateTime
    }
    
    // 'value' attribute on TextInput (id=PayTo) at VoidStopCheckDV.pcf: line 24, column 30
    function value_4 () : java.lang.String {
      return Check.PayTo
    }
    
    // 'value' attribute on TextInput (id=CheckNumber) at VoidStopCheckDV.pcf: line 28, column 36
    function value_7 () : java.lang.String {
      return Check.CheckNumber
    }
    
    property get Check () : Check {
      return getRequireValue("Check", 0) as Check
    }
    
    property set Check ($arg :  Check) {
      setRequireValue("Check", 0, $arg)
    }
    
    
  }
  
  
}