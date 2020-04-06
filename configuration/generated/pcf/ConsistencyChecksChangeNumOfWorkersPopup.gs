package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/ConsistencyChecksChangeNumOfWorkersPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ConsistencyChecksChangeNumOfWorkersPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ConsistencyChecksChangeNumOfWorkersPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (CCPageHelper :  gw.api.tools.ConsistencyChecksRunsPageHelper) : pcf.api.Destination {
    return __newDestination(config(), {CCPageHelper}, 0)
  }
  
  static function push (CCPageHelper :  gw.api.tools.ConsistencyChecksRunsPageHelper) : pcf.api.Location {
    return __newDestination(config(), {CCPageHelper}, 0).push()
  }
  
  
}