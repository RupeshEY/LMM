package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/claims/ClaimSearchResultsLV.archived.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSearchResultsLV_archived extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($claimSearchResults :  gw.api.search.ClaimSearchResults) : void {
    __widgetOf(this, pcf.ClaimSearchResultsLV_archived, SECTION_WIDGET_CLASS).setVariables(false, {$claimSearchResults})
  }
  
  function refreshVariables ($claimSearchResults :  gw.api.search.ClaimSearchResults) : void {
    __widgetOf(this, pcf.ClaimSearchResultsLV_archived, SECTION_WIDGET_CLASS).setVariables(true, {$claimSearchResults})
  }
  
  
}