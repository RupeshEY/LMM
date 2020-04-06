package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/usersearch/UserSearchPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class UserSearchPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/usersearch/UserSearchPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SearchPanelExpressionsImpl extends UserSearchPopupExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=RetrieveRequested) at UserSearchPopup.pcf: line 46, column 69
    function allCheckedRowsAction_5 (CheckedValues :  entity.User[], CheckedValuesErrors :  java.util.Map) : void {
      PageHelper.getDrivingDirectionsCache().getSelectedDirections(CheckedValues, SearchCriteria.getContact());
    }
    
    // 'def' attribute on PanelRef at UserSearchPopup.pcf: line 33, column 58
    function def_onEnter_2 (def :  pcf.UserSearchDV) : void {
      def.onEnter(SearchCriteria,PageHelper)
    }
    
    // 'def' attribute on PanelRef at UserSearchPopup.pcf: line 35, column 93
    function def_onEnter_6 (def :  pcf.UserSearchResultsLV) : void {
      def.onEnter(searchResults, true, PageHelper, SearchCriteria, false)
    }
    
    // 'def' attribute on PanelRef at UserSearchPopup.pcf: line 33, column 58
    function def_refreshVariables_3 (def :  pcf.UserSearchDV) : void {
      def.refreshVariables(SearchCriteria,PageHelper)
    }
    
    // 'def' attribute on PanelRef at UserSearchPopup.pcf: line 35, column 93
    function def_refreshVariables_7 (def :  pcf.UserSearchResultsLV) : void {
      def.refreshVariables(searchResults, true, PageHelper, SearchCriteria, false)
    }
    
    // 'searchCriteria' attribute on SearchPanel at UserSearchPopup.pcf: line 31, column 74
    function searchCriteria_9 () : entity.UserSearchCriteria {
      return new UserSearchCriteria()
    }
    
    // 'search' attribute on SearchPanel at UserSearchPopup.pcf: line 31, column 74
    function search_8 () : java.lang.Object {
      return SearchCriteria.performSearchByProximity(CurrentLocation, PageHelper) as gw.api.database.IQueryBeanResult<User>
    }
    
    // 'visible' attribute on CheckedValuesToolbarButton (id=RetrieveRequested) at UserSearchPopup.pcf: line 46, column 69
    function visible_4 () : java.lang.Boolean {
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
  
  @javax.annotation.Generated("config/web/pcf/shared/usersearch/UserSearchPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserSearchPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
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
    
    // 'initialValue' attribute on Variable at UserSearchPopup.pcf: line 18, column 58
    function initialValue_0 () : gw.api.contact.CCProximitySearchPageHelper {
      return new gw.api.contact.CCProximitySearchPageHelper()
    }
    
    // 'initialValue' attribute on Variable at UserSearchPopup.pcf: line 22, column 28
    function initialValue_1 () : Organization {
      return null
    }
    
    override property get CurrentLocation () : pcf.UserSearchPopup {
      return super.CurrentLocation as pcf.UserSearchPopup
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
  
  
}