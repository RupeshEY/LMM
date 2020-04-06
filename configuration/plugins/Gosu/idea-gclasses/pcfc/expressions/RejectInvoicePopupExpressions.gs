package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses gw.vendormanagement.servicerequeststate.ServiceRequestInvoiceOperationDefinition
@javax.annotation.Generated("config/web/pcf/claim/servicerequests/RejectInvoicePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RejectInvoicePopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/servicerequests/RejectInvoicePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RejectInvoicePopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (invoice :  ServiceRequestInvoice) : int {
      return 0
    }
    
    // 'beforeCommit' attribute on Popup (id=RejectInvoicePopup) at RejectInvoicePopup.pcf: line 11, column 101
    function beforeCommit_3 (pickedValue :  java.lang.Object) : void {
      rejectInvoice()
    }
    
    // 'value' attribute on TextAreaInput (id=RejectionReason) at RejectInvoicePopup.pcf: line 35, column 38
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      rejectionReason = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextAreaInput (id=RejectionReason) at RejectInvoicePopup.pcf: line 35, column 38
    function value_0 () : java.lang.String {
      return rejectionReason
    }
    
    override property get CurrentLocation () : pcf.RejectInvoicePopup {
      return super.CurrentLocation as pcf.RejectInvoicePopup
    }
    
    property get invoice () : ServiceRequestInvoice {
      return getVariableValue("invoice", 0) as ServiceRequestInvoice
    }
    
    property set invoice ($arg :  ServiceRequestInvoice) {
      setVariableValue("invoice", 0, $arg)
    }
    
    property get rejectionReason () : String {
      return getVariableValue("rejectionReason", 0) as String
    }
    
    property set rejectionReason ($arg :  String) {
      setVariableValue("rejectionReason", 0, $arg)
    }
    
    function rejectInvoice() {
      var context = new ServiceRequestInvoiceOperationDefinition.OperationContext(){:Reason = rejectionReason}
      invoice.performOperation(TC_REJECTINVOICE, context, false)
    }
    
    
  }
  
  
}