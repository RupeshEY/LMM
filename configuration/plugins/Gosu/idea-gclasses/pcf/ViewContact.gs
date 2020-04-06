package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/exitpoints/ViewContact.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ViewContact extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ViewContact, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (abContactDetailURL :  String, addressBookUID :  String) : pcf.api.Destination {
    return __newDestination(config(), {abContactDetailURL, addressBookUID}, 0)
  }
  
  static function drilldown (abContactDetailURL :  String, addressBookUID :  String) : pcf.api.Location {
    return __newDestination(config(), {abContactDetailURL, addressBookUID}, 0).drilldown()
  }
  
  static function printPage (abContactDetailURL :  String, addressBookUID :  String) : pcf.api.Location {
    return __newDestination(config(), {abContactDetailURL, addressBookUID}, 0).printPage()
  }
  
  static function push (abContactDetailURL :  String, addressBookUID :  String) : pcf.api.Location {
    return __newDestination(config(), {abContactDetailURL, addressBookUID}, 0).push()
  }
  
  
}