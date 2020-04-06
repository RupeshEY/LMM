package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/workplan/WorkplanLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class WorkplanLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim, $ActivityList :  gw.api.database.IQueryBeanResult<Activity>) : void {
    __widgetOf(this, pcf.WorkplanLV, SECTION_WIDGET_CLASS).setVariables(false, {$Claim, $ActivityList})
  }
  
  function refreshVariables ($Claim :  Claim, $ActivityList :  gw.api.database.IQueryBeanResult<Activity>) : void {
    __widgetOf(this, pcf.WorkplanLV, SECTION_WIDGET_CLASS).setVariables(true, {$Claim, $ActivityList})
  }
  
  
}