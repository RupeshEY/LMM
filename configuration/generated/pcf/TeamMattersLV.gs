package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/team/matters/TeamMattersLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class TeamMattersLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($MatterTeamViewList :  gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>) : void {
    __widgetOf(this, pcf.TeamMattersLV, SECTION_WIDGET_CLASS).setVariables(false, {$MatterTeamViewList})
  }
  
  function refreshVariables ($MatterTeamViewList :  gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>) : void {
    __widgetOf(this, pcf.TeamMattersLV, SECTION_WIDGET_CLASS).setVariables(true, {$MatterTeamViewList})
  }
  
  
}