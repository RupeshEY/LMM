package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/TripRUPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class TripRUPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.TripRUPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (aClaim :  Claim) : pcf.api.Destination {
    return __newDestination(config(), {aClaim}, 0)
  }
  
  static function createDestination (aClaim :  Claim, aTripRUParam :  TripRU, startEditable :  Boolean) : pcf.api.Destination {
    return __newDestination(config(), {aClaim, aTripRUParam, startEditable}, 1)
  }
  
  function pickValueAndCommit (value :  TripRU) : void {
    __widgetOf(this, pcf.TripRUPopup, LOCATION_WIDGET_CLASS).setPickedValueAndCommitChanges(value)
  }
  
  static function push (aClaim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {aClaim}, 0).push()
  }
  
  static function push (aClaim :  Claim, aTripRUParam :  TripRU, startEditable :  Boolean) : pcf.api.Location {
    return __newDestination(config(), {aClaim, aTripRUParam, startEditable}, 1).push()
  }
  
  
}