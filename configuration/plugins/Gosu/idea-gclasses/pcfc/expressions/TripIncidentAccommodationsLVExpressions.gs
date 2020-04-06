package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/TripIncidentAccommodationsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TripIncidentAccommodationsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/TripIncidentAccommodationsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends TripIncidentAccommodationsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=AffectedAccommodationName) at TripIncidentAccommodationsLV.pcf: line 48, column 49
    function action_10 () : void {
      TripAccommodationAddressPopup.push( aTripAccommodation, aTripIncident, CurrentLocation.InEditMode )
    }
    
    // 'action' attribute on TextCell (id=AffectedAccommodationName) at TripIncidentAccommodationsLV.pcf: line 48, column 49
    function action_dest_11 () : pcf.api.Destination {
      return pcf.TripAccommodationAddressPopup.createDestination( aTripAccommodation, aTripIncident, CurrentLocation.InEditMode )
    }
    
    // 'available' attribute on TextCell (id=ReasonForDenial) at TripIncidentAccommodationsLV.pcf: line 72, column 83
    function available_20 () : java.lang.Boolean {
      return aTripAccommodation.ReasonForDenial == null or aTripAccommodation.ReasonForDenial.length == 0
    }
    
    // 'condition' attribute on ToolbarFlag at TripIncidentAccommodationsLV.pcf: line 28, column 29
    function condition_5 () : java.lang.Boolean {
      return aTripAccommodation.Assessment == TC_APPROVE 
    }
    
    // 'condition' attribute on ToolbarFlag at TripIncidentAccommodationsLV.pcf: line 31, column 26
    function condition_6 () : java.lang.Boolean {
      return aTripAccommodation.Assessment == TC_DENY
    }
    
    // 'condition' attribute on ToolbarFlag at TripIncidentAccommodationsLV.pcf: line 34, column 28
    function condition_7 () : java.lang.Boolean {
      return aTripAccommodation.Assessment == TC_REVIEW
    }
    
    // 'condition' attribute on ToolbarFlag at TripIncidentAccommodationsLV.pcf: line 39, column 27
    function condition_8 () : java.lang.Boolean {
      return aTripAccommodation.Assessment == null
    }
    
    // 'value' attribute on TextCell (id=ReasonForDenial) at TripIncidentAccommodationsLV.pcf: line 72, column 83
    function defaultSetter_27 (__VALUE_TO_SET :  java.lang.Object) : void {
      aTripAccommodation.ReasonForDenial = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'editable' attribute on TextCell (id=ReasonForDenial) at TripIncidentAccommodationsLV.pcf: line 72, column 83
    function editable_21 () : java.lang.Boolean {
      return aTripAccommodation.Assessment == TC_DENY ? true : false
    }
    
    // 'value' attribute on TypeKeyCell (id=Assessment) at TripIncidentAccommodationsLV.pcf: line 64, column 49
    function valueRoot_19 () : java.lang.Object {
      return aTripAccommodation
    }
    
    // 'value' attribute on TextCell (id=AccommodationStatus) at TripIncidentAccommodationsLV.pcf: line 53, column 233
    function value_13 () : java.lang.String {
      return aTripAccommodation.CancelOnly ? DisplayKey.get("Web.TripIncidentAccommodationLV.AccommodationStatus.Cancelled") : DisplayKey.get("Web.TripIncidentAccommodationLV.AccommodationStatus.Rebooked")
    }
    
    // 'value' attribute on CurrencyCell (id=AccommodationCostIncurred) at TripIncidentAccommodationsLV.pcf: line 58, column 89
    function value_15 () : gw.api.financials.CurrencyAmount {
      return aTripAccommodation.getFinancialImpact( AssessmentAction.TC_APPROVE )
    }
    
    // 'value' attribute on TypeKeyCell (id=Assessment) at TripIncidentAccommodationsLV.pcf: line 64, column 49
    function value_17 () : typekey.AssessmentAction {
      return aTripAccommodation.Assessment
    }
    
    // 'value' attribute on TextCell (id=ReasonForDenial) at TripIncidentAccommodationsLV.pcf: line 72, column 83
    function value_22 () : java.lang.String {
      return aTripAccommodation.ReasonForDenial
    }
    
    // 'value' attribute on TextCell (id=AffectedAccommodationName) at TripIncidentAccommodationsLV.pcf: line 48, column 49
    function value_9 () : entity.TripAccommodation {
      return aTripAccommodation
    }
    
    property get aTripAccommodation () : entity.TripAccommodation {
      return getIteratedValue(1) as entity.TripAccommodation
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/TripIncidentAccommodationsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TripIncidentAccommodationsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'pickLocation' attribute on RowIterator (id=TripAccommodationIterator) at TripIncidentAccommodationsLV.pcf: line 25, column 46
    function pickLocation_29 () : void {
      TripAccommodationAddressPopup.push(aTripIncident, CurrentLocation.InEditMode )
    }
    
    // 'value' attribute on RowIterator (id=TripAccommodationIterator) at TripIncidentAccommodationsLV.pcf: line 48, column 49
    function sortValue_0 (aTripAccommodation :  entity.TripAccommodation) : java.lang.Object {
      return aTripAccommodation
    }
    
    // 'value' attribute on RowIterator (id=TripAccommodationIterator) at TripIncidentAccommodationsLV.pcf: line 53, column 233
    function sortValue_1 (aTripAccommodation :  entity.TripAccommodation) : java.lang.Object {
      return aTripAccommodation.CancelOnly ? DisplayKey.get("Web.TripIncidentAccommodationLV.AccommodationStatus.Cancelled") : DisplayKey.get("Web.TripIncidentAccommodationLV.AccommodationStatus.Rebooked")
    }
    
    // 'value' attribute on RowIterator (id=TripAccommodationIterator) at TripIncidentAccommodationsLV.pcf: line 58, column 89
    function sortValue_2 (aTripAccommodation :  entity.TripAccommodation) : java.lang.Object {
      return aTripAccommodation.getFinancialImpact( AssessmentAction.TC_APPROVE )
    }
    
    // 'value' attribute on RowIterator (id=TripAccommodationIterator) at TripIncidentAccommodationsLV.pcf: line 64, column 49
    function sortValue_3 (aTripAccommodation :  entity.TripAccommodation) : java.lang.Object {
      return aTripAccommodation.Assessment
    }
    
    // 'value' attribute on RowIterator (id=TripAccommodationIterator) at TripIncidentAccommodationsLV.pcf: line 72, column 83
    function sortValue_4 (aTripAccommodation :  entity.TripAccommodation) : java.lang.Object {
      return aTripAccommodation.ReasonForDenial
    }
    
    // 'toRemove' attribute on RowIterator (id=TripAccommodationIterator) at TripIncidentAccommodationsLV.pcf: line 25, column 46
    function toRemove_30 (aTripAccommodation :  entity.TripAccommodation) : void {
      aTripIncident.removeFromTripAccommodations( aTripAccommodation )
    }
    
    // 'value' attribute on RowIterator (id=TripAccommodationIterator) at TripIncidentAccommodationsLV.pcf: line 25, column 46
    function value_31 () : entity.TripAccommodation[] {
      return aTripIncident.TripAccommodations
    }
    
    property get aTripIncident () : TripIncident {
      return getRequireValue("aTripIncident", 0) as TripIncident
    }
    
    property set aTripIncident ($arg :  TripIncident) {
      setRequireValue("aTripIncident", 0, $arg)
    }
    
    
  }
  
  
}