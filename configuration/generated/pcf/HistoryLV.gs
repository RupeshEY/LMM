package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/history/HistoryLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class HistoryLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($HistoryList :  gw.api.database.IQueryBeanResult<History>) : void {
    __widgetOf(this, pcf.HistoryLV, SECTION_WIDGET_CLASS).setVariables(false, {$HistoryList})
  }
  
  function refreshVariables ($HistoryList :  gw.api.database.IQueryBeanResult<History>) : void {
    __widgetOf(this, pcf.HistoryLV, SECTION_WIDGET_CLASS).setVariables(true, {$HistoryList})
  }
  
  
}