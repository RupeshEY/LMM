package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimWizard_NewExposurePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimWizard_NewExposurePopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.NewClaimWizard_NewExposurePopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (Claim :  Claim, Wizard :  gw.api.claim.NewClaimWizardInfo, Coverage :  Coverage, CoverageType :  CoverageType, CoverageSubtype :  CoverageSubtype) : pcf.api.Destination {
    return __newDestination(config(), {Claim, Wizard, Coverage, CoverageType, CoverageSubtype}, 0)
  }
  
  static function push (Claim :  Claim, Wizard :  gw.api.claim.NewClaimWizardInfo, Coverage :  Coverage, CoverageType :  CoverageType, CoverageSubtype :  CoverageSubtype) : pcf.api.Location {
    return __newDestination(config(), {Claim, Wizard, Coverage, CoverageType, CoverageSubtype}, 0).push()
  }
  
  
}