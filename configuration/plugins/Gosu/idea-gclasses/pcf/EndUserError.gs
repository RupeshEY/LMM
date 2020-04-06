package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/util/EndUserError.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class EndUserError extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.EndUserError, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (Message :  String) : pcf.api.Destination {
    return __newDestination(config(), {Message}, 0)
  }
  
  static function drilldown (Message :  String) : pcf.api.Location {
    return __newDestination(config(), {Message}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (Message :  String) : pcf.api.Location {
    return __newDestination(config(), {Message}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (Message :  String) : pcf.api.Location {
    return __newDestination(config(), {Message}, 0).goInMain()
  }
  
  static function printPage (Message :  String) : pcf.api.Location {
    return __newDestination(config(), {Message}, 0).printPage()
  }
  
  static function push (Message :  String) : pcf.api.Location {
    return __newDestination(config(), {Message}, 0).push()
  }
  
  
}