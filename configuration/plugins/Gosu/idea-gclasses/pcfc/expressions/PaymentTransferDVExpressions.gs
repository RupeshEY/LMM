package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/checks/PaymentTransferDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PaymentTransferDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/checks/PaymentTransferDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PaymentTransferDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at PaymentTransferDV.pcf: line 19, column 76
    function def_onEnter_0 (def :  pcf.EditTransactionInputSet) : void {
      def.onEnter(Payment, reserveLineInputSetHelper)
    }
    
    // 'def' attribute on ListViewInput at PaymentTransferDV.pcf: line 42, column 94
    function def_onEnter_14 (def :  pcf.PaymentTransferLineItemsLV) : void {
      def.onEnter(Payment)
    }
    
    // 'def' attribute on InputSetRef at PaymentTransferDV.pcf: line 19, column 76
    function def_refreshVariables_1 (def :  pcf.EditTransactionInputSet) : void {
      def.refreshVariables(Payment, reserveLineInputSetHelper)
    }
    
    // 'def' attribute on ListViewInput at PaymentTransferDV.pcf: line 42, column 94
    function def_refreshVariables_15 (def :  pcf.PaymentTransferLineItemsLV) : void {
      def.refreshVariables(Payment)
    }
    
    // 'onChange' attribute on PostOnChange at PaymentTransferDV.pcf: line 26, column 87
    function onChange_2 () : void {
      gw.api.financials.FinancialsUtil.refreshErodesReserves(Payment)
    }
    
    // 'value' attribute on CurrencyInput (id=AvailableReserves) at PaymentTransferDV.pcf: line 33, column 80
    function valueRoot_10 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculationsForEditedTransaction.getAvailableReserves(Payment)
    }
    
    // 'value' attribute on CurrencyInput (id=NetTotalIncurred) at PaymentTransferDV.pcf: line 38, column 47
    function valueRoot_13 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculationsForEditedTransaction.getTotalIncurredNet(Payment)
    }
    
    // 'value' attribute on TypeKeyInput (id=PaymentType) at PaymentTransferDV.pcf: line 24, column 41
    function valueRoot_5 () : java.lang.Object {
      return Payment
    }
    
    // 'value' attribute on CurrencyInput (id=NetTotalIncurred) at PaymentTransferDV.pcf: line 38, column 47
    function value_11 () : gw.api.financials.IMoney {
      return gw.api.financials.FinancialsCalculationsForEditedTransaction.getTotalIncurredNet(Payment).ReservingAmount
    }
    
    // 'value' attribute on TypeKeyInput (id=PaymentType) at PaymentTransferDV.pcf: line 24, column 41
    function value_3 () : typekey.PaymentType {
      return Payment.PaymentType
    }
    
    // 'value' attribute on CurrencyInput (id=AvailableReserves) at PaymentTransferDV.pcf: line 33, column 80
    function value_7 () : gw.api.financials.IPairedMoney {
      return gw.api.financials.FinancialsCalculationsForEditedTransaction.getAvailableReserves(Payment).ReservingAmountTransactionAmountPair
    }
    
    // 'visible' attribute on CurrencyInput (id=AvailableReserves) at PaymentTransferDV.pcf: line 33, column 80
    function visible_6 () : java.lang.Boolean {
      return Payment.ReserveLine != null and not Payment.ReserveLine.New
    }
    
    property get Payment () : Payment {
      return getRequireValue("Payment", 0) as Payment
    }
    
    property set Payment ($arg :  Payment) {
      setRequireValue("Payment", 0, $arg)
    }
    
    property get Transaction () : Transaction {
      return getRequireValue("Transaction", 0) as Transaction
    }
    
    property set Transaction ($arg :  Transaction) {
      setRequireValue("Transaction", 0, $arg)
    }
    
    property get reserveLineInputSetHelper () : gw.api.financials.ReserveLineInputSetHelper {
      return getRequireValue("reserveLineInputSetHelper", 0) as gw.api.financials.ReserveLineInputSetHelper
    }
    
    property set reserveLineInputSetHelper ($arg :  gw.api.financials.ReserveLineInputSetHelper) {
      setRequireValue("reserveLineInputSetHelper", 0, $arg)
    }
    
    
  }
  
  
}