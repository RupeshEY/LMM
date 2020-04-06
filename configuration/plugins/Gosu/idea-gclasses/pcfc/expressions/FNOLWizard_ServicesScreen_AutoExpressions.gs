package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_ServicesScreen.Auto.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FNOLWizard_ServicesScreen_AutoExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_ServicesScreen.Auto.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FNOLWizard_ServicesScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at FNOLWizard_ServicesScreen.Auto.pcf: line 79, column 210
    function def_onEnter_11 (def :  pcf.OtherServicesLVInputGroupInputSet) : void {
      def.onEnter(Claim, null, nonVehicleIncidentServiceRequests, Wizard.VehicleIncidentOtherServiceRequests, Wizard.UnusedServiceRequests, Claim.VehicleIncidentsOnly.toSet())
    }
    
    // 'def' attribute on InputSetRef at FNOLWizard_ServicesScreen.Auto.pcf: line 79, column 210
    function def_refreshVariables_12 (def :  pcf.OtherServicesLVInputGroupInputSet) : void {
      def.refreshVariables(Claim, null, nonVehicleIncidentServiceRequests, Wizard.VehicleIncidentOtherServiceRequests, Wizard.UnusedServiceRequests, Claim.VehicleIncidentsOnly.toSet())
    }
    
    // 'initialValue' attribute on Variable at FNOLWizard_ServicesScreen.Auto.pcf: line 18, column 58
    function initialValue_0 () : java.util.Set<entity.ServiceRequest> {
      return Claim.ServiceRequests.where(\ sr -> sr.Incident == null or sr.Incident.Subtype != typekey.Incident.TC_VEHICLEINCIDENT).toSet()
    }
    
    // 'sortBy' attribute on IteratorSort at FNOLWizard_ServicesScreen.Auto.pcf: line 39, column 24
    function sortBy_1 (VehicleIncident :  entity.VehicleIncident) : java.lang.Object {
      return VehicleIncident.VehicleLossParty
    }
    
    // 'value' attribute on PanelIterator (id=VehiclesPanelIterator) at FNOLWizard_ServicesScreen.Auto.pcf: line 36, column 44
    function value_10 () : entity.VehicleIncident[] {
      return Claim.VehicleIncidentsOnly
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get Wizard () : gw.api.claim.NewClaimWizardInfo {
      return getRequireValue("Wizard", 0) as gw.api.claim.NewClaimWizardInfo
    }
    
    property set Wizard ($arg :  gw.api.claim.NewClaimWizardInfo) {
      setRequireValue("Wizard", 0, $arg)
    }
    
    property get nonVehicleIncidentServiceRequests () : java.util.Set<entity.ServiceRequest> {
      return getVariableValue("nonVehicleIncidentServiceRequests", 0) as java.util.Set<entity.ServiceRequest>
    }
    
    property set nonVehicleIncidentServiceRequests ($arg :  java.util.Set<entity.ServiceRequest>) {
      setVariableValue("nonVehicleIncidentServiceRequests", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_ServicesScreen.Auto.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends FNOLWizard_ServicesScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at FNOLWizard_ServicesScreen.Auto.pcf: line 71, column 135
    function def_onEnter_8 (def :  pcf.VehicleIncidentPanelSet) : void {
      def.onEnter(VehicleIncident, Wizard.UnusedServiceRequests, Wizard.VehicleIncidentOtherServiceRequests)
    }
    
    // 'def' attribute on PanelRef at FNOLWizard_ServicesScreen.Auto.pcf: line 71, column 135
    function def_refreshVariables_9 (def :  pcf.VehicleIncidentPanelSet) : void {
      def.refreshVariables(VehicleIncident, Wizard.UnusedServiceRequests, Wizard.VehicleIncidentOtherServiceRequests)
    }
    
    // 'icon' attribute on BooleanRadioInput (id=vehicleIcon) at FNOLWizard_ServicesScreen.Auto.pcf: line 52, column 38
    function icon_2 () : java.lang.String {
      return VehicleIncident.PanelIcon
    }
    
    // 'value' attribute on TextAreaInput (id=VehicleIncidentDetail) at FNOLWizard_ServicesScreen.Auto.pcf: line 64, column 54
    function valueRoot_7 () : java.lang.Object {
      return VehicleIncident
    }
    
    // 'value' attribute on TextInput (id=VehicleName) at FNOLWizard_ServicesScreen.Auto.pcf: line 59, column 271
    function value_3 () : java.lang.String {
      return VehicleIncident.Vehicle.ShortDisplayName == DisplayKey.get("Java.DisplayName.NewlyCreated") ? DisplayKey.get("Web.NewLossDetailsScreen.VehicleIncidentIterator.UnknownVehicle.Value") : VehicleIncident.Vehicle.ShortDisplayName
    }
    
    // 'value' attribute on TextAreaInput (id=VehicleIncidentDetail) at FNOLWizard_ServicesScreen.Auto.pcf: line 64, column 54
    function value_5 () : java.lang.String {
      return VehicleIncident.Description
    }
    
    property get VehicleIncident () : entity.VehicleIncident {
      return getIteratedValue(1) as entity.VehicleIncident
    }
    
    
  }
  
  
}