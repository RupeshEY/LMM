package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/partiesinvolved/NewPartyInvolvedPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewPartyInvolvedPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.NewPartyInvolvedPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (claim :  Claim, contactSubtype :  typekey.Contact) : pcf.api.Destination {
    return __newDestination(config(), {claim, contactSubtype}, 0)
  }
  
  function pickValueAndCommit (value :  Contact) : void {
    __widgetOf(this, pcf.NewPartyInvolvedPopup, LOCATION_WIDGET_CLASS).setPickedValueAndCommitChanges(value)
  }
  
  static function push (claim :  Claim, contactSubtype :  typekey.Contact) : pcf.api.Location {
    return __newDestination(config(), {claim, contactSubtype}, 0).push()
  }
  
  
}