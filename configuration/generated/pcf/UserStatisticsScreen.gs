package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/workspace/statistics/UserStatisticsScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class UserStatisticsScreen extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($UserStatsBean :  UserStatsBean) : void {
    __widgetOf(this, pcf.UserStatisticsScreen, SECTION_WIDGET_CLASS).setVariables(false, {$UserStatsBean})
  }
  
  function refreshVariables ($UserStatsBean :  UserStatsBean) : void {
    __widgetOf(this, pcf.UserStatisticsScreen, SECTION_WIDGET_CLASS).setVariables(true, {$UserStatsBean})
  }
  
  
}