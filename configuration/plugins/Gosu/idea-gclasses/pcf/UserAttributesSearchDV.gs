package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/users/UserAttributesSearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class UserAttributesSearchDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($SearchCriteria :  gw.api.admin.AttributeSearchCriteria) : void {
    __widgetOf(this, pcf.UserAttributesSearchDV, SECTION_WIDGET_CLASS).setVariables(false, {$SearchCriteria})
  }
  
  function refreshVariables ($SearchCriteria :  gw.api.admin.AttributeSearchCriteria) : void {
    __widgetOf(this, pcf.UserAttributesSearchDV, SECTION_WIDGET_CLASS).setVariables(true, {$SearchCriteria})
  }
  
  
}