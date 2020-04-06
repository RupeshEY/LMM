package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentContentItem/FixPropContentItemPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class FixPropContentItemPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.FixPropContentItemPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (AssessmentContentItem :  AssessmentContentItem) : pcf.api.Destination {
    return __newDestination(config(), {AssessmentContentItem}, 0)
  }
  
  static function push (AssessmentContentItem :  AssessmentContentItem) : pcf.api.Location {
    return __newDestination(config(), {AssessmentContentItem}, 0).push()
  }
  
  
}