package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/RentalServiceDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RentalServiceDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/RentalServiceDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RentalServiceDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef (id=RentalServiceInputSet) at RentalServiceDV.pcf: line 19, column 37
    function def_onEnter_0 (def :  pcf.RentalServiceInputSet) : void {
      def.onEnter(rentalService, incident, unusedServiceRequests)
    }
    
    // 'def' attribute on InputSetRef (id=RentalServiceInputSet) at RentalServiceDV.pcf: line 19, column 37
    function def_refreshVariables_1 (def :  pcf.RentalServiceInputSet) : void {
      def.refreshVariables(rentalService, incident, unusedServiceRequests)
    }
    
    property get incident () : VehicleIncident {
      return getRequireValue("incident", 0) as VehicleIncident
    }
    
    property set incident ($arg :  VehicleIncident) {
      setRequireValue("incident", 0, $arg)
    }
    
    property get rentalService () : ServiceRequest {
      return getRequireValue("rentalService", 0) as ServiceRequest
    }
    
    property set rentalService ($arg :  ServiceRequest) {
      setRequireValue("rentalService", 0, $arg)
    }
    
    property get unusedServiceRequests () : java.util.Set<ServiceRequest> {
      return getRequireValue("unusedServiceRequests", 0) as java.util.Set<ServiceRequest>
    }
    
    property set unusedServiceRequests ($arg :  java.util.Set<ServiceRequest>) {
      setRequireValue("unusedServiceRequests", 0, $arg)
    }
    
    
  }
  
  
}