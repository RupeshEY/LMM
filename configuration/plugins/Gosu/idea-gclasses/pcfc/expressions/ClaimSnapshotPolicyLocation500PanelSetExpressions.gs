package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyLocation500PanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotPolicyLocation500PanelSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyLocation500PanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyLocation500LDPExpressionsImpl extends ClaimSnapshotPolicyLocation500PanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 274, column 54
    function sortValue_104 (CovTerm :  dynamic.Dynamic) : java.lang.Object {
      return CovTerm.Type
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 279, column 54
    function sortValue_105 (CovTerm :  dynamic.Dynamic) : java.lang.Object {
      return CovTerm.Value
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 284, column 54
    function sortValue_106 (CovTerm :  dynamic.Dynamic) : java.lang.Object {
      return CovTerm.ValueType
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 289, column 54
    function sortValue_107 (CovTerm :  dynamic.Dynamic) : java.lang.Object {
      return CovTerm.AggregationModel
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 294, column 54
    function sortValue_108 (CovTerm :  dynamic.Dynamic) : java.lang.Object {
      return CovTerm.RestrictionModel
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 206, column 46
    function sortValue_71 (PropertyCoverage :  dynamic.Dynamic) : java.lang.Object {
      return PropertyCoverage.Type
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 212, column 46
    function sortValue_72 (PropertyCoverage :  dynamic.Dynamic) : java.lang.Object {
      return PropertyCoverage.Deductible
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 218, column 46
    function sortValue_73 (PropertyCoverage :  dynamic.Dynamic) : java.lang.Object {
      return PropertyCoverage.ExposureLimit
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 224, column 46
    function sortValue_74 (PropertyCoverage :  dynamic.Dynamic) : java.lang.Object {
      return PropertyCoverage.IncidentLimit
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 230, column 46
    function sortValue_75 (PropertyCoverage :  dynamic.Dynamic) : java.lang.Object {
      return PropertyCoverage.Coinsurance
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 235, column 46
    function sortValue_76 (PropertyCoverage :  dynamic.Dynamic) : java.lang.Object {
      return PropertyCoverage.CoverageBasis
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 240, column 46
    function sortValue_77 (PropertyCoverage :  dynamic.Dynamic) : java.lang.Object {
      return PropertyCoverage.LimitsIndicator
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 245, column 46
    function sortValue_78 (PropertyCoverage :  dynamic.Dynamic) : java.lang.Object {
      return PropertyCoverage.Notes
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 199, column 41
    function value_103 () : dynamic.Dynamic {
      return LocationBasedRU.Coverages
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 267, column 49
    function value_124 () : dynamic.Dynamic {
      return SelectedCoverage.CovTerms
    }
    
    // 'visible' attribute on Card (id=CovTermsDetail) at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 254, column 81
    function visible_125 () : java.lang.Boolean {
      return SelectedCoverage.CovTerms.length as java.lang.Double > 0
    }
    
    property get SelectedCoverage () : dynamic.Dynamic {
      return getCurrentSelection(1) as dynamic.Dynamic
    }
    
    property set SelectedCoverage ($arg :  dynamic.Dynamic) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyLocation500PanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyLocation500PanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 69, column 48
    function sortValue_21 (building :  dynamic.Dynamic) : java.lang.Object {
      return building.BuildingNumber
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 74, column 48
    function sortValue_22 (building :  dynamic.Dynamic) : java.lang.Object {
      return building.Notes
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 109, column 80
    function sortValue_37 (PropertyOwner :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(PropertyOwner.Lienholder)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 113, column 79
    function sortValue_38 (PropertyOwner :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(PropertyOwner.OwnerType)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 137, column 48
    function sortValue_46 (PropertyItem :  dynamic.Dynamic) : java.lang.Object {
      return PropertyItem.Description
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 143, column 48
    function sortValue_47 (PropertyItem :  dynamic.Dynamic) : java.lang.Object {
      return PropertyItem.AppraisedValue
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 167, column 48
    function sortValue_57 (classcode :  dynamic.Dynamic) : java.lang.Object {
      return classcode.Code
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 172, column 48
    function sortValue_58 (classcode :  dynamic.Dynamic) : java.lang.Object {
      return classcode.Description
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 177, column 48
    function sortValue_59 (classcode :  dynamic.Dynamic) : java.lang.Object {
      return classcode.Comments
    }
    
    // 'value' attribute on TextInput (id=Number) at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 20, column 40
    function valueRoot_2 () : java.lang.Object {
      return LocationBasedRU
    }
    
    // 'value' attribute on TextInput (id=LocationNumber) at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 25, column 40
    function valueRoot_5 () : java.lang.Object {
      return LocationBasedRU.Property
    }
    
    // 'value' attribute on TextInput (id=Address) at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 30, column 40
    function valueRoot_8 () : java.lang.Object {
      return LocationBasedRU.Property.Address
    }
    
    // 'value' attribute on TextInput (id=Number) at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 20, column 40
    function value_0 () : dynamic.Dynamic {
      return LocationBasedRU.RUNumber
    }
    
    // 'value' attribute on TextInput (id=State) at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 42, column 40
    function value_12 () : dynamic.Dynamic {
      return LocationBasedRU.Property.Address.State
    }
    
    // 'value' attribute on TextInput (id=ZipCode) at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 47, column 40
    function value_15 () : dynamic.Dynamic {
      return LocationBasedRU.Property.Address.PostalCode
    }
    
    // 'value' attribute on TextInput (id=Country) at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 52, column 40
    function value_18 () : dynamic.Dynamic {
      return LocationBasedRU.Property.Address.Country
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 62, column 43
    function value_29 () : dynamic.Dynamic {
      return getBuildingAsArray(LocationBasedRU)
    }
    
    // 'value' attribute on TextInput (id=LocationNumber) at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 25, column 40
    function value_3 () : dynamic.Dynamic {
      return LocationBasedRU.Property.LocationNumber
    }
    
    // 'value' attribute on TextInput (id=Description) at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 85, column 40
    function value_30 () : dynamic.Dynamic {
      return LocationBasedRU.Property.Address.Description
    }
    
    // 'value' attribute on TextInput (id=Notes) at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 90, column 40
    function value_33 () : dynamic.Dynamic {
      return LocationBasedRU.Property.Notes
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 104, column 43
    function value_43 () : dynamic.Dynamic {
      return LocationBasedRU.Property.Lienholders
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 131, column 43
    function value_54 () : dynamic.Dynamic {
      return LocationBasedRU.Property.HighValueItems
    }
    
    // 'value' attribute on TextInput (id=Address) at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 30, column 40
    function value_6 () : dynamic.Dynamic {
      return LocationBasedRU.Property.Address.AddressLine1
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 160, column 43
    function value_69 () : dynamic.Dynamic {
      return getClassCodeAsArray(LocationBasedRU)
    }
    
    // 'value' attribute on TextInput (id=City) at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 36, column 40
    function value_9 () : dynamic.Dynamic {
      return LocationBasedRU.Property.Address.City
    }
    
    // 'visible' attribute on InputDivider at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 92, column 93
    function visible_36 () : java.lang.Boolean {
      return LocationBasedRU.Property.Lienholders.length as java.lang.Double > 0
    }
    
    // 'visible' attribute on InputDivider at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 119, column 96
    function visible_45 () : java.lang.Boolean {
      return LocationBasedRU.Property.HighValueItems.length as java.lang.Double > 0
    }
    
    // 'visible' attribute on InputDivider at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 149, column 56
    function visible_56 () : java.lang.Boolean {
      return LocationBasedRU.ClassCode != null
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get LocationBasedRU () : dynamic.Dynamic {
      return getRequireValue("LocationBasedRU", 0) as dynamic.Dynamic
    }
    
    property set LocationBasedRU ($arg :  dynamic.Dynamic) {
      setRequireValue("LocationBasedRU", 0, $arg)
    }
    
    
        function getBuildingAsArray(riskUnit : dynamic.Dynamic) : dynamic.Dynamic {
          if(riskUnit.Building != null) {
            return new Object[] {riskUnit.Building}
          } else {
            return new Object[] { }
          }
        }
    
        function getClassCodeAsArray(riskUnit : dynamic.Dynamic) : dynamic.Dynamic {
          if(riskUnit.ClassCode != null) {
            return new Object[] {riskUnit.ClassCode}
          } else {
            return new Object[] { }
          }
        }
      
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyLocation500PanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends ClaimSnapshotPolicyLocation500PanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Lienholder) at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 109, column 80
    function value_39 () : java.lang.String {
      return util.Snapshot.renderValue(PropertyOwner.Lienholder)
    }
    
    // 'value' attribute on TextCell (id=OwnerType) at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 113, column 79
    function value_41 () : java.lang.String {
      return util.Snapshot.renderValue(PropertyOwner.OwnerType)
    }
    
    property get PropertyOwner () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyLocation500PanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry3ExpressionsImpl extends ClaimSnapshotPolicyLocation500PanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=ItemDescription) at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 137, column 48
    function valueRoot_50 () : java.lang.Object {
      return PropertyItem
    }
    
    // 'value' attribute on TextCell (id=ItemDescription) at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 137, column 48
    function value_48 () : dynamic.Dynamic {
      return PropertyItem.Description
    }
    
    // 'value' attribute on TextCell (id=ItemValue) at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 143, column 48
    function value_51 () : dynamic.Dynamic {
      return PropertyItem.AppraisedValue
    }
    
    property get PropertyItem () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyLocation500PanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry4ExpressionsImpl extends ClaimSnapshotPolicyLocation500PanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Code) at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 167, column 48
    function valueRoot_62 () : java.lang.Object {
      return classcode
    }
    
    // 'value' attribute on TextCell (id=Code) at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 167, column 48
    function value_60 () : dynamic.Dynamic {
      return classcode.Code
    }
    
    // 'value' attribute on TextCell (id=Description) at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 172, column 48
    function value_63 () : dynamic.Dynamic {
      return classcode.Description
    }
    
    // 'value' attribute on TextCell (id=Comments) at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 177, column 48
    function value_66 () : dynamic.Dynamic {
      return classcode.Comments
    }
    
    property get classcode () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyLocation500PanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry5ExpressionsImpl extends ClaimSnapshotPolicyLocation500LDPExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=CoverageType) at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 206, column 46
    function valueRoot_81 () : java.lang.Object {
      return PropertyCoverage
    }
    
    // 'value' attribute on TextCell (id=CoverageNotes) at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 245, column 46
    function value_100 () : dynamic.Dynamic {
      return PropertyCoverage.Notes
    }
    
    // 'value' attribute on TextCell (id=CoverageType) at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 206, column 46
    function value_79 () : dynamic.Dynamic {
      return PropertyCoverage.Type
    }
    
    // 'value' attribute on TextCell (id=Deductible) at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 212, column 46
    function value_82 () : dynamic.Dynamic {
      return PropertyCoverage.Deductible
    }
    
    // 'value' attribute on TextCell (id=ExposureLimit) at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 218, column 46
    function value_85 () : dynamic.Dynamic {
      return PropertyCoverage.ExposureLimit
    }
    
    // 'value' attribute on TextCell (id=IncidentLimit) at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 224, column 46
    function value_88 () : dynamic.Dynamic {
      return PropertyCoverage.IncidentLimit
    }
    
    // 'value' attribute on TextCell (id=Coinsurance) at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 230, column 46
    function value_91 () : dynamic.Dynamic {
      return PropertyCoverage.Coinsurance
    }
    
    // 'value' attribute on TextCell (id=CoverageBasis) at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 235, column 46
    function value_94 () : dynamic.Dynamic {
      return PropertyCoverage.CoverageBasis
    }
    
    // 'value' attribute on TextCell (id=LimitsIndicator) at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 240, column 46
    function value_97 () : dynamic.Dynamic {
      return PropertyCoverage.LimitsIndicator
    }
    
    property get PropertyCoverage () : dynamic.Dynamic {
      return getIteratedValue(2) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyLocation500PanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry6ExpressionsImpl extends ClaimSnapshotPolicyLocation500LDPExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Type) at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 274, column 54
    function valueRoot_111 () : java.lang.Object {
      return CovTerm
    }
    
    // 'value' attribute on TextCell (id=Type) at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 274, column 54
    function value_109 () : dynamic.Dynamic {
      return CovTerm.Type
    }
    
    // 'value' attribute on TextCell (id=Value) at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 279, column 54
    function value_112 () : dynamic.Dynamic {
      return CovTerm.Value
    }
    
    // 'value' attribute on TextCell (id=ValueType) at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 284, column 54
    function value_115 () : dynamic.Dynamic {
      return CovTerm.ValueType
    }
    
    // 'value' attribute on TextCell (id=AggregationModel) at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 289, column 54
    function value_118 () : dynamic.Dynamic {
      return CovTerm.AggregationModel
    }
    
    // 'value' attribute on TextCell (id=RestrictionModel) at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 294, column 54
    function value_121 () : dynamic.Dynamic {
      return CovTerm.RestrictionModel
    }
    
    property get CovTerm () : dynamic.Dynamic {
      return getIteratedValue(2) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyLocation500PanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotPolicyLocation500PanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Number) at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 69, column 48
    function valueRoot_25 () : java.lang.Object {
      return building
    }
    
    // 'value' attribute on TextCell (id=Number) at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 69, column 48
    function value_23 () : dynamic.Dynamic {
      return building.BuildingNumber
    }
    
    // 'value' attribute on TextCell (id=Notes) at ClaimSnapshotPolicyLocation500PanelSet.pcf: line 74, column 48
    function value_26 () : dynamic.Dynamic {
      return building.Notes
    }
    
    property get building () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}