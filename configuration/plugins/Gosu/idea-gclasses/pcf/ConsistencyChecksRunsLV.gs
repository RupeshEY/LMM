package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/ConsistencyChecksRunsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ConsistencyChecksRunsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($PageHelper :  gw.api.tools.ConsistencyChecksRunsPageHelper) : void {
    __widgetOf(this, pcf.ConsistencyChecksRunsLV, SECTION_WIDGET_CLASS).setVariables(false, {$PageHelper})
  }
  
  function refreshVariables ($PageHelper :  gw.api.tools.ConsistencyChecksRunsPageHelper) : void {
    __widgetOf(this, pcf.ConsistencyChecksRunsLV, SECTION_WIDGET_CLASS).setVariables(true, {$PageHelper})
  }
  
  
}