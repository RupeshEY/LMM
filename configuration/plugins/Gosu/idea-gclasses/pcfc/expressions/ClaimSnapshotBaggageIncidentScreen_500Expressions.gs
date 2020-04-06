package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/500/ClaimSnapshotBaggageIncidentScreen.500.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotBaggageIncidentScreen_500Expressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/500/ClaimSnapshotBaggageIncidentScreen.500.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotBaggageIncidentScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotBaggageIncidentScreen.500.pcf: line 21, column 67
    function def_onEnter_1 (def :  pcf.ClaimSnapshotBaggageIncident500DV) : void {
      def.onEnter(IncidentParam)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotBaggageIncidentScreen.500.pcf: line 21, column 67
    function def_refreshVariables_2 (def :  pcf.ClaimSnapshotBaggageIncident500DV) : void {
      def.refreshVariables(IncidentParam)
    }
    
    // 'initialValue' attribute on Variable at ClaimSnapshotBaggageIncidentScreen.500.pcf: line 14, column 31
    function initialValue_0 () : dynamic.Dynamic {
      return IncidentParam
    }
    
    property get BaggageIncident () : dynamic.Dynamic {
      return getVariableValue("BaggageIncident", 0) as dynamic.Dynamic
    }
    
    property set BaggageIncident ($arg :  dynamic.Dynamic) {
      setVariableValue("BaggageIncident", 0, $arg)
    }
    
    property get IncidentParam () : dynamic.Dynamic {
      return getRequireValue("IncidentParam", 0) as dynamic.Dynamic
    }
    
    property set IncidentParam ($arg :  dynamic.Dynamic) {
      setRequireValue("IncidentParam", 0, $arg)
    }
    
    
  }
  
  
}