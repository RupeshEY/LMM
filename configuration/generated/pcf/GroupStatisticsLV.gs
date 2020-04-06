package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/team/summary/GroupStatisticsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class GroupStatisticsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($StatisticsList :  gw.api.statistics.Statistics[], $TeamGroupSummary :  gw.api.team.TeamGroupStatisticsHelper) : void {
    __widgetOf(this, pcf.GroupStatisticsLV, SECTION_WIDGET_CLASS).setVariables(false, {$StatisticsList, $TeamGroupSummary})
  }
  
  function refreshVariables ($StatisticsList :  gw.api.statistics.Statistics[], $TeamGroupSummary :  gw.api.team.TeamGroupStatisticsHelper) : void {
    __widgetOf(this, pcf.GroupStatisticsLV, SECTION_WIDGET_CLASS).setVariables(true, {$StatisticsList, $TeamGroupSummary})
  }
  
  
}