package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/iso/ISOMatchReportsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ISOMatchReportsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($isoReportable :  ISOReportable) : void {
    __widgetOf(this, pcf.ISOMatchReportsLV, SECTION_WIDGET_CLASS).setVariables(false, {$isoReportable})
  }
  
  function refreshVariables ($isoReportable :  ISOReportable) : void {
    __widgetOf(this, pcf.ISOMatchReportsLV, SECTION_WIDGET_CLASS).setVariables(true, {$isoReportable})
  }
  
  
}