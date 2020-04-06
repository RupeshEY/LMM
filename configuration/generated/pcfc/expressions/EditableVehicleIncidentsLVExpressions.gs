package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/EditableVehicleIncidentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditableVehicleIncidentsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/EditableVehicleIncidentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableVehicleIncidentsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'pickLocation' attribute on RowIterator at EditableVehicleIncidentsLV.pcf: line 22, column 44
    function pickLocation_28 () : void {
      NewVehicleIncidentPopup.push(Claim)
    }
    
    // 'value' attribute on RowIterator at EditableVehicleIncidentsLV.pcf: line 33, column 47
    function sortValue_0 (VehicleIncident :  entity.VehicleIncident) : java.lang.Object {
      return VehicleIncident
    }
    
    // 'value' attribute on RowIterator at EditableVehicleIncidentsLV.pcf: line 40, column 50
    function sortValue_1 (VehicleIncident :  entity.VehicleIncident) : java.lang.Object {
      return VehicleIncident.Vehicle.Model
    }
    
    // 'value' attribute on RowIterator at EditableVehicleIncidentsLV.pcf: line 47, column 29
    function sortValue_2 (VehicleIncident :  entity.VehicleIncident) : java.lang.Object {
      return VehicleIncident.Vehicle.LicensePlate
    }
    
    // 'value' attribute on RowIterator at EditableVehicleIncidentsLV.pcf: line 54, column 29
    function sortValue_3 (VehicleIncident :  entity.VehicleIncident) : java.lang.Object {
      return VehicleIncident.Vehicle.State
    }
    
    // 'value' attribute on RowIterator at EditableVehicleIncidentsLV.pcf: line 60, column 29
    function sortValue_4 (VehicleIncident :  entity.VehicleIncident) : java.lang.Object {
      return VehicleIncident.VehicleLossParty
    }
    
    // 'value' attribute on RowIterator at EditableVehicleIncidentsLV.pcf: line 66, column 38
    function sortValue_5 (VehicleIncident :  entity.VehicleIncident) : java.lang.Object {
      return VehicleIncident.driver
    }
    
    // 'toRemove' attribute on RowIterator at EditableVehicleIncidentsLV.pcf: line 22, column 44
    function toRemove_29 (VehicleIncident :  entity.VehicleIncident) : void {
      Claim.removeNewServiceRequests(VehicleIncident); removeVehicleIncident(VehicleIncident)
    }
    
    // 'value' attribute on RowIterator at EditableVehicleIncidentsLV.pcf: line 22, column 44
    function value_30 () : entity.VehicleIncident[] {
      return Claim.VehicleIncidentsOnly
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    
    function removeVehicleIncident(vehicleIncidentParam : VehicleIncident) {
      if (vehicleIncidentParam.UsedByExposure) {
          throw new gw.api.util.DisplayableException(DisplayKey.get("Web.NewLossDetailsScreen.CannotDeleteVehicleIncidentExposureLabel"))
      }  
      for (report in Claim.MetroReports) {
        if (report.VehicleIncident == vehicleIncidentParam){      
          throw new gw.api.util.DisplayableException(DisplayKey.get("Web.NewLossDetailsScreen.CannotDeleteVehicleIncidentExceptionLabel"))      
        }
      }
      Claim.removeFromIncidents( vehicleIncidentParam )
      
    }
        
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/EditableVehicleIncidentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends EditableVehicleIncidentsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Model) at EditableVehicleIncidentsLV.pcf: line 40, column 50
    function action_12 () : void {
      EditVehicleIncidentPopup.push(VehicleIncident, CurrentLocation.InEditMode)
    }
    
    // 'action' attribute on TextCell (id=Make) at EditableVehicleIncidentsLV.pcf: line 33, column 47
    function action_7 () : void {
      EditVehicleIncidentPopup.push(VehicleIncident, CurrentLocation.InEditMode)
    }
    
    // 'action' attribute on TextCell (id=Model) at EditableVehicleIncidentsLV.pcf: line 40, column 50
    function action_dest_13 () : pcf.api.Destination {
      return pcf.EditVehicleIncidentPopup.createDestination(VehicleIncident, CurrentLocation.InEditMode)
    }
    
    // 'action' attribute on TextCell (id=Make) at EditableVehicleIncidentsLV.pcf: line 33, column 47
    function action_dest_8 () : pcf.api.Destination {
      return pcf.EditVehicleIncidentPopup.createDestination(VehicleIncident, CurrentLocation.InEditMode)
    }
    
    // 'outputConversion' attribute on TextCell (id=Make) at EditableVehicleIncidentsLV.pcf: line 33, column 47
    function outputConversion_9 (VALUE :  entity.VehicleIncident) : java.lang.String {
      return VALUE.Vehicle.Make != null ? VALUE.Vehicle.Make : DisplayKey.get("Web.EditableVehicleIncidentsLV.Unknown")
    }
    
    // 'value' attribute on TextCell (id=Model) at EditableVehicleIncidentsLV.pcf: line 40, column 50
    function valueRoot_15 () : java.lang.Object {
      return VehicleIncident.Vehicle
    }
    
    // 'value' attribute on TypeKeyCell (id=LossParty) at EditableVehicleIncidentsLV.pcf: line 60, column 29
    function valueRoot_24 () : java.lang.Object {
      return VehicleIncident
    }
    
    // 'value' attribute on TextCell (id=Model) at EditableVehicleIncidentsLV.pcf: line 40, column 50
    function value_11 () : java.lang.String {
      return VehicleIncident.Vehicle.Model
    }
    
    // 'value' attribute on TextCell (id=LicensePlate) at EditableVehicleIncidentsLV.pcf: line 47, column 29
    function value_16 () : java.lang.String {
      return VehicleIncident.Vehicle.LicensePlate
    }
    
    // 'value' attribute on TypeKeyCell (id=State) at EditableVehicleIncidentsLV.pcf: line 54, column 29
    function value_19 () : typekey.Jurisdiction {
      return VehicleIncident.Vehicle.State
    }
    
    // 'value' attribute on TypeKeyCell (id=LossParty) at EditableVehicleIncidentsLV.pcf: line 60, column 29
    function value_22 () : typekey.LossPartyType {
      return VehicleIncident.VehicleLossParty
    }
    
    // 'value' attribute on TextCell (id=Driver) at EditableVehicleIncidentsLV.pcf: line 66, column 38
    function value_25 () : entity.Person {
      return VehicleIncident.driver
    }
    
    // 'value' attribute on TextCell (id=Make) at EditableVehicleIncidentsLV.pcf: line 33, column 47
    function value_6 () : entity.VehicleIncident {
      return VehicleIncident
    }
    
    property get VehicleIncident () : entity.VehicleIncident {
      return getIteratedValue(1) as entity.VehicleIncident
    }
    
    
  }
  
  
}