package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/OtherServiceRequestPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class OtherServiceRequestPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/OtherServiceRequestPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OtherServiceRequestPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim, incident :  Incident) : int {
      return 0
    }
    
    static function __constructorIndex (claim :  Claim, incident :  Incident, incidentOtherServices :  java.util.Set<ServiceRequest>, incidentsToExclude :  java.util.Collection<Incident>) : int {
      return 1
    }
    
    // 'afterCancel' attribute on Popup (id=OtherServiceRequestPopup) at OtherServiceRequestPopup.pcf: line 12, column 66
    function afterCancel_5 () : void {
      serviceRequest.remove()
    }
    
    // 'beforeCommit' attribute on Popup (id=OtherServiceRequestPopup) at OtherServiceRequestPopup.pcf: line 12, column 66
    function beforeCommit_6 (pickedValue :  java.lang.Object) : void {
      validateAndFinishServiceRequest()
    }
    
    // 'def' attribute on PanelRef at OtherServiceRequestPopup.pcf: line 41, column 105
    function def_onEnter_3 (def :  pcf.NewServiceRequestDV) : void {
      def.onEnter(serviceRequest, incident == null ? false : true, incidentsToExclude)
    }
    
    // 'def' attribute on PanelRef at OtherServiceRequestPopup.pcf: line 41, column 105
    function def_refreshVariables_4 (def :  pcf.NewServiceRequestDV) : void {
      def.refreshVariables(serviceRequest, incident == null ? false : true, incidentsToExclude)
    }
    
    // 'initialValue' attribute on Variable at OtherServiceRequestPopup.pcf: line 26, column 37
    function initialValue_0 () : entity.ServiceRequest {
      return InitializeServiceRequest
    }
    
    // 'initialValue' attribute on Variable at OtherServiceRequestPopup.pcf: line 33, column 52
    function initialValue_1 () : java.util.Collection<Incident> {
      return {}
    }
    
    // EditButtons at OtherServiceRequestPopup.pcf: line 38, column 45
    function label_2 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    override property get CurrentLocation () : pcf.OtherServiceRequestPopup {
      return super.CurrentLocation as pcf.OtherServiceRequestPopup
    }
    
    property get claim () : entity.Claim {
      return getVariableValue("claim", 0) as entity.Claim
    }
    
    property set claim ($arg :  entity.Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    property get incident () : entity.Incident {
      return getVariableValue("incident", 0) as entity.Incident
    }
    
    property set incident ($arg :  entity.Incident) {
      setVariableValue("incident", 0, $arg)
    }
    
    property get incidentOtherServices () : java.util.Set<ServiceRequest> {
      return getVariableValue("incidentOtherServices", 0) as java.util.Set<ServiceRequest>
    }
    
    property set incidentOtherServices ($arg :  java.util.Set<ServiceRequest>) {
      setVariableValue("incidentOtherServices", 0, $arg)
    }
    
    property get incidentsToExclude () : java.util.Collection<Incident> {
      return getVariableValue("incidentsToExclude", 0) as java.util.Collection<Incident>
    }
    
    property set incidentsToExclude ($arg :  java.util.Collection<Incident>) {
      setVariableValue("incidentsToExclude", 0, $arg)
    }
    
    property get serviceRequest () : entity.ServiceRequest {
      return getVariableValue("serviceRequest", 0) as entity.ServiceRequest
    }
    
    property set serviceRequest ($arg :  entity.ServiceRequest) {
      setVariableValue("serviceRequest", 0, $arg)
    }
    
    property get InitializeServiceRequest() : ServiceRequest{
      return claim.newServiceRequest(null, incident);
    }
    
    function validateAndFinishServiceRequest() {
      
      serviceRequest.Instruction.verifyServiceTypesForUI()
      if (incidentOtherServices != null) {
        incidentOtherServices.add(serviceRequest) 
      } 
      serviceRequest.finishSetup()
    }
    
    
  }
  
  
}