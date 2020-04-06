package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/AdditionalTripAccommodationInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AdditionalTripAccommodationInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/AdditionalTripAccommodationInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AdditionalTripAccommodationInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on Link (id=Approve) at AdditionalTripAccommodationInputSet.pcf: line 84, column 71
    function action_36 () : void {
      anAddnlTripAccommodation.Assessment = TC_APPROVE
    }
    
    // 'action' attribute on Link (id=Review) at AdditionalTripAccommodationInputSet.pcf: line 91, column 70
    function action_38 () : void {
      anAddnlTripAccommodation.Assessment = TC_REVIEW
    }
    
    // 'action' attribute on Link (id=Deny) at AdditionalTripAccommodationInputSet.pcf: line 98, column 68
    function action_40 () : void {
      anAddnlTripAccommodation.Assessment = TC_DENY
    }
    
    // 'action' attribute on Link (id=Clear) at AdditionalTripAccommodationInputSet.pcf: line 106, column 64
    function action_43 () : void {
      anAddnlTripAccommodation.Assessment = null
    }
    
    // 'available' attribute on Link (id=Clear) at AdditionalTripAccommodationInputSet.pcf: line 106, column 64
    function available_41 () : java.lang.Boolean {
      return anAddnlTripAccommodation.ReasonForDenial == null or anAddnlTripAccommodation.ReasonForDenial.length == 0
    }
    
    // 'def' attribute on InputSetRef at AdditionalTripAccommodationInputSet.pcf: line 23, column 71
    function def_onEnter_4 (def :  pcf.CCAddressInputSet) : void {
      def.onEnter(anAddnlTripAccommodation.AddressOwner)
    }
    
    // 'def' attribute on InputSetRef at AdditionalTripAccommodationInputSet.pcf: line 23, column 71
    function def_refreshVariables_5 (def :  pcf.CCAddressInputSet) : void {
      def.refreshVariables(anAddnlTripAccommodation.AddressOwner)
    }
    
    // 'value' attribute on DateInput (id=Checkin) at AdditionalTripAccommodationInputSet.pcf: line 31, column 51
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      anAddnlTripAccommodation.StartDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateInput (id=Checkout) at AdditionalTripAccommodationInputSet.pcf: line 39, column 49
    function defaultSetter_16 (__VALUE_TO_SET :  java.lang.Object) : void {
      anAddnlTripAccommodation.EndDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TextInput (id=PropertyName) at AdditionalTripAccommodationInputSet.pcf: line 21, column 54
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      anAddnlTripAccommodation.PropertyName = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on CurrencyInput (id=PaidAmount) at AdditionalTripAccommodationInputSet.pcf: line 48, column 52
    function defaultSetter_20 (__VALUE_TO_SET :  java.lang.Object) : void {
      anAddnlTripAccommodation.PaidAmount = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on CurrencyInput (id=AgentFees) at AdditionalTripAccommodationInputSet.pcf: line 54, column 51
    function defaultSetter_24 (__VALUE_TO_SET :  java.lang.Object) : void {
      anAddnlTripAccommodation.AgentFees = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on CurrencyInput (id=OtherFees) at AdditionalTripAccommodationInputSet.pcf: line 60, column 51
    function defaultSetter_28 (__VALUE_TO_SET :  java.lang.Object) : void {
      anAddnlTripAccommodation.OtherFees = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on TextAreaInput (id=ReasonForDenial) at AdditionalTripAccommodationInputSet.pcf: line 116, column 66
    function defaultSetter_49 (__VALUE_TO_SET :  java.lang.Object) : void {
      anAddnlTripAccommodation.ReasonForDenial = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'validationExpression' attribute on DateInput (id=Checkout) at AdditionalTripAccommodationInputSet.pcf: line 39, column 49
    function validationExpression_12 () : java.lang.Object {
      return anAddnlTripAccommodation.StartDate > anAddnlTripAccommodation.EndDate ? DisplayKey.get("Web.ClaimPolicy.Trips.Accommodations.CheckOut.Validation") : null
    }
    
    // 'validationExpression' attribute on DateInput (id=Checkin) at AdditionalTripAccommodationInputSet.pcf: line 31, column 51
    function validationExpression_6 () : java.lang.Object {
      return anAddnlTripAccommodation.StartDate > anAddnlTripAccommodation.TripAccommodation.TripIncident.TripRU.EndDate ? DisplayKey.get("Web.ClaimPolicy.Trips.Accommodations.CheckIn.Validation") : null
    }
    
    // 'value' attribute on TextInput (id=PropertyName) at AdditionalTripAccommodationInputSet.pcf: line 21, column 54
    function valueRoot_3 () : java.lang.Object {
      return anAddnlTripAccommodation
    }
    
    // 'value' attribute on TextInput (id=PropertyName) at AdditionalTripAccommodationInputSet.pcf: line 21, column 54
    function value_0 () : java.lang.String {
      return anAddnlTripAccommodation.PropertyName
    }
    
    // 'value' attribute on DateInput (id=Checkout) at AdditionalTripAccommodationInputSet.pcf: line 39, column 49
    function value_13 () : java.util.Date {
      return anAddnlTripAccommodation.EndDate
    }
    
    // 'value' attribute on CurrencyInput (id=PaidAmount) at AdditionalTripAccommodationInputSet.pcf: line 48, column 52
    function value_18 () : gw.api.financials.CurrencyAmount {
      return anAddnlTripAccommodation.PaidAmount
    }
    
    // 'value' attribute on CurrencyInput (id=AgentFees) at AdditionalTripAccommodationInputSet.pcf: line 54, column 51
    function value_22 () : gw.api.financials.CurrencyAmount {
      return anAddnlTripAccommodation.AgentFees
    }
    
    // 'value' attribute on CurrencyInput (id=OtherFees) at AdditionalTripAccommodationInputSet.pcf: line 60, column 51
    function value_26 () : gw.api.financials.CurrencyAmount {
      return anAddnlTripAccommodation.OtherFees
    }
    
    // 'value' attribute on TypeKeyInput (id=Assessment) at AdditionalTripAccommodationInputSet.pcf: line 68, column 45
    function value_30 () : typekey.AssessmentAction {
      return anAddnlTripAccommodation.Assessment
    }
    
    // 'value' attribute on CurrencyInput (id=FinancialImpact) at AdditionalTripAccommodationInputSet.pcf: line 73, column 75
    function value_33 () : gw.api.financials.CurrencyAmount {
      return anAddnlTripAccommodation.getFinancialImpact(  TC_APPROVE )
    }
    
    // 'value' attribute on TextAreaInput (id=ReasonForDenial) at AdditionalTripAccommodationInputSet.pcf: line 116, column 66
    function value_45 () : java.lang.String {
      return anAddnlTripAccommodation.ReasonForDenial
    }
    
    // 'value' attribute on DateInput (id=Checkin) at AdditionalTripAccommodationInputSet.pcf: line 31, column 51
    function value_7 () : java.util.Date {
      return anAddnlTripAccommodation.StartDate
    }
    
    // 'visible' attribute on Link (id=Approve) at AdditionalTripAccommodationInputSet.pcf: line 84, column 71
    function visible_35 () : java.lang.Boolean {
      return anAddnlTripAccommodation.Assessment != TC_APPROVE 
    }
    
    // 'visible' attribute on Link (id=Review) at AdditionalTripAccommodationInputSet.pcf: line 91, column 70
    function visible_37 () : java.lang.Boolean {
      return anAddnlTripAccommodation.Assessment != TC_REVIEW 
    }
    
    // 'visible' attribute on Link (id=Deny) at AdditionalTripAccommodationInputSet.pcf: line 98, column 68
    function visible_39 () : java.lang.Boolean {
      return anAddnlTripAccommodation.Assessment != TC_DENY 
    }
    
    // 'visible' attribute on Link (id=Clear) at AdditionalTripAccommodationInputSet.pcf: line 106, column 64
    function visible_42 () : java.lang.Boolean {
      return anAddnlTripAccommodation.Assessment != null
    }
    
    // 'visible' attribute on TextAreaInput (id=ReasonForDenial) at AdditionalTripAccommodationInputSet.pcf: line 116, column 66
    function visible_44 () : java.lang.Boolean {
      return anAddnlTripAccommodation.Assessment == TC_DENY 
    }
    
    property get aTripIncident () : TripIncident {
      return getRequireValue("aTripIncident", 0) as TripIncident
    }
    
    property set aTripIncident ($arg :  TripIncident) {
      setRequireValue("aTripIncident", 0, $arg)
    }
    
    property get anAddnlTripAccommodation () : AddnlTripAccommodation {
      return getRequireValue("anAddnlTripAccommodation", 0) as AddnlTripAccommodation
    }
    
    property set anAddnlTripAccommodation ($arg :  AddnlTripAccommodation) {
      setRequireValue("anAddnlTripAccommodation", 0, $arg)
    }
    
    
  }
  
  
}