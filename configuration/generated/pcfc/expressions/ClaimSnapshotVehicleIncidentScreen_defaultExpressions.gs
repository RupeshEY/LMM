package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/default/ClaimSnapshotVehicleIncidentScreen.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotVehicleIncidentScreen_defaultExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/default/ClaimSnapshotVehicleIncidentScreen.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotVehicleIncidentScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotVehicleIncidentScreen.default.pcf: line 23, column 67
    function def_onEnter_1 (def :  pcf.ClaimSnapshotVehicleIncidentDV) : void {
      def.onEnter(Claim, IncidentParam)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotVehicleIncidentScreen.default.pcf: line 23, column 67
    function def_refreshVariables_2 (def :  pcf.ClaimSnapshotVehicleIncidentDV) : void {
      def.refreshVariables(Claim, IncidentParam)
    }
    
    // 'initialValue' attribute on Variable at ClaimSnapshotVehicleIncidentScreen.default.pcf: line 20, column 31
    function initialValue_0 () : dynamic.Dynamic {
      return IncidentParam
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get IncidentParam () : dynamic.Dynamic {
      return getRequireValue("IncidentParam", 0) as dynamic.Dynamic
    }
    
    property set IncidentParam ($arg :  dynamic.Dynamic) {
      setRequireValue("IncidentParam", 0, $arg)
    }
    
    property get SnapshotParam () : dynamic.Dynamic {
      return getRequireValue("SnapshotParam", 0) as dynamic.Dynamic
    }
    
    property set SnapshotParam ($arg :  dynamic.Dynamic) {
      setRequireValue("SnapshotParam", 0, $arg)
    }
    
    property get VehicleIncident () : dynamic.Dynamic {
      return getVariableValue("VehicleIncident", 0) as dynamic.Dynamic
    }
    
    property set VehicleIncident ($arg :  dynamic.Dynamic) {
      setVariableValue("VehicleIncident", 0, $arg)
    }
    
    
  }
  
  
}