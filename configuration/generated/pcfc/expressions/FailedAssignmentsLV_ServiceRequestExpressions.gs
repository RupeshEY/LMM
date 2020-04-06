package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/assignment/FailedAssignmentsLV.ServiceRequest.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FailedAssignmentsLV_ServiceRequestExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/assignment/FailedAssignmentsLV.ServiceRequest.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FailedAssignmentsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at FailedAssignmentsLV.ServiceRequest.pcf: line 25, column 32
    function sortValue_0 (ServiceRequest :  ServiceRequest) : java.lang.Object {
      return true
    }
    
    // 'value' attribute on RowIterator at FailedAssignmentsLV.ServiceRequest.pcf: line 30, column 56
    function sortValue_1 (ServiceRequest :  ServiceRequest) : java.lang.Object {
      return ServiceRequest.ServiceRequestNumber
    }
    
    // 'value' attribute on RowIterator at FailedAssignmentsLV.ServiceRequest.pcf: line 34, column 65
    function sortValue_2 (ServiceRequest :  ServiceRequest) : java.lang.Object {
      return ServiceRequest.ServiceRequestReferenceNumber
    }
    
    // 'value' attribute on RowIterator at FailedAssignmentsLV.ServiceRequest.pcf: line 38, column 50
    function sortValue_3 (ServiceRequest :  ServiceRequest) : java.lang.Object {
      return ServiceRequest.ServicesString
    }
    
    // 'value' attribute on RowIterator at FailedAssignmentsLV.ServiceRequest.pcf: line 45, column 50
    function sortValue_4 (ServiceRequest :  ServiceRequest) : java.lang.Object {
      return ServiceRequest.SpecialistName
    }
    
    // 'value' attribute on RowIterator at FailedAssignmentsLV.ServiceRequest.pcf: line 49, column 64
    function sortValue_5 (ServiceRequest :  ServiceRequest) : java.lang.Object {
      return ServiceRequest.nextExpectedCompletionDate()
    }
    
    // 'value' attribute on RowIterator at FailedAssignmentsLV.ServiceRequest.pcf: line 54, column 55
    function sortValue_6 (ServiceRequest :  ServiceRequest) : java.lang.Object {
      return ServiceRequest?.LatestQuote.Amount
    }
    
    // 'value' attribute on RowIterator at FailedAssignmentsLV.ServiceRequest.pcf: line 16, column 39
    function value_29 () : entity.Assignable[] {
      return AssignmentPopup.getFailedAssignables()
    }
    
    // 'type' attribute on RowIterator at FailedAssignmentsLV.ServiceRequest.pcf: line 16, column 39
    function verifyIteratorType_30 () : void {
      var entry : entity.Assignable = null
      var typedEntry : ServiceRequest
      // If this cast fails to compile then the type specified by the 'type' attribute on
      // 'RowIterator' is not compatible with the member type of the 'valueType' attribute
      typedEntry = entry as ServiceRequest
    }
    
    property get AssignmentPopup () : gw.api.assignment.AssignmentPopup {
      return getRequireValue("AssignmentPopup", 0) as gw.api.assignment.AssignmentPopup
    }
    
    property set AssignmentPopup ($arg :  gw.api.assignment.AssignmentPopup) {
      setRequireValue("AssignmentPopup", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/assignment/FailedAssignmentsLV.ServiceRequest.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends FailedAssignmentsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'actionAvailable' attribute on TextCell (id=Specialist) at FailedAssignmentsLV.ServiceRequest.pcf: line 45, column 50
    function actionAvailable_21 () : java.lang.Boolean {
      return ServiceRequest.Specialist != null
    }
    
    // 'action' attribute on TextCell (id=Specialist) at FailedAssignmentsLV.ServiceRequest.pcf: line 45, column 50
    function action_19 () : void {
      ClaimContactDetailPopup.push(ServiceRequest.Specialist, ServiceRequest.Claim)
    }
    
    // 'action' attribute on TextCell (id=Specialist) at FailedAssignmentsLV.ServiceRequest.pcf: line 45, column 50
    function action_dest_20 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(ServiceRequest.Specialist, ServiceRequest.Claim)
    }
    
    // 'iconLabel' attribute on BooleanRadioCell (id=Kind) at FailedAssignmentsLV.ServiceRequest.pcf: line 25, column 32
    function iconLabel_8 () : java.lang.String {
      return ServiceRequest.Kind.Label
    }
    
    // 'icon' attribute on BooleanRadioCell (id=Kind) at FailedAssignmentsLV.ServiceRequest.pcf: line 25, column 32
    function icon_7 () : java.lang.String {
      return ServiceRequest.Kind.Icon
    }
    
    // 'value' attribute on TextCell (id=ServiceRequestNumber) at FailedAssignmentsLV.ServiceRequest.pcf: line 30, column 56
    function valueRoot_11 () : java.lang.Object {
      return ServiceRequest
    }
    
    // 'value' attribute on CurrencyCell (id=QuoteAmount) at FailedAssignmentsLV.ServiceRequest.pcf: line 54, column 55
    function valueRoot_28 () : java.lang.Object {
      return ServiceRequest?.LatestQuote
    }
    
    // 'value' attribute on TextCell (id=ServiceRequestReferenceNumber) at FailedAssignmentsLV.ServiceRequest.pcf: line 34, column 65
    function value_12 () : java.lang.String {
      return ServiceRequest.ServiceRequestReferenceNumber
    }
    
    // 'value' attribute on TextCell (id=Services) at FailedAssignmentsLV.ServiceRequest.pcf: line 38, column 50
    function value_15 () : java.lang.String {
      return ServiceRequest.ServicesString
    }
    
    // 'value' attribute on TextCell (id=Specialist) at FailedAssignmentsLV.ServiceRequest.pcf: line 45, column 50
    function value_18 () : java.lang.String {
      return ServiceRequest.SpecialistName
    }
    
    // 'value' attribute on DateCell (id=ExpectedCompletionDate) at FailedAssignmentsLV.ServiceRequest.pcf: line 49, column 64
    function value_24 () : java.util.Date {
      return ServiceRequest.nextExpectedCompletionDate()
    }
    
    // 'value' attribute on CurrencyCell (id=QuoteAmount) at FailedAssignmentsLV.ServiceRequest.pcf: line 54, column 55
    function value_26 () : gw.api.financials.CurrencyAmount {
      return ServiceRequest?.LatestQuote.Amount
    }
    
    // 'value' attribute on TextCell (id=ServiceRequestNumber) at FailedAssignmentsLV.ServiceRequest.pcf: line 30, column 56
    function value_9 () : java.lang.String {
      return ServiceRequest.ServiceRequestNumber
    }
    
    property get ServiceRequest () : ServiceRequest {
      return getIteratedValue(1) as ServiceRequest
    }
    
    
  }
  
  
}