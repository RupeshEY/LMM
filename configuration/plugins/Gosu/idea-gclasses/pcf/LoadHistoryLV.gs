package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/LoadHistoryLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class LoadHistoryLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($PageHelper :  gw.api.tools.LoadHistoryHelper, $Histories :  gw.api.database.IQueryBeanResult<LoadCommand>, $ShowButtons :  Boolean) : void {
    __widgetOf(this, pcf.LoadHistoryLV, SECTION_WIDGET_CLASS).setVariables(false, {$PageHelper, $Histories, $ShowButtons})
  }
  
  function refreshVariables ($PageHelper :  gw.api.tools.LoadHistoryHelper, $Histories :  gw.api.database.IQueryBeanResult<LoadCommand>, $ShowButtons :  Boolean) : void {
    __widgetOf(this, pcf.LoadHistoryLV, SECTION_WIDGET_CLASS).setVariables(true, {$PageHelper, $Histories, $ShowButtons})
  }
  
  
}