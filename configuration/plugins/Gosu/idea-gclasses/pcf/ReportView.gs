package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/ReportView.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ReportView extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ReportView, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (name :  String, subPath :  String) : pcf.api.Destination {
    return __newDestination(config(), {name, subPath}, 0)
  }
  
  static function drilldown (name :  String, subPath :  String) : pcf.api.Location {
    return __newDestination(config(), {name, subPath}, 0).drilldown()
  }
  
  static function printPage (name :  String, subPath :  String) : pcf.api.Location {
    return __newDestination(config(), {name, subPath}, 0).printPage()
  }
  
  static function push (name :  String, subPath :  String) : pcf.api.Location {
    return __newDestination(config(), {name, subPath}, 0).push()
  }
  
  
}