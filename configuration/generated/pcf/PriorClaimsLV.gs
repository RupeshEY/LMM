package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/PriorClaimsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class PriorClaimsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($PriorClaimViewList :  gw.api.database.IQueryBeanResult<PriorClaimView>) : void {
    __widgetOf(this, pcf.PriorClaimsLV, SECTION_WIDGET_CLASS).setVariables(false, {$PriorClaimViewList})
  }
  
  function refreshVariables ($PriorClaimViewList :  gw.api.database.IQueryBeanResult<PriorClaimView>) : void {
    __widgetOf(this, pcf.PriorClaimsLV, SECTION_WIDGET_CLASS).setVariables(true, {$PriorClaimViewList})
  }
  
  
}