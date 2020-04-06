package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/DuplicateClaimSearchResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class DuplicateClaimSearchResultsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ClaimList :  Claim[]) : void {
    __widgetOf(this, pcf.DuplicateClaimSearchResultsLV, SECTION_WIDGET_CLASS).setVariables(false, {$ClaimList})
  }
  
  function refreshVariables ($ClaimList :  Claim[]) : void {
    __widgetOf(this, pcf.DuplicateClaimSearchResultsLV, SECTION_WIDGET_CLASS).setVariables(true, {$ClaimList})
  }
  
  
}