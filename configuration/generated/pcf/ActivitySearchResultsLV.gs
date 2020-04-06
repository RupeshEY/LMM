package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/activities/ActivitySearchResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ActivitySearchResultsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ActivitySearchViewList :  gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>) : void {
    __widgetOf(this, pcf.ActivitySearchResultsLV, SECTION_WIDGET_CLASS).setVariables(false, {$ActivitySearchViewList})
  }
  
  function refreshVariables ($ActivitySearchViewList :  gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>) : void {
    __widgetOf(this, pcf.ActivitySearchResultsLV, SECTION_WIDGET_CLASS).setVariables(true, {$ActivitySearchViewList})
  }
  
  
}