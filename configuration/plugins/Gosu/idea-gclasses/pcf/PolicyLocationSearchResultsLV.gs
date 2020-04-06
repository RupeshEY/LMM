package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/claims/PolicyLocationSearchResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class PolicyLocationSearchResultsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($PolicyLocationSearchList :  List<gw.api.heatmap.CatastropheSearchCriteria.PolicyLocationSearchResult>, $PolicyEffectiveDate :  java.util.Date) : void {
    __widgetOf(this, pcf.PolicyLocationSearchResultsLV, SECTION_WIDGET_CLASS).setVariables(false, {$PolicyLocationSearchList, $PolicyEffectiveDate})
  }
  
  function refreshVariables ($PolicyLocationSearchList :  List<gw.api.heatmap.CatastropheSearchCriteria.PolicyLocationSearchResult>, $PolicyEffectiveDate :  java.util.Date) : void {
    __widgetOf(this, pcf.PolicyLocationSearchResultsLV, SECTION_WIDGET_CLASS).setVariables(true, {$PolicyLocationSearchList, $PolicyEffectiveDate})
  }
  
  
}