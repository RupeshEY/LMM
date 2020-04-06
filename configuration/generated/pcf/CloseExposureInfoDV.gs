package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/CloseExposureInfoDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class CloseExposureInfoDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($CloseExposureInfo :  CloseExposureInfo) : void {
    __widgetOf(this, pcf.CloseExposureInfoDV, SECTION_WIDGET_CLASS).setVariables(false, {$CloseExposureInfo})
  }
  
  function refreshVariables ($CloseExposureInfo :  CloseExposureInfo) : void {
    __widgetOf(this, pcf.CloseExposureInfoDV, SECTION_WIDGET_CLASS).setVariables(true, {$CloseExposureInfo})
  }
  
  
}