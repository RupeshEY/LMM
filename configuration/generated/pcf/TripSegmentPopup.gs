package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/TripSegmentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class TripSegmentPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.TripSegmentPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (aTripSegmentParam :  TripSegment, aTripIncident :  TripIncident, startEditable :  Boolean) : pcf.api.Destination {
    return __newDestination(config(), {aTripSegmentParam, aTripIncident, startEditable}, 0)
  }
  
  function pickValueAndCommit (value :  TripSegment) : void {
    __widgetOf(this, pcf.TripSegmentPopup, LOCATION_WIDGET_CLASS).setPickedValueAndCommitChanges(value)
  }
  
  static function push (aTripSegmentParam :  TripSegment, aTripIncident :  TripIncident, startEditable :  Boolean) : pcf.api.Location {
    return __newDestination(config(), {aTripSegmentParam, aTripIncident, startEditable}, 0).push()
  }
  
  
}