package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/scriptparameters/ScriptParametersLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ScriptParametersLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ScriptParameterList :  com.guidewire.pl.system.gosu.entity.ScriptParameterPack[]) : void {
    __widgetOf(this, pcf.ScriptParametersLV, SECTION_WIDGET_CLASS).setVariables(false, {$ScriptParameterList})
  }
  
  function refreshVariables ($ScriptParameterList :  com.guidewire.pl.system.gosu.entity.ScriptParameterPack[]) : void {
    __widgetOf(this, pcf.ScriptParametersLV, SECTION_WIDGET_CLASS).setVariables(true, {$ScriptParameterList})
  }
  
  
}