package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentItem/NewVehAssessItemPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewVehAssessItemPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.NewVehAssessItemPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (VehicleIncident :  VehicleIncident) : pcf.api.Destination {
    return __newDestination(config(), {VehicleIncident}, 0)
  }
  
  function pickValueAndCommit (value :  AssessmentItem) : void {
    __widgetOf(this, pcf.NewVehAssessItemPopup, LOCATION_WIDGET_CLASS).setPickedValueAndCommitChanges(value)
  }
  
  static function push (VehicleIncident :  VehicleIncident) : pcf.api.Location {
    return __newDestination(config(), {VehicleIncident}, 0).push()
  }
  
  
}