package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/AdditionalTripSegmentInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AdditionalTripSegmentInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/AdditionalTripSegmentInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AdditionalTripSegmentInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on Link (id=Approve) at AdditionalTripSegmentInputSet.pcf: line 109, column 65
    function action_52 () : void {
      anAddnlTripSegment.Assessment = TC_APPROVE
    }
    
    // 'action' attribute on Link (id=Review) at AdditionalTripSegmentInputSet.pcf: line 116, column 64
    function action_54 () : void {
      anAddnlTripSegment.Assessment = TC_REVIEW
    }
    
    // 'action' attribute on Link (id=Deny) at AdditionalTripSegmentInputSet.pcf: line 123, column 62
    function action_56 () : void {
      anAddnlTripSegment.Assessment = TC_DENY
    }
    
    // 'action' attribute on Link (id=Clear) at AdditionalTripSegmentInputSet.pcf: line 130, column 58
    function action_58 () : void {
      anAddnlTripSegment.Assessment = null
    }
    
    // 'available' attribute on TextAreaInput (id=ReasonForDenial) at AdditionalTripSegmentInputSet.pcf: line 141, column 74
    function available_59 () : java.lang.Boolean {
      return anAddnlTripSegment.ReasonForDenial == null or anAddnlTripSegment.ReasonForDenial.length == 0
    }
    
    // 'value' attribute on TextInput (id=CarrierNumber) at AdditionalTripSegmentInputSet.pcf: line 35, column 49
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      anAddnlTripSegment.CarrierNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=PortOfEmbarkation) at AdditionalTripSegmentInputSet.pcf: line 41, column 53
    function defaultSetter_14 (__VALUE_TO_SET :  java.lang.Object) : void {
      anAddnlTripSegment.PortOfEmbarkation = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=PortOfDisembarkation) at AdditionalTripSegmentInputSet.pcf: line 47, column 56
    function defaultSetter_18 (__VALUE_TO_SET :  java.lang.Object) : void {
      anAddnlTripSegment.PortOfDisembarkation = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=TransportType) at AdditionalTripSegmentInputSet.pcf: line 22, column 41
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      anAddnlTripSegment.TransportType = (__VALUE_TO_SET as typekey.TransportType)
    }
    
    // 'value' attribute on DateInput (id=StartedOn) at AdditionalTripSegmentInputSet.pcf: line 55, column 45
    function defaultSetter_24 (__VALUE_TO_SET :  java.lang.Object) : void {
      anAddnlTripSegment.StartDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateInput (id=EndedOn) at AdditionalTripSegmentInputSet.pcf: line 63, column 43
    function defaultSetter_30 (__VALUE_TO_SET :  java.lang.Object) : void {
      anAddnlTripSegment.EndDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on CurrencyInput (id=PaidAmount) at AdditionalTripSegmentInputSet.pcf: line 72, column 46
    function defaultSetter_34 (__VALUE_TO_SET :  java.lang.Object) : void {
      anAddnlTripSegment.PaidAmount = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on CurrencyInput (id=AgentFees) at AdditionalTripSegmentInputSet.pcf: line 79, column 165
    function defaultSetter_40 (__VALUE_TO_SET :  java.lang.Object) : void {
      anAddnlTripSegment.AgentFees = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on CurrencyInput (id=OtherFees) at AdditionalTripSegmentInputSet.pcf: line 85, column 45
    function defaultSetter_44 (__VALUE_TO_SET :  java.lang.Object) : void {
      anAddnlTripSegment.OtherFees = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on TextInput (id=CarrierName) at AdditionalTripSegmentInputSet.pcf: line 29, column 47
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      anAddnlTripSegment.CarrierName = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextAreaInput (id=ReasonForDenial) at AdditionalTripSegmentInputSet.pcf: line 141, column 74
    function defaultSetter_66 (__VALUE_TO_SET :  java.lang.Object) : void {
      anAddnlTripSegment.ReasonForDenial = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'required' attribute on TextAreaInput (id=ReasonForDenial) at AdditionalTripSegmentInputSet.pcf: line 141, column 74
    function required_64 () : java.lang.Boolean {
      return anAddnlTripSegment.Assessment == TC_DENY 
    }
    
    // 'validationExpression' attribute on DateInput (id=StartedOn) at AdditionalTripSegmentInputSet.pcf: line 55, column 45
    function validationExpression_20 () : java.lang.Object {
      return anAddnlTripSegment.StartDate > anAddnlTripSegment.TripSegment.TripIncident.TripRU.EndDate ? DisplayKey.get("Web.ClaimPolicy.Trips.Segment.DepartureDate.Validation") : null
    }
    
    // 'validationExpression' attribute on DateInput (id=EndedOn) at AdditionalTripSegmentInputSet.pcf: line 63, column 43
    function validationExpression_26 () : java.lang.Object {
      return anAddnlTripSegment.StartDate > anAddnlTripSegment.EndDate ? DisplayKey.get("Web.ClaimPolicy.Trips.Segment.ArrivalDate.Validation") : null
    }
    
    // 'value' attribute on TypeKeyInput (id=TransportType) at AdditionalTripSegmentInputSet.pcf: line 22, column 41
    function valueRoot_3 () : java.lang.Object {
      return anAddnlTripSegment
    }
    
    // 'value' attribute on TypeKeyInput (id=TransportType) at AdditionalTripSegmentInputSet.pcf: line 22, column 41
    function value_0 () : typekey.TransportType {
      return anAddnlTripSegment.TransportType
    }
    
    // 'value' attribute on TextInput (id=PortOfEmbarkation) at AdditionalTripSegmentInputSet.pcf: line 41, column 53
    function value_12 () : java.lang.String {
      return anAddnlTripSegment.PortOfEmbarkation
    }
    
    // 'value' attribute on TextInput (id=PortOfDisembarkation) at AdditionalTripSegmentInputSet.pcf: line 47, column 56
    function value_16 () : java.lang.String {
      return anAddnlTripSegment.PortOfDisembarkation
    }
    
    // 'value' attribute on DateInput (id=StartedOn) at AdditionalTripSegmentInputSet.pcf: line 55, column 45
    function value_21 () : java.util.Date {
      return anAddnlTripSegment.StartDate
    }
    
    // 'value' attribute on DateInput (id=EndedOn) at AdditionalTripSegmentInputSet.pcf: line 63, column 43
    function value_27 () : java.util.Date {
      return anAddnlTripSegment.EndDate
    }
    
    // 'value' attribute on CurrencyInput (id=PaidAmount) at AdditionalTripSegmentInputSet.pcf: line 72, column 46
    function value_32 () : gw.api.financials.CurrencyAmount {
      return anAddnlTripSegment.PaidAmount
    }
    
    // 'value' attribute on CurrencyInput (id=AgentFees) at AdditionalTripSegmentInputSet.pcf: line 79, column 165
    function value_37 () : gw.api.financials.CurrencyAmount {
      return anAddnlTripSegment.AgentFees
    }
    
    // 'value' attribute on TextInput (id=CarrierName) at AdditionalTripSegmentInputSet.pcf: line 29, column 47
    function value_4 () : java.lang.String {
      return anAddnlTripSegment.CarrierName
    }
    
    // 'value' attribute on CurrencyInput (id=OtherFees) at AdditionalTripSegmentInputSet.pcf: line 85, column 45
    function value_42 () : gw.api.financials.CurrencyAmount {
      return anAddnlTripSegment.OtherFees
    }
    
    // 'value' attribute on TypeKeyInput (id=Assessment) at AdditionalTripSegmentInputSet.pcf: line 93, column 45
    function value_46 () : typekey.AssessmentAction {
      return anAddnlTripSegment.Assessment
    }
    
    // 'value' attribute on CurrencyInput (id=FinancialImpact) at AdditionalTripSegmentInputSet.pcf: line 98, column 69
    function value_49 () : gw.api.financials.CurrencyAmount {
      return anAddnlTripSegment.getFinancialImpact(  TC_APPROVE )
    }
    
    // 'value' attribute on TextAreaInput (id=ReasonForDenial) at AdditionalTripSegmentInputSet.pcf: line 141, column 74
    function value_61 () : java.lang.String {
      return anAddnlTripSegment.ReasonForDenial
    }
    
    // 'value' attribute on TextInput (id=CarrierNumber) at AdditionalTripSegmentInputSet.pcf: line 35, column 49
    function value_8 () : java.lang.String {
      return anAddnlTripSegment.CarrierNumber
    }
    
    // 'visible' attribute on CurrencyInput (id=AgentFees) at AdditionalTripSegmentInputSet.pcf: line 79, column 165
    function visible_36 () : java.lang.Boolean {
      return anAddnlTripSegment.TransportType == TC_AIRLINE or anAddnlTripSegment.TransportType == TC_BUS or anAddnlTripSegment.TransportType == TC_CRUISE_SHIP
    }
    
    // 'visible' attribute on Link (id=Approve) at AdditionalTripSegmentInputSet.pcf: line 109, column 65
    function visible_51 () : java.lang.Boolean {
      return anAddnlTripSegment.Assessment != TC_APPROVE 
    }
    
    // 'visible' attribute on Link (id=Review) at AdditionalTripSegmentInputSet.pcf: line 116, column 64
    function visible_53 () : java.lang.Boolean {
      return anAddnlTripSegment.Assessment != TC_REVIEW 
    }
    
    // 'visible' attribute on Link (id=Deny) at AdditionalTripSegmentInputSet.pcf: line 123, column 62
    function visible_55 () : java.lang.Boolean {
      return anAddnlTripSegment.Assessment != TC_DENY 
    }
    
    // 'visible' attribute on Link (id=Clear) at AdditionalTripSegmentInputSet.pcf: line 130, column 58
    function visible_57 () : java.lang.Boolean {
      return anAddnlTripSegment.Assessment != null
    }
    
    // 'visible' attribute on TextAreaInput (id=ReasonForDenial) at AdditionalTripSegmentInputSet.pcf: line 141, column 74
    function visible_60 () : java.lang.Boolean {
      return anAddnlTripSegment.Assessment == TC_DENY ? true : false
    }
    
    property get aTripIncident () : TripIncident {
      return getRequireValue("aTripIncident", 0) as TripIncident
    }
    
    property set aTripIncident ($arg :  TripIncident) {
      setRequireValue("aTripIncident", 0, $arg)
    }
    
    property get anAddnlTripSegment () : AddnlTripSegment {
      return getRequireValue("anAddnlTripSegment", 0) as AddnlTripSegment
    }
    
    property set anAddnlTripSegment ($arg :  AddnlTripSegment) {
      setRequireValue("anAddnlTripSegment", 0, $arg)
    }
    
    
  }
  
  
}