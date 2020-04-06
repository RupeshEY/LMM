package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotInjuryIncidentScreen.600.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotInjuryIncidentScreen_600Expressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotInjuryIncidentScreen.600.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotInjuryIncidentScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotInjuryIncidentScreen.600.pcf: line 17, column 62
    function def_onEnter_1 (def :  pcf.ClaimSnapshotInjuryIncident600DV) : void {
      def.onEnter(IncidentParam)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotInjuryIncidentScreen.600.pcf: line 17, column 62
    function def_refreshVariables_2 (def :  pcf.ClaimSnapshotInjuryIncident600DV) : void {
      def.refreshVariables(IncidentParam)
    }
    
    // 'initialValue' attribute on Variable at ClaimSnapshotInjuryIncidentScreen.600.pcf: line 14, column 31
    function initialValue_0 () : dynamic.Dynamic {
      return IncidentParam
    }
    
    property get IncidentParam () : dynamic.Dynamic {
      return getRequireValue("IncidentParam", 0) as dynamic.Dynamic
    }
    
    property set IncidentParam ($arg :  dynamic.Dynamic) {
      setRequireValue("IncidentParam", 0, $arg)
    }
    
    property get InjuryIncident () : dynamic.Dynamic {
      return getVariableValue("InjuryIncident", 0) as dynamic.Dynamic
    }
    
    property set InjuryIncident ($arg :  dynamic.Dynamic) {
      setVariableValue("InjuryIncident", 0, $arg)
    }
    
    
  }
  
  
}