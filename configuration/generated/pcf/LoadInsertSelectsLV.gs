package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/LoadInsertSelectsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class LoadInsertSelectsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($PageHelper :  gw.api.tools.LoadHistoryHelper, $InsertSelects :  gw.api.database.IQueryBeanResult<LoadInsertSelect>) : void {
    __widgetOf(this, pcf.LoadInsertSelectsLV, SECTION_WIDGET_CLASS).setVariables(false, {$PageHelper, $InsertSelects})
  }
  
  function refreshVariables ($PageHelper :  gw.api.tools.LoadHistoryHelper, $InsertSelects :  gw.api.database.IQueryBeanResult<LoadInsertSelect>) : void {
    __widgetOf(this, pcf.LoadInsertSelectsLV, SECTION_WIDGET_CLASS).setVariables(true, {$PageHelper, $InsertSelects})
  }
  
  
}