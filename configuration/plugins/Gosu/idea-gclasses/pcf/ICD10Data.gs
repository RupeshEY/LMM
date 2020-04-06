package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/exitpoints/ICD10Data.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ICD10Data extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ICD10Data, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (ICDCode :  String) : pcf.api.Destination {
    return __newDestination(config(), {ICDCode}, 0)
  }
  
  static function drilldown (ICDCode :  String) : pcf.api.Location {
    return __newDestination(config(), {ICDCode}, 0).drilldown()
  }
  
  static function printPage (ICDCode :  String) : pcf.api.Location {
    return __newDestination(config(), {ICDCode}, 0).printPage()
  }
  
  static function push (ICDCode :  String) : pcf.api.Location {
    return __newDestination(config(), {ICDCode}, 0).push()
  }
  
  
}