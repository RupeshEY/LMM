package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/EditableInjuryIncidentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditableInjuryIncidentsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/EditableInjuryIncidentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableInjuryIncidentsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'pickLocation' attribute on RowIterator at EditableInjuryIncidentsLV.pcf: line 22, column 43
    function pickLocation_17 () : void {
      NewInjuryIncidentPopup.push(Claim)
    }
    
    // 'value' attribute on RowIterator at EditableInjuryIncidentsLV.pcf: line 33, column 38
    function sortValue_0 (InjuryIncident :  entity.InjuryIncident) : java.lang.Object {
      return InjuryIncident.injured
    }
    
    // 'value' attribute on RowIterator at EditableInjuryIncidentsLV.pcf: line 40, column 45
    function sortValue_1 (InjuryIncident :  entity.InjuryIncident) : java.lang.Object {
      return InjuryIncident.Severity
    }
    
    // 'value' attribute on RowIterator at EditableInjuryIncidentsLV.pcf: line 45, column 47
    function sortValue_2 (InjuryIncident :  entity.InjuryIncident) : java.lang.Object {
      return InjuryIncident.Description
    }
    
    // 'toRemove' attribute on RowIterator at EditableInjuryIncidentsLV.pcf: line 22, column 43
    function toRemove_18 (InjuryIncident :  entity.InjuryIncident) : void {
      Claim.removeNewServiceRequests(InjuryIncident); Claim.removeFromIncidents(InjuryIncident)
    }
    
    // 'value' attribute on RowIterator at EditableInjuryIncidentsLV.pcf: line 22, column 43
    function value_19 () : entity.InjuryIncident[] {
      return Claim.InjuryIncidentsOnly
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/EditableInjuryIncidentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends EditableInjuryIncidentsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TypeKeyCell (id=Severity) at EditableInjuryIncidentsLV.pcf: line 40, column 45
    function action_10 () : void {
      EditInjuryIncidentPopup.push(InjuryIncident, CurrentLocation.InEditMode)
    }
    
    // 'action' attribute on TextCell (id=Name) at EditableInjuryIncidentsLV.pcf: line 33, column 38
    function action_5 () : void {
      EditInjuryIncidentPopup.push(InjuryIncident, CurrentLocation.InEditMode)
    }
    
    // 'action' attribute on TypeKeyCell (id=Severity) at EditableInjuryIncidentsLV.pcf: line 40, column 45
    function action_dest_11 () : pcf.api.Destination {
      return pcf.EditInjuryIncidentPopup.createDestination(InjuryIncident, CurrentLocation.InEditMode)
    }
    
    // 'action' attribute on TextCell (id=Name) at EditableInjuryIncidentsLV.pcf: line 33, column 38
    function action_dest_6 () : pcf.api.Destination {
      return pcf.EditInjuryIncidentPopup.createDestination(InjuryIncident, CurrentLocation.InEditMode)
    }
    
    // 'condition' attribute on ToolbarFlag at EditableInjuryIncidentsLV.pcf: line 25, column 28
    function condition_3 () : java.lang.Boolean {
      return !InjuryIncident.UsedByExposure
    }
    
    // 'value' attribute on TextCell (id=Name) at EditableInjuryIncidentsLV.pcf: line 33, column 38
    function valueRoot_8 () : java.lang.Object {
      return InjuryIncident
    }
    
    // 'value' attribute on TextCell (id=Description) at EditableInjuryIncidentsLV.pcf: line 45, column 47
    function value_14 () : java.lang.String {
      return InjuryIncident.Description
    }
    
    // 'value' attribute on TextCell (id=Name) at EditableInjuryIncidentsLV.pcf: line 33, column 38
    function value_4 () : entity.Person {
      return InjuryIncident.injured
    }
    
    // 'value' attribute on TypeKeyCell (id=Severity) at EditableInjuryIncidentsLV.pcf: line 40, column 45
    function value_9 () : typekey.SeverityType {
      return InjuryIncident.Severity
    }
    
    property get InjuryIncident () : entity.InjuryIncident {
      return getIteratedValue(1) as entity.InjuryIncident
    }
    
    
  }
  
  
}