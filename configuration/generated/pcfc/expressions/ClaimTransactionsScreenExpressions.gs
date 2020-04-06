package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/claimtransactions/ClaimTransactionsScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimTransactionsScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/claimtransactions/ClaimTransactionsScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimTransactionsScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef (id=ClaimNotifyPanel) at ClaimTransactionsScreen.pcf: line 12, column 29
    function def_onEnter_0 (def :  pcf.ClaimTransactionsLV) : void {
      def.onEnter(claim.LatestMessagePerTransaction)
    }
    
    // 'def' attribute on PanelRef (id=ClaimNotifyPanel) at ClaimTransactionsScreen.pcf: line 12, column 29
    function def_refreshVariables_1 (def :  pcf.ClaimTransactionsLV) : void {
      def.refreshVariables(claim.LatestMessagePerTransaction)
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    
  }
  
  
}