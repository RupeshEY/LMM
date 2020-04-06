package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/contacts/ClaimContactDetailPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimContactDetailPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ClaimContactDetailPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (inputContact :  Contact, claim :  Claim) : pcf.api.Destination {
    return __newDestination(config(), {inputContact, claim}, 0)
  }
  
  static function createDestination (inputContact :  Contact, claim :  Claim, startInEditMode :  boolean) : pcf.api.Destination {
    return __newDestination(config(), {inputContact, claim, startInEditMode}, 1)
  }
  
  static function createDestination (inputContact :  Contact, claim :  Claim, startInEditMode :  boolean, allowEditInAddressBook :  boolean) : pcf.api.Destination {
    return __newDestination(config(), {inputContact, claim, startInEditMode, allowEditInAddressBook}, 2)
  }
  
  static function push (inputContact :  Contact, claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {inputContact, claim}, 0).push()
  }
  
  static function push (inputContact :  Contact, claim :  Claim, startInEditMode :  boolean) : pcf.api.Location {
    return __newDestination(config(), {inputContact, claim, startInEditMode}, 1).push()
  }
  
  static function push (inputContact :  Contact, claim :  Claim, startInEditMode :  boolean, allowEditInAddressBook :  boolean) : pcf.api.Location {
    return __newDestination(config(), {inputContact, claim, startInEditMode, allowEditInAddressBook}, 2).push()
  }
  
  
}