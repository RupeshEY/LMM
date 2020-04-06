package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/claims/FreeTextClaimSearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class FreeTextClaimSearchDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ClaimSearchCriteria :  ClaimSearchCriteria, $archiveSearchEnabled :  boolean) : void {
    __widgetOf(this, pcf.FreeTextClaimSearchDV, SECTION_WIDGET_CLASS).setVariables(false, {$ClaimSearchCriteria, $archiveSearchEnabled})
  }
  
  function refreshVariables ($ClaimSearchCriteria :  ClaimSearchCriteria, $archiveSearchEnabled :  boolean) : void {
    __widgetOf(this, pcf.FreeTextClaimSearchDV, SECTION_WIDGET_CLASS).setVariables(true, {$ClaimSearchCriteria, $archiveSearchEnabled})
  }
  
  
}