package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/catastrophes/CatastropheAdminLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class CatastropheAdminLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($CatastropheList :  gw.api.database.IQueryBeanResult<Catastrophe>) : void {
    __widgetOf(this, pcf.CatastropheAdminLV, SECTION_WIDGET_CLASS).setVariables(false, {$CatastropheList})
  }
  
  function refreshVariables ($CatastropheList :  gw.api.database.IQueryBeanResult<Catastrophe>) : void {
    __widgetOf(this, pcf.CatastropheAdminLV, SECTION_WIDGET_CLASS).setVariables(true, {$CatastropheList})
  }
  
  
}