package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/ReopenExposureInfoDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ReopenExposureInfoDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ReopenExposureInfo :  ReopenExposureInfo) : void {
    __widgetOf(this, pcf.ReopenExposureInfoDV, SECTION_WIDGET_CLASS).setVariables(false, {$ReopenExposureInfo})
  }
  
  function refreshVariables ($ReopenExposureInfo :  ReopenExposureInfo) : void {
    __widgetOf(this, pcf.ReopenExposureInfoDV, SECTION_WIDGET_CLASS).setVariables(true, {$ReopenExposureInfo})
  }
  
  
}