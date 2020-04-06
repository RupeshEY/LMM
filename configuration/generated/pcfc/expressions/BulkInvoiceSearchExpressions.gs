package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/bulkpay/BulkInvoiceSearch.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class BulkInvoiceSearchExpressions {
  @javax.annotation.Generated("config/web/pcf/search/bulkpay/BulkInvoiceSearch.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BulkInvoiceSearchExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'canVisit' attribute on Page (id=BulkInvoiceSearch) at BulkInvoiceSearch.pcf: line 9, column 86
    static function canVisit_7 () : java.lang.Boolean {
      return perm.BulkInvoice.view and perm.System.viewsearch
    }
    
    // Page (id=BulkInvoiceSearch) at BulkInvoiceSearch.pcf: line 9, column 86
    static function parent_8 () : pcf.api.Destination {
      return pcf.Search.createDestination()
    }
    
    override property get CurrentLocation () : pcf.BulkInvoiceSearch {
      return super.CurrentLocation as pcf.BulkInvoiceSearch
    }
    
    property get PrintTargetLV () : java.lang.String {
      return getVariableValue("PrintTargetLV", 0) as java.lang.String
    }
    
    property set PrintTargetLV ($arg :  java.lang.String) {
      setVariableValue("PrintTargetLV", 0, $arg)
    }
    
    property get searchHasBeenRun () : boolean {
      return getVariableValue("searchHasBeenRun", 0) as java.lang.Boolean
    }
    
    property set searchHasBeenRun ($arg :  boolean) {
      setVariableValue("searchHasBeenRun", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/search/bulkpay/BulkInvoiceSearch.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SearchPanelExpressionsImpl extends BulkInvoiceSearchExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at BulkInvoiceSearch.pcf: line 30, column 65
    function def_onEnter_0 (def :  pcf.BulkInvoiceSearchDV) : void {
      def.onEnter(BulkInvoiceSearchCriteria)
    }
    
    // 'def' attribute on PanelRef at BulkInvoiceSearch.pcf: line 32, column 98
    function def_onEnter_2 (def :  pcf.BulkInvoiceSearchResultsLV) : void {
      def.onEnter(BulkInvoiceSearchViewList, BulkInvoiceSearchCriteria)
    }
    
    // 'def' attribute on PanelRef at BulkInvoiceSearch.pcf: line 30, column 65
    function def_refreshVariables_1 (def :  pcf.BulkInvoiceSearchDV) : void {
      def.refreshVariables(BulkInvoiceSearchCriteria)
    }
    
    // 'def' attribute on PanelRef at BulkInvoiceSearch.pcf: line 32, column 98
    function def_refreshVariables_3 (def :  pcf.BulkInvoiceSearchResultsLV) : void {
      def.refreshVariables(BulkInvoiceSearchViewList, BulkInvoiceSearchCriteria)
    }
    
    // 'maxSearchResults' attribute on SearchPanel at BulkInvoiceSearch.pcf: line 28, column 91
    function maxSearchResults_4 () : java.lang.Object {
      return gw.api.search.MaxSearchResults.forBulkInvoices()
    }
    
    // 'searchCriteria' attribute on SearchPanel at BulkInvoiceSearch.pcf: line 28, column 91
    function searchCriteria_6 () : entity.BulkInvoiceSearchCriteria {
      return new BulkInvoiceSearchCriteria()
    }
    
    // 'search' attribute on SearchPanel at BulkInvoiceSearch.pcf: line 28, column 91
    function search_5 () : java.lang.Object {
      var searchResult = BulkInvoiceSearchCriteria.performSearch(); searchHasBeenRun = ((null != searchResult) ? true : false); return searchResult
    }
    
    property get BulkInvoiceSearchCriteria () : entity.BulkInvoiceSearchCriteria {
      return getCriteriaValue(1) as entity.BulkInvoiceSearchCriteria
    }
    
    property set BulkInvoiceSearchCriteria ($arg :  entity.BulkInvoiceSearchCriteria) {
      setCriteriaValue(1, $arg)
    }
    
    property get BulkInvoiceSearchViewList () : gw.api.database.IQueryBeanResult<BulkInvoiceSearchView> {
      return getResultsValue(1) as gw.api.database.IQueryBeanResult<BulkInvoiceSearchView>
    }
    
    
  }
  
  
}