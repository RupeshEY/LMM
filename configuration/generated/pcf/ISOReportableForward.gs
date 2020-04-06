package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/util/ISOReportableForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ISOReportableForward extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ISOReportableForward, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (isoReportable :  ISOReportable) : pcf.api.Destination {
    return __newDestination(config(), {isoReportable}, 0)
  }
  
  static function drilldown (isoReportable :  ISOReportable) : pcf.api.Location {
    return __newDestination(config(), {isoReportable}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (isoReportable :  ISOReportable) : pcf.api.Location {
    return __newDestination(config(), {isoReportable}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (isoReportable :  ISOReportable) : pcf.api.Location {
    return __newDestination(config(), {isoReportable}, 0).goInMain()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInWorkspace (isoReportable :  ISOReportable) : pcf.api.Location {
    return __newDestination(config(), {isoReportable}, 0).goInWorkspace()
  }
  
  static function printPage (isoReportable :  ISOReportable) : pcf.api.Location {
    return __newDestination(config(), {isoReportable}, 0).printPage()
  }
  
  static function push (isoReportable :  ISOReportable) : pcf.api.Location {
    return __newDestination(config(), {isoReportable}, 0).push()
  }
  
  
}