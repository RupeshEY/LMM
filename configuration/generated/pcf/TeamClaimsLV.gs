package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/team/claims/TeamClaimsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class TeamClaimsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ClaimTeamViewList :  gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>, $FilterSet :  gw.api.team.TeamClaimFilterSet) : void {
    __widgetOf(this, pcf.TeamClaimsLV, SECTION_WIDGET_CLASS).setVariables(false, {$ClaimTeamViewList, $FilterSet})
  }
  
  function refreshVariables ($ClaimTeamViewList :  gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>, $FilterSet :  gw.api.team.TeamClaimFilterSet) : void {
    __widgetOf(this, pcf.TeamClaimsLV, SECTION_WIDGET_CLASS).setVariables(true, {$ClaimTeamViewList, $FilterSet})
  }
  
  
}