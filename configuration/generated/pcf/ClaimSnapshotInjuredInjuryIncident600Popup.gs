package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotInjuredInjuryIncident600Popup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotInjuredInjuryIncident600Popup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ClaimSnapshotInjuredInjuryIncident600Popup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (Claim :  Claim, Incident :  dynamic.Dynamic) : pcf.api.Destination {
    return __newDestination(config(), {Claim, Incident}, 0)
  }
  
  static function push (Claim :  Claim, Incident :  dynamic.Dynamic) : pcf.api.Location {
    return __newDestination(config(), {Claim, Incident}, 0).push()
  }
  
  
}