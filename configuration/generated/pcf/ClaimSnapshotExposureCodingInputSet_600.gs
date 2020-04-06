package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/600/shared/ClaimSnapshotExposureCodingInputSet.600.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotExposureCodingInputSet_600 extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ExposureParam :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotExposureCodingInputSet_600, SECTION_WIDGET_CLASS).setVariables(false, {$ExposureParam})
  }
  
  function refreshVariables ($ExposureParam :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotExposureCodingInputSet_600, SECTION_WIDGET_CLASS).setVariables(true, {$ExposureParam})
  }
  
  
}