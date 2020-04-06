package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentItem/VehAssessItemPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class VehAssessItemPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.VehAssessItemPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (AssessmentItem :  AssessmentItem) : pcf.api.Destination {
    return __newDestination(config(), {AssessmentItem}, 0)
  }
  
  static function push (AssessmentItem :  AssessmentItem) : pcf.api.Location {
    return __newDestination(config(), {AssessmentItem}, 0).push()
  }
  
  
}