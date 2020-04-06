package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/ClaimTripAccommodationDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimTripAccommodationDetailDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/ClaimTripAccommodationDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimTripAccommodationDetailDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on Link (id=Approve) at ClaimTripAccommodationDetailDV.pcf: line 101, column 67
    function action_46 () : void {
      aTripAccommodation.Assessment = TC_APPROVE
    }
    
    // 'action' attribute on Link (id=Review) at ClaimTripAccommodationDetailDV.pcf: line 108, column 66
    function action_48 () : void {
      aTripAccommodation.Assessment = TC_REVIEW
    }
    
    // 'action' attribute on Link (id=Deny) at ClaimTripAccommodationDetailDV.pcf: line 115, column 64
    function action_50 () : void {
      aTripAccommodation.Assessment = TC_DENY
    }
    
    // 'action' attribute on Link (id=Clear) at ClaimTripAccommodationDetailDV.pcf: line 122, column 60
    function action_52 () : void {
      aTripAccommodation.Assessment = null
    }
    
    // 'available' attribute on TextAreaInput (id=ReasonForDenial) at ClaimTripAccommodationDetailDV.pcf: line 133, column 62
    function available_53 () : java.lang.Boolean {
      return aTripAccommodation.ReasonForDenial == null or aTripAccommodation.ReasonForDenial.length == 0
    }
    
    // 'def' attribute on InputSetRef at ClaimTripAccommodationDetailDV.pcf: line 24, column 67
    function def_onEnter_4 (def :  pcf.CCAddressInputSet) : void {
      def.onEnter(aTripAccommodation.AddressOwner)
    }
    
    // 'def' attribute on InputSetRef at ClaimTripAccommodationDetailDV.pcf: line 24, column 67
    function def_refreshVariables_5 (def :  pcf.CCAddressInputSet) : void {
      def.refreshVariables(aTripAccommodation.AddressOwner)
    }
    
    // 'value' attribute on DateInput (id=Checkin) at ClaimTripAccommodationDetailDV.pcf: line 32, column 47
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      aTripAccommodation.StartDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateInput (id=Checkout) at ClaimTripAccommodationDetailDV.pcf: line 40, column 45
    function defaultSetter_16 (__VALUE_TO_SET :  java.lang.Object) : void {
      aTripAccommodation.EndDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TextInput (id=PropertyName) at ClaimTripAccommodationDetailDV.pcf: line 22, column 50
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      aTripAccommodation.PropertyName = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on BooleanRadioInput (id=AccommodationCancelOnly) at ClaimTripAccommodationDetailDV.pcf: line 47, column 47
    function defaultSetter_22 (__VALUE_TO_SET :  java.lang.Object) : void {
      aTripAccommodation.CancelOnly = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CurrencyInput (id=PaidAmount) at ClaimTripAccommodationDetailDV.pcf: line 59, column 48
    function defaultSetter_26 (__VALUE_TO_SET :  java.lang.Object) : void {
      aTripAccommodation.PaidAmount = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on CurrencyInput (id=CancellationFees) at ClaimTripAccommodationDetailDV.pcf: line 65, column 54
    function defaultSetter_30 (__VALUE_TO_SET :  java.lang.Object) : void {
      aTripAccommodation.CancellationFees = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on CurrencyInput (id=AgentFees) at ClaimTripAccommodationDetailDV.pcf: line 71, column 47
    function defaultSetter_34 (__VALUE_TO_SET :  java.lang.Object) : void {
      aTripAccommodation.AgentFees = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on CurrencyInput (id=OtherFees) at ClaimTripAccommodationDetailDV.pcf: line 77, column 47
    function defaultSetter_38 (__VALUE_TO_SET :  java.lang.Object) : void {
      aTripAccommodation.OtherFees = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on TextAreaInput (id=ReasonForDenial) at ClaimTripAccommodationDetailDV.pcf: line 133, column 62
    function defaultSetter_60 (__VALUE_TO_SET :  java.lang.Object) : void {
      aTripAccommodation.ReasonForDenial = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'validationExpression' attribute on DateInput (id=Checkout) at ClaimTripAccommodationDetailDV.pcf: line 40, column 45
    function validationExpression_12 () : java.lang.Object {
      return aTripAccommodation.StartDate > aTripAccommodation.EndDate ? DisplayKey.get("Web.ClaimPolicy.Trips.Accommodations.CheckOut.Validation") : null
    }
    
    // 'validationExpression' attribute on BooleanRadioInput (id=AccommodationCancelOnly) at ClaimTripAccommodationDetailDV.pcf: line 47, column 47
    function validationExpression_18 () : java.lang.Object {
      return aTripAccommodation.CancelOnly and aTripAccommodation.AddnlTripAccommodations.length > 0 ? DisplayKey.get("Web.ClaimPolicy.Trips.Accommodations.CancelOnly.Validate") : null
    }
    
    // 'validationExpression' attribute on DateInput (id=Checkin) at ClaimTripAccommodationDetailDV.pcf: line 32, column 47
    function validationExpression_6 () : java.lang.Object {
      return aTripAccommodation.StartDate > aTripAccommodation.TripIncident.TripRU.EndDate ? DisplayKey.get("Web.ClaimPolicy.Trips.Accommodations.CheckIn.Validation") : null
    }
    
    // 'value' attribute on TextInput (id=PropertyName) at ClaimTripAccommodationDetailDV.pcf: line 22, column 50
    function valueRoot_3 () : java.lang.Object {
      return aTripAccommodation
    }
    
    // 'value' attribute on TextInput (id=PropertyName) at ClaimTripAccommodationDetailDV.pcf: line 22, column 50
    function value_0 () : java.lang.String {
      return aTripAccommodation.PropertyName
    }
    
    // 'value' attribute on DateInput (id=Checkout) at ClaimTripAccommodationDetailDV.pcf: line 40, column 45
    function value_13 () : java.util.Date {
      return aTripAccommodation.EndDate
    }
    
    // 'value' attribute on BooleanRadioInput (id=AccommodationCancelOnly) at ClaimTripAccommodationDetailDV.pcf: line 47, column 47
    function value_19 () : java.lang.Boolean {
      return aTripAccommodation.CancelOnly
    }
    
    // 'value' attribute on CurrencyInput (id=PaidAmount) at ClaimTripAccommodationDetailDV.pcf: line 59, column 48
    function value_24 () : gw.api.financials.CurrencyAmount {
      return aTripAccommodation.PaidAmount
    }
    
    // 'value' attribute on CurrencyInput (id=CancellationFees) at ClaimTripAccommodationDetailDV.pcf: line 65, column 54
    function value_28 () : gw.api.financials.CurrencyAmount {
      return aTripAccommodation.CancellationFees
    }
    
    // 'value' attribute on CurrencyInput (id=AgentFees) at ClaimTripAccommodationDetailDV.pcf: line 71, column 47
    function value_32 () : gw.api.financials.CurrencyAmount {
      return aTripAccommodation.AgentFees
    }
    
    // 'value' attribute on CurrencyInput (id=OtherFees) at ClaimTripAccommodationDetailDV.pcf: line 77, column 47
    function value_36 () : gw.api.financials.CurrencyAmount {
      return aTripAccommodation.OtherFees
    }
    
    // 'value' attribute on TypeKeyInput (id=Assessment) at ClaimTripAccommodationDetailDV.pcf: line 85, column 47
    function value_40 () : typekey.AssessmentAction {
      return aTripAccommodation.Assessment
    }
    
    // 'value' attribute on CurrencyInput (id=FinancialImpact) at ClaimTripAccommodationDetailDV.pcf: line 90, column 71
    function value_43 () : gw.api.financials.CurrencyAmount {
      return aTripAccommodation.getFinancialImpact(  TC_APPROVE )
    }
    
    // 'value' attribute on TextAreaInput (id=ReasonForDenial) at ClaimTripAccommodationDetailDV.pcf: line 133, column 62
    function value_55 () : java.lang.String {
      return aTripAccommodation.ReasonForDenial
    }
    
    // 'value' attribute on DateInput (id=Checkin) at ClaimTripAccommodationDetailDV.pcf: line 32, column 47
    function value_7 () : java.util.Date {
      return aTripAccommodation.StartDate
    }
    
    // 'visible' attribute on Link (id=Approve) at ClaimTripAccommodationDetailDV.pcf: line 101, column 67
    function visible_45 () : java.lang.Boolean {
      return aTripAccommodation.Assessment != TC_APPROVE 
    }
    
    // 'visible' attribute on Link (id=Review) at ClaimTripAccommodationDetailDV.pcf: line 108, column 66
    function visible_47 () : java.lang.Boolean {
      return aTripAccommodation.Assessment != TC_REVIEW 
    }
    
    // 'visible' attribute on Link (id=Deny) at ClaimTripAccommodationDetailDV.pcf: line 115, column 64
    function visible_49 () : java.lang.Boolean {
      return aTripAccommodation.Assessment != TC_DENY 
    }
    
    // 'visible' attribute on Link (id=Clear) at ClaimTripAccommodationDetailDV.pcf: line 122, column 60
    function visible_51 () : java.lang.Boolean {
      return aTripAccommodation.Assessment != null
    }
    
    // 'visible' attribute on TextAreaInput (id=ReasonForDenial) at ClaimTripAccommodationDetailDV.pcf: line 133, column 62
    function visible_54 () : java.lang.Boolean {
      return aTripAccommodation.Assessment == TC_DENY 
    }
    
    property get aTripAccommodation () : TripAccommodation {
      return getRequireValue("aTripAccommodation", 0) as TripAccommodation
    }
    
    property set aTripAccommodation ($arg :  TripAccommodation) {
      setRequireValue("aTripAccommodation", 0, $arg)
    }
    
    property get aTripIncident () : TripIncident {
      return getRequireValue("aTripIncident", 0) as TripIncident
    }
    
    property set aTripIncident ($arg :  TripIncident) {
      setRequireValue("aTripIncident", 0, $arg)
    }
    
    
  }
  
  
}