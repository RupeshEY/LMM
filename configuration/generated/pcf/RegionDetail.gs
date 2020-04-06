package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/regions/RegionDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class RegionDetail extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.RegionDetail, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination () : pcf.api.Destination {
    return __newDestination(config(), {}, 1)
  }
  
  static function createDestination (Region :  Region) : pcf.api.Destination {
    return __newDestination(config(), {Region}, 0)
  }
  
  static function drilldown () : pcf.api.Location {
    return __newDestination(config(), {}, 1).drilldown()
  }
  
  static function drilldown (Region :  Region) : pcf.api.Location {
    return __newDestination(config(), {Region}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go () : pcf.api.Location {
    return __newDestination(config(), {}, 1).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (Region :  Region) : pcf.api.Location {
    return __newDestination(config(), {Region}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain () : pcf.api.Location {
    return __newDestination(config(), {}, 1).goInMain()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (Region :  Region) : pcf.api.Location {
    return __newDestination(config(), {Region}, 0).goInMain()
  }
  
  static function printPage () : pcf.api.Location {
    return __newDestination(config(), {}, 1).printPage()
  }
  
  static function printPage (Region :  Region) : pcf.api.Location {
    return __newDestination(config(), {Region}, 0).printPage()
  }
  
  static function push () : pcf.api.Location {
    return __newDestination(config(), {}, 1).push()
  }
  
  static function push (Region :  Region) : pcf.api.Location {
    return __newDestination(config(), {Region}, 0).push()
  }
  
  
}