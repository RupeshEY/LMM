package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/workspace/activity/newdocument/ClaimNewDocumentFromActivityPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimNewDocumentFromActivityPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ClaimNewDocumentFromActivityPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (Activity :  Activity, Template :  gw.plugin.document.IDocumentTemplateDescriptor) : pcf.api.Destination {
    return __newDestination(config(), {Activity, Template}, 0)
  }
  
  static function push (Activity :  Activity, Template :  gw.plugin.document.IDocumentTemplateDescriptor) : pcf.api.Location {
    return __newDestination(config(), {Activity, Template}, 0).push()
  }
  
  
}