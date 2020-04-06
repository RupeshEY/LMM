package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/activitypatterns/ActivityPatternsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ActivityPatternsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ActivityPatternList :  gw.api.database.IQueryBeanResult<ActivityPattern>) : void {
    __widgetOf(this, pcf.ActivityPatternsLV, SECTION_WIDGET_CLASS).setVariables(false, {$ActivityPatternList})
  }
  
  function refreshVariables ($ActivityPatternList :  gw.api.database.IQueryBeanResult<ActivityPattern>) : void {
    __widgetOf(this, pcf.ActivityPatternsLV, SECTION_WIDGET_CLASS).setVariables(true, {$ActivityPatternList})
  }
  
  
}