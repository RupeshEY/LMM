package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/documents/ContactDocumentDetailsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ContactDocumentDetailsInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($contactDocument :  ContactDocumentInfo) : void {
    __widgetOf(this, pcf.ContactDocumentDetailsInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$contactDocument})
  }
  
  function refreshVariables ($contactDocument :  ContactDocumentInfo) : void {
    __widgetOf(this, pcf.ContactDocumentDetailsInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$contactDocument})
  }
  
  
}