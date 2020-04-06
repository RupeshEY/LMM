package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimServiceRequests extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ClaimServiceRequests, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (claim :  Claim) : pcf.api.Destination {
    return __newDestination(config(), {claim}, 0)
  }
  
  static function createDestination (claim :  Claim, initialServiceRequest :  ServiceRequest) : pcf.api.Destination {
    return __newDestination(config(), {claim, initialServiceRequest}, 1)
  }
  
  static function createDestination (claim :  Claim, initialServiceRequest :  ServiceRequest, initialInvoice :  ServiceRequestInvoice) : pcf.api.Destination {
    return __newDestination(config(), {claim, initialServiceRequest, initialInvoice}, 2)
  }
  
  static function drilldown (claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {claim}, 0).drilldown()
  }
  
  static function drilldown (claim :  Claim, initialServiceRequest :  ServiceRequest) : pcf.api.Location {
    return __newDestination(config(), {claim, initialServiceRequest}, 1).drilldown()
  }
  
  static function drilldown (claim :  Claim, initialServiceRequest :  ServiceRequest, initialInvoice :  ServiceRequestInvoice) : pcf.api.Location {
    return __newDestination(config(), {claim, initialServiceRequest, initialInvoice}, 2).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {claim}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (claim :  Claim, initialServiceRequest :  ServiceRequest) : pcf.api.Location {
    return __newDestination(config(), {claim, initialServiceRequest}, 1).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (claim :  Claim, initialServiceRequest :  ServiceRequest, initialInvoice :  ServiceRequestInvoice) : pcf.api.Location {
    return __newDestination(config(), {claim, initialServiceRequest, initialInvoice}, 2).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {claim}, 0).goInMain()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (claim :  Claim, initialServiceRequest :  ServiceRequest) : pcf.api.Location {
    return __newDestination(config(), {claim, initialServiceRequest}, 1).goInMain()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (claim :  Claim, initialServiceRequest :  ServiceRequest, initialInvoice :  ServiceRequestInvoice) : pcf.api.Location {
    return __newDestination(config(), {claim, initialServiceRequest, initialInvoice}, 2).goInMain()
  }
  
  static function printPage (claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {claim}, 0).printPage()
  }
  
  static function printPage (claim :  Claim, initialServiceRequest :  ServiceRequest) : pcf.api.Location {
    return __newDestination(config(), {claim, initialServiceRequest}, 1).printPage()
  }
  
  static function printPage (claim :  Claim, initialServiceRequest :  ServiceRequest, initialInvoice :  ServiceRequestInvoice) : pcf.api.Location {
    return __newDestination(config(), {claim, initialServiceRequest, initialInvoice}, 2).printPage()
  }
  
  static function push (claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {claim}, 0).push()
  }
  
  static function push (claim :  Claim, initialServiceRequest :  ServiceRequest) : pcf.api.Location {
    return __newDestination(config(), {claim, initialServiceRequest}, 1).push()
  }
  
  static function push (claim :  Claim, initialServiceRequest :  ServiceRequest, initialInvoice :  ServiceRequestInvoice) : pcf.api.Location {
    return __newDestination(config(), {claim, initialServiceRequest, initialInvoice}, 2).push()
  }
  
  
}