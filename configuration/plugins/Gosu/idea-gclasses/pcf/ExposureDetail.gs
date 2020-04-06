package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/ExposureDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ExposureDetail extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ExposureDetail, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (exposure :  Exposure) : pcf.api.Destination {
    return __newDestination(config(), {exposure}, 0)
  }
  
  static function drilldown (exposure :  Exposure) : pcf.api.Location {
    return __newDestination(config(), {exposure}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (exposure :  Exposure) : pcf.api.Location {
    return __newDestination(config(), {exposure}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (exposure :  Exposure) : pcf.api.Location {
    return __newDestination(config(), {exposure}, 0).goInMain()
  }
  
  static function printPage (exposure :  Exposure) : pcf.api.Location {
    return __newDestination(config(), {exposure}, 0).printPage()
  }
  
  static function push (exposure :  Exposure) : pcf.api.Location {
    return __newDestination(config(), {exposure}, 0).push()
  }
  
  
}