package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/newcontact/NewContactPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewContactPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.NewContactPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (contactSubtype :  typekey.Contact, parentContact :  Contact, claim :  Claim) : pcf.api.Destination {
    return __newDestination(config(), {contactSubtype, parentContact, claim}, 0)
  }
  
  function pickValueAndCommit (value :  Contact) : void {
    __widgetOf(this, pcf.NewContactPopup, LOCATION_WIDGET_CLASS).setPickedValueAndCommitChanges(value)
  }
  
  static function push (contactSubtype :  typekey.Contact, parentContact :  Contact, claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {contactSubtype, parentContact, claim}, 0).push()
  }
  
  
}