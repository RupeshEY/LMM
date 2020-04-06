package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/groupsearch/GroupSearchPickerScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class GroupSearchPickerScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/groupsearch/GroupSearchPickerScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GroupSearchPickerScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    property get RestrictedGroup () : Group {
      return getRequireValue("RestrictedGroup", 0) as Group
    }
    
    property set RestrictedGroup ($arg :  Group) {
      setRequireValue("RestrictedGroup", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/groupsearch/GroupSearchPickerScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SearchPanelExpressionsImpl extends GroupSearchPickerScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at GroupSearchPickerScreen.pcf: line 18, column 46
    function def_onEnter_0 (def :  pcf.GroupSearchDV) : void {
      def.onEnter(SearchCriteria)
    }
    
    // 'def' attribute on PanelRef at GroupSearchPickerScreen.pcf: line 20, column 67
    function def_onEnter_2 (def :  pcf.GroupSearchPickerResultsLV) : void {
      def.onEnter(Groups, RestrictedGroup)
    }
    
    // 'def' attribute on PanelRef at GroupSearchPickerScreen.pcf: line 18, column 46
    function def_refreshVariables_1 (def :  pcf.GroupSearchDV) : void {
      def.refreshVariables(SearchCriteria)
    }
    
    // 'def' attribute on PanelRef at GroupSearchPickerScreen.pcf: line 20, column 67
    function def_refreshVariables_3 (def :  pcf.GroupSearchPickerResultsLV) : void {
      def.refreshVariables(Groups, RestrictedGroup)
    }
    
    // 'searchCriteria' attribute on SearchPanel at GroupSearchPickerScreen.pcf: line 16, column 73
    function searchCriteria_5 () : entity.GroupSearchCriteria {
      return new GroupSearchCriteria()
    }
    
    // 'search' attribute on SearchPanel at GroupSearchPickerScreen.pcf: line 16, column 73
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