package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/usersandsecurity/AdminUserSearchPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AdminUserSearchPageExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/usersandsecurity/AdminUserSearchPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AdminUserSearchPageExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'canVisit' attribute on Page (id=AdminUserSearchPage) at AdminUserSearchPage.pcf: line 9, column 62
    static function canVisit_9 () : java.lang.Boolean {
      return perm.Group.viewtree
    }
    
    // 'initialValue' attribute on Variable at AdminUserSearchPage.pcf: line 15, column 58
    function initialValue_0 () : gw.api.contact.CCProximitySearchPageHelper {
      return new gw.api.contact.CCProximitySearchPageHelper()
    }
    
    // Page (id=AdminUserSearchPage) at AdminUserSearchPage.pcf: line 9, column 62
    static function parent_10 () : pcf.api.Destination {
      return pcf.UsersAndSecurity.createDestination()
    }
    
    override property get CurrentLocation () : pcf.AdminUserSearchPage {
      return super.CurrentLocation as pcf.AdminUserSearchPage
    }
    
    property get PageHelper () : gw.api.contact.CCProximitySearchPageHelper {
      return getVariableValue("PageHelper", 0) as gw.api.contact.CCProximitySearchPageHelper
    }
    
    property set PageHelper ($arg :  gw.api.contact.CCProximitySearchPageHelper) {
      setVariableValue("PageHelper", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/usersandsecurity/AdminUserSearchPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SearchPanelExpressionsImpl extends AdminUserSearchPageExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=RetrieveRequested) at AdminUserSearchPage.pcf: line 39, column 69
    function allCheckedRowsAction_4 (CheckedValues :  entity.User[], CheckedValuesErrors :  java.util.Map) : void {
      PageHelper.getDrivingDirectionsCache().getSelectedDirections(CheckedValues, SearchCriteria.getContact());
    }
    
    // 'def' attribute on PanelRef at AdminUserSearchPage.pcf: line 26, column 59
    function def_onEnter_1 (def :  pcf.UserSearchDV) : void {
      def.onEnter(SearchCriteria, PageHelper)
    }
    
    // 'def' attribute on PanelRef at AdminUserSearchPage.pcf: line 28, column 91
    function def_onEnter_5 (def :  pcf.AdminUserSearchResultsLV) : void {
      def.onEnter(searchResults, PageHelper, SearchCriteria, true)
    }
    
    // 'def' attribute on PanelRef at AdminUserSearchPage.pcf: line 26, column 59
    function def_refreshVariables_2 (def :  pcf.UserSearchDV) : void {
      def.refreshVariables(SearchCriteria, PageHelper)
    }
    
    // 'def' attribute on PanelRef at AdminUserSearchPage.pcf: line 28, column 91
    function def_refreshVariables_6 (def :  pcf.AdminUserSearchResultsLV) : void {
      def.refreshVariables(searchResults, PageHelper, SearchCriteria, true)
    }
    
    // 'searchCriteria' attribute on SearchPanel at AdminUserSearchPage.pcf: line 24, column 74
    function searchCriteria_8 () : entity.UserSearchCriteria {
      return new UserSearchCriteria()
    }
    
    // 'search' attribute on SearchPanel at AdminUserSearchPage.pcf: line 24, column 74
    function search_7 () : java.lang.Object {
      new gw.api.name.UserSearchNameOwner(SearchCriteria.Contact).clearNonvisibleFields(); return SearchCriteria.performSearchByProximity(CurrentLocation, PageHelper) as gw.api.database.IQueryBeanResult<User>
    }
    
    // 'visible' attribute on CheckedValuesToolbarButton (id=RetrieveRequested) at AdminUserSearchPage.pcf: line 39, column 69
    function visible_3 () : java.lang.Boolean {
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