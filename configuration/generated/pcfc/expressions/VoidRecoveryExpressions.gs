package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/transactions/VoidRecovery.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class VoidRecoveryExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/transactions/VoidRecovery.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VoidRecoveryExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim, Recovery :  Recovery) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=VoidRecovery_VoidButton) at VoidRecovery.pcf: line 34, column 54
    function action_2 () : void {
      CurrentLocation.commit()
    }
    
    // 'afterCancel' attribute on Page (id=VoidRecovery) at VoidRecovery.pcf: line 15, column 64
    function afterCancel_6 () : void {
      ClaimFinancialsTransactionsDetail.go(Claim, Recovery)
    }
    
    // 'afterCancel' attribute on Page (id=VoidRecovery) at VoidRecovery.pcf: line 15, column 64
    function afterCancel_dest_7 () : pcf.api.Destination {
      return pcf.ClaimFinancialsTransactionsDetail.createDestination(Claim, Recovery)
    }
    
    // 'afterCommit' attribute on Page (id=VoidRecovery) at VoidRecovery.pcf: line 15, column 64
    function afterCommit_8 (TopLocation :  pcf.api.Location) : void {
      Recovery.logVoid() ; ClaimFinancialsTransactionsDetail.go(Claim, Recovery)
    }
    
    // 'available' attribute on ToolbarButton (id=VoidRecovery_VoidButton) at VoidRecovery.pcf: line 34, column 54
    function available_0 () : java.lang.Boolean {
      return Recovery.Voidable and perm.Recovery.voidrec(Recovery)
    }
    
    // 'beforeCommit' attribute on Page (id=VoidRecovery) at VoidRecovery.pcf: line 15, column 64
    function beforeCommit_9 (pickedValue :  java.lang.Object) : void {
      Recovery.voidRecovery()
    }
    
    // 'canVisit' attribute on Page (id=VoidRecovery) at VoidRecovery.pcf: line 15, column 64
    static function canVisit_10 (Claim :  Claim, Recovery :  Recovery) : java.lang.Boolean {
      return perm.Claim.viewrecoveries(Claim)
    }
    
    // 'def' attribute on InputSetRef at VoidRecovery.pcf: line 43, column 53
    function def_onEnter_4 (def :  pcf.RecoveryBasicsInputSet) : void {
      def.onEnter(Recovery)
    }
    
    // 'def' attribute on InputSetRef at VoidRecovery.pcf: line 43, column 53
    function def_refreshVariables_5 (def :  pcf.RecoveryBasicsInputSet) : void {
      def.refreshVariables(Recovery)
    }
    
    // EditButtons at VoidRecovery.pcf: line 38, column 34
    function label_3 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'parent' attribute on Page (id=VoidRecovery) at VoidRecovery.pcf: line 15, column 64
    static function parent_11 (Claim :  Claim, Recovery :  Recovery) : pcf.api.Destination {
      return pcf.ClaimFinancialsTransactionsDetail.createDestination(Claim, Recovery)
    }
    
    // 'visible' attribute on ToolbarButton (id=VoidRecovery_VoidButton) at VoidRecovery.pcf: line 34, column 54
    function visible_1 () : java.lang.Boolean {
      return perm.Recovery.voidrec(Recovery)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.VoidRecovery {
      return super.CurrentLocation as pcf.VoidRecovery
    }
    
    property get Recovery () : Recovery {
      return getVariableValue("Recovery", 0) as Recovery
    }
    
    property set Recovery ($arg :  Recovery) {
      setVariableValue("Recovery", 0, $arg)
    }
    
    
  }
  
  
}