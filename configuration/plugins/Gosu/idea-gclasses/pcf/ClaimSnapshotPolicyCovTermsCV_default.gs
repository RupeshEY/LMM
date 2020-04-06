package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/default/shared/ClaimSnapshotPolicyCovTermsCV.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotPolicyCovTermsCV_default extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Coverage :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotPolicyCovTermsCV_default, SECTION_WIDGET_CLASS).setVariables(false, {$Coverage})
  }
  
  function refreshVariables ($Coverage :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotPolicyCovTermsCV_default, SECTION_WIDGET_CLASS).setVariables(true, {$Coverage})
  }
  
  
}