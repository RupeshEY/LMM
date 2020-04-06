package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/PolicyVehicleDetailPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class PolicyVehicleDetailPanelSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($VehicleRU :  VehicleRU) : void {
    __widgetOf(this, pcf.PolicyVehicleDetailPanelSet, SECTION_WIDGET_CLASS).setVariables(false, {$VehicleRU})
  }
  
  function refreshVariables ($VehicleRU :  VehicleRU) : void {
    __widgetOf(this, pcf.PolicyVehicleDetailPanelSet, SECTION_WIDGET_CLASS).setVariables(true, {$VehicleRU})
  }
  
  
}