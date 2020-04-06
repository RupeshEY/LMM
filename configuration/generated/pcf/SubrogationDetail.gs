package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/subrogation/General/SubrogationDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class SubrogationDetail extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.SubrogationDetail, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (subrogation :  Subrogation) : pcf.api.Destination {
    return __newDestination(config(), {subrogation}, 0)
  }
  
  static function drilldown (subrogation :  Subrogation) : pcf.api.Location {
    return __newDestination(config(), {subrogation}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (subrogation :  Subrogation) : pcf.api.Location {
    return __newDestination(config(), {subrogation}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (subrogation :  Subrogation) : pcf.api.Location {
    return __newDestination(config(), {subrogation}, 0).goInMain()
  }
  
  static function printPage (subrogation :  Subrogation) : pcf.api.Location {
    return __newDestination(config(), {subrogation}, 0).printPage()
  }
  
  static function push (subrogation :  Subrogation) : pcf.api.Location {
    return __newDestination(config(), {subrogation}, 0).push()
  }
  
  
}