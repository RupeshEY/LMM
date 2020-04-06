package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/print/PropertyContentsIncidentPrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PropertyContentsIncidentPrintExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/print/PropertyContentsIncidentPrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PropertyContentsIncidentPrintExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (c :  Claim, incident :  PropertyContentsIncident) : int {
      return 0
    }
    
    // 'canVisit' attribute on Page (id=PropertyContentsIncidentPrint) at PropertyContentsIncidentPrint.pcf: line 10, column 80
    static function canVisit_2 (c :  Claim, incident :  PropertyContentsIncident) : java.lang.Boolean {
      return incident != null and perm.Incident.view(incident)
    }
    
    // 'def' attribute on PanelRef at PropertyContentsIncidentPrint.pcf: line 21, column 59
    function def_onEnter_0 (def :  pcf.PropertyContentsIncidentPanelSet) : void {
      def.onEnter(incident)
    }
    
    // 'def' attribute on PanelRef at PropertyContentsIncidentPrint.pcf: line 21, column 59
    function def_refreshVariables_1 (def :  pcf.PropertyContentsIncidentPanelSet) : void {
      def.refreshVariables(incident)
    }
    
    // 'parent' attribute on Page (id=PropertyContentsIncidentPrint) at PropertyContentsIncidentPrint.pcf: line 10, column 80
    static function parent_3 (c :  Claim, incident :  PropertyContentsIncident) : pcf.api.Destination {
      return pcf.ClaimPrintout.createDestination(c)
    }
    
    override property get CurrentLocation () : pcf.PropertyContentsIncidentPrint {
      return super.CurrentLocation as pcf.PropertyContentsIncidentPrint
    }
    
    property get c () : Claim {
      return getVariableValue("c", 0) as Claim
    }
    
    property set c ($arg :  Claim) {
      setVariableValue("c", 0, $arg)
    }
    
    property get incident () : PropertyContentsIncident {
      return getVariableValue("incident", 0) as PropertyContentsIncident
    }
    
    property set incident ($arg :  PropertyContentsIncident) {
      setVariableValue("incident", 0, $arg)
    }
    
    
  }
  
  
}