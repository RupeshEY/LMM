package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/documents/DocumentDetailsEditInputSet.email_sent.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class DocumentDetailsEditInputSet_email_sent extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($documentDetailsCCHelper :  gw.document.DocumentDetailsCCHelper, $fromTemplate :  boolean) : void {
    __widgetOf(this, pcf.DocumentDetailsEditInputSet_email_sent, SECTION_WIDGET_CLASS).setVariables(false, {$documentDetailsCCHelper, $fromTemplate})
  }
  
  function refreshVariables ($documentDetailsCCHelper :  gw.document.DocumentDetailsCCHelper, $fromTemplate :  boolean) : void {
    __widgetOf(this, pcf.DocumentDetailsEditInputSet_email_sent, SECTION_WIDGET_CLASS).setVariables(true, {$documentDetailsCCHelper, $fromTemplate})
  }
  
  
}