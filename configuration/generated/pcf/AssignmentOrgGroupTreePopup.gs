package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/assignment/AssignmentOrgGroupTreePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AssignmentOrgGroupTreePopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.AssignmentOrgGroupTreePopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination () : pcf.api.Destination {
    return __newDestination(config(), {}, 0)
  }
  
  static function createDestination (OrganizationSelection :  OrganizationSelection) : pcf.api.Destination {
    return __newDestination(config(), {OrganizationSelection}, 1)
  }
  
  static function createDestination (OrganizationSelection :  OrganizationSelection, RestrictedGroup :  Group) : pcf.api.Destination {
    return __newDestination(config(), {OrganizationSelection, RestrictedGroup}, 2)
  }
  
  function pickValueAndCommit (value :  Group) : void {
    __widgetOf(this, pcf.AssignmentOrgGroupTreePopup, LOCATION_WIDGET_CLASS).setPickedValueAndCommitChanges(value)
  }
  
  static function push () : pcf.api.Location {
    return __newDestination(config(), {}, 0).push()
  }
  
  static function push (OrganizationSelection :  OrganizationSelection) : pcf.api.Location {
    return __newDestination(config(), {OrganizationSelection}, 1).push()
  }
  
  static function push (OrganizationSelection :  OrganizationSelection, RestrictedGroup :  Group) : pcf.api.Location {
    return __newDestination(config(), {OrganizationSelection, RestrictedGroup}, 2).push()
  }
  
  
}