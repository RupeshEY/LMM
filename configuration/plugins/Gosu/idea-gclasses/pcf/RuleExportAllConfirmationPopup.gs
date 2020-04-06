package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/RuleExportAllConfirmationPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class RuleExportAllConfirmationPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.RuleExportAllConfirmationPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (helper :  gw.bizrules.pcf.RuleExportPageHelper) : pcf.api.Destination {
    return __newDestination(config(), {helper}, 0)
  }
  
  static function push (helper :  gw.bizrules.pcf.RuleExportPageHelper) : pcf.api.Location {
    return __newDestination(config(), {helper}, 0).push()
  }
  
  
}