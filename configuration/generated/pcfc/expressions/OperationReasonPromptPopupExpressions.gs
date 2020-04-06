package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses gw.vendormanagement.servicerequeststate.ServiceRequestOperationDefinition
uses gw.vendormanagement.servicerequeststate.ServiceRequestInvoiceOperationDefinition
@javax.annotation.Generated("config/web/pcf/claim/servicerequests/OperationReasonPromptPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class OperationReasonPromptPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/servicerequests/OperationReasonPromptPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OperationReasonPromptPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (serviceRequest :  ServiceRequest, invoice :  ServiceRequestInvoice, operation :  ServiceRequestOperation) : int {
      return 1
    }
    
    static function __constructorIndex (serviceRequest :  ServiceRequest, operation :  ServiceRequestOperation) : int {
      return 0
    }
    
    // 'beforeCommit' attribute on Popup (id=OperationReasonPromptPopup) at OperationReasonPromptPopup.pcf: line 12, column 33
    function beforeCommit_8 (pickedValue :  java.lang.Object) : void {
      performOperation()
    }
    
    // 'value' attribute on TextAreaInput (id=ReasonForOperation) at OperationReasonPromptPopup.pcf: line 54, column 38
    function defaultSetter_7 (__VALUE_TO_SET :  java.lang.Object) : void {
      operationReason = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'cancelLabel' attribute on EditButtons at OperationReasonPromptPopup.pcf: line 44, column 109
    function label_1 () : java.lang.Object {
      return gw.vendormanagement.ServiceRequestOperationDisplayHelper.getCancelLabel(operation)
    }
    
    // 'updateLabel' attribute on EditButtons at OperationReasonPromptPopup.pcf: line 44, column 109
    function label_2 () : java.lang.Object {
      return gw.vendormanagement.ServiceRequestOperationDisplayHelper.getUpdateLabel(operation)
    }
    
    // 'label' attribute on TextAreaInput (id=ReasonForOperation) at OperationReasonPromptPopup.pcf: line 54, column 38
    function label_3 () : java.lang.Object {
      return gw.vendormanagement.ServiceRequestOperationDisplayHelper.getReasonLabel(operation)
    }
    
    // 'title' attribute on TitleBar at OperationReasonPromptPopup.pcf: line 40, column 109
    function title_0 () : java.lang.String {
      return gw.vendormanagement.ServiceRequestOperationDisplayHelper.getPopupTitle(operation, invoice)
    }
    
    // 'value' attribute on TextAreaInput (id=ReasonForOperation) at OperationReasonPromptPopup.pcf: line 54, column 38
    function value_4 () : java.lang.String {
      return operationReason
    }
    
    override property get CurrentLocation () : pcf.OperationReasonPromptPopup {
      return super.CurrentLocation as pcf.OperationReasonPromptPopup
    }
    
    property get cancelLabel () : String {
      return getVariableValue("cancelLabel", 0) as String
    }
    
    property set cancelLabel ($arg :  String) {
      setVariableValue("cancelLabel", 0, $arg)
    }
    
    property get invoice () : ServiceRequestInvoice {
      return getVariableValue("invoice", 0) as ServiceRequestInvoice
    }
    
    property set invoice ($arg :  ServiceRequestInvoice) {
      setVariableValue("invoice", 0, $arg)
    }
    
    property get operation () : ServiceRequestOperation {
      return getVariableValue("operation", 0) as ServiceRequestOperation
    }
    
    property set operation ($arg :  ServiceRequestOperation) {
      setVariableValue("operation", 0, $arg)
    }
    
    property get operationReason () : String {
      return getVariableValue("operationReason", 0) as String
    }
    
    property set operationReason ($arg :  String) {
      setVariableValue("operationReason", 0, $arg)
    }
    
    property get serviceRequest () : ServiceRequest {
      return getVariableValue("serviceRequest", 0) as ServiceRequest
    }
    
    property set serviceRequest ($arg :  ServiceRequest) {
      setVariableValue("serviceRequest", 0, $arg)
    }
    
    property get updateLabel () : String {
      return getVariableValue("updateLabel", 0) as String
    }
    
    property set updateLabel ($arg :  String) {
      setVariableValue("updateLabel", 0, $arg)
    }
    
    function performOperation() {
      if (invoice != null) {
        var context = new ServiceRequestInvoiceOperationDefinition.OperationContext(){:Reason = operationReason}
        invoice.performOperation(operation, context, false) 
      } else {
        var context = new ServiceRequestOperationDefinition.OperationContext(){:Reason = operationReason}
        serviceRequest.performOperation(operation, context, false)
      } 
    }
    
    
  }
  
  
}