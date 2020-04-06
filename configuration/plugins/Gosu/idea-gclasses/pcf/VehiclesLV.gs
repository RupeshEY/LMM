package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/VehiclesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class VehiclesLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($PolicyVehicleList :  VehicleRU[], $Claim :  Claim) : void {
    __widgetOf(this, pcf.VehiclesLV, SECTION_WIDGET_CLASS).setVariables(false, {$PolicyVehicleList, $Claim})
  }
  
  function refreshVariables ($PolicyVehicleList :  VehicleRU[], $Claim :  Claim) : void {
    __widgetOf(this, pcf.VehiclesLV, SECTION_WIDGET_CLASS).setVariables(true, {$PolicyVehicleList, $Claim})
  }
  
  
}