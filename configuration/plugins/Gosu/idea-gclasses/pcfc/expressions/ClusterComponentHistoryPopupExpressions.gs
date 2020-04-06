package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/cluster/ClusterComponentHistoryPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClusterComponentHistoryPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/cluster/ClusterComponentHistoryPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClusterComponentHistoryPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (data :  gw.api.tools.ClusterComponentsData, component :  gw.api.system.cluster.ComponentInfo) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=RefreshButton) at ClusterComponentHistoryPopup.pcf: line 22, column 63
    function action_0 () : void {
      data.reload()
    }
    
    // 'def' attribute on PanelRef at ClusterComponentHistoryPopup.pcf: line 25, column 107
    function def_onEnter_1 (def :  pcf.ClusterComponentsLV) : void {
      def.onEnter(data, data.getComponentHistory(component.Type, component.Code), false)
    }
    
    // 'def' attribute on PanelRef at ClusterComponentHistoryPopup.pcf: line 25, column 107
    function def_refreshVariables_2 (def :  pcf.ClusterComponentsLV) : void {
      def.refreshVariables(data, data.getComponentHistory(component.Type, component.Code), false)
    }
    
    // 'title' attribute on Popup (id=ClusterComponentHistoryPopup) at ClusterComponentHistoryPopup.pcf: line 8, column 126
    static function title_3 (component :  gw.api.system.cluster.ComponentInfo, data :  gw.api.tools.ClusterComponentsData) : java.lang.Object {
      return DisplayKey.get("Web.InternalTools.ClusterComponentHistoryPopup.Title", component.Name?:component.Code)
    }
    
    override property get CurrentLocation () : pcf.ClusterComponentHistoryPopup {
      return super.CurrentLocation as pcf.ClusterComponentHistoryPopup
    }
    
    property get component () : gw.api.system.cluster.ComponentInfo {
      return getVariableValue("component", 0) as gw.api.system.cluster.ComponentInfo
    }
    
    property set component ($arg :  gw.api.system.cluster.ComponentInfo) {
      setVariableValue("component", 0, $arg)
    }
    
    property get data () : gw.api.tools.ClusterComponentsData {
      return getVariableValue("data", 0) as gw.api.tools.ClusterComponentsData
    }
    
    property set data ($arg :  gw.api.tools.ClusterComponentsData) {
      setVariableValue("data", 0, $arg)
    }
    
    
  }
  
  
}