package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/default/ClaimSnapshotOtherStructureIncidentCV.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotOtherStructureIncidentCV_defaultExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/default/ClaimSnapshotOtherStructureIncidentCV.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotOtherStructureIncidentCVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotOtherStructureIncidentCV.default.pcf: line 78, column 41
    function def_onEnter_26 (def :  pcf.ClaimSnapshotIncidentRelatedExposuresPanelSet_600) : void {
      def.onEnter(claim, snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotOtherStructureIncidentCV.default.pcf: line 78, column 41
    function def_onEnter_28 (def :  pcf.ClaimSnapshotIncidentRelatedExposuresPanelSet_700) : void {
      def.onEnter(claim, snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotOtherStructureIncidentCV.default.pcf: line 78, column 41
    function def_onEnter_30 (def :  pcf.ClaimSnapshotIncidentRelatedExposuresPanelSet_800) : void {
      def.onEnter(claim, snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotOtherStructureIncidentCV.default.pcf: line 78, column 41
    function def_onEnter_32 (def :  pcf.ClaimSnapshotIncidentRelatedExposuresPanelSet_default) : void {
      def.onEnter(claim, snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotOtherStructureIncidentCV.default.pcf: line 87, column 37
    function def_onEnter_34 (def :  pcf.ClaimSnapshotIncidentAssessDV_600) : void {
      def.onEnter(claim, incident, snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotOtherStructureIncidentCV.default.pcf: line 87, column 37
    function def_onEnter_36 (def :  pcf.ClaimSnapshotIncidentAssessDV_700) : void {
      def.onEnter(claim, incident, snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotOtherStructureIncidentCV.default.pcf: line 87, column 37
    function def_onEnter_38 (def :  pcf.ClaimSnapshotIncidentAssessDV_800) : void {
      def.onEnter(claim, incident, snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotOtherStructureIncidentCV.default.pcf: line 87, column 37
    function def_onEnter_40 (def :  pcf.ClaimSnapshotIncidentAssessDV_default) : void {
      def.onEnter(claim, incident, snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotOtherStructureIncidentCV.default.pcf: line 78, column 41
    function def_refreshVariables_27 (def :  pcf.ClaimSnapshotIncidentRelatedExposuresPanelSet_600) : void {
      def.refreshVariables(claim, snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotOtherStructureIncidentCV.default.pcf: line 78, column 41
    function def_refreshVariables_29 (def :  pcf.ClaimSnapshotIncidentRelatedExposuresPanelSet_700) : void {
      def.refreshVariables(claim, snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotOtherStructureIncidentCV.default.pcf: line 78, column 41
    function def_refreshVariables_31 (def :  pcf.ClaimSnapshotIncidentRelatedExposuresPanelSet_800) : void {
      def.refreshVariables(claim, snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotOtherStructureIncidentCV.default.pcf: line 78, column 41
    function def_refreshVariables_33 (def :  pcf.ClaimSnapshotIncidentRelatedExposuresPanelSet_default) : void {
      def.refreshVariables(claim, snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotOtherStructureIncidentCV.default.pcf: line 87, column 37
    function def_refreshVariables_35 (def :  pcf.ClaimSnapshotIncidentAssessDV_600) : void {
      def.refreshVariables(claim, incident, snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotOtherStructureIncidentCV.default.pcf: line 87, column 37
    function def_refreshVariables_37 (def :  pcf.ClaimSnapshotIncidentAssessDV_700) : void {
      def.refreshVariables(claim, incident, snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotOtherStructureIncidentCV.default.pcf: line 87, column 37
    function def_refreshVariables_39 (def :  pcf.ClaimSnapshotIncidentAssessDV_800) : void {
      def.refreshVariables(claim, incident, snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotOtherStructureIncidentCV.default.pcf: line 87, column 37
    function def_refreshVariables_41 (def :  pcf.ClaimSnapshotIncidentAssessDV_default) : void {
      def.refreshVariables(claim, incident, snapshot)
    }
    
    // 'initialValue' attribute on Variable at ClaimSnapshotOtherStructureIncidentCV.default.pcf: line 20, column 31
    function initialValue_0 () : dynamic.Dynamic {
      return incidentParam
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at ClaimSnapshotOtherStructureIncidentCV.default.pcf: line 38, column 48
    function valueRoot_3 () : java.lang.Object {
      return incident
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at ClaimSnapshotOtherStructureIncidentCV.default.pcf: line 38, column 48
    function value_1 () : dynamic.Dynamic {
      return incident.Description
    }
    
    // 'value' attribute on TextInput (id=EstimateTime) at ClaimSnapshotOtherStructureIncidentCV.default.pcf: line 55, column 81
    function value_13 () : dynamic.Dynamic {
      return incident.EstRepairTime
    }
    
    // 'value' attribute on TextInput (id=LossEstimate) at ClaimSnapshotOtherStructureIncidentCV.default.pcf: line 60, column 48
    function value_17 () : dynamic.Dynamic {
      return incident.LossEstimate
    }
    
    // 'value' attribute on TextInput (id=AlreadyRepaired) at ClaimSnapshotOtherStructureIncidentCV.default.pcf: line 65, column 48
    function value_20 () : dynamic.Dynamic {
      return incident.AlreadyRepaired
    }
    
    // 'value' attribute on TextInput (id=FencesDamaged) at ClaimSnapshotOtherStructureIncidentCV.default.pcf: line 70, column 48
    function value_23 () : dynamic.Dynamic {
      return incident.FencesDamaged
    }
    
    // 'value' attribute on TextInput (id=EstimatesReceived) at ClaimSnapshotOtherStructureIncidentCV.default.pcf: line 43, column 48
    function value_4 () : dynamic.Dynamic {
      return incident.EstimatesReceived
    }
    
    // 'value' attribute on TextInput (id=EstimateCost) at ClaimSnapshotOtherStructureIncidentCV.default.pcf: line 49, column 81
    function value_8 () : dynamic.Dynamic {
      return incident.EstRepairCost
    }
    
    // 'visible' attribute on TextInput (id=EstimateCost) at ClaimSnapshotOtherStructureIncidentCV.default.pcf: line 49, column 81
    function visible_7 () : java.lang.Boolean {
      return incident.EstimatesReceived.Code == "yes"
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    property get incident () : dynamic.Dynamic {
      return getVariableValue("incident", 0) as dynamic.Dynamic
    }
    
    property set incident ($arg :  dynamic.Dynamic) {
      setVariableValue("incident", 0, $arg)
    }
    
    property get incidentParam () : dynamic.Dynamic {
      return getRequireValue("incidentParam", 0) as dynamic.Dynamic
    }
    
    property set incidentParam ($arg :  dynamic.Dynamic) {
      setRequireValue("incidentParam", 0, $arg)
    }
    
    property get snapshot () : dynamic.Dynamic {
      return getRequireValue("snapshot", 0) as dynamic.Dynamic
    }
    
    property set snapshot ($arg :  dynamic.Dynamic) {
      setRequireValue("snapshot", 0, $arg)
    }
    
    
  }
  
  
}