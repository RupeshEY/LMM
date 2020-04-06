package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/800/shared/ClaimSnapshotOtherCarrierInvolvementInputSet.800.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotOtherCarrierInvolvementInputSet_800 extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ExposureParam :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotOtherCarrierInvolvementInputSet_800, SECTION_WIDGET_CLASS).setVariables(false, {$ExposureParam})
  }
  
  function refreshVariables ($ExposureParam :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotOtherCarrierInvolvementInputSet_800, SECTION_WIDGET_CLASS).setVariables(true, {$ExposureParam})
  }
  
  
}