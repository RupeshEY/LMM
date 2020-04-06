package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/OracleOutlineLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class OracleOutlineLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($OracleOutlineInfo :  gw.api.tools.OracleOutlineHelper) : void {
    __widgetOf(this, pcf.OracleOutlineLV, SECTION_WIDGET_CLASS).setVariables(false, {$OracleOutlineInfo})
  }
  
  function refreshVariables ($OracleOutlineInfo :  gw.api.tools.OracleOutlineHelper) : void {
    __widgetOf(this, pcf.OracleOutlineLV, SECTION_WIDGET_CLASS).setVariables(true, {$OracleOutlineInfo})
  }
  
  
}