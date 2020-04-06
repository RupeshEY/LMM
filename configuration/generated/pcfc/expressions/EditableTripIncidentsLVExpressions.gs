package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/EditableTripIncidentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditableTripIncidentsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/EditableTripIncidentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableTripIncidentsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'pickLocation' attribute on RowIterator at EditableTripIncidentsLV.pcf: line 26, column 41
    function pickLocation_16 () : void {
      TripIncidentPopup.push(Claim)
    }
    
    // 'value' attribute on RowIterator at EditableTripIncidentsLV.pcf: line 35, column 172
    function sortValue_0 (TripIncident :  entity.TripIncident) : java.lang.Object {
      return TripIncident.TripRU.DisplayName.length > 60 ? TripIncident.TripRU.DisplayName.substring( 0, 57 ) + "..." : TripIncident.TripRU.DisplayName
    }
    
    // 'value' attribute on RowIterator at EditableTripIncidentsLV.pcf: line 41, column 45
    function sortValue_1 (TripIncident :  entity.TripIncident) : java.lang.Object {
      return TripIncident.Description
    }
    
    // 'value' attribute on RowIterator at EditableTripIncidentsLV.pcf: line 46, column 88
    function sortValue_2 (TripIncident :  entity.TripIncident) : java.lang.Object {
      return TripIncident.getTotalFinancialImpact( AssessmentAction.TC_APPROVE )
    }
    
    // 'toRemove' attribute on RowIterator at EditableTripIncidentsLV.pcf: line 26, column 41
    function toRemove_17 (TripIncident :  entity.TripIncident) : void {
      removeTripIncident(TripIncident)
    }
    
    // 'value' attribute on RowIterator at EditableTripIncidentsLV.pcf: line 26, column 41
    function value_18 () : entity.TripIncident[] {
      return Claim.TripIncidentsOnly
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get Wizard () : Boolean {
      return getRequireValue("Wizard", 0) as Boolean
    }
    
    property set Wizard ($arg :  Boolean) {
      setRequireValue("Wizard", 0, $arg)
    }
    
    function removeTripIncident(tripIncidentParam : TripIncident) {
      if (tripIncidentParam.UsedByExposure) {
          throw new gw.api.util.DisplayableException(DisplayKey.get("Web.NewLossDetailsScreen.CannotDeleteBaggageIncidentExposureLabel"))    
      }  
      Claim.removeNewServiceRequests(tripIncidentParam)
      Claim.removeFromIncidents( tripIncidentParam )
      
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/EditableTripIncidentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends EditableTripIncidentsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=TripRU) at EditableTripIncidentsLV.pcf: line 35, column 172
    function action_4 () : void {
      TripIncidentPopup.push( TripIncident, CurrentLocation.InEditMode )
    }
    
    // 'action' attribute on TextCell (id=TripRU) at EditableTripIncidentsLV.pcf: line 35, column 172
    function action_dest_5 () : pcf.api.Destination {
      return pcf.TripIncidentPopup.createDestination( TripIncident, CurrentLocation.InEditMode )
    }
    
    // 'checkBoxVisible' attribute on RowIterator at EditableTripIncidentsLV.pcf: line 26, column 41
    function checkBoxVisible_15 () : java.lang.Boolean {
      return Wizard == false
    }
    
    // 'value' attribute on TextCell (id=Description) at EditableTripIncidentsLV.pcf: line 41, column 45
    function defaultSetter_11 (__VALUE_TO_SET :  java.lang.Object) : void {
      TripIncident.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'editable' attribute on TextCell (id=Description) at EditableTripIncidentsLV.pcf: line 41, column 45
    function editable_7 () : java.lang.Boolean {
      return Wizard
    }
    
    // 'value' attribute on TextCell (id=Description) at EditableTripIncidentsLV.pcf: line 41, column 45
    function valueRoot_12 () : java.lang.Object {
      return TripIncident
    }
    
    // 'value' attribute on CurrencyCell (id=CostIncurred) at EditableTripIncidentsLV.pcf: line 46, column 88
    function value_13 () : gw.api.financials.CurrencyAmount {
      return TripIncident.getTotalFinancialImpact( AssessmentAction.TC_APPROVE )
    }
    
    // 'value' attribute on TextCell (id=TripRU) at EditableTripIncidentsLV.pcf: line 35, column 172
    function value_3 () : java.lang.String {
      return TripIncident.TripRU.DisplayName.length > 60 ? TripIncident.TripRU.DisplayName.substring( 0, 57 ) + "..." : TripIncident.TripRU.DisplayName
    }
    
    // 'value' attribute on TextCell (id=Description) at EditableTripIncidentsLV.pcf: line 41, column 45
    function value_8 () : java.lang.String {
      return TripIncident.Description
    }
    
    property get TripIncident () : entity.TripIncident {
      return getIteratedValue(1) as entity.TripIncident
    }
    
    
  }
  
  
}