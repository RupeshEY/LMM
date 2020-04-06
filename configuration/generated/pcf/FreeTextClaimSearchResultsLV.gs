package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/claims/FreeTextClaimSearchResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class FreeTextClaimSearchResultsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($claimSearchResults :  gw.api.search.FreeTextClaimSearchResults) : void {
    __widgetOf(this, pcf.FreeTextClaimSearchResultsLV, SECTION_WIDGET_CLASS).setVariables(false, {$claimSearchResults})
  }
  
  function refreshVariables ($claimSearchResults :  gw.api.search.FreeTextClaimSearchResults) : void {
    __widgetOf(this, pcf.FreeTextClaimSearchResultsLV, SECTION_WIDGET_CLASS).setVariables(true, {$claimSearchResults})
  }
  
  
}