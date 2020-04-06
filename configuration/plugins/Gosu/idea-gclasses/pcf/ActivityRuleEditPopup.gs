package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/ActivityRuleEditPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ActivityRuleEditPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ActivityRuleEditPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (importEntry :  RuleImportTaskEntry, importHelper :  gw.bizrules.pcf.RuleExportImportPageHelper<ActivityRuleVersion>, chosenSide :  RuleImportSide) : pcf.api.Destination {
    return __newDestination(config(), {importEntry, importHelper, chosenSide}, 0)
  }
  
  static function push (importEntry :  RuleImportTaskEntry, importHelper :  gw.bizrules.pcf.RuleExportImportPageHelper<ActivityRuleVersion>, chosenSide :  RuleImportSide) : pcf.api.Location {
    return __newDestination(config(), {importEntry, importHelper, chosenSide}, 0).push()
  }
  
  
}