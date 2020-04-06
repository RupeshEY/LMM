package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/planofaction/EditableEvaluationsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableEvaluationsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($EvaluationList :  Evaluation[], $claim :  Claim) : void {
    __widgetOf(this, pcf.EditableEvaluationsLV, SECTION_WIDGET_CLASS).setVariables(false, {$EvaluationList, $claim})
  }
  
  function refreshVariables ($EvaluationList :  Evaluation[], $claim :  Claim) : void {
    __widgetOf(this, pcf.EditableEvaluationsLV, SECTION_WIDGET_CLASS).setVariables(true, {$EvaluationList, $claim})
  }
  
  
}