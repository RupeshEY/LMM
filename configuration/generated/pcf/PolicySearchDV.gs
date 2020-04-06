package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/PolicySearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class PolicySearchDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($PolicySearchCriteria :  PolicySearchCriteria) : void {
    __widgetOf(this, pcf.PolicySearchDV, SECTION_WIDGET_CLASS).setVariables(false, {$PolicySearchCriteria})
  }
  
  function refreshVariables ($PolicySearchCriteria :  PolicySearchCriteria) : void {
    __widgetOf(this, pcf.PolicySearchDV, SECTION_WIDGET_CLASS).setVariables(true, {$PolicySearchCriteria})
  }
  
  
}