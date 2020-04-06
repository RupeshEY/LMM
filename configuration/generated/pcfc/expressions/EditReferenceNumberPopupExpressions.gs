package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/servicerequests/EditReferenceNumberPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditReferenceNumberPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/servicerequests/EditReferenceNumberPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditReferenceNumberPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (serviceRequest :  ServiceRequest) : int {
      return 0
    }
    
    // 'beforeCommit' attribute on Popup (id=EditReferenceNumberPopup) at EditReferenceNumberPopup.pcf: line 10, column 100
    function beforeCommit_6 (pickedValue :  java.lang.Object) : void {
      validateAndRecordChange(serviceRequest)
    }
    
    // 'value' attribute on TextInput (id=ServiceRequestReferenceNumber) at EditReferenceNumberPopup.pcf: line 31, column 67
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      serviceRequest.ServiceRequestReferenceNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'initialValue' attribute on Variable at EditReferenceNumberPopup.pcf: line 19, column 32
    function initialValue_0 () : java.lang.String {
      return serviceRequest.ServiceRequestReferenceNumber
    }
    
    // EditButtons at EditReferenceNumberPopup.pcf: line 22, column 23
    function label_1 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'value' attribute on TextInput (id=ServiceRequestReferenceNumber) at EditReferenceNumberPopup.pcf: line 31, column 67
    function valueRoot_5 () : java.lang.Object {
      return serviceRequest
    }
    
    override property get CurrentLocation () : pcf.EditReferenceNumberPopup {
      return super.CurrentLocation as pcf.EditReferenceNumberPopup
    }
    
    property get originalReferenceNumber () : java.lang.String {
      return getVariableValue("originalReferenceNumber", 0) as java.lang.String
    }
    
    property set originalReferenceNumber ($arg :  java.lang.String) {
      setVariableValue("originalReferenceNumber", 0, $arg)
    }
    
    property get serviceRequest () : ServiceRequest {
      return getVariableValue("serviceRequest", 0) as ServiceRequest
    }
    
    property set serviceRequest ($arg :  ServiceRequest) {
      setVariableValue("serviceRequest", 0, $arg)
    }
    
    function validateAndRecordChange(sr : ServiceRequest) {
      if (serviceRequest.ServiceRequestReferenceNumber != originalReferenceNumber) {
        var reasonForChange = DisplayKey.get("Web.ServiceRequest.StateTransition.ReferenceNumberChanged", serviceRequest.ServiceRequestReferenceNumber)
        sr.recordChange(reasonForChange, null, null, User.util.CurrentUser.Contact)
      }
    }
    
    
  }
  
  
}