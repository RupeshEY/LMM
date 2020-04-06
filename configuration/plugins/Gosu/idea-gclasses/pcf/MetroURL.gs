package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/exitpoints/MetroURL.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class MetroURL extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.MetroURL, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (url :  String) : pcf.api.Destination {
    return __newDestination(config(), {url}, 0)
  }
  
  static function drilldown (url :  String) : pcf.api.Location {
    return __newDestination(config(), {url}, 0).drilldown()
  }
  
  static function printPage (url :  String) : pcf.api.Location {
    return __newDestination(config(), {url}, 0).printPage()
  }
  
  static function push (url :  String) : pcf.api.Location {
    return __newDestination(config(), {url}, 0).push()
  }
  
  
}