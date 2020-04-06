package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/iso/ISOMatchReportDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ISOMatchReportDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ISOMatchReport :  ISOMatchReport) : void {
    __widgetOf(this, pcf.ISOMatchReportDV, SECTION_WIDGET_CLASS).setVariables(false, {$ISOMatchReport})
  }
  
  function refreshVariables ($ISOMatchReport :  ISOMatchReport) : void {
    __widgetOf(this, pcf.ISOMatchReportDV, SECTION_WIDGET_CLASS).setVariables(true, {$ISOMatchReport})
  }
  
  
}