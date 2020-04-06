package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotIncidentAssessDV.600.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotIncidentAssessDV_600 extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim, $incidentParam :  dynamic.Dynamic, $snapshot :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotIncidentAssessDV_600, SECTION_WIDGET_CLASS).setVariables(false, {$Claim, $incidentParam, $snapshot})
  }
  
  function refreshVariables ($Claim :  Claim, $incidentParam :  dynamic.Dynamic, $snapshot :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotIncidentAssessDV_600, SECTION_WIDGET_CLASS).setVariables(true, {$Claim, $incidentParam, $snapshot})
  }
  
  
}