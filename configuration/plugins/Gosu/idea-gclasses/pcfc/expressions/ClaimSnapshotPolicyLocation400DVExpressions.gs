package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyLocation400DV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotPolicyLocation400DVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyLocation400DV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyLocation400DVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation400DV.pcf: line 79, column 78
    function sortValue_27 (PropertyOwner :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(PropertyOwner.Lienholder)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation400DV.pcf: line 83, column 77
    function sortValue_28 (PropertyOwner :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(PropertyOwner.OwnerType)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation400DV.pcf: line 105, column 46
    function sortValue_34 (PropertyItem :  dynamic.Dynamic) : java.lang.Object {
      return PropertyItem.Description
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation400DV.pcf: line 111, column 46
    function sortValue_35 (PropertyItem :  dynamic.Dynamic) : java.lang.Object {
      return PropertyItem.AppraisedValue
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation400DV.pcf: line 136, column 46
    function sortValue_43 (PropertyCoverage :  dynamic.Dynamic) : java.lang.Object {
      return PropertyCoverage.Type
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation400DV.pcf: line 142, column 46
    function sortValue_44 (PropertyCoverage :  dynamic.Dynamic) : java.lang.Object {
      return PropertyCoverage.Deductible
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation400DV.pcf: line 148, column 46
    function sortValue_45 (PropertyCoverage :  dynamic.Dynamic) : java.lang.Object {
      return PropertyCoverage.ExposureLimit
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation400DV.pcf: line 154, column 46
    function sortValue_46 (PropertyCoverage :  dynamic.Dynamic) : java.lang.Object {
      return PropertyCoverage.IncidentLimit
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation400DV.pcf: line 160, column 46
    function sortValue_47 (PropertyCoverage :  dynamic.Dynamic) : java.lang.Object {
      return PropertyCoverage.Coinsurance
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation400DV.pcf: line 165, column 46
    function sortValue_48 (PropertyCoverage :  dynamic.Dynamic) : java.lang.Object {
      return PropertyCoverage.CoverageBasis
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation400DV.pcf: line 170, column 46
    function sortValue_49 (PropertyCoverage :  dynamic.Dynamic) : java.lang.Object {
      return PropertyCoverage.LimitsIndicator
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation400DV.pcf: line 175, column 46
    function sortValue_50 (PropertyCoverage :  dynamic.Dynamic) : java.lang.Object {
      return PropertyCoverage.Notes
    }
    
    // 'value' attribute on TextInput (id=Address) at ClaimSnapshotPolicyLocation400DV.pcf: line 33, column 38
    function valueRoot_11 () : java.lang.Object {
      return PolicyProperty.Property.Address
    }
    
    // 'value' attribute on TextInput (id=Number) at ClaimSnapshotPolicyLocation400DV.pcf: line 18, column 38
    function valueRoot_2 () : java.lang.Object {
      return PolicyProperty
    }
    
    // 'value' attribute on TextInput (id=LocationNumber) at ClaimSnapshotPolicyLocation400DV.pcf: line 23, column 38
    function valueRoot_5 () : java.lang.Object {
      return PolicyProperty.Property
    }
    
    // 'value' attribute on TextInput (id=Number) at ClaimSnapshotPolicyLocation400DV.pcf: line 18, column 38
    function value_0 () : dynamic.Dynamic {
      return PolicyProperty.PropertyNumber
    }
    
    // 'value' attribute on TextInput (id=City) at ClaimSnapshotPolicyLocation400DV.pcf: line 39, column 38
    function value_12 () : dynamic.Dynamic {
      return PolicyProperty.Property.Address.City
    }
    
    // 'value' attribute on TextInput (id=State) at ClaimSnapshotPolicyLocation400DV.pcf: line 45, column 38
    function value_15 () : dynamic.Dynamic {
      return PolicyProperty.Property.Address.State
    }
    
    // 'value' attribute on TextInput (id=ZipCode) at ClaimSnapshotPolicyLocation400DV.pcf: line 52, column 38
    function value_18 () : dynamic.Dynamic {
      return PolicyProperty.Property.Address.PostalCode
    }
    
    // 'value' attribute on TextInput (id=Description) at ClaimSnapshotPolicyLocation400DV.pcf: line 57, column 38
    function value_21 () : dynamic.Dynamic {
      return PolicyProperty.Property.Address.Description
    }
    
    // 'value' attribute on TextInput (id=Notes) at ClaimSnapshotPolicyLocation400DV.pcf: line 62, column 38
    function value_24 () : dynamic.Dynamic {
      return PolicyProperty.Property.Notes
    }
    
    // 'value' attribute on TextInput (id=LocationNumber) at ClaimSnapshotPolicyLocation400DV.pcf: line 23, column 38
    function value_3 () : dynamic.Dynamic {
      return PolicyProperty.Property.Location
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation400DV.pcf: line 74, column 41
    function value_33 () : dynamic.Dynamic {
      return PolicyProperty.Property.Lienholders
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation400DV.pcf: line 99, column 41
    function value_42 () : dynamic.Dynamic {
      return PolicyProperty.Property.HighValueItems
    }
    
    // 'value' attribute on TextInput (id=BuildingNumber) at ClaimSnapshotPolicyLocation400DV.pcf: line 28, column 38
    function value_6 () : dynamic.Dynamic {
      return PolicyProperty.Property.BuildingNumber
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation400DV.pcf: line 129, column 41
    function value_75 () : dynamic.Dynamic {
      return PolicyProperty.Property.Coverages
    }
    
    // 'value' attribute on TextInput (id=Address) at ClaimSnapshotPolicyLocation400DV.pcf: line 33, column 38
    function value_9 () : dynamic.Dynamic {
      return PolicyProperty.Property.Address.AddressLine1
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get PolicyProperty () : dynamic.Dynamic {
      return getRequireValue("PolicyProperty", 0) as dynamic.Dynamic
    }
    
    property set PolicyProperty ($arg :  dynamic.Dynamic) {
      setRequireValue("PolicyProperty", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyLocation400DV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends ClaimSnapshotPolicyLocation400DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=ItemDescription) at ClaimSnapshotPolicyLocation400DV.pcf: line 105, column 46
    function valueRoot_38 () : java.lang.Object {
      return PropertyItem
    }
    
    // 'value' attribute on TextCell (id=ItemDescription) at ClaimSnapshotPolicyLocation400DV.pcf: line 105, column 46
    function value_36 () : dynamic.Dynamic {
      return PropertyItem.Description
    }
    
    // 'value' attribute on TextCell (id=ItemValue) at ClaimSnapshotPolicyLocation400DV.pcf: line 111, column 46
    function value_39 () : dynamic.Dynamic {
      return PropertyItem.AppraisedValue
    }
    
    property get PropertyItem () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyLocation400DV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry3ExpressionsImpl extends ClaimSnapshotPolicyLocation400DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=CoverageType) at ClaimSnapshotPolicyLocation400DV.pcf: line 136, column 46
    function valueRoot_53 () : java.lang.Object {
      return PropertyCoverage
    }
    
    // 'value' attribute on TextCell (id=CoverageType) at ClaimSnapshotPolicyLocation400DV.pcf: line 136, column 46
    function value_51 () : dynamic.Dynamic {
      return PropertyCoverage.Type
    }
    
    // 'value' attribute on TextCell (id=Deductible) at ClaimSnapshotPolicyLocation400DV.pcf: line 142, column 46
    function value_54 () : dynamic.Dynamic {
      return PropertyCoverage.Deductible
    }
    
    // 'value' attribute on TextCell (id=ExposureLimit) at ClaimSnapshotPolicyLocation400DV.pcf: line 148, column 46
    function value_57 () : dynamic.Dynamic {
      return PropertyCoverage.ExposureLimit
    }
    
    // 'value' attribute on TextCell (id=IncidentLimit) at ClaimSnapshotPolicyLocation400DV.pcf: line 154, column 46
    function value_60 () : dynamic.Dynamic {
      return PropertyCoverage.IncidentLimit
    }
    
    // 'value' attribute on TextCell (id=Coinsurance) at ClaimSnapshotPolicyLocation400DV.pcf: line 160, column 46
    function value_63 () : dynamic.Dynamic {
      return PropertyCoverage.Coinsurance
    }
    
    // 'value' attribute on TextCell (id=CoverageBasis) at ClaimSnapshotPolicyLocation400DV.pcf: line 165, column 46
    function value_66 () : dynamic.Dynamic {
      return PropertyCoverage.CoverageBasis
    }
    
    // 'value' attribute on TextCell (id=LimitsIndicator) at ClaimSnapshotPolicyLocation400DV.pcf: line 170, column 46
    function value_69 () : dynamic.Dynamic {
      return PropertyCoverage.LimitsIndicator
    }
    
    // 'value' attribute on TextCell (id=CoverageNotes) at ClaimSnapshotPolicyLocation400DV.pcf: line 175, column 46
    function value_72 () : dynamic.Dynamic {
      return PropertyCoverage.Notes
    }
    
    property get PropertyCoverage () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyLocation400DV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotPolicyLocation400DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Lienholder) at ClaimSnapshotPolicyLocation400DV.pcf: line 79, column 78
    function value_29 () : java.lang.String {
      return util.Snapshot.renderValue(PropertyOwner.Lienholder)
    }
    
    // 'value' attribute on TextCell (id=OwnerType) at ClaimSnapshotPolicyLocation400DV.pcf: line 83, column 77
    function value_31 () : java.lang.String {
      return util.Snapshot.renderValue(PropertyOwner.OwnerType)
    }
    
    property get PropertyOwner () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}