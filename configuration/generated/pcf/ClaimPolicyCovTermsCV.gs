package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/CovTerm/ClaimPolicyCovTermsCV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimPolicyCovTermsCV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Coverage :  Coverage) : void {
    __widgetOf(this, pcf.ClaimPolicyCovTermsCV, SECTION_WIDGET_CLASS).setVariables(false, {$Coverage})
  }
  
  function refreshVariables ($Coverage :  Coverage) : void {
    __widgetOf(this, pcf.ClaimPolicyCovTermsCV, SECTION_WIDGET_CLASS).setVariables(true, {$Coverage})
  }
  
  
}