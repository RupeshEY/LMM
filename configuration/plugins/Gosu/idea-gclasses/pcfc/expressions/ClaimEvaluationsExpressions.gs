package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/planofaction/ClaimEvaluations.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimEvaluationsExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/planofaction/ClaimEvaluations.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimEvaluationsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=CE_Add) at ClaimEvaluations.pcf: line 24, column 57
    function action_1 () : void {
      NewEvaluation.go(claim)
    }
    
    // 'action' attribute on ToolbarButton (id=CE_Add) at ClaimEvaluations.pcf: line 24, column 57
    function action_dest_2 () : pcf.api.Destination {
      return pcf.NewEvaluation.createDestination(claim)
    }
    
    // 'canVisit' attribute on Page (id=ClaimEvaluations) at ClaimEvaluations.pcf: line 9, column 75
    static function canVisit_20 (claim :  Claim) : java.lang.Boolean {
      return perm.Claim.view(claim) and perm.Evaluation.view(claim) and perm.System.viewclaimevals
    }
    
    // Page (id=ClaimEvaluations) at ClaimEvaluations.pcf: line 9, column 75
    static function parent_21 (claim :  Claim) : pcf.api.Destination {
      return pcf.ClaimPlanOfActionGroup.createDestination(claim)
    }
    
    // 'visible' attribute on ToolbarButton (id=CE_Add) at ClaimEvaluations.pcf: line 24, column 57
    function visible_0 () : java.lang.Boolean {
      return perm.Claim.createevaluation(claim)
    }
    
    // 'removeVisible' attribute on IteratorButtons at ClaimEvaluations.pcf: line 29, column 56
    function visible_3 () : java.lang.Boolean {
      return perm.Evaluation.edit(claim)
    }
    
    override property get CurrentLocation () : pcf.ClaimEvaluations {
      return super.CurrentLocation as pcf.ClaimEvaluations
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/planofaction/ClaimEvaluations.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanelExpressionsImpl extends ClaimEvaluationsExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ClaimEvaluations.pcf: line 43, column 37
    function def_onEnter_10 (def :  pcf.ClaimEvaluationDetailsDV_Gl) : void {
      def.onEnter(evaluation)
    }
    
    // 'def' attribute on PanelRef at ClaimEvaluations.pcf: line 43, column 37
    function def_onEnter_12 (def :  pcf.ClaimEvaluationDetailsDV_Pr) : void {
      def.onEnter(evaluation)
    }
    
    // 'def' attribute on PanelRef at ClaimEvaluations.pcf: line 43, column 37
    function def_onEnter_14 (def :  pcf.ClaimEvaluationDetailsDV_Trav) : void {
      def.onEnter(evaluation)
    }
    
    // 'def' attribute on PanelRef at ClaimEvaluations.pcf: line 43, column 37
    function def_onEnter_16 (def :  pcf.ClaimEvaluationDetailsDV_Wc) : void {
      def.onEnter(evaluation)
    }
    
    // 'def' attribute on PanelRef at ClaimEvaluations.pcf: line 36, column 66
    function def_onEnter_4 (def :  pcf.EditableEvaluationsLV) : void {
      def.onEnter(claim.Evaluations, claim)
    }
    
    // 'def' attribute on PanelRef at ClaimEvaluations.pcf: line 43, column 37
    function def_onEnter_8 (def :  pcf.ClaimEvaluationDetailsDV_Auto) : void {
      def.onEnter(evaluation)
    }
    
    // 'def' attribute on PanelRef at ClaimEvaluations.pcf: line 43, column 37
    function def_refreshVariables_11 (def :  pcf.ClaimEvaluationDetailsDV_Gl) : void {
      def.refreshVariables(evaluation)
    }
    
    // 'def' attribute on PanelRef at ClaimEvaluations.pcf: line 43, column 37
    function def_refreshVariables_13 (def :  pcf.ClaimEvaluationDetailsDV_Pr) : void {
      def.refreshVariables(evaluation)
    }
    
    // 'def' attribute on PanelRef at ClaimEvaluations.pcf: line 43, column 37
    function def_refreshVariables_15 (def :  pcf.ClaimEvaluationDetailsDV_Trav) : void {
      def.refreshVariables(evaluation)
    }
    
    // 'def' attribute on PanelRef at ClaimEvaluations.pcf: line 43, column 37
    function def_refreshVariables_17 (def :  pcf.ClaimEvaluationDetailsDV_Wc) : void {
      def.refreshVariables(evaluation)
    }
    
    // 'def' attribute on PanelRef at ClaimEvaluations.pcf: line 36, column 66
    function def_refreshVariables_5 (def :  pcf.EditableEvaluationsLV) : void {
      def.refreshVariables(claim.Evaluations, claim)
    }
    
    // 'def' attribute on PanelRef at ClaimEvaluations.pcf: line 43, column 37
    function def_refreshVariables_9 (def :  pcf.ClaimEvaluationDetailsDV_Auto) : void {
      def.refreshVariables(evaluation)
    }
    
    // EditButtons at ClaimEvaluations.pcf: line 46, column 62
    function label_7 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'mode' attribute on PanelRef at ClaimEvaluations.pcf: line 43, column 37
    function mode_18 () : java.lang.Object {
      return claim.LossType
    }
    
    // 'title' attribute on Card (id=DetailViewTitleCard) at ClaimEvaluations.pcf: line 40, column 111
    function title_19 () : java.lang.String {
      return DisplayKey.get("Web.ClaimPlanOfAction.Evaluations.DetailViewTitle", evaluation)
    }
    
    // 'editVisible' attribute on EditButtons at ClaimEvaluations.pcf: line 46, column 62
    function visible_6 () : java.lang.Boolean {
      return perm.Evaluation.edit(claim)
    }
    
    property get evaluation () : Evaluation {
      return getCurrentSelection(1) as Evaluation
    }
    
    property set evaluation ($arg :  Evaluation) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  
}