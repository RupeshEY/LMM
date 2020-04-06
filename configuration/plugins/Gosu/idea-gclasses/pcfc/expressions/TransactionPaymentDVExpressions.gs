package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/transactions/TransactionPaymentDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TransactionPaymentDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/transactions/TransactionPaymentDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TransactionPaymentDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at TransactionPaymentDV.pcf: line 13, column 47
    function def_onEnter_0 (def :  pcf.PaymentBasicsInputSet) : void {
      def.onEnter(Payment)
    }
    
    // 'def' attribute on InputSetRef at TransactionPaymentDV.pcf: line 17, column 59
    function def_onEnter_2 (def :  pcf.TransactionPaymentDetailsInputSet) : void {
      def.onEnter(Payment)
    }
    
    // 'def' attribute on InputSetRef at TransactionPaymentDV.pcf: line 20, column 53
    function def_onEnter_4 (def :  pcf.TransactionTrackingInputSet) : void {
      def.onEnter(Payment)
    }
    
    // 'def' attribute on InputSetRef at TransactionPaymentDV.pcf: line 24, column 60
    function def_onEnter_6 (def :  pcf.TransactionApprovalHistoryInputSet) : void {
      def.onEnter(Payment)
    }
    
    // 'def' attribute on InputSetRef at TransactionPaymentDV.pcf: line 13, column 47
    function def_refreshVariables_1 (def :  pcf.PaymentBasicsInputSet) : void {
      def.refreshVariables(Payment)
    }
    
    // 'def' attribute on InputSetRef at TransactionPaymentDV.pcf: line 17, column 59
    function def_refreshVariables_3 (def :  pcf.TransactionPaymentDetailsInputSet) : void {
      def.refreshVariables(Payment)
    }
    
    // 'def' attribute on InputSetRef at TransactionPaymentDV.pcf: line 20, column 53
    function def_refreshVariables_5 (def :  pcf.TransactionTrackingInputSet) : void {
      def.refreshVariables(Payment)
    }
    
    // 'def' attribute on InputSetRef at TransactionPaymentDV.pcf: line 24, column 60
    function def_refreshVariables_7 (def :  pcf.TransactionApprovalHistoryInputSet) : void {
      def.refreshVariables(Payment)
    }
    
    property get Payment () : Payment {
      return getRequireValue("Payment", 0) as Payment
    }
    
    property set Payment ($arg :  Payment) {
      setRequireValue("Payment", 0, $arg)
    }
    
    
  }
  
  
}