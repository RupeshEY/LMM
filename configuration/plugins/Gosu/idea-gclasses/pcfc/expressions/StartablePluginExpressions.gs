package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/startableplugin/StartablePlugin.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class StartablePluginExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/startableplugin/StartablePlugin.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends StartablePluginExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on Link (id=Start) at StartablePlugin.pcf: line 53, column 42
    function action_15 () : void {
      gw.api.startable.StartablePluginPageHelper.startPlugin( pluginDef )
    }
    
    // 'action' attribute on Link (id=Stop) at StartablePlugin.pcf: line 59, column 42
    function action_17 () : void {
      gw.api.startable.StartablePluginPageHelper.stopPlugin( pluginDef )
    }
    
    // 'available' attribute on Link (id=Start) at StartablePlugin.pcf: line 53, column 42
    function available_14 () : java.lang.Boolean {
      return pluginInfo.State == Stopped
    }
    
    // 'available' attribute on Link (id=Stop) at StartablePlugin.pcf: line 59, column 42
    function available_16 () : java.lang.Boolean {
      return pluginInfo.State == Started
    }
    
    // 'initialValue' attribute on Variable at StartablePlugin.pcf: line 29, column 50
    function initialValue_5 () : gw.api.tools.StartablePlugin {
      return new gw.api.tools.StartablePlugin( pluginDef )
    }
    
    // RowIterator at StartablePlugin.pcf: line 24, column 79
    function initializeVariables_19 () : void {
        pluginInfo = new gw.api.tools.StartablePlugin( pluginDef );

    }
    
    // 'value' attribute on TextCell (id=Name) at StartablePlugin.pcf: line 35, column 40
    function valueRoot_8 () : java.lang.Object {
      return pluginInfo
    }
    
    // 'value' attribute on TextCell (id=Host) at StartablePlugin.pcf: line 43, column 40
    function value_11 () : java.lang.String {
      return pluginInfo.Host
    }
    
    // 'value' attribute on TextCell (id=Name) at StartablePlugin.pcf: line 35, column 40
    function value_6 () : java.lang.String {
      return pluginInfo.Name
    }
    
    // 'value' attribute on TextCell (id=Status) at StartablePlugin.pcf: line 39, column 107
    function value_9 () : java.lang.String {
      return gw.api.startable.StartablePluginPageHelper.localizePluginState( pluginInfo.State )
    }
    
    // 'visible' attribute on LinkCell (id=Actions) at StartablePlugin.pcf: line 47, column 72
    function visible_18 () : java.lang.Boolean {
      return perm.User.EditPlugin or perm.User.DevAllAccess
    }
    
    property get pluginDef () : com.guidewire.pl.system.integration.plugins.PluginDef {
      return getIteratedValue(1) as com.guidewire.pl.system.integration.plugins.PluginDef
    }
    
    property get pluginInfo () : gw.api.tools.StartablePlugin {
      return getVariableValue("pluginInfo", 1) as gw.api.tools.StartablePlugin
    }
    
    property set pluginInfo ($arg :  gw.api.tools.StartablePlugin) {
      setVariableValue("pluginInfo", 1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/startableplugin/StartablePlugin.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StartablePluginExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'available' attribute on ListViewPanel at StartablePlugin.pcf: line 19, column 24
    function available_21 () : java.lang.Boolean {
      return gw.api.startable.StartablePluginPageHelper.canBeEnabled()
    }
    
    // 'canVisit' attribute on Page (id=StartablePlugin) at StartablePlugin.pcf: line 10, column 58
    static function canVisit_22 () : java.lang.Boolean {
      return perm.User.ViewPlugin or perm.User.DevAllAccess
    }
    
    // 'parent' attribute on Page (id=StartablePlugin) at StartablePlugin.pcf: line 10, column 58
    static function parent_23 () : pcf.api.Destination {
      return pcf.ServerTools.createDestination()
    }
    
    // 'value' attribute on RowIterator at StartablePlugin.pcf: line 35, column 40
    function sortValue_1 (pluginDef :  com.guidewire.pl.system.integration.plugins.PluginDef) : java.lang.Object {
      var pluginInfo : gw.api.tools.StartablePlugin = (new gw.api.tools.StartablePlugin( pluginDef ))
return pluginInfo.Name
    }
    
    // 'value' attribute on RowIterator at StartablePlugin.pcf: line 39, column 107
    function sortValue_2 (pluginDef :  com.guidewire.pl.system.integration.plugins.PluginDef) : java.lang.Object {
      var pluginInfo : gw.api.tools.StartablePlugin = (new gw.api.tools.StartablePlugin( pluginDef ))
return gw.api.startable.StartablePluginPageHelper.localizePluginState( pluginInfo.State )
    }
    
    // 'value' attribute on RowIterator at StartablePlugin.pcf: line 43, column 40
    function sortValue_3 (pluginDef :  com.guidewire.pl.system.integration.plugins.PluginDef) : java.lang.Object {
      var pluginInfo : gw.api.tools.StartablePlugin = (new gw.api.tools.StartablePlugin( pluginDef ))
return pluginInfo.Host
    }
    
    // 'value' attribute on RowIterator at StartablePlugin.pcf: line 24, column 79
    function value_20 () : com.guidewire.pl.system.integration.plugins.PluginDef[] {
      return gw.api.startable.StartablePluginPageHelper.getEnabledPlugins().toTypedArray()
    }
    
    // 'visible' attribute on AlertBar (id=NotAvailable) at StartablePlugin.pcf: line 16, column 79
    function visible_0 () : java.lang.Boolean {
      return !gw.api.startable.StartablePluginPageHelper.canBeEnabled()
    }
    
    // 'visible' attribute on RowIterator at StartablePlugin.pcf: line 47, column 72
    function visible_4 () : java.lang.Boolean {
      return perm.User.EditPlugin or perm.User.DevAllAccess
    }
    
    override property get CurrentLocation () : pcf.StartablePlugin {
      return super.CurrentLocation as pcf.StartablePlugin
    }
    
    
  }
  
  
}