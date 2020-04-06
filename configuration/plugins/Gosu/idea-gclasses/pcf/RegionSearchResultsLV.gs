package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/regionsearch/RegionSearchResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class RegionSearchResultsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($SearchResult :  gw.api.database.IQueryBeanResult<Region>, $EnablePick :  boolean, $EnableCheckbox :  boolean) : void {
    __widgetOf(this, pcf.RegionSearchResultsLV, SECTION_WIDGET_CLASS).setVariables(false, {$SearchResult, $EnablePick, $EnableCheckbox})
  }
  
  function refreshVariables ($SearchResult :  gw.api.database.IQueryBeanResult<Region>, $EnablePick :  boolean, $EnableCheckbox :  boolean) : void {
    __widgetOf(this, pcf.RegionSearchResultsLV, SECTION_WIDGET_CLASS).setVariables(true, {$SearchResult, $EnablePick, $EnableCheckbox})
  }
  
  
}