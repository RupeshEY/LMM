package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/incidents/DwellingIncidentCV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DwellingIncidentCVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/incidents/DwellingIncidentCV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DwellingIncidentCVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at DwellingIncidentCV.pcf: line 17, column 82
    function def_onEnter_0 (def :  pcf.DwellingIncidentPanelSet) : void {
      def.onEnter(dwellingIncident, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at DwellingIncidentCV.pcf: line 23, column 51
    function def_onEnter_2 (def :  pcf.IncidentAssessDV) : void {
      def.onEnter(dwellingIncident)
    }
    
    // 'def' attribute on PanelRef at DwellingIncidentCV.pcf: line 17, column 82
    function def_refreshVariables_1 (def :  pcf.DwellingIncidentPanelSet) : void {
      def.refreshVariables(dwellingIncident, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at DwellingIncidentCV.pcf: line 23, column 51
    function def_refreshVariables_3 (def :  pcf.IncidentAssessDV) : void {
      def.refreshVariables(dwellingIncident)
    }
    
    property get dwellingIncident () : DwellingIncident {
      return getRequireValue("dwellingIncident", 0) as DwellingIncident
    }
    
    property set dwellingIncident ($arg :  DwellingIncident) {
      setRequireValue("dwellingIncident", 0, $arg)
    }
    
    property get unusedServiceRequests () : java.util.Set<ServiceRequest> {
      return getRequireValue("unusedServiceRequests", 0) as java.util.Set<ServiceRequest>
    }
    
    property set unusedServiceRequests ($arg :  java.util.Set<ServiceRequest>) {
      setRequireValue("unusedServiceRequests", 0, $arg)
    }
    
    
  }
  
  
}