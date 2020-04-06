package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/TripCancellationDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TripCancellationDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/exposures/TripCancellationDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TripCancellationDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=ViewIncidentMenuItem) at TripCancellationDV.pcf: line 44, column 105
    function action_10 () : void {
      TripIncidentPopup.push( Exposure.TripIncident, false )
    }
    
    // 'action' attribute on MenuItem (id=NewIncidentMenuItem) at TripCancellationDV.pcf: line 33, column 104
    function action_5 () : void {
      TripIncidentPopup.push(Exposure.Claim)
    }
    
    // 'action' attribute on MenuItem (id=EditIncidentMenuItem) at TripCancellationDV.pcf: line 39, column 52
    function action_8 () : void {
      TripIncidentPopup.push( Exposure.TripIncident, true )
    }
    
    // 'action' attribute on MenuItem (id=ViewIncidentMenuItem) at TripCancellationDV.pcf: line 44, column 105
    function action_dest_11 () : pcf.api.Destination {
      return pcf.TripIncidentPopup.createDestination( Exposure.TripIncident, false )
    }
    
    // 'action' attribute on MenuItem (id=NewIncidentMenuItem) at TripCancellationDV.pcf: line 33, column 104
    function action_dest_6 () : pcf.api.Destination {
      return pcf.TripIncidentPopup.createDestination(Exposure.Claim)
    }
    
    // 'action' attribute on MenuItem (id=EditIncidentMenuItem) at TripCancellationDV.pcf: line 39, column 52
    function action_dest_9 () : pcf.api.Destination {
      return pcf.TripIncidentPopup.createDestination( Exposure.TripIncident, true )
    }
    
    // 'def' attribute on InputSetRef at TripCancellationDV.pcf: line 12, column 56
    function def_onEnter_0 (def :  pcf.ExposureDetailInputSet) : void {
      def.onEnter(Exposure, false)
    }
    
    // 'def' attribute on InputSetRef at TripCancellationDV.pcf: line 14, column 51
    function def_onEnter_2 (def :  pcf.ExposureWorkloadInputSet) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on InputSetRef at TripCancellationDV.pcf: line 53, column 59
    function def_onEnter_22 (def :  pcf.ExposureCodingFinancialsInputSet) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on InputSetRef at TripCancellationDV.pcf: line 57, column 58
    function def_onEnter_24 (def :  pcf.OtherCarrierInvolvementInputSet) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on InputSetRef at TripCancellationDV.pcf: line 12, column 56
    function def_refreshVariables_1 (def :  pcf.ExposureDetailInputSet) : void {
      def.refreshVariables(Exposure, false)
    }
    
    // 'def' attribute on InputSetRef at TripCancellationDV.pcf: line 53, column 59
    function def_refreshVariables_23 (def :  pcf.ExposureCodingFinancialsInputSet) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on InputSetRef at TripCancellationDV.pcf: line 57, column 58
    function def_refreshVariables_25 (def :  pcf.OtherCarrierInvolvementInputSet) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on InputSetRef at TripCancellationDV.pcf: line 14, column 51
    function def_refreshVariables_3 (def :  pcf.ExposureWorkloadInputSet) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'value' attribute on RangeInput (id=TripIncident) at TripCancellationDV.pcf: line 28, column 41
    function defaultSetter_13 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.TripIncident = (__VALUE_TO_SET as entity.TripIncident)
    }
    
    // 'optionLabel' attribute on RangeInput (id=TripIncident) at TripCancellationDV.pcf: line 28, column 41
    function optionLabel_15 (VALUE :  entity.TripIncident) : java.lang.String {
      return VALUE.TripRU.DisplayName
    }
    
    // 'valueRange' attribute on RangeInput (id=TripIncident) at TripCancellationDV.pcf: line 28, column 41
    function valueRange_16 () : java.lang.Object {
      return Exposure.Claim.TripIncidentsOnly
    }
    
    // 'value' attribute on RangeInput (id=TripIncident) at TripCancellationDV.pcf: line 28, column 41
    function valueRoot_14 () : java.lang.Object {
      return Exposure
    }
    
    // 'value' attribute on TextInput (id=IncidentDescription) at TripCancellationDV.pcf: line 50, column 48
    function valueRoot_21 () : java.lang.Object {
      return Exposure.Incident
    }
    
    // 'value' attribute on TextInput (id=IncidentDescription) at TripCancellationDV.pcf: line 50, column 48
    function value_19 () : java.lang.String {
      return Exposure.Incident.Description
    }
    
    // 'value' attribute on RangeInput (id=TripIncident) at TripCancellationDV.pcf: line 28, column 41
    function value_4 () : entity.TripIncident {
      return Exposure.TripIncident
    }
    
    // 'valueRange' attribute on RangeInput (id=TripIncident) at TripCancellationDV.pcf: line 28, column 41
    function verifyValueRangeIsAllowedType_17 ($$arg :  entity.TripIncident[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=TripIncident) at TripCancellationDV.pcf: line 28, column 41
    function verifyValueRangeIsAllowedType_17 ($$arg :  gw.api.database.IQueryBeanResult<entity.TripIncident>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=TripIncident) at TripCancellationDV.pcf: line 28, column 41
    function verifyValueRangeIsAllowedType_17 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=TripIncident) at TripCancellationDV.pcf: line 28, column 41
    function verifyValueRange_18 () : void {
      var __valueRangeArg = Exposure.Claim.TripIncidentsOnly
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_17(__valueRangeArg)
    }
    
    // 'visible' attribute on MenuItem (id=EditIncidentMenuItem) at TripCancellationDV.pcf: line 39, column 52
    function visible_7 () : java.lang.Boolean {
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