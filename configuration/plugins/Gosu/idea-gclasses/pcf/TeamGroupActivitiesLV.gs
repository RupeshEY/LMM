package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/team/activities/TeamGroupActivitiesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class TeamGroupActivitiesLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ActivityTeamViewList :  gw.api.database.IQueryBeanResult<ActivityTeamView>, $FilterSet :  gw.api.team.TeamGroupActivityFilterSet) : void {
    __widgetOf(this, pcf.TeamGroupActivitiesLV, SECTION_WIDGET_CLASS).setVariables(false, {$ActivityTeamViewList, $FilterSet})
  }
  
  function refreshVariables ($ActivityTeamViewList :  gw.api.database.IQueryBeanResult<ActivityTeamView>, $FilterSet :  gw.api.team.TeamGroupActivityFilterSet) : void {
    __widgetOf(this, pcf.TeamGroupActivitiesLV, SECTION_WIDGET_CLASS).setVariables(true, {$ActivityTeamViewList, $FilterSet})
  }
  
  
}