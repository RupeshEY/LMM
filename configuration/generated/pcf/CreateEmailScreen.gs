package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/email/CreateEmailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class CreateEmailScreen extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($activity :  Activity, $claim :  Claim, $emailTemplate :  String, $documentsToSend :  Document[]) : void {
    __widgetOf(this, pcf.CreateEmailScreen, SECTION_WIDGET_CLASS).setVariables(false, {$activity, $claim, $emailTemplate, $documentsToSend})
  }
  
  function refreshVariables ($activity :  Activity, $claim :  Claim, $emailTemplate :  String, $documentsToSend :  Document[]) : void {
    __widgetOf(this, pcf.CreateEmailScreen, SECTION_WIDGET_CLASS).setVariables(true, {$activity, $claim, $emailTemplate, $documentsToSend})
  }
  
  
}