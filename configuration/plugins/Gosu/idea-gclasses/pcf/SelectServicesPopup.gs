package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/servicerequests/SelectServicesPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class SelectServicesPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.SelectServicesPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (serviceRequest :  ServiceRequest) : pcf.api.Destination {
    return __newDestination(config(), {serviceRequest}, 0)
  }
  
  static function createDestination (specialServicesParam :  java.util.List<SpecialistService>) : pcf.api.Destination {
    return __newDestination(config(), {specialServicesParam}, 1)
  }
  
  function pickValueAndCommit (value :  SpecialistService[]) : void {
    __widgetOf(this, pcf.SelectServicesPopup, LOCATION_WIDGET_CLASS).setPickedValueAndCommitChanges(value)
  }
  
  static function push (serviceRequest :  ServiceRequest) : pcf.api.Location {
    return __newDestination(config(), {serviceRequest}, 0).push()
  }
  
  static function push (specialServicesParam :  java.util.List<SpecialistService>) : pcf.api.Location {
    return __newDestination(config(), {specialServicesParam}, 1).push()
  }
  
  
}