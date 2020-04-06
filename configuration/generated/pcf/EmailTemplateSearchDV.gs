package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/email/EmailTemplateSearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class EmailTemplateSearchDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($EmailTemplateSearchCriteria :  gw.api.email.EmailTemplateSearchCriteria) : void {
    __widgetOf(this, pcf.EmailTemplateSearchDV, SECTION_WIDGET_CLASS).setVariables(false, {$EmailTemplateSearchCriteria})
  }
  
  function refreshVariables ($EmailTemplateSearchCriteria :  gw.api.email.EmailTemplateSearchCriteria) : void {
    __widgetOf(this, pcf.EmailTemplateSearchDV, SECTION_WIDGET_CLASS).setVariables(true, {$EmailTemplateSearchCriteria})
  }
  
  
}