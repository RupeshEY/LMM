package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/LossDetailsPanelSet.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class LossDetailsPanelSet_defaultExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/LossDetailsPanelSet.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LossDetailsPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at LossDetailsPanelSet.default.pcf: line 18, column 34
    function def_onEnter_0 (def :  pcf.LossDetailsDV_Auto) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on PanelRef at LossDetailsPanelSet.default.pcf: line 18, column 34
    function def_onEnter_10 (def :  pcf.LossDetailsDV_default) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on PanelRef at LossDetailsPanelSet.default.pcf: line 25, column 38
    function def_onEnter_13 (def :  pcf.ISODetailsDV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on PanelRef at LossDetailsPanelSet.default.pcf: line 18, column 34
    function def_onEnter_2 (def :  pcf.LossDetailsDV_Gl) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on PanelRef at LossDetailsPanelSet.default.pcf: line 18, column 34
    function def_onEnter_4 (def :  pcf.LossDetailsDV_Pr) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on PanelRef at LossDetailsPanelSet.default.pcf: line 18, column 34
    function def_onEnter_6 (def :  pcf.LossDetailsDV_Trav) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on PanelRef at LossDetailsPanelSet.default.pcf: line 18, column 34
    function def_onEnter_8 (def :  pcf.LossDetailsDV_Wc) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on PanelRef at LossDetailsPanelSet.default.pcf: line 18, column 34
    function def_refreshVariables_1 (def :  pcf.LossDetailsDV_Auto) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on PanelRef at LossDetailsPanelSet.default.pcf: line 18, column 34
    function def_refreshVariables_11 (def :  pcf.LossDetailsDV_default) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on PanelRef at LossDetailsPanelSet.default.pcf: line 25, column 38
    function def_refreshVariables_14 (def :  pcf.ISODetailsDV) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on PanelRef at LossDetailsPanelSet.default.pcf: line 18, column 34
    function def_refreshVariables_3 (def :  pcf.LossDetailsDV_Gl) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on PanelRef at LossDetailsPanelSet.default.pcf: line 18, column 34
    function def_refreshVariables_5 (def :  pcf.LossDetailsDV_Pr) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on PanelRef at LossDetailsPanelSet.default.pcf: line 18, column 34
    function def_refreshVariables_7 (def :  pcf.LossDetailsDV_Trav) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on PanelRef at LossDetailsPanelSet.default.pcf: line 18, column 34
    function def_refreshVariables_9 (def :  pcf.LossDetailsDV_Wc) : void {
      def.refreshVariables(Claim)
    }
    
    // 'mode' attribute on PanelRef at LossDetailsPanelSet.default.pcf: line 18, column 34
    function mode_12 () : java.lang.Object {
      return Claim.LossType
    }
    
    // 'visible' attribute on Card (id=Claim_ISOCard) at LossDetailsPanelSet.default.pcf: line 23, column 48
    function visible_15 () : java.lang.Boolean {
      return Claim.ISOClaimLevelMessaging
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    
  }
  
  
}