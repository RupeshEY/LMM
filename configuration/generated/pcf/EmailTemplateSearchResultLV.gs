package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/email/EmailTemplateSearchResultLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class EmailTemplateSearchResultLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($EmailTemplateDescriptorList :  gw.plugin.email.IEmailTemplateDescriptor[]) : void {
    __widgetOf(this, pcf.EmailTemplateSearchResultLV, SECTION_WIDGET_CLASS).setVariables(false, {$EmailTemplateDescriptorList})
  }
  
  function refreshVariables ($EmailTemplateDescriptorList :  gw.plugin.email.IEmailTemplateDescriptor[]) : void {
    __widgetOf(this, pcf.EmailTemplateSearchResultLV, SECTION_WIDGET_CLASS).setVariables(true, {$EmailTemplateDescriptorList})
  }
  
  
}