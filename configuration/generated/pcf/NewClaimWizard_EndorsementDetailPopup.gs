package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimWizard_EndorsementDetailPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimWizard_EndorsementDetailPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.NewClaimWizard_EndorsementDetailPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (Policy :  Policy, Endorsement :  Endorsement) : pcf.api.Destination {
    return __newDestination(config(), {Policy, Endorsement}, 0)
  }
  
  function pickValueAndCommit (value :  Endorsement) : void {
    __widgetOf(this, pcf.NewClaimWizard_EndorsementDetailPopup, LOCATION_WIDGET_CLASS).setPickedValueAndCommitChanges(value)
  }
  
  static function push (Policy :  Policy, Endorsement :  Endorsement) : pcf.api.Location {
    return __newDestination(config(), {Policy, Endorsement}, 0).push()
  }
  
  
}