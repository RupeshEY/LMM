package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/team/user/VacationActivitiesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class VacationActivitiesLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ActivityVacationViewList :  gw.api.database.IQueryBeanResult<ActivityVacationView>) : void {
    __widgetOf(this, pcf.VacationActivitiesLV, SECTION_WIDGET_CLASS).setVariables(false, {$ActivityVacationViewList})
  }
  
  function refreshVariables ($ActivityVacationViewList :  gw.api.database.IQueryBeanResult<ActivityVacationView>) : void {
    __widgetOf(this, pcf.VacationActivitiesLV, SECTION_WIDGET_CLASS).setVariables(true, {$ActivityVacationViewList})
  }
  
  
}