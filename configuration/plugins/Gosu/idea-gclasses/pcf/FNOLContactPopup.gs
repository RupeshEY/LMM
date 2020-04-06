package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLContactPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class FNOLContactPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.FNOLContactPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (claim :  Claim, claimContact :  ClaimContact, role :  ContactRole, vehicleIncident :  VehicleIncident, Wizard :  gw.api.claim.NewClaimWizardInfo) : pcf.api.Destination {
    return __newDestination(config(), {claim, claimContact, role, vehicleIncident, Wizard}, 0)
  }
  
  function pickValueAndCommit (value :  ClaimContact) : void {
    __widgetOf(this, pcf.FNOLContactPopup, LOCATION_WIDGET_CLASS).setPickedValueAndCommitChanges(value)
  }
  
  static function push (claim :  Claim, claimContact :  ClaimContact, role :  ContactRole, vehicleIncident :  VehicleIncident, Wizard :  gw.api.claim.NewClaimWizardInfo) : pcf.api.Location {
    return __newDestination(config(), {claim, claimContact, role, vehicleIncident, Wizard}, 0).push()
  }
  
  
}