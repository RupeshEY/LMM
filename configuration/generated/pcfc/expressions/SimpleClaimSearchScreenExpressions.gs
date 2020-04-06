package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/claims/SimpleClaimSearchScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class SimpleClaimSearchScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/search/claims/SimpleClaimSearchScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SearchPanelExpressionsImpl extends SimpleClaimSearchScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'actionAvailable' attribute on TextValue (id=archiveSearchLink) at SimpleClaimSearchScreen.pcf: line 48, column 64
    function actionAvailable_9 () : java.lang.Boolean {
      return searchHelper.archiveSearchLinkAvailable()
    }
    
    // 'action' attribute on ToolbarButton (id=SimpleClaimSearchScreen_PrintButton) at SimpleClaimSearchScreen.pcf: line 41, column 27
    function action_4 () : void {
      gw.api.print.ListViewPrintOptionPopupAction.printListViewOnlyWithOptions(PrintTargetLV, DisplayKey.get("JSP.ClaimSearch.Search.Results"), null)
    }
    
    // 'action' attribute on TextValue (id=archiveSearchLink) at SimpleClaimSearchScreen.pcf: line 48, column 64
    function action_8 () : void {
      searchHelper.modifySearchCriteriaForAdvanceArchive(); ClaimSearch.go()
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=ClaimSearchScreen_AssignButton) at SimpleClaimSearchScreen.pcf: line 34, column 27
    function allCheckedRowsAction_2 (CheckedValues :  entity.ClaimSearchView[], CheckedValuesErrors :  java.util.Map) : void {
      AssignClaimsPopup.push(new gw.api.claim.ClaimAssignmentPopup(CheckedValues))
    }
    
    // 'available' attribute on ToolbarButton (id=SimpleClaimSearchScreen_PrintButton) at SimpleClaimSearchScreen.pcf: line 41, column 27
    function available_3 () : java.lang.Boolean {
      return perm.User.printlistviews
    }
    
    // 'def' attribute on PanelRef at SimpleClaimSearchScreen.pcf: line 22, column 59
    function def_onEnter_0 (def :  pcf.SimpleClaimSearchDV) : void {
      def.onEnter(searchHelper.Criteria)
    }
    
    // 'def' attribute on PanelRef at SimpleClaimSearchScreen.pcf: line 24, column 69
    function def_onEnter_11 (def :  pcf.SimpleClaimSearchResultsLV) : void {
      def.onEnter(SimpleClaimSearchViewList)
    }
    
    // 'def' attribute on PanelRef at SimpleClaimSearchScreen.pcf: line 22, column 59
    function def_refreshVariables_1 (def :  pcf.SimpleClaimSearchDV) : void {
      def.refreshVariables(searchHelper.Criteria)
    }
    
    // 'def' attribute on PanelRef at SimpleClaimSearchScreen.pcf: line 24, column 69
    function def_refreshVariables_12 (def :  pcf.SimpleClaimSearchResultsLV) : void {
      def.refreshVariables(SimpleClaimSearchViewList)
    }
    
    // 'maxSearchResults' attribute on SearchPanel at SimpleClaimSearchScreen.pcf: line 20, column 83
    function maxSearchResults_13 () : java.lang.Object {
      return searchHelper.MaxResults
    }
    
    // 'searchCriteria' attribute on SearchPanel at SimpleClaimSearchScreen.pcf: line 20, column 83
    function searchCriteria_15 () : gw.api.search.SimpleClaimSearchHelper {
      return new gw.api.search.SimpleClaimSearchHelper()
    }
    
    // 'search' attribute on SearchPanel at SimpleClaimSearchScreen.pcf: line 20, column 83
    function search_14 () : java.lang.Object {
      new gw.api.name.SearchNameOwner(searchHelper.Criteria.NameCriteria).clearNonvisibleFields(); return searchHelper.searchWithECFCriteria()
    }
    
    // 'value' attribute on ToolbarInput (id=archiveSearchLink) at SimpleClaimSearchScreen.pcf: line 48, column 64
    function value_6 () : java.lang.String {
      return searchHelper.archiveSearchLinkLabel()
    }
    
    // 'visible' attribute on ToolbarInput (id=archiveSearchLink) at SimpleClaimSearchScreen.pcf: line 48, column 64
    function visible_5 () : java.lang.Boolean {
      return searchHelper.archiveSearchLinkVisible()
    }
    
    property get SimpleClaimSearchViewList () : gw.api.database.IQueryBeanResult<ClaimSearchView> {
      return getResultsValue(1) as gw.api.database.IQueryBeanResult<ClaimSearchView>
    }
    
    property get searchHelper () : gw.api.search.SimpleClaimSearchHelper {
      return getCriteriaValue(1) as gw.api.search.SimpleClaimSearchHelper
    }
    
    property set searchHelper ($arg :  gw.api.search.SimpleClaimSearchHelper) {
      setCriteriaValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/search/claims/SimpleClaimSearchScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SimpleClaimSearchScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    property get PrintTargetLV () : java.lang.String {
      return getVariableValue("PrintTargetLV", 0) as java.lang.String
    }
    
    property set PrintTargetLV ($arg :  java.lang.String) {
      setVariableValue("PrintTargetLV", 0, $arg)
    }
    
    
  }
  
  
}