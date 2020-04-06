package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/servicerequests/ClaimServiceRequestForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimServiceRequestForward extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ClaimServiceRequestForward, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (claim :  Claim, serviceRequest :  ServiceRequest) : pcf.api.Destination {
    return __newDestination(config(), {claim, serviceRequest}, 1)
  }
  
  static function createDestination (claim :  Claim, serviceRequest :  ServiceRequest, initialInvoice :  ServiceRequestInvoice) : pcf.api.Destination {
    return __newDestination(config(), {claim, serviceRequest, initialInvoice}, 0)
  }
  
  static function drilldown (claim :  Claim, serviceRequest :  ServiceRequest) : pcf.api.Location {
    return __newDestination(config(), {claim, serviceRequest}, 1).drilldown()
  }
  
  static function drilldown (claim :  Claim, serviceRequest :  ServiceRequest, initialInvoice :  ServiceRequestInvoice) : pcf.api.Location {
    return __newDestination(config(), {claim, serviceRequest, initialInvoice}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (claim :  Claim, serviceRequest :  ServiceRequest) : pcf.api.Location {
    return __newDestination(config(), {claim, serviceRequest}, 1).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (claim :  Claim, serviceRequest :  ServiceRequest, initialInvoice :  ServiceRequestInvoice) : pcf.api.Location {
    return __newDestination(config(), {claim, serviceRequest, initialInvoice}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (claim :  Claim, serviceRequest :  ServiceRequest) : pcf.api.Location {
    return __newDestination(config(), {claim, serviceRequest}, 1).goInMain()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (claim :  Claim, serviceRequest :  ServiceRequest, initialInvoice :  ServiceRequestInvoice) : pcf.api.Location {
    return __newDestination(config(), {claim, serviceRequest, initialInvoice}, 0).goInMain()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInWorkspace (claim :  Claim, serviceRequest :  ServiceRequest) : pcf.api.Location {
    return __newDestination(config(), {claim, serviceRequest}, 1).goInWorkspace()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInWorkspace (claim :  Claim, serviceRequest :  ServiceRequest, initialInvoice :  ServiceRequestInvoice) : pcf.api.Location {
    return __newDestination(config(), {claim, serviceRequest, initialInvoice}, 0).goInWorkspace()
  }
  
  static function printPage (claim :  Claim, serviceRequest :  ServiceRequest) : pcf.api.Location {
    return __newDestination(config(), {claim, serviceRequest}, 1).printPage()
  }
  
  static function printPage (claim :  Claim, serviceRequest :  ServiceRequest, initialInvoice :  ServiceRequestInvoice) : pcf.api.Location {
    return __newDestination(config(), {claim, serviceRequest, initialInvoice}, 0).printPage()
  }
  
  static function push (claim :  Claim, serviceRequest :  ServiceRequest) : pcf.api.Location {
    return __newDestination(config(), {claim, serviceRequest}, 1).push()
  }
  
  static function push (claim :  Claim, serviceRequest :  ServiceRequest, initialInvoice :  ServiceRequestInvoice) : pcf.api.Location {
    return __newDestination(config(), {claim, serviceRequest, initialInvoice}, 0).push()
  }
  
  
}