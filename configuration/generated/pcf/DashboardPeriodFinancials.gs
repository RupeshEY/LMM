package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/dashboard/DashboardPeriodFinancials.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class DashboardPeriodFinancials extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.DashboardPeriodFinancials, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (GroupInfo :  gw.api.dashboard.DashboardTreeGroupInfo) : pcf.api.Destination {
    return __newDestination(config(), {GroupInfo}, 0)
  }
  
  static function drilldown (GroupInfo :  gw.api.dashboard.DashboardTreeGroupInfo) : pcf.api.Location {
    return __newDestination(config(), {GroupInfo}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (GroupInfo :  gw.api.dashboard.DashboardTreeGroupInfo) : pcf.api.Location {
    return __newDestination(config(), {GroupInfo}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (GroupInfo :  gw.api.dashboard.DashboardTreeGroupInfo) : pcf.api.Location {
    return __newDestination(config(), {GroupInfo}, 0).goInMain()
  }
  
  static function printPage (GroupInfo :  gw.api.dashboard.DashboardTreeGroupInfo) : pcf.api.Location {
    return __newDestination(config(), {GroupInfo}, 0).printPage()
  }
  
  static function push (GroupInfo :  gw.api.dashboard.DashboardTreeGroupInfo) : pcf.api.Location {
    return __newDestination(config(), {GroupInfo}, 0).push()
  }
  
  
}