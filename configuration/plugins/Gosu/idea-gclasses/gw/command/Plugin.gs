package gw.command

uses com.guidewire.pl.system.integration.plugins.PluginDefGosu
uses com.guidewire.pl.system.dependency.PLDependencies
uses com.guidewire.pl.quickjump.BaseCommand
uses com.guidewire.pl.quickjump.DefaultMethod
uses gw.plugin.Plugins
uses java.util.Map
uses gw.plugin.policy.search.IPolicySearchAdapter
uses gw.plugin.policy.reinsurance.IReinsurancePlugin

@DefaultMethod("setPlugin")
@Export
class Plugin extends BaseCommand {
  
  private static final var _pluginConfig = PLDependencies.getPluginConfig()
  private static final var _authMap : Map<String, String> = {
    "username" -> "su",
    "password" -> "gw"
  }
  private static final var _ABauthMap : Map<String, String> = {
    "username" -> "ClientAppCC",
    "password" -> "gw"
  }
  private static final var _demoRIPlugin = PluginDefGosu.newGosuPluginDef(IReinsurancePlugin, "gw.plugin.policy.reinsurance.impl.ReinsuranceDemoPlugin", _authMap)
  private static final var _demoPlugin = PluginDefGosu.newGosuPluginDef(IPolicySearchAdapter, "gw.plugin.policy.impl.PolicySearchPluginDemoImpl", _authMap )
  
  construct() { }


  function RIdemo() : String {
    _pluginConfig.addPluginDef(_demoRIPlugin)
    return "Using ${Plugins.get(IReinsurancePlugin)}"
  }

  
  function policyDemo() : String {
    _pluginConfig.addPluginDef(_demoPlugin)
    return "Using ${Plugins.get(IPolicySearchAdapter)}"
  }
}
