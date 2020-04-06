package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/litigation/ClaimMatterForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimMatterForward extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ClaimMatterForward, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (Claim :  Claim, Matter :  Matter) : pcf.api.Destination {
    return __newDestination(config(), {Claim, Matter}, 0)
  }
  
  static function drilldown (Claim :  Claim, Matter :  Matter) : pcf.api.Location {
    return __newDestination(config(), {Claim, Matter}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (Claim :  Claim, Matter :  Matter) : pcf.api.Location {
    return __newDestination(config(), {Claim, Matter}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (Claim :  Claim, Matter :  Matter) : pcf.api.Location {
    return __newDestination(config(), {Claim, Matter}, 0).goInMain()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInWorkspace (Claim :  Claim, Matter :  Matter) : pcf.api.Location {
    return __newDestination(config(), {Claim, Matter}, 0).goInWorkspace()
  }
  
  static function printPage (Claim :  Claim, Matter :  Matter) : pcf.api.Location {
    return __newDestination(config(), {Claim, Matter}, 0).printPage()
  }
  
  static function push (Claim :  Claim, Matter :  Matter) : pcf.api.Location {
    return __newDestination(config(), {Claim, Matter}, 0).push()
  }
  
  
}