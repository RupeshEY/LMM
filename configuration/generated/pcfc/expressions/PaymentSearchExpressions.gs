package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/checks/PaymentSearch.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PaymentSearchExpressions {
  @javax.annotation.Generated("config/web/pcf/search/checks/PaymentSearch.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PaymentSearchExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'canVisit' attribute on Page (id=PaymentSearch) at PaymentSearch.pcf: line 9, column 78
    static function canVisit_9 () : java.lang.Boolean {
      return perm.Payment.genericview and perm.System.viewsearch
    }
    
    // Page (id=PaymentSearch) at PaymentSearch.pcf: line 9, column 78
    static function parent_10 () : pcf.api.Destination {
      return pcf.Search.createDestination()
    }
    
    override property get CurrentLocation () : pcf.PaymentSearch {
      return super.CurrentLocation as pcf.PaymentSearch
    }
    
    property get PrintTargetLV () : java.lang.String {
      return getVariableValue("PrintTargetLV", 0) as java.lang.String
    }
    
    property set PrintTargetLV ($arg :  java.lang.String) {
      setVariableValue("PrintTargetLV", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/search/checks/PaymentSearch.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SearchPanelExpressionsImpl extends PaymentSearchExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=PaymentSearch_PrintButton) at PaymentSearch.pcf: line 38, column 29
    function action_3 () : void {
      gw.api.print.ListViewPrintOptionPopupAction.printListViewOnlyWithOptions(PrintTargetLV, DisplayKey.get("JSP.PaymentSearch.Search.Results"), null)
    }
    
    // 'available' attribute on ToolbarButton (id=PaymentSearch_PrintButton) at PaymentSearch.pcf: line 38, column 29
    function available_2 () : java.lang.Boolean {
      return perm.User.printlistviews
    }
    
    // 'def' attribute on PanelRef at PaymentSearch.pcf: line 26, column 57
    function def_onEnter_0 (def :  pcf.PaymentSearchDV) : void {
      def.onEnter(PaymentSearchCriteria)
    }
    
    // 'def' attribute on PanelRef at PaymentSearch.pcf: line 28, column 82
    function def_onEnter_4 (def :  pcf.CheckSearchResultsLV) : void {
      def.onEnter(CheckSearchViewList, PaymentSearchCriteria)
    }
    
    // 'def' attribute on PanelRef at PaymentSearch.pcf: line 26, column 57
    function def_refreshVariables_1 (def :  pcf.PaymentSearchDV) : void {
      def.refreshVariables(PaymentSearchCriteria)
    }
    
    // 'def' attribute on PanelRef at PaymentSearch.pcf: line 28, column 82
    function def_refreshVariables_5 (def :  pcf.CheckSearchResultsLV) : void {
      def.refreshVariables(CheckSearchViewList, PaymentSearchCriteria)
    }
    
    // 'maxSearchResults' attribute on SearchPanel at PaymentSearch.pcf: line 24, column 85
    function maxSearchResults_6 () : java.lang.Object {
      return gw.api.search.MaxSearchResults.forChecks()
    }
    
    // 'searchCriteria' attribute on SearchPanel at PaymentSearch.pcf: line 24, column 85
    function searchCriteria_8 () : entity.PaymentSearchCriteria {
      return new PaymentSearchCriteria()
    }
    
    // 'search' attribute on SearchPanel at PaymentSearch.pcf: line 24, column 85
    function search_7 () : java.lang.Object {
      return PaymentSearchCriteria.performSearch()
    }
    
    property get CheckSearchViewList () : gw.api.database.IQueryBeanResult<CheckSearchView> {
      return getResultsValue(1) as gw.api.database.IQueryBeanResult<CheckSearchView>
    }
    
    property get PaymentSearchCriteria () : entity.PaymentSearchCriteria {
      return getCriteriaValue(1) as entity.PaymentSearchCriteria
    }
    
    property set PaymentSearchCriteria ($arg :  entity.PaymentSearchCriteria) {
      setCriteriaValue(1, $arg)
    }
    
    
  }
  
  
}