package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/servicerequests/OperationReasonPromptPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class OperationReasonPromptPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.OperationReasonPromptPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (serviceRequest :  ServiceRequest, invoice :  ServiceRequestInvoice, operation :  ServiceRequestOperation) : pcf.api.Destination {
    return __newDestination(config(), {serviceRequest, invoice, operation}, 1)
  }
  
  static function createDestination (serviceRequest :  ServiceRequest, operation :  ServiceRequestOperation) : pcf.api.Destination {
    return __newDestination(config(), {serviceRequest, operation}, 0)
  }
  
  static function push (serviceRequest :  ServiceRequest, invoice :  ServiceRequestInvoice, operation :  ServiceRequestOperation) : pcf.api.Location {
    return __newDestination(config(), {serviceRequest, invoice, operation}, 1).push()
  }
  
  static function push (serviceRequest :  ServiceRequest, operation :  ServiceRequestOperation) : pcf.api.Location {
    return __newDestination(config(), {serviceRequest, operation}, 0).push()
  }
  
  
}