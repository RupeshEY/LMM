package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/700/shared/ClaimSnapshotPolicyCovTermsCV.700.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotPolicyCovTermsCV_700 extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Coverage :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotPolicyCovTermsCV_700, SECTION_WIDGET_CLASS).setVariables(false, {$Coverage})
  }
  
  function refreshVariables ($Coverage :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotPolicyCovTermsCV_700, SECTION_WIDGET_CLASS).setVariables(true, {$Coverage})
  }
  
  
}