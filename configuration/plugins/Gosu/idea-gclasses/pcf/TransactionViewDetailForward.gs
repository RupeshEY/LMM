package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/TransactionViewDetailForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class TransactionViewDetailForward extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.TransactionViewDetailForward, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (Claim :  Claim, TransactionView :  TransactionView) : pcf.api.Destination {
    return __newDestination(config(), {Claim, TransactionView}, 0)
  }
  
  static function drilldown (Claim :  Claim, TransactionView :  TransactionView) : pcf.api.Location {
    return __newDestination(config(), {Claim, TransactionView}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (Claim :  Claim, TransactionView :  TransactionView) : pcf.api.Location {
    return __newDestination(config(), {Claim, TransactionView}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (Claim :  Claim, TransactionView :  TransactionView) : pcf.api.Location {
    return __newDestination(config(), {Claim, TransactionView}, 0).goInMain()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInWorkspace (Claim :  Claim, TransactionView :  TransactionView) : pcf.api.Location {
    return __newDestination(config(), {Claim, TransactionView}, 0).goInWorkspace()
  }
  
  static function printPage (Claim :  Claim, TransactionView :  TransactionView) : pcf.api.Location {
    return __newDestination(config(), {Claim, TransactionView}, 0).printPage()
  }
  
  static function push (Claim :  Claim, TransactionView :  TransactionView) : pcf.api.Location {
    return __newDestination(config(), {Claim, TransactionView}, 0).push()
  }
  
  
}