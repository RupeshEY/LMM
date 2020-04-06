package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/ReopenClaimPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ReopenClaimPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ReopenClaimPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (Claim :  Claim) : pcf.api.Destination {
    return __newDestination(config(), {Claim}, 0)
  }
  
  static function push (Claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {Claim}, 0).push()
  }
  
  
}