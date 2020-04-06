package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/shared/ExposureWorkloadInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ExposureWorkloadInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($exposure :  Exposure) : void {
    __widgetOf(this, pcf.ExposureWorkloadInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$exposure})
  }
  
  function refreshVariables ($exposure :  Exposure) : void {
    __widgetOf(this, pcf.ExposureWorkloadInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$exposure})
  }
  
  
}