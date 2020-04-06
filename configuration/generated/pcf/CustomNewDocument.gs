package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/exitpoints/CustomNewDocument.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class CustomNewDocument extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.CustomNewDocument, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination () : pcf.api.Destination {
    return __newDestination(config(), {}, 0)
  }
  
  static function createDestination (ClaimID :  String, Option :  java.lang.Double) : pcf.api.Destination {
    return __newDestination(config(), {ClaimID, Option}, 1)
  }
  
  static function drilldown () : pcf.api.Location {
    return __newDestination(config(), {}, 0).drilldown()
  }
  
  static function drilldown (ClaimID :  String, Option :  java.lang.Double) : pcf.api.Location {
    return __newDestination(config(), {ClaimID, Option}, 1).drilldown()
  }
  
  static function printPage () : pcf.api.Location {
    return __newDestination(config(), {}, 0).printPage()
  }
  
  static function printPage (ClaimID :  String, Option :  java.lang.Double) : pcf.api.Location {
    return __newDestination(config(), {ClaimID, Option}, 1).printPage()
  }
  
  static function push () : pcf.api.Location {
    return __newDestination(config(), {}, 0).push()
  }
  
  static function push (ClaimID :  String, Option :  java.lang.Double) : pcf.api.Location {
    return __newDestination(config(), {ClaimID, Option}, 1).push()
  }
  
  
}