package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/transactions/RecodeRecovery.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class RecodeRecovery extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.RecodeRecovery, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (originalRecovery :  Recovery) : pcf.api.Destination {
    return __newDestination(config(), {originalRecovery}, 0)
  }
  
  static function drilldown (originalRecovery :  Recovery) : pcf.api.Location {
    return __newDestination(config(), {originalRecovery}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (originalRecovery :  Recovery) : pcf.api.Location {
    return __newDestination(config(), {originalRecovery}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (originalRecovery :  Recovery) : pcf.api.Location {
    return __newDestination(config(), {originalRecovery}, 0).goInMain()
  }
  
  static function printPage (originalRecovery :  Recovery) : pcf.api.Location {
    return __newDestination(config(), {originalRecovery}, 0).printPage()
  }
  
  static function push (originalRecovery :  Recovery) : pcf.api.Location {
    return __newDestination(config(), {originalRecovery}, 0).push()
  }
  
  
}