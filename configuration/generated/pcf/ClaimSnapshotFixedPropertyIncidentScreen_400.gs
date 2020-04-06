package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotFixedPropertyIncidentScreen.400.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotFixedPropertyIncidentScreen_400 extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim, $IncidentParam :  dynamic.Dynamic, $SnapshotParam :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotFixedPropertyIncidentScreen_400, SECTION_WIDGET_CLASS).setVariables(false, {$Claim, $IncidentParam, $SnapshotParam})
  }
  
  function refreshVariables ($Claim :  Claim, $IncidentParam :  dynamic.Dynamic, $SnapshotParam :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotFixedPropertyIncidentScreen_400, SECTION_WIDGET_CLASS).setVariables(true, {$Claim, $IncidentParam, $SnapshotParam})
  }
  
  
}