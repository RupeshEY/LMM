package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/documents/DocumentDetailsEditSupplementalInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class DocumentDetailsEditSupplementalInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($document :  Document) : void {
    __widgetOf(this, pcf.DocumentDetailsEditSupplementalInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$document})
  }
  
  function refreshVariables ($document :  Document) : void {
    __widgetOf(this, pcf.DocumentDetailsEditSupplementalInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$document})
  }
  
  
}