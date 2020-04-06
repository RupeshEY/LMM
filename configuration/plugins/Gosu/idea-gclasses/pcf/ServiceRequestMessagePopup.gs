package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/servicerequests/ServiceRequestMessagePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ServiceRequestMessagePopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ServiceRequestMessagePopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (serviceRequest :  ServiceRequest) : pcf.api.Destination {
    return __newDestination(config(), {serviceRequest}, 0)
  }
  
  static function createDestination (serviceRequest :  ServiceRequest, subject :  String) : pcf.api.Destination {
    return __newDestination(config(), {serviceRequest, subject}, 1)
  }
  
  function pickValueAndCommit (value :  ServiceRequestMessage) : void {
    __widgetOf(this, pcf.ServiceRequestMessagePopup, LOCATION_WIDGET_CLASS).setPickedValueAndCommitChanges(value)
  }
  
  static function push (serviceRequest :  ServiceRequest) : pcf.api.Location {
    return __newDestination(config(), {serviceRequest}, 0).push()
  }
  
  static function push (serviceRequest :  ServiceRequest, subject :  String) : pcf.api.Location {
    return __newDestination(config(), {serviceRequest, subject}, 1).push()
  }
  
  
}