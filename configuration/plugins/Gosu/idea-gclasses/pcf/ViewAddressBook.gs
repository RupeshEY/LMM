package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/ViewAddressBook.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ViewAddressBook extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ViewAddressBook, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (linkedContact :  Contact) : pcf.api.Destination {
    return __newDestination(config(), {linkedContact}, 0)
  }
  
  static function createDestination (linkedContact :  Contact, allowEditInAddressBook :  boolean) : pcf.api.Destination {
    return __newDestination(config(), {linkedContact, allowEditInAddressBook}, 1)
  }
  
  static function drilldown (linkedContact :  Contact) : pcf.api.Location {
    return __newDestination(config(), {linkedContact}, 0).drilldown()
  }
  
  static function drilldown (linkedContact :  Contact, allowEditInAddressBook :  boolean) : pcf.api.Location {
    return __newDestination(config(), {linkedContact, allowEditInAddressBook}, 1).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (linkedContact :  Contact) : pcf.api.Location {
    return __newDestination(config(), {linkedContact}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (linkedContact :  Contact, allowEditInAddressBook :  boolean) : pcf.api.Location {
    return __newDestination(config(), {linkedContact, allowEditInAddressBook}, 1).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (linkedContact :  Contact) : pcf.api.Location {
    return __newDestination(config(), {linkedContact}, 0).goInMain()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (linkedContact :  Contact, allowEditInAddressBook :  boolean) : pcf.api.Location {
    return __newDestination(config(), {linkedContact, allowEditInAddressBook}, 1).goInMain()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInWorkspace (linkedContact :  Contact) : pcf.api.Location {
    return __newDestination(config(), {linkedContact}, 0).goInWorkspace()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInWorkspace (linkedContact :  Contact, allowEditInAddressBook :  boolean) : pcf.api.Location {
    return __newDestination(config(), {linkedContact, allowEditInAddressBook}, 1).goInWorkspace()
  }
  
  static function printPage (linkedContact :  Contact) : pcf.api.Location {
    return __newDestination(config(), {linkedContact}, 0).printPage()
  }
  
  static function printPage (linkedContact :  Contact, allowEditInAddressBook :  boolean) : pcf.api.Location {
    return __newDestination(config(), {linkedContact, allowEditInAddressBook}, 1).printPage()
  }
  
  static function push (linkedContact :  Contact) : pcf.api.Location {
    return __newDestination(config(), {linkedContact}, 0).push()
  }
  
  static function push (linkedContact :  Contact, allowEditInAddressBook :  boolean) : pcf.api.Location {
    return __newDestination(config(), {linkedContact, allowEditInAddressBook}, 1).push()
  }
  
  
}