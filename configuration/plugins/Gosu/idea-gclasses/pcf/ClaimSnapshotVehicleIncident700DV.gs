package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotVehicleIncident700DV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotVehicleIncident700DV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim, $VehicleIncident :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotVehicleIncident700DV, SECTION_WIDGET_CLASS).setVariables(false, {$Claim, $VehicleIncident})
  }
  
  function refreshVariables ($Claim :  Claim, $VehicleIncident :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotVehicleIncident700DV, SECTION_WIDGET_CLASS).setVariables(true, {$Claim, $VehicleIncident})
  }
  
  
}