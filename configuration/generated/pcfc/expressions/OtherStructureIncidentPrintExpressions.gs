package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/print/OtherStructureIncidentPrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class OtherStructureIncidentPrintExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/print/OtherStructureIncidentPrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OtherStructureIncidentPrintExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (c :  Claim, incident :  OtherStructureIncident) : int {
      return 0
    }
    
    // 'canVisit' attribute on Page (id=OtherStructureIncidentPrint) at OtherStructureIncidentPrint.pcf: line 10, column 80
    static function canVisit_2 (c :  Claim, incident :  OtherStructureIncident) : java.lang.Boolean {
      return incident != null and perm.Incident.view(incident)
    }
    
    // 'def' attribute on PanelRef at OtherStructureIncidentPrint.pcf: line 21, column 57
    function def_onEnter_0 (def :  pcf.OtherStructureIncidentPanelSet) : void {
      def.onEnter(incident)
    }
    
    // 'def' attribute on PanelRef at OtherStructureIncidentPrint.pcf: line 21, column 57
    function def_refreshVariables_1 (def :  pcf.OtherStructureIncidentPanelSet) : void {
      def.refreshVariables(incident)
    }
    
    // 'parent' attribute on Page (id=OtherStructureIncidentPrint) at OtherStructureIncidentPrint.pcf: line 10, column 80
    static function parent_3 (c :  Claim, incident :  OtherStructureIncident) : pcf.api.Destination {
      return pcf.ClaimPrintout.createDestination(c)
    }
    
    override property get CurrentLocation () : pcf.OtherStructureIncidentPrint {
      return super.CurrentLocation as pcf.OtherStructureIncidentPrint
    }
    
    property get c () : Claim {
      return getVariableValue("c", 0) as Claim
    }
    
    property set c ($arg :  Claim) {
      setVariableValue("c", 0, $arg)
    }
    
    property get incident () : OtherStructureIncident {
      return getVariableValue("incident", 0) as OtherStructureIncident
    }
    
    property set incident ($arg :  OtherStructureIncident) {
      setVariableValue("incident", 0, $arg)
    }
    
    
  }
  
  
}