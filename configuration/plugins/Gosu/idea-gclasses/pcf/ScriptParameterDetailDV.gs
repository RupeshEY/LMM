package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/scriptparameters/ScriptParameterDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ScriptParameterDetailDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ScriptParameter :  ScriptParameter) : void {
    __widgetOf(this, pcf.ScriptParameterDetailDV, SECTION_WIDGET_CLASS).setVariables(false, {$ScriptParameter})
  }
  
  function refreshVariables ($ScriptParameter :  ScriptParameter) : void {
    __widgetOf(this, pcf.ScriptParameterDetailDV, SECTION_WIDGET_CLASS).setVariables(true, {$ScriptParameter})
  }
  
  
}