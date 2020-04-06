package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/contacts/ContactDocumentDetailsPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ContactDocumentDetailsPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ContactDocumentDetailsPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (documentInfo :  ContactDocumentInfo) : pcf.api.Destination {
    return __newDestination(config(), {documentInfo}, 0)
  }
  
  static function push (documentInfo :  ContactDocumentInfo) : pcf.api.Location {
    return __newDestination(config(), {documentInfo}, 0).push()
  }
  
  
}