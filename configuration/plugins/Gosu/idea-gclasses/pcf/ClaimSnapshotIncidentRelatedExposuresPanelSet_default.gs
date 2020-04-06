package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/default/ClaimSnapshotIncidentRelatedExposuresPanelSet.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotIncidentRelatedExposuresPanelSet_default extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($claim :  Claim, $snapshot :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotIncidentRelatedExposuresPanelSet_default, SECTION_WIDGET_CLASS).setVariables(false, {$claim, $snapshot})
  }
  
  function refreshVariables ($claim :  Claim, $snapshot :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotIncidentRelatedExposuresPanelSet_default, SECTION_WIDGET_CLASS).setVariables(true, {$claim, $snapshot})
  }
  
  
}