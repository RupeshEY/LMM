package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/specialhandling/AutomatedActivityHandlerDetailPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AutomatedActivityHandlerDetailPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.AutomatedActivityHandlerDetailPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (automatedHandler :  AutomatedActivityHandler, startInEditMode :  boolean, canEdit :  boolean) : pcf.api.Destination {
    return __newDestination(config(), {automatedHandler, startInEditMode, canEdit}, 0)
  }
  
  static function push (automatedHandler :  AutomatedActivityHandler, startInEditMode :  boolean, canEdit :  boolean) : pcf.api.Location {
    return __newDestination(config(), {automatedHandler, startInEditMode, canEdit}, 0).push()
  }
  
  
}