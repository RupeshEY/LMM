package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/servicerequests/AddReviseQuotePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AddReviseQuotePopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.AddReviseQuotePopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (serviceRequest :  entity.ServiceRequest) : pcf.api.Destination {
    return __newDestination(config(), {serviceRequest}, 0)
  }
  
  static function createDestination (serviceRequest :  entity.ServiceRequest, oldQuote :  entity.ServiceRequestQuote) : pcf.api.Destination {
    return __newDestination(config(), {serviceRequest, oldQuote}, 1)
  }
  
  static function push (serviceRequest :  entity.ServiceRequest) : pcf.api.Location {
    return __newDestination(config(), {serviceRequest}, 0).push()
  }
  
  static function push (serviceRequest :  entity.ServiceRequest, oldQuote :  entity.ServiceRequestQuote) : pcf.api.Location {
    return __newDestination(config(), {serviceRequest, oldQuote}, 1).push()
  }
  
  
}