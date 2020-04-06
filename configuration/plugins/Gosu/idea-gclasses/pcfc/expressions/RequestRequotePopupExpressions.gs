package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses gw.vendormanagement.servicerequeststate.ServiceRequestOperationDefinition
@javax.annotation.Generated("config/web/pcf/claim/servicerequests/RequestRequotePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RequestRequotePopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/servicerequests/RequestRequotePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RequestRequotePopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (serviceRequest :  ServiceRequest) : int {
      return 0
    }
    
    // 'beforeCommit' attribute on Popup (id=RequestRequotePopup) at RequestRequotePopup.pcf: line 11, column 102
    function beforeCommit_10 (pickedValue :  java.lang.Object) : void {
      requestRequote()
    }
    
    // 'value' attribute on TextAreaInput (id=ReasonForRequestingRequote) at RequestRequotePopup.pcf: line 36, column 36
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      requoteReason = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on DateInput (id=RequestedQuoteCompletionDate) at RequestRequotePopup.pcf: line 44, column 51
    function defaultSetter_9 (__VALUE_TO_SET :  java.lang.Object) : void {
      requestedQuoteCompletionDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'initialValue' attribute on Variable at RequestRequotePopup.pcf: line 20, column 30
    function initialValue_0 () : java.util.Date {
      return serviceRequest.DefaultRequestedQuoteCompletionDate
    }
    
    // EditButtons at RequestRequotePopup.pcf: line 26, column 23
    function label_1 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'validationExpression' attribute on DateInput (id=RequestedQuoteCompletionDate) at RequestRequotePopup.pcf: line 44, column 51
    function validationExpression_5 () : java.lang.Object {
      return requestedQuoteCompletionDate < gw.api.util.DateUtil.currentDate().trimToMidnight() ? DisplayKey.get("Web.ServiceRequest.DateInPast") : null
    }
    
    // 'value' attribute on TextAreaInput (id=ReasonForRequestingRequote) at RequestRequotePopup.pcf: line 36, column 36
    function value_2 () : java.lang.String {
      return requoteReason
    }
    
    // 'value' attribute on DateInput (id=RequestedQuoteCompletionDate) at RequestRequotePopup.pcf: line 44, column 51
    function value_6 () : java.util.Date {
      return requestedQuoteCompletionDate
    }
    
    override property get CurrentLocation () : pcf.RequestRequotePopup {
      return super.CurrentLocation as pcf.RequestRequotePopup
    }
    
    property get requestedQuoteCompletionDate () : java.util.Date {
      return getVariableValue("requestedQuoteCompletionDate", 0) as java.util.Date
    }
    
    property set requestedQuoteCompletionDate ($arg :  java.util.Date) {
      setVariableValue("requestedQuoteCompletionDate", 0, $arg)
    }
    
    property get requoteReason () : String {
      return getVariableValue("requoteReason", 0) as String
    }
    
    property set requoteReason ($arg :  String) {
      setVariableValue("requoteReason", 0, $arg)
    }
    
    property get serviceRequest () : ServiceRequest {
      return getVariableValue("serviceRequest", 0) as ServiceRequest
    }
    
    property set serviceRequest ($arg :  ServiceRequest) {
      setVariableValue("serviceRequest", 0, $arg)
    }
    
    function requestRequote() {
      var context = new ServiceRequestOperationDefinition.OperationContext(){:Statement = serviceRequest.LatestQuote,
                                                                             :Reason = requoteReason,
                                                                             :RequestedCompletionDate = requestedQuoteCompletionDate.moveToEndOfDay()}
      serviceRequest.performOperation(TC_REQUESTREQUOTE, context, false)
    }
    
    
  }
  
  
}