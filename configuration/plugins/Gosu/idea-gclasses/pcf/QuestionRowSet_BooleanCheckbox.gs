package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/question/QuestionRowSet.BooleanCheckbox.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class QuestionRowSet_BooleanCheckbox extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Question :  Question, $AnswerSetContainer :  gw.api.question.AnswerSetContainer) : void {
    __widgetOf(this, pcf.QuestionRowSet_BooleanCheckbox, SECTION_WIDGET_CLASS).setVariables(false, {$Question, $AnswerSetContainer})
  }
  
  function refreshVariables ($Question :  Question, $AnswerSetContainer :  gw.api.question.AnswerSetContainer) : void {
    __widgetOf(this, pcf.QuestionRowSet_BooleanCheckbox, SECTION_WIDGET_CLASS).setVariables(true, {$Question, $AnswerSetContainer})
  }
  
  
}