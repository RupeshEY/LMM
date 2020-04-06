package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/claims/CatastropheHeatMapFilterPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class CatastropheHeatMapFilterPanelSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($criteria :  gw.api.heatmap.CatastropheSearchCriteria, $allowCatastropheSelection :  boolean) : void {
    __widgetOf(this, pcf.CatastropheHeatMapFilterPanelSet, SECTION_WIDGET_CLASS).setVariables(false, {$criteria, $allowCatastropheSelection})
  }
  
  function refreshVariables ($criteria :  gw.api.heatmap.CatastropheSearchCriteria, $allowCatastropheSelection :  boolean) : void {
    __widgetOf(this, pcf.CatastropheHeatMapFilterPanelSet, SECTION_WIDGET_CLASS).setVariables(true, {$criteria, $allowCatastropheSelection})
  }
  
  
}