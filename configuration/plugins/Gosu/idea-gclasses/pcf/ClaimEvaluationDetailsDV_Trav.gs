package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/planofaction/ClaimEvaluationDetailsDV.Trav.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimEvaluationDetailsDV_Trav extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Evaluation :  Evaluation) : void {
    __widgetOf(this, pcf.ClaimEvaluationDetailsDV_Trav, SECTION_WIDGET_CLASS).setVariables(false, {$Evaluation})
  }
  
  function refreshVariables ($Evaluation :  Evaluation) : void {
    __widgetOf(this, pcf.ClaimEvaluationDetailsDV_Trav, SECTION_WIDGET_CLASS).setVariables(true, {$Evaluation})
  }
  
  
}