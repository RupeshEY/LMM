package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/util/GuidewireHomePage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class GuidewireHomePage extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.GuidewireHomePage, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination () : pcf.api.Destination {
    return __newDestination(config(), {}, 0)
  }
  
  static function drilldown () : pcf.api.Location {
    return __newDestination(config(), {}, 0).drilldown()
  }
  
  static function printPage () : pcf.api.Location {
    return __newDestination(config(), {}, 0).printPage()
  }
  
  static function push () : pcf.api.Location {
    return __newDestination(config(), {}, 0).push()
  }
  
  
}