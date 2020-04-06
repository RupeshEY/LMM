package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/vacation/MyVacationExposuresLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class MyVacationExposuresLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ExposureVacationViewList :  gw.api.database.IQueryBeanResult<ExposureVacationView>) : void {
    __widgetOf(this, pcf.MyVacationExposuresLV, SECTION_WIDGET_CLASS).setVariables(false, {$ExposureVacationViewList})
  }
  
  function refreshVariables ($ExposureVacationViewList :  gw.api.database.IQueryBeanResult<ExposureVacationView>) : void {
    __widgetOf(this, pcf.MyVacationExposuresLV, SECTION_WIDGET_CLASS).setVariables(true, {$ExposureVacationViewList})
  }
  
  
}