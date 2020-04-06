package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/cluster/ClusterComponentHistoryPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClusterComponentHistoryPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ClusterComponentHistoryPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (data :  gw.api.tools.ClusterComponentsData, component :  gw.api.system.cluster.ComponentInfo) : pcf.api.Destination {
    return __newDestination(config(), {data, component}, 0)
  }
  
  static function push (data :  gw.api.tools.ClusterComponentsData, component :  gw.api.system.cluster.ComponentInfo) : pcf.api.Location {
    return __newDestination(config(), {data, component}, 0).push()
  }
  
  
}