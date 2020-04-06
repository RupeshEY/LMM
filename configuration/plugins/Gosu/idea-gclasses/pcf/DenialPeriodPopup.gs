package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/statutes/DenialPeriodPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class DenialPeriodPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.DenialPeriodPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination () : pcf.api.Destination {
    return __newDestination(config(), {}, 0)
  }
  
  static function createDestination (specificWCDenialPeriod :  WCDenialPeriod, willStartInEditMode :  boolean) : pcf.api.Destination {
    return __newDestination(config(), {specificWCDenialPeriod, willStartInEditMode}, 1)
  }
  
  function pickValueAndCommit (value :  WCDenialPeriod) : void {
    __widgetOf(this, pcf.DenialPeriodPopup, LOCATION_WIDGET_CLASS).setPickedValueAndCommitChanges(value)
  }
  
  static function push () : pcf.api.Location {
    return __newDestination(config(), {}, 0).push()
  }
  
  static function push (specificWCDenialPeriod :  WCDenialPeriod, willStartInEditMode :  boolean) : pcf.api.Location {
    return __newDestination(config(), {specificWCDenialPeriod, willStartInEditMode}, 1).push()
  }
  
  
}