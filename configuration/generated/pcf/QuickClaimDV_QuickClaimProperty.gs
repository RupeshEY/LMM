package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/QuickClaimDV.QuickClaimProperty.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class QuickClaimDV_QuickClaimProperty extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim, $Wizard :  gw.api.claim.NewClaimWizardInfo) : void {
    __widgetOf(this, pcf.QuickClaimDV_QuickClaimProperty, SECTION_WIDGET_CLASS).setVariables(false, {$Claim, $Wizard})
  }
  
  function refreshVariables ($Claim :  Claim, $Wizard :  gw.api.claim.NewClaimWizardInfo) : void {
    __widgetOf(this, pcf.QuickClaimDV_QuickClaimProperty, SECTION_WIDGET_CLASS).setVariables(true, {$Claim, $Wizard})
  }
  
  
}