package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/WorkQueueWorkItemsLV.ActivityEsc.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class WorkQueueWorkItemsLV_ActivityEsc extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Helper :  gw.api.web.tools.WorkQueueInfoPage, $Queue :  gw.api.web.tools.WorkQueueDisplayInfo) : void {
    __widgetOf(this, pcf.WorkQueueWorkItemsLV_ActivityEsc, SECTION_WIDGET_CLASS).setVariables(false, {$Helper, $Queue})
  }
  
  function refreshVariables ($Helper :  gw.api.web.tools.WorkQueueInfoPage, $Queue :  gw.api.web.tools.WorkQueueDisplayInfo) : void {
    __widgetOf(this, pcf.WorkQueueWorkItemsLV_ActivityEsc, SECTION_WIDGET_CLASS).setVariables(true, {$Helper, $Queue})
  }
  
  
}