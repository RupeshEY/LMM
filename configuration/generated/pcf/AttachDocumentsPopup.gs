package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/servicerequests/AttachDocumentsPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AttachDocumentsPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.AttachDocumentsPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (serviceRequest :  ServiceRequest, visibleToSpecialist :  boolean) : pcf.api.Destination {
    return __newDestination(config(), {serviceRequest, visibleToSpecialist}, 0)
  }
  
  static function push (serviceRequest :  ServiceRequest, visibleToSpecialist :  boolean) : pcf.api.Location {
    return __newDestination(config(), {serviceRequest, visibleToSpecialist}, 0).push()
  }
  
  
}