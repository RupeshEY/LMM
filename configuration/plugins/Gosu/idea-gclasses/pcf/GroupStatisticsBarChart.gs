package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/team/summary/GroupStatisticsBarChart.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class GroupStatisticsBarChart extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($StatisticsList :  gw.api.statistics.Statistics[], $Group :  Group) : void {
    __widgetOf(this, pcf.GroupStatisticsBarChart, SECTION_WIDGET_CLASS).setVariables(false, {$StatisticsList, $Group})
  }
  
  function refreshVariables ($StatisticsList :  gw.api.statistics.Statistics[], $Group :  Group) : void {
    __widgetOf(this, pcf.GroupStatisticsBarChart, SECTION_WIDGET_CLASS).setVariables(true, {$StatisticsList, $Group})
  }
  
  
}