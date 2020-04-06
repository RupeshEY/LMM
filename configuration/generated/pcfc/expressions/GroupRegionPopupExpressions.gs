package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/groups/GroupRegionPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class GroupRegionPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/groups/GroupRegionPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GroupRegionPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    override property get CurrentLocation () : pcf.GroupRegionPopup {
      return super.CurrentLocation as pcf.GroupRegionPopup
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/groups/GroupRegionPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SearchPanelExpressionsImpl extends GroupRegionPopupExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at GroupRegionPopup.pcf: line 19, column 49
    function def_onEnter_0 (def :  pcf.RegionSearchDV) : void {
      def.onEnter(SearchCriteria)
    }
    
    // 'def' attribute on PanelRef at GroupRegionPopup.pcf: line 21, column 66
    function def_onEnter_3 (def :  pcf.RegionSearchResultsLV) : void {
      def.onEnter(SearchResult, false, true)
    }
    
    // 'def' attribute on PanelRef at GroupRegionPopup.pcf: line 19, column 49
    function def_refreshVariables_1 (def :  pcf.RegionSearchDV) : void {
      def.refreshVariables(SearchCriteria)
    }
    
    // 'def' attribute on PanelRef at GroupRegionPopup.pcf: line 21, column 66
    function def_refreshVariables_4 (def :  pcf.RegionSearchResultsLV) : void {
      def.refreshVariables(SearchResult, false, true)
    }
    
    // 'pickValue' attribute on CheckedValuesToolbarButton (id=GroupRegionPopup_SelectButton) at GroupRegionPopup.pcf: line 31, column 42
    function pickValue_2 (CheckedValues :  entity.Region[]) : Region[] {
      return CheckedValues
    }
    
    // 'searchCriteria' attribute on SearchPanel at GroupRegionPopup.pcf: line 17, column 76
    function searchCriteria_6 () : gw.api.admin.RegionSearchCriteria {
      return new gw.api.admin.RegionSearchCriteria()
    }
    
    // 'search' attribute on SearchPanel at GroupRegionPopup.pcf: line 17, column 76
    function search_5 () : java.lang.Object {
      return SearchCriteria.performSearch() as gw.api.database.IQueryBeanResult<Region>
    }
    
    property get SearchCriteria () : gw.api.admin.RegionSearchCriteria {
      return getCriteriaValue(1) as gw.api.admin.RegionSearchCriteria
    }
    
    property set SearchCriteria ($arg :  gw.api.admin.RegionSearchCriteria) {
      setCriteriaValue(1, $arg)
    }
    
    property get SearchResult () : gw.api.database.IQueryBeanResult<Region> {
      return getResultsValue(1) as gw.api.database.IQueryBeanResult<Region>
    }
    
    
  }
  
  
}