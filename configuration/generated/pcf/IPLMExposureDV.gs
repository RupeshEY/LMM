package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/IPLMExposureDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class IPLMExposureDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($exposure :  Exposure) : void {
    __widgetOf(this, pcf.IPLMExposureDV, SECTION_WIDGET_CLASS).setVariables(false, {$exposure})
  }
  
  function refreshVariables ($exposure :  Exposure) : void {
    __widgetOf(this, pcf.IPLMExposureDV, SECTION_WIDGET_CLASS).setVariables(true, {$exposure})
  }
  
  
}