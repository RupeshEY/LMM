package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/exitpoints/GoToAB.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class GoToAB extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.GoToAB, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (abSystemURL :  String) : pcf.api.Destination {
    return __newDestination(config(), {abSystemURL}, 0)
  }
  
  static function drilldown (abSystemURL :  String) : pcf.api.Location {
    return __newDestination(config(), {abSystemURL}, 0).drilldown()
  }
  
  static function printPage (abSystemURL :  String) : pcf.api.Location {
    return __newDestination(config(), {abSystemURL}, 0).printPage()
  }
  
  static function push (abSystemURL :  String) : pcf.api.Location {
    return __newDestination(config(), {abSystemURL}, 0).push()
  }
  
  
}