package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/planofaction/ClaimEvaluationDetailsDV.Pr.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimEvaluationDetailsDV_PrExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/planofaction/ClaimEvaluationDetailsDV.Pr.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimEvaluationDetailsDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ClaimEvaluationDetailsDV.Pr.pcf: line 17, column 52
    function def_onEnter_0 (def :  pcf.ClaimEvaluationDetailDV) : void {
      def.onEnter(Evaluation)
    }
    
    // 'def' attribute on PanelRef at ClaimEvaluationDetailsDV.Pr.pcf: line 17, column 52
    function def_refreshVariables_1 (def :  pcf.ClaimEvaluationDetailDV) : void {
      def.refreshVariables(Evaluation)
    }
    
    property get Evaluation () : Evaluation {
      return getRequireValue("Evaluation", 0) as Evaluation
    }
    
    property set Evaluation ($arg :  Evaluation) {
      setRequireValue("Evaluation", 0, $arg)
    }
    
    
  }
  
  
}