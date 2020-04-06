package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/usersandsecurity/AdminGroupSearchPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AdminGroupSearchPageExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/usersandsecurity/AdminGroupSearchPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AdminGroupSearchPageExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'canVisit' attribute on Page (id=AdminGroupSearchPage) at AdminGroupSearchPage.pcf: line 9, column 63
    static function canVisit_6 () : java.lang.Boolean {
      return perm.Group.viewtree
    }
    
    // Page (id=AdminGroupSearchPage) at AdminGroupSearchPage.pcf: line 9, column 63
    static function parent_7 () : pcf.api.Destination {
      return pcf.UsersAndSecurity.createDestination()
    }
    
    override property get CurrentLocation () : pcf.AdminGroupSearchPage {
      return super.CurrentLocation as pcf.AdminGroupSearchPage
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/usersandsecurity/AdminGroupSearchPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SearchPanelExpressionsImpl extends AdminGroupSearchPageExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at AdminGroupSearchPage.pcf: line 20, column 48
    function def_onEnter_0 (def :  pcf.GroupSearchDV) : void {
      def.onEnter(SearchCriteria)
    }
    
    // 'def' attribute on PanelRef at AdminGroupSearchPage.pcf: line 22, column 46
    function def_onEnter_2 (def :  pcf.GroupSearchResultsLV) : void {
      def.onEnter(Groups)
    }
    
    // 'def' attribute on PanelRef at AdminGroupSearchPage.pcf: line 20, column 48
    function def_refreshVariables_1 (def :  pcf.GroupSearchDV) : void {
      def.refreshVariables(SearchCriteria)
    }
    
    // 'def' attribute on PanelRef at AdminGroupSearchPage.pcf: line 22, column 46
    function def_refreshVariables_3 (def :  pcf.GroupSearchResultsLV) : void {
      def.refreshVariables(Groups)
    }
    
    // 'searchCriteria' attribute on SearchPanel at AdminGroupSearchPage.pcf: line 18, column 75
    function searchCriteria_5 () : entity.GroupSearchCriteria {
      return new GroupSearchCriteria()
    }
    
    // 'search' attribute on SearchPanel at AdminGroupSearchPage.pcf: line 18, column 75
    function search_4 () : java.lang.Object {
      return SearchCriteria.performSearch() as gw.api.database.IQueryBeanResult<Group>
    }
    
    property get Groups () : gw.api.database.IQueryBeanResult<Group> {
      return getResultsValue(1) as gw.api.database.IQueryBeanResult<Group>
    }
    
    property get SearchCriteria () : entity.GroupSearchCriteria {
      return getCriteriaValue(1) as entity.GroupSearchCriteria
    }
    
    property set SearchCriteria ($arg :  entity.GroupSearchCriteria) {
      setCriteriaValue(1, $arg)
    }
    
    
  }
  
  
}