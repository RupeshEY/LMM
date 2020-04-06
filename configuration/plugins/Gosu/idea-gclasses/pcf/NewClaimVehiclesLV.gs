package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimVehiclesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimVehiclesLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($PolicyVehicleList :  VehicleRU[], $Policy :  Policy) : void {
    __widgetOf(this, pcf.NewClaimVehiclesLV, SECTION_WIDGET_CLASS).setVariables(false, {$PolicyVehicleList, $Policy})
  }
  
  function refreshVariables ($PolicyVehicleList :  VehicleRU[], $Policy :  Policy) : void {
    __widgetOf(this, pcf.NewClaimVehiclesLV, SECTION_WIDGET_CLASS).setVariables(true, {$PolicyVehicleList, $Policy})
  }
  
  
}