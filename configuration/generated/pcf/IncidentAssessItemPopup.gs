package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentItem/IncidentAssessItemPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class IncidentAssessItemPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.IncidentAssessItemPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (assessmentItem :  AssessmentItem) : pcf.api.Destination {
    return __newDestination(config(), {assessmentItem}, 0)
  }
  
  static function push (assessmentItem :  AssessmentItem) : pcf.api.Location {
    return __newDestination(config(), {assessmentItem}, 0).push()
  }
  
  
}