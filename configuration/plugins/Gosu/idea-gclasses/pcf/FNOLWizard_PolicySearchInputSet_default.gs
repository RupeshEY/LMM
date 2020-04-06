package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_PolicySearchInputSet.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class FNOLWizard_PolicySearchInputSet_default extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim, $PolicySearch :  PolicySearchCriteria) : void {
    __widgetOf(this, pcf.FNOLWizard_PolicySearchInputSet_default, SECTION_WIDGET_CLASS).setVariables(false, {$Claim, $PolicySearch})
  }
  
  function refreshVariables ($Claim :  Claim, $PolicySearch :  PolicySearchCriteria) : void {
    __widgetOf(this, pcf.FNOLWizard_PolicySearchInputSet_default, SECTION_WIDGET_CLASS).setVariables(true, {$Claim, $PolicySearch})
  }
  
  
}