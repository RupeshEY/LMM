package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/Reload.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ReloadExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/Reload.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReloadExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'action' attribute on ButtonInput (id=PCF) at Reload.pcf: line 23, column 79
    function action_1 () : void {
      gw.api.tools.InternalToolsUtil.reloadPCFsAndCurrentLocation()
    }
    
    // 'action' attribute on ButtonInput (id=GSTemplates) at Reload.pcf: line 29, column 87
    function action_2 () : void {
      gw.api.tools.InternalToolsUtil.reloadUI()
    }
    
    // 'action' attribute on ButtonInput (id=WorkflowEngine) at Reload.pcf: line 35, column 90
    function action_3 () : void {
      gw.api.tools.InternalToolsUtil.reloadWorkflowEngine()
    }
    
    // 'action' attribute on ButtonInput (id=DisplayNames) at Reload.pcf: line 41, column 88
    function action_4 () : void {
      gw.api.tools.InternalToolsUtil.reloadDisplayNames()
    }
    
    // 'def' attribute on PanelRef at Reload.pcf: line 45, column 42
    function def_onEnter_5 (def :  pcf.ServerToolsDisclaimerDV) : void {
      def.onEnter()
    }
    
    // 'def' attribute on PanelRef at Reload.pcf: line 45, column 42
    function def_refreshVariables_6 (def :  pcf.ServerToolsDisclaimerDV) : void {
      def.refreshVariables()
    }
    
    // 'label' attribute on Verbatim (id=ReloadText) at Reload.pcf: line 14, column 65
    function label_0 () : java.lang.String {
      return gw.api.tools.InternalToolsUtil.getLastResult()
    }
    
    // 'parent' attribute on Page (id=Reload) at Reload.pcf: line 9, column 66
    static function parent_7 () : pcf.api.Destination {
      return pcf.UnsupportedTools.createDestination()
    }
    
    override property get CurrentLocation () : pcf.Reload {
      return super.CurrentLocation as pcf.Reload
    }
    
    
  }
  
  
}