package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/claims/ClaimSearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSearchDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ClaimSearchCriteria :  ClaimSearchCriteria, $archiveSearchEnabled :  boolean) : void {
    __widgetOf(this, pcf.ClaimSearchDV, SECTION_WIDGET_CLASS).setVariables(false, {$ClaimSearchCriteria, $archiveSearchEnabled})
  }
  
  function refreshVariables ($ClaimSearchCriteria :  ClaimSearchCriteria, $archiveSearchEnabled :  boolean) : void {
    __widgetOf(this, pcf.ClaimSearchDV, SECTION_WIDGET_CLASS).setVariables(true, {$ClaimSearchCriteria, $archiveSearchEnabled})
  }
  
  
}