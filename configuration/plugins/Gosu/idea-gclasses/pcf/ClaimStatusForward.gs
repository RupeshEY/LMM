package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/summary/ClaimStatusForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimStatusForward extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ClaimStatusForward, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (claim :  Claim) : pcf.api.Destination {
    return __newDestination(config(), {claim}, 0)
  }
  
  static function drilldown (claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {claim}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {claim}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {claim}, 0).goInMain()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInWorkspace (claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {claim}, 0).goInWorkspace()
  }
  
  static function printPage (claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {claim}, 0).printPage()
  }
  
  static function push (claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {claim}, 0).push()
  }
  
  
}