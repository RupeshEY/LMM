package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/workspace/activity/ActivityTrackingInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ActivityTrackingInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Activity :  Activity) : void {
    __widgetOf(this, pcf.ActivityTrackingInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$Activity})
  }
  
  function refreshVariables ($Activity :  Activity) : void {
    __widgetOf(this, pcf.ActivityTrackingInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$Activity})
  }
  
  
}