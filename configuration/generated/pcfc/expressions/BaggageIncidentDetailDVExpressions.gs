package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/assessment/BaggageIncidentDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class BaggageIncidentDetailDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/assessment/BaggageIncidentDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BaggageIncidentDetailDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at BaggageIncidentDetailDV.pcf: line 18, column 75
    function def_onEnter_0 (def :  pcf.BaggageIncidentDV) : void {
      def.onEnter(aBaggageIncident, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at BaggageIncidentDetailDV.pcf: line 18, column 75
    function def_refreshVariables_1 (def :  pcf.BaggageIncidentDV) : void {
      def.refreshVariables(aBaggageIncident, unusedServiceRequests)
    }
    
    property get aBaggageIncident () : BaggageIncident {
      return getRequireValue("aBaggageIncident", 0) as BaggageIncident
    }
    
    property set aBaggageIncident ($arg :  BaggageIncident) {
      setRequireValue("aBaggageIncident", 0, $arg)
    }
    
    property get unusedServiceRequests () : java.util.Set<ServiceRequest> {
      return getRequireValue("unusedServiceRequests", 0) as java.util.Set<ServiceRequest>
    }
    
    property set unusedServiceRequests ($arg :  java.util.Set<ServiceRequest>) {
      setRequireValue("unusedServiceRequests", 0, $arg)
    }
    
    
  }
  
  
}