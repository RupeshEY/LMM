package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/activities/ActivitySearchOptionalInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ActivitySearchOptionalInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ActivitySearchCriteria :  ActivitySearchCriteria) : void {
    __widgetOf(this, pcf.ActivitySearchOptionalInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$ActivitySearchCriteria})
  }
  
  function refreshVariables ($ActivitySearchCriteria :  ActivitySearchCriteria) : void {
    __widgetOf(this, pcf.ActivitySearchOptionalInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$ActivitySearchCriteria})
  }
  
  
}