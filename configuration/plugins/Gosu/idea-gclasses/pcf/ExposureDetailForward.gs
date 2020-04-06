package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/ExposureDetailForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ExposureDetailForward extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ExposureDetailForward, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (Claim :  Claim, Exposure :  Exposure) : pcf.api.Destination {
    return __newDestination(config(), {Claim, Exposure}, 0)
  }
  
  static function drilldown (Claim :  Claim, Exposure :  Exposure) : pcf.api.Location {
    return __newDestination(config(), {Claim, Exposure}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (Claim :  Claim, Exposure :  Exposure) : pcf.api.Location {
    return __newDestination(config(), {Claim, Exposure}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (Claim :  Claim, Exposure :  Exposure) : pcf.api.Location {
    return __newDestination(config(), {Claim, Exposure}, 0).goInMain()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInWorkspace (Claim :  Claim, Exposure :  Exposure) : pcf.api.Location {
    return __newDestination(config(), {Claim, Exposure}, 0).goInWorkspace()
  }
  
  static function printPage (Claim :  Claim, Exposure :  Exposure) : pcf.api.Location {
    return __newDestination(config(), {Claim, Exposure}, 0).printPage()
  }
  
  static function push (Claim :  Claim, Exposure :  Exposure) : pcf.api.Location {
    return __newDestination(config(), {Claim, Exposure}, 0).push()
  }
  
  
}