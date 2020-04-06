package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/AddressBookPickerPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookPickerPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.AddressBookPickerPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (requiredContactType :  Type) : pcf.api.Destination {
    return __newDestination(config(), {requiredContactType}, 0)
  }
  
  static function createDestination (requiredContactType :  Type, claim :  Claim) : pcf.api.Destination {
    return __newDestination(config(), {requiredContactType, claim}, 1)
  }
  
  static function createDestination (requiredContactType :  Type, claim :  Claim, specialistServices :  java.util.List<SpecialistService>) : pcf.api.Destination {
    return __newDestination(config(), {requiredContactType, claim, specialistServices}, 3)
  }
  
  static function createDestination (requiredContactType :  Type, externalSearchEnabled :  boolean, claim :  Claim) : pcf.api.Destination {
    return __newDestination(config(), {requiredContactType, externalSearchEnabled, claim}, 2)
  }
  
  function pickValueAndCommit (value :  Contact) : void {
    __widgetOf(this, pcf.AddressBookPickerPopup, LOCATION_WIDGET_CLASS).setPickedValueAndCommitChanges(value)
  }
  
  static function push (requiredContactType :  Type) : pcf.api.Location {
    return __newDestination(config(), {requiredContactType}, 0).push()
  }
  
  static function push (requiredContactType :  Type, claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {requiredContactType, claim}, 1).push()
  }
  
  static function push (requiredContactType :  Type, claim :  Claim, specialistServices :  java.util.List<SpecialistService>) : pcf.api.Location {
    return __newDestination(config(), {requiredContactType, claim, specialistServices}, 3).push()
  }
  
  static function push (requiredContactType :  Type, externalSearchEnabled :  boolean, claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {requiredContactType, externalSearchEnabled, claim}, 2).push()
  }
  
  
}