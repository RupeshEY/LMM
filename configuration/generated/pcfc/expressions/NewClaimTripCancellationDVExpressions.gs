package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimTripCancellationDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewClaimTripCancellationDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimTripCancellationDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimTripCancellationDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=NewIncidentMenuItem) at NewClaimTripCancellationDV.pcf: line 31, column 104
    function action_3 () : void {
      TripIncidentPopup.push(Exposure.Claim)
    }
    
    // 'action' attribute on MenuItem (id=EditIncidentMenuItem) at NewClaimTripCancellationDV.pcf: line 37, column 52
    function action_6 () : void {
      TripIncidentPopup.push( Exposure.TripIncident, true )
    }
    
    // 'action' attribute on MenuItem (id=ViewIncidentMenuItem) at NewClaimTripCancellationDV.pcf: line 42, column 105
    function action_8 () : void {
      TripIncidentPopup.push( Exposure.TripIncident, false )
    }
    
    // 'action' attribute on MenuItem (id=NewIncidentMenuItem) at NewClaimTripCancellationDV.pcf: line 31, column 104
    function action_dest_4 () : pcf.api.Destination {
      return pcf.TripIncidentPopup.createDestination(Exposure.Claim)
    }
    
    // 'action' attribute on MenuItem (id=EditIncidentMenuItem) at NewClaimTripCancellationDV.pcf: line 37, column 52
    function action_dest_7 () : pcf.api.Destination {
      return pcf.TripIncidentPopup.createDestination( Exposure.TripIncident, true )
    }
    
    // 'action' attribute on MenuItem (id=ViewIncidentMenuItem) at NewClaimTripCancellationDV.pcf: line 42, column 105
    function action_dest_9 () : pcf.api.Destination {
      return pcf.TripIncidentPopup.createDestination( Exposure.TripIncident, false )
    }
    
    // 'def' attribute on InputSetRef at NewClaimTripCancellationDV.pcf: line 12, column 55
    function def_onEnter_0 (def :  pcf.ExposureDetailInputSet) : void {
      def.onEnter(Exposure, true)
    }
    
    // 'def' attribute on InputSetRef at NewClaimTripCancellationDV.pcf: line 53, column 58
    function def_onEnter_20 (def :  pcf.OtherCarrierInvolvementInputSet) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on InputSetRef at NewClaimTripCancellationDV.pcf: line 12, column 55
    function def_refreshVariables_1 (def :  pcf.ExposureDetailInputSet) : void {
      def.refreshVariables(Exposure, true)
    }
    
    // 'def' attribute on InputSetRef at NewClaimTripCancellationDV.pcf: line 53, column 58
    function def_refreshVariables_21 (def :  pcf.OtherCarrierInvolvementInputSet) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'value' attribute on RangeInput (id=TripIncident) at NewClaimTripCancellationDV.pcf: line 26, column 41
    function defaultSetter_11 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.TripIncident = (__VALUE_TO_SET as entity.TripIncident)
    }
    
    // 'optionLabel' attribute on RangeInput (id=TripIncident) at NewClaimTripCancellationDV.pcf: line 26, column 41
    function optionLabel_13 (VALUE :  entity.TripIncident) : java.lang.String {
      return VALUE.TripRU.DisplayName
    }
    
    // 'valueRange' attribute on RangeInput (id=TripIncident) at NewClaimTripCancellationDV.pcf: line 26, column 41
    function valueRange_14 () : java.lang.Object {
      return Exposure.Claim.TripIncidentsOnly
    }
    
    // 'value' attribute on RangeInput (id=TripIncident) at NewClaimTripCancellationDV.pcf: line 26, column 41
    function valueRoot_12 () : java.lang.Object {
      return Exposure
    }
    
    // 'value' attribute on TextInput (id=IncidentDescription) at NewClaimTripCancellationDV.pcf: line 48, column 48
    function valueRoot_19 () : java.lang.Object {
      return Exposure.Incident
    }
    
    // 'value' attribute on TextInput (id=IncidentDescription) at NewClaimTripCancellationDV.pcf: line 48, column 48
    function value_17 () : java.lang.String {
      return Exposure.Incident.Description
    }
    
    // 'value' attribute on RangeInput (id=TripIncident) at NewClaimTripCancellationDV.pcf: line 26, column 41
    function value_2 () : entity.TripIncident {
      return Exposure.TripIncident
    }
    
    // 'valueRange' attribute on RangeInput (id=TripIncident) at NewClaimTripCancellationDV.pcf: line 26, column 41
    function verifyValueRangeIsAllowedType_15 ($$arg :  entity.TripIncident[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=TripIncident) at NewClaimTripCancellationDV.pcf: line 26, column 41
    function verifyValueRangeIsAllowedType_15 ($$arg :  gw.api.database.IQueryBeanResult<entity.TripIncident>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=TripIncident) at NewClaimTripCancellationDV.pcf: line 26, column 41
    function verifyValueRangeIsAllowedType_15 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=TripIncident) at NewClaimTripCancellationDV.pcf: line 26, column 41
    function verifyValueRange_16 () : void {
      var __valueRangeArg = Exposure.Claim.TripIncidentsOnly
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_15(__valueRangeArg)
    }
    
    // 'visible' attribute on MenuItem (id=EditIncidentMenuItem) at NewClaimTripCancellationDV.pcf: line 37, column 52
    function visible_5 () : java.lang.Boolean {
      return Exposure.TripIncident != null
    }
    
    property get Exposure () : Exposure {
      return getRequireValue("Exposure", 0) as Exposure
    }
    
    property set Exposure ($arg :  Exposure) {
      setRequireValue("Exposure", 0, $arg)
    }
    
    
  }
  
  
}