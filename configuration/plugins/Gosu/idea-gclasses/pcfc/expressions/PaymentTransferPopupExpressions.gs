package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/checks/PaymentTransferPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PaymentTransferPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/checks/PaymentTransferPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PaymentTransferPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Payment :  Payment, Claim :  Claim, reserveLineInputSetHelper :  gw.api.financials.ReserveLineInputSetHelper) : int {
      return 0
    }
    
    // 'def' attribute on PanelRef at PaymentTransferPopup.pcf: line 30, column 79
    function def_onEnter_1 (def :  pcf.PaymentTransferDV) : void {
      def.onEnter(Payment, Payment, reserveLineInputSetHelper)
    }
    
    // 'def' attribute on PanelRef at PaymentTransferPopup.pcf: line 30, column 79
    function def_refreshVariables_2 (def :  pcf.PaymentTransferDV) : void {
      def.refreshVariables(Payment, Payment, reserveLineInputSetHelper)
    }
    
    // EditButtons at PaymentTransferPopup.pcf: line 27, column 33
    function label_0 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'parent' attribute on Popup (id=PaymentTransferPopup) at PaymentTransferPopup.pcf: line 10, column 67
    static function parent_3 (Claim :  Claim, Payment :  Payment, reserveLineInputSetHelper :  gw.api.financials.ReserveLineInputSetHelper) : pcf.api.Destination {
      return pcf.CheckTransfer.createDestination(Claim, Payment.Check)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.PaymentTransferPopup {
      return super.CurrentLocation as pcf.PaymentTransferPopup
    }
    
    property get Payment () : Payment {
      return getVariableValue("Payment", 0) as Payment
    }
    
    property set Payment ($arg :  Payment) {
      setVariableValue("Payment", 0, $arg)
    }
    
    property get reserveLineInputSetHelper () : gw.api.financials.ReserveLineInputSetHelper {
      return getVariableValue("reserveLineInputSetHelper", 0) as gw.api.financials.ReserveLineInputSetHelper
    }
    
    property set reserveLineInputSetHelper ($arg :  gw.api.financials.ReserveLineInputSetHelper) {
      setVariableValue("reserveLineInputSetHelper", 0, $arg)
    }
    
    
  }
  
  
}