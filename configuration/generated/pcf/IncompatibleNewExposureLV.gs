package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/coverage/IncompatibleNewExposureLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class IncompatibleNewExposureLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($IncompatibleNewExposureList :  gw.api.database.IQueryBeanResult<IncompatibleNewExposure>) : void {
    __widgetOf(this, pcf.IncompatibleNewExposureLV, SECTION_WIDGET_CLASS).setVariables(false, {$IncompatibleNewExposureList})
  }
  
  function refreshVariables ($IncompatibleNewExposureList :  gw.api.database.IQueryBeanResult<IncompatibleNewExposure>) : void {
    __widgetOf(this, pcf.IncompatibleNewExposureLV, SECTION_WIDGET_CLASS).setVariables(true, {$IncompatibleNewExposureList})
  }
  
  
}