package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyLocation700Popup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotPolicyLocation700Popup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ClaimSnapshotPolicyLocation700Popup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (Claim :  Claim, PolicyLocation :  dynamic.Dynamic) : pcf.api.Destination {
    return __newDestination(config(), {Claim, PolicyLocation}, 0)
  }
  
  static function push (Claim :  Claim, PolicyLocation :  dynamic.Dynamic) : pcf.api.Location {
    return __newDestination(config(), {Claim, PolicyLocation}, 0).push()
  }
  
  
}