package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/importexport/ImportResults.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ImportResults extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ImportResults, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (ImportDataInfo :  gw.api.admin.ImportDataInfo) : pcf.api.Destination {
    return __newDestination(config(), {ImportDataInfo}, 0)
  }
  
  static function drilldown (ImportDataInfo :  gw.api.admin.ImportDataInfo) : pcf.api.Location {
    return __newDestination(config(), {ImportDataInfo}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (ImportDataInfo :  gw.api.admin.ImportDataInfo) : pcf.api.Location {
    return __newDestination(config(), {ImportDataInfo}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (ImportDataInfo :  gw.api.admin.ImportDataInfo) : pcf.api.Location {
    return __newDestination(config(), {ImportDataInfo}, 0).goInMain()
  }
  
  static function printPage (ImportDataInfo :  gw.api.admin.ImportDataInfo) : pcf.api.Location {
    return __newDestination(config(), {ImportDataInfo}, 0).printPage()
  }
  
  static function push (ImportDataInfo :  gw.api.admin.ImportDataInfo) : pcf.api.Location {
    return __newDestination(config(), {ImportDataInfo}, 0).push()
  }
  
  
}