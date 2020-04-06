package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/CovTerm/ClaimPolicyCovTermsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimPolicyCovTermsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Coverage :  Coverage) : void {
    __widgetOf(this, pcf.ClaimPolicyCovTermsLV, SECTION_WIDGET_CLASS).setVariables(false, {$Coverage})
  }
  
  function refreshVariables ($Coverage :  Coverage) : void {
    __widgetOf(this, pcf.ClaimPolicyCovTermsLV, SECTION_WIDGET_CLASS).setVariables(true, {$Coverage})
  }
  
  
}