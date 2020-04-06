package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/ContainsExpressionPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ContainsExpressionPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ContainsExpressionPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (fragHolder :  gw.bizrules.pcf.ContainsExpressionFragmentHolder) : pcf.api.Destination {
    return __newDestination(config(), {fragHolder}, 0)
  }
  
  static function push (fragHolder :  gw.bizrules.pcf.ContainsExpressionFragmentHolder) : pcf.api.Location {
    return __newDestination(config(), {fragHolder}, 0).push()
  }
  
  
}