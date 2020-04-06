package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/scriptparameters/ScriptParameterDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ScriptParameterDetailScreen extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ScriptParameter :  entity.ScriptParameter) : void {
    __widgetOf(this, pcf.ScriptParameterDetailScreen, SECTION_WIDGET_CLASS).setVariables(false, {$ScriptParameter})
  }
  
  function refreshVariables ($ScriptParameter :  entity.ScriptParameter) : void {
    __widgetOf(this, pcf.ScriptParameterDetailScreen, SECTION_WIDGET_CLASS).setVariables(true, {$ScriptParameter})
  }
  
  
}