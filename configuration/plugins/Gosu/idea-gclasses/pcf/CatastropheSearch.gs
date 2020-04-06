package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/claims/CatastropheSearch.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class CatastropheSearch extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.CatastropheSearch, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination () : pcf.api.Destination {
    return __newDestination(config(), {}, 1)
  }
  
  static function createDestination (catastrophe :  Catastrophe) : pcf.api.Destination {
    return __newDestination(config(), {catastrophe}, 0)
  }
  
  static function drilldown () : pcf.api.Location {
    return __newDestination(config(), {}, 1).drilldown()
  }
  
  static function drilldown (catastrophe :  Catastrophe) : pcf.api.Location {
    return __newDestination(config(), {catastrophe}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go () : pcf.api.Location {
    return __newDestination(config(), {}, 1).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (catastrophe :  Catastrophe) : pcf.api.Location {
    return __newDestination(config(), {catastrophe}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain () : pcf.api.Location {
    return __newDestination(config(), {}, 1).goInMain()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (catastrophe :  Catastrophe) : pcf.api.Location {
    return __newDestination(config(), {catastrophe}, 0).goInMain()
  }
  
  static function printPage () : pcf.api.Location {
    return __newDestination(config(), {}, 1).printPage()
  }
  
  static function printPage (catastrophe :  Catastrophe) : pcf.api.Location {
    return __newDestination(config(), {catastrophe}, 0).printPage()
  }
  
  static function push () : pcf.api.Location {
    return __newDestination(config(), {}, 1).push()
  }
  
  static function push (catastrophe :  Catastrophe) : pcf.api.Location {
    return __newDestination(config(), {catastrophe}, 0).push()
  }
  
  
}