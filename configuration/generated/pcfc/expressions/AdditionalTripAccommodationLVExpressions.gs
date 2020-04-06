package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/AdditionalTripAccommodationLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AdditionalTripAccommodationLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/AdditionalTripAccommodationLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AdditionalTripAccommodationLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'pickLocation' attribute on RowIterator (id=TripAccommodationIterator) at AdditionalTripAccommodationLV.pcf: line 25, column 51
    function pickLocation_27 () : void {
      AdditionalTripAccommodationAddressPopup.push(new  AddnlTripAccommodation(), affectedTripAccommodation, true)
    }
    
    // 'value' attribute on RowIterator (id=TripAccommodationIterator) at AdditionalTripAccommodationLV.pcf: line 45, column 57
    function sortValue_0 (anAddnlTripAccommodation :  entity.AddnlTripAccommodation) : java.lang.Object {
      return anAddnlTripAccommodation.DisplayName
    }
    
    // 'value' attribute on RowIterator (id=TripAccommodationIterator) at AdditionalTripAccommodationLV.pcf: line 51, column 49
    function sortValue_1 (anAddnlTripAccommodation :  entity.AddnlTripAccommodation) : java.lang.Object {
      return anAddnlTripAccommodation.Assessment
    }
    
    // 'value' attribute on RowIterator (id=TripAccommodationIterator) at AdditionalTripAccommodationLV.pcf: line 56, column 93
    function sortValue_2 (anAddnlTripAccommodation :  entity.AddnlTripAccommodation) : java.lang.Object {
      return anAddnlTripAccommodation.getFinancialImpact(AssessmentAction.TC_APPROVE)
    }
    
    // 'value' attribute on RowIterator (id=TripAccommodationIterator) at AdditionalTripAccommodationLV.pcf: line 64, column 89
    function sortValue_3 (anAddnlTripAccommodation :  entity.AddnlTripAccommodation) : java.lang.Object {
      return anAddnlTripAccommodation.ReasonForDenial
    }
    
    // 'toRemove' attribute on RowIterator (id=TripAccommodationIterator) at AdditionalTripAccommodationLV.pcf: line 25, column 51
    function toRemove_28 (anAddnlTripAccommodation :  entity.AddnlTripAccommodation) : void {
      affectedTripAccommodation.removeFromAddnlTripAccommodations( anAddnlTripAccommodation )
    }
    
    // 'value' attribute on RowIterator (id=TripAccommodationIterator) at AdditionalTripAccommodationLV.pcf: line 25, column 51
    function value_29 () : entity.AddnlTripAccommodation[] {
      return affectedTripAccommodation.AddnlTripAccommodations
    }
    
    property get affectedTripAccommodation () : TripAccommodation {
      return getRequireValue("affectedTripAccommodation", 0) as TripAccommodation
    }
    
    property set affectedTripAccommodation ($arg :  TripAccommodation) {
      setRequireValue("affectedTripAccommodation", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/AdditionalTripAccommodationLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends AdditionalTripAccommodationLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=AddnlTripAccommodation_DisplayName) at AdditionalTripAccommodationLV.pcf: line 45, column 57
    function action_9 () : void {
      AdditionalTripAccommodationAddressPopup.push( anAddnlTripAccommodation,  affectedTripAccommodation, CurrentLocation.InEditMode)
    }
    
    // 'action' attribute on TextCell (id=AddnlTripAccommodation_DisplayName) at AdditionalTripAccommodationLV.pcf: line 45, column 57
    function action_dest_10 () : pcf.api.Destination {
      return pcf.AdditionalTripAccommodationAddressPopup.createDestination( anAddnlTripAccommodation,  affectedTripAccommodation, CurrentLocation.InEditMode)
    }
    
    // 'available' attribute on TextCell (id=ReasonForDenial) at AdditionalTripAccommodationLV.pcf: line 64, column 89
    function available_18 () : java.lang.Boolean {
      return anAddnlTripAccommodation.ReasonForDenial == null or anAddnlTripAccommodation.ReasonForDenial.length == 0
    }
    
    // 'condition' attribute on ToolbarFlag at AdditionalTripAccommodationLV.pcf: line 28, column 33
    function condition_4 () : java.lang.Boolean {
      return anAddnlTripAccommodation.Assessment == TC_APPROVE 
    }
    
    // 'condition' attribute on ToolbarFlag at AdditionalTripAccommodationLV.pcf: line 31, column 32
    function condition_5 () : java.lang.Boolean {
      return anAddnlTripAccommodation.Assessment == TC_REVIEW 
    }
    
    // 'condition' attribute on ToolbarFlag at AdditionalTripAccommodationLV.pcf: line 34, column 30
    function condition_6 () : java.lang.Boolean {
      return anAddnlTripAccommodation.Assessment == TC_DENY 
    }
    
    // 'condition' attribute on ToolbarFlag at AdditionalTripAccommodationLV.pcf: line 39, column 31
    function condition_7 () : java.lang.Boolean {
      return anAddnlTripAccommodation.Assessment == null
    }
    
    // 'value' attribute on TextCell (id=ReasonForDenial) at AdditionalTripAccommodationLV.pcf: line 64, column 89
    function defaultSetter_25 (__VALUE_TO_SET :  java.lang.Object) : void {
      anAddnlTripAccommodation.ReasonForDenial = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'editable' attribute on TextCell (id=ReasonForDenial) at AdditionalTripAccommodationLV.pcf: line 64, column 89
    function editable_19 () : java.lang.Boolean {
      return anAddnlTripAccommodation.Assessment == TC_DENY ? true : false
    }
    
    // 'value' attribute on TextCell (id=AddnlTripAccommodation_DisplayName) at AdditionalTripAccommodationLV.pcf: line 45, column 57
    function valueRoot_12 () : java.lang.Object {
      return anAddnlTripAccommodation
    }
    
    // 'value' attribute on TypeKeyCell (id=AddnlTripSegment_Assessment) at AdditionalTripAccommodationLV.pcf: line 51, column 49
    function value_13 () : typekey.AssessmentAction {
      return anAddnlTripAccommodation.Assessment
    }
    
    // 'value' attribute on CurrencyCell (id=AddnlTripSegment_TotalIncurred) at AdditionalTripAccommodationLV.pcf: line 56, column 93
    function value_16 () : gw.api.financials.CurrencyAmount {
      return anAddnlTripAccommodation.getFinancialImpact(AssessmentAction.TC_APPROVE)
    }
    
    // 'value' attribute on TextCell (id=ReasonForDenial) at AdditionalTripAccommodationLV.pcf: line 64, column 89
    function value_20 () : java.lang.String {
      return anAddnlTripAccommodation.ReasonForDenial
    }
    
    // 'value' attribute on TextCell (id=AddnlTripAccommodation_DisplayName) at AdditionalTripAccommodationLV.pcf: line 45, column 57
    function value_8 () : java.lang.String {
      return anAddnlTripAccommodation.DisplayName
    }
    
    property get anAddnlTripAccommodation () : entity.AddnlTripAccommodation {
      return getIteratedValue(1) as entity.AddnlTripAccommodation
    }
    
    
  }
  
  
}