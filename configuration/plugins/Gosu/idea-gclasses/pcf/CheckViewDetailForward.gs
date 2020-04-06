package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/checks/CheckViewDetailForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class CheckViewDetailForward extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.CheckViewDetailForward, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (Claim :  Claim, CheckView :  CheckView) : pcf.api.Destination {
    return __newDestination(config(), {Claim, CheckView}, 0)
  }
  
  static function drilldown (Claim :  Claim, CheckView :  CheckView) : pcf.api.Location {
    return __newDestination(config(), {Claim, CheckView}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (Claim :  Claim, CheckView :  CheckView) : pcf.api.Location {
    return __newDestination(config(), {Claim, CheckView}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (Claim :  Claim, CheckView :  CheckView) : pcf.api.Location {
    return __newDestination(config(), {Claim, CheckView}, 0).goInMain()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInWorkspace (Claim :  Claim, CheckView :  CheckView) : pcf.api.Location {
    return __newDestination(config(), {Claim, CheckView}, 0).goInWorkspace()
  }
  
  static function printPage (Claim :  Claim, CheckView :  CheckView) : pcf.api.Location {
    return __newDestination(config(), {Claim, CheckView}, 0).printPage()
  }
  
  static function push (Claim :  Claim, CheckView :  CheckView) : pcf.api.Location {
    return __newDestination(config(), {Claim, CheckView}, 0).push()
  }
  
  
}