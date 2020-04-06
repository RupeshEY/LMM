package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/RuleExportDetailsPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class RuleExportDetailsPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.RuleExportDetailsPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (navigationSupport :  gw.bizrules.pcf.BizRulesPageNavigationSupport, exportTask :  RuleExportTask) : pcf.api.Destination {
    return __newDestination(config(), {navigationSupport, exportTask}, 0)
  }
  
  static function push (navigationSupport :  gw.bizrules.pcf.BizRulesPageNavigationSupport, exportTask :  RuleExportTask) : pcf.api.Location {
    return __newDestination(config(), {navigationSupport, exportTask}, 0).push()
  }
  
  
}