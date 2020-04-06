package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/archive/ArchiveClaimRetrievePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ArchiveClaimRetrievePopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ArchiveClaimRetrievePopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (restoreSet :  gw.api.claim.ClaimArchiveRestoreSet) : pcf.api.Destination {
    return __newDestination(config(), {restoreSet}, 0)
  }
  
  static function push (restoreSet :  gw.api.claim.ClaimArchiveRestoreSet) : pcf.api.Location {
    return __newDestination(config(), {restoreSet}, 0).push()
  }
  
  
}