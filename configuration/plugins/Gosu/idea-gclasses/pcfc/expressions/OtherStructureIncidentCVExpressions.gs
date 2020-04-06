package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/incidents/OtherStructureIncidentCV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class OtherStructureIncidentCVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/incidents/OtherStructureIncidentCV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OtherStructureIncidentCVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at OtherStructureIncidentCV.pcf: line 14, column 71
    function def_onEnter_0 (def :  pcf.OtherStructureIncidentPanelSet) : void {
      def.onEnter(otherStructureIncident)
    }
    
    // 'def' attribute on PanelRef at OtherStructureIncidentCV.pcf: line 20, column 57
    function def_onEnter_2 (def :  pcf.IncidentAssessDV) : void {
      def.onEnter(otherStructureIncident)
    }
    
    // 'def' attribute on PanelRef at OtherStructureIncidentCV.pcf: line 14, column 71
    function def_refreshVariables_1 (def :  pcf.OtherStructureIncidentPanelSet) : void {
      def.refreshVariables(otherStructureIncident)
    }
    
    // 'def' attribute on PanelRef at OtherStructureIncidentCV.pcf: line 20, column 57
    function def_refreshVariables_3 (def :  pcf.IncidentAssessDV) : void {
      def.refreshVariables(otherStructureIncident)
    }
    
    property get otherStructureIncident () : OtherStructureIncident {
      return getRequireValue("otherStructureIncident", 0) as OtherStructureIncident
    }
    
    property set otherStructureIncident ($arg :  OtherStructureIncident) {
      setRequireValue("otherStructureIncident", 0, $arg)
    }
    
    
  }
  
  
}