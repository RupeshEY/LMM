package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/OtherServicesLVInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class OtherServicesLVInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/OtherServicesLVInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OtherServicesLVInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=AddServiceRequest) at OtherServicesLVInputSet.pcf: line 30, column 98
    function action_0 () : void {
      OtherServiceRequestPopup.push(claim, incident, alsoAddAndRemove, incidentsToExclude)
    }
    
    // 'action' attribute on ToolbarButton (id=AddServiceRequest) at OtherServicesLVInputSet.pcf: line 30, column 98
    function action_dest_1 () : pcf.api.Destination {
      return pcf.OtherServiceRequestPopup.createDestination(claim, incident, alsoAddAndRemove, incidentsToExclude)
    }
    
    // 'def' attribute on ListViewInput at OtherServicesLVInputSet.pcf: line 24, column 25
    function def_onEnter_4 (def :  pcf.OtherServicesLV) : void {
      def.onEnter(otherServices, alsoAddAndRemove)
    }
    
    // 'def' attribute on ListViewInput at OtherServicesLVInputSet.pcf: line 24, column 25
    function def_refreshVariables_5 (def :  pcf.OtherServicesLV) : void {
      def.refreshVariables(otherServices, alsoAddAndRemove)
    }
    
    // 'removeVisible' attribute on IteratorButtons at OtherServicesLVInputSet.pcf: line 34, column 58
    function visible_2 () : java.lang.Boolean {
      return areAnyOtherRequestsEditable()
    }
    
    // 'visible' attribute on Toolbar (id=OtherServicesLV_tb) at OtherServicesLVInputSet.pcf: line 26, column 46
    function visible_3 () : java.lang.Boolean {
      return CurrentLocation.InEditMode
    }
    
    property get alsoAddAndRemove () : java.util.Set<ServiceRequest> {
      return getRequireValue("alsoAddAndRemove", 0) as java.util.Set<ServiceRequest>
    }
    
    property set alsoAddAndRemove ($arg :  java.util.Set<ServiceRequest>) {
      setRequireValue("alsoAddAndRemove", 0, $arg)
    }
    
    property get claim () : entity.Claim {
      return getRequireValue("claim", 0) as entity.Claim
    }
    
    property set claim ($arg :  entity.Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    property get incident () : entity.Incident {
      return getRequireValue("incident", 0) as entity.Incident
    }
    
    property set incident ($arg :  entity.Incident) {
      setRequireValue("incident", 0, $arg)
    }
    
    property get incidentsToExclude () : java.util.Collection<Incident> {
      return getRequireValue("incidentsToExclude", 0) as java.util.Collection<Incident>
    }
    
    property set incidentsToExclude ($arg :  java.util.Collection<Incident>) {
      setRequireValue("incidentsToExclude", 0, $arg)
    }
    
    property get otherServices () : java.util.Set<ServiceRequest> {
      return getRequireValue("otherServices", 0) as java.util.Set<ServiceRequest>
    }
    
    property set otherServices ($arg :  java.util.Set<ServiceRequest>) {
      setRequireValue("otherServices", 0, $arg)
    }
    
    function areAnyOtherRequestsEditable() : boolean {
      return otherServices.hasMatch( \ sr -> sr.IsEditableInUI)
    }
    
    
  }
  
  
}