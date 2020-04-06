package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/default/ClaimSnapshotLossDetailsScreen.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotLossDetailsScreen_defaultExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/default/ClaimSnapshotLossDetailsScreen.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotLossDetailsScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotLossDetailsScreen.default.pcf: line 17, column 45
    function def_onEnter_0 (def :  pcf.ClaimSnapshotGeneralPanelSet_Pr) : void {
      def.onEnter(Claim, SnapshotParam)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotLossDetailsScreen.default.pcf: line 17, column 45
    function def_onEnter_2 (def :  pcf.ClaimSnapshotGeneralPanelSet_Trav) : void {
      def.onEnter(Claim, SnapshotParam)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotLossDetailsScreen.default.pcf: line 17, column 45
    function def_onEnter_4 (def :  pcf.ClaimSnapshotGeneralPanelSet_auto) : void {
      def.onEnter(Claim, SnapshotParam)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotLossDetailsScreen.default.pcf: line 17, column 45
    function def_onEnter_6 (def :  pcf.ClaimSnapshotGeneralPanelSet_gl) : void {
      def.onEnter(Claim, SnapshotParam)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotLossDetailsScreen.default.pcf: line 17, column 45
    function def_onEnter_8 (def :  pcf.ClaimSnapshotGeneralPanelSet_wc) : void {
      def.onEnter(Claim, SnapshotParam)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotLossDetailsScreen.default.pcf: line 17, column 45
    function def_refreshVariables_1 (def :  pcf.ClaimSnapshotGeneralPanelSet_Pr) : void {
      def.refreshVariables(Claim, SnapshotParam)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotLossDetailsScreen.default.pcf: line 17, column 45
    function def_refreshVariables_3 (def :  pcf.ClaimSnapshotGeneralPanelSet_Trav) : void {
      def.refreshVariables(Claim, SnapshotParam)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotLossDetailsScreen.default.pcf: line 17, column 45
    function def_refreshVariables_5 (def :  pcf.ClaimSnapshotGeneralPanelSet_auto) : void {
      def.refreshVariables(Claim, SnapshotParam)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotLossDetailsScreen.default.pcf: line 17, column 45
    function def_refreshVariables_7 (def :  pcf.ClaimSnapshotGeneralPanelSet_gl) : void {
      def.refreshVariables(Claim, SnapshotParam)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotLossDetailsScreen.default.pcf: line 17, column 45
    function def_refreshVariables_9 (def :  pcf.ClaimSnapshotGeneralPanelSet_wc) : void {
      def.refreshVariables(Claim, SnapshotParam)
    }
    
    // 'mode' attribute on PanelRef at ClaimSnapshotLossDetailsScreen.default.pcf: line 17, column 45
    function mode_10 () : java.lang.Object {
      return (SnapshotParam).LossType.Code
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get SnapshotParam () : dynamic.Dynamic {
      return getRequireValue("SnapshotParam", 0) as dynamic.Dynamic
    }
    
    property set SnapshotParam ($arg :  dynamic.Dynamic) {
      setRequireValue("SnapshotParam", 0, $arg)
    }
    
    
  }
  
  
}