package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/team/aging/GroupAgingStatisticsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class GroupAgingStatisticsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($StatisticsList :  gw.api.statistics.Statistics[], $TeamGroupAging :  gw.api.team.TeamGroupStatisticsHelper) : void {
    __widgetOf(this, pcf.GroupAgingStatisticsLV, SECTION_WIDGET_CLASS).setVariables(false, {$StatisticsList, $TeamGroupAging})
  }
  
  function refreshVariables ($StatisticsList :  gw.api.statistics.Statistics[], $TeamGroupAging :  gw.api.team.TeamGroupStatisticsHelper) : void {
    __widgetOf(this, pcf.GroupAgingStatisticsLV, SECTION_WIDGET_CLASS).setVariables(true, {$StatisticsList, $TeamGroupAging})
  }
  
  
}