package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/groups/OrganizationSearchResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class OrganizationSearchResultsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Organizations :  gw.api.database.IQueryBeanResult<Organization>) : void {
    __widgetOf(this, pcf.OrganizationSearchResultsLV, SECTION_WIDGET_CLASS).setVariables(false, {$Organizations})
  }
  
  function refreshVariables ($Organizations :  gw.api.database.IQueryBeanResult<Organization>) : void {
    __widgetOf(this, pcf.OrganizationSearchResultsLV, SECTION_WIDGET_CLASS).setVariables(true, {$Organizations})
  }
  
  
}