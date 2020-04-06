package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/shared/EditTransactionInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditTransactionInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/shared/EditTransactionInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditTransactionInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at EditTransactionInputSet.pcf: line 15, column 70
    function def_onEnter_0 (def :  pcf.ReserveLineInputSet) : void {
      def.onEnter(payment, reserveLineInputSetHelper)
    }
    
    // 'def' attribute on InputSetRef at EditTransactionInputSet.pcf: line 15, column 70
    function def_refreshVariables_1 (def :  pcf.ReserveLineInputSet) : void {
      def.refreshVariables(payment, reserveLineInputSetHelper)
    }
    
    // 'value' attribute on TextInput (id=Comments) at EditTransactionInputSet.pcf: line 20, column 33
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      payment.Comments = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=Comments) at EditTransactionInputSet.pcf: line 20, column 33
    function valueRoot_5 () : java.lang.Object {
      return payment
    }
    
    // 'value' attribute on TextInput (id=Comments) at EditTransactionInputSet.pcf: line 20, column 33
    function value_2 () : java.lang.String {
      return payment.Comments
    }
    
    property get payment () : Payment {
      return getRequireValue("payment", 0) as Payment
    }
    
    property set payment ($arg :  Payment) {
      setRequireValue("payment", 0, $arg)
    }
    
    property get reserveLineInputSetHelper () : gw.api.financials.ReserveLineInputSetHelper {
      return getRequireValue("reserveLineInputSetHelper", 0) as gw.api.financials.ReserveLineInputSetHelper
    }
    
    property set reserveLineInputSetHelper ($arg :  gw.api.financials.ReserveLineInputSetHelper) {
      setRequireValue("reserveLineInputSetHelper", 0, $arg)
    }
    
    
  }
  
  
}