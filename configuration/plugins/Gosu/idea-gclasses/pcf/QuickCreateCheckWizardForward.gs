package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/check/QuickCreateCheckWizardForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class QuickCreateCheckWizardForward extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.QuickCreateCheckWizardForward, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (claim :  Claim) : pcf.api.Destination {
    return __newDestination(config(), {claim}, 1)
  }
  
  static function createDestination (claim :  Claim, exposure :  Exposure, costType :  CostType, costCategory :  CostCategory, reservingCurrency :  Currency, setReserveLine :  Boolean) : pcf.api.Destination {
    return __newDestination(config(), {claim, exposure, costType, costCategory, reservingCurrency, setReserveLine}, 0)
  }
  
  static function drilldown (claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {claim}, 1).drilldown()
  }
  
  static function drilldown (claim :  Claim, exposure :  Exposure, costType :  CostType, costCategory :  CostCategory, reservingCurrency :  Currency, setReserveLine :  Boolean) : pcf.api.Location {
    return __newDestination(config(), {claim, exposure, costType, costCategory, reservingCurrency, setReserveLine}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {claim}, 1).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (claim :  Claim, exposure :  Exposure, costType :  CostType, costCategory :  CostCategory, reservingCurrency :  Currency, setReserveLine :  Boolean) : pcf.api.Location {
    return __newDestination(config(), {claim, exposure, costType, costCategory, reservingCurrency, setReserveLine}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {claim}, 1).goInMain()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (claim :  Claim, exposure :  Exposure, costType :  CostType, costCategory :  CostCategory, reservingCurrency :  Currency, setReserveLine :  Boolean) : pcf.api.Location {
    return __newDestination(config(), {claim, exposure, costType, costCategory, reservingCurrency, setReserveLine}, 0).goInMain()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInWorkspace (claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {claim}, 1).goInWorkspace()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInWorkspace (claim :  Claim, exposure :  Exposure, costType :  CostType, costCategory :  CostCategory, reservingCurrency :  Currency, setReserveLine :  Boolean) : pcf.api.Location {
    return __newDestination(config(), {claim, exposure, costType, costCategory, reservingCurrency, setReserveLine}, 0).goInWorkspace()
  }
  
  static function printPage (claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {claim}, 1).printPage()
  }
  
  static function printPage (claim :  Claim, exposure :  Exposure, costType :  CostType, costCategory :  CostCategory, reservingCurrency :  Currency, setReserveLine :  Boolean) : pcf.api.Location {
    return __newDestination(config(), {claim, exposure, costType, costCategory, reservingCurrency, setReserveLine}, 0).printPage()
  }
  
  static function push (claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {claim}, 1).push()
  }
  
  static function push (claim :  Claim, exposure :  Exposure, costType :  CostType, costCategory :  CostCategory, reservingCurrency :  Currency, setReserveLine :  Boolean) : pcf.api.Location {
    return __newDestination(config(), {claim, exposure, costType, costCategory, reservingCurrency, setReserveLine}, 0).push()
  }
  
  
}