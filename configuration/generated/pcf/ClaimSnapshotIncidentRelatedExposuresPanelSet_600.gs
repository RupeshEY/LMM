package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotIncidentRelatedExposuresPanelSet.600.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotIncidentRelatedExposuresPanelSet_600 extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($claim :  Claim, $snapshot :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotIncidentRelatedExposuresPanelSet_600, SECTION_WIDGET_CLASS).setVariables(false, {$claim, $snapshot})
  }
  
  function refreshVariables ($claim :  Claim, $snapshot :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotIncidentRelatedExposuresPanelSet_600, SECTION_WIDGET_CLASS).setVariables(true, {$claim, $snapshot})
  }
  
  
}