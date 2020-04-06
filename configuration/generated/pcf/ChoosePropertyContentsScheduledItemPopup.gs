package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/incidents/ChoosePropertyContentsScheduledItemPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ChoosePropertyContentsScheduledItemPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ChoosePropertyContentsScheduledItemPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (incident :  PropertyContentsIncident, policyLocation :  PolicyLocation) : pcf.api.Destination {
    return __newDestination(config(), {incident, policyLocation}, 0)
  }
  
  function pickValueAndCommit (value :  PropertyContentsScheduledItem[]) : void {
    __widgetOf(this, pcf.ChoosePropertyContentsScheduledItemPopup, LOCATION_WIDGET_CLASS).setPickedValueAndCommitChanges(value)
  }
  
  static function push (incident :  PropertyContentsIncident, policyLocation :  PolicyLocation) : pcf.api.Location {
    return __newDestination(config(), {incident, policyLocation}, 0).push()
  }
  
  
}