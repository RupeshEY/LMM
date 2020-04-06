package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/ClaimTripSegmentDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimTripSegmentDetailDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/ClaimTripSegmentDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimTripSegmentDetailDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on Link (id=Approve) at ClaimTripSegmentDetailDV.pcf: line 135, column 61
    function action_75 () : void {
      aTripSegment.Assessment = TC_APPROVE
    }
    
    // 'action' attribute on Link (id=Review) at ClaimTripSegmentDetailDV.pcf: line 142, column 60
    function action_77 () : void {
      aTripSegment.Assessment = TC_REVIEW
    }
    
    // 'action' attribute on Link (id=Deny) at ClaimTripSegmentDetailDV.pcf: line 149, column 58
    function action_79 () : void {
      aTripSegment.Assessment = TC_DENY
    }
    
    // 'action' attribute on Link (id=Clear) at ClaimTripSegmentDetailDV.pcf: line 156, column 54
    function action_81 () : void {
      aTripSegment.Assessment = null
    }
    
    // 'available' attribute on TextAreaInput (id=ReasonForDenial) at ClaimTripSegmentDetailDV.pcf: line 167, column 56
    function available_82 () : java.lang.Boolean {
      return aTripSegment.ReasonForDenial == null or aTripSegment.ReasonForDenial.length == 0
    }
    
    // 'value' attribute on TextInput (id=CarrierNumber) at ClaimTripSegmentDetailDV.pcf: line 35, column 45
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      aTripSegment.CarrierNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=PortOfEmbarkation) at ClaimTripSegmentDetailDV.pcf: line 40, column 49
    function defaultSetter_14 (__VALUE_TO_SET :  java.lang.Object) : void {
      aTripSegment.PortOfEmbarkation = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=PortOfDisembarkation) at ClaimTripSegmentDetailDV.pcf: line 45, column 52
    function defaultSetter_18 (__VALUE_TO_SET :  java.lang.Object) : void {
      aTripSegment.PortOfDisembarkation = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=TransportType) at ClaimTripSegmentDetailDV.pcf: line 23, column 43
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      aTripSegment.TransportType = (__VALUE_TO_SET as typekey.TransportType)
    }
    
    // 'value' attribute on DateInput (id=StartedOn) at ClaimTripSegmentDetailDV.pcf: line 53, column 41
    function defaultSetter_24 (__VALUE_TO_SET :  java.lang.Object) : void {
      aTripSegment.StartDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateInput (id=EndedOn) at ClaimTripSegmentDetailDV.pcf: line 61, column 39
    function defaultSetter_30 (__VALUE_TO_SET :  java.lang.Object) : void {
      aTripSegment.EndDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on BooleanRadioInput (id=SegmentCancelOnly) at ClaimTripSegmentDetailDV.pcf: line 70, column 151
    function defaultSetter_39 (__VALUE_TO_SET :  java.lang.Object) : void {
      aTripSegment.CancelOnly = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextAreaInput (id=ReasonForAddnlTravelOrCancellation) at ClaimTripSegmentDetailDV.pcf: line 79, column 53
    function defaultSetter_43 (__VALUE_TO_SET :  java.lang.Object) : void {
      aTripSegment.ReasonForCancellation = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on CurrencyInput (id=PaidAmount) at ClaimTripSegmentDetailDV.pcf: line 90, column 153
    function defaultSetter_49 (__VALUE_TO_SET :  java.lang.Object) : void {
      aTripSegment.PaidAmount = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on CurrencyInput (id=CancellationFees) at ClaimTripSegmentDetailDV.pcf: line 97, column 149
    function defaultSetter_55 (__VALUE_TO_SET :  java.lang.Object) : void {
      aTripSegment.CancellationFees = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on TextInput (id=CarrierName) at ClaimTripSegmentDetailDV.pcf: line 30, column 43
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      aTripSegment.CarrierName = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on CurrencyInput (id=AgentFees) at ClaimTripSegmentDetailDV.pcf: line 104, column 149
    function defaultSetter_61 (__VALUE_TO_SET :  java.lang.Object) : void {
      aTripSegment.AgentFees = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on CurrencyInput (id=OtherFees) at ClaimTripSegmentDetailDV.pcf: line 111, column 55
    function defaultSetter_67 (__VALUE_TO_SET :  java.lang.Object) : void {
      aTripSegment.OtherFees = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on TextAreaInput (id=ReasonForDenial) at ClaimTripSegmentDetailDV.pcf: line 167, column 56
    function defaultSetter_89 (__VALUE_TO_SET :  java.lang.Object) : void {
      aTripSegment.ReasonForDenial = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'required' attribute on BooleanRadioInput (id=SegmentCancelOnly) at ClaimTripSegmentDetailDV.pcf: line 70, column 151
    function required_37 () : java.lang.Boolean {
      return aTripSegment.TransportType == TC_AIRLINE or aTripSegment.TransportType == TC_BUS or aTripSegment.TransportType == TC_CRUISE_SHIP
    }
    
    // 'validationExpression' attribute on DateInput (id=StartedOn) at ClaimTripSegmentDetailDV.pcf: line 53, column 41
    function validationExpression_20 () : java.lang.Object {
      return aTripSegment.StartDate > aTripSegment.TripIncident.TripRU.EndDate ? DisplayKey.get("Web.ClaimPolicy.Trips.Segment.DepartureDate.Validation") : null
    }
    
    // 'validationExpression' attribute on DateInput (id=EndedOn) at ClaimTripSegmentDetailDV.pcf: line 61, column 39
    function validationExpression_26 () : java.lang.Object {
      return aTripSegment.StartDate > aTripSegment.EndDate ? DisplayKey.get("Web.ClaimPolicy.Trips.Segment.ArrivalDate.Validation") : null
    }
    
    // 'validationExpression' attribute on BooleanRadioInput (id=SegmentCancelOnly) at ClaimTripSegmentDetailDV.pcf: line 70, column 151
    function validationExpression_32 () : java.lang.Object {
      return aTripSegment.CancelOnly and aTripSegment.AddnlTripSegments.length > 0 ? DisplayKey.get("Web.ClaimPolicy.Trips.Segment.CancelOnly.Validate") : null
    }
    
    // 'value' attribute on TypeKeyInput (id=TransportType) at ClaimTripSegmentDetailDV.pcf: line 23, column 43
    function valueRoot_3 () : java.lang.Object {
      return aTripSegment
    }
    
    // 'value' attribute on TypeKeyInput (id=TransportType) at ClaimTripSegmentDetailDV.pcf: line 23, column 43
    function value_0 () : typekey.TransportType {
      return aTripSegment.TransportType
    }
    
    // 'value' attribute on TextInput (id=PortOfEmbarkation) at ClaimTripSegmentDetailDV.pcf: line 40, column 49
    function value_12 () : java.lang.String {
      return aTripSegment.PortOfEmbarkation
    }
    
    // 'value' attribute on TextInput (id=PortOfDisembarkation) at ClaimTripSegmentDetailDV.pcf: line 45, column 52
    function value_16 () : java.lang.String {
      return aTripSegment.PortOfDisembarkation
    }
    
    // 'value' attribute on DateInput (id=StartedOn) at ClaimTripSegmentDetailDV.pcf: line 53, column 41
    function value_21 () : java.util.Date {
      return aTripSegment.StartDate
    }
    
    // 'value' attribute on DateInput (id=EndedOn) at ClaimTripSegmentDetailDV.pcf: line 61, column 39
    function value_27 () : java.util.Date {
      return aTripSegment.EndDate
    }
    
    // 'value' attribute on BooleanRadioInput (id=SegmentCancelOnly) at ClaimTripSegmentDetailDV.pcf: line 70, column 151
    function value_34 () : java.lang.Boolean {
      return aTripSegment.CancelOnly
    }
    
    // 'value' attribute on TextInput (id=CarrierName) at ClaimTripSegmentDetailDV.pcf: line 30, column 43
    function value_4 () : java.lang.String {
      return aTripSegment.CarrierName
    }
    
    // 'value' attribute on TextAreaInput (id=ReasonForAddnlTravelOrCancellation) at ClaimTripSegmentDetailDV.pcf: line 79, column 53
    function value_41 () : java.lang.String {
      return aTripSegment.ReasonForCancellation
    }
    
    // 'value' attribute on CurrencyInput (id=PaidAmount) at ClaimTripSegmentDetailDV.pcf: line 90, column 153
    function value_46 () : gw.api.financials.CurrencyAmount {
      return aTripSegment.PaidAmount
    }
    
    // 'value' attribute on CurrencyInput (id=CancellationFees) at ClaimTripSegmentDetailDV.pcf: line 97, column 149
    function value_52 () : gw.api.financials.CurrencyAmount {
      return aTripSegment.CancellationFees
    }
    
    // 'value' attribute on CurrencyInput (id=AgentFees) at ClaimTripSegmentDetailDV.pcf: line 104, column 149
    function value_58 () : gw.api.financials.CurrencyAmount {
      return aTripSegment.AgentFees
    }
    
    // 'value' attribute on CurrencyInput (id=OtherFees) at ClaimTripSegmentDetailDV.pcf: line 111, column 55
    function value_64 () : gw.api.financials.CurrencyAmount {
      return aTripSegment.OtherFees
    }
    
    // 'value' attribute on TypeKeyInput (id=Assessment) at ClaimTripSegmentDetailDV.pcf: line 119, column 47
    function value_69 () : typekey.AssessmentAction {
      return aTripSegment.Assessment
    }
    
    // 'value' attribute on CurrencyInput (id=FinancialImpact) at ClaimTripSegmentDetailDV.pcf: line 124, column 65
    function value_72 () : gw.api.financials.CurrencyAmount {
      return aTripSegment.getFinancialImpact(  TC_APPROVE )
    }
    
    // 'value' attribute on TextInput (id=CarrierNumber) at ClaimTripSegmentDetailDV.pcf: line 35, column 45
    function value_8 () : java.lang.String {
      return aTripSegment.CarrierNumber
    }
    
    // 'value' attribute on TextAreaInput (id=ReasonForDenial) at ClaimTripSegmentDetailDV.pcf: line 167, column 56
    function value_84 () : java.lang.String {
      return aTripSegment.ReasonForDenial
    }
    
    // 'visible' attribute on BooleanRadioInput (id=SegmentCancelOnly) at ClaimTripSegmentDetailDV.pcf: line 70, column 151
    function visible_33 () : java.lang.Boolean {
      return aTripSegment.TransportType == TC_AIRLINE or aTripSegment.TransportType == TC_BUS or aTripSegment.TransportType == TC_CRUISE_SHIP   
    }
    
    // 'visible' attribute on CurrencyInput (id=PaidAmount) at ClaimTripSegmentDetailDV.pcf: line 90, column 153
    function visible_45 () : java.lang.Boolean {
      return aTripSegment.TransportType == TC_OTHER  or aTripSegment.TransportType == TC_RENTAL_CAR  or aTripSegment.TransportType == TC_TAXI    
    }
    
    // 'visible' attribute on CurrencyInput (id=OtherFees) at ClaimTripSegmentDetailDV.pcf: line 111, column 55
    function visible_63 () : java.lang.Boolean {
      return aTripSegment.TransportType != null
    }
    
    // 'visible' attribute on Link (id=Approve) at ClaimTripSegmentDetailDV.pcf: line 135, column 61
    function visible_74 () : java.lang.Boolean {
      return aTripSegment.Assessment != TC_APPROVE 
    }
    
    // 'visible' attribute on Link (id=Review) at ClaimTripSegmentDetailDV.pcf: line 142, column 60
    function visible_76 () : java.lang.Boolean {
      return aTripSegment.Assessment != TC_REVIEW 
    }
    
    // 'visible' attribute on Link (id=Deny) at ClaimTripSegmentDetailDV.pcf: line 149, column 58
    function visible_78 () : java.lang.Boolean {
      return aTripSegment.Assessment != TC_DENY 
    }
    
    // 'visible' attribute on Link (id=Clear) at ClaimTripSegmentDetailDV.pcf: line 156, column 54
    function visible_80 () : java.lang.Boolean {
      return aTripSegment.Assessment != null
    }
    
    // 'visible' attribute on TextAreaInput (id=ReasonForDenial) at ClaimTripSegmentDetailDV.pcf: line 167, column 56
    function visible_83 () : java.lang.Boolean {
      return aTripSegment.Assessment == TC_DENY 
    }
    
    property get aTripIncident () : TripIncident {
      return getRequireValue("aTripIncident", 0) as TripIncident
    }
    
    property set aTripIncident ($arg :  TripIncident) {
      setRequireValue("aTripIncident", 0, $arg)
    }
    
    property get aTripSegment () : TripSegment {
      return getRequireValue("aTripSegment", 0) as TripSegment
    }
    
    property set aTripSegment ($arg :  TripSegment) {
      setRequireValue("aTripSegment", 0, $arg)
    }
    
    
  }
  
  
}