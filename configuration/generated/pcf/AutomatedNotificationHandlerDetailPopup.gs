package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/specialhandling/AutomatedNotificationHandlerDetailPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AutomatedNotificationHandlerDetailPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.AutomatedNotificationHandlerDetailPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (automatedHandler :  AutomatedNotificationHandler, startInEditMode :  boolean, canEdit :  boolean) : pcf.api.Destination {
    return __newDestination(config(), {automatedHandler, startInEditMode, canEdit}, 0)
  }
  
  static function push (automatedHandler :  AutomatedNotificationHandler, startInEditMode :  boolean, canEdit :  boolean) : pcf.api.Location {
    return __newDestination(config(), {automatedHandler, startInEditMode, canEdit}, 0).push()
  }
  
  
}