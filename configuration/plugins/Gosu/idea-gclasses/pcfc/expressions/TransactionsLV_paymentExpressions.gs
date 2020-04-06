package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/transactions/TransactionsLV.payment.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TransactionsLV_paymentExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/transactions/TransactionsLV.payment.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends TransactionsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on CurrencyCell (id=Amount) at TransactionsLV.payment.pcf: line 45, column 24
    function action_21 () : void {
      TransactionViewDetailForward.drilldown(Claim, TransactionView)
    }
    
    // 'action' attribute on TextCell (id=Exposure) at TransactionsLV.payment.pcf: line 53, column 23
    function action_26 () : void {
      ExposureDetailForward.go(Claim, TransactionView.Exposure)
    }
    
    // 'action' attribute on CurrencyCell (id=Amount) at TransactionsLV.payment.pcf: line 45, column 24
    function action_dest_22 () : pcf.api.Destination {
      return pcf.TransactionViewDetailForward.createDestination(Claim, TransactionView)
    }
    
    // 'action' attribute on TextCell (id=Exposure) at TransactionsLV.payment.pcf: line 53, column 23
    function action_dest_27 () : pcf.api.Destination {
      return pcf.ExposureDetailForward.createDestination(Claim, TransactionView.Exposure)
    }
    
    // 'outputConversion' attribute on TextCell (id=Exposure) at TransactionsLV.payment.pcf: line 53, column 23
    function outputConversion_28 (VALUE :  java.lang.Integer) : java.lang.String {
      if (null != VALUE) {return (VALUE as String);} else {return DisplayKey.get("Financials.ReserveLine.NoExposure");}
    }
    
    // 'value' attribute on DateCell (id=Check_ScheduledSendDate) at TransactionsLV.payment.pcf: line 32, column 23
    function valueRoot_16 () : java.lang.Object {
      return TransactionView
    }
    
    // 'value' attribute on DateCell (id=Check_ScheduledSendDate) at TransactionsLV.payment.pcf: line 32, column 23
    function value_14 () : java.util.Date {
      return TransactionView.Check_ScheduledSendDate
    }
    
    // 'value' attribute on DateCell (id=Check_IssueDate) at TransactionsLV.payment.pcf: line 36, column 52
    function value_17 () : java.util.Date {
      return TransactionView.Check_IssueDate
    }
    
    // 'value' attribute on CurrencyCell (id=Amount) at TransactionsLV.payment.pcf: line 45, column 24
    function value_20 () : gw.api.financials.CurrencyAmountPair {
      return TransactionView.CurrencyAmount
    }
    
    // 'value' attribute on TextCell (id=Exposure) at TransactionsLV.payment.pcf: line 53, column 23
    function value_25 () : java.lang.Integer {
      return TransactionView.ExposureName
    }
    
    // 'value' attribute on TypeKeyCell (id=CoverageType) at TransactionsLV.payment.pcf: line 58, column 45
    function value_31 () : typekey.CoverageType {
      return TransactionView.CoverageType
    }
    
    // 'value' attribute on TypeKeyCell (id=CostType) at TransactionsLV.payment.pcf: line 63, column 41
    function value_34 () : typekey.CostType {
      return TransactionView.CostType
    }
    
    // 'value' attribute on TypeKeyCell (id=CostCategory) at TransactionsLV.payment.pcf: line 68, column 45
    function value_37 () : typekey.CostCategory {
      return TransactionView.CostCategory
    }
    
    // 'value' attribute on TypeKeyCell (id=ReservingCurrency) at TransactionsLV.payment.pcf: line 74, column 74
    function value_41 () : typekey.Currency {
      return TransactionView.ReservingCurrency
    }
    
    // 'value' attribute on TypeKeyCell (id=Status) at TransactionsLV.payment.pcf: line 79, column 50
    function value_44 () : typekey.TransactionStatus {
      return TransactionView.Status
    }
    
    // 'value' attribute on TypeKeyCell (id=PaymentType) at TransactionsLV.payment.pcf: line 84, column 44
    function value_47 () : typekey.PaymentType {
      return TransactionView.PaymentType
    }
    
    // 'value' attribute on TextCell (id=Check_CheckNumber) at TransactionsLV.payment.pcf: line 88, column 54
    function value_50 () : java.lang.String {
      return TransactionView.Check_CheckNumber
    }
    
    // 'value' attribute on TextCell (id=Check_PayTo) at TransactionsLV.payment.pcf: line 92, column 48
    function value_53 () : java.lang.String {
      return TransactionView.Check_PayTo
    }
    
    // 'visible' attribute on TypeKeyCell (id=ReservingCurrency) at TransactionsLV.payment.pcf: line 74, column 74
    function visible_40 () : java.lang.Boolean {
      return gw.util.CCConfigUtil.AllowExplicitReservingCurrency
    }
    
    property get TransactionView () : PaymentView {
      return getIteratedValue(1) as PaymentView
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/financials/transactions/TransactionsLV.payment.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TransactionsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at TransactionsLV.payment.pcf: line 18, column 83
    function initialValue_0 () : gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean> {
      return TxnFilterOption.getTransactionsQuery(Claim)
    }
    
    // 'value' attribute on RowIterator at TransactionsLV.payment.pcf: line 32, column 23
    function sortValue_1 (TransactionView :  PaymentView) : java.lang.Object {
      return TransactionView.Check_ScheduledSendDate
    }
    
    // 'value' attribute on RowIterator at TransactionsLV.payment.pcf: line 79, column 50
    function sortValue_10 (TransactionView :  PaymentView) : java.lang.Object {
      return TransactionView.Status
    }
    
    // 'value' attribute on RowIterator at TransactionsLV.payment.pcf: line 84, column 44
    function sortValue_11 (TransactionView :  PaymentView) : java.lang.Object {
      return TransactionView.PaymentType
    }
    
    // 'value' attribute on RowIterator at TransactionsLV.payment.pcf: line 88, column 54
    function sortValue_12 (TransactionView :  PaymentView) : java.lang.Object {
      return TransactionView.Check_CheckNumber
    }
    
    // 'value' attribute on RowIterator at TransactionsLV.payment.pcf: line 92, column 48
    function sortValue_13 (TransactionView :  PaymentView) : java.lang.Object {
      return TransactionView.Check_PayTo
    }
    
    // 'value' attribute on RowIterator at TransactionsLV.payment.pcf: line 36, column 52
    function sortValue_2 (TransactionView :  PaymentView) : java.lang.Object {
      return TransactionView.Check_IssueDate
    }
    
    // 'sortBy' attribute on RowIterator at TransactionsLV.payment.pcf: line 45, column 24
    function sortValue_3 (TransactionView :  PaymentView) : java.lang.Object {
      return TransactionView.ClaimAmount
    }
    
    // 'value' attribute on RowIterator at TransactionsLV.payment.pcf: line 53, column 23
    function sortValue_4 (TransactionView :  PaymentView) : java.lang.Object {
      return TransactionView.ExposureName
    }
    
    // 'value' attribute on RowIterator at TransactionsLV.payment.pcf: line 58, column 45
    function sortValue_5 (TransactionView :  PaymentView) : java.lang.Object {
      return TransactionView.CoverageType
    }
    
    // 'value' attribute on RowIterator at TransactionsLV.payment.pcf: line 63, column 41
    function sortValue_6 (TransactionView :  PaymentView) : java.lang.Object {
      return TransactionView.CostType
    }
    
    // 'value' attribute on RowIterator at TransactionsLV.payment.pcf: line 68, column 45
    function sortValue_7 (TransactionView :  PaymentView) : java.lang.Object {
      return TransactionView.CostCategory
    }
    
    // 'value' attribute on RowIterator at TransactionsLV.payment.pcf: line 74, column 74
    function sortValue_9 (TransactionView :  PaymentView) : java.lang.Object {
      return TransactionView.ReservingCurrency
    }
    
    // 'value' attribute on RowIterator at TransactionsLV.payment.pcf: line 24, column 87
    function value_56 () : gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean> {
      return TransactionList
    }
    
    // 'type' attribute on RowIterator at TransactionsLV.payment.pcf: line 24, column 87
    function verifyIteratorType_57 () : void {
      var entry : gw.pl.persistence.core.Bean = null
      var typedEntry : PaymentView
      // If this cast fails to compile then the type specified by the 'type' attribute on
      // 'RowIterator' is not compatible with the member type of the 'valueType' attribute
      typedEntry = entry as PaymentView
    }
    
    // 'visible' attribute on RowIterator at TransactionsLV.payment.pcf: line 74, column 74
    function visible_8 () : java.lang.Boolean {
      return gw.util.CCConfigUtil.AllowExplicitReservingCurrency
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get TransactionList () : gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean> {
      return getVariableValue("TransactionList", 0) as gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>
    }
    
    property set TransactionList ($arg :  gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>) {
      setVariableValue("TransactionList", 0, $arg)
    }
    
    property get TxnFilterOption () : gw.api.financials.ClaimFinancialsTransactionsOption {
      return getRequireValue("TxnFilterOption", 0) as gw.api.financials.ClaimFinancialsTransactionsOption
    }
    
    property set TxnFilterOption ($arg :  gw.api.financials.ClaimFinancialsTransactionsOption) {
      setRequireValue("TxnFilterOption", 0, $arg)
    }
    
    
  }
  
  
}