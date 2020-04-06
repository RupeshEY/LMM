package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/regions/RegionsPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RegionsPageExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/regions/RegionsPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RegionsPageExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'canVisit' attribute on Page (id=RegionsPage) at RegionsPage.pcf: line 9, column 59
    static function canVisit_15 () : java.lang.Boolean {
      return perm.Region.view
    }
    
    // 'initialValue' attribute on Variable at RegionsPage.pcf: line 14, column 40
    function initialValue_0 () : gw.admin.RegionsUIHelper {
      return new gw.admin.RegionsUIHelper()
    }
    
    // 'parent' attribute on Page (id=RegionsPage) at RegionsPage.pcf: line 9, column 59
    static function parent_16 () : pcf.api.Destination {
      return pcf.RegionsForward.createDestination()
    }
    
    // 'visible' attribute on Verbatim at RegionsPage.pcf: line 22, column 97
    function visible_1 () : java.lang.Boolean {
      return gw.api.admin.BaseAdminUtil.getRegionZoneTypesForDefaultCountry().length == 0
    }
    
    override property get CurrentLocation () : pcf.RegionsPage {
      return super.CurrentLocation as pcf.RegionsPage
    }
    
    property get uiHelper () : gw.admin.RegionsUIHelper {
      return getVariableValue("uiHelper", 0) as gw.admin.RegionsUIHelper
    }
    
    property set uiHelper ($arg :  gw.admin.RegionsUIHelper) {
      setVariableValue("uiHelper", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/regions/RegionsPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SearchPanelExpressionsImpl extends RegionsPageExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=Regions_AddRegionButton) at RegionsPage.pcf: line 48, column 29
    function action_6 () : void {
      NewRegion.go()
    }
    
    // 'action' attribute on ToolbarButton (id=Regions_AddRegionButton) at RegionsPage.pcf: line 48, column 29
    function action_dest_7 () : pcf.api.Destination {
      return pcf.NewRegion.createDestination()
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=Regions_DeleteButton) at RegionsPage.pcf: line 56, column 45
    function allCheckedRowsAction_9 (CheckedValues :  entity.Region[], CheckedValuesErrors :  java.util.Map) : void {
      gw.api.admin.BaseAdminUtil.deleteRegions(CheckedValues)
    }
    
    // 'def' attribute on PanelRef at RegionsPage.pcf: line 36, column 61
    function def_onEnter_11 (def :  pcf.RegionSearchResultsLV) : void {
      def.onEnter(allRegions,true,true)
    }
    
    // 'def' attribute on PanelRef at RegionsPage.pcf: line 34, column 52
    function def_onEnter_3 (def :  pcf.RegionSearchDV) : void {
      def.onEnter(SearchCriteria)
    }
    
    // 'def' attribute on PanelRef at RegionsPage.pcf: line 36, column 61
    function def_refreshVariables_12 (def :  pcf.RegionSearchResultsLV) : void {
      def.refreshVariables(allRegions,true,true)
    }
    
    // 'def' attribute on PanelRef at RegionsPage.pcf: line 34, column 52
    function def_refreshVariables_4 (def :  pcf.RegionSearchDV) : void {
      def.refreshVariables(SearchCriteria)
    }
    
    // 'searchCriteria' attribute on SearchPanel at RegionsPage.pcf: line 31, column 76
    function searchCriteria_14 () : gw.api.admin.RegionSearchCriteria {
      return new gw.api.admin.RegionSearchCriteria()
    }
    
    // 'search' attribute on SearchPanel at RegionsPage.pcf: line 31, column 76
    function search_13 () : java.lang.Object {
      return SearchCriteria.performSearch() as gw.api.database.IQueryBeanResult<Region>
    }
    
    // 'visible' attribute on Toolbar (id=RegionSearchResultsLV_tb) at RegionsPage.pcf: line 43, column 100
    function visible_10 () : java.lang.Boolean {
      return gw.api.admin.BaseAdminUtil.getRegionZoneTypesForDefaultCountry().length != 0
    }
    
    // 'visible' attribute on PanelRef at RegionsPage.pcf: line 34, column 52
    function visible_2 () : java.lang.Boolean {
      return uiHelper.searchPanelVisible()
    }
    
    // 'visible' attribute on CheckedValuesToolbarButton (id=Regions_DeleteButton) at RegionsPage.pcf: line 56, column 45
    function visible_8 () : java.lang.Boolean {
      return perm.Region.delete
    }
    
    property get SearchCriteria () : gw.api.admin.RegionSearchCriteria {
      return getCriteriaValue(1) as gw.api.admin.RegionSearchCriteria
    }
    
    property set SearchCriteria ($arg :  gw.api.admin.RegionSearchCriteria) {
      setCriteriaValue(1, $arg)
    }
    
    property get allRegions () : gw.api.database.IQueryBeanResult<Region> {
      return getResultsValue(1) as gw.api.database.IQueryBeanResult<Region>
    }
    
    
  }
  
  
}