package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/securityzones/SecurityZoneDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class SecurityZoneDetail extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.SecurityZoneDetail, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (securityZone :  SecurityZone) : pcf.api.Destination {
    return __newDestination(config(), {securityZone}, 0)
  }
  
  static function drilldown (securityZone :  SecurityZone) : pcf.api.Location {
    return __newDestination(config(), {securityZone}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (securityZone :  SecurityZone) : pcf.api.Location {
    return __newDestination(config(), {securityZone}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (securityZone :  SecurityZone) : pcf.api.Location {
    return __newDestination(config(), {securityZone}, 0).goInMain()
  }
  
  static function printPage (securityZone :  SecurityZone) : pcf.api.Location {
    return __newDestination(config(), {securityZone}, 0).printPage()
  }
  
  static function push (securityZone :  SecurityZone) : pcf.api.Location {
    return __newDestination(config(), {securityZone}, 0).push()
  }
  
  
}