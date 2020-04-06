package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/OracleOutlineDetailsPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class OracleOutlineDetailsPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.OracleOutlineDetailsPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (outline :  gw.api.database.DatabaseOutlineInfo) : pcf.api.Destination {
    return __newDestination(config(), {outline}, 0)
  }
  
  static function push (outline :  gw.api.database.DatabaseOutlineInfo) : pcf.api.Location {
    return __newDestination(config(), {outline}, 0).push()
  }
  
  
}