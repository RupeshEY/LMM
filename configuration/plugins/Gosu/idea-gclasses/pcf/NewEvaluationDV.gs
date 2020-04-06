package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newother/NewEvaluationDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewEvaluationDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Evaluation :  Evaluation) : void {
    __widgetOf(this, pcf.NewEvaluationDV, SECTION_WIDGET_CLASS).setVariables(false, {$Evaluation})
  }
  
  function refreshVariables ($Evaluation :  Evaluation) : void {
    __widgetOf(this, pcf.NewEvaluationDV, SECTION_WIDGET_CLASS).setVariables(true, {$Evaluation})
  }
  
  
}