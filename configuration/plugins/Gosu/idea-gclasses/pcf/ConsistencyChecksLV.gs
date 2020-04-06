package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/ConsistencyChecksLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ConsistencyChecksLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($CCPageHelper :  gw.api.tools.ConsistencyChecksRunsPageHelper, $tableSearch :  String) : void {
    __widgetOf(this, pcf.ConsistencyChecksLV, SECTION_WIDGET_CLASS).setVariables(false, {$CCPageHelper, $tableSearch})
  }
  
  function refreshVariables ($CCPageHelper :  gw.api.tools.ConsistencyChecksRunsPageHelper, $tableSearch :  String) : void {
    __widgetOf(this, pcf.ConsistencyChecksLV, SECTION_WIDGET_CLASS).setVariables(true, {$CCPageHelper, $tableSearch})
  }
  
  
}