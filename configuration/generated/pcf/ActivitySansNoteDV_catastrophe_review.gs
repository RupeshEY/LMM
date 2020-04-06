package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/workspace/activity/ActivitySansNoteDV.catastrophe_review.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ActivitySansNoteDV_catastrophe_review extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Activity :  Activity) : void {
    __widgetOf(this, pcf.ActivitySansNoteDV_catastrophe_review, SECTION_WIDGET_CLASS).setVariables(false, {$Activity})
  }
  
  function refreshVariables ($Activity :  Activity) : void {
    __widgetOf(this, pcf.ActivitySansNoteDV_catastrophe_review, SECTION_WIDGET_CLASS).setVariables(true, {$Activity})
  }
  
  
}