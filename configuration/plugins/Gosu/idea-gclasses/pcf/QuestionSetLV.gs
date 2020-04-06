package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/question/QuestionSetLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class QuestionSetLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($QuestionSet :  QuestionSet, $AnswerSetContainer :  gw.api.question.AnswerSetContainer) : void {
    __widgetOf(this, pcf.QuestionSetLV, SECTION_WIDGET_CLASS).setVariables(false, {$QuestionSet, $AnswerSetContainer})
  }
  
  function refreshVariables ($QuestionSet :  QuestionSet, $AnswerSetContainer :  gw.api.question.AnswerSetContainer) : void {
    __widgetOf(this, pcf.QuestionSetLV, SECTION_WIDGET_CLASS).setVariables(true, {$QuestionSet, $AnswerSetContainer})
  }
  
  
}