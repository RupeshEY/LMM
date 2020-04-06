package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/DataDistsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class DataDistsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($PageHelper :  gw.api.tools.DataDistDVHelper) : void {
    __widgetOf(this, pcf.DataDistsLV, SECTION_WIDGET_CLASS).setVariables(false, {$PageHelper})
  }
  
  function refreshVariables ($PageHelper :  gw.api.tools.DataDistDVHelper) : void {
    __widgetOf(this, pcf.DataDistsLV, SECTION_WIDGET_CLASS).setVariables(true, {$PageHelper})
  }
  
  
}