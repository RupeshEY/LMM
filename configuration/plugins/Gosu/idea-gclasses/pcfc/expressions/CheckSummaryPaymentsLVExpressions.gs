package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/checks/CheckSummaryPaymentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CheckSummaryPaymentsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/checks/CheckSummaryPaymentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CheckSummaryPaymentsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at CheckSummaryPaymentsLV.pcf: line 22, column 52
    function sortValue_0 (Payment :  entity.Payment) : java.lang.Object {
      return Payment.Check.ScheduledSendDate
    }
    
    // 'value' attribute on RowIterator at CheckSummaryPaymentsLV.pcf: line 30, column 55
    function sortValue_1 (Payment :  entity.Payment) : java.lang.Object {
      return Payment.TransactionAmountReservingAmountPair
    }
    
    // 'value' attribute on RowIterator at CheckSummaryPaymentsLV.pcf: line 36, column 42
    function sortValue_2 (Payment :  entity.Payment) : java.lang.Object {
      return Payment.Exposure.ClaimOrder
    }
    
    // 'value' attribute on RowIterator at CheckSummaryPaymentsLV.pcf: line 41, column 45
    function sortValue_3 (Payment :  entity.Payment) : java.lang.Object {
      return Payment.Exposure.PrimaryCoverage
    }
    
    // 'value' attribute on RowIterator at CheckSummaryPaymentsLV.pcf: line 46, column 41
    function sortValue_4 (Payment :  entity.Payment) : java.lang.Object {
      return Payment.CostType
    }
    
    // 'value' attribute on RowIterator at CheckSummaryPaymentsLV.pcf: line 51, column 45
    function sortValue_5 (Payment :  entity.Payment) : java.lang.Object {
      return Payment.CostCategory
    }
    
    // 'value' attribute on RowIterator at CheckSummaryPaymentsLV.pcf: line 57, column 74
    function sortValue_7 (Payment :  entity.Payment) : java.lang.Object {
      return Payment.ReservingCurrency
    }
    
    // 'value' attribute on RowIterator at CheckSummaryPaymentsLV.pcf: line 62, column 50
    function sortValue_8 (Payment :  entity.Payment) : java.lang.Object {
      return Payment.Status
    }
    
    // 'value' attribute on RowIterator at CheckSummaryPaymentsLV.pcf: line 67, column 44
    function sortValue_9 (Payment :  entity.Payment) : java.lang.Object {
      return Payment.PaymentType
    }
    
    // 'value' attribute on RowIterator at CheckSummaryPaymentsLV.pcf: line 16, column 36
    function value_41 () : entity.Payment[] {
      return PaymentList
    }
    
    // 'visible' attribute on RowIterator at CheckSummaryPaymentsLV.pcf: line 57, column 74
    function visible_6 () : java.lang.Boolean {
      return gw.util.CCConfigUtil.AllowExplicitReservingCurrency
    }
    
    property get PaymentList () : Payment[] {
      return getRequireValue("PaymentList", 0) as Payment[]
    }
    
    property set PaymentList ($arg :  Payment[]) {
      setRequireValue("PaymentList", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/financials/checks/CheckSummaryPaymentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends CheckSummaryPaymentsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on CurrencyCell (id=Amount) at CheckSummaryPaymentsLV.pcf: line 30, column 55
    function action_14 () : void {
      ClaimFinancialsTransactionsDetail.goInMain(Payment.Claim, Payment)
    }
    
    // 'action' attribute on CurrencyCell (id=Amount) at CheckSummaryPaymentsLV.pcf: line 30, column 55
    function action_dest_15 () : pcf.api.Destination {
      return pcf.ClaimFinancialsTransactionsDetail.createDestination(Payment.Claim, Payment)
    }
    
    // 'outputConversion' attribute on TextCell (id=Exposure) at CheckSummaryPaymentsLV.pcf: line 36, column 42
    function outputConversion_19 (VALUE :  java.lang.Integer) : java.lang.String {
      return (null == VALUE) ? DisplayKey.get("LV.Financials.NewCheckPayments.Payments.Exposure.None") : VALUE as String
    }
    
    // 'value' attribute on DateCell (id=Check_ScheduledSendDate) at CheckSummaryPaymentsLV.pcf: line 22, column 52
    function valueRoot_12 () : java.lang.Object {
      return Payment.Check
    }
    
    // 'value' attribute on CurrencyCell (id=Amount) at CheckSummaryPaymentsLV.pcf: line 30, column 55
    function valueRoot_17 () : java.lang.Object {
      return Payment
    }
    
    // 'value' attribute on TextCell (id=Exposure) at CheckSummaryPaymentsLV.pcf: line 36, column 42
    function valueRoot_21 () : java.lang.Object {
      return Payment.Exposure
    }
    
    // 'value' attribute on DateCell (id=Check_ScheduledSendDate) at CheckSummaryPaymentsLV.pcf: line 22, column 52
    function value_10 () : java.util.Date {
      return Payment.Check.ScheduledSendDate
    }
    
    // 'value' attribute on CurrencyCell (id=Amount) at CheckSummaryPaymentsLV.pcf: line 30, column 55
    function value_13 () : gw.api.financials.IPairedMoney {
      return Payment.TransactionAmountReservingAmountPair
    }
    
    // 'value' attribute on TextCell (id=Exposure) at CheckSummaryPaymentsLV.pcf: line 36, column 42
    function value_18 () : java.lang.Integer {
      return Payment.Exposure.ClaimOrder
    }
    
    // 'value' attribute on TypeKeyCell (id=CoverageType) at CheckSummaryPaymentsLV.pcf: line 41, column 45
    function value_22 () : typekey.CoverageType {
      return Payment.Exposure.PrimaryCoverage
    }
    
    // 'value' attribute on TypeKeyCell (id=CostType) at CheckSummaryPaymentsLV.pcf: line 46, column 41
    function value_25 () : typekey.CostType {
      return Payment.CostType
    }
    
    // 'value' attribute on TypeKeyCell (id=CostCategory) at CheckSummaryPaymentsLV.pcf: line 51, column 45
    function value_28 () : typekey.CostCategory {
      return Payment.CostCategory
    }
    
    // 'value' attribute on TypeKeyCell (id=ReservingCurrency) at CheckSummaryPaymentsLV.pcf: line 57, column 74
    function value_32 () : typekey.Currency {
      return Payment.ReservingCurrency
    }
    
    // 'value' attribute on TypeKeyCell (id=Status) at CheckSummaryPaymentsLV.pcf: line 62, column 50
    function value_35 () : typekey.TransactionStatus {
      return Payment.Status
    }
    
    // 'value' attribute on TypeKeyCell (id=PaymentType) at CheckSummaryPaymentsLV.pcf: line 67, column 44
    function value_38 () : typekey.PaymentType {
      return Payment.PaymentType
    }
    
    // 'visible' attribute on TypeKeyCell (id=ReservingCurrency) at CheckSummaryPaymentsLV.pcf: line 57, column 74
    function visible_31 () : java.lang.Boolean {
      return gw.util.CCConfigUtil.AllowExplicitReservingCurrency
    }
    
    property get Payment () : entity.Payment {
      return getIteratedValue(1) as entity.Payment
    }
    
    
  }
  
  
}