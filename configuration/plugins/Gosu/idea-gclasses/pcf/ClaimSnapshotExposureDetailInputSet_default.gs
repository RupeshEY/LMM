package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/default/shared/ClaimSnapshotExposureDetailInputSet.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotExposureDetailInputSet_default extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ExposureParam :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotExposureDetailInputSet_default, SECTION_WIDGET_CLASS).setVariables(false, {$ExposureParam})
  }
  
  function refreshVariables ($ExposureParam :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotExposureDetailInputSet_default, SECTION_WIDGET_CLASS).setVariables(true, {$ExposureParam})
  }
  
  
}