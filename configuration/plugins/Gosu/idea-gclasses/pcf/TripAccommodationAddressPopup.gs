package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/TripAccommodationAddressPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class TripAccommodationAddressPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.TripAccommodationAddressPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (aTripAccommodation :  TripAccommodation, aTripIncident :  TripIncident, isParentInEditMode :  Boolean) : pcf.api.Destination {
    return __newDestination(config(), {aTripAccommodation, aTripIncident, isParentInEditMode}, 0)
  }
  
  static function createDestination (aTripIncident :  TripIncident, isParentInEditMode :  Boolean) : pcf.api.Destination {
    return __newDestination(config(), {aTripIncident, isParentInEditMode}, 1)
  }
  
  function pickValueAndCommit (value :  TripAccommodation) : void {
    __widgetOf(this, pcf.TripAccommodationAddressPopup, LOCATION_WIDGET_CLASS).setPickedValueAndCommitChanges(value)
  }
  
  static function push (aTripAccommodation :  TripAccommodation, aTripIncident :  TripIncident, isParentInEditMode :  Boolean) : pcf.api.Location {
    return __newDestination(config(), {aTripAccommodation, aTripIncident, isParentInEditMode}, 0).push()
  }
  
  static function push (aTripIncident :  TripIncident, isParentInEditMode :  Boolean) : pcf.api.Location {
    return __newDestination(config(), {aTripIncident, isParentInEditMode}, 1).push()
  }
  
  
}