package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/partiesinvolved/AddExistingPartyInvolvedPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AddExistingPartyInvolvedPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.AddExistingPartyInvolvedPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (claim :  Claim, tempContact :  gw.api.contact.TemporaryContact) : pcf.api.Destination {
    return __newDestination(config(), {claim, tempContact}, 0)
  }
  
  function pickValueAndCommit (value :  Contact) : void {
    __widgetOf(this, pcf.AddExistingPartyInvolvedPopup, LOCATION_WIDGET_CLASS).setPickedValueAndCommitChanges(value)
  }
  
  static function push (claim :  Claim, tempContact :  gw.api.contact.TemporaryContact) : pcf.api.Location {
    return __newDestination(config(), {claim, tempContact}, 0).push()
  }
  
  
}