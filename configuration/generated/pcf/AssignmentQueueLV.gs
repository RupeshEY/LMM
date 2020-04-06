package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/assignment/AssignmentQueueLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AssignmentQueueLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Queues :  gw.api.database.IQueryBeanResult<AssignableQueue>) : void {
    __widgetOf(this, pcf.AssignmentQueueLV, SECTION_WIDGET_CLASS).setVariables(false, {$Queues})
  }
  
  function refreshVariables ($Queues :  gw.api.database.IQueryBeanResult<AssignableQueue>) : void {
    __widgetOf(this, pcf.AssignmentQueueLV, SECTION_WIDGET_CLASS).setVariables(true, {$Queues})
  }
  
  
}