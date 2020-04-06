package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newactivity/NewActivityDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewActivityDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Activity :  Activity, $AssigneeHolder :  gw.api.assignment.Assignee[], $Claim :  Claim) : void {
    __widgetOf(this, pcf.NewActivityDV, SECTION_WIDGET_CLASS).setVariables(false, {$Activity, $AssigneeHolder, $Claim})
  }
  
  function refreshVariables ($Activity :  Activity, $AssigneeHolder :  gw.api.assignment.Assignee[], $Claim :  Claim) : void {
    __widgetOf(this, pcf.NewActivityDV, SECTION_WIDGET_CLASS).setVariables(true, {$Activity, $AssigneeHolder, $Claim})
  }
  
  
}