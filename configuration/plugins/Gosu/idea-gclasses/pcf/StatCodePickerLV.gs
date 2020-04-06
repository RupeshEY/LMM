package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/policy/StatCodePickerLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class StatCodePickerLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($StatCodeList :  StatCode[]) : void {
    __widgetOf(this, pcf.StatCodePickerLV, SECTION_WIDGET_CLASS).setVariables(false, {$StatCodeList})
  }
  
  function refreshVariables ($StatCodeList :  StatCode[]) : void {
    __widgetOf(this, pcf.StatCodePickerLV, SECTION_WIDGET_CLASS).setVariables(true, {$StatCodeList})
  }
  
  
}