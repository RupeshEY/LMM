package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/ReopenExposurePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ReopenExposurePopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ReopenExposurePopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (exposureToReopen :  Exposure) : pcf.api.Destination {
    return __newDestination(config(), {exposureToReopen}, 0)
  }
  
  static function push (exposureToReopen :  Exposure) : pcf.api.Location {
    return __newDestination(config(), {exposureToReopen}, 0).push()
  }
  
  
}