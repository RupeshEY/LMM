package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/print/DwellingIncidentPrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DwellingIncidentPrintExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/print/DwellingIncidentPrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DwellingIncidentPrintExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (c :  Claim, incident :  DwellingIncident) : int {
      return 0
    }
    
    // 'canVisit' attribute on Page (id=DwellingIncidentPrint) at DwellingIncidentPrint.pcf: line 10, column 72
    static function canVisit_2 (c :  Claim, incident :  DwellingIncident) : java.lang.Boolean {
      return (incident != null and perm.Incident.view(incident))
    }
    
    // 'def' attribute on PanelRef at DwellingIncidentPrint.pcf: line 21, column 98
    function def_onEnter_0 (def :  pcf.DwellingIncidentPanelSet) : void {
      def.onEnter(incident, new java.util.HashSet<ServiceRequest>())
    }
    
    // 'def' attribute on PanelRef at DwellingIncidentPrint.pcf: line 21, column 98
    function def_refreshVariables_1 (def :  pcf.DwellingIncidentPanelSet) : void {
      def.refreshVariables(incident, new java.util.HashSet<ServiceRequest>())
    }
    
    // 'parent' attribute on Page (id=DwellingIncidentPrint) at DwellingIncidentPrint.pcf: line 10, column 72
    static function parent_3 (c :  Claim, incident :  DwellingIncident) : pcf.api.Destination {
      return pcf.ClaimPrintout.createDestination(c)
    }
    
    override property get CurrentLocation () : pcf.DwellingIncidentPrint {
      return super.CurrentLocation as pcf.DwellingIncidentPrint
    }
    
    property get c () : Claim {
      return getVariableValue("c", 0) as Claim
    }
    
    property set c ($arg :  Claim) {
      setVariableValue("c", 0, $arg)
    }
    
    property get incident () : DwellingIncident {
      return getVariableValue("incident", 0) as DwellingIncident
    }
    
    property set incident ($arg :  DwellingIncident) {
      setVariableValue("incident", 0, $arg)
    }
    
    
  }
  
  
}