package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/cluster/ClusterMemberUserSessionsPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClusterMemberUserSessionsPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ClusterMemberUserSessionsPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (serverId :  String) : pcf.api.Destination {
    return __newDestination(config(), {serverId}, 0)
  }
  
  static function push (serverId :  String) : pcf.api.Location {
    return __newDestination(config(), {serverId}, 0).push()
  }
  
  
}