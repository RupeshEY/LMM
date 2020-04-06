package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/TripIncidentSegmentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TripIncidentSegmentsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/TripIncidentSegmentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends TripIncidentSegmentsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TypeKeyCell (id=CarrierType) at TripIncidentSegmentsLV.pcf: line 51, column 46
    function action_12 () : void {
      TripSegmentPopup.push( aTripSegment, aTripIncident, CurrentLocation.InEditMode )
    }
    
    // 'action' attribute on TextCell (id=AffectedSegmentName) at TripIncidentSegmentsLV.pcf: line 58, column 43
    function action_17 () : void {
      TripSegmentPopup.push( aTripSegment, aTripIncident, CurrentLocation.InEditMode )
    }
    
    // 'action' attribute on TypeKeyCell (id=CarrierType) at TripIncidentSegmentsLV.pcf: line 51, column 46
    function action_dest_13 () : pcf.api.Destination {
      return pcf.TripSegmentPopup.createDestination( aTripSegment, aTripIncident, CurrentLocation.InEditMode )
    }
    
    // 'action' attribute on TextCell (id=AffectedSegmentName) at TripIncidentSegmentsLV.pcf: line 58, column 43
    function action_dest_18 () : pcf.api.Destination {
      return pcf.TripSegmentPopup.createDestination( aTripSegment, aTripIncident, CurrentLocation.InEditMode )
    }
    
    // 'available' attribute on TextCell (id=ReasonForDenial) at TripIncidentSegmentsLV.pcf: line 82, column 77
    function available_27 () : java.lang.Boolean {
      return aTripSegment.ReasonForDenial == null or aTripSegment.ReasonForDenial.length == 0
    }
    
    // 'condition' attribute on ToolbarFlag at TripIncidentSegmentsLV.pcf: line 42, column 28
    function condition_10 () : java.lang.Boolean {
      return aTripSegment.Assessment == null
    }
    
    // 'condition' attribute on ToolbarFlag at TripIncidentSegmentsLV.pcf: line 31, column 30
    function condition_7 () : java.lang.Boolean {
      return aTripSegment.Assessment == TC_APPROVE
    }
    
    // 'condition' attribute on ToolbarFlag at TripIncidentSegmentsLV.pcf: line 34, column 27
    function condition_8 () : java.lang.Boolean {
      return aTripSegment.Assessment == TC_DENY 
    }
    
    // 'condition' attribute on ToolbarFlag at TripIncidentSegmentsLV.pcf: line 37, column 29
    function condition_9 () : java.lang.Boolean {
      return aTripSegment.Assessment == TC_REVIEW 
    }
    
    // 'value' attribute on TextCell (id=ReasonForDenial) at TripIncidentSegmentsLV.pcf: line 82, column 77
    function defaultSetter_34 (__VALUE_TO_SET :  java.lang.Object) : void {
      aTripSegment.ReasonForDenial = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'editable' attribute on TextCell (id=ReasonForDenial) at TripIncidentSegmentsLV.pcf: line 82, column 77
    function editable_28 () : java.lang.Boolean {
      return aTripSegment.Assessment == TC_DENY ? true : false
    }
    
    // 'value' attribute on TypeKeyCell (id=CarrierType) at TripIncidentSegmentsLV.pcf: line 51, column 46
    function valueRoot_15 () : java.lang.Object {
      return aTripSegment
    }
    
    // 'value' attribute on TypeKeyCell (id=CarrierType) at TripIncidentSegmentsLV.pcf: line 51, column 46
    function value_11 () : typekey.TransportType {
      return aTripSegment.TransportType
    }
    
    // 'value' attribute on TextCell (id=AffectedSegmentName) at TripIncidentSegmentsLV.pcf: line 58, column 43
    function value_16 () : entity.TripSegment {
      return aTripSegment
    }
    
    // 'value' attribute on TextCell (id=SegmentStatus) at TripIncidentSegmentsLV.pcf: line 63, column 174
    function value_20 () : java.lang.String {
      return aTripSegment.CancelOnly ? DisplayKey.get("Web.TripIncidentSegmentLV.Canceled") : DisplayKey.get("Web.TripIncidentSegmentLV.Rebooked")
    }
    
    // 'value' attribute on TypeKeyCell (id=Assessment) at TripIncidentSegmentsLV.pcf: line 69, column 49
    function value_22 () : typekey.AssessmentAction {
      return aTripSegment.Assessment
    }
    
    // 'value' attribute on CurrencyCell (id=SegmentCostIncurred) at TripIncidentSegmentsLV.pcf: line 74, column 81
    function value_25 () : gw.api.financials.CurrencyAmount {
      return aTripSegment.getFinancialImpact(AssessmentAction.TC_APPROVE)
    }
    
    // 'value' attribute on TextCell (id=ReasonForDenial) at TripIncidentSegmentsLV.pcf: line 82, column 77
    function value_29 () : java.lang.String {
      return aTripSegment.ReasonForDenial
    }
    
    property get aTripSegment () : entity.TripSegment {
      return getIteratedValue(1) as entity.TripSegment
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/TripIncidentSegmentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TripIncidentSegmentsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'pickLocation' attribute on RowIterator (id=TripSegmentIterator) at TripIncidentSegmentsLV.pcf: line 25, column 40
    function pickLocation_36 () : void {
      TripSegmentPopup.push( null, aTripIncident, CurrentLocation.InEditMode )
    }
    
    // 'sortBy' attribute on IteratorSort at TripIncidentSegmentsLV.pcf: line 28, column 24
    function sortBy_0 (aTripSegment :  entity.TripSegment) : java.lang.Object {
      return aTripSegment.StartDate
    }
    
    // 'value' attribute on RowIterator (id=TripSegmentIterator) at TripIncidentSegmentsLV.pcf: line 51, column 46
    function sortValue_1 (aTripSegment :  entity.TripSegment) : java.lang.Object {
      return aTripSegment.TransportType
    }
    
    // 'value' attribute on RowIterator (id=TripSegmentIterator) at TripIncidentSegmentsLV.pcf: line 58, column 43
    function sortValue_2 (aTripSegment :  entity.TripSegment) : java.lang.Object {
      return aTripSegment
    }
    
    // 'value' attribute on RowIterator (id=TripSegmentIterator) at TripIncidentSegmentsLV.pcf: line 63, column 174
    function sortValue_3 (aTripSegment :  entity.TripSegment) : java.lang.Object {
      return aTripSegment.CancelOnly ? DisplayKey.get("Web.TripIncidentSegmentLV.Canceled") : DisplayKey.get("Web.TripIncidentSegmentLV.Rebooked")
    }
    
    // 'value' attribute on RowIterator (id=TripSegmentIterator) at TripIncidentSegmentsLV.pcf: line 69, column 49
    function sortValue_4 (aTripSegment :  entity.TripSegment) : java.lang.Object {
      return aTripSegment.Assessment
    }
    
    // 'value' attribute on RowIterator (id=TripSegmentIterator) at TripIncidentSegmentsLV.pcf: line 74, column 81
    function sortValue_5 (aTripSegment :  entity.TripSegment) : java.lang.Object {
      return aTripSegment.getFinancialImpact(AssessmentAction.TC_APPROVE)
    }
    
    // 'value' attribute on RowIterator (id=TripSegmentIterator) at TripIncidentSegmentsLV.pcf: line 82, column 77
    function sortValue_6 (aTripSegment :  entity.TripSegment) : java.lang.Object {
      return aTripSegment.ReasonForDenial
    }
    
    // 'toRemove' attribute on RowIterator (id=TripSegmentIterator) at TripIncidentSegmentsLV.pcf: line 25, column 40
    function toRemove_37 (aTripSegment :  entity.TripSegment) : void {
      aTripIncident.removeFromTripSegments( aTripSegment )
    }
    
    // 'value' attribute on RowIterator (id=TripSegmentIterator) at TripIncidentSegmentsLV.pcf: line 25, column 40
    function value_38 () : entity.TripSegment[] {
      return aTripIncident.TripSegments
    }
    
    property get aTripIncident () : TripIncident {
      return getRequireValue("aTripIncident", 0) as TripIncident
    }
    
    property set aTripIncident ($arg :  TripIncident) {
      setRequireValue("aTripIncident", 0, $arg)
    }
    
    
  }
  
  
}