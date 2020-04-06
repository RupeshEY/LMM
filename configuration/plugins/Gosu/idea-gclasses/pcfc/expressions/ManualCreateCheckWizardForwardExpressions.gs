package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/check/ManualCreateCheckWizardForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ManualCreateCheckWizardForwardExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newtransaction/check/ManualCreateCheckWizardForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ManualCreateCheckWizardForwardExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim) : int {
      return 0
    }
    
    // 'action' attribute on ForwardCondition at ManualCreateCheckWizardForward.pcf: line 20, column 41
    function action_1 () : void {
      NewCheckNoAbilityToPay.go(claim, canPayResult)
    }
    
    // 'action' attribute on ForwardCondition at ManualCreateCheckWizardForward.pcf: line 23, column 41
    function action_4 () : void {
      ManualCreateCheckWizard.go(claim)
    }
    
    // 'action' attribute on ForwardCondition at ManualCreateCheckWizardForward.pcf: line 20, column 41
    function action_dest_2 () : pcf.api.Destination {
      return pcf.NewCheckNoAbilityToPay.createDestination(claim, canPayResult)
    }
    
    // 'action' attribute on ForwardCondition at ManualCreateCheckWizardForward.pcf: line 23, column 41
    function action_dest_5 () : pcf.api.Destination {
      return pcf.ManualCreateCheckWizard.createDestination(claim)
    }
    
    // 'canVisit' attribute on Forward (id=ManualCreateCheckWizardForward) at ManualCreateCheckWizardForward.pcf: line 8, column 27
    static function canVisit_7 (claim :  Claim) : java.lang.Boolean {
      return perm.Claim.createpayment(claim)
    }
    
    // 'condition' attribute on ForwardCondition at ManualCreateCheckWizardForward.pcf: line 20, column 41
    function condition_3 () : java.lang.Boolean {
      return null != canPayResult
    }
    
    // 'condition' attribute on ForwardCondition at ManualCreateCheckWizardForward.pcf: line 23, column 41
    function condition_6 () : java.lang.Boolean {
      return null == canPayResult
    }
    
    // 'initialValue' attribute on Variable at ManualCreateCheckWizardForward.pcf: line 17, column 52
    function initialValue_0 () : gw.api.financials.AbilityToPayResult {
      return gw.api.financials.CheckUtil.canPay(claim, null, CurrentLocation)
    }
    
    // 'parent' attribute on Forward (id=ManualCreateCheckWizardForward) at ManualCreateCheckWizardForward.pcf: line 8, column 27
    static function parent_8 (claim :  Claim) : pcf.api.Destination {
      return pcf.Claim.createDestination(claim)
    }
    
    override property get CurrentLocation () : pcf.ManualCreateCheckWizardForward {
      return super.CurrentLocation as pcf.ManualCreateCheckWizardForward
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