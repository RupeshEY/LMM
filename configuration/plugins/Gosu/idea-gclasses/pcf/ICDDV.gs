package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/icd/ICDDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ICDDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($anICD :  ICDCode, $isNew :  boolean) : void {
    __widgetOf(this, pcf.ICDDV, SECTION_WIDGET_CLASS).setVariables(false, {$anICD, $isNew})
  }
  
  function refreshVariables ($anICD :  ICDCode, $isNew :  boolean) : void {
    __widgetOf(this, pcf.ICDDV, SECTION_WIDGET_CLASS).setVariables(true, {$anICD, $isNew})
  }
  
  
}