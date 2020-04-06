package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/specialhandling/AutomatedHandlerActionInputSet.activity.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AutomatedHandlerActionInputSet_activity extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($automatedHandler :  AutomatedHandler) : void {
    __widgetOf(this, pcf.AutomatedHandlerActionInputSet_activity, SECTION_WIDGET_CLASS).setVariables(false, {$automatedHandler})
  }
  
  function refreshVariables ($automatedHandler :  AutomatedHandler) : void {
    __widgetOf(this, pcf.AutomatedHandlerActionInputSet_activity, SECTION_WIDGET_CLASS).setVariables(true, {$automatedHandler})
  }
  
  
}