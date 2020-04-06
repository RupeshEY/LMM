package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/claimtransactions/ClaimTransactions.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimTransactionsExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/claimtransactions/ClaimTransactions.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimTransactionsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim) : int {
      return 0
    }
    
    // 'def' attribute on ScreenRef at ClaimTransactions.pcf: line 14, column 45
    function def_onEnter_0 (def :  pcf.ClaimTransactionsScreen) : void {
      def.onEnter(claim)
    }
    
    // 'def' attribute on ScreenRef at ClaimTransactions.pcf: line 14, column 45
    function def_refreshVariables_1 (def :  pcf.ClaimTransactionsScreen) : void {
      def.refreshVariables(claim)
    }
    
    // Page (id=ClaimTransactions) at ClaimTransactions.pcf: line 7, column 77
    static function parent_2 (claim :  Claim) : pcf.api.Destination {
      return pcf.ECFLocationGroup.createDestination(claim)
    }
    
    override property get CurrentLocation () : pcf.ClaimTransactions {
      return super.CurrentLocation as pcf.ClaimTransactions
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    
  }
  
  
}