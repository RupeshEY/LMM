package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newdocument/NewDocumentFromTemplateScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewDocumentFromTemplateScreen extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim, $docInit :  util.document.DocumentInitWrapper, $template :  gw.plugin.document.IDocumentTemplateDescriptor, $activity :  Activity) : void {
    __widgetOf(this, pcf.NewDocumentFromTemplateScreen, SECTION_WIDGET_CLASS).setVariables(false, {$Claim, $docInit, $template, $activity})
  }
  
  function refreshVariables ($Claim :  Claim, $docInit :  util.document.DocumentInitWrapper, $template :  gw.plugin.document.IDocumentTemplateDescriptor, $activity :  Activity) : void {
    __widgetOf(this, pcf.NewDocumentFromTemplateScreen, SECTION_WIDGET_CLASS).setVariables(true, {$Claim, $docInit, $template, $activity})
  }
  
  
}