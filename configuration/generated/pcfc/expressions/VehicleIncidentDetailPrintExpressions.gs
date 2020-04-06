package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/print/VehicleIncidentDetailPrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class VehicleIncidentDetailPrintExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/print/VehicleIncidentDetailPrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VehicleIncidentDetailPrintExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (vehicleIncident :  VehicleIncident) : int {
      return 0
    }
    
    // 'canVisit' attribute on Page (id=VehicleIncidentDetailPrint) at VehicleIncidentDetailPrint.pcf: line 11, column 71
    static function canVisit_2 (vehicleIncident :  VehicleIncident) : java.lang.Boolean {
      return perm.Incident.view(vehicleIncident)
    }
    
    // 'def' attribute on PanelRef at VehicleIncidentDetailPrint.pcf: line 21, column 100
    function def_onEnter_0 (def :  pcf.VehIncidentDetailDV) : void {
      def.onEnter(vehicleIncident, new java.util.HashSet<ServiceRequest>())
    }
    
    // 'def' attribute on PanelRef at VehicleIncidentDetailPrint.pcf: line 21, column 100
    function def_refreshVariables_1 (def :  pcf.VehIncidentDetailDV) : void {
      def.refreshVariables(vehicleIncident, new java.util.HashSet<ServiceRequest>())
    }
    
    // 'infoBar' attribute on Page (id=VehicleIncidentDetailPrint) at VehicleIncidentDetailPrint.pcf: line 11, column 71
    function infoBar_onEnter_3 (def :  pcf.ClaimInfoBar) : void {
      def.onEnter(vehicleIncident.Claim)
    }
    
    // 'infoBar' attribute on Page (id=VehicleIncidentDetailPrint) at VehicleIncidentDetailPrint.pcf: line 11, column 71
    function infoBar_refreshVariables_4 (def :  pcf.ClaimInfoBar) : void {
      def.refreshVariables(vehicleIncident.Claim)
    }
    
    // 'parent' attribute on Page (id=VehicleIncidentDetailPrint) at VehicleIncidentDetailPrint.pcf: line 11, column 71
    static function parent_5 (vehicleIncident :  VehicleIncident) : pcf.api.Destination {
      return pcf.ClaimLossDetails.createDestination(vehicleIncident.Claim)
    }
    
    override property get CurrentLocation () : pcf.VehicleIncidentDetailPrint {
      return super.CurrentLocation as pcf.VehicleIncidentDetailPrint
    }
    
    property get vehicleIncident () : VehicleIncident {
      return getVariableValue("vehicleIncident", 0) as VehicleIncident
    }
    
    property set vehicleIncident ($arg :  VehicleIncident) {
      setVariableValue("vehicleIncident", 0, $arg)
    }
    
    
  }
  
  
}