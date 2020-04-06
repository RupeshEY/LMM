package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/check/NormalCreateCheckWizardForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NormalCreateCheckWizardForward extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.NormalCreateCheckWizardForward, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (claim :  Claim) : pcf.api.Destination {
    return __newDestination(config(), {claim}, 0)
  }
  
  static function createDestination (claim :  Claim, exposure :  Exposure, costType :  CostType, costCategory :  CostCategory, reservingCurrency :  Currency, setReserveLine :  boolean) : pcf.api.Destination {
    return __newDestination(config(), {claim, exposure, costType, costCategory, reservingCurrency, setReserveLine}, 1)
  }
  
  static function createDestination (claim :  Claim, serviceRequestInvoice :  ServiceRequestInvoice) : pcf.api.Destination {
    return __newDestination(config(), {claim, serviceRequestInvoice}, 2)
  }
  
  static function drilldown (claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {claim}, 0).drilldown()
  }
  
  static function drilldown (claim :  Claim, exposure :  Exposure, costType :  CostType, costCategory :  CostCategory, reservingCurrency :  Currency, setReserveLine :  boolean) : pcf.api.Location {
    return __newDestination(config(), {claim, exposure, costType, costCategory, reservingCurrency, setReserveLine}, 1).drilldown()
  }
  
  static function drilldown (claim :  Claim, serviceRequestInvoice :  ServiceRequestInvoice) : pcf.api.Location {
    return __newDestination(config(), {claim, serviceRequestInvoice}, 2).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {claim}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (claim :  Claim, exposure :  Exposure, costType :  CostType, costCategory :  CostCategory, reservingCurrency :  Currency, setReserveLine :  boolean) : pcf.api.Location {
    return __newDestination(config(), {claim, exposure, costType, costCategory, reservingCurrency, setReserveLine}, 1).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (claim :  Claim, serviceRequestInvoice :  ServiceRequestInvoice) : pcf.api.Location {
    return __newDestination(config(), {claim, serviceRequestInvoice}, 2).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {claim}, 0).goInMain()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (claim :  Claim, exposure :  Exposure, costType :  CostType, costCategory :  CostCategory, reservingCurrency :  Currency, setReserveLine :  boolean) : pcf.api.Location {
    return __newDestination(config(), {claim, exposure, costType, costCategory, reservingCurrency, setReserveLine}, 1).goInMain()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (claim :  Claim, serviceRequestInvoice :  ServiceRequestInvoice) : pcf.api.Location {
    return __newDestination(config(), {claim, serviceRequestInvoice}, 2).goInMain()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInWorkspace (claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {claim}, 0).goInWorkspace()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInWorkspace (claim :  Claim, exposure :  Exposure, costType :  CostType, costCategory :  CostCategory, reservingCurrency :  Currency, setReserveLine :  boolean) : pcf.api.Location {
    return __newDestination(config(), {claim, exposure, costType, costCategory, reservingCurrency, setReserveLine}, 1).goInWorkspace()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInWorkspace (claim :  Claim, serviceRequestInvoice :  ServiceRequestInvoice) : pcf.api.Location {
    return __newDestination(config(), {claim, serviceRequestInvoice}, 2).goInWorkspace()
  }
  
  static function printPage (claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {claim}, 0).printPage()
  }
  
  static function printPage (claim :  Claim, exposure :  Exposure, costType :  CostType, costCategory :  CostCategory, reservingCurrency :  Currency, setReserveLine :  boolean) : pcf.api.Location {
    return __newDestination(config(), {claim, exposure, costType, costCategory, reservingCurrency, setReserveLine}, 1).printPage()
  }
  
  static function printPage (claim :  Claim, serviceRequestInvoice :  ServiceRequestInvoice) : pcf.api.Location {
    return __newDestination(config(), {claim, serviceRequestInvoice}, 2).printPage()
  }
  
  static function push (claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {claim}, 0).push()
  }
  
  static function push (claim :  Claim, exposure :  Exposure, costType :  CostType, costCategory :  CostCategory, reservingCurrency :  Currency, setReserveLine :  boolean) : pcf.api.Location {
    return __newDestination(config(), {claim, exposure, costType, costCategory, reservingCurrency, setReserveLine}, 1).push()
  }
  
  static function push (claim :  Claim, serviceRequestInvoice :  ServiceRequestInvoice) : pcf.api.Location {
    return __newDestination(config(), {claim, serviceRequestInvoice}, 2).push()
  }
  
  
}