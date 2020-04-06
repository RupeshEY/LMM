package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/desktop/exposures/DesktopExposuresLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class DesktopExposuresLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ExposureDesktopViewList :  gw.api.database.IQueryBeanResult<ExposureDesktopView>, $User :  User) : void {
    __widgetOf(this, pcf.DesktopExposuresLV, SECTION_WIDGET_CLASS).setVariables(false, {$ExposureDesktopViewList, $User})
  }
  
  function refreshVariables ($ExposureDesktopViewList :  gw.api.database.IQueryBeanResult<ExposureDesktopView>, $User :  User) : void {
    __widgetOf(this, pcf.DesktopExposuresLV, SECTION_WIDGET_CLASS).setVariables(true, {$ExposureDesktopViewList, $User})
  }
  
  
}