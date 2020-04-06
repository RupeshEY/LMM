package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/assignment/AssignmentPopupScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AssignmentPopupScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/assignment/AssignmentPopupScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssignmentPopupScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=AssignmentPopupScreen_CancelButton) at AssignmentPopupScreen.pcf: line 22, column 23
    function action_1 () : void {
      CurrentLocation.cancel()
    }
    
    // 'def' attribute on PanelRef at AssignmentPopupScreen.pcf: line 27, column 45
    function def_onEnter_11 (def :  pcf.FailedAssignmentsLV_ServiceRequest) : void {
      def.onEnter(AssignmentPopup)
    }
    
    // 'def' attribute on PanelRef at AssignmentPopupScreen.pcf: line 27, column 45
    function def_onEnter_13 (def :  pcf.FailedAssignmentsLV_Subrogation) : void {
      def.onEnter(AssignmentPopup)
    }
    
    // 'def' attribute on PanelRef at AssignmentPopupScreen.pcf: line 27, column 45
    function def_onEnter_15 (def :  pcf.FailedAssignmentsLV_default) : void {
      def.onEnter(AssignmentPopup)
    }
    
    // 'def' attribute on PanelRef at AssignmentPopupScreen.pcf: line 27, column 45
    function def_onEnter_3 (def :  pcf.FailedAssignmentsLV_Activity) : void {
      def.onEnter(AssignmentPopup)
    }
    
    // 'def' attribute on PanelRef at AssignmentPopupScreen.pcf: line 27, column 45
    function def_onEnter_5 (def :  pcf.FailedAssignmentsLV_Claim) : void {
      def.onEnter(AssignmentPopup)
    }
    
    // 'def' attribute on PanelRef at AssignmentPopupScreen.pcf: line 27, column 45
    function def_onEnter_7 (def :  pcf.FailedAssignmentsLV_Exposure) : void {
      def.onEnter(AssignmentPopup)
    }
    
    // 'def' attribute on PanelRef at AssignmentPopupScreen.pcf: line 27, column 45
    function def_onEnter_9 (def :  pcf.FailedAssignmentsLV_Matter) : void {
      def.onEnter(AssignmentPopup)
    }
    
    // 'def' attribute on PanelRef at AssignmentPopupScreen.pcf: line 27, column 45
    function def_refreshVariables_10 (def :  pcf.FailedAssignmentsLV_Matter) : void {
      def.refreshVariables(AssignmentPopup)
    }
    
    // 'def' attribute on PanelRef at AssignmentPopupScreen.pcf: line 27, column 45
    function def_refreshVariables_12 (def :  pcf.FailedAssignmentsLV_ServiceRequest) : void {
      def.refreshVariables(AssignmentPopup)
    }
    
    // 'def' attribute on PanelRef at AssignmentPopupScreen.pcf: line 27, column 45
    function def_refreshVariables_14 (def :  pcf.FailedAssignmentsLV_Subrogation) : void {
      def.refreshVariables(AssignmentPopup)
    }
    
    // 'def' attribute on PanelRef at AssignmentPopupScreen.pcf: line 27, column 45
    function def_refreshVariables_16 (def :  pcf.FailedAssignmentsLV_default) : void {
      def.refreshVariables(AssignmentPopup)
    }
    
    // 'def' attribute on PanelRef at AssignmentPopupScreen.pcf: line 27, column 45
    function def_refreshVariables_4 (def :  pcf.FailedAssignmentsLV_Activity) : void {
      def.refreshVariables(AssignmentPopup)
    }
    
    // 'def' attribute on PanelRef at AssignmentPopupScreen.pcf: line 27, column 45
    function def_refreshVariables_6 (def :  pcf.FailedAssignmentsLV_Claim) : void {
      def.refreshVariables(AssignmentPopup)
    }
    
    // 'def' attribute on PanelRef at AssignmentPopupScreen.pcf: line 27, column 45
    function def_refreshVariables_8 (def :  pcf.FailedAssignmentsLV_Exposure) : void {
      def.refreshVariables(AssignmentPopup)
    }
    
    // 'initialValue' attribute on Variable at AssignmentPopupScreen.pcf: line 16, column 58
    function initialValue_0 () : gw.api.contact.CCProximitySearchPageHelper {
      return new gw.api.contact.CCProximitySearchPageHelper()
    }
    
    // 'mode' attribute on PanelRef at AssignmentPopupScreen.pcf: line 27, column 45
    function mode_17 () : java.lang.Object {
      return AssignmentPopup.AssignableType.RelativeName
    }
    
    // 'visible' attribute on PanelRef at AssignmentPopupScreen.pcf: line 27, column 45
    function visible_2 () : java.lang.Boolean {
      return AssignmentPopup.hasErrors()
    }
    
    property get AssignmentPopup () : gw.api.assignment.AssignmentPopup {
      return getRequireValue("AssignmentPopup", 0) as gw.api.assignment.AssignmentPopup
    }
    
    property set AssignmentPopup ($arg :  gw.api.assignment.AssignmentPopup) {
      setRequireValue("AssignmentPopup", 0, $arg)
    }
    
    property get PageHelper () : gw.api.contact.CCProximitySearchPageHelper {
      return getVariableValue("PageHelper", 0) as gw.api.contact.CCProximitySearchPageHelper
    }
    
    property set PageHelper ($arg :  gw.api.contact.CCProximitySearchPageHelper) {
      setVariableValue("PageHelper", 0, $arg)
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    
            function createSearchCriteria(aClaim: Claim) : gw.api.assignment.CCAssignmentSearchCriteria {
              var criteria = new gw.api.assignment.CCAssignmentSearchCriteria();
              if(aClaim != null) {
                criteria.UserCriteria.Contact.initializeProximitySearch(aClaim.Addresses?.toList(), aClaim.LossLocation);
              }
              return criteria;
            }
          
        
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/assignment/AssignmentPopupScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SearchPanelExpressionsImpl extends AssignmentPopupScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=RetrieveRequested) at AssignmentPopupScreen.pcf: line 56, column 121
    function allCheckedRowsAction_23 (CheckedValues :  entity.GroupUser[], CheckedValuesErrors :  java.util.Map) : void {
      PageHelper.getDrivingDirectionsCache().getSelectedDirections(CheckedValues, SearchCriteria.getUserCriteria().getContact());
    }
    
    // 'def' attribute on PanelRef at AssignmentPopupScreen.pcf: line 40, column 81
    function def_onEnter_18 (def :  pcf.AssignmentPopupDV) : void {
      def.onEnter(AssignmentPopup, SearchResult, SearchCriteria)
    }
    
    // 'def' attribute on PanelRef at AssignmentPopupScreen.pcf: line 42, column 195
    function def_onEnter_20 (def :  pcf.AssignmentSearchDV) : void {
      def.onEnter(gw.api.upgrade.Coercions.makeArray<typekey.AssignmentSearchType>(AssignmentPopup.Picker.AllowedAssignmentSearchTypes), SearchCriteria, PageHelper, claim)
    }
    
    // 'def' attribute on PanelRef at AssignmentPopupScreen.pcf: line 45, column 111
    function def_onEnter_25 (def :  pcf.AssignmentUserLV) : void {
      def.onEnter(SearchResult == null ? null : SearchResult.getUsers() as gw.api.database.IQueryBeanResult<GroupUser>, PageHelper, SearchCriteria.getUserCriteria().getContact())
    }
    
    // 'def' attribute on PanelRef at AssignmentPopupScreen.pcf: line 61, column 112
    function def_onEnter_28 (def :  pcf.AssignmentGroupLV) : void {
      def.onEnter(SearchResult == null ? null : SearchResult.getGroups())
    }
    
    // 'def' attribute on PanelRef at AssignmentPopupScreen.pcf: line 69, column 112
    function def_onEnter_31 (def :  pcf.AssignmentQueueLV) : void {
      def.onEnter(SearchResult == null ? null : SearchResult.getQueues())
    }
    
    // 'def' attribute on PanelRef at AssignmentPopupScreen.pcf: line 40, column 81
    function def_refreshVariables_19 (def :  pcf.AssignmentPopupDV) : void {
      def.refreshVariables(AssignmentPopup, SearchResult, SearchCriteria)
    }
    
    // 'def' attribute on PanelRef at AssignmentPopupScreen.pcf: line 42, column 195
    function def_refreshVariables_21 (def :  pcf.AssignmentSearchDV) : void {
      def.refreshVariables(gw.api.upgrade.Coercions.makeArray<typekey.AssignmentSearchType>(AssignmentPopup.Picker.AllowedAssignmentSearchTypes), SearchCriteria, PageHelper, claim)
    }
    
    // 'def' attribute on PanelRef at AssignmentPopupScreen.pcf: line 45, column 111
    function def_refreshVariables_26 (def :  pcf.AssignmentUserLV) : void {
      def.refreshVariables(SearchResult == null ? null : SearchResult.getUsers() as gw.api.database.IQueryBeanResult<GroupUser>, PageHelper, SearchCriteria.getUserCriteria().getContact())
    }
    
    // 'def' attribute on PanelRef at AssignmentPopupScreen.pcf: line 61, column 112
    function def_refreshVariables_29 (def :  pcf.AssignmentGroupLV) : void {
      def.refreshVariables(SearchResult == null ? null : SearchResult.getGroups())
    }
    
    // 'def' attribute on PanelRef at AssignmentPopupScreen.pcf: line 69, column 112
    function def_refreshVariables_32 (def :  pcf.AssignmentQueueLV) : void {
      def.refreshVariables(SearchResult == null ? null : SearchResult.getQueues())
    }
    
    // 'searchCriteria' attribute on SearchPanel at AssignmentPopupScreen.pcf: line 38, column 77
    function searchCriteria_34 () : gw.api.assignment.CCAssignmentSearchCriteria {
      return createSearchCriteria(claim)
    }
    
    // 'search' attribute on SearchPanel at AssignmentPopupScreen.pcf: line 38, column 77
    function search_33 () : java.lang.Object {
      return SearchCriteria.performSearchByProximity(CurrentLocation, PageHelper)
    }
    
    // 'visible' attribute on CheckedValuesToolbarButton (id=RetrieveRequested) at AssignmentPopupScreen.pcf: line 56, column 121
    function visible_22 () : java.lang.Boolean {
      return SearchCriteria.SearchType == TC_USER and SearchCriteria.UserCriteria.Contact.isProximitySearch()
    }
    
    // 'visible' attribute on PanelRef at AssignmentPopupScreen.pcf: line 45, column 111
    function visible_24 () : java.lang.Boolean {
      return (SearchCriteria.SearchType == TC_USER) and (AssignmentPopup.SelectionType == TC_FROMSEARCH)
    }
    
    // 'visible' attribute on PanelRef at AssignmentPopupScreen.pcf: line 61, column 112
    function visible_27 () : java.lang.Boolean {
      return (SearchCriteria.SearchType == TC_GROUP) and (AssignmentPopup.SelectionType == TC_FROMSEARCH)
    }
    
    // 'visible' attribute on PanelRef at AssignmentPopupScreen.pcf: line 69, column 112
    function visible_30 () : java.lang.Boolean {
      return (SearchCriteria.SearchType == TC_QUEUE) and (AssignmentPopup.SelectionType == TC_FROMSEARCH)
    }
    
    property get SearchCriteria () : gw.api.assignment.CCAssignmentSearchCriteria {
      return getCriteriaValue(1) as gw.api.assignment.CCAssignmentSearchCriteria
    }
    
    property set SearchCriteria ($arg :  gw.api.assignment.CCAssignmentSearchCriteria) {
      setCriteriaValue(1, $arg)
    }
    
    property get SearchResult () : gw.api.assignment.AssignmentProximitySearchResult {
      return getResultsValue(1) as gw.api.assignment.AssignmentProximitySearchResult
    }
    
    
  }
  
  
}