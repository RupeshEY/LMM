package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/transactions/TransactionsLV.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TransactionsLV_defaultExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/transactions/TransactionsLV.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends TransactionsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TypeKeyCell (id=TType) at TransactionsLV.default.pcf: line 32, column 24
    function action_13 () : void {
      TransactionViewDetailForward.drilldown(Claim, TransactionView)
    }
    
    // 'action' attribute on CurrencyCell (id=Amount) at TransactionsLV.default.pcf: line 46, column 24
    function action_21 () : void {
      TransactionViewDetailForward.drilldown(Claim, TransactionView)
    }
    
    // 'action' attribute on TextCell (id=Exposure) at TransactionsLV.default.pcf: line 54, column 23
    function action_26 () : void {
      ExposureDetailForward.go(Claim, TransactionView.Exposure)
    }
    
    // 'action' attribute on TypeKeyCell (id=TType) at TransactionsLV.default.pcf: line 32, column 24
    function action_dest_14 () : pcf.api.Destination {
      return pcf.TransactionViewDetailForward.createDestination(Claim, TransactionView)
    }
    
    // 'action' attribute on CurrencyCell (id=Amount) at TransactionsLV.default.pcf: line 46, column 24
    function action_dest_22 () : pcf.api.Destination {
      return pcf.TransactionViewDetailForward.createDestination(Claim, TransactionView)
    }
    
    // 'action' attribute on TextCell (id=Exposure) at TransactionsLV.default.pcf: line 54, column 23
    function action_dest_27 () : pcf.api.Destination {
      return pcf.ExposureDetailForward.createDestination(Claim, TransactionView.Exposure)
    }
    
    // 'outputConversion' attribute on TextCell (id=Exposure) at TransactionsLV.default.pcf: line 54, column 23
    function outputConversion_28 (VALUE :  java.lang.Integer) : java.lang.String {
      if (null != VALUE) {return (VALUE as String);} else {return DisplayKey.get("Financials.ReserveLine.NoExposure");}
    }
    
    // 'value' attribute on TypeKeyCell (id=TType) at TransactionsLV.default.pcf: line 32, column 24
    function valueRoot_16 () : java.lang.Object {
      return TransactionView
    }
    
    // 'value' attribute on TypeKeyCell (id=TType) at TransactionsLV.default.pcf: line 32, column 24
    function value_12 () : typekey.Transaction {
      return TransactionView.TransactionSubtype
    }
    
    // 'value' attribute on DateCell (id=Date) at TransactionsLV.default.pcf: line 37, column 47
    function value_17 () : java.util.Date {
      return TransactionView.CreateTime
    }
    
    // 'value' attribute on CurrencyCell (id=Amount) at TransactionsLV.default.pcf: line 46, column 24
    function value_20 () : gw.api.financials.CurrencyAmountPair {
      return TransactionView.CurrencyAmount
    }
    
    // 'value' attribute on TextCell (id=Exposure) at TransactionsLV.default.pcf: line 54, column 23
    function value_25 () : java.lang.Integer {
      return TransactionView.ExposureName
    }
    
    // 'value' attribute on TypeKeyCell (id=CoverageType) at TransactionsLV.default.pcf: line 59, column 45
    function value_31 () : typekey.CoverageType {
      return TransactionView.CoverageType
    }
    
    // 'value' attribute on TypeKeyCell (id=CostType) at TransactionsLV.default.pcf: line 64, column 41
    function value_34 () : typekey.CostType {
      return TransactionView.CostType
    }
    
    // 'value' attribute on TypeKeyCell (id=CostCategory) at TransactionsLV.default.pcf: line 69, column 45
    function value_37 () : typekey.CostCategory {
      return TransactionView.CostCategory
    }
    
    // 'value' attribute on TypeKeyCell (id=ReservingCurrency) at TransactionsLV.default.pcf: line 75, column 74
    function value_41 () : typekey.Currency {
      return TransactionView.ReservingCurrency
    }
    
    // 'value' attribute on TypeKeyCell (id=Status) at TransactionsLV.default.pcf: line 80, column 50
    function value_44 () : typekey.TransactionStatus {
      return TransactionView.Status
    }
    
    // 'value' attribute on TextCell (id=User) at TransactionsLV.default.pcf: line 84, column 41
    function value_47 () : java.lang.String {
      return TransactionView.User
    }
    
    // 'visible' attribute on TypeKeyCell (id=ReservingCurrency) at TransactionsLV.default.pcf: line 75, column 74
    function visible_40 () : java.lang.Boolean {
      return gw.util.CCConfigUtil.AllowExplicitReservingCurrency
    }
    
    property get TransactionView () : entity.TransactionDefaultView {
      return getIteratedValue(1) as entity.TransactionDefaultView
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/financials/transactions/TransactionsLV.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TransactionsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at TransactionsLV.default.pcf: line 18, column 83
    function initialValue_0 () : gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean> {
      return TxnFilterOption.getTransactionsQuery(Claim)
    }
    
    // 'value' attribute on RowIterator at TransactionsLV.default.pcf: line 32, column 24
    function sortValue_1 (TransactionView :  entity.TransactionDefaultView) : java.lang.Object {
      return TransactionView.TransactionSubtype
    }
    
    // 'value' attribute on RowIterator at TransactionsLV.default.pcf: line 80, column 50
    function sortValue_10 (TransactionView :  entity.TransactionDefaultView) : java.lang.Object {
      return TransactionView.Status
    }
    
    // 'value' attribute on RowIterator at TransactionsLV.default.pcf: line 84, column 41
    function sortValue_11 (TransactionView :  entity.TransactionDefaultView) : java.lang.Object {
      return TransactionView.User
    }
    
    // 'value' attribute on RowIterator at TransactionsLV.default.pcf: line 37, column 47
    function sortValue_2 (TransactionView :  entity.TransactionDefaultView) : java.lang.Object {
      return TransactionView.CreateTime
    }
    
    // 'sortBy' attribute on RowIterator at TransactionsLV.default.pcf: line 46, column 24
    function sortValue_3 (TransactionView :  entity.TransactionDefaultView) : java.lang.Object {
      return TransactionView.ClaimAmount
    }
    
    // 'value' attribute on RowIterator at TransactionsLV.default.pcf: line 54, column 23
    function sortValue_4 (TransactionView :  entity.TransactionDefaultView) : java.lang.Object {
      return TransactionView.ExposureName
    }
    
    // 'value' attribute on RowIterator at TransactionsLV.default.pcf: line 59, column 45
    function sortValue_5 (TransactionView :  entity.TransactionDefaultView) : java.lang.Object {
      return TransactionView.CoverageType
    }
    
    // 'value' attribute on RowIterator at TransactionsLV.default.pcf: line 64, column 41
    function sortValue_6 (TransactionView :  entity.TransactionDefaultView) : java.lang.Object {
      return TransactionView.CostType
    }
    
    // 'value' attribute on RowIterator at TransactionsLV.default.pcf: line 69, column 45
    function sortValue_7 (TransactionView :  entity.TransactionDefaultView) : java.lang.Object {
      return TransactionView.CostCategory
    }
    
    // 'value' attribute on RowIterator at TransactionsLV.default.pcf: line 75, column 74
    function sortValue_9 (TransactionView :  entity.TransactionDefaultView) : java.lang.Object {
      return TransactionView.ReservingCurrency
    }
    
    // 'value' attribute on RowIterator at TransactionsLV.default.pcf: line 24, column 87
    function value_50 () : gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean> {
      return TransactionViewList
    }
    
    // 'visible' attribute on RowIterator at TransactionsLV.default.pcf: line 75, column 74
    function visible_8 () : java.lang.Boolean {
      return gw.util.CCConfigUtil.AllowExplicitReservingCurrency
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get TransactionViewList () : gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean> {
      return getVariableValue("TransactionViewList", 0) as gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>
    }
    
    property set TransactionViewList ($arg :  gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>) {
      setVariableValue("TransactionViewList", 0, $arg)
    }
    
    property get TxnFilterOption () : gw.api.financials.ClaimFinancialsTransactionsOption {
      return getRequireValue("TxnFilterOption", 0) as gw.api.financials.ClaimFinancialsTransactionsOption
    }
    
    property set TxnFilterOption ($arg :  gw.api.financials.ClaimFinancialsTransactionsOption) {
      setRequireValue("TxnFilterOption", 0, $arg)
    }
    
    
  }
  
  
}