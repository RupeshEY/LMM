package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/question/QuestionRowSet.IntegerField.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class QuestionRowSet_IntegerFieldExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/question/QuestionRowSet.IntegerField.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends QuestionRowSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=subQuestionText) at QuestionRowSet.IntegerField.pcf: line 41, column 37
    function valueRoot_15 () : java.lang.Object {
      return SubQuestion
    }
    
    // 'value' attribute on TextCell (id=subQuestionText) at QuestionRowSet.IntegerField.pcf: line 41, column 37
    function value_13 () : java.lang.String {
      return SubQuestion.Text
    }
    
    property get SubQuestion () : entity.SubQuestion {
      return getIteratedValue(1) as entity.SubQuestion
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/question/QuestionRowSet.IntegerField.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class QuestionRowSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=questionNumberAnswer) at QuestionRowSet.IntegerField.pcf: line 28, column 39
    function defaultSetter_9 (__VALUE_TO_SET :  java.lang.Object) : void {
      AnswerSetContainer.getOrCreateAnswer(Question).IntegerAnswer = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'editable' attribute on TextCell (id=questionNumberAnswer) at QuestionRowSet.IntegerField.pcf: line 28, column 39
    function editable_3 () : java.lang.Boolean {
      return !Question.isRetired()
    }
    
    // 'validationLabel' attribute on TextCell (id=questionNumberAnswer) at QuestionRowSet.IntegerField.pcf: line 28, column 39
    function label_6 () : java.lang.Object {
      return Question.Text
    }
    
    // 'required' attribute on TextCell (id=questionNumberAnswer) at QuestionRowSet.IntegerField.pcf: line 28, column 39
    function required_7 () : java.lang.Boolean {
      return Question.Required
    }
    
    // 'value' attribute on TextCell (id=questionNumberAnswer) at QuestionRowSet.IntegerField.pcf: line 28, column 39
    function valueRoot_10 () : java.lang.Object {
      return AnswerSetContainer.getOrCreateAnswer(Question)
    }
    
    // 'value' attribute on TextCell (id=questionText) at QuestionRowSet.IntegerField.pcf: line 20, column 22
    function valueRoot_2 () : java.lang.Object {
      return Question
    }
    
    // 'value' attribute on TextCell (id=questionText) at QuestionRowSet.IntegerField.pcf: line 20, column 22
    function value_0 () : java.lang.String {
      return Question.IndentedLabel
    }
    
    // 'value' attribute on RowIterator at QuestionRowSet.IntegerField.pcf: line 37, column 40
    function value_16 () : entity.SubQuestion[] {
      return Question.SubQuestions
    }
    
    // 'value' attribute on TextCell (id=questionNumberAnswer) at QuestionRowSet.IntegerField.pcf: line 28, column 39
    function value_4 () : java.lang.Integer {
      return AnswerSetContainer.getOrCreateAnswer(Question).IntegerAnswer
    }
    
    // 'visible' attribute on Row at QuestionRowSet.IntegerField.pcf: line 15, column 66
    function visible_12 () : java.lang.Boolean {
      return Question.isQuestionAvailable(AnswerSetContainer)
    }
    
    property get AnswerSetContainer () : gw.api.question.AnswerSetContainer {
      return getRequireValue("AnswerSetContainer", 0) as gw.api.question.AnswerSetContainer
    }
    
    property set AnswerSetContainer ($arg :  gw.api.question.AnswerSetContainer) {
      setRequireValue("AnswerSetContainer", 0, $arg)
    }
    
    property get Question () : Question {
      return getRequireValue("Question", 0) as Question
    }
    
    property set Question ($arg :  Question) {
      setRequireValue("Question", 0, $arg)
    }
    
    
  }
  
  
}