package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotExposureReplacementServices700DV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotExposureReplacementServices700DV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Exposure :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotExposureReplacementServices700DV, SECTION_WIDGET_CLASS).setVariables(false, {$Exposure})
  }
  
  function refreshVariables ($Exposure :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotExposureReplacementServices700DV, SECTION_WIDGET_CLASS).setVariables(true, {$Exposure})
  }
  
  
}