package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/iso/ISODetailsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ISODetailsDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ISOReportable :  ISOReportable) : void {
    __widgetOf(this, pcf.ISODetailsDV, SECTION_WIDGET_CLASS).setVariables(false, {$ISOReportable})
  }
  
  function refreshVariables ($ISOReportable :  ISOReportable) : void {
    __widgetOf(this, pcf.ISODetailsDV, SECTION_WIDGET_CLASS).setVariables(true, {$ISOReportable})
  }
  
  
}