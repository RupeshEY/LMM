package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/users/UserMattersLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class UserMattersLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($MatterUserViewList :  gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>) : void {
    __widgetOf(this, pcf.UserMattersLV, SECTION_WIDGET_CLASS).setVariables(false, {$MatterUserViewList})
  }
  
  function refreshVariables ($MatterUserViewList :  gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>) : void {
    __widgetOf(this, pcf.UserMattersLV, SECTION_WIDGET_CLASS).setVariables(true, {$MatterUserViewList})
  }
  
  
}