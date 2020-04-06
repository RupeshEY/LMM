package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/groups/OrganizationSearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class OrganizationSearchDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($SearchCriteria :  OrganizationSearchCriteria) : void {
    __widgetOf(this, pcf.OrganizationSearchDV, SECTION_WIDGET_CLASS).setVariables(false, {$SearchCriteria})
  }
  
  function refreshVariables ($SearchCriteria :  OrganizationSearchCriteria) : void {
    __widgetOf(this, pcf.OrganizationSearchDV, SECTION_WIDGET_CLASS).setVariables(true, {$SearchCriteria})
  }
  
  
}