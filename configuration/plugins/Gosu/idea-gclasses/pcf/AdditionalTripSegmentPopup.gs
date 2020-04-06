package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/AdditionalTripSegmentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AdditionalTripSegmentPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.AdditionalTripSegmentPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (addnlTripSegment :  AddnlTripSegment, affectedTripSegment :  TripSegment, isParentInEditMode :  Boolean) : pcf.api.Destination {
    return __newDestination(config(), {addnlTripSegment, affectedTripSegment, isParentInEditMode}, 1)
  }
  
  static function createDestination (affectedTripSegment :  TripSegment, isParentInEditMode :  Boolean) : pcf.api.Destination {
    return __newDestination(config(), {affectedTripSegment, isParentInEditMode}, 0)
  }
  
  function pickValueAndCommit (value :  AddnlTripSegment) : void {
    __widgetOf(this, pcf.AdditionalTripSegmentPopup, LOCATION_WIDGET_CLASS).setPickedValueAndCommitChanges(value)
  }
  
  static function push (addnlTripSegment :  AddnlTripSegment, affectedTripSegment :  TripSegment, isParentInEditMode :  Boolean) : pcf.api.Location {
    return __newDestination(config(), {addnlTripSegment, affectedTripSegment, isParentInEditMode}, 1).push()
  }
  
  static function push (affectedTripSegment :  TripSegment, isParentInEditMode :  Boolean) : pcf.api.Location {
    return __newDestination(config(), {affectedTripSegment, isParentInEditMode}, 0).push()
  }
  
  
}