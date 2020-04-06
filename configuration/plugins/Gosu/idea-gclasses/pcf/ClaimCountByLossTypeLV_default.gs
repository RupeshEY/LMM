package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/dashboard/ClaimCountByLossTypeLV.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimCountByLossTypeLV_default extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($DashboardStatsList :  DashboardStats[]) : void {
    __widgetOf(this, pcf.ClaimCountByLossTypeLV_default, SECTION_WIDGET_CLASS).setVariables(false, {$DashboardStatsList})
  }
  
  function refreshVariables ($DashboardStatsList :  DashboardStats[]) : void {
    __widgetOf(this, pcf.ClaimCountByLossTypeLV_default, SECTION_WIDGET_CLASS).setVariables(true, {$DashboardStatsList})
  }
  
  
}