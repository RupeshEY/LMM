package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/workload/NewWorkloadClassificationPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewWorkloadClassificationPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.NewWorkloadClassificationPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (entityType :  Type) : pcf.api.Destination {
    return __newDestination(config(), {entityType}, 0)
  }
  
  static function push (entityType :  Type) : pcf.api.Location {
    return __newDestination(config(), {entityType}, 0).push()
  }
  
  
}