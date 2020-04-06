package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/claims/ClaimSearchScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSearchScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/search/claims/ClaimSearchScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSearchScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
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
    
    property get archiveSearchEnabled () : boolean {
      return getRequireValue("archiveSearchEnabled", 0) as java.lang.Boolean
    }
    
    property set archiveSearchEnabled ($arg :  boolean) {
      setRequireValue("archiveSearchEnabled", 0, $arg)
    }
    
    function isArchived(csc : ClaimSearchCriteria) : boolean {
          return csc.ClaimSearchType == ClaimSearchType.TC_ARCHIVED;
          }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/search/claims/ClaimSearchScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SearchPanelExpressionsImpl extends ClaimSearchScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=ClaimSearchScreen_PrintButton) at ClaimSearchScreen.pcf: line 56, column 27
    function action_7 () : void {
      gw.api.print.ListViewPrintOptionPopupAction.printListViewOnlyWithOptions(PrintTargetLV, DisplayKey.get("JSP.ClaimSearch.Search.Results"), null)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=ClaimSearchScreen_AssignButton) at ClaimSearchScreen.pcf: line 40, column 62
    function allCheckedRowsAction_3 (CheckedValues :  gw.cc.claim.ArchivedClaimCompatible[], CheckedValuesErrors :  java.util.Map) : void {
      AssignClaimsPopup.push(new gw.api.claim.ClaimAssignmentPopup(CheckedValues.cast(ClaimSearchView)))
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=ClaimSearchScreen_RetrieveButton) at ClaimSearchScreen.pcf: line 49, column 61
    function allCheckedRowsAction_5 (CheckedValues :  gw.cc.claim.ArchivedClaimCompatible[], CheckedValuesErrors :  java.util.Map) : void {
      ArchiveClaimRetrievePopup.push(new gw.api.claim.ClaimArchiveRestoreSet(CheckedValues))
    }
    
    // 'available' attribute on ToolbarButton (id=ClaimSearchScreen_PrintButton) at ClaimSearchScreen.pcf: line 56, column 27
    function available_6 () : java.lang.Boolean {
      return perm.User.printlistviews
    }
    
    // 'def' attribute on PanelRef at ClaimSearchScreen.pcf: line 26, column 78
    function def_onEnter_0 (def :  pcf.ClaimSearchDV) : void {
      def.onEnter(criteriaWrapper.Criteria, archiveSearchEnabled)
    }
    
    // 'def' attribute on PanelRef at ClaimSearchScreen.pcf: line 29, column 62
    function def_onEnter_10 (def :  pcf.ClaimSearchResultsLV_archived) : void {
      def.onEnter(claimSearchResults)
    }
    
    // 'def' attribute on PanelRef at ClaimSearchScreen.pcf: line 29, column 62
    function def_onEnter_8 (def :  pcf.ClaimSearchResultsLV_active) : void {
      def.onEnter(claimSearchResults)
    }
    
    // 'def' attribute on PanelRef at ClaimSearchScreen.pcf: line 26, column 78
    function def_refreshVariables_1 (def :  pcf.ClaimSearchDV) : void {
      def.refreshVariables(criteriaWrapper.Criteria, archiveSearchEnabled)
    }
    
    // 'def' attribute on PanelRef at ClaimSearchScreen.pcf: line 29, column 62
    function def_refreshVariables_11 (def :  pcf.ClaimSearchResultsLV_archived) : void {
      def.refreshVariables(claimSearchResults)
    }
    
    // 'def' attribute on PanelRef at ClaimSearchScreen.pcf: line 29, column 62
    function def_refreshVariables_9 (def :  pcf.ClaimSearchResultsLV_active) : void {
      def.refreshVariables(claimSearchResults)
    }
    
    // 'maxSearchResults' attribute on SearchPanel at ClaimSearchScreen.pcf: line 24, column 60
    function maxSearchResults_13 () : java.lang.Object {
      return gw.api.search.MaxSearchResults.forClaims()
    }
    
    // 'mode' attribute on PanelRef at ClaimSearchScreen.pcf: line 29, column 62
    function mode_12 () : java.lang.Object {
      return criteriaWrapper.Criteria.ClaimSearchType.Code
    }
    
    // 'searchCriteria' attribute on SearchPanel at ClaimSearchScreen.pcf: line 24, column 60
    function searchCriteria_15 () : gw.cc.claim.ClaimSearchCriteriaWrapper {
      return gw.api.claim.ClaimUtil.getClaimSearchCriteria()
    }
    
    // 'search' attribute on SearchPanel at ClaimSearchScreen.pcf: line 24, column 60
    function search_14 () : java.lang.Object {
      new gw.api.name.SearchNameOwner(criteriaWrapper.Criteria.NameCriteria).clearNonvisibleFields(); return criteriaWrapper.Criteria.performAdvancedSearchWithoutSummary()
    }
    
    // 'visible' attribute on CheckedValuesToolbarButton (id=ClaimSearchScreen_AssignButton) at ClaimSearchScreen.pcf: line 40, column 62
    function visible_2 () : java.lang.Boolean {
      return !isArchived(criteriaWrapper.Criteria)
    }
    
    // 'visible' attribute on CheckedValuesToolbarButton (id=ClaimSearchScreen_RetrieveButton) at ClaimSearchScreen.pcf: line 49, column 61
    function visible_4 () : java.lang.Boolean {
      return isArchived(criteriaWrapper.Criteria)
    }
    
    property get claimSearchResults () : gw.api.search.ClaimSearchResults {
      return getResultsValue(1) as gw.api.search.ClaimSearchResults
    }
    
    property get criteriaWrapper () : gw.cc.claim.ClaimSearchCriteriaWrapper {
      return getCriteriaValue(1) as gw.cc.claim.ClaimSearchCriteriaWrapper
    }
    
    property set criteriaWrapper ($arg :  gw.cc.claim.ClaimSearchCriteriaWrapper) {
      setCriteriaValue(1, $arg)
    }
    
    
  }
  
  
}