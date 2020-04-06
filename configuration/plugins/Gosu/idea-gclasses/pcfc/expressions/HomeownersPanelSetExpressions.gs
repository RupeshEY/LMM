package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses java.util.Set
uses java.util.HashSet
uses com.google.common.collect.Iterables
uses java.util.Set
@javax.annotation.Generated("config/web/pcf/claim/FNOL/HomeownersPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class HomeownersPanelSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/HomeownersPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class HomeownersPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at HomeownersPanelSet.pcf: line 34, column 118
    function def_onEnter_3 (def :  pcf.HomeownersEmergencyMakeSafeDV) : void {
      def.onEnter(EMSMakeSafeServiceRequest, claim, primaryIncident, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at HomeownersPanelSet.pcf: line 36, column 128
    function def_onEnter_5 (def :  pcf.HomeownersEmergencyDebrisRemovalDV) : void {
      def.onEnter(EMSDebrisRemovalServiceRequest, claim, primaryIncident, unusedServiceRequests)
    }
    
    // 'def' attribute on InputSetRef at HomeownersPanelSet.pcf: line 40, column 145
    function def_onEnter_7 (def :  pcf.OtherServicesLVInputGroupInputSet) : void {
      def.onEnter(claim, incident, localOtherServiceRequests, otherServiceRequests, unusedServiceRequests, {})
    }
    
    // 'def' attribute on PanelRef at HomeownersPanelSet.pcf: line 34, column 118
    function def_refreshVariables_4 (def :  pcf.HomeownersEmergencyMakeSafeDV) : void {
      def.refreshVariables(EMSMakeSafeServiceRequest, claim, primaryIncident, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at HomeownersPanelSet.pcf: line 36, column 128
    function def_refreshVariables_6 (def :  pcf.HomeownersEmergencyDebrisRemovalDV) : void {
      def.refreshVariables(EMSDebrisRemovalServiceRequest, claim, primaryIncident, unusedServiceRequests)
    }
    
    // 'def' attribute on InputSetRef at HomeownersPanelSet.pcf: line 40, column 145
    function def_refreshVariables_8 (def :  pcf.OtherServicesLVInputGroupInputSet) : void {
      def.refreshVariables(claim, incident, localOtherServiceRequests, otherServiceRequests, unusedServiceRequests, {})
    }
    
    // 'initialValue' attribute on Variable at HomeownersPanelSet.pcf: line 22, column 32
    function initialValue_0 () : PropertyIncident {
      return incident != null ? incident : claim.Incidents.whereTypeIs(DwellingIncident).first()
    }
    
    // 'initialValue' attribute on Variable at HomeownersPanelSet.pcf: line 27, column 51
    function initialValue_1 () : java.util.Set<ServiceRequest> {
      return createOtherServiceRequests()
    }
    
    // 'initialValue' attribute on Variable at HomeownersPanelSet.pcf: line 32, column 51
    function initialValue_2 () : java.util.Set<ServiceRequest> {
      return incomingOtherServiceRequests ?: localOtherServiceRequests
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    property get incident () : PropertyIncident {
      return getRequireValue("incident", 0) as PropertyIncident
    }
    
    property set incident ($arg :  PropertyIncident) {
      setRequireValue("incident", 0, $arg)
    }
    
    property get incomingOtherServiceRequests () : java.util.Set<ServiceRequest> {
      return getRequireValue("incomingOtherServiceRequests", 0) as java.util.Set<ServiceRequest>
    }
    
    property set incomingOtherServiceRequests ($arg :  java.util.Set<ServiceRequest>) {
      setRequireValue("incomingOtherServiceRequests", 0, $arg)
    }
    
    property get localOtherServiceRequests () : java.util.Set<ServiceRequest> {
      return getVariableValue("localOtherServiceRequests", 0) as java.util.Set<ServiceRequest>
    }
    
    property set localOtherServiceRequests ($arg :  java.util.Set<ServiceRequest>) {
      setVariableValue("localOtherServiceRequests", 0, $arg)
    }
    
    property get otherServiceRequests () : java.util.Set<ServiceRequest> {
      return getVariableValue("otherServiceRequests", 0) as java.util.Set<ServiceRequest>
    }
    
    property set otherServiceRequests ($arg :  java.util.Set<ServiceRequest>) {
      setVariableValue("otherServiceRequests", 0, $arg)
    }
    
    property get primaryIncident () : PropertyIncident {
      return getVariableValue("primaryIncident", 0) as PropertyIncident
    }
    
    property set primaryIncident ($arg :  PropertyIncident) {
      setVariableValue("primaryIncident", 0, $arg)
    }
    
    property get unusedServiceRequests () : java.util.Set<entity.ServiceRequest> {
      return getRequireValue("unusedServiceRequests", 0) as java.util.Set<entity.ServiceRequest>
    }
    
    property set unusedServiceRequests ($arg :  java.util.Set<entity.ServiceRequest>) {
      setRequireValue("unusedServiceRequests", 0, $arg)
    }
    
    
    /**
     * Chooses a ServiceRequest to be attached to a specific DV that is a referenced from this panel set. It should not
     * be any of the "other" ServiceRequests, since ServiceRequests created through the "other" LV should stay in that LV.
     */
    function findServiceRequest(serviceCode : String) : ServiceRequest {
      return claim.ServiceRequests.firstWhere(\ sr -> 
             sr.Incident == primaryIncident
             and sr.Instruction.Services.Count == 1
             and sr.Instruction.Services.single().Service.Code == serviceCode
             // exclude any ServiceRequests in the "other" set
             and (otherServiceRequests == null or not otherServiceRequests.contains(sr))
        )
    }
    
    property get EMSMakeSafeServiceRequest() : ServiceRequest{
      return findServiceRequest(gw.vendormanagement.SpecialistServiceCodeConstants.PROPEMSMAKESAFE)
    }
    
    property get EMSDebrisRemovalServiceRequest() : ServiceRequest{
      return findServiceRequest(gw.vendormanagement.SpecialistServiceCodeConstants.PROPEMSDEBRISREMOVAL)
    }
    
    function createOtherServiceRequests() :  Set<ServiceRequest> {
      return claim.ServiceRequests.where(\ sr -> (incident == null or sr.Incident == incident) 
          and sr != EMSMakeSafeServiceRequest and sr != EMSDebrisRemovalServiceRequest).toSet()
    }
    
    
  }
  
  
}