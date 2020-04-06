package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/ActivityRulePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ActivityRulePopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ActivityRulePopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (ruleVersion :  ActivityRuleVersion, importing :  boolean) : pcf.api.Destination {
    return __newDestination(config(), {ruleVersion, importing}, 0)
  }
  
  static function push (ruleVersion :  ActivityRuleVersion, importing :  boolean) : pcf.api.Location {
    return __newDestination(config(), {ruleVersion, importing}, 0).push()
  }
  
  
}