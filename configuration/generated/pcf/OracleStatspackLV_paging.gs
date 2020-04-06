package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/OracleStatspackLV.paging.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class OracleStatspackLV_paging extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($OracleStatspackInfo :  gw.api.tools.OracleStatspackHelper) : void {
    __widgetOf(this, pcf.OracleStatspackLV_paging, SECTION_WIDGET_CLASS).setVariables(false, {$OracleStatspackInfo})
  }
  
  function refreshVariables ($OracleStatspackInfo :  gw.api.tools.OracleStatspackHelper) : void {
    __widgetOf(this, pcf.OracleStatspackLV_paging, SECTION_WIDGET_CLASS).setVariables(true, {$OracleStatspackInfo})
  }
  
  
}