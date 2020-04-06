package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentSource/IncidentAssessSourcePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class IncidentAssessSourcePopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.IncidentAssessSourcePopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (assessmentSource :  AssessmentSource) : pcf.api.Destination {
    return __newDestination(config(), {assessmentSource}, 0)
  }
  
  static function push (assessmentSource :  AssessmentSource) : pcf.api.Location {
    return __newDestination(config(), {assessmentSource}, 0).push()
  }
  
  
}