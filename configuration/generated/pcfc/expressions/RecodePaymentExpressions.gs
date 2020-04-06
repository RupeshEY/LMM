package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/checks/RecodePayment.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RecodePaymentExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/checks/RecodePayment.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RecodePaymentExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim, OriginalPayment :  Payment) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=RecodePayment_RecodeButton) at RecodePayment.pcf: line 41, column 70
    function action_3 () : void {
      doRecode()
    }
    
    // 'afterCancel' attribute on Page (id=RecodePayment) at RecodePayment.pcf: line 14, column 72
    function afterCancel_12 () : void {
      ClaimFinancialsTransactionsDetail.go(Claim, OriginalPayment)
    }
    
    // 'afterCancel' attribute on Page (id=RecodePayment) at RecodePayment.pcf: line 14, column 72
    function afterCancel_dest_13 () : pcf.api.Destination {
      return pcf.ClaimFinancialsTransactionsDetail.createDestination(Claim, OriginalPayment)
    }
    
    // 'afterCommit' attribute on Page (id=RecodePayment) at RecodePayment.pcf: line 14, column 72
    function afterCommit_14 (TopLocation :  pcf.api.Location) : void {
      gw.api.financials.FinancialsUtil.logRecode(OriginalPayment, FirstOnsetPayment); ClaimFinancialsTransactions.go(Claim, gw.api.financials.ClaimFinancialsTransactionsOption.PAYMENT)
    }
    
    // 'canVisit' attribute on Page (id=RecodePayment) at RecodePayment.pcf: line 14, column 72
    static function canVisit_15 (Claim :  Claim, OriginalPayment :  Payment) : java.lang.Boolean {
      return perm.Payment.recode(OriginalPayment)
    }
    
    // 'def' attribute on PanelRef at RecodePayment.pcf: line 56, column 117
    function def_onEnter_7 (def :  pcf.RecodePaymentPanelSet_multi) : void {
      def.onEnter(OriginalPayment, OnsetPayments, reserveLineInputSetHelper)
    }
    
    // 'def' attribute on PanelRef at RecodePayment.pcf: line 56, column 117
    function def_onEnter_9 (def :  pcf.RecodePaymentPanelSet_single) : void {
      def.onEnter(OriginalPayment, OnsetPayments, reserveLineInputSetHelper)
    }
    
    // 'def' attribute on PanelRef at RecodePayment.pcf: line 56, column 117
    function def_refreshVariables_10 (def :  pcf.RecodePaymentPanelSet_single) : void {
      def.refreshVariables(OriginalPayment, OnsetPayments, reserveLineInputSetHelper)
    }
    
    // 'def' attribute on PanelRef at RecodePayment.pcf: line 56, column 117
    function def_refreshVariables_8 (def :  pcf.RecodePaymentPanelSet_multi) : void {
      def.refreshVariables(OriginalPayment, OnsetPayments, reserveLineInputSetHelper)
    }
    
    // 'initialValue' attribute on Variable at RecodePayment.pcf: line 26, column 59
    function initialValue_0 () : gw.api.financials.ReserveLineInputSetHelper {
      return gw.api.financials.ReserveLineInputSetStrategyForPaymentRecode.newHelper(OriginalPayment.Check)
    }
    
    // 'initialValue' attribute on Variable at RecodePayment.pcf: line 30, column 30
    function initialValue_1 () : entity.Payment {
      return createPayment()
    }
    
    // 'initialValue' attribute on Variable at RecodePayment.pcf: line 34, column 50
    function initialValue_2 () : java.util.ArrayList<Payment> {
      return new java.util.ArrayList<Payment>(){FirstOnsetPayment}
    }
    
    // EditButtons at RecodePayment.pcf: line 46, column 34
    function label_4 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'mode' attribute on PanelRef at RecodePayment.pcf: line 56, column 117
    function mode_11 () : java.lang.Object {
      return gw.api.financials.FinancialsUtil.isAllowMultiplePayments() ? "multi" : "single"
    }
    
    // 'parent' attribute on Page (id=RecodePayment) at RecodePayment.pcf: line 14, column 72
    static function parent_16 (Claim :  Claim, OriginalPayment :  Payment) : pcf.api.Destination {
      return pcf.ClaimFinancialsTransactionsDetail.createDestination(Claim, OriginalPayment)
    }
    
    // 'addVisible' attribute on IteratorButtons at RecodePayment.pcf: line 52, column 121
    function visible_5 () : java.lang.Boolean {
      return gw.api.financials.FinancialsUtil.isAllowMultiplePayments() and !OriginalPayment.Check.Bulked
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.RecodePayment {
      return super.CurrentLocation as pcf.RecodePayment
    }
    
    property get FirstOnsetPayment () : entity.Payment {
      return getVariableValue("FirstOnsetPayment", 0) as entity.Payment
    }
    
    property set FirstOnsetPayment ($arg :  entity.Payment) {
      setVariableValue("FirstOnsetPayment", 0, $arg)
    }
    
    property get OnsetPayments () : java.util.ArrayList<Payment> {
      return getVariableValue("OnsetPayments", 0) as java.util.ArrayList<Payment>
    }
    
    property set OnsetPayments ($arg :  java.util.ArrayList<Payment>) {
      setVariableValue("OnsetPayments", 0, $arg)
    }
    
    property get OriginalPayment () : Payment {
      return getVariableValue("OriginalPayment", 0) as Payment
    }
    
    property set OriginalPayment ($arg :  Payment) {
      setVariableValue("OriginalPayment", 0, $arg)
    }
    
    property get reserveLineInputSetHelper () : gw.api.financials.ReserveLineInputSetHelper {
      return getVariableValue("reserveLineInputSetHelper", 0) as gw.api.financials.ReserveLineInputSetHelper
    }
    
    property set reserveLineInputSetHelper ($arg :  gw.api.financials.ReserveLineInputSetHelper) {
      setVariableValue("reserveLineInputSetHelper", 0, $arg)
    }
    
    function createPayment(): Payment {
      var pmt = OriginalPayment.getOnset();
      if (pmt == null) {
        pmt = OriginalPayment.createOnsetPayment(true, true)
      }
      return pmt
    }
    
    function doRecode() {
      var vr: gw.api.validation.ValidationExecutionResult[]
    
      if (OriginalPayment.hasDeductibleLineItem()) {
        OriginalPayment.unlinkDeductible()
      }
      FirstOnsetPayment.linkDeductible()
    
      gw.api.util.CCLocationUtil.runAndCommit(\-> {
        try {
          OriginalPayment.recodePayment(OnsetPayments.toArray(new Payment[]{}))
        } catch (e: gw.api.financials.CloseValidationException) {
          vr = e.ValidationResults
        }
      }, CurrentLocation)
    
      if (vr.HasElements) {
        gw.api.util.LocationUtil.addRequestScopedInfoMessage(DisplayKey.get("Java.Financials.CheckWizard.Warning.ClaimExposureNotClosed"))
        for (validationResult in vr) {
          var messages = validationResult.Result.ErrorMessages
          for (message in messages) {
            gw.api.util.LocationUtil.addRequestScopedInfoMessage(message)
          }
        }
      }
    }
            
    
    
  }
  
  
}