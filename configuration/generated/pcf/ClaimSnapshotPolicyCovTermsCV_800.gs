package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/800/shared/ClaimSnapshotPolicyCovTermsCV.800.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotPolicyCovTermsCV_800 extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Coverage :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotPolicyCovTermsCV_800, SECTION_WIDGET_CLASS).setVariables(false, {$Coverage})
  }
  
  function refreshVariables ($Coverage :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotPolicyCovTermsCV_800, SECTION_WIDGET_CLASS).setVariables(true, {$Coverage})
  }
  
  
}