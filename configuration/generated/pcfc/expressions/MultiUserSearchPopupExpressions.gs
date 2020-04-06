package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/usersearch/MultiUserSearchPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class MultiUserSearchPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/usersearch/MultiUserSearchPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MultiUserSearchPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    static function __constructorIndex (Organization :  Organization) : int {
      return 1
    }
    
    // 'initialValue' attribute on Variable at MultiUserSearchPopup.pcf: line 16, column 58
    function initialValue_0 () : gw.api.contact.CCProximitySearchPageHelper {
      return new gw.api.contact.CCProximitySearchPageHelper()
    }
    
    // 'initialValue' attribute on Variable at MultiUserSearchPopup.pcf: line 20, column 28
    function initialValue_1 () : Organization {
      return null
    }
    
    override property get CurrentLocation () : pcf.MultiUserSearchPopup {
      return super.CurrentLocation as pcf.MultiUserSearchPopup
    }
    
    property get Organization () : Organization {
      return getVariableValue("Organization", 0) as Organization
    }
    
    property set Organization ($arg :  Organization) {
      setVariableValue("Organization", 0, $arg)
    }
    
    property get PageHelper () : gw.api.contact.CCProximitySearchPageHelper {
      return getVariableValue("PageHelper", 0) as gw.api.contact.CCProximitySearchPageHelper
    }
    
    property set PageHelper ($arg :  gw.api.contact.CCProximitySearchPageHelper) {
      setVariableValue("PageHelper", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/usersearch/MultiUserSearchPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SearchPanelExpressionsImpl extends MultiUserSearchPopupExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=RetrieveRequested) at MultiUserSearchPopup.pcf: line 49, column 69
    function allCheckedRowsAction_6 (CheckedValues :  entity.User[], CheckedValuesErrors :  java.util.Map) : void {
      PageHelper.getDrivingDirectionsCache().getSelectedDirections(CheckedValues, SearchCriteria.getContact());
    }
    
    // 'def' attribute on PanelRef at MultiUserSearchPopup.pcf: line 31, column 58
    function def_onEnter_2 (def :  pcf.UserSearchDV) : void {
      def.onEnter(SearchCriteria,PageHelper)
    }
    
    // 'def' attribute on PanelRef at MultiUserSearchPopup.pcf: line 33, column 93
    function def_onEnter_7 (def :  pcf.UserSearchResultsLV) : void {
      def.onEnter(searchResults, false, PageHelper, SearchCriteria, true)
    }
    
    // 'def' attribute on PanelRef at MultiUserSearchPopup.pcf: line 31, column 58
    function def_refreshVariables_3 (def :  pcf.UserSearchDV) : void {
      def.refreshVariables(SearchCriteria,PageHelper)
    }
    
    // 'def' attribute on PanelRef at MultiUserSearchPopup.pcf: line 33, column 93
    function def_refreshVariables_8 (def :  pcf.UserSearchResultsLV) : void {
      def.refreshVariables(searchResults, false, PageHelper, SearchCriteria, true)
    }
    
    // 'pickValue' attribute on CheckedValuesToolbarButton (id=MultiUserSearchPopup_SelectButton) at MultiUserSearchPopup.pcf: line 42, column 42
    function pickValue_4 (CheckedValues :  entity.User[]) : User[] {
      return CheckedValues
    }
    
    // 'searchCriteria' attribute on SearchPanel at MultiUserSearchPopup.pcf: line 29, column 74
    function searchCriteria_10 () : entity.UserSearchCriteria {
      return new UserSearchCriteria()
    }
    
    // 'search' attribute on SearchPanel at MultiUserSearchPopup.pcf: line 29, column 74
    function search_9 () : java.lang.Object {
      return SearchCriteria.performSearchByProximity(CurrentLocation, PageHelper) as gw.api.database.IQueryBeanResult<User>
    }
    
    // 'visible' attribute on CheckedValuesToolbarButton (id=RetrieveRequested) at MultiUserSearchPopup.pcf: line 49, column 69
    function visible_5 () : java.lang.Boolean {
      return SearchCriteria.Contact.isProximitySearch()
    }
    
    property get SearchCriteria () : entity.UserSearchCriteria {
      return getCriteriaValue(1) as entity.UserSearchCriteria
    }
    
    property set SearchCriteria ($arg :  entity.UserSearchCriteria) {
      setCriteriaValue(1, $arg)
    }
    
    property get searchResults () : gw.api.database.IQueryBeanResult<User> {
      return getResultsValue(1) as gw.api.database.IQueryBeanResult<User>
    }
    
    
  }
  
  
}