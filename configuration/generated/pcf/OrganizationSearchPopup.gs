package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/organizationsearch/OrganizationSearchPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class OrganizationSearchPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.OrganizationSearchPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination () : pcf.api.Destination {
    return __newDestination(config(), {}, 0)
  }
  
  static function createDestination (IncludesCarrier :  Boolean) : pcf.api.Destination {
    return __newDestination(config(), {IncludesCarrier}, 1)
  }
  
  function pickValueAndCommit (value :  Organization) : void {
    __widgetOf(this, pcf.OrganizationSearchPopup, LOCATION_WIDGET_CLASS).setPickedValueAndCommitChanges(value)
  }
  
  static function push () : pcf.api.Location {
    return __newDestination(config(), {}, 0).push()
  }
  
  static function push (IncludesCarrier :  Boolean) : pcf.api.Location {
    return __newDestination(config(), {IncludesCarrier}, 1).push()
  }
  
  
}