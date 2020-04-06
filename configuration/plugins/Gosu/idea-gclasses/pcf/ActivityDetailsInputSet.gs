package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/workspace/activity/ActivityDetailsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ActivityDetailsInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Activity :  Activity) : void {
    __widgetOf(this, pcf.ActivityDetailsInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$Activity})
  }
  
  function refreshVariables ($Activity :  Activity) : void {
    __widgetOf(this, pcf.ActivityDetailsInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$Activity})
  }
  
  
}