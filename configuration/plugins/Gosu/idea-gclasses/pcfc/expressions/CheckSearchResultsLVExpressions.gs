package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/checks/CheckSearchResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CheckSearchResultsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/search/checks/CheckSearchResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CheckSearchResultsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'footerSumFormat' attribute on RowIterator at CheckSearchResultsLV.pcf: line 43, column 61
    function format_12 () : java.lang.String {
      return gw.api.util.CCCurrencyUtil.getCurrencyFormatExpressionForRender(criteria.CurrencyForLastSearch)
    }
    
    // 'footerLabel' attribute on RowIterator at CheckSearchResultsLV.pcf: line 25, column 27
    function label_11 () : java.lang.Object {
      return (criteria.ShowSumRowForLastSearch ? DisplayKey.get("LV.Financials.CheckSearchResults.Payments.Total") : null)
    }
    
    // 'value' attribute on RowIterator at CheckSearchResultsLV.pcf: line 25, column 27
    function sortValue_0 (CheckSearchView :  entity.CheckSearchView) : java.lang.Object {
      return CheckSearchView.IssueDate
    }
    
    // 'value' attribute on RowIterator at CheckSearchResultsLV.pcf: line 31, column 42
    function sortValue_1 (CheckSearchView :  entity.CheckSearchView) : java.lang.Object {
      return CheckSearchView.PayTo
    }
    
    // 'value' attribute on RowIterator at CheckSearchResultsLV.pcf: line 88, column 54
    function sortValue_10 (CheckSearchView :  entity.CheckSearchView) : java.lang.Object {
      return CheckSearchView.BulkInvoiceNumber
    }
    
    // 'sortBy' attribute on RowIterator at CheckSearchResultsLV.pcf: line 43, column 61
    function sortValue_2 (CheckSearchView :  entity.CheckSearchView) : java.lang.Object {
      return CheckSearchView.GrossAmount
    }
    
    // 'value' attribute on RowIterator at CheckSearchResultsLV.pcf: line 49, column 48
    function sortValue_3 (CheckSearchView :  entity.CheckSearchView) : java.lang.Object {
      return CheckSearchView.ClaimNumber
    }
    
    // 'value' attribute on RowIterator at CheckSearchResultsLV.pcf: line 55, column 50
    function sortValue_4 (CheckSearchView :  entity.CheckSearchView) : java.lang.Object {
      return CheckSearchView.Status
    }
    
    // 'value' attribute on RowIterator at CheckSearchResultsLV.pcf: line 60, column 45
    function sortValue_5 (CheckSearchView :  entity.CheckSearchView) : java.lang.Object {
      return CheckSearchView.Claimant
    }
    
    // 'value' attribute on RowIterator at CheckSearchResultsLV.pcf: line 65, column 50
    function sortValue_6 (CheckSearchView :  entity.CheckSearchView) : java.lang.Object {
      return CheckSearchView.DateOfService
    }
    
    // 'value' attribute on RowIterator at CheckSearchResultsLV.pcf: line 70, column 51
    function sortValue_7 (CheckSearchView :  entity.CheckSearchView) : java.lang.Object {
      return CheckSearchView.ServicePdStart
    }
    
    // 'value' attribute on RowIterator at CheckSearchResultsLV.pcf: line 75, column 49
    function sortValue_8 (CheckSearchView :  entity.CheckSearchView) : java.lang.Object {
      return CheckSearchView.ServicePdEnd
    }
    
    // 'value' attribute on RowIterator at CheckSearchResultsLV.pcf: line 80, column 54
    function sortValue_9 (CheckSearchView :  entity.CheckSearchView) : java.lang.Object {
      return CheckSearchView.ScheduledSendDate
    }
    
    // '$$sumValue' attribute on RowIterator at CheckSearchResultsLV.pcf: line 43, column 61
    function sumValueRoot_14 (CheckSearchView :  entity.CheckSearchView) : java.lang.Object {
      return CheckSearchView
    }
    
    // 'footerSumValue' attribute on RowIterator at CheckSearchResultsLV.pcf: line 43, column 61
    function sumValue_13 (CheckSearchView :  entity.CheckSearchView) : java.lang.Object {
      return CheckSearchView.GrossAmount
    }
    
    // 'value' attribute on RowIterator at CheckSearchResultsLV.pcf: line 17, column 82
    function value_59 () : gw.api.database.IQueryBeanResult<entity.CheckSearchView> {
      return CheckSearchViewList
    }
    
    property get CheckSearchViewList () : gw.api.database.IQueryBeanResult<CheckSearchView> {
      return getRequireValue("CheckSearchViewList", 0) as gw.api.database.IQueryBeanResult<CheckSearchView>
    }
    
    property set CheckSearchViewList ($arg :  gw.api.database.IQueryBeanResult<CheckSearchView>) {
      setRequireValue("CheckSearchViewList", 0, $arg)
    }
    
    property get criteria () : PaymentSearchCriteria {
      return getRequireValue("criteria", 0) as PaymentSearchCriteria
    }
    
    property set criteria ($arg :  PaymentSearchCriteria) {
      setRequireValue("criteria", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/search/checks/CheckSearchResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends CheckSearchResultsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=PayTo) at CheckSearchResultsLV.pcf: line 31, column 42
    function action_19 () : void {
      ClaimFinancialsChecksDetail.go(CheckSearchView.Claim, CheckSearchView.Check)
    }
    
    // 'action' attribute on CurrencyCell (id=Amount) at CheckSearchResultsLV.pcf: line 43, column 61
    function action_24 () : void {
      ClaimFinancialsChecksDetail.go(CheckSearchView.Claim, CheckSearchView.Check)
    }
    
    // 'action' attribute on TextCell (id=Claim) at CheckSearchResultsLV.pcf: line 49, column 48
    function action_29 () : void {
      pcf.Claim.go(CheckSearchView.Claim)
    }
    
    // 'action' attribute on TextCell (id=BulkInvoice) at CheckSearchResultsLV.pcf: line 88, column 54
    function action_54 () : void {
      EditBulkInvoiceDetail.go(CheckSearchView.Check.BulkInvoiceItem.BulkInvoice)
    }
    
    // 'action' attribute on TextCell (id=PayTo) at CheckSearchResultsLV.pcf: line 31, column 42
    function action_dest_20 () : pcf.api.Destination {
      return pcf.ClaimFinancialsChecksDetail.createDestination(CheckSearchView.Claim, CheckSearchView.Check)
    }
    
    // 'action' attribute on CurrencyCell (id=Amount) at CheckSearchResultsLV.pcf: line 43, column 61
    function action_dest_25 () : pcf.api.Destination {
      return pcf.ClaimFinancialsChecksDetail.createDestination(CheckSearchView.Claim, CheckSearchView.Check)
    }
    
    // 'action' attribute on TextCell (id=Claim) at CheckSearchResultsLV.pcf: line 49, column 48
    function action_dest_30 () : pcf.api.Destination {
      return pcf.Claim.createDestination(CheckSearchView.Claim)
    }
    
    // 'action' attribute on TextCell (id=BulkInvoice) at CheckSearchResultsLV.pcf: line 88, column 54
    function action_dest_55 () : pcf.api.Destination {
      return pcf.EditBulkInvoiceDetail.createDestination(CheckSearchView.Check.BulkInvoiceItem.BulkInvoice)
    }
    
    // 'available' attribute on TextCell (id=BulkInvoice) at CheckSearchResultsLV.pcf: line 88, column 54
    function available_51 () : java.lang.Boolean {
      return CheckSearchView.isBulked()
    }
    
    // 'outputConversion' attribute on TextCell (id=BulkInvoice) at CheckSearchResultsLV.pcf: line 88, column 54
    function outputConversion_56 (VALUE :  java.lang.String) : java.lang.String {
      return CheckSearchView.getDisplayedBulkInvoiceNumber()
    }
    
    // 'value' attribute on DateCell (id=Date) at CheckSearchResultsLV.pcf: line 25, column 27
    function valueRoot_17 () : java.lang.Object {
      return CheckSearchView
    }
    
    // 'value' attribute on DateCell (id=Date) at CheckSearchResultsLV.pcf: line 25, column 27
    function value_15 () : java.util.Date {
      return CheckSearchView.IssueDate
    }
    
    // 'value' attribute on TextCell (id=PayTo) at CheckSearchResultsLV.pcf: line 31, column 42
    function value_18 () : java.lang.String {
      return CheckSearchView.PayTo
    }
    
    // 'value' attribute on CurrencyCell (id=Amount) at CheckSearchResultsLV.pcf: line 43, column 61
    function value_23 () : gw.api.financials.CurrencyAmountPair {
      return CheckSearchView.GrossCurrencyAmount
    }
    
    // 'value' attribute on TextCell (id=Claim) at CheckSearchResultsLV.pcf: line 49, column 48
    function value_28 () : java.lang.String {
      return CheckSearchView.ClaimNumber
    }
    
    // 'value' attribute on TypeKeyCell (id=Status) at CheckSearchResultsLV.pcf: line 55, column 50
    function value_33 () : typekey.TransactionStatus {
      return CheckSearchView.Status
    }
    
    // 'value' attribute on TextCell (id=Claimant) at CheckSearchResultsLV.pcf: line 60, column 45
    function value_36 () : java.lang.String {
      return CheckSearchView.Claimant
    }
    
    // 'value' attribute on DateCell (id=DateOfService) at CheckSearchResultsLV.pcf: line 65, column 50
    function value_39 () : java.util.Date {
      return CheckSearchView.DateOfService
    }
    
    // 'value' attribute on DateCell (id=ServicePdStart) at CheckSearchResultsLV.pcf: line 70, column 51
    function value_42 () : java.util.Date {
      return CheckSearchView.ServicePdStart
    }
    
    // 'value' attribute on DateCell (id=ServicePdEnd) at CheckSearchResultsLV.pcf: line 75, column 49
    function value_45 () : java.util.Date {
      return CheckSearchView.ServicePdEnd
    }
    
    // 'value' attribute on DateCell (id=ScheduledSendDate) at CheckSearchResultsLV.pcf: line 80, column 54
    function value_48 () : java.util.Date {
      return CheckSearchView.ScheduledSendDate
    }
    
    // 'value' attribute on TextCell (id=BulkInvoice) at CheckSearchResultsLV.pcf: line 88, column 54
    function value_52 () : java.lang.String {
      return CheckSearchView.BulkInvoiceNumber
    }
    
    property get CheckSearchView () : entity.CheckSearchView {
      return getIteratedValue(1) as entity.CheckSearchView
    }
    
    
  }
  
  
}