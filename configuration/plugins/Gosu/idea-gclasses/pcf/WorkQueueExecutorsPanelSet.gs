package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/WorkQueueExecutorsPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class WorkQueueExecutorsPanelSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Helper :  gw.api.web.tools.WorkQueueInfoPage, $Queue :  gw.api.web.tools.WorkQueueDisplayInfo) : void {
    __widgetOf(this, pcf.WorkQueueExecutorsPanelSet, SECTION_WIDGET_CLASS).setVariables(false, {$Helper, $Queue})
  }
  
  function refreshVariables ($Helper :  gw.api.web.tools.WorkQueueInfoPage, $Queue :  gw.api.web.tools.WorkQueueDisplayInfo) : void {
    __widgetOf(this, pcf.WorkQueueExecutorsPanelSet, SECTION_WIDGET_CLASS).setVariables(true, {$Helper, $Queue})
  }
  
  
}