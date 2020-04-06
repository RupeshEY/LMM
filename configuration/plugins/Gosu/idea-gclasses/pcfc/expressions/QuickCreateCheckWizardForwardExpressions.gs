package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/check/QuickCreateCheckWizardForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class QuickCreateCheckWizardForwardExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newtransaction/check/QuickCreateCheckWizardForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class QuickCreateCheckWizardForwardExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim) : int {
      return 1
    }
    
    static function __constructorIndex (claim :  Claim, exposure :  Exposure, costType :  CostType, costCategory :  CostCategory, reservingCurrency :  Currency, setReserveLine :  Boolean) : int {
      return 0
    }
    
    // 'action' attribute on ForwardCondition at QuickCreateCheckWizardForward.pcf: line 37, column 41
    function action_1 () : void {
      NewCheckNoAbilityToPay.go(claim, canPayResult)
    }
    
    // 'action' attribute on ForwardCondition at QuickCreateCheckWizardForward.pcf: line 40, column 41
    function action_4 () : void {
      QuickCreateCheckWizard.go(claim, exposure, costType, costCategory, reservingCurrency, setReserveLine)
    }
    
    // 'action' attribute on ForwardCondition at QuickCreateCheckWizardForward.pcf: line 37, column 41
    function action_dest_2 () : pcf.api.Destination {
      return pcf.NewCheckNoAbilityToPay.createDestination(claim, canPayResult)
    }
    
    // 'action' attribute on ForwardCondition at QuickCreateCheckWizardForward.pcf: line 40, column 41
    function action_dest_5 () : pcf.api.Destination {
      return pcf.QuickCreateCheckWizard.createDestination(claim, exposure, costType, costCategory, reservingCurrency, setReserveLine)
    }
    
    // 'canVisit' attribute on Forward (id=QuickCreateCheckWizardForward) at QuickCreateCheckWizardForward.pcf: line 8, column 44
    static function canVisit_7 (claim :  Claim, costCategory :  CostCategory, costType :  CostType, exposure :  Exposure, reservingCurrency :  Currency, setReserveLine :  Boolean) : java.lang.Boolean {
      return perm.Claim.createpayment(claim)
    }
    
    // 'condition' attribute on ForwardCondition at QuickCreateCheckWizardForward.pcf: line 37, column 41
    function condition_3 () : java.lang.Boolean {
      return null != canPayResult
    }
    
    // 'condition' attribute on ForwardCondition at QuickCreateCheckWizardForward.pcf: line 40, column 41
    function condition_6 () : java.lang.Boolean {
      return null == canPayResult
    }
    
    // 'initialValue' attribute on Variable at QuickCreateCheckWizardForward.pcf: line 31, column 52
    function initialValue_0 () : gw.api.financials.AbilityToPayResult {
      return gw.api.financials.CheckUtil.canPay(claim, exposure, CurrentLocation)
    }
    
    // 'parent' attribute on Forward (id=QuickCreateCheckWizardForward) at QuickCreateCheckWizardForward.pcf: line 8, column 44
    static function parent_8 (claim :  Claim, costCategory :  CostCategory, costType :  CostType, exposure :  Exposure, reservingCurrency :  Currency, setReserveLine :  Boolean) : pcf.api.Destination {
      return pcf.ClaimFinancialsSummary.createDestination(claim)
    }
    
    override property get CurrentLocation () : pcf.QuickCreateCheckWizardForward {
      return super.CurrentLocation as pcf.QuickCreateCheckWizardForward
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
    
    property get costCategory () : CostCategory {
      return getVariableValue("costCategory", 0) as CostCategory
    }
    
    property set costCategory ($arg :  CostCategory) {
      setVariableValue("costCategory", 0, $arg)
    }
    
    property get costType () : CostType {
      return getVariableValue("costType", 0) as CostType
    }
    
    property set costType ($arg :  CostType) {
      setVariableValue("costType", 0, $arg)
    }
    
    property get exposure () : Exposure {
      return getVariableValue("exposure", 0) as Exposure
    }
    
    property set exposure ($arg :  Exposure) {
      setVariableValue("exposure", 0, $arg)
    }
    
    property get reservingCurrency () : Currency {
      return getVariableValue("reservingCurrency", 0) as Currency
    }
    
    property set reservingCurrency ($arg :  Currency) {
      setVariableValue("reservingCurrency", 0, $arg)
    }
    
    property get setReserveLine () : Boolean {
      return getVariableValue("setReserveLine", 0) as Boolean
    }
    
    property set setReserveLine ($arg :  Boolean) {
      setVariableValue("setReserveLine", 0, $arg)
    }
    
    
  }
  
  
}