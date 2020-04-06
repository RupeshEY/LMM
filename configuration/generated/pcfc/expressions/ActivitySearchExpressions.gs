package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/activities/ActivitySearch.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ActivitySearchExpressions {
  @javax.annotation.Generated("config/web/pcf/search/activities/ActivitySearch.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivitySearchExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'canVisit' attribute on Page (id=ActivitySearch) at ActivitySearch.pcf: line 9, column 82
    static function canVisit_10 () : java.lang.Boolean {
      return perm.Claim.genericviewactivity and perm.System.viewsearch
    }
    
    // Page (id=ActivitySearch) at ActivitySearch.pcf: line 9, column 82
    static function parent_11 () : pcf.api.Destination {
      return pcf.Search.createDestination()
    }
    
    override property get CurrentLocation () : pcf.ActivitySearch {
      return super.CurrentLocation as pcf.ActivitySearch
    }
    
    property get PrintTargetLV () : java.lang.String {
      return getVariableValue("PrintTargetLV", 0) as java.lang.String
    }
    
    property set PrintTargetLV ($arg :  java.lang.String) {
      setVariableValue("PrintTargetLV", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/search/activities/ActivitySearch.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SearchPanelExpressionsImpl extends ActivitySearchExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=ActivitySearch_PrintButton) at ActivitySearch.pcf: line 44, column 29
    function action_4 () : void {
      gw.api.print.ListViewPrintOptionPopupAction.printListViewOnlyWithOptions(PrintTargetLV, DisplayKey.get("JSP.ActivitySearch.Search.Results"), null)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=ActivitySearch_AssignButton) at ActivitySearch.pcf: line 37, column 29
    function allCheckedRowsAction_2 (CheckedValues :  entity.ActivitySearchView[], CheckedValuesErrors :  java.util.Map) : void {
      AssignActivitiesPopup.push(new gw.api.activity.ActivityAssignmentPopup(CheckedValues))
    }
    
    // 'available' attribute on ToolbarButton (id=ActivitySearch_PrintButton) at ActivitySearch.pcf: line 44, column 29
    function available_3 () : java.lang.Boolean {
      return perm.User.printlistviews
    }
    
    // 'def' attribute on PanelRef at ActivitySearch.pcf: line 25, column 59
    function def_onEnter_0 (def :  pcf.ActivitySearchDV) : void {
      def.onEnter(ActivitySearchCriteria)
    }
    
    // 'def' attribute on PanelRef at ActivitySearch.pcf: line 27, column 65
    function def_onEnter_5 (def :  pcf.ActivitySearchResultsLV) : void {
      def.onEnter(ActivitySearchViewList)
    }
    
    // 'def' attribute on PanelRef at ActivitySearch.pcf: line 25, column 59
    function def_refreshVariables_1 (def :  pcf.ActivitySearchDV) : void {
      def.refreshVariables(ActivitySearchCriteria)
    }
    
    // 'def' attribute on PanelRef at ActivitySearch.pcf: line 27, column 65
    function def_refreshVariables_6 (def :  pcf.ActivitySearchResultsLV) : void {
      def.refreshVariables(ActivitySearchViewList)
    }
    
    // 'maxSearchResults' attribute on SearchPanel at ActivitySearch.pcf: line 23, column 88
    function maxSearchResults_7 () : java.lang.Object {
      return gw.api.search.MaxSearchResults.forActivities()
    }
    
    // 'searchCriteria' attribute on SearchPanel at ActivitySearch.pcf: line 23, column 88
    function searchCriteria_9 () : entity.ActivitySearchCriteria {
      return new ActivitySearchCriteria()
    }
    
    // 'search' attribute on SearchPanel at ActivitySearch.pcf: line 23, column 88
    function search_8 () : java.lang.Object {
      return ActivitySearchCriteria.performSearch()
    }
    
    property get ActivitySearchCriteria () : entity.ActivitySearchCriteria {
      return getCriteriaValue(1) as entity.ActivitySearchCriteria
    }
    
    property set ActivitySearchCriteria ($arg :  entity.ActivitySearchCriteria) {
      setCriteriaValue(1, $arg)
    }
    
    property get ActivitySearchViewList () : gw.api.database.IQueryBeanResult<ActivitySearchView> {
      return getResultsValue(1) as gw.api.database.IQueryBeanResult<ActivitySearchView>
    }
    
    
  }
  
  
}