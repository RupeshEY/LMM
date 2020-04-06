package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/planofaction/ClaimEvaluationPrintDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimEvaluationPrintDetailExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/planofaction/ClaimEvaluationPrintDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimEvaluationPrintDetailExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Evaluation :  Evaluation) : int {
      return 0
    }
    
    // 'def' attribute on PanelRef at ClaimEvaluationPrintDetail.pcf: line 22, column 32
    function def_onEnter_1 (def :  pcf.ClaimEvaluationDetailsDV_Auto) : void {
      def.onEnter(Evaluation)
    }
    
    // 'def' attribute on PanelRef at ClaimEvaluationPrintDetail.pcf: line 22, column 32
    function def_onEnter_3 (def :  pcf.ClaimEvaluationDetailsDV_Gl) : void {
      def.onEnter(Evaluation)
    }
    
    // 'def' attribute on PanelRef at ClaimEvaluationPrintDetail.pcf: line 22, column 32
    function def_onEnter_5 (def :  pcf.ClaimEvaluationDetailsDV_Pr) : void {
      def.onEnter(Evaluation)
    }
    
    // 'def' attribute on PanelRef at ClaimEvaluationPrintDetail.pcf: line 22, column 32
    function def_onEnter_7 (def :  pcf.ClaimEvaluationDetailsDV_Trav) : void {
      def.onEnter(Evaluation)
    }
    
    // 'def' attribute on PanelRef at ClaimEvaluationPrintDetail.pcf: line 22, column 32
    function def_onEnter_9 (def :  pcf.ClaimEvaluationDetailsDV_Wc) : void {
      def.onEnter(Evaluation)
    }
    
    // 'def' attribute on PanelRef at ClaimEvaluationPrintDetail.pcf: line 22, column 32
    function def_refreshVariables_10 (def :  pcf.ClaimEvaluationDetailsDV_Wc) : void {
      def.refreshVariables(Evaluation)
    }
    
    // 'def' attribute on PanelRef at ClaimEvaluationPrintDetail.pcf: line 22, column 32
    function def_refreshVariables_2 (def :  pcf.ClaimEvaluationDetailsDV_Auto) : void {
      def.refreshVariables(Evaluation)
    }
    
    // 'def' attribute on PanelRef at ClaimEvaluationPrintDetail.pcf: line 22, column 32
    function def_refreshVariables_4 (def :  pcf.ClaimEvaluationDetailsDV_Gl) : void {
      def.refreshVariables(Evaluation)
    }
    
    // 'def' attribute on PanelRef at ClaimEvaluationPrintDetail.pcf: line 22, column 32
    function def_refreshVariables_6 (def :  pcf.ClaimEvaluationDetailsDV_Pr) : void {
      def.refreshVariables(Evaluation)
    }
    
    // 'def' attribute on PanelRef at ClaimEvaluationPrintDetail.pcf: line 22, column 32
    function def_refreshVariables_8 (def :  pcf.ClaimEvaluationDetailsDV_Trav) : void {
      def.refreshVariables(Evaluation)
    }
    
    // 'initialValue' attribute on Variable at ClaimEvaluationPrintDetail.pcf: line 14, column 21
    function initialValue_0 () : Claim {
      return Evaluation.Claim
    }
    
    // 'mode' attribute on PanelRef at ClaimEvaluationPrintDetail.pcf: line 22, column 32
    function mode_11 () : java.lang.Object {
      return claim.LossType
    }
    
    // 'parent' attribute on Page (id=ClaimEvaluationPrintDetail) at ClaimEvaluationPrintDetail.pcf: line 8, column 75
    static function parent_12 (Evaluation :  Evaluation) : pcf.api.Destination {
      return pcf.ClaimPrintout.createDestination(Evaluation.Claim)
    }
    
    override property get CurrentLocation () : pcf.ClaimEvaluationPrintDetail {
      return super.CurrentLocation as pcf.ClaimEvaluationPrintDetail
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