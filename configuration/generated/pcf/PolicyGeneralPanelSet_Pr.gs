package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/PolicyGeneralPanelSet.Pr.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class PolicyGeneralPanelSet_Pr extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Policy :  Policy, $Claim :  Claim) : void {
    __widgetOf(this, pcf.PolicyGeneralPanelSet_Pr, SECTION_WIDGET_CLASS).setVariables(false, {$Policy, $Claim})
  }
  
  function refreshVariables ($Policy :  Policy, $Claim :  Claim) : void {
    __widgetOf(this, pcf.PolicyGeneralPanelSet_Pr, SECTION_WIDGET_CLASS).setVariables(true, {$Policy, $Claim})
  }
  
  
}