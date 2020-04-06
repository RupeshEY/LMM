package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/workspace/activity/ActivityDetailScreen.readonly.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ActivityDetailScreen_readonly extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Activity :  Activity, $activityDetailHelper :  gw.api.activity.ActivityDetailHelper, $hasParent :  boolean) : void {
    __widgetOf(this, pcf.ActivityDetailScreen_readonly, SECTION_WIDGET_CLASS).setVariables(false, {$Activity, $activityDetailHelper, $hasParent})
  }
  
  function refreshVariables ($Activity :  Activity, $activityDetailHelper :  gw.api.activity.ActivityDetailHelper, $hasParent :  boolean) : void {
    __widgetOf(this, pcf.ActivityDetailScreen_readonly, SECTION_WIDGET_CLASS).setVariables(true, {$Activity, $activityDetailHelper, $hasParent})
  }
  
  
}