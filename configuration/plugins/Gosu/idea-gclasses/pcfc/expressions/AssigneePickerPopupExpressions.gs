package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/assignment/AssigneePickerPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AssigneePickerPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/assignment/AssigneePickerPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssigneePickerPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (AssigneePicker :  gw.api.assignment.AssigneePicker) : int {
      return 0
    }
    
    static function __constructorIndex (AssigneePicker :  gw.api.assignment.AssigneePicker, Claim :  Claim) : int {
      return 1
    }
    
    // 'initialValue' attribute on Variable at AssigneePickerPopup.pcf: line 19, column 58
    function initialValue_0 () : gw.api.contact.CCProximitySearchPageHelper {
      return new gw.api.contact.CCProximitySearchPageHelper()
    }
    
    property get AssigneePicker () : gw.api.assignment.AssigneePicker {
      return getVariableValue("AssigneePicker", 0) as gw.api.assignment.AssigneePicker
    }
    
    property set AssigneePicker ($arg :  gw.api.assignment.AssigneePicker) {
      setVariableValue("AssigneePicker", 0, $arg)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.AssigneePickerPopup {
      return super.CurrentLocation as pcf.AssigneePickerPopup
    }
    
    property get PageHelper () : gw.api.contact.CCProximitySearchPageHelper {
      return getVariableValue("PageHelper", 0) as gw.api.contact.CCProximitySearchPageHelper
    }
    
    property set PageHelper ($arg :  gw.api.contact.CCProximitySearchPageHelper) {
      setVariableValue("PageHelper", 0, $arg)
    }
    
    
            function createSearchCriteria(aClaim: Claim) : gw.api.assignment.CCAssignmentSearchCriteria {
              var criteria = new gw.api.assignment.CCAssignmentSearchCriteria();
              if(aClaim != null) {
                criteria.UserCriteria.Contact.initializeProximitySearch(aClaim.Addresses?.toList(), aClaim.LossLocation);
              }
    
              // If TC_USER is not allowed as a search type, then set the search type to something else
              // as the CCAssignmentSearchCriteria defaults the search type to TC_USER
              if(!AssigneePicker.AllowedAssignmentSearchTypes.isEmpty()
                  && !AssigneePicker.AllowedAssignmentSearchTypes.contains(AssignmentSearchType.TC_USER)) {
                criteria.setSearchType(AssigneePicker.AllowedAssignmentSearchTypes.first() as AssignmentSearchType);
              }
              return criteria;
            }
          
        
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/assignment/AssigneePickerPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SearchPanelExpressionsImpl extends AssigneePickerPopupExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=RetrieveRequested) at AssigneePickerPopup.pcf: line 44, column 123
    function allCheckedRowsAction_4 (CheckedValues :  entity.GroupUser[], CheckedValuesErrors :  java.util.Map) : void {
      PageHelper.getDrivingDirectionsCache().getSelectedDirections(CheckedValues, SearchCriteria.getUserCriteria().getContact());
    }
    
    // 'def' attribute on PanelRef at AssigneePickerPopup.pcf: line 33, column 189
    function def_onEnter_1 (def :  pcf.AssignmentSearchDV) : void {
      def.onEnter(gw.api.upgrade.Coercions.makeArray<typekey.AssignmentSearchType>(AssigneePicker.AllowedAssignmentSearchTypes), SearchCriteria, PageHelper, Claim)
    }
    
    // 'def' attribute on PanelRef at AssigneePickerPopup.pcf: line 54, column 59
    function def_onEnter_12 (def :  pcf.AssignmentQueueLV) : void {
      def.onEnter(SearchResult == null ? null : SearchResult.getQueues())
    }
    
    // 'def' attribute on PanelRef at AssigneePickerPopup.pcf: line 36, column 58
    function def_onEnter_6 (def :  pcf.AssignmentUserLV) : void {
      def.onEnter(SearchResult == null ? null : SearchResult.getUsers() as gw.api.database.IQueryBeanResult<GroupUser>, PageHelper, SearchCriteria.getUserCriteria().getContact())
    }
    
    // 'def' attribute on PanelRef at AssigneePickerPopup.pcf: line 49, column 59
    function def_onEnter_9 (def :  pcf.AssignmentGroupLV) : void {
      def.onEnter(SearchResult == null ? null : SearchResult.getGroups())
    }
    
    // 'def' attribute on PanelRef at AssigneePickerPopup.pcf: line 49, column 59
    function def_refreshVariables_10 (def :  pcf.AssignmentGroupLV) : void {
      def.refreshVariables(SearchResult == null ? null : SearchResult.getGroups())
    }
    
    // 'def' attribute on PanelRef at AssigneePickerPopup.pcf: line 54, column 59
    function def_refreshVariables_13 (def :  pcf.AssignmentQueueLV) : void {
      def.refreshVariables(SearchResult == null ? null : SearchResult.getQueues())
    }
    
    // 'def' attribute on PanelRef at AssigneePickerPopup.pcf: line 33, column 189
    function def_refreshVariables_2 (def :  pcf.AssignmentSearchDV) : void {
      def.refreshVariables(gw.api.upgrade.Coercions.makeArray<typekey.AssignmentSearchType>(AssigneePicker.AllowedAssignmentSearchTypes), SearchCriteria, PageHelper, Claim)
    }
    
    // 'def' attribute on PanelRef at AssigneePickerPopup.pcf: line 36, column 58
    function def_refreshVariables_7 (def :  pcf.AssignmentUserLV) : void {
      def.refreshVariables(SearchResult == null ? null : SearchResult.getUsers() as gw.api.database.IQueryBeanResult<GroupUser>, PageHelper, SearchCriteria.getUserCriteria().getContact())
    }
    
    // 'searchCriteria' attribute on SearchPanel at AssigneePickerPopup.pcf: line 31, column 79
    function searchCriteria_15 () : gw.api.assignment.CCAssignmentSearchCriteria {
      return createSearchCriteria(Claim)
    }
    
    // 'search' attribute on SearchPanel at AssigneePickerPopup.pcf: line 31, column 79
    function search_14 () : java.lang.Object {
      return SearchCriteria.performSearchByProximity(CurrentLocation, PageHelper)
    }
    
    // 'visible' attribute on PanelRef at AssigneePickerPopup.pcf: line 54, column 59
    function visible_11 () : java.lang.Boolean {
      return SearchCriteria.SearchType == TC_QUEUE
    }
    
    // 'visible' attribute on CheckedValuesToolbarButton (id=RetrieveRequested) at AssigneePickerPopup.pcf: line 44, column 123
    function visible_3 () : java.lang.Boolean {
      return SearchCriteria.SearchType == TC_USER and SearchCriteria.UserCriteria.Contact.isProximitySearch()
    }
    
    // 'visible' attribute on PanelRef at AssigneePickerPopup.pcf: line 36, column 58
    function visible_5 () : java.lang.Boolean {
      return SearchCriteria.SearchType == TC_USER
    }
    
    // 'visible' attribute on PanelRef at AssigneePickerPopup.pcf: line 49, column 59
    function visible_8 () : java.lang.Boolean {
      return SearchCriteria.SearchType == TC_GROUP
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