package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/PolicyTripCoverageLDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class PolicyTripCoverageLDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($aTripRU :  TripRU) : void {
    __widgetOf(this, pcf.PolicyTripCoverageLDV, SECTION_WIDGET_CLASS).setVariables(false, {$aTripRU})
  }
  
  function refreshVariables ($aTripRU :  TripRU) : void {
    __widgetOf(this, pcf.PolicyTripCoverageLDV, SECTION_WIDGET_CLASS).setVariables(true, {$aTripRU})
  }
  
  
}