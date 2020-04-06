package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/checks/ApprovalHistoryLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ApprovalHistoryLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ActivityList :  Activity[]) : void {
    __widgetOf(this, pcf.ApprovalHistoryLV, SECTION_WIDGET_CLASS).setVariables(false, {$ActivityList})
  }
  
  function refreshVariables ($ActivityList :  Activity[]) : void {
    __widgetOf(this, pcf.ApprovalHistoryLV, SECTION_WIDGET_CLASS).setVariables(true, {$ActivityList})
  }
  
  
}