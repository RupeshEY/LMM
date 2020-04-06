package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/500/ClaimSnapshotBaggageIncident500DV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotBaggageIncident500DVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/500/ClaimSnapshotBaggageIncident500DV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotBaggageIncident500DVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'label' attribute on TextAreaInput (id=Description) at ClaimSnapshotBaggageIncident500DV.pcf: line 73, column 38
    function label_15 () : java.lang.Object {
      return BaggageIncidentInstance.DelayOnly == true ? DisplayKey.get("Web.BaggageIncident.DelayDescription") : DisplayKey.get("Web.BaggageIncident.Description")
    }
    
    // 'value' attribute on TextInput (id=BaggageType) at ClaimSnapshotBaggageIncident500DV.pcf: line 15, column 37
    function valueRoot_2 () : java.lang.Object {
      return BaggageIncidentInstance
    }
    
    // 'value' attribute on TextInput (id=BaggageType) at ClaimSnapshotBaggageIncident500DV.pcf: line 15, column 37
    function value_0 () : dynamic.Dynamic {
      return BaggageIncidentInstance.BaggageType
    }
    
    // 'value' attribute on DateInput (id=BaggageRecoveredOn) at ClaimSnapshotBaggageIncident500DV.pcf: line 47, column 38
    function value_12 () : dynamic.Dynamic {
      return BaggageIncidentInstance.BaggageRecoveredOn
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at ClaimSnapshotBaggageIncident500DV.pcf: line 73, column 38
    function value_16 () : dynamic.Dynamic {
      return BaggageIncidentInstance.Description
    }
    
    // 'value' attribute on TextInput (id=LossEstimate) at ClaimSnapshotBaggageIncident500DV.pcf: line 78, column 38
    function value_20 () : dynamic.Dynamic {
      return BaggageIncidentInstance.LossEstimate
    }
    
    // 'value' attribute on BooleanRadioInput (id=CarrierCompensated) at ClaimSnapshotBaggageIncident500DV.pcf: line 86, column 37
    function value_23 () : dynamic.Dynamic {
      return BaggageIncidentInstance.CarrierCompensated
    }
    
    // 'value' attribute on TextInput (id=CarrierCompensatedAmount) at ClaimSnapshotBaggageIncident500DV.pcf: line 94, column 71
    function value_27 () : dynamic.Dynamic {
      return BaggageIncidentInstance.CarrierCompensatedAmount
    }
    
    // 'value' attribute on TextAreaInput (id=PropertyDescription) at ClaimSnapshotBaggageIncident500DV.pcf: line 23, column 38
    function value_3 () : dynamic.Dynamic {
      return BaggageIncidentInstance.PropertyDesc
    }
    
    // 'value' attribute on TextInput (id=InspectionRequired) at ClaimSnapshotBaggageIncident500DV.pcf: line 103, column 37
    function value_31 () : dynamic.Dynamic {
      return BaggageIncidentInstance.InspectionRequired
    }
    
    // 'value' attribute on TextInput (id=WhenToView) at ClaimSnapshotBaggageIncident500DV.pcf: line 119, column 71
    function value_35 () : dynamic.Dynamic {
      return BaggageIncidentInstance.AppraisalFirstAppointment
    }
    
    // 'value' attribute on TextInput (id=EstimatedReceived) at ClaimSnapshotBaggageIncident500DV.pcf: line 127, column 37
    function value_39 () : dynamic.Dynamic {
      return BaggageIncidentInstance.EstimatesReceived
    }
    
    // 'value' attribute on TextInput (id=EstimateCost) at ClaimSnapshotBaggageIncident500DV.pcf: line 135, column 81
    function value_43 () : dynamic.Dynamic {
      return BaggageIncidentInstance.EstRepairCost
    }
    
    // 'value' attribute on TextInput (id=EstimateTime) at ClaimSnapshotBaggageIncident500DV.pcf: line 141, column 81
    function value_48 () : dynamic.Dynamic {
      return BaggageIncidentInstance.EstRepairTime
    }
    
    // 'value' attribute on BooleanRadioInput (id=DelayOnly) at ClaimSnapshotBaggageIncident500DV.pcf: line 31, column 37
    function value_6 () : dynamic.Dynamic {
      return BaggageIncidentInstance.DelayOnly
    }
    
    // 'value' attribute on DateInput (id=BaggageMissingFrom) at ClaimSnapshotBaggageIncident500DV.pcf: line 40, column 38
    function value_9 () : dynamic.Dynamic {
      return BaggageIncidentInstance.BaggageMissingFrom
    }
    
    // 'visible' attribute on TextInput (id=CarrierCompensatedAmount) at ClaimSnapshotBaggageIncident500DV.pcf: line 94, column 71
    function visible_26 () : java.lang.Boolean {
      return BaggageIncidentInstance.CarrierCompensated == true
    }
    
    // 'visible' attribute on TextInput (id=WhenToView) at ClaimSnapshotBaggageIncident500DV.pcf: line 119, column 71
    function visible_34 () : java.lang.Boolean {
      return BaggageIncidentInstance.InspectionRequired == true
    }
    
    // 'visible' attribute on TextInput (id=EstimateCost) at ClaimSnapshotBaggageIncident500DV.pcf: line 135, column 81
    function visible_42 () : java.lang.Boolean {
      return BaggageIncidentInstance.EstimatesReceived == "yes"
    }
    
    property get BaggageIncidentInstance () : dynamic.Dynamic {
      return getRequireValue("BaggageIncidentInstance", 0) as dynamic.Dynamic
    }
    
    property set BaggageIncidentInstance ($arg :  dynamic.Dynamic) {
      setRequireValue("BaggageIncidentInstance", 0, $arg)
    }
    
    
  }
  
  
}