package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class LoadHistoryDetail extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.LoadHistoryDetail, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (PageHelper :  gw.api.tools.LoadHistoryHelper, History :  LoadCommand) : pcf.api.Destination {
    return __newDestination(config(), {PageHelper, History}, 0)
  }
  
  static function drilldown (PageHelper :  gw.api.tools.LoadHistoryHelper, History :  LoadCommand) : pcf.api.Location {
    return __newDestination(config(), {PageHelper, History}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (PageHelper :  gw.api.tools.LoadHistoryHelper, History :  LoadCommand) : pcf.api.Location {
    return __newDestination(config(), {PageHelper, History}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (PageHelper :  gw.api.tools.LoadHistoryHelper, History :  LoadCommand) : pcf.api.Location {
    return __newDestination(config(), {PageHelper, History}, 0).goInMain()
  }
  
  static function printPage (PageHelper :  gw.api.tools.LoadHistoryHelper, History :  LoadCommand) : pcf.api.Location {
    return __newDestination(config(), {PageHelper, History}, 0).printPage()
  }
  
  static function push (PageHelper :  gw.api.tools.LoadHistoryHelper, History :  LoadCommand) : pcf.api.Location {
    return __newDestination(config(), {PageHelper, History}, 0).push()
  }
  
  
}