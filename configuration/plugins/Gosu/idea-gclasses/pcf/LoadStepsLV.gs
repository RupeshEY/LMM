package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/LoadStepsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class LoadStepsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($PageHelper :  gw.api.tools.LoadHistoryHelper, $History :  LoadCommand, $DispSteps :  gw.api.tools.LoadStepDisplayable[], $ShowLinksAndCount :  boolean) : void {
    __widgetOf(this, pcf.LoadStepsLV, SECTION_WIDGET_CLASS).setVariables(false, {$PageHelper, $History, $DispSteps, $ShowLinksAndCount})
  }
  
  function refreshVariables ($PageHelper :  gw.api.tools.LoadHistoryHelper, $History :  LoadCommand, $DispSteps :  gw.api.tools.LoadStepDisplayable[], $ShowLinksAndCount :  boolean) : void {
    __widgetOf(this, pcf.LoadStepsLV, SECTION_WIDGET_CLASS).setVariables(true, {$PageHelper, $History, $DispSteps, $ShowLinksAndCount})
  }
  
  
}