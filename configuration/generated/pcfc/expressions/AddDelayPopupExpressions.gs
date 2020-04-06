package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/servicerequests/AddDelayPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AddDelayPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/servicerequests/AddDelayPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddDelayPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (serviceRequest :  ServiceRequest) : int {
      return 0
    }
    
    // 'beforeCommit' attribute on Popup (id=AddDelayPopup) at AddDelayPopup.pcf: line 10, column 18
    function beforeCommit_16 (pickedValue :  java.lang.Object) : void {
      serviceRequest.setExpectedCompletionDateAndRecordChange(newExpectedCompletionDate.moveToEndOfDay(), delayReason, false, isService, stateHandler)
    }
    
    // 'value' attribute on DateInput (id=ExpectedCompletionDate) at AddDelayPopup.pcf: line 50, column 48
    function defaultSetter_12 (__VALUE_TO_SET :  java.lang.Object) : void {
      newExpectedCompletionDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TextAreaInput (id=ReasonForAddingDelay) at AddDelayPopup.pcf: line 56, column 34
    function defaultSetter_15 (__VALUE_TO_SET :  java.lang.Object) : void {
      delayReason = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'initialValue' attribute on Variable at AddDelayPopup.pcf: line 19, column 82
    function initialValue_0 () : gw.vendormanagement.servicerequeststate.ServiceRequestStateHandler {
      return serviceRequest.createStateHandler()
    }
    
    // 'initialValue' attribute on Variable at AddDelayPopup.pcf: line 23, column 30
    function initialValue_1 () : java.util.Date {
      return serviceRequest.nextExpectedCompletionDate(stateHandler)
    }
    
    // 'initialValue' attribute on Variable at AddDelayPopup.pcf: line 34, column 23
    function initialValue_3 () : boolean {
      return serviceRequest.expectedServiceCompletionDateApplies(stateHandler)
    }
    
    // EditButtons at AddDelayPopup.pcf: line 39, column 23
    function label_5 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'label' attribute on DateInput (id=ExpectedCompletionDate) at AddDelayPopup.pcf: line 50, column 48
    function label_7 () : java.lang.Object {
      return isService ? DisplayKey.get("Web.ServiceRequest.ExpectedServiceCompletionDate") : DisplayKey.get("Web.ServiceRequest.ExpectedQuoteCompletionDate")
    }
    
    // 'title' attribute on Popup (id=AddDelayPopup) at AddDelayPopup.pcf: line 10, column 18
    static function title_17 (serviceRequest :  ServiceRequest) : java.lang.Object {
      return null
    }
    
    // 'title' attribute on TitleBar at AddDelayPopup.pcf: line 37, column 268
    function title_4 () : java.lang.String {
      return DisplayKey.get("Web.ServiceRequest.StateTransition.AddDelayPopup.Title", isService ? DisplayKey.get("Web.ServiceRequest.ExpectedServiceCompletionDate") : DisplayKey.get("Web.ServiceRequest.ExpectedQuoteCompletionDate"))
    }
    
    // 'validationExpression' attribute on DateInput (id=ExpectedCompletionDate) at AddDelayPopup.pcf: line 50, column 48
    function validationExpression_6 () : java.lang.Object {
      return validateDelayDate()
    }
    
    // 'value' attribute on TextAreaInput (id=ReasonForAddingDelay) at AddDelayPopup.pcf: line 56, column 34
    function value_13 () : java.lang.String {
      return delayReason
    }
    
    // 'value' attribute on DateInput (id=ExpectedCompletionDate) at AddDelayPopup.pcf: line 50, column 48
    function value_8 () : java.util.Date {
      return newExpectedCompletionDate
    }
    
    override property get CurrentLocation () : pcf.AddDelayPopup {
      return super.CurrentLocation as pcf.AddDelayPopup
    }
    
    property get delayReason () : String {
      return getVariableValue("delayReason", 0) as String
    }
    
    property set delayReason ($arg :  String) {
      setVariableValue("delayReason", 0, $arg)
    }
    
    property get isService () : boolean {
      return getVariableValue("isService", 0) as java.lang.Boolean
    }
    
    property set isService ($arg :  boolean) {
      setVariableValue("isService", 0, $arg)
    }
    
    property get newExpectedCompletionDate () : java.util.Date {
      return getVariableValue("newExpectedCompletionDate", 0) as java.util.Date
    }
    
    property set newExpectedCompletionDate ($arg :  java.util.Date) {
      setVariableValue("newExpectedCompletionDate", 0, $arg)
    }
    
    property get originalExpectedCompletionDate () : java.util.Date {
      return getVariableValue("originalExpectedCompletionDate", 0) as java.util.Date
    }
    
    property set originalExpectedCompletionDate ($arg :  java.util.Date) {
      setVariableValue("originalExpectedCompletionDate", 0, $arg)
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
    
    function validateDelayDate() : String {
      if (newExpectedCompletionDate < gw.api.util.DateUtil.currentDate().trimToMidnight()) {
        return DisplayKey.get("Web.ServiceRequest.DateInPast")
      } else if (newExpectedCompletionDate == originalExpectedCompletionDate) {
        return DisplayKey.get("Web.ServiceRequest.StateTransition.AddDelayPopup.NoChangesError")
      } else {
        return null
      }
    }
    
    
  }
  
  
}