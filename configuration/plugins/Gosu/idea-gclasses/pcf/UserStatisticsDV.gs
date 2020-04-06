package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/workspace/statistics/UserStatisticsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class UserStatisticsDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($UserStatsBean :  UserStatsBean) : void {
    __widgetOf(this, pcf.UserStatisticsDV, SECTION_WIDGET_CLASS).setVariables(false, {$UserStatsBean})
  }
  
  function refreshVariables ($UserStatsBean :  UserStatsBean) : void {
    __widgetOf(this, pcf.UserStatisticsDV, SECTION_WIDGET_CLASS).setVariables(true, {$UserStatsBean})
  }
  
  
}