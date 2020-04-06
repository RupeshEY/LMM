package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/BatchProcessDownloadConfigure.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class BatchProcessDownloadConfigure extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.BatchProcessDownloadConfigure, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (batchProcessType :  BatchProcessType) : pcf.api.Destination {
    return __newDestination(config(), {batchProcessType}, 0)
  }
  
  static function drilldown (batchProcessType :  BatchProcessType) : pcf.api.Location {
    return __newDestination(config(), {batchProcessType}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (batchProcessType :  BatchProcessType) : pcf.api.Location {
    return __newDestination(config(), {batchProcessType}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (batchProcessType :  BatchProcessType) : pcf.api.Location {
    return __newDestination(config(), {batchProcessType}, 0).goInMain()
  }
  
  static function printPage (batchProcessType :  BatchProcessType) : pcf.api.Location {
    return __newDestination(config(), {batchProcessType}, 0).printPage()
  }
  
  static function push (batchProcessType :  BatchProcessType) : pcf.api.Location {
    return __newDestination(config(), {batchProcessType}, 0).push()
  }
  
  
}