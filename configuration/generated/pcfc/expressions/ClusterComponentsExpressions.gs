package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/cluster/ClusterComponents.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClusterComponentsExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/cluster/ClusterComponents.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClusterComponentsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=DownloadReport) at ClusterComponents.pcf: line 19, column 64
    function action_1 () : void {
      ClusterComponentsDownloadConfigurePopup.push()
    }
    
    // 'action' attribute on ToolbarButton (id=FilterByComponent) at ClusterComponents.pcf: line 40, column 259
    function action_12 () : void {
      ClusterComponentsFilterByComponentPopup.push(data)
    }
    
    // 'action' attribute on ToolbarButton (id=RefreshButton) at ClusterComponents.pcf: line 44, column 63
    function action_15 () : void {
      data.reload()
    }
    
    // 'action' attribute on ToolbarButton (id=FilterByComponent) at ClusterComponents.pcf: line 40, column 259
    function action_dest_13 () : pcf.api.Destination {
      return pcf.ClusterComponentsFilterByComponentPopup.createDestination(data)
    }
    
    // 'action' attribute on ToolbarButton (id=DownloadReport) at ClusterComponents.pcf: line 19, column 64
    function action_dest_2 () : pcf.api.Destination {
      return pcf.ClusterComponentsDownloadConfigurePopup.createDestination()
    }
    
    // 'canVisit' attribute on Page (id=ClusterComponents) at ClusterComponents.pcf: line 9, column 83
    static function canVisit_18 () : java.lang.Boolean {
      return perm.User.ViewCluster or perm.User.DevAllAccess
    }
    
    // 'def' attribute on PanelRef (id=ComponentsLV) at ClusterComponents.pcf: line 48, column 28
    function def_onEnter_16 (def :  pcf.ClusterComponentsLV) : void {
      def.onEnter(data, data.VisibleComponents, true)
    }
    
    // 'def' attribute on PanelRef (id=ComponentsLV) at ClusterComponents.pcf: line 48, column 28
    function def_refreshVariables_17 (def :  pcf.ClusterComponentsLV) : void {
      def.refreshVariables(data, data.VisibleComponents, true)
    }
    
    // 'value' attribute on ToolbarRangeInput (id=TypeFilter) at ClusterComponents.pcf: line 27, column 59
    function defaultSetter_5 (__VALUE_TO_SET :  java.lang.Object) : void {
      data.SelectedType = (__VALUE_TO_SET as gw.api.system.cluster.ComponentType)
    }
    
    // 'filters' attribute on ToolbarFilterOptionGroup at ClusterComponents.pcf: line 35, column 89
    function filters_11 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter[] {
      return gw.api.tools.ClusterComponentFilters.StateFilters.toTypedArray()
    }
    
    // 'initialValue' attribute on Variable at ClusterComponents.pcf: line 13, column 50
    function initialValue_0 () : gw.api.tools.ClusterComponentsData {
      return new gw.api.tools.ClusterComponentsData(java.util.concurrent.TimeUnit.DAYS.toHours(7))
    }
    
    // 'label' attribute on ToolbarButton (id=FilterByComponent) at ClusterComponents.pcf: line 40, column 259
    function label_14 () : java.lang.Object {
      return data.HiddenComponentCount > 0 ? DisplayKey.get("Web.InternalTools.ClusterComponents.FilterByComponent.WithHidden", data.HiddenComponentCount) : DisplayKey.get("Web.InternalTools.ClusterComponents.FilterByComponent")
    }
    
    // 'optionLabel' attribute on ToolbarRangeInput (id=TypeFilter) at ClusterComponents.pcf: line 27, column 59
    function optionLabel_7 (VALUE :  gw.api.system.cluster.ComponentType) : java.lang.String {
      return VALUE.DisplayName
    }
    
    // 'parent' attribute on Page (id=ClusterComponents) at ClusterComponents.pcf: line 9, column 83
    static function parent_19 () : pcf.api.Destination {
      return pcf.ServerTools.createDestination()
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=TypeFilter) at ClusterComponents.pcf: line 27, column 59
    function valueRange_8 () : java.lang.Object {
      return data.ComponentTypes
    }
    
    // 'value' attribute on ToolbarRangeInput (id=TypeFilter) at ClusterComponents.pcf: line 27, column 59
    function valueRoot_6 () : java.lang.Object {
      return data
    }
    
    // 'value' attribute on ToolbarRangeInput (id=TypeFilter) at ClusterComponents.pcf: line 27, column 59
    function value_3 () : gw.api.system.cluster.ComponentType {
      return data.SelectedType
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=TypeFilter) at ClusterComponents.pcf: line 27, column 59
    function verifyValueRangeIsAllowedType_9 ($$arg :  gw.api.system.cluster.ComponentType[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=TypeFilter) at ClusterComponents.pcf: line 27, column 59
    function verifyValueRangeIsAllowedType_9 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=TypeFilter) at ClusterComponents.pcf: line 27, column 59
    function verifyValueRange_10 () : void {
      var __valueRangeArg = data.ComponentTypes
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_9(__valueRangeArg)
    }
    
    override property get CurrentLocation () : pcf.ClusterComponents {
      return super.CurrentLocation as pcf.ClusterComponents
    }
    
    property get data () : gw.api.tools.ClusterComponentsData {
      return getVariableValue("data", 0) as gw.api.tools.ClusterComponentsData
    }
    
    property set data ($arg :  gw.api.tools.ClusterComponentsData) {
      setVariableValue("data", 0, $arg)
    }
    
    
  }
  
  
}