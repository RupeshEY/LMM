package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/BaggageIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class BaggageIncidentPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.BaggageIncidentPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (baggageIncidentParam :  BaggageIncident, startInEditMode :  boolean) : pcf.api.Destination {
    return __newDestination(config(), {baggageIncidentParam, startInEditMode}, 0)
  }
  
  static function createDestination (aClaim :  Claim) : pcf.api.Destination {
    return __newDestination(config(), {aClaim}, 1)
  }
  
  function pickValueAndCommit (value :  BaggageIncident) : void {
    __widgetOf(this, pcf.BaggageIncidentPopup, LOCATION_WIDGET_CLASS).setPickedValueAndCommitChanges(value)
  }
  
  static function push (baggageIncidentParam :  BaggageIncident, startInEditMode :  boolean) : pcf.api.Location {
    return __newDestination(config(), {baggageIncidentParam, startInEditMode}, 0).push()
  }
  
  static function push (aClaim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {aClaim}, 1).push()
  }
  
  
}