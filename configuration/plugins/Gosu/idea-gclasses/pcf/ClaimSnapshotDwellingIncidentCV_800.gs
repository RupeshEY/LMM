package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/800/ClaimSnapshotDwellingIncidentCV.800.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotDwellingIncidentCV_800 extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($claim :  Claim, $incidentParam :  dynamic.Dynamic, $snapshot :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotDwellingIncidentCV_800, SECTION_WIDGET_CLASS).setVariables(false, {$claim, $incidentParam, $snapshot})
  }
  
  function refreshVariables ($claim :  Claim, $incidentParam :  dynamic.Dynamic, $snapshot :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotDwellingIncidentCV_800, SECTION_WIDGET_CLASS).setVariables(true, {$claim, $incidentParam, $snapshot})
  }
  
  
}