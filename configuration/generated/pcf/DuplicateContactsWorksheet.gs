package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/workspace/DuplicateContactsWorksheet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class DuplicateContactsWorksheet extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.DuplicateContactsWorksheet, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (contact :  Contact, externalContactSource :  gw.api.contact.ExternalContactSource) : pcf.api.Destination {
    return __newDestination(config(), {contact, externalContactSource}, 0)
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInWorkspace (contact :  Contact, externalContactSource :  gw.api.contact.ExternalContactSource) : pcf.api.Location {
    return __newDestination(config(), {contact, externalContactSource}, 0).goInWorkspace()
  }
  
  static function push (contact :  Contact, externalContactSource :  gw.api.contact.ExternalContactSource) : pcf.api.Location {
    return __newDestination(config(), {contact, externalContactSource}, 0).push()
  }
  
  
}