package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/workspace/activity/ActivityDV.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ActivityDV_default extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Activity :  Activity) : void {
    __widgetOf(this, pcf.ActivityDV_default, SECTION_WIDGET_CLASS).setVariables(false, {$Activity})
  }
  
  function refreshVariables ($Activity :  Activity) : void {
    __widgetOf(this, pcf.ActivityDV_default, SECTION_WIDGET_CLASS).setVariables(true, {$Activity})
  }
  
  
}