package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentItem/NewIncidentAssessItemPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewIncidentAssessItemPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.NewIncidentAssessItemPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (incident :  Incident) : pcf.api.Destination {
    return __newDestination(config(), {incident}, 0)
  }
  
  function pickValueAndCommit (value :  AssessmentItem) : void {
    __widgetOf(this, pcf.NewIncidentAssessItemPopup, LOCATION_WIDGET_CLASS).setPickedValueAndCommitChanges(value)
  }
  
  static function push (incident :  Incident) : pcf.api.Location {
    return __newDestination(config(), {incident}, 0).push()
  }
  
  
}