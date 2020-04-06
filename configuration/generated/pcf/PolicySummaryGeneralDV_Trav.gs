package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/PolicySummaryGeneralDV.Trav.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class PolicySummaryGeneralDV_Trav extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($PolicySummary :  PolicySummary) : void {
    __widgetOf(this, pcf.PolicySummaryGeneralDV_Trav, SECTION_WIDGET_CLASS).setVariables(false, {$PolicySummary})
  }
  
  function refreshVariables ($PolicySummary :  PolicySummary) : void {
    __widgetOf(this, pcf.PolicySummaryGeneralDV_Trav, SECTION_WIDGET_CLASS).setVariables(true, {$PolicySummary})
  }
  
  
}