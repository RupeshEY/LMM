package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/desktop/pendingassignment/DesktopAwaitingAssignmentLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class DesktopAwaitingAssignmentLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ActivityUnassignedViewList :  gw.api.database.IQueryBeanResult<ActivityUnassignedView>) : void {
    __widgetOf(this, pcf.DesktopAwaitingAssignmentLV, SECTION_WIDGET_CLASS).setVariables(false, {$ActivityUnassignedViewList})
  }
  
  function refreshVariables ($ActivityUnassignedViewList :  gw.api.database.IQueryBeanResult<ActivityUnassignedView>) : void {
    __widgetOf(this, pcf.DesktopAwaitingAssignmentLV, SECTION_WIDGET_CLASS).setVariables(true, {$ActivityUnassignedViewList})
  }
  
  
}