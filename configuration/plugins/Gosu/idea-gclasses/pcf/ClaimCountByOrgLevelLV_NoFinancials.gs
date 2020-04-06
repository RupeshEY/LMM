package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/dashboard/ClaimCountByOrgLevelLV.NoFinancials.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimCountByOrgLevelLV_NoFinancials extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($DashboardStatsList :  DashboardStats[]) : void {
    __widgetOf(this, pcf.ClaimCountByOrgLevelLV_NoFinancials, SECTION_WIDGET_CLASS).setVariables(false, {$DashboardStatsList})
  }
  
  function refreshVariables ($DashboardStatsList :  DashboardStats[]) : void {
    __widgetOf(this, pcf.ClaimCountByOrgLevelLV_NoFinancials, SECTION_WIDGET_CLASS).setVariables(true, {$DashboardStatsList})
  }
  
  
}