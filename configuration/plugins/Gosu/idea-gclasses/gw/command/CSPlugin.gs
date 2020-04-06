package gw.command

uses gw.api.util.DisplayableException
uses gw.plugin.contact.ContactSystemPlugin
uses gw.plugin.contactsystem.ContactSystemNotAvailablePlugin
uses gw.plugin.Plugins

uses com.guidewire.pl.quickjump.Argument
uses com.guidewire.pl.quickjump.BaseCommand
uses com.guidewire.pl.quickjump.DefaultMethod
uses com.guidewire.pl.system.dependency.PLDependencies
uses com.guidewire.pl.system.integration.plugins.PluginDefGosu
uses com.guidewire.pl.system.integration.plugins.PluginDefJava
uses com.guidewire.pl.system.integration.plugins.PluginDefBase

uses java.util.Map
uses com.guidewire.pl.system.entity.external.ExternalClassConverter
uses com.guidewire.pl.system.integration.plugins.internal.InternalPlugin
uses gw.lang.reflect.java.JavaTypes

@DefaultMethod("setPlugin")
@Export
class CSPlugin extends BaseCommand {
  public static final var AB800_PLUGIN : String = "ab800"
  public static final var AB900_PLUGIN : String = "ab900"
  public static final var UNAVAILABLE_PLUGIN : String = "unavailable"
  public static final var DEMO_PLUGIN : String = "demo"
  public static final var DISABLED_PLUGIN : String = "disabled"


  private static final var _pluginConfig = PLDependencies.getPluginConfig()
  private static final var _authMap : Map<String, String> = {
      "username" -> "ClientAppCC",
      "password" -> "gw"
  }

  private static final var _ab800Plugin = PluginDefGosu.newGosuPluginDef(ContactSystemPlugin, "gw.plugin.contact.ab800.ABContactSystemPlugin", _authMap)
  private static final var _ab900Plugin = PluginDefGosu.newGosuPluginDef(ContactSystemPlugin, "gw.plugin.contact.ab900.ABContactSystemPlugin", _authMap)
  private static final var _unavailablePlugin = PluginDefGosu.newGosuPluginDef(ContactSystemPlugin, "gw.plugin.contactsystem.ContactSystemNotAvailablePlugin", _authMap)
  private static final var _demoPlugin = PluginDefJava.newJavaPluginDef("ContactSystemPlugin", ContactSystemPlugin, "gw.plugin.addressbook.demo.DemoContactSystemPlugin", _authMap,  "shared")
  private static final var _disabledPlugin = newDisabledPlugin(ContactSystemPlugin, "gw.plugin.contactsystem.ContactSystemNotAvailablePlugin", "ContactSystemPlugin",  _authMap )
  private static final var _reset : String  = "reset"
  private static final var _default : String = "default"
  private static final var _abPluginMap : Map<String, PluginDefBase> = {
      AB900_PLUGIN -> _ab900Plugin,
      AB800_PLUGIN -> _ab800Plugin,
      UNAVAILABLE_PLUGIN -> _unavailablePlugin,
      DEMO_PLUGIN -> _demoPlugin,
      DISABLED_PLUGIN -> _disabledPlugin,
      _default -> _demoPlugin,
      _reset -> _demoPlugin
  }

  construct() { }

  private static function newDisabledPlugin(pluginInterface : java.lang.Class< InternalPlugin >, gosuClassName : String , pluginName : String ,  params : Map<String, String>) : PluginDefGosu {
    var beanConverter = PLDependencies.getExternalClassConverter()

    var pluginDefGosu = new PluginDefGosu(
      pluginName,
      JavaTypes.getSystemType(pluginInterface).getBackingClassInfo(),
      params,
      false,
      null,
      gosuClassName,
      beanConverter
    );
    return pluginDefGosu;
  }

  @Argument("impl", { CSPlugin.AB900_PLUGIN, CSPlugin.AB800_PLUGIN, CSPlugin.UNAVAILABLE_PLUGIN, CSPlugin.DEMO_PLUGIN, CSPlugin.DISABLED_PLUGIN, CSPlugin._default, CSPlugin._reset})
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
    return "Using ${Plugins.get(ContactSystemPlugin)}"
  }

}
