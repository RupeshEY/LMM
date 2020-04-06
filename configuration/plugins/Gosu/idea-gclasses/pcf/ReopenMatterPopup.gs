package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/litigation/ReopenMatterPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ReopenMatterPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ReopenMatterPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (matter :  Matter) : pcf.api.Destination {
    return __newDestination(config(), {matter}, 0)
  }
  
  static function push (matter :  Matter) : pcf.api.Location {
    return __newDestination(config(), {matter}, 0).push()
  }
  
  
}