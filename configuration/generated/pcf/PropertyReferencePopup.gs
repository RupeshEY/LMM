package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/PropertyReferencePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class PropertyReferencePopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.PropertyReferencePopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (fragment :  gw.bizrules.pcf.PropertyReferenceExpressionFragmentHolder) : pcf.api.Destination {
    return __newDestination(config(), {fragment}, 0)
  }
  
  static function push (fragment :  gw.bizrules.pcf.PropertyReferenceExpressionFragmentHolder) : pcf.api.Location {
    return __newDestination(config(), {fragment}, 0).push()
  }
  
  
}