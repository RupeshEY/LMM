package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotDwellingIncidentCV.600.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotDwellingIncidentCV_600 extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($claim :  Claim, $incidentParam :  dynamic.Dynamic, $snapshot :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotDwellingIncidentCV_600, SECTION_WIDGET_CLASS).setVariables(false, {$claim, $incidentParam, $snapshot})
  }
  
  function refreshVariables ($claim :  Claim, $incidentParam :  dynamic.Dynamic, $snapshot :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotDwellingIncidentCV_600, SECTION_WIDGET_CLASS).setVariables(true, {$claim, $incidentParam, $snapshot})
  }
  
  
}