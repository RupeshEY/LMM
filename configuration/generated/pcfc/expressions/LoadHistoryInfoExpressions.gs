package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/LoadHistoryInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class LoadHistoryInfoExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/LoadHistoryInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LoadHistoryInfoExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=LoadHistoryInfo_RefreshButton) at LoadHistoryInfo.pcf: line 23, column 65
    function action_1 () : void {
      
    }
    
    // 'def' attribute on PanelRef at LoadHistoryInfo.pcf: line 18, column 66
    function def_onEnter_3 (def :  pcf.LoadHistoryLV) : void {
      def.onEnter(PageHelper, getLoadCommands(), true)
    }
    
    // 'def' attribute on PanelRef at LoadHistoryInfo.pcf: line 18, column 66
    function def_refreshVariables_4 (def :  pcf.LoadHistoryLV) : void {
      def.refreshVariables(PageHelper, getLoadCommands(), true)
    }
    
    // 'initialValue' attribute on Variable at LoadHistoryInfo.pcf: line 14, column 46
    function initialValue_0 () : gw.api.tools.LoadHistoryHelper {
      return new gw.api.tools.LoadHistoryHelper()
    }
    
    // EditButtons (id=editbuttons) at LoadHistoryInfo.pcf: line 25, column 31
    function label_2 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'parent' attribute on Page (id=LoadHistoryInfo) at LoadHistoryInfo.pcf: line 10, column 85
    static function parent_5 () : pcf.api.Destination {
      return pcf.InfoPages.createDestination()
    }
    
    override property get CurrentLocation () : pcf.LoadHistoryInfo {
      return super.CurrentLocation as pcf.LoadHistoryInfo
    }
    
    property get PageHelper () : gw.api.tools.LoadHistoryHelper {
      return getVariableValue("PageHelper", 0) as gw.api.tools.LoadHistoryHelper
    }
    
    property set PageHelper ($arg :  gw.api.tools.LoadHistoryHelper) {
      setVariableValue("PageHelper", 0, $arg)
    }
    
    
    function getLoadCommands() : gw.api.database.IQueryBeanResult<LoadCommand>
          {
          return gw.api.database.Query.make(LoadCommand).select()
          }
        
    
    
  }
  
  
}