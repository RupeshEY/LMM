package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/vehicle/NewVehicleIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewVehicleIncidentPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/vehicle/NewVehicleIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewVehicleIncidentPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'beforeCommit' attribute on Popup (id=NewVehicleIncidentPopup) at NewVehicleIncidentPopup.pcf: line 12, column 70
    function beforeCommit_7 (pickedValue :  VehicleIncident) : void {
      VehicleIncident.Claim.cleanAndFinishServiceRequests(unusedServiceRequests); VehicleIncident.Claim.instructNewServiceRequests()
    }
    
    // 'canVisit' attribute on Popup (id=NewVehicleIncidentPopup) at NewVehicleIncidentPopup.pcf: line 12, column 70
    static function canVisit_8 (Claim :  Claim) : java.lang.Boolean {
      return perm.Claim.createincident(Claim)
    }
    
    // 'def' attribute on PanelRef at NewVehicleIncidentPopup.pcf: line 35, column 76
    function def_onEnter_5 (def :  pcf.VehIncidentDetailDV) : void {
      def.onEnter(VehicleIncident, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewVehicleIncidentPopup.pcf: line 35, column 76
    function def_refreshVariables_6 (def :  pcf.VehIncidentDetailDV) : void {
      def.refreshVariables(VehicleIncident, unusedServiceRequests)
    }
    
    // 'icon' attribute on TitleBar at NewVehicleIncidentPopup.pcf: line 29, column 44
    function icon_2 () : java.lang.String {
      return VehicleIncident.HeaderIcon
    }
    
    // 'initialValue' attribute on Variable at NewVehicleIncidentPopup.pcf: line 21, column 38
    function initialValue_0 () : entity.VehicleIncident {
      return initializeVehicleIncident()
    }
    
    // 'initialValue' attribute on Variable at NewVehicleIncidentPopup.pcf: line 25, column 51
    function initialValue_1 () : java.util.Set<ServiceRequest> {
      return new java.util.HashSet<ServiceRequest>()
    }
    
    // EditButtons at NewVehicleIncidentPopup.pcf: line 32, column 40
    function label_4 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'pickValue' attribute on EditButtons at NewVehicleIncidentPopup.pcf: line 32, column 40
    function pickValue_3 () : VehicleIncident {
      return VehicleIncident
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.NewVehicleIncidentPopup {
      return super.CurrentLocation as pcf.NewVehicleIncidentPopup
    }
    
    property get VehicleIncident () : entity.VehicleIncident {
      return getVariableValue("VehicleIncident", 0) as entity.VehicleIncident
    }
    
    property set VehicleIncident ($arg :  entity.VehicleIncident) {
      setVariableValue("VehicleIncident", 0, $arg)
    }
    
    property get unusedServiceRequests () : java.util.Set<ServiceRequest> {
      return getVariableValue("unusedServiceRequests", 0) as java.util.Set<ServiceRequest>
    }
    
    property set unusedServiceRequests ($arg :  java.util.Set<ServiceRequest>) {
      setVariableValue("unusedServiceRequests", 0, $arg)
    }
    
    function initializeVehicleIncident() : VehicleIncident{
     var newIncident =  Claim.newIncident(entity.VehicleIncident) as VehicleIncident
     if(Claim.LossType == TC_TRAV)
       newIncident.VehicleLossParty = TC_THIRD_PARTY
     return newIncident  
    }
    
    
  }
  
  
}