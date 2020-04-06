package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/util/Error.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class Error extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.Error, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (Message :  String, Exception :  String, StackTrace :  String) : pcf.api.Destination {
    return __newDestination(config(), {Message, Exception, StackTrace}, 0)
  }
  
  static function drilldown (Message :  String, Exception :  String, StackTrace :  String) : pcf.api.Location {
    return __newDestination(config(), {Message, Exception, StackTrace}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (Message :  String, Exception :  String, StackTrace :  String) : pcf.api.Location {
    return __newDestination(config(), {Message, Exception, StackTrace}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (Message :  String, Exception :  String, StackTrace :  String) : pcf.api.Location {
    return __newDestination(config(), {Message, Exception, StackTrace}, 0).goInMain()
  }
  
  static function printPage (Message :  String, Exception :  String, StackTrace :  String) : pcf.api.Location {
    return __newDestination(config(), {Message, Exception, StackTrace}, 0).printPage()
  }
  
  static function push (Message :  String, Exception :  String, StackTrace :  String) : pcf.api.Location {
    return __newDestination(config(), {Message, Exception, StackTrace}, 0).push()
  }
  
  
}