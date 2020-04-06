package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/InitiateBackoutPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class InitiateBackoutPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.InitiateBackoutPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (Page :  gw.api.tools.UpgradeInfoPageHelper) : pcf.api.Destination {
    return __newDestination(config(), {Page}, 0)
  }
  
  static function push (Page :  gw.api.tools.UpgradeInfoPageHelper) : pcf.api.Location {
    return __newDestination(config(), {Page}, 0).push()
  }
  
  
}