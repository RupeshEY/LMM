package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newother/NewEvaluation.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewEvaluationExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newother/NewEvaluation.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewEvaluationExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim) : int {
      return 0
    }
    
    // 'afterCancel' attribute on Page (id=NewEvaluation) at NewEvaluation.pcf: line 13, column 89
    function afterCancel_3 () : void {
      ClaimEvaluationForward.go(claim)
    }
    
    // 'afterCancel' attribute on Page (id=NewEvaluation) at NewEvaluation.pcf: line 13, column 89
    function afterCancel_dest_4 () : pcf.api.Destination {
      return pcf.ClaimEvaluationForward.createDestination(claim)
    }
    
    // 'afterCommit' attribute on Page (id=NewEvaluation) at NewEvaluation.pcf: line 13, column 89
    function afterCommit_5 (TopLocation :  pcf.api.Location) : void {
      ClaimEvaluationForward.go(claim)
    }
    
    // 'canVisit' attribute on Page (id=NewEvaluation) at NewEvaluation.pcf: line 13, column 89
    static function canVisit_6 (claim :  Claim) : java.lang.Boolean {
      return perm.Claim.createevaluation(claim)
    }
    
    // 'def' attribute on PanelRef at NewEvaluation.pcf: line 27, column 43
    function def_onEnter_1 (def :  pcf.NewEvaluationDV) : void {
      def.onEnter(Evaluation)
    }
    
    // 'def' attribute on PanelRef at NewEvaluation.pcf: line 27, column 43
    function def_refreshVariables_2 (def :  pcf.NewEvaluationDV) : void {
      def.refreshVariables(Evaluation)
    }
    
    // 'initialValue' attribute on Variable at NewEvaluation.pcf: line 22, column 26
    function initialValue_0 () : Evaluation {
      return claim.newEvaluation()
    }
    
    // 'parent' attribute on Page (id=NewEvaluation) at NewEvaluation.pcf: line 13, column 89
    static function parent_7 (claim :  Claim) : pcf.api.Destination {
      return pcf.Claim.createDestination(claim)
    }
    
    override property get CurrentLocation () : pcf.NewEvaluation {
      return super.CurrentLocation as pcf.NewEvaluation
    }
    
    property get Evaluation () : Evaluation {
      return getVariableValue("Evaluation", 0) as Evaluation
    }
    
    property set Evaluation ($arg :  Evaluation) {
      setVariableValue("Evaluation", 0, $arg)
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    
  }
  
  
}