package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotFixedPropertyIncident700DV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotFixedPropertyIncident700DVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotFixedPropertyIncident700DV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotFixedPropertyIncident700DVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotFixedPropertyIncident700DV.pcf: line 38, column 27
    function def_onEnter_9 (def :  pcf.AddressSnapshot700InputSet) : void {
      def.onEnter(FixedPropertyIncident.Property.Address, null)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotFixedPropertyIncident700DV.pcf: line 38, column 27
    function def_refreshVariables_10 (def :  pcf.AddressSnapshot700InputSet) : void {
      def.refreshVariables(FixedPropertyIncident.Property.Address, null)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotFixedPropertyIncident700DV.pcf: line 55, column 46
    function sortValue_11 (PropertyOwner :  dynamic.Dynamic) : java.lang.Object {
      return PropertyOwner.Lienholder.DisplayName
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotFixedPropertyIncident700DV.pcf: line 60, column 46
    function sortValue_12 (PropertyOwner :  dynamic.Dynamic) : java.lang.Object {
      return PropertyOwner.OwnerType
    }
    
    // 'value' attribute on TextInput (id=PropertyDescription) at ClaimSnapshotFixedPropertyIncident700DV.pcf: line 20, column 38
    function valueRoot_2 () : java.lang.Object {
      return FixedPropertyIncident
    }
    
    // 'value' attribute on TextInput (id=PropertyDescription) at ClaimSnapshotFixedPropertyIncident700DV.pcf: line 20, column 38
    function value_0 () : dynamic.Dynamic {
      return FixedPropertyIncident.PropertyDesc
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotFixedPropertyIncident700DV.pcf: line 48, column 41
    function value_19 () : dynamic.Dynamic {
      return FixedPropertyIncident.Property.Lienholders
    }
    
    // 'value' attribute on TextInput (id=InspectionRequired) at ClaimSnapshotFixedPropertyIncident700DV.pcf: line 72, column 38
    function value_20 () : dynamic.Dynamic {
      return FixedPropertyIncident.InspectionRequired
    }
    
    // 'value' attribute on TextInput (id=WhenToView) at ClaimSnapshotFixedPropertyIncident700DV.pcf: line 77, column 38
    function value_23 () : dynamic.Dynamic {
      return FixedPropertyIncident.AppraisalFirstAppointment
    }
    
    // 'value' attribute on TextInput (id=EstimatedReceived) at ClaimSnapshotFixedPropertyIncident700DV.pcf: line 85, column 38
    function value_26 () : dynamic.Dynamic {
      return FixedPropertyIncident.EstimatesReceived
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at ClaimSnapshotFixedPropertyIncident700DV.pcf: line 27, column 38
    function value_3 () : dynamic.Dynamic {
      return FixedPropertyIncident.Description
    }
    
    // 'value' attribute on TextInput (id=EstimateCost) at ClaimSnapshotFixedPropertyIncident700DV.pcf: line 91, column 84
    function value_30 () : dynamic.Dynamic {
      return FixedPropertyIncident.EstRepairCost
    }
    
    // 'value' attribute on TextInput (id=EstimateTime) at ClaimSnapshotFixedPropertyIncident700DV.pcf: line 97, column 84
    function value_35 () : dynamic.Dynamic {
      return FixedPropertyIncident.EstRepairTime
    }
    
    // 'value' attribute on TextInput (id=PropertyAttribute_ClassType) at ClaimSnapshotFixedPropertyIncident700DV.pcf: line 107, column 38
    function value_39 () : dynamic.Dynamic {
      return FixedPropertyIncident.ClassType
    }
    
    // 'value' attribute on TextInput (id=PropertyAttribute_NumStories) at ClaimSnapshotFixedPropertyIncident700DV.pcf: line 113, column 38
    function value_42 () : dynamic.Dynamic {
      return FixedPropertyIncident.NumStories
    }
    
    // 'value' attribute on TextInput (id=PropertyAttribute_RoofMaterial) at ClaimSnapshotFixedPropertyIncident700DV.pcf: line 118, column 38
    function value_45 () : dynamic.Dynamic {
      return FixedPropertyIncident.RoofMaterial
    }
    
    // 'value' attribute on TextInput (id=PropertyAttribute_ExtWallMat) at ClaimSnapshotFixedPropertyIncident700DV.pcf: line 123, column 38
    function value_48 () : dynamic.Dynamic {
      return FixedPropertyIncident.ExtWallMat
    }
    
    // 'value' attribute on TextInput (id=PropertyAttribute_LossArea) at ClaimSnapshotFixedPropertyIncident700DV.pcf: line 131, column 38
    function value_51 () : dynamic.Dynamic {
      return FixedPropertyIncident.LossArea
    }
    
    // 'value' attribute on TextInput (id=PropertyAttribute_SprinklerType) at ClaimSnapshotFixedPropertyIncident700DV.pcf: line 141, column 40
    function value_54 () : dynamic.Dynamic {
      return FixedPropertyIncident.SprinklerType
    }
    
    // 'value' attribute on TextInput (id=PropertyAttribute_NumSprinkler) at ClaimSnapshotFixedPropertyIncident700DV.pcf: line 147, column 40
    function value_57 () : dynamic.Dynamic {
      return FixedPropertyIncident.NumSprinkler
    }
    
    // 'value' attribute on TextInput (id=LossEstimate) at ClaimSnapshotFixedPropertyIncident700DV.pcf: line 32, column 38
    function value_6 () : dynamic.Dynamic {
      return FixedPropertyIncident.LossEstimate
    }
    
    // 'value' attribute on TextInput (id=PropertyAttribute_NumSprinkOper) at ClaimSnapshotFixedPropertyIncident700DV.pcf: line 153, column 40
    function value_60 () : dynamic.Dynamic {
      return FixedPropertyIncident.NumSprinkOper
    }
    
    // 'value' attribute on TextInput (id=PropertyAttribute_SprinkRetServ) at ClaimSnapshotFixedPropertyIncident700DV.pcf: line 158, column 40
    function value_63 () : dynamic.Dynamic {
      return FixedPropertyIncident.SprinkRetServ
    }
    
    // 'visible' attribute on TextInput (id=EstimateCost) at ClaimSnapshotFixedPropertyIncident700DV.pcf: line 91, column 84
    function visible_29 () : java.lang.Boolean {
      return FixedPropertyIncident.EstimatesReceived.Code == "Yes"
    }
    
    // 'visible' attribute on InputSet at ClaimSnapshotFixedPropertyIncident700DV.pcf: line 133, column 83
    function visible_66 () : java.lang.Boolean {
      return FixedPropertyIncident.Claim.LossCause.Code == LossCause.TC_FIRE
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get FixedPropertyIncident () : dynamic.Dynamic {
      return getRequireValue("FixedPropertyIncident", 0) as dynamic.Dynamic
    }
    
    property set FixedPropertyIncident ($arg :  dynamic.Dynamic) {
      setRequireValue("FixedPropertyIncident", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotFixedPropertyIncident700DV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotFixedPropertyIncident700DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Lienholder) at ClaimSnapshotFixedPropertyIncident700DV.pcf: line 55, column 46
    function valueRoot_15 () : java.lang.Object {
      return PropertyOwner.Lienholder
    }
    
    // 'value' attribute on TextCell (id=OwnerType) at ClaimSnapshotFixedPropertyIncident700DV.pcf: line 60, column 46
    function valueRoot_18 () : java.lang.Object {
      return PropertyOwner
    }
    
    // 'value' attribute on TextCell (id=Lienholder) at ClaimSnapshotFixedPropertyIncident700DV.pcf: line 55, column 46
    function value_13 () : dynamic.Dynamic {
      return PropertyOwner.Lienholder.DisplayName
    }
    
    // 'value' attribute on TextCell (id=OwnerType) at ClaimSnapshotFixedPropertyIncident700DV.pcf: line 60, column 46
    function value_16 () : dynamic.Dynamic {
      return PropertyOwner.OwnerType
    }
    
    property get PropertyOwner () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}