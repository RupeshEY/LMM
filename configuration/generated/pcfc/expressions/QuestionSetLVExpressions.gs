package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/question/QuestionSetLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class QuestionSetLVExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/question/QuestionSetLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends QuestionSetLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on RowSetRef at QuestionSetLV.pcf: line 21, column 33
    function def_onEnter_0 (def :  pcf.QuestionRowSet_BooleanCheckbox) : void {
      def.onEnter(Question, AnswerSetContainer);
    }
    
    // 'def' attribute on RowSetRef at QuestionSetLV.pcf: line 21, column 33
    function def_onEnter_10 (def :  pcf.QuestionRowSet_IntegerField) : void {
      def.onEnter(Question, AnswerSetContainer);
    }
    
    // 'def' attribute on RowSetRef at QuestionSetLV.pcf: line 21, column 33
    function def_onEnter_12 (def :  pcf.QuestionRowSet_StringField) : void {
      def.onEnter(Question, AnswerSetContainer);
    }
    
    // 'def' attribute on RowSetRef at QuestionSetLV.pcf: line 21, column 33
    function def_onEnter_14 (def :  pcf.QuestionRowSet_StringTextArea) : void {
      def.onEnter(Question, AnswerSetContainer);
    }
    
    // 'def' attribute on RowSetRef at QuestionSetLV.pcf: line 21, column 33
    function def_onEnter_2 (def :  pcf.QuestionRowSet_BooleanSelect) : void {
      def.onEnter(Question, AnswerSetContainer);
    }
    
    // 'def' attribute on RowSetRef at QuestionSetLV.pcf: line 21, column 33
    function def_onEnter_4 (def :  pcf.QuestionRowSet_ChoiceRadio) : void {
      def.onEnter(Question, AnswerSetContainer);
    }
    
    // 'def' attribute on RowSetRef at QuestionSetLV.pcf: line 21, column 33
    function def_onEnter_6 (def :  pcf.QuestionRowSet_ChoiceSelect) : void {
      def.onEnter(Question, AnswerSetContainer);
    }
    
    // 'def' attribute on RowSetRef at QuestionSetLV.pcf: line 21, column 33
    function def_onEnter_8 (def :  pcf.QuestionRowSet_DateField) : void {
      def.onEnter(Question, AnswerSetContainer);
    }
    
    // 'def' attribute on RowSetRef at QuestionSetLV.pcf: line 21, column 33
    function def_refreshVariables_1 (def :  pcf.QuestionRowSet_BooleanCheckbox) : void {
      def.refreshVariables(Question, AnswerSetContainer);
    }
    
    // 'def' attribute on RowSetRef at QuestionSetLV.pcf: line 21, column 33
    function def_refreshVariables_11 (def :  pcf.QuestionRowSet_IntegerField) : void {
      def.refreshVariables(Question, AnswerSetContainer);
    }
    
    // 'def' attribute on RowSetRef at QuestionSetLV.pcf: line 21, column 33
    function def_refreshVariables_13 (def :  pcf.QuestionRowSet_StringField) : void {
      def.refreshVariables(Question, AnswerSetContainer);
    }
    
    // 'def' attribute on RowSetRef at QuestionSetLV.pcf: line 21, column 33
    function def_refreshVariables_15 (def :  pcf.QuestionRowSet_StringTextArea) : void {
      def.refreshVariables(Question, AnswerSetContainer);
    }
    
    // 'def' attribute on RowSetRef at QuestionSetLV.pcf: line 21, column 33
    function def_refreshVariables_3 (def :  pcf.QuestionRowSet_BooleanSelect) : void {
      def.refreshVariables(Question, AnswerSetContainer);
    }
    
    // 'def' attribute on RowSetRef at QuestionSetLV.pcf: line 21, column 33
    function def_refreshVariables_5 (def :  pcf.QuestionRowSet_ChoiceRadio) : void {
      def.refreshVariables(Question, AnswerSetContainer);
    }
    
    // 'def' attribute on RowSetRef at QuestionSetLV.pcf: line 21, column 33
    function def_refreshVariables_7 (def :  pcf.QuestionRowSet_ChoiceSelect) : void {
      def.refreshVariables(Question, AnswerSetContainer);
    }
    
    // 'def' attribute on RowSetRef at QuestionSetLV.pcf: line 21, column 33
    function def_refreshVariables_9 (def :  pcf.QuestionRowSet_DateField) : void {
      def.refreshVariables(Question, AnswerSetContainer);
    }
    
    // 'mode' attribute on RowSetRef at QuestionSetLV.pcf: line 21, column 33
    function mode_16 () : java.lang.Object {
      return Question.Format
    }
    
    property get Question () : entity.Question {
      return getIteratedValue(1) as entity.Question
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/question/QuestionSetLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class QuestionSetLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at QuestionSetLV.pcf: line 18, column 37
    function value_17 () : entity.Question[] {
      return AnswerSetContainer.getQuestions(QuestionSet)
    }
    
    property get AnswerSetContainer () : gw.api.question.AnswerSetContainer {
      return getRequireValue("AnswerSetContainer", 0) as gw.api.question.AnswerSetContainer
    }
    
    property set AnswerSetContainer ($arg :  gw.api.question.AnswerSetContainer) {
      setRequireValue("AnswerSetContainer", 0, $arg)
    }
    
    property get QuestionSet () : QuestionSet {
      return getRequireValue("QuestionSet", 0) as QuestionSet
    }
    
    property set QuestionSet ($arg :  QuestionSet) {
      setRequireValue("QuestionSet", 0, $arg)
    }
    
    
  }
  
  
}