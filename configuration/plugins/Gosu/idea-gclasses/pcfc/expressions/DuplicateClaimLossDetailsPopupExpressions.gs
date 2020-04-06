package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/DuplicateClaimLossDetailsPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DuplicateClaimLossDetailsPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/DuplicateClaimLossDetailsPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DuplicateClaimLossDetailsPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim) : int {
      return 0
    }
    
    // 'canVisit' attribute on Popup (id=DuplicateClaimLossDetailsPopup) at DuplicateClaimLossDetailsPopup.pcf: line 9, column 63
    static function canVisit_13 (claim :  Claim) : java.lang.Boolean {
      return perm.Claim.view(claim) and perm.System.viewclaimbasics
    }
    
    // 'def' attribute on PanelRef at DuplicateClaimLossDetailsPopup.pcf: line 20, column 32
    function def_onEnter_0 (def :  pcf.LossDetailsDV_Auto) : void {
      def.onEnter(claim)
    }
    
    // 'def' attribute on PanelRef at DuplicateClaimLossDetailsPopup.pcf: line 20, column 32
    function def_onEnter_10 (def :  pcf.LossDetailsDV_default) : void {
      def.onEnter(claim)
    }
    
    // 'def' attribute on PanelRef at DuplicateClaimLossDetailsPopup.pcf: line 20, column 32
    function def_onEnter_2 (def :  pcf.LossDetailsDV_Gl) : void {
      def.onEnter(claim)
    }
    
    // 'def' attribute on PanelRef at DuplicateClaimLossDetailsPopup.pcf: line 20, column 32
    function def_onEnter_4 (def :  pcf.LossDetailsDV_Pr) : void {
      def.onEnter(claim)
    }
    
    // 'def' attribute on PanelRef at DuplicateClaimLossDetailsPopup.pcf: line 20, column 32
    function def_onEnter_6 (def :  pcf.LossDetailsDV_Trav) : void {
      def.onEnter(claim)
    }
    
    // 'def' attribute on PanelRef at DuplicateClaimLossDetailsPopup.pcf: line 20, column 32
    function def_onEnter_8 (def :  pcf.LossDetailsDV_Wc) : void {
      def.onEnter(claim)
    }
    
    // 'def' attribute on PanelRef at DuplicateClaimLossDetailsPopup.pcf: line 20, column 32
    function def_refreshVariables_1 (def :  pcf.LossDetailsDV_Auto) : void {
      def.refreshVariables(claim)
    }
    
    // 'def' attribute on PanelRef at DuplicateClaimLossDetailsPopup.pcf: line 20, column 32
    function def_refreshVariables_11 (def :  pcf.LossDetailsDV_default) : void {
      def.refreshVariables(claim)
    }
    
    // 'def' attribute on PanelRef at DuplicateClaimLossDetailsPopup.pcf: line 20, column 32
    function def_refreshVariables_3 (def :  pcf.LossDetailsDV_Gl) : void {
      def.refreshVariables(claim)
    }
    
    // 'def' attribute on PanelRef at DuplicateClaimLossDetailsPopup.pcf: line 20, column 32
    function def_refreshVariables_5 (def :  pcf.LossDetailsDV_Pr) : void {
      def.refreshVariables(claim)
    }
    
    // 'def' attribute on PanelRef at DuplicateClaimLossDetailsPopup.pcf: line 20, column 32
    function def_refreshVariables_7 (def :  pcf.LossDetailsDV_Trav) : void {
      def.refreshVariables(claim)
    }
    
    // 'def' attribute on PanelRef at DuplicateClaimLossDetailsPopup.pcf: line 20, column 32
    function def_refreshVariables_9 (def :  pcf.LossDetailsDV_Wc) : void {
      def.refreshVariables(claim)
    }
    
    // 'mode' attribute on PanelRef at DuplicateClaimLossDetailsPopup.pcf: line 20, column 32
    function mode_12 () : java.lang.Object {
      return claim.LossType
    }
    
    override property get CurrentLocation () : pcf.DuplicateClaimLossDetailsPopup {
      return super.CurrentLocation as pcf.DuplicateClaimLossDetailsPopup
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    
  }
  
  
}