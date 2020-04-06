package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/recoveries/RecoverySearch.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RecoverySearchExpressions {
  @javax.annotation.Generated("config/web/pcf/search/recoveries/RecoverySearch.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RecoverySearchExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'canVisit' attribute on Page (id=RecoverySearch) at RecoverySearch.pcf: line 9, column 82
    static function canVisit_9 () : java.lang.Boolean {
      return perm.Claim.genericviewrecoveries and perm.System.viewsearch
    }
    
    // Page (id=RecoverySearch) at RecoverySearch.pcf: line 9, column 82
    static function parent_10 () : pcf.api.Destination {
      return pcf.Search.createDestination()
    }
    
    override property get CurrentLocation () : pcf.RecoverySearch {
      return super.CurrentLocation as pcf.RecoverySearch
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
  
  @javax.annotation.Generated("config/web/pcf/search/recoveries/RecoverySearch.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SearchPanelExpressionsImpl extends RecoverySearchExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=PrintButton) at RecoverySearch.pcf: line 41, column 72
    function action_3 () : void {
      gw.api.print.ListViewPrintOptionPopupAction.printListViewOnlyWithOptions(PrintTargetLV, DisplayKey.get("JSP.RecoverySearch.Search.Results"), null)
    }
    
    // 'available' attribute on ToolbarButton (id=PrintButton) at RecoverySearch.pcf: line 41, column 72
    function available_2 () : java.lang.Boolean {
      return perm.User.printlistviews
    }
    
    // 'def' attribute on PanelRef at RecoverySearch.pcf: line 30, column 59
    function def_onEnter_0 (def :  pcf.RecoverySearchDV) : void {
      def.onEnter(RecoverySearchCriteria)
    }
    
    // 'def' attribute on PanelRef at RecoverySearch.pcf: line 32, column 89
    function def_onEnter_4 (def :  pcf.RecoverySearchResultsLV) : void {
      def.onEnter(RecoverySearchViewList, RecoverySearchCriteria)
    }
    
    // 'def' attribute on PanelRef at RecoverySearch.pcf: line 30, column 59
    function def_refreshVariables_1 (def :  pcf.RecoverySearchDV) : void {
      def.refreshVariables(RecoverySearchCriteria)
    }
    
    // 'def' attribute on PanelRef at RecoverySearch.pcf: line 32, column 89
    function def_refreshVariables_5 (def :  pcf.RecoverySearchResultsLV) : void {
      def.refreshVariables(RecoverySearchViewList, RecoverySearchCriteria)
    }
    
    // 'maxSearchResults' attribute on SearchPanel at RecoverySearch.pcf: line 28, column 88
    function maxSearchResults_6 () : java.lang.Object {
      return gw.api.search.MaxSearchResults.forRecoveries()
    }
    
    // 'searchCriteria' attribute on SearchPanel at RecoverySearch.pcf: line 28, column 88
    function searchCriteria_8 () : entity.RecoverySearchCriteria {
      return new RecoverySearchCriteria()
    }
    
    // 'search' attribute on SearchPanel at RecoverySearch.pcf: line 28, column 88
    function search_7 () : java.lang.Object {
      var searchResult = RecoverySearchCriteria.performSearch(); searchHasBeenRun = ((null != searchResult) ? true : false); return searchResult
    }
    
    property get RecoverySearchCriteria () : entity.RecoverySearchCriteria {
      return getCriteriaValue(1) as entity.RecoverySearchCriteria
    }
    
    property set RecoverySearchCriteria ($arg :  entity.RecoverySearchCriteria) {
      setCriteriaValue(1, $arg)
    }
    
    property get RecoverySearchViewList () : gw.api.database.IQueryBeanResult<RecoverySearchView> {
      return getResultsValue(1) as gw.api.database.IQueryBeanResult<RecoverySearchView>
    }
    
    
  }
  
  
}