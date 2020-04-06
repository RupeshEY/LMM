package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/AddressBookContactDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookContactDetail extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.AddressBookContactDetail, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (externalContact :  gw.api.contact.ExternalContact) : pcf.api.Destination {
    return __newDestination(config(), {externalContact}, 0)
  }
  
  static function drilldown (externalContact :  gw.api.contact.ExternalContact) : pcf.api.Location {
    return __newDestination(config(), {externalContact}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (externalContact :  gw.api.contact.ExternalContact) : pcf.api.Location {
    return __newDestination(config(), {externalContact}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (externalContact :  gw.api.contact.ExternalContact) : pcf.api.Location {
    return __newDestination(config(), {externalContact}, 0).goInMain()
  }
  
  static function printPage (externalContact :  gw.api.contact.ExternalContact) : pcf.api.Location {
    return __newDestination(config(), {externalContact}, 0).printPage()
  }
  
  static function push (externalContact :  gw.api.contact.ExternalContact) : pcf.api.Location {
    return __newDestination(config(), {externalContact}, 0).push()
  }
  
  
}