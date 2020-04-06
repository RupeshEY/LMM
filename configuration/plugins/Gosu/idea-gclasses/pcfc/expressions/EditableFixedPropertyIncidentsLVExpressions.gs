package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/EditableFixedPropertyIncidentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditableFixedPropertyIncidentsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/EditableFixedPropertyIncidentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableFixedPropertyIncidentsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'pickLocation' attribute on RowIterator at EditableFixedPropertyIncidentsLV.pcf: line 22, column 50
    function pickLocation_17 () : void {
      NewFixedPropertyIncidentPopup.push(Claim)
    }
    
    // 'value' attribute on RowIterator at EditableFixedPropertyIncidentsLV.pcf: line 34, column 53
    function sortValue_0 (FixedPropertyIncident :  entity.FixedPropertyIncident) : java.lang.Object {
      return FixedPropertyIncident
    }
    
    // 'sortBy' attribute on RowIterator at EditableFixedPropertyIncidentsLV.pcf: line 41, column 71
    function sortValue_1 (FixedPropertyIncident :  entity.FixedPropertyIncident) : java.lang.Object {
      return FixedPropertyIncident.Property.Address.City
    }
    
    // 'value' attribute on RowIterator at EditableFixedPropertyIncidentsLV.pcf: line 47, column 38
    function sortValue_2 (FixedPropertyIncident :  entity.FixedPropertyIncident) : java.lang.Object {
      return FixedPropertyIncident.Property.Address.State
    }
    
    // 'toRemove' attribute on RowIterator at EditableFixedPropertyIncidentsLV.pcf: line 22, column 50
    function toRemove_18 (FixedPropertyIncident :  entity.FixedPropertyIncident) : void {
      Claim.removeNewServiceRequests(FixedPropertyIncident); Claim.removeFromIncidents(FixedPropertyIncident)
    }
    
    // 'value' attribute on RowIterator at EditableFixedPropertyIncidentsLV.pcf: line 22, column 50
    function value_19 () : entity.FixedPropertyIncident[] {
      return Claim.FixedPropertyIncidentsOnly
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/EditableFixedPropertyIncidentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends EditableFixedPropertyIncidentsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=City) at EditableFixedPropertyIncidentsLV.pcf: line 41, column 71
    function action_10 () : void {
      EditFixedPropertyIncidentPopup.push(FixedPropertyIncident, CurrentLocation.InEditMode)
    }
    
    // 'action' attribute on TextCell (id=Address1) at EditableFixedPropertyIncidentsLV.pcf: line 34, column 53
    function action_5 () : void {
      EditFixedPropertyIncidentPopup.push(FixedPropertyIncident, CurrentLocation.InEditMode)
    }
    
    // 'action' attribute on TextCell (id=City) at EditableFixedPropertyIncidentsLV.pcf: line 41, column 71
    function action_dest_11 () : pcf.api.Destination {
      return pcf.EditFixedPropertyIncidentPopup.createDestination(FixedPropertyIncident, CurrentLocation.InEditMode)
    }
    
    // 'action' attribute on TextCell (id=Address1) at EditableFixedPropertyIncidentsLV.pcf: line 34, column 53
    function action_dest_6 () : pcf.api.Destination {
      return pcf.EditFixedPropertyIncidentPopup.createDestination(FixedPropertyIncident, CurrentLocation.InEditMode)
    }
    
    // 'condition' attribute on ToolbarFlag at EditableFixedPropertyIncidentsLV.pcf: line 25, column 28
    function condition_3 () : java.lang.Boolean {
      return !FixedPropertyIncident.UsedByExposure
    }
    
    // 'outputConversion' attribute on TextCell (id=Address1) at EditableFixedPropertyIncidentsLV.pcf: line 34, column 53
    function outputConversion_7 (VALUE :  entity.FixedPropertyIncident) : java.lang.String {
      return VALUE.Property.Address.AddressLine1 != null ? VALUE.Property.Address.AddressLine1 : DisplayKey.get("Web.EditableFixedPropertyIncidentsLV.Unknown")
    }
    
    // 'value' attribute on TextCell (id=City) at EditableFixedPropertyIncidentsLV.pcf: line 41, column 71
    function valueRoot_13 () : java.lang.Object {
      return FixedPropertyIncident.Property.Address
    }
    
    // 'value' attribute on TypeKeyCell (id=State) at EditableFixedPropertyIncidentsLV.pcf: line 47, column 38
    function value_14 () : typekey.State {
      return FixedPropertyIncident.Property.Address.State
    }
    
    // 'value' attribute on TextCell (id=Address1) at EditableFixedPropertyIncidentsLV.pcf: line 34, column 53
    function value_4 () : entity.FixedPropertyIncident {
      return FixedPropertyIncident
    }
    
    // 'value' attribute on TextCell (id=City) at EditableFixedPropertyIncidentsLV.pcf: line 41, column 71
    function value_9 () : java.lang.String {
      return FixedPropertyIncident.Property.Address.DisplayCity
    }
    
    property get FixedPropertyIncident () : entity.FixedPropertyIncident {
      return getIteratedValue(1) as entity.FixedPropertyIncident
    }
    
    
  }
  
  
}