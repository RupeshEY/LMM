package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/LoadCallbacksLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class LoadCallbacksLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($PageHelper :  gw.api.tools.LoadHistoryHelper, $History :  LoadCommand, $LoadCallbacks :  LoadCallback[], $ShowLinksAndCounts :  boolean) : void {
    __widgetOf(this, pcf.LoadCallbacksLV, SECTION_WIDGET_CLASS).setVariables(false, {$PageHelper, $History, $LoadCallbacks, $ShowLinksAndCounts})
  }
  
  function refreshVariables ($PageHelper :  gw.api.tools.LoadHistoryHelper, $History :  LoadCommand, $LoadCallbacks :  LoadCallback[], $ShowLinksAndCounts :  boolean) : void {
    __widgetOf(this, pcf.LoadCallbacksLV, SECTION_WIDGET_CLASS).setVariables(true, {$PageHelper, $History, $LoadCallbacks, $ShowLinksAndCounts})
  }
  
  
}