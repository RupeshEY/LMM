package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/checks/ReissueCheck.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ReissueCheck extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ReissueCheck, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (Claim :  Claim, check :  Check) : pcf.api.Destination {
    return __newDestination(config(), {Claim, check}, 0)
  }
  
  static function drilldown (Claim :  Claim, check :  Check) : pcf.api.Location {
    return __newDestination(config(), {Claim, check}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (Claim :  Claim, check :  Check) : pcf.api.Location {
    return __newDestination(config(), {Claim, check}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (Claim :  Claim, check :  Check) : pcf.api.Location {
    return __newDestination(config(), {Claim, check}, 0).goInMain()
  }
  
  static function printPage (Claim :  Claim, check :  Check) : pcf.api.Location {
    return __newDestination(config(), {Claim, check}, 0).printPage()
  }
  
  static function push (Claim :  Claim, check :  Check) : pcf.api.Location {
    return __newDestination(config(), {Claim, check}, 0).push()
  }
  
  
}