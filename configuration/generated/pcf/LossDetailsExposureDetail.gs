package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/LossDetailsExposureDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class LossDetailsExposureDetail extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.LossDetailsExposureDetail, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (Exposure :  Exposure) : pcf.api.Destination {
    return __newDestination(config(), {Exposure}, 0)
  }
  
  static function drilldown (Exposure :  Exposure) : pcf.api.Location {
    return __newDestination(config(), {Exposure}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (Exposure :  Exposure) : pcf.api.Location {
    return __newDestination(config(), {Exposure}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (Exposure :  Exposure) : pcf.api.Location {
    return __newDestination(config(), {Exposure}, 0).goInMain()
  }
  
  static function printPage (Exposure :  Exposure) : pcf.api.Location {
    return __newDestination(config(), {Exposure}, 0).printPage()
  }
  
  static function push (Exposure :  Exposure) : pcf.api.Location {
    return __newDestination(config(), {Exposure}, 0).push()
  }
  
  
}