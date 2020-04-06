package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/WorkQueueHistoryDownloadConfigurePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class WorkQueueHistoryDownloadConfigurePopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.WorkQueueHistoryDownloadConfigurePopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (WorkQueueDisplayInfo :  gw.api.web.tools.WorkQueueDisplayInfo) : pcf.api.Destination {
    return __newDestination(config(), {WorkQueueDisplayInfo}, 0)
  }
  
  static function push (WorkQueueDisplayInfo :  gw.api.web.tools.WorkQueueDisplayInfo) : pcf.api.Location {
    return __newDestination(config(), {WorkQueueDisplayInfo}, 0).push()
  }
  
  
}