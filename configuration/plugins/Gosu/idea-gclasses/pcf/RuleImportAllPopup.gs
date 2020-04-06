package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/RuleImportAllPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class RuleImportAllPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.RuleImportAllPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (pageHelper :  gw.bizrules.pcf.RuleExportImportPageHelper, importTask :  RuleImportTask) : pcf.api.Destination {
    return __newDestination(config(), {pageHelper, importTask}, 0)
  }
  
  static function push (pageHelper :  gw.bizrules.pcf.RuleExportImportPageHelper, importTask :  RuleImportTask) : pcf.api.Location {
    return __newDestination(config(), {pageHelper, importTask}, 0).push()
  }
  
  
}