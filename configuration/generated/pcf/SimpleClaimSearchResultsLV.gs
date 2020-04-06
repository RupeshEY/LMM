package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/claims/SimpleClaimSearchResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class SimpleClaimSearchResultsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($SimpleClaimSearchViewList :  gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>) : void {
    __widgetOf(this, pcf.SimpleClaimSearchResultsLV, SECTION_WIDGET_CLASS).setVariables(false, {$SimpleClaimSearchViewList})
  }
  
  function refreshVariables ($SimpleClaimSearchViewList :  gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>) : void {
    __widgetOf(this, pcf.SimpleClaimSearchResultsLV, SECTION_WIDGET_CLASS).setVariables(true, {$SimpleClaimSearchViewList})
  }
  
  
}