package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/activities/ActivitySearchRequiredInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ActivitySearchRequiredInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ActivitySearchCriteria :  ActivitySearchCriteria) : void {
    __widgetOf(this, pcf.ActivitySearchRequiredInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$ActivitySearchCriteria})
  }
  
  function refreshVariables ($ActivitySearchCriteria :  ActivitySearchCriteria) : void {
    __widgetOf(this, pcf.ActivitySearchRequiredInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$ActivitySearchCriteria})
  }
  
  
}