package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/metro/NewMetroReportDetailsPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewMetroReportDetailsPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.NewMetroReportDetailsPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (claim :  Claim) : pcf.api.Destination {
    return __newDestination(config(), {claim}, 0)
  }
  
  function pickValueAndCommit (value :  entity.MetroReport) : void {
    __widgetOf(this, pcf.NewMetroReportDetailsPopup, LOCATION_WIDGET_CLASS).setPickedValueAndCommitChanges(value)
  }
  
  static function push (claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {claim}, 0).push()
  }
  
  
}