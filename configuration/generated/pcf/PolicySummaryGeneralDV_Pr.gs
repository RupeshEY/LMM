package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/PolicySummaryGeneralDV.Pr.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class PolicySummaryGeneralDV_Pr extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($PolicySummary :  PolicySummary) : void {
    __widgetOf(this, pcf.PolicySummaryGeneralDV_Pr, SECTION_WIDGET_CLASS).setVariables(false, {$PolicySummary})
  }
  
  function refreshVariables ($PolicySummary :  PolicySummary) : void {
    __widgetOf(this, pcf.PolicySummaryGeneralDV_Pr, SECTION_WIDGET_CLASS).setVariables(true, {$PolicySummary})
  }
  
  
}