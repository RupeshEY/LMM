package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/VehicleIncidentPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class VehicleIncidentPanelSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/VehicleIncidentPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VehicleIncidentPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at VehicleIncidentPanelSet.pcf: line 17, column 92
    function def_onEnter_0 (def :  pcf.RentalServiceDV) : void {
      def.onEnter(RentalServiceRequest, VehicleIncident, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at VehicleIncidentPanelSet.pcf: line 19, column 100
    function def_onEnter_2 (def :  pcf.VehicleIncidentTowingDV) : void {
      def.onEnter(TowingServiceRequest, VehicleIncident, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at VehicleIncidentPanelSet.pcf: line 21, column 165
    function def_onEnter_4 (def :  pcf.AppraisalServiceDV) : void {
      def.onEnter(AppraisallServiceRequest, VehicleIncident, unusedServiceRequests, gw.vendormanagement.SpecialistServiceCodeConstants.AUTOAPPRAISAL)
    }
    
    // 'def' attribute on PanelRef at VehicleIncidentPanelSet.pcf: line 23, column 104
    function def_onEnter_6 (def :  pcf.VehicleIncidentAutoBodyDV) : void {
      def.onEnter(AutoBodyServiceRequest, VehicleIncident, unusedServiceRequests)
    }
    
    // 'def' attribute on InputSetRef at VehicleIncidentPanelSet.pcf: line 27, column 168
    function def_onEnter_8 (def :  pcf.OtherServicesLVInputGroupInputSet) : void {
      def.onEnter(VehicleIncident.Claim, VehicleIncident, createOtherServices(), allIncidentOtherServices, unusedServiceRequests, {})
    }
    
    // 'def' attribute on PanelRef at VehicleIncidentPanelSet.pcf: line 17, column 92
    function def_refreshVariables_1 (def :  pcf.RentalServiceDV) : void {
      def.refreshVariables(RentalServiceRequest, VehicleIncident, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at VehicleIncidentPanelSet.pcf: line 19, column 100
    function def_refreshVariables_3 (def :  pcf.VehicleIncidentTowingDV) : void {
      def.refreshVariables(TowingServiceRequest, VehicleIncident, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at VehicleIncidentPanelSet.pcf: line 21, column 165
    function def_refreshVariables_5 (def :  pcf.AppraisalServiceDV) : void {
      def.refreshVariables(AppraisallServiceRequest, VehicleIncident, unusedServiceRequests, gw.vendormanagement.SpecialistServiceCodeConstants.AUTOAPPRAISAL)
    }
    
    // 'def' attribute on PanelRef at VehicleIncidentPanelSet.pcf: line 23, column 104
    function def_refreshVariables_7 (def :  pcf.VehicleIncidentAutoBodyDV) : void {
      def.refreshVariables(AutoBodyServiceRequest, VehicleIncident, unusedServiceRequests)
    }
    
    // 'def' attribute on InputSetRef at VehicleIncidentPanelSet.pcf: line 27, column 168
    function def_refreshVariables_9 (def :  pcf.OtherServicesLVInputGroupInputSet) : void {
      def.refreshVariables(VehicleIncident.Claim, VehicleIncident, createOtherServices(), allIncidentOtherServices, unusedServiceRequests, {})
    }
    
    property get VehicleIncident () : VehicleIncident {
      return getRequireValue("VehicleIncident", 0) as VehicleIncident
    }
    
    property set VehicleIncident ($arg :  VehicleIncident) {
      setRequireValue("VehicleIncident", 0, $arg)
    }
    
    property get allIncidentOtherServices () : java.util.Set<ServiceRequest> {
      return getRequireValue("allIncidentOtherServices", 0) as java.util.Set<ServiceRequest>
    }
    
    property set allIncidentOtherServices ($arg :  java.util.Set<ServiceRequest>) {
      setRequireValue("allIncidentOtherServices", 0, $arg)
    }
    
    property get unusedServiceRequests () : java.util.Set<ServiceRequest> {
      return getRequireValue("unusedServiceRequests", 0) as java.util.Set<ServiceRequest>
    }
    
    property set unusedServiceRequests ($arg :  java.util.Set<ServiceRequest>) {
      setRequireValue("unusedServiceRequests", 0, $arg)
    }
    
    function findServiceRequest(serviceCode : String) : ServiceRequest {
      return VehicleIncident.ServiceRequests.firstWhere(\ sr ->
              sr.Instruction.Services.Count == 1
              and sr.Instruction.Services.single().Service.Code == serviceCode
              and (allIncidentOtherServices == null or not allIncidentOtherServices.contains(sr))
      )
    }
    
    property get RentalServiceRequest() : ServiceRequest {
      return findServiceRequest(gw.vendormanagement.SpecialistServiceCodeConstants.AUTORENTAL)
    }
    
    property get TowingServiceRequest() : ServiceRequest {
      return findServiceRequest(gw.vendormanagement.SpecialistServiceCodeConstants.AUTOTOWING)
    }
    
    property get AppraisallServiceRequest() : ServiceRequest {
      return findServiceRequest(gw.vendormanagement.SpecialistServiceCodeConstants.AUTOAPPRAISAL)
    }
    
    property get AutoBodyServiceRequest() : ServiceRequest {
      return findServiceRequest(gw.vendormanagement.SpecialistServiceCodeConstants.AUTOBODYREPAIR)
    }
    
    function createOtherServices() : java.util.Set<ServiceRequest> {
      return VehicleIncident.ServiceRequests.where(\ sr -> (
          sr != RentalServiceRequest and sr != TowingServiceRequest and sr != AppraisallServiceRequest and sr != AutoBodyServiceRequest)).toSet()
    }
    
    
  }
  
  
}