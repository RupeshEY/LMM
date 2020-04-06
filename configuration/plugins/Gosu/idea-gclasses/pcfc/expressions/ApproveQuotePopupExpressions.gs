package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses gw.vendormanagement.servicerequeststate.ServiceRequestOperationDefinition
@javax.annotation.Generated("config/web/pcf/claim/servicerequests/ApproveQuotePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ApproveQuotePopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/servicerequests/ApproveQuotePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ApproveQuotePopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (serviceRequest :  ServiceRequest) : int {
      return 0
    }
    
    // 'beforeCommit' attribute on Popup (id=ApproveQuotePopup) at ApproveQuotePopup.pcf: line 10, column 100
    function beforeCommit_7 (pickedValue :  java.lang.Object) : void {
      approveQuote()
    }
    
    // 'value' attribute on DateInput (id=RequestedServiceCompletionDate) at ApproveQuotePopup.pcf: line 33, column 53
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      requestedServiceCompletionDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'initialValue' attribute on Variable at ApproveQuotePopup.pcf: line 19, column 30
    function initialValue_0 () : java.util.Date {
      return java.util.Date.Today.addBusinessDays(serviceRequest.LatestQuote.ExpectedDaysToPerformService)
    }
    
    // EditButtons at ApproveQuotePopup.pcf: line 22, column 23
    function label_1 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'validationExpression' attribute on DateInput (id=RequestedServiceCompletionDate) at ApproveQuotePopup.pcf: line 33, column 53
    function validationExpression_2 () : java.lang.Object {
      return requestedServiceCompletionDate < gw.api.util.DateUtil.currentDate().trimToMidnight() ? DisplayKey.get("Web.ServiceRequest.DateInPast") : null
    }
    
    // 'value' attribute on DateInput (id=RequestedServiceCompletionDate) at ApproveQuotePopup.pcf: line 33, column 53
    function value_3 () : java.util.Date {
      return requestedServiceCompletionDate
    }
    
    override property get CurrentLocation () : pcf.ApproveQuotePopup {
      return super.CurrentLocation as pcf.ApproveQuotePopup
    }
    
    property get requestedServiceCompletionDate () : java.util.Date {
      return getVariableValue("requestedServiceCompletionDate", 0) as java.util.Date
    }
    
    property set requestedServiceCompletionDate ($arg :  java.util.Date) {
      setVariableValue("requestedServiceCompletionDate", 0, $arg)
    }
    
    property get serviceRequest () : ServiceRequest {
      return getVariableValue("serviceRequest", 0) as ServiceRequest
    }
    
    property set serviceRequest ($arg :  ServiceRequest) {
      setVariableValue("serviceRequest", 0, $arg)
    }
    
    function approveQuote () {
      serviceRequest.performOperation(TC_APPROVEQUOTE,
                                      new ServiceRequestOperationDefinition.OperationContext(){
                                          :Statement = serviceRequest.LatestQuote, 
                                          :RequestedCompletionDate = requestedServiceCompletionDate.moveToEndOfDay()}, 
                                      false)
    }
    
    
  }
  
  
}