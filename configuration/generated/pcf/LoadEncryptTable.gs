package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/LoadEncryptTable.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class LoadEncryptTable extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($PageHelper :  gw.api.tools.LoadHistoryHelper, $History :  LoadCommand) : void {
    __widgetOf(this, pcf.LoadEncryptTable, SECTION_WIDGET_CLASS).setVariables(false, {$PageHelper, $History})
  }
  
  function refreshVariables ($PageHelper :  gw.api.tools.LoadHistoryHelper, $History :  LoadCommand) : void {
    __widgetOf(this, pcf.LoadEncryptTable, SECTION_WIDGET_CLASS).setVariables(true, {$PageHelper, $History})
  }
  
  
}