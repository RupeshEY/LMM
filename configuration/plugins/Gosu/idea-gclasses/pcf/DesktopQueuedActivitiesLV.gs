package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/desktop/queues/DesktopQueuedActivitiesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class DesktopQueuedActivitiesLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ActivityDesktopViewList :  gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>) : void {
    __widgetOf(this, pcf.DesktopQueuedActivitiesLV, SECTION_WIDGET_CLASS).setVariables(false, {$ActivityDesktopViewList})
  }
  
  function refreshVariables ($ActivityDesktopViewList :  gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>) : void {
    __widgetOf(this, pcf.DesktopQueuedActivitiesLV, SECTION_WIDGET_CLASS).setVariables(true, {$ActivityDesktopViewList})
  }
  
  
}