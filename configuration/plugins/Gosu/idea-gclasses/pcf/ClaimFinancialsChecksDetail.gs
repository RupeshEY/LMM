package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/checks/ClaimFinancialsChecksDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimFinancialsChecksDetail extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ClaimFinancialsChecksDetail, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (claim :  Claim, check :  Check) : pcf.api.Destination {
    return __newDestination(config(), {claim, check}, 0)
  }
  
  static function createDestination (claim :  Claim, check :  Check, autoPaidInvoice :  ServiceRequestInvoice) : pcf.api.Destination {
    return __newDestination(config(), {claim, check, autoPaidInvoice}, 1)
  }
  
  static function drilldown (claim :  Claim, check :  Check) : pcf.api.Location {
    return __newDestination(config(), {claim, check}, 0).drilldown()
  }
  
  static function drilldown (claim :  Claim, check :  Check, autoPaidInvoice :  ServiceRequestInvoice) : pcf.api.Location {
    return __newDestination(config(), {claim, check, autoPaidInvoice}, 1).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (claim :  Claim, check :  Check) : pcf.api.Location {
    return __newDestination(config(), {claim, check}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (claim :  Claim, check :  Check, autoPaidInvoice :  ServiceRequestInvoice) : pcf.api.Location {
    return __newDestination(config(), {claim, check, autoPaidInvoice}, 1).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (claim :  Claim, check :  Check) : pcf.api.Location {
    return __newDestination(config(), {claim, check}, 0).goInMain()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (claim :  Claim, check :  Check, autoPaidInvoice :  ServiceRequestInvoice) : pcf.api.Location {
    return __newDestination(config(), {claim, check, autoPaidInvoice}, 1).goInMain()
  }
  
  static function printPage (claim :  Claim, check :  Check) : pcf.api.Location {
    return __newDestination(config(), {claim, check}, 0).printPage()
  }
  
  static function printPage (claim :  Claim, check :  Check, autoPaidInvoice :  ServiceRequestInvoice) : pcf.api.Location {
    return __newDestination(config(), {claim, check, autoPaidInvoice}, 1).printPage()
  }
  
  static function push (claim :  Claim, check :  Check) : pcf.api.Location {
    return __newDestination(config(), {claim, check}, 0).push()
  }
  
  static function push (claim :  Claim, check :  Check, autoPaidInvoice :  ServiceRequestInvoice) : pcf.api.Location {
    return __newDestination(config(), {claim, check, autoPaidInvoice}, 1).push()
  }
  
  
}