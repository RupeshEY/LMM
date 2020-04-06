package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/ClaimSyncStatusPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSyncStatusPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ClaimSyncStatusPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (Claim :  Claim) : pcf.api.Destination {
    return __newDestination(config(), {Claim}, 0)
  }
  
  static function push (Claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {Claim}, 0).push()
  }
  
  
}