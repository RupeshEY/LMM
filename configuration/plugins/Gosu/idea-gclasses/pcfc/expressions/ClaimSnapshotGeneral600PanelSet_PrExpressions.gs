package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.Pr.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotGeneral600PanelSet_PrExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.Pr.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotGeneral600PanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotGeneral600PanelSet.Pr.pcf: line 16, column 39
    function def_onEnter_0 (def :  pcf.ClaimSnapshotGeneralPR600PanelSet_Homeowners) : void {
      def.onEnter(Claim, Snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotGeneral600PanelSet.Pr.pcf: line 16, column 39
    function def_onEnter_2 (def :  pcf.ClaimSnapshotGeneralPR600PanelSet_default) : void {
      def.onEnter(Claim, Snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotGeneral600PanelSet.Pr.pcf: line 16, column 39
    function def_refreshVariables_1 (def :  pcf.ClaimSnapshotGeneralPR600PanelSet_Homeowners) : void {
      def.refreshVariables(Claim, Snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotGeneral600PanelSet.Pr.pcf: line 16, column 39
    function def_refreshVariables_3 (def :  pcf.ClaimSnapshotGeneralPR600PanelSet_default) : void {
      def.refreshVariables(Claim, Snapshot)
    }
    
    // 'mode' attribute on PanelRef at ClaimSnapshotGeneral600PanelSet.Pr.pcf: line 16, column 39
    function mode_4 () : java.lang.Object {
      return Claim.Policy.PolicyType
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get Snapshot () : dynamic.Dynamic {
      return getRequireValue("Snapshot", 0) as dynamic.Dynamic
    }
    
    property set Snapshot ($arg :  dynamic.Dynamic) {
      setRequireValue("Snapshot", 0, $arg)
    }
    
    
  }
  
  
}