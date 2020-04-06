package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimWizard_StatCodeDetailPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimWizard_StatCodeDetailPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.NewClaimWizard_StatCodeDetailPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (Policy :  Policy, StatCode :  StatCode) : pcf.api.Destination {
    return __newDestination(config(), {Policy, StatCode}, 0)
  }
  
  static function push (Policy :  Policy, StatCode :  StatCode) : pcf.api.Location {
    return __newDestination(config(), {Policy, StatCode}, 0).push()
  }
  
  
}