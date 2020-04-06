package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/specialhandling/AutomatedHandlerActionInputSet.notification.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AutomatedHandlerActionInputSet_notification extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($automatedHandler :  AutomatedHandler) : void {
    __widgetOf(this, pcf.AutomatedHandlerActionInputSet_notification, SECTION_WIDGET_CLASS).setVariables(false, {$automatedHandler})
  }
  
  function refreshVariables ($automatedHandler :  AutomatedHandler) : void {
    __widgetOf(this, pcf.AutomatedHandlerActionInputSet_notification, SECTION_WIDGET_CLASS).setVariables(true, {$automatedHandler})
  }
  
  
}