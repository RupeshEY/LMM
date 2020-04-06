package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotFixedPropertyIncident400DV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotFixedPropertyIncident400DVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotFixedPropertyIncident400DV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotFixedPropertyIncident400DVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotFixedPropertyIncident400DV.pcf: line 77, column 46
    function sortValue_24 (PropertyOwner :  dynamic.Dynamic) : java.lang.Object {
      return PropertyOwner.Lienholder.DisplayName
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotFixedPropertyIncident400DV.pcf: line 82, column 46
    function sortValue_25 (PropertyOwner :  dynamic.Dynamic) : java.lang.Object {
      return PropertyOwner.OwnerType
    }
    
    // 'value' attribute on TextInput (id=Address_AddressLine1) at ClaimSnapshotFixedPropertyIncident400DV.pcf: line 40, column 38
    function valueRoot_11 () : java.lang.Object {
      return FixedPropertyIncident.Property.Address
    }
    
    // 'value' attribute on TextInput (id=PropertyDescription) at ClaimSnapshotFixedPropertyIncident400DV.pcf: line 20, column 38
    function valueRoot_2 () : java.lang.Object {
      return FixedPropertyIncident
    }
    
    // 'value' attribute on TextInput (id=PropertyDescription) at ClaimSnapshotFixedPropertyIncident400DV.pcf: line 20, column 38
    function value_0 () : dynamic.Dynamic {
      return FixedPropertyIncident.PropertyDesc
    }
    
    // 'value' attribute on TextInput (id=Address_AddressLine2) at ClaimSnapshotFixedPropertyIncident400DV.pcf: line 45, column 38
    function value_12 () : dynamic.Dynamic {
      return FixedPropertyIncident.Property.Address.AddressLine2
    }
    
    // 'value' attribute on TextInput (id=Address_City) at ClaimSnapshotFixedPropertyIncident400DV.pcf: line 50, column 38
    function value_15 () : dynamic.Dynamic {
      return FixedPropertyIncident.Property.Address.City
    }
    
    // 'value' attribute on TextInput (id=Address_State) at ClaimSnapshotFixedPropertyIncident400DV.pcf: line 55, column 38
    function value_18 () : dynamic.Dynamic {
      return FixedPropertyIncident.Property.Address.State
    }
    
    // 'value' attribute on TextInput (id=Address_PostalCode) at ClaimSnapshotFixedPropertyIncident400DV.pcf: line 60, column 38
    function value_21 () : dynamic.Dynamic {
      return FixedPropertyIncident.Property.Address.PostalCode
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at ClaimSnapshotFixedPropertyIncident400DV.pcf: line 27, column 38
    function value_3 () : dynamic.Dynamic {
      return FixedPropertyIncident.Description
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotFixedPropertyIncident400DV.pcf: line 70, column 41
    function value_32 () : dynamic.Dynamic {
      return FixedPropertyIncident.Property.Lienholders
    }
    
    // 'value' attribute on TextInput (id=InspectionRequired) at ClaimSnapshotFixedPropertyIncident400DV.pcf: line 94, column 38
    function value_33 () : dynamic.Dynamic {
      return FixedPropertyIncident.InspectionRequired
    }
    
    // 'value' attribute on TextInput (id=WhenToView) at ClaimSnapshotFixedPropertyIncident400DV.pcf: line 99, column 38
    function value_36 () : dynamic.Dynamic {
      return FixedPropertyIncident.WhenToView
    }
    
    // 'value' attribute on TextInput (id=EstimatedReceived) at ClaimSnapshotFixedPropertyIncident400DV.pcf: line 107, column 38
    function value_39 () : dynamic.Dynamic {
      return FixedPropertyIncident.EstimatesReceived
    }
    
    // 'value' attribute on TextInput (id=EstimateCost) at ClaimSnapshotFixedPropertyIncident400DV.pcf: line 113, column 84
    function value_43 () : dynamic.Dynamic {
      return FixedPropertyIncident.EstRepairCost
    }
    
    // 'value' attribute on TextInput (id=EstimateTime) at ClaimSnapshotFixedPropertyIncident400DV.pcf: line 119, column 84
    function value_48 () : dynamic.Dynamic {
      return FixedPropertyIncident.EstRepairTime
    }
    
    // 'value' attribute on TextInput (id=PropertyAttribute_ClassType) at ClaimSnapshotFixedPropertyIncident400DV.pcf: line 129, column 38
    function value_52 () : dynamic.Dynamic {
      return FixedPropertyIncident.ClassType
    }
    
    // 'value' attribute on TextInput (id=PropertyAttribute_NumStories) at ClaimSnapshotFixedPropertyIncident400DV.pcf: line 135, column 38
    function value_55 () : dynamic.Dynamic {
      return FixedPropertyIncident.NumStories
    }
    
    // 'value' attribute on TextInput (id=PropertyAttribute_RoofMaterial) at ClaimSnapshotFixedPropertyIncident400DV.pcf: line 140, column 38
    function value_58 () : dynamic.Dynamic {
      return FixedPropertyIncident.RoofMaterial
    }
    
    // 'value' attribute on TextInput (id=LossEstimate) at ClaimSnapshotFixedPropertyIncident400DV.pcf: line 32, column 38
    function value_6 () : dynamic.Dynamic {
      return FixedPropertyIncident.LossEstimate
    }
    
    // 'value' attribute on TextInput (id=PropertyAttribute_ExtWallMat) at ClaimSnapshotFixedPropertyIncident400DV.pcf: line 145, column 38
    function value_61 () : dynamic.Dynamic {
      return FixedPropertyIncident.ExtWallMat
    }
    
    // 'value' attribute on TextInput (id=PropertyAttribute_LossArea) at ClaimSnapshotFixedPropertyIncident400DV.pcf: line 153, column 38
    function value_64 () : dynamic.Dynamic {
      return FixedPropertyIncident.LossArea
    }
    
    // 'value' attribute on TextInput (id=PropertyAttribute_FireProtDetails) at ClaimSnapshotFixedPropertyIncident400DV.pcf: line 161, column 85
    function value_68 () : dynamic.Dynamic {
      return FixedPropertyIncident.FireProtDetails
    }
    
    // 'value' attribute on TextInput (id=PropertyAttribute_SprinklerType) at ClaimSnapshotFixedPropertyIncident400DV.pcf: line 167, column 85
    function value_73 () : dynamic.Dynamic {
      return FixedPropertyIncident.SprinklerType
    }
    
    // 'value' attribute on TextInput (id=PropertyAttribute_NumSprinkler) at ClaimSnapshotFixedPropertyIncident400DV.pcf: line 174, column 85
    function value_78 () : dynamic.Dynamic {
      return FixedPropertyIncident.NumSprinkler
    }
    
    // 'value' attribute on TextInput (id=PropertyAttribute_NumSprinkOper) at ClaimSnapshotFixedPropertyIncident400DV.pcf: line 181, column 85
    function value_83 () : dynamic.Dynamic {
      return FixedPropertyIncident.NumSprinkOper
    }
    
    // 'value' attribute on TextInput (id=PropertyAttribute_SprinkRetServ) at ClaimSnapshotFixedPropertyIncident400DV.pcf: line 187, column 85
    function value_88 () : dynamic.Dynamic {
      return FixedPropertyIncident.SprinkRetServ
    }
    
    // 'value' attribute on TextInput (id=Address_AddressLine1) at ClaimSnapshotFixedPropertyIncident400DV.pcf: line 40, column 38
    function value_9 () : dynamic.Dynamic {
      return FixedPropertyIncident.Property.Address.AddressLine1
    }
    
    // 'visible' attribute on TextInput (id=EstimateCost) at ClaimSnapshotFixedPropertyIncident400DV.pcf: line 113, column 84
    function visible_42 () : java.lang.Boolean {
      return FixedPropertyIncident.EstimatesReceived.Code == "Yes"
    }
    
    // 'visible' attribute on TextInput (id=PropertyAttribute_FireProtDetails) at ClaimSnapshotFixedPropertyIncident400DV.pcf: line 161, column 85
    function visible_67 () : java.lang.Boolean {
      return  FixedPropertyIncident.Claim.LossCause.Code == "fire" 
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
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotFixedPropertyIncident400DV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotFixedPropertyIncident400DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Lienholder) at ClaimSnapshotFixedPropertyIncident400DV.pcf: line 77, column 46
    function valueRoot_28 () : java.lang.Object {
      return PropertyOwner.Lienholder
    }
    
    // 'value' attribute on TextCell (id=OwnerType) at ClaimSnapshotFixedPropertyIncident400DV.pcf: line 82, column 46
    function valueRoot_31 () : java.lang.Object {
      return PropertyOwner
    }
    
    // 'value' attribute on TextCell (id=Lienholder) at ClaimSnapshotFixedPropertyIncident400DV.pcf: line 77, column 46
    function value_26 () : dynamic.Dynamic {
      return PropertyOwner.Lienholder.DisplayName
    }
    
    // 'value' attribute on TextCell (id=OwnerType) at ClaimSnapshotFixedPropertyIncident400DV.pcf: line 82, column 46
    function value_29 () : dynamic.Dynamic {
      return PropertyOwner.OwnerType
    }
    
    property get PropertyOwner () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}