package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/claims/FreeTextClaimSearchScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FreeTextClaimSearchScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/search/claims/FreeTextClaimSearchScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FreeTextClaimSearchScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
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
    
    property get dismissInvalidSearchCriteriaAlert () : boolean {
      return getVariableValue("dismissInvalidSearchCriteriaAlert", 0) as java.lang.Boolean
    }
    
    property set dismissInvalidSearchCriteriaAlert ($arg :  boolean) {
      setVariableValue("dismissInvalidSearchCriteriaAlert", 0, $arg)
    }
    
    function isArchived(csc : ClaimSearchCriteria) : boolean {
          return csc.FreeTextClaimSearchType == FreeTextClaimSearchType.TC_BYCONTACTINFOARCHIVE;
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/search/claims/FreeTextClaimSearchScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SearchPanelExpressionsImpl extends FreeTextClaimSearchScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=ClaimSearchScreen_PrintButton) at FreeTextClaimSearchScreen.pcf: line 50, column 27
    function action_5 () : void {
      gw.api.print.ListViewPrintOptionPopupAction.printListViewOnlyWithOptions(PrintTargetLV, DisplayKey.get("JSP.ClaimSearch.Search.Results"), null)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=ClaimSearchScreen_AssignButton) at FreeTextClaimSearchScreen.pcf: line 43, column 62
    function allCheckedRowsAction_3 (CheckedValues :  FreeTextClaimSearchEntity[], CheckedValuesErrors :  java.util.Map) : void {
      AssignClaimsPopup.push(new gw.api.claim.ClaimAssignmentPopup(CheckedValues))
    }
    
    // 'available' attribute on ToolbarButton (id=ClaimSearchScreen_PrintButton) at FreeTextClaimSearchScreen.pcf: line 50, column 27
    function available_4 () : java.lang.Boolean {
      return perm.User.printlistviews
    }
    
    // 'def' attribute on PanelRef at FreeTextClaimSearchScreen.pcf: line 29, column 86
    function def_onEnter_0 (def :  pcf.FreeTextClaimSearchDV) : void {
      def.onEnter(criteriaWrapper.Criteria, archiveSearchEnabled)
    }
    
    // 'def' attribute on PanelRef at FreeTextClaimSearchScreen.pcf: line 32, column 70
    function def_onEnter_6 (def :  pcf.FreeTextClaimSearchResultsLV) : void {
      def.onEnter(claimSearchResults)
    }
    
    // 'def' attribute on PanelRef at FreeTextClaimSearchScreen.pcf: line 29, column 86
    function def_refreshVariables_1 (def :  pcf.FreeTextClaimSearchDV) : void {
      def.refreshVariables(criteriaWrapper.Criteria, archiveSearchEnabled)
    }
    
    // 'def' attribute on PanelRef at FreeTextClaimSearchScreen.pcf: line 32, column 70
    function def_refreshVariables_7 (def :  pcf.FreeTextClaimSearchResultsLV) : void {
      def.refreshVariables(claimSearchResults)
    }
    
    // 'maxSearchResults' attribute on SearchPanel at FreeTextClaimSearchScreen.pcf: line 27, column 68
    function maxSearchResults_9 () : java.lang.Object {
      return java.lang.Integer.MAX_VALUE // gw.api.search.MaxSearchResults.forClaims()
    }
    
    // 'mode' attribute on PanelRef at FreeTextClaimSearchScreen.pcf: line 32, column 70
    function mode_8 () : java.lang.Object {
      return criteriaWrapper.Criteria.FreeTextClaimSearchType.Code
    }
    
    // 'searchCriteria' attribute on SearchPanel at FreeTextClaimSearchScreen.pcf: line 27, column 68
    function searchCriteria_11 () : gw.cc.claim.ClaimSearchCriteriaWrapper {
      return gw.api.claim.ClaimUtil.getClaimSearchCriteria()
    }
    
    // 'search' attribute on SearchPanel at FreeTextClaimSearchScreen.pcf: line 27, column 68
    function search_10 () : java.lang.Object {
      return criteriaWrapper.Criteria.performFreeTextSearch(isArchived(criteriaWrapper.Criteria))
    }
    
    // 'visible' attribute on CheckedValuesToolbarButton (id=ClaimSearchScreen_AssignButton) at FreeTextClaimSearchScreen.pcf: line 43, column 62
    function visible_2 () : java.lang.Boolean {
      return !isArchived(criteriaWrapper.Criteria)
    }
    
    property get claimSearchResults () : gw.api.search.FreeTextClaimSearchResults {
      return getResultsValue(1) as gw.api.search.FreeTextClaimSearchResults
    }
    
    property get criteriaWrapper () : gw.cc.claim.ClaimSearchCriteriaWrapper {
      return getCriteriaValue(1) as gw.cc.claim.ClaimSearchCriteriaWrapper
    }
    
    property set criteriaWrapper ($arg :  gw.cc.claim.ClaimSearchCriteriaWrapper) {
      setCriteriaValue(1, $arg)
    }
    
    
  }
  
  
}