package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/WCExposureActivitiesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class WCExposureActivitiesLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($activityList :  gw.api.database.IQueryBeanResult<Activity>) : void {
    __widgetOf(this, pcf.WCExposureActivitiesLV, SECTION_WIDGET_CLASS).setVariables(false, {$activityList})
  }
  
  function refreshVariables ($activityList :  gw.api.database.IQueryBeanResult<Activity>) : void {
    __widgetOf(this, pcf.WCExposureActivitiesLV, SECTION_WIDGET_CLASS).setVariables(true, {$activityList})
  }
  
  
}