package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/ActivityRuleComparisonPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ActivityRuleComparisonPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ActivityRuleComparisonPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (version1 :  ActivityRuleVersion, version2 :  ActivityRuleVersion) : pcf.api.Destination {
    return __newDestination(config(), {version1, version2}, 0)
  }
  
  static function createDestination (importEntry :  RuleImportTaskEntry, importHelper :  gw.bizrules.pcf.RuleExportImportPageHelper<ActivityRuleVersion>) : pcf.api.Destination {
    return __newDestination(config(), {importEntry, importHelper}, 1)
  }
  
  static function push (version1 :  ActivityRuleVersion, version2 :  ActivityRuleVersion) : pcf.api.Location {
    return __newDestination(config(), {version1, version2}, 0).push()
  }
  
  static function push (importEntry :  RuleImportTaskEntry, importHelper :  gw.bizrules.pcf.RuleExportImportPageHelper<ActivityRuleVersion>) : pcf.api.Location {
    return __newDestination(config(), {importEntry, importHelper}, 1).push()
  }
  
  
}