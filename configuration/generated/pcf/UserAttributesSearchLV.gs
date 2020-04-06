package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/users/UserAttributesSearchLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class UserAttributesSearchLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($SearchResult :  gw.api.database.IQueryBeanResult<Attribute>) : void {
    __widgetOf(this, pcf.UserAttributesSearchLV, SECTION_WIDGET_CLASS).setVariables(false, {$SearchResult})
  }
  
  function refreshVariables ($SearchResult :  gw.api.database.IQueryBeanResult<Attribute>) : void {
    __widgetOf(this, pcf.UserAttributesSearchLV, SECTION_WIDGET_CLASS).setVariables(true, {$SearchResult})
  }
  
  
}