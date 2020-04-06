package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimWizard_ExposurePagePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimWizard_ExposurePagePopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.NewClaimWizard_ExposurePagePopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (Claim :  Claim, Exposure :  Exposure, Wizard :  gw.api.claim.NewClaimWizardInfo) : pcf.api.Destination {
    return __newDestination(config(), {Claim, Exposure, Wizard}, 0)
  }
  
  static function push (Claim :  Claim, Exposure :  Exposure, Wizard :  gw.api.claim.NewClaimWizardInfo) : pcf.api.Location {
    return __newDestination(config(), {Claim, Exposure, Wizard}, 0).push()
  }
  
  
}