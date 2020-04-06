package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/700/shared/ClaimSnapshotOtherCarrierInvolvementInputSet.700.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotOtherCarrierInvolvementInputSet_700 extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ExposureParam :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotOtherCarrierInvolvementInputSet_700, SECTION_WIDGET_CLASS).setVariables(false, {$ExposureParam})
  }
  
  function refreshVariables ($ExposureParam :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotOtherCarrierInvolvementInputSet_700, SECTION_WIDGET_CLASS).setVariables(true, {$ExposureParam})
  }
  
  
}