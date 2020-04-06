package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/partiesinvolved/ClaimContactTransferRolesPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimContactTransferRolesPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ClaimContactTransferRolesPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (claim :  Claim, targetContact :  ClaimContact) : pcf.api.Destination {
    return __newDestination(config(), {claim, targetContact}, 0)
  }
  
  static function push (claim :  Claim, targetContact :  ClaimContact) : pcf.api.Location {
    return __newDestination(config(), {claim, targetContact}, 0).push()
  }
  
  
}