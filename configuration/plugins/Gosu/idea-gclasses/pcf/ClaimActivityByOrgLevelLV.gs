package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/dashboard/ClaimActivityByOrgLevelLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimActivityByOrgLevelLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($DashboardStatsList :  DashboardStats[]) : void {
    __widgetOf(this, pcf.ClaimActivityByOrgLevelLV, SECTION_WIDGET_CLASS).setVariables(false, {$DashboardStatsList})
  }
  
  function refreshVariables ($DashboardStatsList :  DashboardStats[]) : void {
    __widgetOf(this, pcf.ClaimActivityByOrgLevelLV, SECTION_WIDGET_CLASS).setVariables(true, {$DashboardStatsList})
  }
  
  
}