package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/trip/TripIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class TripIncidentPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.TripIncidentPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (aClaim :  Claim) : pcf.api.Destination {
    return __newDestination(config(), {aClaim}, 0)
  }
  
  static function createDestination (tripIncidentParam :  TripIncident, startInEditMode :  boolean) : pcf.api.Destination {
    return __newDestination(config(), {tripIncidentParam, startInEditMode}, 1)
  }
  
  function pickValueAndCommit (value :  TripIncident) : void {
    __widgetOf(this, pcf.TripIncidentPopup, LOCATION_WIDGET_CLASS).setPickedValueAndCommitChanges(value)
  }
  
  static function push (aClaim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {aClaim}, 0).push()
  }
  
  static function push (tripIncidentParam :  TripIncident, startInEditMode :  boolean) : pcf.api.Location {
    return __newDestination(config(), {tripIncidentParam, startInEditMode}, 1).push()
  }
  
  
}