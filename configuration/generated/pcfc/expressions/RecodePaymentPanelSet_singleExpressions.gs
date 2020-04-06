package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/checks/RecodePaymentPanelSet.single.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RecodePaymentPanelSet_singleExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/checks/RecodePaymentPanelSet.single.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RecodePaymentPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at RecodePaymentPanelSet.single.pcf: line 22, column 81
    function def_onEnter_0 (def :  pcf.RecodePaymentDV) : void {
      def.onEnter(OnsetPayments.single(), reserveLineInputSetHelper)
    }
    
    // 'def' attribute on PanelRef at RecodePaymentPanelSet.single.pcf: line 22, column 81
    function def_refreshVariables_1 (def :  pcf.RecodePaymentDV) : void {
      def.refreshVariables(OnsetPayments.single(), reserveLineInputSetHelper)
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