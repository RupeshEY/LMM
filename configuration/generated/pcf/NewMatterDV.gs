package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newother/NewMatterDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewMatterDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Matter :  Matter, $AssigneeHolder :  gw.api.assignment.Assignee[]) : void {
    __widgetOf(this, pcf.NewMatterDV, SECTION_WIDGET_CLASS).setVariables(false, {$Matter, $AssigneeHolder})
  }
  
  function refreshVariables ($Matter :  Matter, $AssigneeHolder :  gw.api.assignment.Assignee[]) : void {
    __widgetOf(this, pcf.NewMatterDV, SECTION_WIDGET_CLASS).setVariables(true, {$Matter, $AssigneeHolder})
  }
  
  
}