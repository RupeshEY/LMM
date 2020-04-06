package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/transactions/RecodePaymentDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RecodePaymentDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/transactions/RecodePaymentDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RecodePaymentDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at RecodePaymentDV.pcf: line 21, column 76
    function def_onEnter_1 (def :  pcf.EditTransactionInputSet) : void {
      def.onEnter(Payment, reserveLineInputSetHelper)
    }
    
    // 'def' attribute on ListViewInput at RecodePaymentDV.pcf: line 40, column 96
    function def_onEnter_17 (def :  pcf.EditableRecodeLineItemsLV) : void {
      def.onEnter(Payment)
    }
    
    // 'def' attribute on ListViewInput at RecodePaymentDV.pcf: line 40, column 96
    function def_refreshVariables_18 (def :  pcf.EditableRecodeLineItemsLV) : void {
      def.refreshVariables(Payment)
    }
    
    // 'def' attribute on InputSetRef at RecodePaymentDV.pcf: line 21, column 76
    function def_refreshVariables_2 (def :  pcf.EditTransactionInputSet) : void {
      def.refreshVariables(Payment, reserveLineInputSetHelper)
    }
    
    // 'editable' attribute on ListViewInput at RecodePaymentDV.pcf: line 40, column 96
    function editable_16 () : java.lang.Boolean {
      return Payment.CostCategory != null
    }
    
    // 'initialValue' attribute on Variable at RecodePaymentDV.pcf: line 18, column 26
    function initialValue_0 () : Deductible {
      return Payment.SharedDeductible
    }
    
    // 'onChange' attribute on PostOnChange at RecodePaymentDV.pcf: line 28, column 87
    function onChange_3 () : void {
      gw.api.financials.FinancialsUtil.refreshErodesReserves(Payment)
    }
    
    // 'toCreateAndAdd' attribute on AddButton (id=ApplyDeductibleButton) at RecodePaymentDV.pcf: line 51, column 252
    function toCreateAndAdd_15 (CheckedValues :  Object[]) : java.lang.Object {
      return Payment.addDeductibleLineItem()
    }
    
    // 'value' attribute on CurrencyInput (id=Transaction_AvailableReserves) at RecodePaymentDV.pcf: line 36, column 80
    function valueRoot_11 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculationsForEditedTransaction.getAvailableReserves(Payment)
    }
    
    // 'value' attribute on TypeKeyInput (id=Payment_PaymentType) at RecodePaymentDV.pcf: line 26, column 41
    function valueRoot_6 () : java.lang.Object {
      return Payment
    }
    
    // 'value' attribute on TypeKeyInput (id=Payment_PaymentType) at RecodePaymentDV.pcf: line 26, column 41
    function value_4 () : typekey.PaymentType {
      return Payment.PaymentType
    }
    
    // 'value' attribute on CurrencyInput (id=Transaction_AvailableReserves) at RecodePaymentDV.pcf: line 36, column 80
    function value_8 () : gw.api.financials.IPairedMoney {
      return gw.api.financials.FinancialsCalculationsForEditedTransaction.getAvailableReserves(Payment).ReservingAmountTransactionAmountPair
    }
    
    // 'addVisible' attribute on IteratorButtons at RecodePaymentDV.pcf: line 45, column 89
    function visible_12 () : java.lang.Boolean {
      return gw.api.financials.FinancialsUtil.isAllowMultiplePayments()
    }
    
    // 'visible' attribute on AddButton (id=ApplyDeductibleButton) at RecodePaymentDV.pcf: line 51, column 252
    function visible_14 () : java.lang.Boolean {
      return gw.api.financials.FinancialsUtil.isAllowMultipleLineItems() and !Payment.Check.CheckSet.Recurring and deductible != null and !deductible.Paid and !deductible.Waived and gw.api.financials.FinancialsUtil.isUseDeductibleHandling()
    }
    
    // 'visible' attribute on CurrencyInput (id=Transaction_AvailableReserves) at RecodePaymentDV.pcf: line 36, column 80
    function visible_7 () : java.lang.Boolean {
      return Payment.ReserveLine != null and not Payment.ReserveLine.New
    }
    
    property get Payment () : Payment {
      return getRequireValue("Payment", 0) as Payment
    }
    
    property set Payment ($arg :  Payment) {
      setRequireValue("Payment", 0, $arg)
    }
    
    property get deductible () : Deductible {
      return getVariableValue("deductible", 0) as Deductible
    }
    
    property set deductible ($arg :  Deductible) {
      setVariableValue("deductible", 0, $arg)
    }
    
    property get reserveLineInputSetHelper () : gw.api.financials.ReserveLineInputSetHelper {
      return getRequireValue("reserveLineInputSetHelper", 0) as gw.api.financials.ReserveLineInputSetHelper
    }
    
    property set reserveLineInputSetHelper ($arg :  gw.api.financials.ReserveLineInputSetHelper) {
      setRequireValue("reserveLineInputSetHelper", 0, $arg)
    }
    
    
  }
  
  
}