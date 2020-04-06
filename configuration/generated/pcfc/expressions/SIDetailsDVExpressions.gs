package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/sidetails/SIDetailsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class SIDetailsDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/sidetails/SIDetailsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends SIDetailsDVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on ListViewInput (id=SIUQuestionSetListViewInput) at SIDetailsDV.pcf: line 42, column 33
    function def_onEnter_8 (def :  pcf.QuestionSetLV) : void {
      def.onEnter(QuestionSet, Claim)
    }
    
    // 'def' attribute on ListViewInput (id=SIUQuestionSetListViewInput) at SIDetailsDV.pcf: line 42, column 33
    function def_refreshVariables_9 (def :  pcf.QuestionSetLV) : void {
      def.refreshVariables(QuestionSet, Claim)
    }
    
    // 'editable' attribute on ListViewInput (id=SIUQuestionSetListViewInput) at SIDetailsDV.pcf: line 42, column 33
    function editable_7 () : java.lang.Boolean {
      return (Claim.State != ClaimState.TC_CLOSED)
    }
    
    // 'label' attribute on TextInput (id=SIUQuestionSetName) at SIDetailsDV.pcf: line 37, column 37
    function label_5 () : java.lang.Object {
      return QuestionSet.Name
    }
    
    // 'visible' attribute on InputSet (id=SIUQuestionSetInputSet) at SIDetailsDV.pcf: line 31, column 65
    function visible_10 () : java.lang.Boolean {
      return QuestionSet.isQuestionSetAvailable(Claim)
    }
    
    property get QuestionSet () : entity.QuestionSet {
      return getIteratedValue(1) as entity.QuestionSet
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/sidetails/SIDetailsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SIDetailsDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at SIDetailsDV.pcf: line 16, column 42
    function def_onEnter_1 (def :  pcf.SItriggersInputSet) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on InputSetRef at SIDetailsDV.pcf: line 56, column 54
    function def_onEnter_15 (def :  pcf.SITotalScoreEscalationInputSet) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on InputSetRef at SIDetailsDV.pcf: line 18, column 38
    function def_onEnter_3 (def :  pcf.SIinfoInputSet) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on InputSetRef at SIDetailsDV.pcf: line 56, column 54
    function def_refreshVariables_16 (def :  pcf.SITotalScoreEscalationInputSet) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on InputSetRef at SIDetailsDV.pcf: line 16, column 42
    function def_refreshVariables_2 (def :  pcf.SItriggersInputSet) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on InputSetRef at SIDetailsDV.pcf: line 18, column 38
    function def_refreshVariables_4 (def :  pcf.SIinfoInputSet) : void {
      def.refreshVariables(Claim)
    }
    
    // 'initialValue' attribute on Variable at SIDetailsDV.pcf: line 13, column 29
    function initialValue_0 () : QuestionSet[] {
      return Claim.getQuestionSets(util.QuestionUtils.getAppropriateQuestionSet(Claim))
    }
    
    // 'value' attribute on InputIterator (id=SIUQuestionSetIterator) at SIDetailsDV.pcf: line 28, column 44
    function value_11 () : entity.QuestionSet[] {
      return QuestionSets
    }
    
    // 'value' attribute on TextInput (id=SIUQuestionSetTotalScore) at SIDetailsDV.pcf: line 52, column 42
    function value_12 () : java.lang.Integer {
      return util.QuestionUtils.getQuestionSetTotalScore(Claim, QuestionSets)
    }
    
    // 'visible' attribute on InputSet (id=SIUQuestionSets) at SIDetailsDV.pcf: line 23, column 69
    function visible_14 () : java.lang.Boolean {
      return QuestionSets != null and QuestionSets.length != 0
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get QuestionSets () : QuestionSet[] {
      return getVariableValue("QuestionSets", 0) as QuestionSet[]
    }
    
    property set QuestionSets ($arg :  QuestionSet[]) {
      setVariableValue("QuestionSets", 0, $arg)
    }
    
    
  }
  
  
}