package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/default/ClaimSnapshotBaggageIncidentDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotBaggageIncidentDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/default/ClaimSnapshotBaggageIncidentDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotBaggageIncidentDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'label' attribute on TextAreaInput (id=Description) at ClaimSnapshotBaggageIncidentDV.pcf: line 54, column 38
    function label_15 () : java.lang.Object {
      return BaggageIncidentInstance.DelayOnly == true ? DisplayKey.get("Web.BaggageIncident.DelayDescription") : DisplayKey.get("Web.BaggageIncident.Description")
    }
    
    // 'value' attribute on TextInput (id=BaggageType) at ClaimSnapshotBaggageIncidentDV.pcf: line 15, column 37
    function valueRoot_2 () : java.lang.Object {
      return BaggageIncidentInstance
    }
    
    // 'value' attribute on TextInput (id=BaggageType) at ClaimSnapshotBaggageIncidentDV.pcf: line 15, column 37
    function value_0 () : dynamic.Dynamic {
      return BaggageIncidentInstance.BaggageType
    }
    
    // 'value' attribute on DateInput (id=BaggageRecoveredOn) at ClaimSnapshotBaggageIncidentDV.pcf: line 47, column 38
    function value_12 () : dynamic.Dynamic {
      return BaggageIncidentInstance.BaggageRecoveredOn
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at ClaimSnapshotBaggageIncidentDV.pcf: line 54, column 38
    function value_16 () : dynamic.Dynamic {
      return BaggageIncidentInstance.Description
    }
    
    // 'value' attribute on TextInput (id=LossEstimate) at ClaimSnapshotBaggageIncidentDV.pcf: line 59, column 38
    function value_20 () : dynamic.Dynamic {
      return BaggageIncidentInstance.LossEstimate
    }
    
    // 'value' attribute on BooleanRadioInput (id=CarrierCompensated) at ClaimSnapshotBaggageIncidentDV.pcf: line 67, column 37
    function value_23 () : dynamic.Dynamic {
      return BaggageIncidentInstance.CarrierCompensated
    }
    
    // 'value' attribute on TextInput (id=CarrierCompensatedAmount) at ClaimSnapshotBaggageIncidentDV.pcf: line 75, column 71
    function value_27 () : dynamic.Dynamic {
      return BaggageIncidentInstance.CarrierCompensatedAmount
    }
    
    // 'value' attribute on TextAreaInput (id=PropertyDescription) at ClaimSnapshotBaggageIncidentDV.pcf: line 23, column 38
    function value_3 () : dynamic.Dynamic {
      return BaggageIncidentInstance.PropertyDesc
    }
    
    // 'value' attribute on TextInput (id=EstimatedReceived) at ClaimSnapshotBaggageIncidentDV.pcf: line 84, column 37
    function value_31 () : dynamic.Dynamic {
      return BaggageIncidentInstance.EstimatesReceived
    }
    
    // 'value' attribute on TextInput (id=EstimateCost) at ClaimSnapshotBaggageIncidentDV.pcf: line 92, column 81
    function value_35 () : dynamic.Dynamic {
      return BaggageIncidentInstance.EstRepairCost
    }
    
    // 'value' attribute on TextInput (id=EstimateTime) at ClaimSnapshotBaggageIncidentDV.pcf: line 98, column 81
    function value_40 () : dynamic.Dynamic {
      return BaggageIncidentInstance.EstRepairTime
    }
    
    // 'value' attribute on BooleanRadioInput (id=DelayOnly) at ClaimSnapshotBaggageIncidentDV.pcf: line 31, column 37
    function value_6 () : dynamic.Dynamic {
      return BaggageIncidentInstance.DelayOnly
    }
    
    // 'value' attribute on DateInput (id=BaggageMissingFrom) at ClaimSnapshotBaggageIncidentDV.pcf: line 40, column 38
    function value_9 () : dynamic.Dynamic {
      return BaggageIncidentInstance.BaggageMissingFrom
    }
    
    // 'visible' attribute on TextInput (id=CarrierCompensatedAmount) at ClaimSnapshotBaggageIncidentDV.pcf: line 75, column 71
    function visible_26 () : java.lang.Boolean {
      return BaggageIncidentInstance.CarrierCompensated == true
    }
    
    // 'visible' attribute on TextInput (id=EstimateCost) at ClaimSnapshotBaggageIncidentDV.pcf: line 92, column 81
    function visible_34 () : java.lang.Boolean {
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