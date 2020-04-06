package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/vacation/VacationClaimsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class VacationClaimsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ClaimVacationViewList :  gw.api.database.IQueryBeanResult<ClaimVacationView>) : void {
    __widgetOf(this, pcf.VacationClaimsLV, SECTION_WIDGET_CLASS).setVariables(false, {$ClaimVacationViewList})
  }
  
  function refreshVariables ($ClaimVacationViewList :  gw.api.database.IQueryBeanResult<ClaimVacationView>) : void {
    __widgetOf(this, pcf.VacationClaimsLV, SECTION_WIDGET_CLASS).setVariables(true, {$ClaimVacationViewList})
  }
  
  
}