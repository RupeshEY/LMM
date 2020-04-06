package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/servicerequests/AcceptedWorkPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AcceptedWorkPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/servicerequests/AcceptedWorkPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AcceptedWorkPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (serviceRequest :  ServiceRequest) : int {
      return 0
    }
    
    // 'beforeCommit' attribute on Popup (id=AcceptedWorkPopup) at AcceptedWorkPopup.pcf: line 11, column 100
    function beforeCommit_10 (pickedValue :  java.lang.Object) : void {
      serviceRequest.acceptWorkAndRecordChange(newExpectedCompletionDate.moveToEndOfDay(), false)
    }
    
    // 'value' attribute on DateInput (id=ExpectedCompletionDate) at AcceptedWorkPopup.pcf: line 38, column 48
    function defaultSetter_9 (__VALUE_TO_SET :  java.lang.Object) : void {
      newExpectedCompletionDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'initialValue' attribute on Variable at AcceptedWorkPopup.pcf: line 20, column 82
    function initialValue_0 () : gw.vendormanagement.servicerequeststate.ServiceRequestStateHandler {
      return serviceRequest.createStateHandler()
    }
    
    // 'initialValue' attribute on Variable at AcceptedWorkPopup.pcf: line 24, column 30
    function initialValue_1 () : java.util.Date {
      return serviceRequest.nextExpectedCompletionDate(stateHandler)
    }
    
    // EditButtons at AcceptedWorkPopup.pcf: line 27, column 23
    function label_2 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'label' attribute on DateInput (id=ExpectedCompletionDate) at AcceptedWorkPopup.pcf: line 38, column 48
    function label_4 () : java.lang.Object {
      return serviceRequest.isInstructedToProvideQuote(stateHandler) ? DisplayKey.get("Web.ServiceRequest.ExpectedQuoteCompletionDate") : DisplayKey.get("Web.ServiceRequest.ExpectedServiceCompletionDate")
    }
    
    // 'validationExpression' attribute on DateInput (id=ExpectedCompletionDate) at AcceptedWorkPopup.pcf: line 38, column 48
    function validationExpression_3 () : java.lang.Object {
      return newExpectedCompletionDate < gw.api.util.DateUtil.currentDate().trimToMidnight() ? DisplayKey.get("Web.ServiceRequest.DateInPast") : null
    }
    
    // 'value' attribute on DateInput (id=ExpectedCompletionDate) at AcceptedWorkPopup.pcf: line 38, column 48
    function value_5 () : java.util.Date {
      return newExpectedCompletionDate
    }
    
    override property get CurrentLocation () : pcf.AcceptedWorkPopup {
      return super.CurrentLocation as pcf.AcceptedWorkPopup
    }
    
    property get newExpectedCompletionDate () : java.util.Date {
      return getVariableValue("newExpectedCompletionDate", 0) as java.util.Date
    }
    
    property set newExpectedCompletionDate ($arg :  java.util.Date) {
      setVariableValue("newExpectedCompletionDate", 0, $arg)
    }
    
    property get serviceRequest () : ServiceRequest {
      return getVariableValue("serviceRequest", 0) as ServiceRequest
    }
    
    property set serviceRequest ($arg :  ServiceRequest) {
      setVariableValue("serviceRequest", 0, $arg)
    }
    
    property get stateHandler () : gw.vendormanagement.servicerequeststate.ServiceRequestStateHandler {
      return getVariableValue("stateHandler", 0) as gw.vendormanagement.servicerequeststate.ServiceRequestStateHandler
    }
    
    property set stateHandler ($arg :  gw.vendormanagement.servicerequeststate.ServiceRequestStateHandler) {
      setVariableValue("stateHandler", 0, $arg)
    }
    
    
  }
  
  
}