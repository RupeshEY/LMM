package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/question/QuestionRowSet.ChoiceSelect.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class QuestionRowSet_ChoiceSelectExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/question/QuestionRowSet.ChoiceSelect.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends QuestionRowSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=subQuestionText) at QuestionRowSet.ChoiceSelect.pcf: line 43, column 37
    function valueRoot_18 () : java.lang.Object {
      return SubQuestion
    }
    
    // 'value' attribute on TextCell (id=subQuestionText) at QuestionRowSet.ChoiceSelect.pcf: line 43, column 37
    function value_16 () : java.lang.String {
      return SubQuestion.Text
    }
    
    property get SubQuestion () : entity.SubQuestion {
      return getIteratedValue(1) as entity.SubQuestion
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/question/QuestionRowSet.ChoiceSelect.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class QuestionRowSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RangeCell (id=questionChoiceAnswer) at QuestionRowSet.ChoiceSelect.pcf: line 30, column 43
    function defaultSetter_9 (__VALUE_TO_SET :  java.lang.Object) : void {
      AnswerSetContainer.getOrCreateAnswer(Question).ChoiceAnswer = (__VALUE_TO_SET as entity.QuestionChoice)
    }
    
    // 'editable' attribute on RangeCell (id=questionChoiceAnswer) at QuestionRowSet.ChoiceSelect.pcf: line 30, column 43
    function editable_3 () : java.lang.Boolean {
      return !Question.isRetired()
    }
    
    // 'validationLabel' attribute on RangeCell (id=questionChoiceAnswer) at QuestionRowSet.ChoiceSelect.pcf: line 30, column 43
    function label_6 () : java.lang.Object {
      return Question.Text
    }
    
    // 'required' attribute on RangeCell (id=questionChoiceAnswer) at QuestionRowSet.ChoiceSelect.pcf: line 30, column 43
    function required_7 () : java.lang.Boolean {
      return Question.Required
    }
    
    // 'valueRange' attribute on RangeCell (id=questionChoiceAnswer) at QuestionRowSet.ChoiceSelect.pcf: line 30, column 43
    function valueRange_11 () : java.lang.Object {
      return Question.getQuestionChoicesAsList()
    }
    
    // 'value' attribute on RangeCell (id=questionChoiceAnswer) at QuestionRowSet.ChoiceSelect.pcf: line 30, column 43
    function valueRoot_10 () : java.lang.Object {
      return AnswerSetContainer.getOrCreateAnswer(Question)
    }
    
    // 'value' attribute on TextCell (id=questionText) at QuestionRowSet.ChoiceSelect.pcf: line 20, column 22
    function valueRoot_2 () : java.lang.Object {
      return Question
    }
    
    // 'value' attribute on TextCell (id=questionText) at QuestionRowSet.ChoiceSelect.pcf: line 20, column 22
    function value_0 () : java.lang.String {
      return Question.IndentedLabel
    }
    
    // 'value' attribute on RowIterator at QuestionRowSet.ChoiceSelect.pcf: line 39, column 40
    function value_19 () : entity.SubQuestion[] {
      return Question.SubQuestions
    }
    
    // 'value' attribute on RangeCell (id=questionChoiceAnswer) at QuestionRowSet.ChoiceSelect.pcf: line 30, column 43
    function value_4 () : entity.QuestionChoice {
      return AnswerSetContainer.getOrCreateAnswer(Question).ChoiceAnswer
    }
    
    // 'valueRange' attribute on RangeCell (id=questionChoiceAnswer) at QuestionRowSet.ChoiceSelect.pcf: line 30, column 43
    function verifyValueRangeIsAllowedType_12 ($$arg :  entity.QuestionChoice[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=questionChoiceAnswer) at QuestionRowSet.ChoiceSelect.pcf: line 30, column 43
    function verifyValueRangeIsAllowedType_12 ($$arg :  gw.api.database.IQueryBeanResult<entity.QuestionChoice>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=questionChoiceAnswer) at QuestionRowSet.ChoiceSelect.pcf: line 30, column 43
    function verifyValueRangeIsAllowedType_12 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=questionChoiceAnswer) at QuestionRowSet.ChoiceSelect.pcf: line 30, column 43
    function verifyValueRange_13 () : void {
      var __valueRangeArg = Question.getQuestionChoicesAsList()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_12(__valueRangeArg)
    }
    
    // 'visible' attribute on Row at QuestionRowSet.ChoiceSelect.pcf: line 15, column 66
    function visible_15 () : java.lang.Boolean {
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