package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newexposure/NewExposure.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewExposure extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.NewExposure, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (Claim :  Claim, CoverageType :  CoverageType, CoverageSubtype :  CoverageSubtype, Coverage :  Coverage) : pcf.api.Destination {
    return __newDestination(config(), {Claim, CoverageType, CoverageSubtype, Coverage}, 0)
  }
  
  static function drilldown (Claim :  Claim, CoverageType :  CoverageType, CoverageSubtype :  CoverageSubtype, Coverage :  Coverage) : pcf.api.Location {
    return __newDestination(config(), {Claim, CoverageType, CoverageSubtype, Coverage}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (Claim :  Claim, CoverageType :  CoverageType, CoverageSubtype :  CoverageSubtype, Coverage :  Coverage) : pcf.api.Location {
    return __newDestination(config(), {Claim, CoverageType, CoverageSubtype, Coverage}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (Claim :  Claim, CoverageType :  CoverageType, CoverageSubtype :  CoverageSubtype, Coverage :  Coverage) : pcf.api.Location {
    return __newDestination(config(), {Claim, CoverageType, CoverageSubtype, Coverage}, 0).goInMain()
  }
  
  static function printPage (Claim :  Claim, CoverageType :  CoverageType, CoverageSubtype :  CoverageSubtype, Coverage :  Coverage) : pcf.api.Location {
    return __newDestination(config(), {Claim, CoverageType, CoverageSubtype, Coverage}, 0).printPage()
  }
  
  static function push (Claim :  Claim, CoverageType :  CoverageType, CoverageSubtype :  CoverageSubtype, Coverage :  Coverage) : pcf.api.Location {
    return __newDestination(config(), {Claim, CoverageType, CoverageSubtype, Coverage}, 0).push()
  }
  
  
}