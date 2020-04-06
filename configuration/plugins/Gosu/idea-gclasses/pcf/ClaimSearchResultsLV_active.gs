package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/claims/ClaimSearchResultsLV.active.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSearchResultsLV_active extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($claimSearchResults :  gw.api.search.ClaimSearchResults) : void {
    __widgetOf(this, pcf.ClaimSearchResultsLV_active, SECTION_WIDGET_CLASS).setVariables(false, {$claimSearchResults})
  }
  
  function refreshVariables ($claimSearchResults :  gw.api.search.ClaimSearchResults) : void {
    __widgetOf(this, pcf.ClaimSearchResultsLV_active, SECTION_WIDGET_CLASS).setVariables(true, {$claimSearchResults})
  }
  
  
}