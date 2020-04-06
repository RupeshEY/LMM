package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/activity/ActivityDocumentInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ActivityDocumentInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Activity :  Activity) : void {
    __widgetOf(this, pcf.ActivityDocumentInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$Activity})
  }
  
  function refreshVariables ($Activity :  Activity) : void {
    __widgetOf(this, pcf.ActivityDocumentInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$Activity})
  }
  
  
}