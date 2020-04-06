package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_NewNoteWorksheet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class FNOLWizard_NewNoteWorksheet extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.FNOLWizard_NewNoteWorksheet, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (Wizard :  gw.api.claim.NewClaimWizardInfo) : pcf.api.Destination {
    return __newDestination(config(), {Wizard}, 0)
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInWorkspace (Wizard :  gw.api.claim.NewClaimWizardInfo) : pcf.api.Location {
    return __newDestination(config(), {Wizard}, 0).goInWorkspace()
  }
  
  static function push (Wizard :  gw.api.claim.NewClaimWizardInfo) : pcf.api.Location {
    return __newDestination(config(), {Wizard}, 0).push()
  }
  
  
}