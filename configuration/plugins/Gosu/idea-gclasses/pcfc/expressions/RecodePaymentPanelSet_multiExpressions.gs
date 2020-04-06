package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/checks/RecodePaymentPanelSet.multi.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RecodePaymentPanelSet_multiExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/checks/RecodePaymentPanelSet.multi.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanelExpressionsImpl extends RecodePaymentPanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at RecodePaymentPanelSet.multi.pcf: line 24, column 67
    function def_onEnter_0 (def :  pcf.NewOnsetPaymentsLV) : void {
      def.onEnter(OriginalPayment, OnsetPayments)
    }
    
    // 'def' attribute on PanelRef at RecodePaymentPanelSet.multi.pcf: line 30, column 72
    function def_onEnter_2 (def :  pcf.RecodePaymentDV) : void {
      def.onEnter(Payment, reserveLineInputSetHelper)
    }
    
    // 'def' attribute on PanelRef at RecodePaymentPanelSet.multi.pcf: line 24, column 67
    function def_refreshVariables_1 (def :  pcf.NewOnsetPaymentsLV) : void {
      def.refreshVariables(OriginalPayment, OnsetPayments)
    }
    
    // 'def' attribute on PanelRef at RecodePaymentPanelSet.multi.pcf: line 30, column 72
    function def_refreshVariables_3 (def :  pcf.RecodePaymentDV) : void {
      def.refreshVariables(Payment, reserveLineInputSetHelper)
    }
    
    property get Payment () : Payment {
      return getCurrentSelection(1) as Payment
    }
    
    property set Payment ($arg :  Payment) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/financials/checks/RecodePaymentPanelSet.multi.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RecodePaymentPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    property get OnsetPayments () : java.util.ArrayList<Payment> {
      return getRequireValue("OnsetPayments", 0) as java.util.ArrayList<Payment>
    }
    
    property set OnsetPayments ($arg :  java.util.ArrayList<Payment>) {
      setRequireValue("OnsetPayments", 0, $arg)
    }
    
    property get OriginalPayment () : Payment {
      return getRequireValue("OriginalPayment", 0) as Payment
    }
    
    property set OriginalPayment ($arg :  Payment) {
      setRequireValue("OriginalPayment", 0, $arg)
    }
    
    property get reserveLineInputSetHelper () : gw.api.financials.ReserveLineInputSetHelper {
      return getRequireValue("reserveLineInputSetHelper", 0) as gw.api.financials.ReserveLineInputSetHelper
    }
    
    property set reserveLineInputSetHelper ($arg :  gw.api.financials.ReserveLineInputSetHelper) {
      setRequireValue("reserveLineInputSetHelper", 0, $arg)
    }
    
    
  }
  
  
}