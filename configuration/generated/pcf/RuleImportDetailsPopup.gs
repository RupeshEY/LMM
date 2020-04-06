package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/RuleImportDetailsPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class RuleImportDetailsPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.RuleImportDetailsPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (navigationSupport :  gw.bizrules.pcf.BizRulesPageNavigationSupport, importTask :  RuleImportTask, completed :  boolean) : pcf.api.Destination {
    return __newDestination(config(), {navigationSupport, importTask, completed}, 0)
  }
  
  static function push (navigationSupport :  gw.bizrules.pcf.BizRulesPageNavigationSupport, importTask :  RuleImportTask, completed :  boolean) : pcf.api.Location {
    return __newDestination(config(), {navigationSupport, importTask, completed}, 0).push()
  }
  
  
}