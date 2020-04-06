package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/assessment/VehIncidentDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class VehIncidentDetailDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/assessment/VehIncidentDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VehIncidentDetailDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at VehIncidentDetailDV.pcf: line 17, column 74
    function def_onEnter_0 (def :  pcf.VehicleIncidentDV) : void {
      def.onEnter(VehicleIncident, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at VehIncidentDetailDV.pcf: line 23, column 52
    function def_onEnter_2 (def :  pcf.VehIncidentAssessDV) : void {
      def.onEnter(VehicleIncident)
    }
    
    // 'def' attribute on PanelRef at VehIncidentDetailDV.pcf: line 17, column 74
    function def_refreshVariables_1 (def :  pcf.VehicleIncidentDV) : void {
      def.refreshVariables(VehicleIncident, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at VehIncidentDetailDV.pcf: line 23, column 52
    function def_refreshVariables_3 (def :  pcf.VehIncidentAssessDV) : void {
      def.refreshVariables(VehicleIncident)
    }
    
    property get VehicleIncident () : VehicleIncident {
      return getRequireValue("VehicleIncident", 0) as VehicleIncident
    }
    
    property set VehicleIncident ($arg :  VehicleIncident) {
      setRequireValue("VehicleIncident", 0, $arg)
    }
    
    property get unusedServiceRequests () : java.util.Set<ServiceRequest> {
      return getRequireValue("unusedServiceRequests", 0) as java.util.Set<ServiceRequest>
    }
    
    property set unusedServiceRequests ($arg :  java.util.Set<ServiceRequest>) {
      setRequireValue("unusedServiceRequests", 0, $arg)
    }
    
    
  }
  
  
}