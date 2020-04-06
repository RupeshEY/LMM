package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/WorkQueueWorkItemsLDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class WorkQueueWorkItemsLDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Helper :  gw.api.web.tools.WorkQueueInfoPage, $Queue :  gw.api.web.tools.WorkQueueDisplayInfo) : void {
    __widgetOf(this, pcf.WorkQueueWorkItemsLDV, SECTION_WIDGET_CLASS).setVariables(false, {$Helper, $Queue})
  }
  
  function refreshVariables ($Helper :  gw.api.web.tools.WorkQueueInfoPage, $Queue :  gw.api.web.tools.WorkQueueDisplayInfo) : void {
    __widgetOf(this, pcf.WorkQueueWorkItemsLDV, SECTION_WIDGET_CLASS).setVariables(true, {$Helper, $Queue})
  }
  
  
}