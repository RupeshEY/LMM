package gw.command

uses com.guidewire.pl.system.integration.plugins.PluginDefGosu
uses com.guidewire.pl.system.integration.plugins.PluginDefJava
uses com.guidewire.pl.system.dependency.PLDependencies
uses com.guidewire.pl.quickjump.Argument
uses com.guidewire.pl.quickjump.BaseCommand
uses com.guidewire.pl.quickjump.DefaultMethod
uses com.guidewire.pl.system.integration.plugins.PluginDefBase
uses gw.api.util.DisplayableException
uses gw.plugin.addressbook.IAddressBookAdapter
uses gw.plugin.Plugins
uses java.util.Map
uses gw.plugin.addressbook.ABNotAvailablePlugin

@DefaultMethod("setPlugin")
@Export
class ABPlugin extends BaseCommand {

  public static final var UNAVAILABLE_PLUGIN : String = "unavailable" 
  public static final var DEMO_PLUGIN : String = "demo"
  
  private static final var _pluginConfig = PLDependencies.getPluginConfig()
  private static final var _authMap : Map<String, String> = {
    "username" -> "ClientAppCC",
    "password" -> "gw"
  }
  private static final var _unavailablePlugin = PluginDefGosu.newGosuPluginDef(IAddressBookAdapter, "gw.plugin.addressbook.ABNotAvailablePlugin", _authMap)
  private static final var _demoPlugin = PluginDefJava.newJavaPluginDef("IAddressBookAdapter", IAddressBookAdapter, "com.guidewire.cc.plugin.addressbook.internal.AddressBookDemoAdapter", _authMap,  "shared")
  private static final var _reset : String  = "reset"
  private static final var _default : String = "default"
  private static final var _abPluginMap : Map<String, PluginDefBase> = {
    UNAVAILABLE_PLUGIN -> _unavailablePlugin,
    DEMO_PLUGIN -> _demoPlugin,
    _default -> _demoPlugin,
    _reset -> _demoPlugin
  }

  construct() { }

  @Argument("impl", {ABPlugin.UNAVAILABLE_PLUGIN, ABPlugin.DEMO_PLUGIN, ABPlugin._default, ABPlugin._reset})
  function setPlugin() : String {
    var arg = getArgumentAsString("impl")
    if (arg == null) {
      arg = _default
    }
    var pluginImpl = _abPluginMap.get(arg)
    if (pluginImpl == null) {
      throw new DisplayableException("Unrecognized plugin type: ${arg}")
    }
    _pluginConfig.addPluginDef(pluginImpl)
    return "Using ${Plugins.get(IAddressBookAdapter)}"
  }
  
}
