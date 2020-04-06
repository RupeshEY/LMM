package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/dashboard/PeriodFinancialsByCoverageTypeLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class PeriodFinancialsByCoverageTypeLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($DashboardStatsList :  DashboardStats[]) : void {
    __widgetOf(this, pcf.PeriodFinancialsByCoverageTypeLV, SECTION_WIDGET_CLASS).setVariables(false, {$DashboardStatsList})
  }
  
  function refreshVariables ($DashboardStatsList :  DashboardStats[]) : void {
    __widgetOf(this, pcf.PeriodFinancialsByCoverageTypeLV, SECTION_WIDGET_CLASS).setVariables(true, {$DashboardStatsList})
  }
  
  
}