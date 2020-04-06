package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/util/ExternalLink.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ExternalLink extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ExternalLink, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (linkName :  String, claimNumber :  String) : pcf.api.Destination {
    return __newDestination(config(), {linkName, claimNumber}, 0)
  }
  
  static function drilldown (linkName :  String, claimNumber :  String) : pcf.api.Location {
    return __newDestination(config(), {linkName, claimNumber}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (linkName :  String, claimNumber :  String) : pcf.api.Location {
    return __newDestination(config(), {linkName, claimNumber}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (linkName :  String, claimNumber :  String) : pcf.api.Location {
    return __newDestination(config(), {linkName, claimNumber}, 0).goInMain()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInWorkspace (linkName :  String, claimNumber :  String) : pcf.api.Location {
    return __newDestination(config(), {linkName, claimNumber}, 0).goInWorkspace()
  }
  
  static function printPage (linkName :  String, claimNumber :  String) : pcf.api.Location {
    return __newDestination(config(), {linkName, claimNumber}, 0).printPage()
  }
  
  static function push (linkName :  String, claimNumber :  String) : pcf.api.Location {
    return __newDestination(config(), {linkName, claimNumber}, 0).push()
  }
  
  
}