package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/checks/VoidStopCheck.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class VoidStopCheck extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.VoidStopCheck, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (Claim :  Claim, Check :  Check) : pcf.api.Destination {
    return __newDestination(config(), {Claim, Check}, 0)
  }
  
  static function drilldown (Claim :  Claim, Check :  Check) : pcf.api.Location {
    return __newDestination(config(), {Claim, Check}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (Claim :  Claim, Check :  Check) : pcf.api.Location {
    return __newDestination(config(), {Claim, Check}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (Claim :  Claim, Check :  Check) : pcf.api.Location {
    return __newDestination(config(), {Claim, Check}, 0).goInMain()
  }
  
  static function printPage (Claim :  Claim, Check :  Check) : pcf.api.Location {
    return __newDestination(config(), {Claim, Check}, 0).printPage()
  }
  
  static function push (Claim :  Claim, Check :  Check) : pcf.api.Location {
    return __newDestination(config(), {Claim, Check}, 0).push()
  }
  
  
}