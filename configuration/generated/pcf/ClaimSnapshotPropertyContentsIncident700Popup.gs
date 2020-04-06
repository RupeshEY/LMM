package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotPropertyContentsIncident700Popup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotPropertyContentsIncident700Popup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ClaimSnapshotPropertyContentsIncident700Popup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (Claim :  Claim, IncidentParam :  dynamic.Dynamic) : pcf.api.Destination {
    return __newDestination(config(), {Claim, IncidentParam}, 0)
  }
  
  static function push (Claim :  Claim, IncidentParam :  dynamic.Dynamic) : pcf.api.Location {
    return __newDestination(config(), {Claim, IncidentParam}, 0).push()
  }
  
  
}