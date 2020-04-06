package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/team/user/TeamUserActivitiesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class TeamUserActivitiesLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ActivityTeamViewList :  gw.api.database.IQueryBeanResult<ActivityTeamView>, $FilterSet :  gw.api.team.TeamUserActivityFilterSet) : void {
    __widgetOf(this, pcf.TeamUserActivitiesLV, SECTION_WIDGET_CLASS).setVariables(false, {$ActivityTeamViewList, $FilterSet})
  }
  
  function refreshVariables ($ActivityTeamViewList :  gw.api.database.IQueryBeanResult<ActivityTeamView>, $FilterSet :  gw.api.team.TeamUserActivityFilterSet) : void {
    __widgetOf(this, pcf.TeamUserActivitiesLV, SECTION_WIDGET_CLASS).setVariables(true, {$ActivityTeamViewList, $FilterSet})
  }
  
  
}