package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/servicerequests/StatementDV.quoterevision.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class StatementDV_quoterevisionExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/servicerequests/StatementDV.quoterevision.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StatementDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on ListViewInput at StatementDV.quoterevision.pcf: line 55, column 27
    function def_onEnter_26 (def :  pcf.StatementLineItemLV) : void {
      def.onEnter(currentQuote)
    }
    
    // 'def' attribute on ListViewInput at StatementDV.quoterevision.pcf: line 55, column 27
    function def_refreshVariables_27 (def :  pcf.StatementLineItemLV) : void {
      def.refreshVariables(currentQuote)
    }
    
    // 'value' attribute on TextInput (id=DaysToPerformService) at StatementDV.quoterevision.pcf: line 43, column 71
    function defaultSetter_18 (__VALUE_TO_SET :  java.lang.Object) : void {
      (currentQuote as ServiceRequestQuote).ExpectedDaysToPerformService = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at StatementDV.quoterevision.pcf: line 51, column 25
    function defaultSetter_24 (__VALUE_TO_SET :  java.lang.Object) : void {
      currentQuote.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=ReferenceNumber) at StatementDV.quoterevision.pcf: line 27, column 71
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      currentQuote.ReferenceNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'editable' attribute on TextInput (id=ReferenceNumber) at StatementDV.quoterevision.pcf: line 27, column 71
    function editable_0 () : java.lang.Boolean {
      return currentQuote.New
    }
    
    // 'validationExpression' attribute on TextInput (id=DaysToPerformService) at StatementDV.quoterevision.pcf: line 43, column 71
    function validationExpression_11 () : java.lang.Object {
      return ((currentQuote as ServiceRequestQuote).ExpectedDaysToPerformService >= 0) ? null : DisplayKey.get("Web.ServiceRequest.Quote.InvalidNumberOfDaysToPerformService")
    }
    
    // 'value' attribute on TextInput (id=DaysToPerformService) at StatementDV.quoterevision.pcf: line 43, column 71
    function valueRoot_19 () : java.lang.Object {
      return (currentQuote as ServiceRequestQuote)
    }
    
    // 'value' attribute on TextInput (id=ReferenceNumber) at StatementDV.quoterevision.pcf: line 27, column 71
    function valueRoot_7 () : java.lang.Object {
      return currentQuote
    }
    
    // 'value' attribute on TextInput (id=DaysToPerformService) at StatementDV.quoterevision.pcf: line 43, column 71
    function value_13 () : java.lang.Integer {
      return (currentQuote as ServiceRequestQuote).ExpectedDaysToPerformService
    }
    
    // 'value' attribute on TextInput (id=ReferenceNumber) at StatementDV.quoterevision.pcf: line 27, column 71
    function value_2 () : java.lang.String {
      return currentQuote.ReferenceNumber
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at StatementDV.quoterevision.pcf: line 51, column 25
    function value_21 () : java.lang.String {
      return currentQuote.Description
    }
    
    // 'value' attribute on CurrencyInput (id=PreviousTotal) at StatementDV.quoterevision.pcf: line 33, column 25
    function value_8 () : gw.api.financials.CurrencyAmount {
      return previousTotal
    }
    
    // 'visible' attribute on TextInput (id=ReferenceNumber) at StatementDV.quoterevision.pcf: line 27, column 71
    function visible_1 () : java.lang.Boolean {
      return currentQuote != null or CurrentLocation.InEditMode
    }
    
    property get currentQuote () : ServiceRequestStatement {
      return getRequireValue("currentQuote", 0) as ServiceRequestStatement
    }
    
    property set currentQuote ($arg :  ServiceRequestStatement) {
      setRequireValue("currentQuote", 0, $arg)
    }
    
    property get previousTotal () : gw.api.financials.CurrencyAmount {
      return getRequireValue("previousTotal", 0) as gw.api.financials.CurrencyAmount
    }
    
    property set previousTotal ($arg :  gw.api.financials.CurrencyAmount) {
      setRequireValue("previousTotal", 0, $arg)
    }
    
    property get readOnly () : boolean {
      return getRequireValue("readOnly", 0) as java.lang.Boolean
    }
    
    property set readOnly ($arg :  boolean) {
      setRequireValue("readOnly", 0, $arg)
    }
    
    
  }
  
  
}