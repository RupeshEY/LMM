package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/groups/OrganizationsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class OrganizationsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Organizations :  gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>) : void {
    __widgetOf(this, pcf.OrganizationsLV, SECTION_WIDGET_CLASS).setVariables(false, {$Organizations})
  }
  
  function refreshVariables ($Organizations :  gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>) : void {
    __widgetOf(this, pcf.OrganizationsLV, SECTION_WIDGET_CLASS).setVariables(true, {$Organizations})
  }
  
  
}