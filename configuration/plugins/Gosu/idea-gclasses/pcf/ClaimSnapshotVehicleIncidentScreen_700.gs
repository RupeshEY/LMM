package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotVehicleIncidentScreen.700.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotVehicleIncidentScreen_700 extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim, $IncidentParam :  dynamic.Dynamic, $SnapshotParam :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotVehicleIncidentScreen_700, SECTION_WIDGET_CLASS).setVariables(false, {$Claim, $IncidentParam, $SnapshotParam})
  }
  
  function refreshVariables ($Claim :  Claim, $IncidentParam :  dynamic.Dynamic, $SnapshotParam :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotVehicleIncidentScreen_700, SECTION_WIDGET_CLASS).setVariables(true, {$Claim, $IncidentParam, $SnapshotParam})
  }
  
  
}