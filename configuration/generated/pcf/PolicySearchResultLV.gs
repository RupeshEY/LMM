package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/PolicySearchResultLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class PolicySearchResultLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($PolicySummaryList :  gw.api.database.IQueryBeanResult<PolicySummary>, $IncludeArchived :  Boolean) : void {
    __widgetOf(this, pcf.PolicySearchResultLV, SECTION_WIDGET_CLASS).setVariables(false, {$PolicySummaryList, $IncludeArchived})
  }
  
  function refreshVariables ($PolicySummaryList :  gw.api.database.IQueryBeanResult<PolicySummary>, $IncludeArchived :  Boolean) : void {
    __widgetOf(this, pcf.PolicySearchResultLV, SECTION_WIDGET_CLASS).setVariables(true, {$PolicySummaryList, $IncludeArchived})
  }
  
  
}