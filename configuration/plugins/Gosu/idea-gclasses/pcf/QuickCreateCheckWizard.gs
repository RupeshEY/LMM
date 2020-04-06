package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/transactions/QuickCreateCheckWizard.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class QuickCreateCheckWizard extends com.guidewire.pl.web.codegen.WizardBase {
  private static function config () : com.guidewire.pl.web.navigation.wizard.WizardConfig {
    return __configOf(pcf.QuickCreateCheckWizard, WIZARD_CONFIG_CLASS)
  }
  
  static function createDestination (claim :  Claim) : pcf.api.Destination {
    return __newDestination(config(), {claim}, 0)
  }
  
  static function createDestination (claim :  Claim, exposure :  Exposure, costType :  CostType, costCategory :  CostCategory, reservingCurrency :  Currency, setReserveLine :  Boolean) : pcf.api.Destination {
    return __newDestination(config(), {claim, exposure, costType, costCategory, reservingCurrency, setReserveLine}, 1)
  }
  
  static function drilldown (claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {claim}, 0).drilldown()
  }
  
  static function drilldown (claim :  Claim, exposure :  Exposure, costType :  CostType, costCategory :  CostCategory, reservingCurrency :  Currency, setReserveLine :  Boolean) : pcf.api.Location {
    return __newDestination(config(), {claim, exposure, costType, costCategory, reservingCurrency, setReserveLine}, 1).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {claim}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (claim :  Claim, exposure :  Exposure, costType :  CostType, costCategory :  CostCategory, reservingCurrency :  Currency, setReserveLine :  Boolean) : pcf.api.Location {
    return __newDestination(config(), {claim, exposure, costType, costCategory, reservingCurrency, setReserveLine}, 1).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {claim}, 0).goInMain()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (claim :  Claim, exposure :  Exposure, costType :  CostType, costCategory :  CostCategory, reservingCurrency :  Currency, setReserveLine :  Boolean) : pcf.api.Location {
    return __newDestination(config(), {claim, exposure, costType, costCategory, reservingCurrency, setReserveLine}, 1).goInMain()
  }
  
  static function printPage (claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {claim}, 0).printPage()
  }
  
  static function printPage (claim :  Claim, exposure :  Exposure, costType :  CostType, costCategory :  CostCategory, reservingCurrency :  Currency, setReserveLine :  Boolean) : pcf.api.Location {
    return __newDestination(config(), {claim, exposure, costType, costCategory, reservingCurrency, setReserveLine}, 1).printPage()
  }
  
  static function push (claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {claim}, 0).push()
  }
  
  static function push (claim :  Claim, exposure :  Exposure, costType :  CostType, costCategory :  CostCategory, reservingCurrency :  Currency, setReserveLine :  Boolean) : pcf.api.Location {
    return __newDestination(config(), {claim, exposure, costType, costCategory, reservingCurrency, setReserveLine}, 1).push()
  }
  
  
}