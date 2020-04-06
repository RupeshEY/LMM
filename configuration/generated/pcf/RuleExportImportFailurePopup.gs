package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/RuleExportImportFailurePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class RuleExportImportFailurePopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.RuleExportImportFailurePopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (reason :  String) : pcf.api.Destination {
    return __newDestination(config(), {reason}, 0)
  }
  
  static function push (reason :  String) : pcf.api.Location {
    return __newDestination(config(), {reason}, 0).push()
  }
  
  
}