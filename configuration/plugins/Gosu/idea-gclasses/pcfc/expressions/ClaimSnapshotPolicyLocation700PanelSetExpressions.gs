package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyLocation700PanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotPolicyLocation700PanelSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyLocation700PanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyLocation700LDPExpressionsImpl extends ListDetailPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 235, column 27
    function def_onEnter_93 (def :  pcf.ClaimSnapshotPolicyCovTermsCV_700) : void {
      def.onEnter(SelectedCoverage)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 235, column 27
    function def_onEnter_95 (def :  pcf.ClaimSnapshotPolicyCovTermsCV_800) : void {
      def.onEnter(SelectedCoverage)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 235, column 27
    function def_onEnter_97 (def :  pcf.ClaimSnapshotPolicyCovTermsCV_default) : void {
      def.onEnter(SelectedCoverage)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 235, column 27
    function def_refreshVariables_94 (def :  pcf.ClaimSnapshotPolicyCovTermsCV_700) : void {
      def.refreshVariables(SelectedCoverage)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 235, column 27
    function def_refreshVariables_96 (def :  pcf.ClaimSnapshotPolicyCovTermsCV_800) : void {
      def.refreshVariables(SelectedCoverage)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 235, column 27
    function def_refreshVariables_98 (def :  pcf.ClaimSnapshotPolicyCovTermsCV_default) : void {
      def.refreshVariables(SelectedCoverage)
    }
    
    // 'mode' attribute on PanelRef at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 235, column 27
    function mode_99 () : java.lang.Object {
      return 700
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 189, column 52
    function sortValue_60 (PropertyCoverage :  dynamic.Dynamic) : java.lang.Object {
      return PropertyCoverage.Type
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 195, column 52
    function sortValue_61 (PropertyCoverage :  dynamic.Dynamic) : java.lang.Object {
      return PropertyCoverage.Deductible
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 201, column 52
    function sortValue_62 (PropertyCoverage :  dynamic.Dynamic) : java.lang.Object {
      return PropertyCoverage.ExposureLimit
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 207, column 52
    function sortValue_63 (PropertyCoverage :  dynamic.Dynamic) : java.lang.Object {
      return PropertyCoverage.IncidentLimit
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 213, column 52
    function sortValue_64 (PropertyCoverage :  dynamic.Dynamic) : java.lang.Object {
      return PropertyCoverage.Coinsurance
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 218, column 52
    function sortValue_65 (PropertyCoverage :  dynamic.Dynamic) : java.lang.Object {
      return PropertyCoverage.CoverageBasis
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 223, column 52
    function sortValue_66 (PropertyCoverage :  dynamic.Dynamic) : java.lang.Object {
      return PropertyCoverage.LimitsIndicator
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 228, column 52
    function sortValue_67 (PropertyCoverage :  dynamic.Dynamic) : java.lang.Object {
      return PropertyCoverage.Notes
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 182, column 47
    function value_92 () : dynamic.Dynamic {
      return riskUnitSelection.Coverages
    }
    
    property get SelectedCoverage () : dynamic.Dynamic {
      return getCurrentSelection(2) as dynamic.Dynamic
    }
    
    property set SelectedCoverage ($arg :  dynamic.Dynamic) {
      setCurrentSelection(2, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyLocation700PanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyLocation700PanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get PolicyLocation () : dynamic.Dynamic {
      return getRequireValue("PolicyLocation", 0) as dynamic.Dynamic
    }
    
    property set PolicyLocation ($arg :  dynamic.Dynamic) {
      setRequireValue("PolicyLocation", 0, $arg)
    }
    
    function getRULienHolders(riskUnit : dynamic.Dynamic) : dynamic.Dynamic {
      var list = new java.util.ArrayList()
      for (lienHolder in (riskUnit.Lienholders)) {
        list.add(lienHolder)
      }
      return list.toArray()
    }
    
        function getClassCodeAsArray(riskUnit : dynamic.Dynamic) : dynamic.Dynamic {
          if(riskUnit.ClassCode != null) {
            return new Object[] {riskUnit.ClassCode}
          } else {
            return new Object[] { }
          }
        }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyLocation700PanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends ListDetailPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Lienholder) at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 117, column 86
    function value_41 () : java.lang.String {
      return util.Snapshot.renderValue(PropertyOwner.Lienholder)
    }
    
    // 'value' attribute on TextCell (id=OwnerType) at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 121, column 85
    function value_43 () : java.lang.String {
      return util.Snapshot.renderValue(PropertyOwner.OwnerType)
    }
    
    property get PropertyOwner () : dynamic.Dynamic {
      return getIteratedValue(2) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyLocation700PanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry3ExpressionsImpl extends ListDetailPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Code) at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 145, column 54
    function valueRoot_51 () : java.lang.Object {
      return classcode
    }
    
    // 'value' attribute on TextCell (id=Code) at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 145, column 54
    function value_49 () : dynamic.Dynamic {
      return classcode.Code
    }
    
    // 'value' attribute on TextCell (id=Description) at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 150, column 54
    function value_52 () : dynamic.Dynamic {
      return classcode.Description
    }
    
    // 'value' attribute on TextCell (id=Comments) at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 155, column 54
    function value_55 () : dynamic.Dynamic {
      return classcode.Comments
    }
    
    property get classcode () : dynamic.Dynamic {
      return getIteratedValue(2) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyLocation700PanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry4ExpressionsImpl extends ClaimSnapshotPolicyLocation700LDPExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 3)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=CoverageType) at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 189, column 52
    function valueRoot_70 () : java.lang.Object {
      return PropertyCoverage
    }
    
    // 'value' attribute on TextCell (id=CoverageType) at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 189, column 52
    function value_68 () : dynamic.Dynamic {
      return PropertyCoverage.Type
    }
    
    // 'value' attribute on TextCell (id=Deductible) at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 195, column 52
    function value_71 () : dynamic.Dynamic {
      return PropertyCoverage.Deductible
    }
    
    // 'value' attribute on TextCell (id=ExposureLimit) at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 201, column 52
    function value_74 () : dynamic.Dynamic {
      return PropertyCoverage.ExposureLimit
    }
    
    // 'value' attribute on TextCell (id=IncidentLimit) at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 207, column 52
    function value_77 () : dynamic.Dynamic {
      return PropertyCoverage.IncidentLimit
    }
    
    // 'value' attribute on TextCell (id=Coinsurance) at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 213, column 52
    function value_80 () : dynamic.Dynamic {
      return PropertyCoverage.Coinsurance
    }
    
    // 'value' attribute on TextCell (id=CoverageBasis) at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 218, column 52
    function value_83 () : dynamic.Dynamic {
      return PropertyCoverage.CoverageBasis
    }
    
    // 'value' attribute on TextCell (id=LimitsIndicator) at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 223, column 52
    function value_86 () : dynamic.Dynamic {
      return PropertyCoverage.LimitsIndicator
    }
    
    // 'value' attribute on TextCell (id=CoverageNotes) at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 228, column 52
    function value_89 () : dynamic.Dynamic {
      return PropertyCoverage.Notes
    }
    
    property get PropertyCoverage () : dynamic.Dynamic {
      return getIteratedValue(3) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyLocation700PanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ListDetailPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=BuildingNumber) at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 48, column 46
    function valueRoot_16 () : java.lang.Object {
      return riskUnitRow.Building
    }
    
    // 'value' attribute on TextCell (id=RUNumber) at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 33, column 46
    function valueRoot_7 () : java.lang.Object {
      return riskUnitRow
    }
    
    // 'value' attribute on TextCell (id=RUType) at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 43, column 46
    function value_11 () : dynamic.Dynamic {
      return riskUnitRow.Subtype
    }
    
    // 'value' attribute on TextCell (id=BuildingNumber) at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 48, column 46
    function value_14 () : dynamic.Dynamic {
      return riskUnitRow.Building.BuildingNumber
    }
    
    // 'value' attribute on TextCell (id=Lienholders) at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 52, column 83
    function value_17 () : java.lang.String {
      return util.Snapshot.renderValue(getRULienHolders(riskUnitRow))
    }
    
    // 'value' attribute on TextCell (id=RUNumber) at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 33, column 46
    function value_5 () : dynamic.Dynamic {
      return riskUnitRow.RUNumber
    }
    
    // 'value' attribute on TextCell (id=RUDescription) at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 38, column 46
    function value_8 () : dynamic.Dynamic {
      return riskUnitRow.Description
    }
    
    property get riskUnitRow () : dynamic.Dynamic {
      return getIteratedValue(2) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyLocation700PanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanelExpressionsImpl extends ClaimSnapshotPolicyLocation700PanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator (id=LocationBasedRUIterator) at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 33, column 46
    function sortValue_0 (riskUnitRow :  dynamic.Dynamic) : java.lang.Object {
      return riskUnitRow.RUNumber
    }
    
    // 'value' attribute on RowIterator (id=LocationBasedRUIterator) at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 38, column 46
    function sortValue_1 (riskUnitRow :  dynamic.Dynamic) : java.lang.Object {
      return riskUnitRow.Description
    }
    
    // 'value' attribute on RowIterator (id=LocationBasedRUIterator) at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 43, column 46
    function sortValue_2 (riskUnitRow :  dynamic.Dynamic) : java.lang.Object {
      return riskUnitRow.Subtype
    }
    
    // 'value' attribute on RowIterator (id=LocationBasedRUIterator) at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 48, column 46
    function sortValue_3 (riskUnitRow :  dynamic.Dynamic) : java.lang.Object {
      return riskUnitRow.Building.BuildingNumber
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 117, column 86
    function sortValue_39 (PropertyOwner :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(PropertyOwner.Lienholder)
    }
    
    // 'value' attribute on RowIterator (id=LocationBasedRUIterator) at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 52, column 83
    function sortValue_4 (riskUnitRow :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(getRULienHolders(riskUnitRow))
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 121, column 85
    function sortValue_40 (PropertyOwner :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(PropertyOwner.OwnerType)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 145, column 54
    function sortValue_46 (classcode :  dynamic.Dynamic) : java.lang.Object {
      return classcode.Code
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 150, column 54
    function sortValue_47 (classcode :  dynamic.Dynamic) : java.lang.Object {
      return classcode.Description
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 155, column 54
    function sortValue_48 (classcode :  dynamic.Dynamic) : java.lang.Object {
      return classcode.Comments
    }
    
    // 'value' attribute on TextInput (id=Number) at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 69, column 46
    function valueRoot_22 () : java.lang.Object {
      return riskUnitSelection
    }
    
    // 'value' attribute on TextInput (id=BuildingNumber) at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 91, column 48
    function valueRoot_33 () : java.lang.Object {
      return riskUnitSelection.Building
    }
    
    // 'value' attribute on RowIterator (id=LocationBasedRUIterator) at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 27, column 41
    function value_19 () : dynamic.Dynamic {
      return PolicyLocation.LocationBasedRisks
    }
    
    // 'value' attribute on TextInput (id=Number) at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 69, column 46
    function value_20 () : dynamic.Dynamic {
      return riskUnitSelection.RUNumber
    }
    
    // 'value' attribute on TextInput (id=OtherRiskType) at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 75, column 123
    function value_24 () : dynamic.Dynamic {
      return riskUnitSelection.OtherRiskType
    }
    
    // 'value' attribute on TextInput (id=Description) at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 80, column 46
    function value_28 () : dynamic.Dynamic {
      return riskUnitSelection.Description
    }
    
    // 'value' attribute on TextInput (id=BuildingNumber) at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 91, column 48
    function value_31 () : dynamic.Dynamic {
      return riskUnitSelection.Building.BuildingNumber
    }
    
    // 'value' attribute on TextInput (id=Notes) at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 96, column 48
    function value_34 () : dynamic.Dynamic {
      return riskUnitSelection.Building.Notes
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 112, column 49
    function value_45 () : dynamic.Dynamic {
      return riskUnitSelection.Lienholders
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 138, column 49
    function value_58 () : dynamic.Dynamic {
      return getClassCodeAsArray(riskUnitSelection)
    }
    
    // 'visible' attribute on TextInput (id=OtherRiskType) at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 75, column 123
    function visible_23 () : java.lang.Boolean {
      return (riskUnitSelection.Subtype as String).contains(typekey.RiskUnit.TC_LOCATIONMISCRU.DisplayName)
    }
    
    // 'visible' attribute on InputSet at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 84, column 62
    function visible_37 () : java.lang.Boolean {
      return riskUnitSelection.Building != null
    }
    
    // 'visible' attribute on ListViewInput at ClaimSnapshotPolicyLocation700PanelSet.pcf: line 130, column 63
    function visible_59 () : java.lang.Boolean {
      return riskUnitSelection.ClassCode != null
    }
    
    property get riskUnitSelection () : dynamic.Dynamic {
      return getCurrentSelection(1) as dynamic.Dynamic
    }
    
    property set riskUnitSelection ($arg :  dynamic.Dynamic) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  
}