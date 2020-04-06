package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/bulkpay/BulkInvoiceSearchResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class BulkInvoiceSearchResultsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/search/bulkpay/BulkInvoiceSearchResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BulkInvoiceSearchResultsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'footerSumFormat' attribute on RowIterator at BulkInvoiceSearchResultsLV.pcf: line 37, column 68
    function format_7 () : java.lang.String {
      return gw.api.util.CCCurrencyUtil.getCurrencyFormatExpressionForRender(criteria.CurrencyForLastSearch)
    }
    
    // 'footerLabel' attribute on RowIterator at BulkInvoiceSearchResultsLV.pcf: line 24, column 56
    function label_6 () : java.lang.Object {
      return criteria.ShowSumRowForLastSearch ? DisplayKey.get("Financials.BulkPay.Search.SearchResults.Total") : null
    }
    
    // 'value' attribute on RowIterator at BulkInvoiceSearchResultsLV.pcf: line 24, column 56
    function sortValue_0 (BulkInvoiceSearchView :  entity.BulkInvoiceSearchView) : java.lang.Object {
      return BulkInvoiceSearchView.InvoiceNumber
    }
    
    // 'value' attribute on RowIterator at BulkInvoiceSearchResultsLV.pcf: line 29, column 54
    function sortValue_1 (BulkInvoiceSearchView :  entity.BulkInvoiceSearchView) : java.lang.Object {
      return BulkInvoiceSearchView.CheckNumber
    }
    
    // 'value' attribute on RowIterator at BulkInvoiceSearchResultsLV.pcf: line 37, column 68
    function sortValue_2 (BulkInvoiceSearchView :  entity.BulkInvoiceSearchView) : java.lang.Object {
      return BulkInvoiceSearchView.ApprovedTransactionAmount
    }
    
    // 'value' attribute on RowIterator at BulkInvoiceSearchResultsLV.pcf: line 51, column 48
    function sortValue_3 (BulkInvoiceSearchView :  entity.BulkInvoiceSearchView) : java.lang.Object {
      return BulkInvoiceSearchView.PayTo
    }
    
    // 'value' attribute on RowIterator at BulkInvoiceSearchResultsLV.pcf: line 55, column 60
    function sortValue_4 (BulkInvoiceSearchView :  entity.BulkInvoiceSearchView) : java.lang.Object {
      return BulkInvoiceSearchView.ScheduledSendDate
    }
    
    // 'value' attribute on RowIterator at BulkInvoiceSearchResultsLV.pcf: line 59, column 55
    function sortValue_5 (BulkInvoiceSearchView :  entity.BulkInvoiceSearchView) : java.lang.Object {
      return BulkInvoiceSearchView.ReceivedDate
    }
    
    // '$$sumValue' attribute on RowIterator at BulkInvoiceSearchResultsLV.pcf: line 37, column 68
    function sumValueRoot_9 (BulkInvoiceSearchView :  entity.BulkInvoiceSearchView) : java.lang.Object {
      return BulkInvoiceSearchView
    }
    
    // 'footerSumValue' attribute on RowIterator at BulkInvoiceSearchResultsLV.pcf: line 47, column 61
    function sumValue_11 (BulkInvoiceSearchView :  entity.BulkInvoiceSearchView) : java.lang.Object {
      return BulkInvoiceSearchView.TotalTransactionAmount
    }
    
    // 'footerSumValue' attribute on RowIterator at BulkInvoiceSearchResultsLV.pcf: line 37, column 68
    function sumValue_8 (BulkInvoiceSearchView :  entity.BulkInvoiceSearchView) : java.lang.Object {
      return BulkInvoiceSearchView.ApprovedTransactionAmount
    }
    
    // 'value' attribute on RowIterator at BulkInvoiceSearchResultsLV.pcf: line 17, column 88
    function value_38 () : gw.api.database.IQueryBeanResult<entity.BulkInvoiceSearchView> {
      return BulkInvoiceSearchViewList
    }
    
    property get BulkInvoiceSearchViewList () : gw.api.database.IQueryBeanResult<BulkInvoiceSearchView> {
      return getRequireValue("BulkInvoiceSearchViewList", 0) as gw.api.database.IQueryBeanResult<BulkInvoiceSearchView>
    }
    
    property set BulkInvoiceSearchViewList ($arg :  gw.api.database.IQueryBeanResult<BulkInvoiceSearchView>) {
      setRequireValue("BulkInvoiceSearchViewList", 0, $arg)
    }
    
    property get criteria () : BulkInvoiceSearchCriteria {
      return getRequireValue("criteria", 0) as BulkInvoiceSearchCriteria
    }
    
    property set criteria ($arg :  BulkInvoiceSearchCriteria) {
      setRequireValue("criteria", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/search/bulkpay/BulkInvoiceSearchResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends BulkInvoiceSearchResultsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=InvoiceNumber) at BulkInvoiceSearchResultsLV.pcf: line 24, column 56
    function action_14 () : void {
      EditBulkInvoiceDetail.go(BulkInvoiceSearchView.BulkInvoice)
    }
    
    // 'action' attribute on TextCell (id=CheckNumber) at BulkInvoiceSearchResultsLV.pcf: line 29, column 54
    function action_19 () : void {
      EditBulkInvoiceDetail.go(BulkInvoiceSearchView.BulkInvoice)
    }
    
    // 'action' attribute on TextCell (id=InvoiceNumber) at BulkInvoiceSearchResultsLV.pcf: line 24, column 56
    function action_dest_15 () : pcf.api.Destination {
      return pcf.EditBulkInvoiceDetail.createDestination(BulkInvoiceSearchView.BulkInvoice)
    }
    
    // 'action' attribute on TextCell (id=CheckNumber) at BulkInvoiceSearchResultsLV.pcf: line 29, column 54
    function action_dest_20 () : pcf.api.Destination {
      return pcf.EditBulkInvoiceDetail.createDestination(BulkInvoiceSearchView.BulkInvoice)
    }
    
    // 'value' attribute on TextCell (id=InvoiceNumber) at BulkInvoiceSearchResultsLV.pcf: line 24, column 56
    function valueRoot_17 () : java.lang.Object {
      return BulkInvoiceSearchView
    }
    
    // 'value' attribute on TextCell (id=InvoiceNumber) at BulkInvoiceSearchResultsLV.pcf: line 24, column 56
    function value_13 () : java.lang.String {
      return BulkInvoiceSearchView.InvoiceNumber
    }
    
    // 'value' attribute on TextCell (id=CheckNumber) at BulkInvoiceSearchResultsLV.pcf: line 29, column 54
    function value_18 () : java.lang.String {
      return BulkInvoiceSearchView.CheckNumber
    }
    
    // 'value' attribute on CurrencyCell (id=ApprovedAmount) at BulkInvoiceSearchResultsLV.pcf: line 37, column 68
    function value_23 () : gw.api.financials.CurrencyAmount {
      return BulkInvoiceSearchView.ApprovedTransactionAmount
    }
    
    // 'value' attribute on CurrencyCell (id=TotalAmount) at BulkInvoiceSearchResultsLV.pcf: line 47, column 61
    function value_26 () : gw.api.financials.CurrencyAmountPair {
      return BulkInvoiceSearchView.TotalCurrencyAmount
    }
    
    // 'value' attribute on TextCell (id=PayTo) at BulkInvoiceSearchResultsLV.pcf: line 51, column 48
    function value_29 () : java.lang.String {
      return BulkInvoiceSearchView.PayTo
    }
    
    // 'value' attribute on DateCell (id=ScheduledSendDate) at BulkInvoiceSearchResultsLV.pcf: line 55, column 60
    function value_32 () : java.util.Date {
      return BulkInvoiceSearchView.ScheduledSendDate
    }
    
    // 'value' attribute on DateCell (id=ReceivedDate) at BulkInvoiceSearchResultsLV.pcf: line 59, column 55
    function value_35 () : java.util.Date {
      return BulkInvoiceSearchView.ReceivedDate
    }
    
    property get BulkInvoiceSearchView () : entity.BulkInvoiceSearchView {
      return getIteratedValue(1) as entity.BulkInvoiceSearchView
    }
    
    
  }
  
  
}