package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/check/NewCheckNoAbilityToPay.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewCheckNoAbilityToPayExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newtransaction/check/NewCheckNoAbilityToPay.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewCheckNoAbilityToPayExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim, canPayResult :  gw.api.financials.AbilityToPayResult) : int {
      return 0
    }
    
    // 'action' attribute on TextInput (id=CreatePayment) at NewCheckNoAbilityToPay.pcf: line 29, column 107
    function action_1 () : void {
      ClaimSummary.go(claim)
    }
    
    // 'action' attribute on TextInput (id=CreatePayment) at NewCheckNoAbilityToPay.pcf: line 29, column 107
    function action_dest_2 () : pcf.api.Destination {
      return pcf.ClaimSummary.createDestination(claim)
    }
    
    // 'afterEnter' attribute on Page (id=NewCheckNoAbilityToPay) at NewCheckNoAbilityToPay.pcf: line 9, column 78
    function afterEnter_4 () : void {
      gw.api.financials.CheckUtil.displayAbilityToPayValidationErrors(canPayResult, CurrentLocation);
    }
    
    // 'parent' attribute on Page (id=NewCheckNoAbilityToPay) at NewCheckNoAbilityToPay.pcf: line 9, column 78
    static function parent_5 (canPayResult :  gw.api.financials.AbilityToPayResult, claim :  Claim) : pcf.api.Destination {
      return pcf.Claim.createDestination(claim)
    }
    
    // 'value' attribute on TextInput (id=CreatePayment) at NewCheckNoAbilityToPay.pcf: line 29, column 107
    function value_0 () : java.lang.String {
      return DisplayKey.get("Web.NewCheckWizard.AbilityToPayFailed.BackToClaim", claim)
    }
    
    override property get CurrentLocation () : pcf.NewCheckNoAbilityToPay {
      return super.CurrentLocation as pcf.NewCheckNoAbilityToPay
    }
    
    property get canPayResult () : gw.api.financials.AbilityToPayResult {
      return getVariableValue("canPayResult", 0) as gw.api.financials.AbilityToPayResult
    }
    
    property set canPayResult ($arg :  gw.api.financials.AbilityToPayResult) {
      setVariableValue("canPayResult", 0, $arg)
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    
  }
  
  
}