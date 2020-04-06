package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/team/exposures/TeamExposuresLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class TeamExposuresLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ExposureTeamViewList :  gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>, $FilterSet :  gw.api.team.TeamExposureFilterSet) : void {
    __widgetOf(this, pcf.TeamExposuresLV, SECTION_WIDGET_CLASS).setVariables(false, {$ExposureTeamViewList, $FilterSet})
  }
  
  function refreshVariables ($ExposureTeamViewList :  gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>, $FilterSet :  gw.api.team.TeamExposureFilterSet) : void {
    __widgetOf(this, pcf.TeamExposuresLV, SECTION_WIDGET_CLASS).setVariables(true, {$ExposureTeamViewList, $FilterSet})
  }
  
  
}