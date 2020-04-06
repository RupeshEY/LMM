package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/PolicyGeneralPanelSet.Auto.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class PolicyGeneralPanelSet_Auto extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Policy :  Policy, $Claim :  Claim) : void {
    __widgetOf(this, pcf.PolicyGeneralPanelSet_Auto, SECTION_WIDGET_CLASS).setVariables(false, {$Policy, $Claim})
  }
  
  function refreshVariables ($Policy :  Policy, $Claim :  Claim) : void {
    __widgetOf(this, pcf.PolicyGeneralPanelSet_Auto, SECTION_WIDGET_CLASS).setVariables(true, {$Policy, $Claim})
  }
  
  
}