package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/assignment/GroupUserPickerPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class GroupUserPickerPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/assignment/GroupUserPickerPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GroupUserPickerPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    override property get CurrentLocation () : pcf.GroupUserPickerPopup {
      return super.CurrentLocation as pcf.GroupUserPickerPopup
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/assignment/GroupUserPickerPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SearchPanelExpressionsImpl extends GroupUserPickerPopupExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at GroupUserPickerPopup.pcf: line 21, column 52
    function def_onEnter_0 (def :  pcf.GroupUserSearchDV) : void {
      def.onEnter(SearchCriteria)
    }
    
    // 'def' attribute on PanelRef at GroupUserPickerPopup.pcf: line 23, column 43
    function def_onEnter_2 (def :  pcf.GroupUserLV) : void {
      def.onEnter(SearchResult)
    }
    
    // 'def' attribute on PanelRef at GroupUserPickerPopup.pcf: line 21, column 52
    function def_refreshVariables_1 (def :  pcf.GroupUserSearchDV) : void {
      def.refreshVariables(SearchCriteria)
    }
    
    // 'def' attribute on PanelRef at GroupUserPickerPopup.pcf: line 23, column 43
    function def_refreshVariables_3 (def :  pcf.GroupUserLV) : void {
      def.refreshVariables(SearchResult)
    }
    
    // 'searchCriteria' attribute on SearchPanel at GroupUserPickerPopup.pcf: line 19, column 79
    function searchCriteria_5 () : entity.UserSearchCriteria {
      return new UserSearchCriteria()
    }
    
    // 'search' attribute on SearchPanel at GroupUserPickerPopup.pcf: line 19, column 79
    function search_4 () : java.lang.Object {
      return SearchCriteria.performGroupUserSearch() as gw.api.database.IQueryBeanResult<GroupUser>
    }
    
    property get SearchCriteria () : entity.UserSearchCriteria {
      return getCriteriaValue(1) as entity.UserSearchCriteria
    }
    
    property set SearchCriteria ($arg :  entity.UserSearchCriteria) {
      setCriteriaValue(1, $arg)
    }
    
    property get SearchResult () : gw.api.database.IQueryBeanResult<GroupUser> {
      return getResultsValue(1) as gw.api.database.IQueryBeanResult<GroupUser>
    }
    
    
  }
  
  
}