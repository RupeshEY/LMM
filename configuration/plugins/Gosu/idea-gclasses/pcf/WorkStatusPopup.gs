package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/incidents/WorkStatusPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class WorkStatusPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.WorkStatusPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (specificWorkStatus :  WorkStatus, willStartInEditMode :  Boolean) : pcf.api.Destination {
    return __newDestination(config(), {specificWorkStatus, willStartInEditMode}, 0)
  }
  
  static function push (specificWorkStatus :  WorkStatus, willStartInEditMode :  Boolean) : pcf.api.Location {
    return __newDestination(config(), {specificWorkStatus, willStartInEditMode}, 0).push()
  }
  
  
}