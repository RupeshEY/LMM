package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/shared/exposures/ExposureDetailInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ExposureDetailInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Exposure :  Exposure, $isNewExposure :  boolean) : void {
    __widgetOf(this, pcf.ExposureDetailInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$Exposure, $isNewExposure})
  }
  
  function refreshVariables ($Exposure :  Exposure, $isNewExposure :  boolean) : void {
    __widgetOf(this, pcf.ExposureDetailInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$Exposure, $isNewExposure})
  }
  
  
}