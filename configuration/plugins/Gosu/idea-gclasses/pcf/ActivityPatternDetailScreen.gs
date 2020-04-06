package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/activitypatterns/ActivityPatternDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ActivityPatternDetailScreen extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ActivityPattern :  ActivityPattern) : void {
    __widgetOf(this, pcf.ActivityPatternDetailScreen, SECTION_WIDGET_CLASS).setVariables(false, {$ActivityPattern})
  }
  
  function refreshVariables ($ActivityPattern :  ActivityPattern) : void {
    __widgetOf(this, pcf.ActivityPatternDetailScreen, SECTION_WIDGET_CLASS).setVariables(true, {$ActivityPattern})
  }
  
  
}