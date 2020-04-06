package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/check/NormalCreateCheckWizard.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NormalCreateCheckWizard extends com.guidewire.pl.web.codegen.WizardBase {
  private static function config () : com.guidewire.pl.web.navigation.wizard.WizardConfig {
    return __configOf(pcf.NormalCreateCheckWizard, WIZARD_CONFIG_CLASS)
  }
  
  static function createDestination (claim :  Claim) : pcf.api.Destination {
    return __newDestination(config(), {claim}, 0)
  }
  
  static function createDestination (claim :  Claim, exposure :  Exposure, costType :  CostType, costCategory :  CostCategory, reservingCurrency :  Currency, setReserveLine :  boolean) : pcf.api.Destination {
    return __newDestination(config(), {claim, exposure, costType, costCategory, reservingCurrency, setReserveLine}, 2)
  }
  
  static function createDestination (claim :  Claim, serviceRequestInvoice :  ServiceRequestInvoice) : pcf.api.Destination {
    return __newDestination(config(), {claim, serviceRequestInvoice}, 1)
  }
  
  static function drilldown (claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {claim}, 0).drilldown()
  }
  
  static function drilldown (claim :  Claim, exposure :  Exposure, costType :  CostType, costCategory :  CostCategory, reservingCurrency :  Currency, setReserveLine :  boolean) : pcf.api.Location {
    return __newDestination(config(), {claim, exposure, costType, costCategory, reservingCurrency, setReserveLine}, 2).drilldown()
  }
  
  static function drilldown (claim :  Claim, serviceRequestInvoice :  ServiceRequestInvoice) : pcf.api.Location {
    return __newDestination(config(), {claim, serviceRequestInvoice}, 1).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {claim}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (claim :  Claim, exposure :  Exposure, costType :  CostType, costCategory :  CostCategory, reservingCurrency :  Currency, setReserveLine :  boolean) : pcf.api.Location {
    return __newDestination(config(), {claim, exposure, costType, costCategory, reservingCurrency, setReserveLine}, 2).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (claim :  Claim, serviceRequestInvoice :  ServiceRequestInvoice) : pcf.api.Location {
    return __newDestination(config(), {claim, serviceRequestInvoice}, 1).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {claim}, 0).goInMain()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (claim :  Claim, exposure :  Exposure, costType :  CostType, costCategory :  CostCategory, reservingCurrency :  Currency, setReserveLine :  boolean) : pcf.api.Location {
    return __newDestination(config(), {claim, exposure, costType, costCategory, reservingCurrency, setReserveLine}, 2).goInMain()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (claim :  Claim, serviceRequestInvoice :  ServiceRequestInvoice) : pcf.api.Location {
    return __newDestination(config(), {claim, serviceRequestInvoice}, 1).goInMain()
  }
  
  static function printPage (claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {claim}, 0).printPage()
  }
  
  static function printPage (claim :  Claim, exposure :  Exposure, costType :  CostType, costCategory :  CostCategory, reservingCurrency :  Currency, setReserveLine :  boolean) : pcf.api.Location {
    return __newDestination(config(), {claim, exposure, costType, costCategory, reservingCurrency, setReserveLine}, 2).printPage()
  }
  
  static function printPage (claim :  Claim, serviceRequestInvoice :  ServiceRequestInvoice) : pcf.api.Location {
    return __newDestination(config(), {claim, serviceRequestInvoice}, 1).printPage()
  }
  
  static function push (claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {claim}, 0).push()
  }
  
  static function push (claim :  Claim, exposure :  Exposure, costType :  CostType, costCategory :  CostCategory, reservingCurrency :  Currency, setReserveLine :  boolean) : pcf.api.Location {
    return __newDestination(config(), {claim, exposure, costType, costCategory, reservingCurrency, setReserveLine}, 2).push()
  }
  
  static function push (claim :  Claim, serviceRequestInvoice :  ServiceRequestInvoice) : pcf.api.Location {
    return __newDestination(config(), {claim, serviceRequestInvoice}, 1).push()
  }
  
  
}