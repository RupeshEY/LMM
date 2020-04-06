package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyVehicle800PanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotPolicyVehicle800PanelSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim, $VehicleRU :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotPolicyVehicle800PanelSet, SECTION_WIDGET_CLASS).setVariables(false, {$Claim, $VehicleRU})
  }
  
  function refreshVariables ($Claim :  Claim, $VehicleRU :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotPolicyVehicle800PanelSet, SECTION_WIDGET_CLASS).setVariables(true, {$Claim, $VehicleRU})
  }
  
  
}