package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimNewExposureMenuItemSet.coveragetype.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimNewExposureMenuItemSet_coveragetype extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($claim :  Claim, $wizard :  gw.api.claim.NewClaimWizardInfo) : void {
    __widgetOf(this, pcf.NewClaimNewExposureMenuItemSet_coveragetype, SECTION_WIDGET_CLASS).setVariables(false, {$claim, $wizard})
  }
  
  function refreshVariables ($claim :  Claim, $wizard :  gw.api.claim.NewClaimWizardInfo) : void {
    __widgetOf(this, pcf.NewClaimNewExposureMenuItemSet_coveragetype, SECTION_WIDGET_CLASS).setVariables(true, {$claim, $wizard})
  }
  
  
}