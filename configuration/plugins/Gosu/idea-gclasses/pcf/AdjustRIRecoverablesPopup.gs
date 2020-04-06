package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/reinsurance/AdjustRIRecoverablesPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AdjustRIRecoverablesPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.AdjustRIRecoverablesPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (Agreement :  RIAgreement, Claim :  Claim) : pcf.api.Destination {
    return __newDestination(config(), {Agreement, Claim}, 0)
  }
  
  static function push (Agreement :  RIAgreement, Claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {Agreement, Claim}, 0).push()
  }
  
  
}