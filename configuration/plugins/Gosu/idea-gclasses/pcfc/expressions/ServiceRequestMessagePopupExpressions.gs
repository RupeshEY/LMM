package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/servicerequests/ServiceRequestMessagePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ServiceRequestMessagePopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/servicerequests/ServiceRequestMessagePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ServiceRequestMessagePopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (serviceRequest :  ServiceRequest) : int {
      return 0
    }
    
    static function __constructorIndex (serviceRequest :  ServiceRequest, subject :  String) : int {
      return 1
    }
    
    // 'beforeCancel' attribute on Popup (id=ServiceRequestMessagePopup) at ServiceRequestMessagePopup.pcf: line 12, column 79
    function beforeCancel_14 () : void {
      removeUncomittedMessage()
    }
    
    // 'value' attribute on TextAreaInput (id=MessageContent) at ServiceRequestMessagePopup.pcf: line 59, column 49
    function defaultSetter_12 (__VALUE_TO_SET :  java.lang.Object) : void {
      serviceRequestMessage.Body = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyRadioInput (id=MessageType) at ServiceRequestMessagePopup.pcf: line 42, column 60
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      serviceRequestMessage.Type = (__VALUE_TO_SET as typekey.ServiceRequestMessageType)
    }
    
    // 'value' attribute on TextInput (id=MessageTitle) at ServiceRequestMessagePopup.pcf: line 50, column 50
    function defaultSetter_8 (__VALUE_TO_SET :  java.lang.Object) : void {
      serviceRequestMessage.Title = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'initialValue' attribute on Variable at ServiceRequestMessagePopup.pcf: line 20, column 37
    function initialValue_0 () : ServiceRequestMessage {
      return createServiceRequestMessage()
    }
    
    // 'pickValue' attribute on EditButtons at ServiceRequestMessagePopup.pcf: line 31, column 86
    function pickValue_1 () : ServiceRequestMessage {
      return serviceRequestMessage
    }
    
    // 'value' attribute on TypeKeyRadioInput (id=MessageType) at ServiceRequestMessagePopup.pcf: line 42, column 60
    function valueRoot_5 () : java.lang.Object {
      return serviceRequestMessage
    }
    
    // 'value' attribute on TextAreaInput (id=MessageContent) at ServiceRequestMessagePopup.pcf: line 59, column 49
    function value_10 () : java.lang.String {
      return serviceRequestMessage.Body
    }
    
    // 'value' attribute on TypeKeyRadioInput (id=MessageType) at ServiceRequestMessagePopup.pcf: line 42, column 60
    function value_2 () : typekey.ServiceRequestMessageType {
      return serviceRequestMessage.Type
    }
    
    // 'value' attribute on TextInput (id=MessageTitle) at ServiceRequestMessagePopup.pcf: line 50, column 50
    function value_6 () : java.lang.String {
      return serviceRequestMessage.Title
    }
    
    override property get CurrentLocation () : pcf.ServiceRequestMessagePopup {
      return super.CurrentLocation as pcf.ServiceRequestMessagePopup
    }
    
    property get serviceRequest () : ServiceRequest {
      return getVariableValue("serviceRequest", 0) as ServiceRequest
    }
    
    property set serviceRequest ($arg :  ServiceRequest) {
      setVariableValue("serviceRequest", 0, $arg)
    }
    
    property get serviceRequestMessage () : ServiceRequestMessage {
      return getVariableValue("serviceRequestMessage", 0) as ServiceRequestMessage
    }
    
    property set serviceRequestMessage ($arg :  ServiceRequestMessage) {
      setVariableValue("serviceRequestMessage", 0, $arg)
    }
    
    property get subject () : String {
      return getVariableValue("subject", 0) as String
    }
    
    property set subject ($arg :  String) {
      setVariableValue("subject", 0, $arg)
    }
    
    function createServiceRequestMessage() : ServiceRequestMessage {
      var scm = new ServiceRequestMessage(serviceRequest.Bundle)
      scm.Author = User.util.CurrentUser.Contact
      scm.SendDate = java.util.Date.CurrentDate 
      if (subject.HasContent) {
        if (not subject.startsWith(DisplayKey.get("Web.ServiceRequest.Message.ReplyPrefix"))) {
          scm.Title = DisplayKey.get("Web.ServiceRequest.Message.ReplyPrefix") + subject
        } else {
          scm.Title = subject
        }
      } 
      scm.SentFromPortal = false
      scm.addEvent(gw.cc.vendormanagement.entity.ServiceRequestMessage.MESSAGE_TO_VENDOR_ADDED_EVENT)
      serviceRequest.addToMessages(scm)
      return scm
    }
    
    function removeUncomittedMessage() {
      serviceRequestMessage.remove()
    }
    
    
  }
  
  
}