package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/AddressBookMatchWorksheet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookMatchWorksheet extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.AddressBookMatchWorksheet, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (addressBookMatch :  gw.api.contact.AddressBookMatch) : pcf.api.Destination {
    return __newDestination(config(), {addressBookMatch}, 0)
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInWorkspace (addressBookMatch :  gw.api.contact.AddressBookMatch) : pcf.api.Location {
    return __newDestination(config(), {addressBookMatch}, 0).goInWorkspace()
  }
  
  static function push (addressBookMatch :  gw.api.contact.AddressBookMatch) : pcf.api.Location {
    return __newDestination(config(), {addressBookMatch}, 0).push()
  }
  
  
}