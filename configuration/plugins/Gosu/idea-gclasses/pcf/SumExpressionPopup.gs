package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/SumExpressionPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class SumExpressionPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.SumExpressionPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (fragHolder :  gw.bizrules.pcf.SumExpressionFragmentHolder) : pcf.api.Destination {
    return __newDestination(config(), {fragHolder}, 0)
  }
  
  static function push (fragHolder :  gw.bizrules.pcf.SumExpressionFragmentHolder) : pcf.api.Location {
    return __newDestination(config(), {fragHolder}, 0).push()
  }
  
  
}