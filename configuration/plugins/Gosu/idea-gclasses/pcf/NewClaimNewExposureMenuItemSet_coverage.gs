package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimNewExposureMenuItemSet.coverage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimNewExposureMenuItemSet_coverage extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($claim :  Claim, $wizard :  gw.api.claim.NewClaimWizardInfo) : void {
    __widgetOf(this, pcf.NewClaimNewExposureMenuItemSet_coverage, SECTION_WIDGET_CLASS).setVariables(false, {$claim, $wizard})
  }
  
  function refreshVariables ($claim :  Claim, $wizard :  gw.api.claim.NewClaimWizardInfo) : void {
    __widgetOf(this, pcf.NewClaimNewExposureMenuItemSet_coverage, SECTION_WIDGET_CLASS).setVariables(true, {$claim, $wizard})
  }
  
  
}