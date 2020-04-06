package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/AdditionalTripAccommodationAddressPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AdditionalTripAccommodationAddressPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.AdditionalTripAccommodationAddressPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (anAddnlTripAccommodation :  AddnlTripAccommodation, affectedTripAccommodation :  TripAccommodation, isParentInEditMode :  Boolean) : pcf.api.Destination {
    return __newDestination(config(), {anAddnlTripAccommodation, affectedTripAccommodation, isParentInEditMode}, 0)
  }
  
  function pickValueAndCommit (value :  AddnlTripAccommodation) : void {
    __widgetOf(this, pcf.AdditionalTripAccommodationAddressPopup, LOCATION_WIDGET_CLASS).setPickedValueAndCommitChanges(value)
  }
  
  static function push (anAddnlTripAccommodation :  AddnlTripAccommodation, affectedTripAccommodation :  TripAccommodation, isParentInEditMode :  Boolean) : pcf.api.Location {
    return __newDestination(config(), {anAddnlTripAccommodation, affectedTripAccommodation, isParentInEditMode}, 0).push()
  }
  
  
}