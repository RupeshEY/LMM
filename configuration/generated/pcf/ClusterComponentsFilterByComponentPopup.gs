package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/cluster/ClusterComponentsFilterByComponentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClusterComponentsFilterByComponentPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ClusterComponentsFilterByComponentPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (data :  gw.api.tools.ClusterComponentsData) : pcf.api.Destination {
    return __newDestination(config(), {data}, 0)
  }
  
  static function push (data :  gw.api.tools.ClusterComponentsData) : pcf.api.Location {
    return __newDestination(config(), {data}, 0).push()
  }
  
  
}