package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/AddressBookDirectionsPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookDirectionsPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.AddressBookDirectionsPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (directions :  gw.api.contact.DrivingDirections) : pcf.api.Destination {
    return __newDestination(config(), {directions}, 0)
  }
  
  static function push (directions :  gw.api.contact.DrivingDirections) : pcf.api.Location {
    return __newDestination(config(), {directions}, 0).push()
  }
  
  
}