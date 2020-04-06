package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/scriptparameters/ScriptParameterDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ScriptParameterDetail extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ScriptParameterDetail, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (ScriptParameterPack :  com.guidewire.pl.system.gosu.entity.ScriptParameterPack) : pcf.api.Destination {
    return __newDestination(config(), {ScriptParameterPack}, 0)
  }
  
  static function drilldown (ScriptParameterPack :  com.guidewire.pl.system.gosu.entity.ScriptParameterPack) : pcf.api.Location {
    return __newDestination(config(), {ScriptParameterPack}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (ScriptParameterPack :  com.guidewire.pl.system.gosu.entity.ScriptParameterPack) : pcf.api.Location {
    return __newDestination(config(), {ScriptParameterPack}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (ScriptParameterPack :  com.guidewire.pl.system.gosu.entity.ScriptParameterPack) : pcf.api.Location {
    return __newDestination(config(), {ScriptParameterPack}, 0).goInMain()
  }
  
  static function printPage (ScriptParameterPack :  com.guidewire.pl.system.gosu.entity.ScriptParameterPack) : pcf.api.Location {
    return __newDestination(config(), {ScriptParameterPack}, 0).printPage()
  }
  
  static function push (ScriptParameterPack :  com.guidewire.pl.system.gosu.entity.ScriptParameterPack) : pcf.api.Location {
    return __newDestination(config(), {ScriptParameterPack}, 0).push()
  }
  
  
}