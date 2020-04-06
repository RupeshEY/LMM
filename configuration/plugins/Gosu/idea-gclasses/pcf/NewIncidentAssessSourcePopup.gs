package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentSource/NewIncidentAssessSourcePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewIncidentAssessSourcePopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.NewIncidentAssessSourcePopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (incident :  Incident) : pcf.api.Destination {
    return __newDestination(config(), {incident}, 0)
  }
  
  function pickValueAndCommit (value :  AssessmentSource) : void {
    __widgetOf(this, pcf.NewIncidentAssessSourcePopup, LOCATION_WIDGET_CLASS).setPickedValueAndCommitChanges(value)
  }
  
  static function push (incident :  Incident) : pcf.api.Location {
    return __newDestination(config(), {incident}, 0).push()
  }
  
  
}