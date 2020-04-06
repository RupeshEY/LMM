package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyVehicle600PanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotPolicyVehicle600PanelSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim, $VehicleRU :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotPolicyVehicle600PanelSet, SECTION_WIDGET_CLASS).setVariables(false, {$Claim, $VehicleRU})
  }
  
  function refreshVariables ($Claim :  Claim, $VehicleRU :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotPolicyVehicle600PanelSet, SECTION_WIDGET_CLASS).setVariables(true, {$Claim, $VehicleRU})
  }
  
  
}