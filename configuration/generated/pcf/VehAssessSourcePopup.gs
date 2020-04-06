package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentSource/VehAssessSourcePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class VehAssessSourcePopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.VehAssessSourcePopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (AssessmentSource :  AssessmentSource) : pcf.api.Destination {
    return __newDestination(config(), {AssessmentSource}, 0)
  }
  
  static function push (AssessmentSource :  AssessmentSource) : pcf.api.Location {
    return __newDestination(config(), {AssessmentSource}, 0).push()
  }
  
  
}