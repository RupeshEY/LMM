package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/default/ClaimSnapshotVehicleIncidentDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotVehicleIncidentDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim, $VehicleIncident :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotVehicleIncidentDV, SECTION_WIDGET_CLASS).setVariables(false, {$Claim, $VehicleIncident})
  }
  
  function refreshVariables ($Claim :  Claim, $VehicleIncident :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotVehicleIncidentDV, SECTION_WIDGET_CLASS).setVariables(true, {$Claim, $VehicleIncident})
  }
  
  
}