package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/AddressBookContactDetailPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookContactDetailPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.AddressBookContactDetailPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (externalContact :  gw.api.contact.ExternalContact) : pcf.api.Destination {
    return __newDestination(config(), {externalContact}, 0)
  }
  
  static function createDestination (externalContact :  gw.api.contact.ExternalContact, allowEdit :  boolean) : pcf.api.Destination {
    return __newDestination(config(), {externalContact, allowEdit}, 1)
  }
  
  function pickValueAndCommit (value :  Contact) : void {
    __widgetOf(this, pcf.AddressBookContactDetailPopup, LOCATION_WIDGET_CLASS).setPickedValueAndCommitChanges(value)
  }
  
  static function push (externalContact :  gw.api.contact.ExternalContact) : pcf.api.Location {
    return __newDestination(config(), {externalContact}, 0).push()
  }
  
  static function push (externalContact :  gw.api.contact.ExternalContact, allowEdit :  boolean) : pcf.api.Location {
    return __newDestination(config(), {externalContact, allowEdit}, 1).push()
  }
  
  
}