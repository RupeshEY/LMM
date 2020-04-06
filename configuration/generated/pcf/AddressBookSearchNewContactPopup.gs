package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/newcheckwizard/AddressBookSearchNewContactPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookSearchNewContactPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.AddressBookSearchNewContactPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (searchCriteria :  ContactSearchCriteria, contactSubtype :  typekey.Contact, parentContact :  Contact, claim :  Claim) : pcf.api.Destination {
    return __newDestination(config(), {searchCriteria, contactSubtype, parentContact, claim}, 0)
  }
  
  function pickValueAndCommit (value :  Contact) : void {
    __widgetOf(this, pcf.AddressBookSearchNewContactPopup, LOCATION_WIDGET_CLASS).setPickedValueAndCommitChanges(value)
  }
  
  static function push (searchCriteria :  ContactSearchCriteria, contactSubtype :  typekey.Contact, parentContact :  Contact, claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {searchCriteria, contactSubtype, parentContact, claim}, 0).push()
  }
  
  
}