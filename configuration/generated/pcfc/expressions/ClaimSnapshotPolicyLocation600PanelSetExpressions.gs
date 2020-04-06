package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotPolicyLocation600PanelSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyLocation600LDPExpressionsImpl extends ClaimSnapshotPolicyLocation600PanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 182, column 46
    function sortValue_58 (PropertyCoverage :  dynamic.Dynamic) : java.lang.Object {
      return PropertyCoverage.Type
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 188, column 46
    function sortValue_59 (PropertyCoverage :  dynamic.Dynamic) : java.lang.Object {
      return PropertyCoverage.Deductible
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 194, column 46
    function sortValue_60 (PropertyCoverage :  dynamic.Dynamic) : java.lang.Object {
      return PropertyCoverage.ExposureLimit
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 200, column 46
    function sortValue_61 (PropertyCoverage :  dynamic.Dynamic) : java.lang.Object {
      return PropertyCoverage.IncidentLimit
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 206, column 46
    function sortValue_62 (PropertyCoverage :  dynamic.Dynamic) : java.lang.Object {
      return PropertyCoverage.Coinsurance
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 211, column 46
    function sortValue_63 (PropertyCoverage :  dynamic.Dynamic) : java.lang.Object {
      return PropertyCoverage.CoverageBasis
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 216, column 46
    function sortValue_64 (PropertyCoverage :  dynamic.Dynamic) : java.lang.Object {
      return PropertyCoverage.LimitsIndicator
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 221, column 46
    function sortValue_65 (PropertyCoverage :  dynamic.Dynamic) : java.lang.Object {
      return PropertyCoverage.Notes
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 250, column 54
    function sortValue_91 (CovTerm :  dynamic.Dynamic) : java.lang.Object {
      return CovTerm.Type
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 255, column 54
    function sortValue_92 (CovTerm :  dynamic.Dynamic) : java.lang.Object {
      return CovTerm.Value
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 260, column 54
    function sortValue_93 (CovTerm :  dynamic.Dynamic) : java.lang.Object {
      return CovTerm.ValueType
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 265, column 54
    function sortValue_94 (CovTerm :  dynamic.Dynamic) : java.lang.Object {
      return CovTerm.AggregationModel
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 270, column 54
    function sortValue_95 (CovTerm :  dynamic.Dynamic) : java.lang.Object {
      return CovTerm.RestrictionModel
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 243, column 49
    function value_111 () : dynamic.Dynamic {
      return SelectedCoverage.CovTerms
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 175, column 41
    function value_90 () : dynamic.Dynamic {
      return LocationBasedRU.Coverages
    }
    
    // 'visible' attribute on Card (id=CovTermsDetail) at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 230, column 81
    function visible_112 () : java.lang.Boolean {
      return SelectedCoverage.CovTerms.length as java.lang.Double > 0
    }
    
    property get SelectedCoverage () : dynamic.Dynamic {
      return getCurrentSelection(1) as dynamic.Dynamic
    }
    
    property set SelectedCoverage ($arg :  dynamic.Dynamic) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyLocation600PanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 28, column 29
    function def_onEnter_6 (def :  pcf.AddressSnapshot600InputSet) : void {
      def.onEnter(LocationBasedRU.Property.Address,null)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 28, column 29
    function def_refreshVariables_7 (def :  pcf.AddressSnapshot600InputSet) : void {
      def.refreshVariables(LocationBasedRU.Property.Address,null)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 85, column 80
    function sortValue_24 (PropertyOwner :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(PropertyOwner.Lienholder)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 89, column 79
    function sortValue_25 (PropertyOwner :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(PropertyOwner.OwnerType)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 113, column 48
    function sortValue_33 (PropertyItem :  dynamic.Dynamic) : java.lang.Object {
      return PropertyItem.Description
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 119, column 48
    function sortValue_34 (PropertyItem :  dynamic.Dynamic) : java.lang.Object {
      return PropertyItem.AppraisedValue
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 143, column 48
    function sortValue_44 (classcode :  dynamic.Dynamic) : java.lang.Object {
      return classcode.Code
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 148, column 48
    function sortValue_45 (classcode :  dynamic.Dynamic) : java.lang.Object {
      return classcode.Description
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 153, column 48
    function sortValue_46 (classcode :  dynamic.Dynamic) : java.lang.Object {
      return classcode.Comments
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 45, column 48
    function sortValue_8 (building :  dynamic.Dynamic) : java.lang.Object {
      return building.BuildingNumber
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 50, column 48
    function sortValue_9 (building :  dynamic.Dynamic) : java.lang.Object {
      return building.Notes
    }
    
    // 'value' attribute on TextInput (id=Description) at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 61, column 40
    function valueRoot_19 () : java.lang.Object {
      return LocationBasedRU.Property.Address
    }
    
    // 'value' attribute on TextInput (id=Number) at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 20, column 40
    function valueRoot_2 () : java.lang.Object {
      return LocationBasedRU
    }
    
    // 'value' attribute on TextInput (id=LocationNumber) at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 25, column 40
    function valueRoot_5 () : java.lang.Object {
      return LocationBasedRU.Property
    }
    
    // 'value' attribute on TextInput (id=Number) at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 20, column 40
    function value_0 () : dynamic.Dynamic {
      return LocationBasedRU.RUNumber
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 38, column 43
    function value_16 () : dynamic.Dynamic {
      return getBuildingAsArray(LocationBasedRU)
    }
    
    // 'value' attribute on TextInput (id=Description) at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 61, column 40
    function value_17 () : dynamic.Dynamic {
      return LocationBasedRU.Property.Address.Description
    }
    
    // 'value' attribute on TextInput (id=Notes) at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 66, column 40
    function value_20 () : dynamic.Dynamic {
      return LocationBasedRU.Property.Notes
    }
    
    // 'value' attribute on TextInput (id=LocationNumber) at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 25, column 40
    function value_3 () : dynamic.Dynamic {
      return LocationBasedRU.Property.LocationNumber
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 80, column 43
    function value_30 () : dynamic.Dynamic {
      return LocationBasedRU.Property.Lienholders
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 107, column 43
    function value_41 () : dynamic.Dynamic {
      return LocationBasedRU.Property.HighValueItems
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 136, column 43
    function value_56 () : dynamic.Dynamic {
      return getClassCodeAsArray(LocationBasedRU)
    }
    
    // 'visible' attribute on InputDivider at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 68, column 93
    function visible_23 () : java.lang.Boolean {
      return LocationBasedRU.Property.Lienholders.length as java.lang.Double > 0
    }
    
    // 'visible' attribute on InputDivider at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 95, column 96
    function visible_32 () : java.lang.Boolean {
      return LocationBasedRU.Property.HighValueItems.length as java.lang.Double > 0
    }
    
    // 'visible' attribute on InputDivider at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 125, column 56
    function visible_43 () : java.lang.Boolean {
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
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends ClaimSnapshotPolicyLocation600PanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Lienholder) at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 85, column 80
    function value_26 () : java.lang.String {
      return util.Snapshot.renderValue(PropertyOwner.Lienholder)
    }
    
    // 'value' attribute on TextCell (id=OwnerType) at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 89, column 79
    function value_28 () : java.lang.String {
      return util.Snapshot.renderValue(PropertyOwner.OwnerType)
    }
    
    property get PropertyOwner () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry3ExpressionsImpl extends ClaimSnapshotPolicyLocation600PanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=ItemDescription) at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 113, column 48
    function valueRoot_37 () : java.lang.Object {
      return PropertyItem
    }
    
    // 'value' attribute on TextCell (id=ItemDescription) at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 113, column 48
    function value_35 () : dynamic.Dynamic {
      return PropertyItem.Description
    }
    
    // 'value' attribute on TextCell (id=ItemValue) at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 119, column 48
    function value_38 () : dynamic.Dynamic {
      return PropertyItem.AppraisedValue
    }
    
    property get PropertyItem () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry4ExpressionsImpl extends ClaimSnapshotPolicyLocation600PanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Code) at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 143, column 48
    function valueRoot_49 () : java.lang.Object {
      return classcode
    }
    
    // 'value' attribute on TextCell (id=Code) at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 143, column 48
    function value_47 () : dynamic.Dynamic {
      return classcode.Code
    }
    
    // 'value' attribute on TextCell (id=Description) at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 148, column 48
    function value_50 () : dynamic.Dynamic {
      return classcode.Description
    }
    
    // 'value' attribute on TextCell (id=Comments) at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 153, column 48
    function value_53 () : dynamic.Dynamic {
      return classcode.Comments
    }
    
    property get classcode () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry5ExpressionsImpl extends ClaimSnapshotPolicyLocation600LDPExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=CoverageType) at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 182, column 46
    function valueRoot_68 () : java.lang.Object {
      return PropertyCoverage
    }
    
    // 'value' attribute on TextCell (id=CoverageType) at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 182, column 46
    function value_66 () : dynamic.Dynamic {
      return PropertyCoverage.Type
    }
    
    // 'value' attribute on TextCell (id=Deductible) at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 188, column 46
    function value_69 () : dynamic.Dynamic {
      return PropertyCoverage.Deductible
    }
    
    // 'value' attribute on TextCell (id=ExposureLimit) at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 194, column 46
    function value_72 () : dynamic.Dynamic {
      return PropertyCoverage.ExposureLimit
    }
    
    // 'value' attribute on TextCell (id=IncidentLimit) at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 200, column 46
    function value_75 () : dynamic.Dynamic {
      return PropertyCoverage.IncidentLimit
    }
    
    // 'value' attribute on TextCell (id=Coinsurance) at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 206, column 46
    function value_78 () : dynamic.Dynamic {
      return PropertyCoverage.Coinsurance
    }
    
    // 'value' attribute on TextCell (id=CoverageBasis) at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 211, column 46
    function value_81 () : dynamic.Dynamic {
      return PropertyCoverage.CoverageBasis
    }
    
    // 'value' attribute on TextCell (id=LimitsIndicator) at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 216, column 46
    function value_84 () : dynamic.Dynamic {
      return PropertyCoverage.LimitsIndicator
    }
    
    // 'value' attribute on TextCell (id=CoverageNotes) at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 221, column 46
    function value_87 () : dynamic.Dynamic {
      return PropertyCoverage.Notes
    }
    
    property get PropertyCoverage () : dynamic.Dynamic {
      return getIteratedValue(2) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry6ExpressionsImpl extends ClaimSnapshotPolicyLocation600LDPExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Type) at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 250, column 54
    function valueRoot_98 () : java.lang.Object {
      return CovTerm
    }
    
    // 'value' attribute on TextCell (id=ValueType) at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 260, column 54
    function value_102 () : dynamic.Dynamic {
      return CovTerm.ValueType
    }
    
    // 'value' attribute on TextCell (id=AggregationModel) at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 265, column 54
    function value_105 () : dynamic.Dynamic {
      return CovTerm.AggregationModel
    }
    
    // 'value' attribute on TextCell (id=RestrictionModel) at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 270, column 54
    function value_108 () : dynamic.Dynamic {
      return CovTerm.RestrictionModel
    }
    
    // 'value' attribute on TextCell (id=Type) at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 250, column 54
    function value_96 () : dynamic.Dynamic {
      return CovTerm.Type
    }
    
    // 'value' attribute on TextCell (id=Value) at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 255, column 54
    function value_99 () : dynamic.Dynamic {
      return CovTerm.Value
    }
    
    property get CovTerm () : dynamic.Dynamic {
      return getIteratedValue(2) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotPolicyLocation600PanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Number) at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 45, column 48
    function valueRoot_12 () : java.lang.Object {
      return building
    }
    
    // 'value' attribute on TextCell (id=Number) at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 45, column 48
    function value_10 () : dynamic.Dynamic {
      return building.BuildingNumber
    }
    
    // 'value' attribute on TextCell (id=Notes) at ClaimSnapshotPolicyLocation600PanelSet.pcf: line 50, column 48
    function value_13 () : dynamic.Dynamic {
      return building.Notes
    }
    
    property get building () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}