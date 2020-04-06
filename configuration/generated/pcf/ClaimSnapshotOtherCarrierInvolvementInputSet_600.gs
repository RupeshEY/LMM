package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/600/shared/ClaimSnapshotOtherCarrierInvolvementInputSet.600.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotOtherCarrierInvolvementInputSet_600 extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ExposureaParam :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotOtherCarrierInvolvementInputSet_600, SECTION_WIDGET_CLASS).setVariables(false, {$ExposureaParam})
  }
  
  function refreshVariables ($ExposureaParam :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotOtherCarrierInvolvementInputSet_600, SECTION_WIDGET_CLASS).setVariables(true, {$ExposureaParam})
  }
  
  
}