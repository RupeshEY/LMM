package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/users/UserAttributesPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class UserAttributesPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/users/UserAttributesPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SearchPanelExpressionsImpl extends UserAttributesPopupExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at UserAttributesPopup.pcf: line 26, column 57
    function def_onEnter_1 (def :  pcf.UserAttributesSearchDV) : void {
      def.onEnter(SearchCriteria)
    }
    
    // 'def' attribute on PanelRef at UserAttributesPopup.pcf: line 28, column 54
    function def_onEnter_4 (def :  pcf.UserAttributesSearchLV) : void {
      def.onEnter(SearchResult)
    }
    
    // 'def' attribute on PanelRef at UserAttributesPopup.pcf: line 26, column 57
    function def_refreshVariables_2 (def :  pcf.UserAttributesSearchDV) : void {
      def.refreshVariables(SearchCriteria)
    }
    
    // 'def' attribute on PanelRef at UserAttributesPopup.pcf: line 28, column 54
    function def_refreshVariables_5 (def :  pcf.UserAttributesSearchLV) : void {
      def.refreshVariables(SearchResult)
    }
    
    // 'pickValue' attribute on CheckedValuesToolbarButton (id=UserAttributesPopup_SelectButton) at UserAttributesPopup.pcf: line 34, column 42
    function pickValue_3 (CheckedValues :  entity.Attribute[]) : Attribute[] {
      return CheckedValues
    }
    
    // 'searchCriteria' attribute on SearchPanel at UserAttributesPopup.pcf: line 24, column 79
    function searchCriteria_7 () : gw.api.admin.AttributeSearchCriteria {
      return new gw.api.admin.AttributeSearchCriteria()
    }
    
    // 'search' attribute on SearchPanel at UserAttributesPopup.pcf: line 24, column 79
    function search_6 () : java.lang.Object {
      return SearchCriteria.performSearch() as gw.api.database.IQueryBeanResult<Attribute>
    }
    
    property get SearchCriteria () : gw.api.admin.AttributeSearchCriteria {
      return getCriteriaValue(1) as gw.api.admin.AttributeSearchCriteria
    }
    
    property set SearchCriteria ($arg :  gw.api.admin.AttributeSearchCriteria) {
      setCriteriaValue(1, $arg)
    }
    
    property get SearchResult () : gw.api.database.IQueryBeanResult<Attribute> {
      return getResultsValue(1) as gw.api.database.IQueryBeanResult<Attribute>
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/users/UserAttributesPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserAttributesPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=UserAttributesPopup_CancelButton) at UserAttributesPopup.pcf: line 16, column 25
    function action_0 () : void {
      CurrentLocation.cancel()
    }
    
    override property get CurrentLocation () : pcf.UserAttributesPopup {
      return super.CurrentLocation as pcf.UserAttributesPopup
    }
    
    
  }
  
  
}