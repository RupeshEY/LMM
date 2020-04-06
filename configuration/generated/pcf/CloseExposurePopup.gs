package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/CloseExposurePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class CloseExposurePopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.CloseExposurePopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (exposure :  Exposure) : pcf.api.Destination {
    return __newDestination(config(), {exposure}, 0)
  }
  
  static function push (exposure :  Exposure) : pcf.api.Location {
    return __newDestination(config(), {exposure}, 0).push()
  }
  
  
}