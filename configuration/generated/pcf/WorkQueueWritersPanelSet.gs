package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/WorkQueueWritersPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class WorkQueueWritersPanelSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Page :  gw.api.web.tools.WorkQueueInfoPage, $Queue :  gw.api.web.tools.WorkQueueDisplayInfo) : void {
    __widgetOf(this, pcf.WorkQueueWritersPanelSet, SECTION_WIDGET_CLASS).setVariables(false, {$Page, $Queue})
  }
  
  function refreshVariables ($Page :  gw.api.web.tools.WorkQueueInfoPage, $Queue :  gw.api.web.tools.WorkQueueDisplayInfo) : void {
    __widgetOf(this, pcf.WorkQueueWritersPanelSet, SECTION_WIDGET_CLASS).setVariables(true, {$Page, $Queue})
  }
  
  
}