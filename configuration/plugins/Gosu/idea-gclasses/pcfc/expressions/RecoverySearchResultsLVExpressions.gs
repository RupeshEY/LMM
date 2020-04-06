package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/recoveries/RecoverySearchResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RecoverySearchResultsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/search/recoveries/RecoverySearchResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends RecoverySearchResultsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Payer) at RecoverySearchResultsLV.pcf: line 31, column 56
    function action_16 () : void {
      ClaimContactDetailPopup.push(RecoverySearchView.ClaimContact, RecoverySearchView.Claim)
    }
    
    // 'action' attribute on CurrencyCell (id=Amount) at RecoverySearchResultsLV.pcf: line 43, column 49
    function action_21 () : void {
      ClaimFinancialsTransactionsDetail.go(RecoverySearchView.Claim, RecoverySearchView.Recovery)
    }
    
    // 'action' attribute on TextCell (id=Claim) at RecoverySearchResultsLV.pcf: line 49, column 51
    function action_26 () : void {
      pcf.Claim.go(RecoverySearchView.Claim)
    }
    
    // 'action' attribute on TextCell (id=Payer) at RecoverySearchResultsLV.pcf: line 31, column 56
    function action_dest_17 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(RecoverySearchView.ClaimContact, RecoverySearchView.Claim)
    }
    
    // 'action' attribute on CurrencyCell (id=Amount) at RecoverySearchResultsLV.pcf: line 43, column 49
    function action_dest_22 () : pcf.api.Destination {
      return pcf.ClaimFinancialsTransactionsDetail.createDestination(RecoverySearchView.Claim, RecoverySearchView.Recovery)
    }
    
    // 'action' attribute on TextCell (id=Claim) at RecoverySearchResultsLV.pcf: line 49, column 51
    function action_dest_27 () : pcf.api.Destination {
      return pcf.Claim.createDestination(RecoverySearchView.Claim)
    }
    
    // 'value' attribute on DateCell (id=CreateDate) at RecoverySearchResultsLV.pcf: line 25, column 50
    function valueRoot_14 () : java.lang.Object {
      return RecoverySearchView
    }
    
    // 'value' attribute on DateCell (id=CreateDate) at RecoverySearchResultsLV.pcf: line 25, column 50
    function value_12 () : java.util.Date {
      return RecoverySearchView.CreateTime
    }
    
    // 'value' attribute on TextCell (id=Payer) at RecoverySearchResultsLV.pcf: line 31, column 56
    function value_15 () : java.lang.String {
      return RecoverySearchView.ClaimContactName
    }
    
    // 'value' attribute on CurrencyCell (id=Amount) at RecoverySearchResultsLV.pcf: line 43, column 49
    function value_20 () : gw.api.financials.IMoney {
      return RecoverySearchView.CurrencyAmount
    }
    
    // 'value' attribute on TextCell (id=Claim) at RecoverySearchResultsLV.pcf: line 49, column 51
    function value_25 () : java.lang.String {
      return RecoverySearchView.ClaimNumber
    }
    
    // 'value' attribute on TypeKeyCell (id=Status) at RecoverySearchResultsLV.pcf: line 55, column 50
    function value_30 () : typekey.TransactionStatus {
      return RecoverySearchView.Status
    }
    
    // 'value' attribute on TypeKeyCell (id=CostType) at RecoverySearchResultsLV.pcf: line 61, column 41
    function value_33 () : typekey.CostType {
      return RecoverySearchView.CostType
    }
    
    // 'value' attribute on TypeKeyCell (id=RecoveryCategory) at RecoverySearchResultsLV.pcf: line 67, column 49
    function value_36 () : typekey.RecoveryCategory {
      return RecoverySearchView.RecoveryCategory
    }
    
    // 'value' attribute on TextCell (id=CreateUser) at RecoverySearchResultsLV.pcf: line 72, column 50
    function value_39 () : java.lang.String {
      return RecoverySearchView.CreateUser
    }
    
    property get RecoverySearchView () : entity.RecoverySearchView {
      return getIteratedValue(1) as entity.RecoverySearchView
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/search/recoveries/RecoverySearchResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RecoverySearchResultsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'footerSumFormat' attribute on RowIterator at RecoverySearchResultsLV.pcf: line 43, column 49
    function format_9 () : java.lang.String {
      return gw.api.util.CCCurrencyUtil.getCurrencyFormatExpressionForRender(criteria.CurrencyForLastSearch)
    }
    
    // 'footerLabel' attribute on RowIterator at RecoverySearchResultsLV.pcf: line 25, column 50
    function label_8 () : java.lang.Object {
      return criteria.ShowSumRowForLastSearch ? DisplayKey.get("LV.Financials.RecoverySearchResults.Total") : null
    }
    
    // 'value' attribute on RowIterator at RecoverySearchResultsLV.pcf: line 25, column 50
    function sortValue_0 (RecoverySearchView :  entity.RecoverySearchView) : java.lang.Object {
      return RecoverySearchView.CreateTime
    }
    
    // 'value' attribute on RowIterator at RecoverySearchResultsLV.pcf: line 31, column 56
    function sortValue_1 (RecoverySearchView :  entity.RecoverySearchView) : java.lang.Object {
      return RecoverySearchView.ClaimContactName
    }
    
    // 'sortBy' attribute on RowIterator at RecoverySearchResultsLV.pcf: line 43, column 49
    function sortValue_2 (RecoverySearchView :  entity.RecoverySearchView) : java.lang.Object {
      return RecoverySearchView.Amount
    }
    
    // 'value' attribute on RowIterator at RecoverySearchResultsLV.pcf: line 49, column 51
    function sortValue_3 (RecoverySearchView :  entity.RecoverySearchView) : java.lang.Object {
      return RecoverySearchView.ClaimNumber
    }
    
    // 'value' attribute on RowIterator at RecoverySearchResultsLV.pcf: line 55, column 50
    function sortValue_4 (RecoverySearchView :  entity.RecoverySearchView) : java.lang.Object {
      return RecoverySearchView.Status
    }
    
    // 'value' attribute on RowIterator at RecoverySearchResultsLV.pcf: line 61, column 41
    function sortValue_5 (RecoverySearchView :  entity.RecoverySearchView) : java.lang.Object {
      return RecoverySearchView.CostType
    }
    
    // 'value' attribute on RowIterator at RecoverySearchResultsLV.pcf: line 67, column 49
    function sortValue_6 (RecoverySearchView :  entity.RecoverySearchView) : java.lang.Object {
      return RecoverySearchView.RecoveryCategory
    }
    
    // 'value' attribute on RowIterator at RecoverySearchResultsLV.pcf: line 72, column 50
    function sortValue_7 (RecoverySearchView :  entity.RecoverySearchView) : java.lang.Object {
      return RecoverySearchView.CreateUser
    }
    
    // '$$sumValue' attribute on RowIterator at RecoverySearchResultsLV.pcf: line 43, column 49
    function sumValueRoot_11 (RecoverySearchView :  entity.RecoverySearchView) : java.lang.Object {
      return RecoverySearchView
    }
    
    // 'footerSumValue' attribute on RowIterator at RecoverySearchResultsLV.pcf: line 43, column 49
    function sumValue_10 (RecoverySearchView :  entity.RecoverySearchView) : java.lang.Object {
      return RecoverySearchView.Amount
    }
    
    // 'value' attribute on RowIterator at RecoverySearchResultsLV.pcf: line 18, column 85
    function value_42 () : gw.api.database.IQueryBeanResult<entity.RecoverySearchView> {
      return RecoverySearchViewList
    }
    
    property get RecoverySearchViewList () : gw.api.database.IQueryBeanResult<RecoverySearchView> {
      return getRequireValue("RecoverySearchViewList", 0) as gw.api.database.IQueryBeanResult<RecoverySearchView>
    }
    
    property set RecoverySearchViewList ($arg :  gw.api.database.IQueryBeanResult<RecoverySearchView>) {
      setRequireValue("RecoverySearchViewList", 0, $arg)
    }
    
    property get criteria () : RecoverySearchCriteria {
      return getRequireValue("criteria", 0) as RecoverySearchCriteria
    }
    
    property set criteria ($arg :  RecoverySearchCriteria) {
      setRequireValue("criteria", 0, $arg)
    }
    
    
  }
  
  
}