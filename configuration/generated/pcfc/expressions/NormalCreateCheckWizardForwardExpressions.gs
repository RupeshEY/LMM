package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/check/NormalCreateCheckWizardForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NormalCreateCheckWizardForwardExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newtransaction/check/NormalCreateCheckWizardForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NormalCreateCheckWizardForwardExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim) : int {
      return 0
    }
    
    static function __constructorIndex (claim :  Claim, exposure :  Exposure, costType :  CostType, costCategory :  CostCategory, reservingCurrency :  Currency, setReserveLine :  boolean) : int {
      return 1
    }
    
    static function __constructorIndex (claim :  Claim, serviceRequestInvoice :  ServiceRequestInvoice) : int {
      return 2
    }
    
    // 'action' attribute on ForwardCondition at NormalCreateCheckWizardForward.pcf: line 54, column 50
    function action_11 () : void {
      NormalCreateCheckWizard.go(serviceRequestInvoice.ServiceRequest.Claim, serviceRequestInvoice)
    }
    
    // 'action' attribute on ForwardCondition at NormalCreateCheckWizardForward.pcf: line 56, column 51
    function action_14 () : void {
      NormalCreateCheckWizard.go(claim)
    }
    
    // 'action' attribute on ForwardCondition at NormalCreateCheckWizardForward.pcf: line 45, column 41
    function action_2 () : void {
      NewCheckNoAbilityToPay.go(claim, canPayResult)
    }
    
    // 'action' attribute on ForwardCondition at NormalCreateCheckWizardForward.pcf: line 48, column 35
    function action_5 () : void {
      NormalCreateCheckWizard.go(claim, exposure, costType, costCategory, reservingCurrency, setReserveLine)
    }
    
    // 'action' attribute on ForwardCondition at NormalCreateCheckWizardForward.pcf: line 51, column 56
    function action_8 () : void {
      ClaimFinancialsChecksDetail.go(claim, serviceRequestInvoice.Check, serviceRequestInvoice)
    }
    
    // 'action' attribute on ForwardCondition at NormalCreateCheckWizardForward.pcf: line 54, column 50
    function action_dest_12 () : pcf.api.Destination {
      return pcf.NormalCreateCheckWizard.createDestination(serviceRequestInvoice.ServiceRequest.Claim, serviceRequestInvoice)
    }
    
    // 'action' attribute on ForwardCondition at NormalCreateCheckWizardForward.pcf: line 56, column 51
    function action_dest_15 () : pcf.api.Destination {
      return pcf.NormalCreateCheckWizard.createDestination(claim)
    }
    
    // 'action' attribute on ForwardCondition at NormalCreateCheckWizardForward.pcf: line 45, column 41
    function action_dest_3 () : pcf.api.Destination {
      return pcf.NewCheckNoAbilityToPay.createDestination(claim, canPayResult)
    }
    
    // 'action' attribute on ForwardCondition at NormalCreateCheckWizardForward.pcf: line 48, column 35
    function action_dest_6 () : pcf.api.Destination {
      return pcf.NormalCreateCheckWizard.createDestination(claim, exposure, costType, costCategory, reservingCurrency, setReserveLine)
    }
    
    // 'action' attribute on ForwardCondition at NormalCreateCheckWizardForward.pcf: line 51, column 56
    function action_dest_9 () : pcf.api.Destination {
      return pcf.ClaimFinancialsChecksDetail.createDestination(claim, serviceRequestInvoice.Check, serviceRequestInvoice)
    }
    
    // 'canVisit' attribute on Forward (id=NormalCreateCheckWizardForward) at NormalCreateCheckWizardForward.pcf: line 9, column 27
    static function canVisit_16 (claim :  Claim, costCategory :  CostCategory, costType :  CostType, exposure :  Exposure, reservingCurrency :  Currency, serviceRequestInvoice :  ServiceRequestInvoice, setReserveLine :  boolean) : java.lang.Boolean {
      return perm.Claim.createpayment(claim)
    }
    
    // 'condition' attribute on ForwardCondition at NormalCreateCheckWizardForward.pcf: line 51, column 56
    function condition_10 () : java.lang.Boolean {
      return serviceRequestInvoice.Check != null
    }
    
    // 'condition' attribute on ForwardCondition at NormalCreateCheckWizardForward.pcf: line 54, column 50
    function condition_13 () : java.lang.Boolean {
      return serviceRequestInvoice != null
    }
    
    // 'condition' attribute on ForwardCondition at NormalCreateCheckWizardForward.pcf: line 45, column 41
    function condition_4 () : java.lang.Boolean {
      return null != canPayResult
    }
    
    // 'condition' attribute on ForwardCondition at NormalCreateCheckWizardForward.pcf: line 48, column 35
    function condition_7 () : java.lang.Boolean {
      return setReserveLine
    }
    
    // 'initialValue' attribute on Variable at NormalCreateCheckWizardForward.pcf: line 22, column 37
    function initialValue_0 () : ServiceRequestInvoice {
      return null
    }
    
    // 'initialValue' attribute on Variable at NormalCreateCheckWizardForward.pcf: line 39, column 52
    function initialValue_1 () : gw.api.financials.AbilityToPayResult {
      return gw.api.financials.CheckUtil.canPay(claim, exposure, CurrentLocation)
    }
    
    // 'onBeforeForward' attribute on Forward (id=NormalCreateCheckWizardForward) at NormalCreateCheckWizardForward.pcf: line 9, column 27
    function onBeforeForward_18 () : void {
      if (serviceRequestInvoice != null) new gw.cc.system.transaction.InvoiceAutomaticProcessor().process(serviceRequestInvoice)
    }
    
    // 'parent' attribute on Forward (id=NormalCreateCheckWizardForward) at NormalCreateCheckWizardForward.pcf: line 9, column 27
    static function parent_17 (claim :  Claim, costCategory :  CostCategory, costType :  CostType, exposure :  Exposure, reservingCurrency :  Currency, serviceRequestInvoice :  ServiceRequestInvoice, setReserveLine :  boolean) : pcf.api.Destination {
      return pcf.Claim.createDestination(claim)
    }
    
    override property get CurrentLocation () : pcf.NormalCreateCheckWizardForward {
      return super.CurrentLocation as pcf.NormalCreateCheckWizardForward
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
    
    property get serviceRequestInvoice () : ServiceRequestInvoice {
      return getVariableValue("serviceRequestInvoice", 0) as ServiceRequestInvoice
    }
    
    property set serviceRequestInvoice ($arg :  ServiceRequestInvoice) {
      setVariableValue("serviceRequestInvoice", 0, $arg)
    }
    
    property get setReserveLine () : boolean {
      return getVariableValue("setReserveLine", 0) as java.lang.Boolean
    }
    
    property set setReserveLine ($arg :  boolean) {
      setVariableValue("setReserveLine", 0, $arg)
    }
    
    
  }
  
  
}