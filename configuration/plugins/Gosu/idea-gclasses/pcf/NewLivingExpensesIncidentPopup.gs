package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/incidents/NewLivingExpensesIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewLivingExpensesIncidentPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.NewLivingExpensesIncidentPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (claim :  Claim) : pcf.api.Destination {
    return __newDestination(config(), {claim}, 0)
  }
  
  function pickValueAndCommit (value :  LivingExpensesIncident) : void {
    __widgetOf(this, pcf.NewLivingExpensesIncidentPopup, LOCATION_WIDGET_CLASS).setPickedValueAndCommitChanges(value)
  }
  
  static function push (claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {claim}, 0).push()
  }
  
  
}