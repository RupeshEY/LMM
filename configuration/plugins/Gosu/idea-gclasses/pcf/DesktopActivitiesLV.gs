package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/desktop/activities/DesktopActivitiesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class DesktopActivitiesLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ActivityDesktopViewList :  gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>) : void {
    __widgetOf(this, pcf.DesktopActivitiesLV, SECTION_WIDGET_CLASS).setVariables(false, {$ActivityDesktopViewList})
  }
  
  function refreshVariables ($ActivityDesktopViewList :  gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>) : void {
    __widgetOf(this, pcf.DesktopActivitiesLV, SECTION_WIDGET_CLASS).setVariables(true, {$ActivityDesktopViewList})
  }
  
  
}