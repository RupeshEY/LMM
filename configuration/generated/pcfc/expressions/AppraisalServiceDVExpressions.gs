package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/AppraisalServiceDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AppraisalServiceDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/AppraisalServiceDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AppraisalServiceDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef (id=AppraisalServiceInputSet) at AppraisalServiceDV.pcf: line 23, column 40
    function def_onEnter_0 (def :  pcf.AppraisalServiceInputSet) : void {
      def.onEnter(appraisalService, incident, unusedServiceRequests, appraisalServiceCode)
    }
    
    // 'def' attribute on InputSetRef (id=AppraisalServiceInputSet) at AppraisalServiceDV.pcf: line 23, column 40
    function def_refreshVariables_1 (def :  pcf.AppraisalServiceInputSet) : void {
      def.refreshVariables(appraisalService, incident, unusedServiceRequests, appraisalServiceCode)
    }
    
    // 'editable' attribute on DetailViewPanel (id=AppraisalServiceDV) at AppraisalServiceDV.pcf: line 7, column 29
    function editable_2 () : java.lang.Boolean {
      return appraisalService == null or appraisalService.IsEditableInUI
    }
    
    property get appraisalService () : ServiceRequest {
      return getRequireValue("appraisalService", 0) as ServiceRequest
    }
    
    property set appraisalService ($arg :  ServiceRequest) {
      setRequireValue("appraisalService", 0, $arg)
    }
    
    property get appraisalServiceCode () : String {
      return getRequireValue("appraisalServiceCode", 0) as String
    }
    
    property set appraisalServiceCode ($arg :  String) {
      setRequireValue("appraisalServiceCode", 0, $arg)
    }
    
    property get incident () : PropertyIncident {
      return getRequireValue("incident", 0) as PropertyIncident
    }
    
    property set incident ($arg :  PropertyIncident) {
      setRequireValue("incident", 0, $arg)
    }
    
    property get unusedServiceRequests () : java.util.Set<ServiceRequest> {
      return getRequireValue("unusedServiceRequests", 0) as java.util.Set<ServiceRequest>
    }
    
    property set unusedServiceRequests ($arg :  java.util.Set<ServiceRequest>) {
      setRequireValue("unusedServiceRequests", 0, $arg)
    }
    
    
  }
  
  
}