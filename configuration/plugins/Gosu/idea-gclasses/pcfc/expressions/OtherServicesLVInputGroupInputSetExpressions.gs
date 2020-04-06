package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/OtherServicesLVInputGroupInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class OtherServicesLVInputGroupInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/OtherServicesLVInputGroupInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OtherServicesLVInputGroupInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'allowToggle' attribute on InputGroup (id=OtherServicesInputGroup) at OtherServicesLVInputGroupInputSet.pcf: line 34, column 52
    function available_4 () : java.lang.Boolean {
      return areAllOtherRequestsEditable()
    }
    
    // 'def' attribute on InputSetRef at OtherServicesLVInputGroupInputSet.pcf: line 36, column 117
    function def_onEnter_1 (def :  pcf.OtherServicesLVInputSet) : void {
      def.onEnter(claim, incident, otherServiceRequests, alsoAddAndRemove, incidentsToExclude)
    }
    
    // 'def' attribute on InputSetRef at OtherServicesLVInputGroupInputSet.pcf: line 36, column 117
    function def_refreshVariables_2 (def :  pcf.OtherServicesLVInputSet) : void {
      def.refreshVariables(claim, incident, otherServiceRequests, alsoAddAndRemove, incidentsToExclude)
    }
    
    // 'initialValue' attribute on Variable at OtherServicesLVInputGroupInputSet.pcf: line 28, column 23
    function initialValue_0 () : boolean {
      return otherServiceRequests.HasElements and not unusedServiceRequests.containsAll(otherServiceRequests)
    }
    
    // 'onToggle' attribute on InputGroup (id=OtherServicesInputGroup) at OtherServicesLVInputGroupInputSet.pcf: line 34, column 52
    function setter_5 (VALUE :  java.lang.Boolean) : void {
      toggleOtherServiceRequests(VALUE)
    }
    
    // 'childrenVisible' attribute on InputGroup (id=OtherServicesInputGroup) at OtherServicesLVInputGroupInputSet.pcf: line 34, column 52
    function visible_3 () : java.lang.Boolean {
      return otherServicesSelected
    }
    
    property get alsoAddAndRemove () : java.util.Set<ServiceRequest> {
      return getRequireValue("alsoAddAndRemove", 0) as java.util.Set<ServiceRequest>
    }
    
    property set alsoAddAndRemove ($arg :  java.util.Set<ServiceRequest>) {
      setRequireValue("alsoAddAndRemove", 0, $arg)
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    property get incident () : Incident {
      return getRequireValue("incident", 0) as Incident
    }
    
    property set incident ($arg :  Incident) {
      setRequireValue("incident", 0, $arg)
    }
    
    property get incidentsToExclude () : java.util.Collection<Incident> {
      return getRequireValue("incidentsToExclude", 0) as java.util.Collection<Incident>
    }
    
    property set incidentsToExclude ($arg :  java.util.Collection<Incident>) {
      setRequireValue("incidentsToExclude", 0, $arg)
    }
    
    property get otherServiceRequests () : java.util.Set<ServiceRequest> {
      return getRequireValue("otherServiceRequests", 0) as java.util.Set<ServiceRequest>
    }
    
    property set otherServiceRequests ($arg :  java.util.Set<ServiceRequest>) {
      setRequireValue("otherServiceRequests", 0, $arg)
    }
    
    property get otherServicesSelected () : boolean {
      return getVariableValue("otherServicesSelected", 0) as java.lang.Boolean
    }
    
    property set otherServicesSelected ($arg :  boolean) {
      setVariableValue("otherServicesSelected", 0, $arg)
    }
    
    property get unusedServiceRequests () : java.util.Set<entity.ServiceRequest> {
      return getRequireValue("unusedServiceRequests", 0) as java.util.Set<entity.ServiceRequest>
    }
    
    property set unusedServiceRequests ($arg :  java.util.Set<entity.ServiceRequest>) {
      setRequireValue("unusedServiceRequests", 0, $arg)
    }
    
    function areAllOtherRequestsEditable() : boolean {
      return otherServiceRequests.allMatch( \ sr -> sr.IsEditableInUI)
    }
    
    function toggleOtherServiceRequests(checkboxValue: boolean) {
      if (not checkboxValue) {
        unusedServiceRequests.addAll(otherServiceRequests)
      } else {
        unusedServiceRequests.removeAll(otherServiceRequests)
      }
      otherServicesSelected = checkboxValue
    }
    
    
  }
  
  
}