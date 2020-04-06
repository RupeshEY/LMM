package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/transactions/TransactionsLV.recoveryreserve.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TransactionsLV_recoveryreserveExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/transactions/TransactionsLV.recoveryreserve.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends TransactionsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on CurrencyCell (id=Amount) at TransactionsLV.recoveryreserve.pcf: line 39, column 24
    function action_16 () : void {
      TransactionViewDetailForward.drilldown(Claim, TransactionView)
    }
    
    // 'action' attribute on TextCell (id=Exposure) at TransactionsLV.recoveryreserve.pcf: line 47, column 23
    function action_21 () : void {
      ExposureDetailForward.go(Claim, TransactionView.Exposure)
    }
    
    // 'action' attribute on CurrencyCell (id=Amount) at TransactionsLV.recoveryreserve.pcf: line 39, column 24
    function action_dest_17 () : pcf.api.Destination {
      return pcf.TransactionViewDetailForward.createDestination(Claim, TransactionView)
    }
    
    // 'action' attribute on TextCell (id=Exposure) at TransactionsLV.recoveryreserve.pcf: line 47, column 23
    function action_dest_22 () : pcf.api.Destination {
      return pcf.ExposureDetailForward.createDestination(Claim, TransactionView.Exposure)
    }
    
    // 'outputConversion' attribute on TextCell (id=Exposure) at TransactionsLV.recoveryreserve.pcf: line 47, column 23
    function outputConversion_23 (VALUE :  java.lang.Integer) : java.lang.String {
      if (null != VALUE) {return (VALUE as String);} else {return DisplayKey.get("Financials.ReserveLine.NoExposure");}
    }
    
    // 'value' attribute on DateCell (id=CreateDate) at TransactionsLV.recoveryreserve.pcf: line 30, column 47
    function valueRoot_14 () : java.lang.Object {
      return TransactionView
    }
    
    // 'value' attribute on DateCell (id=CreateDate) at TransactionsLV.recoveryreserve.pcf: line 30, column 47
    function value_12 () : java.util.Date {
      return TransactionView.CreateTime
    }
    
    // 'value' attribute on CurrencyCell (id=Amount) at TransactionsLV.recoveryreserve.pcf: line 39, column 24
    function value_15 () : gw.api.financials.CurrencyAmountPair {
      return TransactionView.CurrencyAmount
    }
    
    // 'value' attribute on TextCell (id=Exposure) at TransactionsLV.recoveryreserve.pcf: line 47, column 23
    function value_20 () : java.lang.Integer {
      return TransactionView.ExposureName
    }
    
    // 'value' attribute on TypeKeyCell (id=CoverageType) at TransactionsLV.recoveryreserve.pcf: line 52, column 45
    function value_26 () : typekey.CoverageType {
      return TransactionView.CoverageType
    }
    
    // 'value' attribute on TypeKeyCell (id=CostType) at TransactionsLV.recoveryreserve.pcf: line 57, column 41
    function value_29 () : typekey.CostType {
      return TransactionView.CostType
    }
    
    // 'value' attribute on TypeKeyCell (id=CostCategory) at TransactionsLV.recoveryreserve.pcf: line 62, column 45
    function value_32 () : typekey.CostCategory {
      return TransactionView.CostCategory
    }
    
    // 'value' attribute on TypeKeyCell (id=RecoveryCategory) at TransactionsLV.recoveryreserve.pcf: line 67, column 49
    function value_35 () : typekey.RecoveryCategory {
      return TransactionView.RecoveryCategory
    }
    
    // 'value' attribute on TypeKeyCell (id=ReservingCurrency) at TransactionsLV.recoveryreserve.pcf: line 73, column 74
    function value_39 () : typekey.Currency {
      return TransactionView.ReservingCurrency
    }
    
    // 'value' attribute on TypeKeyCell (id=Status) at TransactionsLV.recoveryreserve.pcf: line 78, column 50
    function value_42 () : typekey.TransactionStatus {
      return TransactionView.Status
    }
    
    // 'value' attribute on TextCell (id=User) at TransactionsLV.recoveryreserve.pcf: line 82, column 41
    function value_45 () : java.lang.String {
      return TransactionView.User
    }
    
    // 'visible' attribute on TypeKeyCell (id=ReservingCurrency) at TransactionsLV.recoveryreserve.pcf: line 73, column 74
    function visible_38 () : java.lang.Boolean {
      return gw.util.CCConfigUtil.AllowExplicitReservingCurrency
    }
    
    property get TransactionView () : RecoveryReserveView {
      return getIteratedValue(1) as RecoveryReserveView
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/financials/transactions/TransactionsLV.recoveryreserve.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TransactionsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at TransactionsLV.recoveryreserve.pcf: line 18, column 83
    function initialValue_0 () : gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean> {
      return TxnFilterOption.getTransactionsQuery(Claim)
    }
    
    // 'value' attribute on RowIterator at TransactionsLV.recoveryreserve.pcf: line 30, column 47
    function sortValue_1 (TransactionView :  RecoveryReserveView) : java.lang.Object {
      return TransactionView.CreateTime
    }
    
    // 'value' attribute on RowIterator at TransactionsLV.recoveryreserve.pcf: line 78, column 50
    function sortValue_10 (TransactionView :  RecoveryReserveView) : java.lang.Object {
      return TransactionView.Status
    }
    
    // 'value' attribute on RowIterator at TransactionsLV.recoveryreserve.pcf: line 82, column 41
    function sortValue_11 (TransactionView :  RecoveryReserveView) : java.lang.Object {
      return TransactionView.User
    }
    
    // 'sortBy' attribute on RowIterator at TransactionsLV.recoveryreserve.pcf: line 39, column 24
    function sortValue_2 (TransactionView :  RecoveryReserveView) : java.lang.Object {
      return TransactionView.ClaimAmount
    }
    
    // 'value' attribute on RowIterator at TransactionsLV.recoveryreserve.pcf: line 47, column 23
    function sortValue_3 (TransactionView :  RecoveryReserveView) : java.lang.Object {
      return TransactionView.ExposureName
    }
    
    // 'value' attribute on RowIterator at TransactionsLV.recoveryreserve.pcf: line 52, column 45
    function sortValue_4 (TransactionView :  RecoveryReserveView) : java.lang.Object {
      return TransactionView.CoverageType
    }
    
    // 'value' attribute on RowIterator at TransactionsLV.recoveryreserve.pcf: line 57, column 41
    function sortValue_5 (TransactionView :  RecoveryReserveView) : java.lang.Object {
      return TransactionView.CostType
    }
    
    // 'value' attribute on RowIterator at TransactionsLV.recoveryreserve.pcf: line 62, column 45
    function sortValue_6 (TransactionView :  RecoveryReserveView) : java.lang.Object {
      return TransactionView.CostCategory
    }
    
    // 'value' attribute on RowIterator at TransactionsLV.recoveryreserve.pcf: line 67, column 49
    function sortValue_7 (TransactionView :  RecoveryReserveView) : java.lang.Object {
      return TransactionView.RecoveryCategory
    }
    
    // 'value' attribute on RowIterator at TransactionsLV.recoveryreserve.pcf: line 73, column 74
    function sortValue_9 (TransactionView :  RecoveryReserveView) : java.lang.Object {
      return TransactionView.ReservingCurrency
    }
    
    // 'value' attribute on RowIterator at TransactionsLV.recoveryreserve.pcf: line 24, column 87
    function value_48 () : gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean> {
      return TransactionViewList
    }
    
    // 'type' attribute on RowIterator at TransactionsLV.recoveryreserve.pcf: line 24, column 87
    function verifyIteratorType_49 () : void {
      var entry : gw.pl.persistence.core.Bean = null
      var typedEntry : RecoveryReserveView
      // If this cast fails to compile then the type specified by the 'type' attribute on
      // 'RowIterator' is not compatible with the member type of the 'valueType' attribute
      typedEntry = entry as RecoveryReserveView
    }
    
    // 'visible' attribute on RowIterator at TransactionsLV.recoveryreserve.pcf: line 73, column 74
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