package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerAnalysisPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ProfilerAnalysisPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ProfilerAnalysisPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination () : pcf.api.Destination {
    return __newDestination(config(), {}, 0)
  }
  
  static function push () : pcf.api.Location {
    return __newDestination(config(), {}, 0).push()
  }
  
  
}