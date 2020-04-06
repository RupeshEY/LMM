package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800PanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotPolicyLocation800PanelSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800PanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyLocation800LDPExpressionsImpl extends ListDetailPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 238, column 27
    function def_onEnter_102 (def :  pcf.ClaimSnapshotPolicyCovTermsCV_700) : void {
      def.onEnter(SelectedCoverage)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 238, column 27
    function def_onEnter_104 (def :  pcf.ClaimSnapshotPolicyCovTermsCV_800) : void {
      def.onEnter(SelectedCoverage)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 238, column 27
    function def_onEnter_106 (def :  pcf.ClaimSnapshotPolicyCovTermsCV_default) : void {
      def.onEnter(SelectedCoverage)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 238, column 27
    function def_refreshVariables_103 (def :  pcf.ClaimSnapshotPolicyCovTermsCV_700) : void {
      def.refreshVariables(SelectedCoverage)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 238, column 27
    function def_refreshVariables_105 (def :  pcf.ClaimSnapshotPolicyCovTermsCV_800) : void {
      def.refreshVariables(SelectedCoverage)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 238, column 27
    function def_refreshVariables_107 (def :  pcf.ClaimSnapshotPolicyCovTermsCV_default) : void {
      def.refreshVariables(SelectedCoverage)
    }
    
    // 'mode' attribute on PanelRef at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 238, column 27
    function mode_108 () : java.lang.Object {
      return 800
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 186, column 52
    function sortValue_63 (PropertyCoverage :  dynamic.Dynamic) : java.lang.Object {
      return PropertyCoverage.Type
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 193, column 77
    function sortValue_65 (PropertyCoverage :  dynamic.Dynamic) : java.lang.Object {
      return PropertyCoverage.Currency
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 199, column 52
    function sortValue_66 (PropertyCoverage :  dynamic.Dynamic) : java.lang.Object {
      return PropertyCoverage.Deductible
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 205, column 52
    function sortValue_67 (PropertyCoverage :  dynamic.Dynamic) : java.lang.Object {
      return PropertyCoverage.ExposureLimit
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 211, column 52
    function sortValue_68 (PropertyCoverage :  dynamic.Dynamic) : java.lang.Object {
      return PropertyCoverage.IncidentLimit
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 216, column 52
    function sortValue_69 (PropertyCoverage :  dynamic.Dynamic) : java.lang.Object {
      return PropertyCoverage.Coinsurance
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 221, column 52
    function sortValue_70 (PropertyCoverage :  dynamic.Dynamic) : java.lang.Object {
      return PropertyCoverage.CoverageBasis
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 226, column 52
    function sortValue_71 (PropertyCoverage :  dynamic.Dynamic) : java.lang.Object {
      return PropertyCoverage.LimitsIndicator
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 231, column 52
    function sortValue_72 (PropertyCoverage :  dynamic.Dynamic) : java.lang.Object {
      return PropertyCoverage.Notes
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 179, column 47
    function value_101 () : dynamic.Dynamic {
      return riskUnitSelection.Coverages
    }
    
    // 'visible' attribute on RowIterator at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 193, column 77
    function visible_64 () : java.lang.Boolean {
      return gw.api.util.CurrencyUtil.MultiCurrencyMode
    }
    
    property get SelectedCoverage () : dynamic.Dynamic {
      return getCurrentSelection(2) as dynamic.Dynamic
    }
    
    property set SelectedCoverage ($arg :  dynamic.Dynamic) {
      setCurrentSelection(2, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800PanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyLocation800PanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
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
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800PanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends ListDetailPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Lienholder) at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 121, column 86
    function value_45 () : java.lang.String {
      return util.Snapshot.renderValue(PropertyOwner.Lienholder)
    }
    
    // 'value' attribute on TextCell (id=OwnerType) at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 125, column 85
    function value_47 () : java.lang.String {
      return util.Snapshot.renderValue(PropertyOwner.OwnerType)
    }
    
    property get PropertyOwner () : dynamic.Dynamic {
      return getIteratedValue(2) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800PanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry3ExpressionsImpl extends ClaimSnapshotPolicyLocation800LDPExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 3)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=CoverageType) at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 186, column 52
    function valueRoot_75 () : java.lang.Object {
      return PropertyCoverage
    }
    
    // 'value' attribute on TextCell (id=CoverageType) at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 186, column 52
    function value_73 () : dynamic.Dynamic {
      return PropertyCoverage.Type
    }
    
    // 'value' attribute on TextCell (id=Currency) at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 193, column 77
    function value_77 () : dynamic.Dynamic {
      return PropertyCoverage.Currency
    }
    
    // 'value' attribute on TextCell (id=Deductible) at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 199, column 52
    function value_80 () : dynamic.Dynamic {
      return PropertyCoverage.Deductible
    }
    
    // 'value' attribute on TextCell (id=ExposureLimit) at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 205, column 52
    function value_83 () : dynamic.Dynamic {
      return PropertyCoverage.ExposureLimit
    }
    
    // 'value' attribute on TextCell (id=IncidentLimit) at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 211, column 52
    function value_86 () : dynamic.Dynamic {
      return PropertyCoverage.IncidentLimit
    }
    
    // 'value' attribute on TextCell (id=Coinsurance) at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 216, column 52
    function value_89 () : dynamic.Dynamic {
      return PropertyCoverage.Coinsurance
    }
    
    // 'value' attribute on TextCell (id=CoverageBasis) at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 221, column 52
    function value_92 () : dynamic.Dynamic {
      return PropertyCoverage.CoverageBasis
    }
    
    // 'value' attribute on TextCell (id=LimitsIndicator) at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 226, column 52
    function value_95 () : dynamic.Dynamic {
      return PropertyCoverage.LimitsIndicator
    }
    
    // 'value' attribute on TextCell (id=CoverageNotes) at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 231, column 52
    function value_98 () : dynamic.Dynamic {
      return PropertyCoverage.Notes
    }
    
    // 'visible' attribute on TextCell (id=Currency) at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 193, column 77
    function visible_76 () : java.lang.Boolean {
      return gw.api.util.CurrencyUtil.MultiCurrencyMode
    }
    
    property get PropertyCoverage () : dynamic.Dynamic {
      return getIteratedValue(3) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800PanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ListDetailPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=BuildingNumber) at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 50, column 81
    function valueRoot_19 () : java.lang.Object {
      return riskUnitRow.Building
    }
    
    // 'value' attribute on TextCell (id=RUNumber) at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 34, column 46
    function valueRoot_9 () : java.lang.Object {
      return riskUnitRow
    }
    
    // 'value' attribute on TextCell (id=RUDescription) at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 39, column 46
    function value_10 () : dynamic.Dynamic {
      return riskUnitRow.Description
    }
    
    // 'value' attribute on TextCell (id=RUType) at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 44, column 46
    function value_13 () : dynamic.Dynamic {
      return riskUnitRow.Subtype
    }
    
    // 'value' attribute on TextCell (id=BuildingNumber) at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 50, column 81
    function value_17 () : dynamic.Dynamic {
      return riskUnitRow.Building.BuildingNumber
    }
    
    // 'value' attribute on TextCell (id=Lienholders) at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 55, column 81
    function value_21 () : java.lang.String {
      return util.Snapshot.renderValue(getRULienHolders(riskUnitRow))
    }
    
    // 'value' attribute on TextCell (id=RUNumber) at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 34, column 46
    function value_7 () : dynamic.Dynamic {
      return riskUnitRow.RUNumber
    }
    
    // 'visible' attribute on TextCell (id=BuildingNumber) at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 50, column 81
    function visible_16 () : java.lang.Boolean {
      return Claim.Policy.PolicyType != PolicyType.TC_WORKERSCOMP
    }
    
    property get riskUnitRow () : dynamic.Dynamic {
      return getIteratedValue(2) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800PanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanelExpressionsImpl extends ClaimSnapshotPolicyLocation800PanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator (id=LocationBasedRUIterator) at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 34, column 46
    function sortValue_0 (riskUnitRow :  dynamic.Dynamic) : java.lang.Object {
      return riskUnitRow.RUNumber
    }
    
    // 'value' attribute on RowIterator (id=LocationBasedRUIterator) at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 39, column 46
    function sortValue_1 (riskUnitRow :  dynamic.Dynamic) : java.lang.Object {
      return riskUnitRow.Description
    }
    
    // 'value' attribute on RowIterator (id=LocationBasedRUIterator) at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 44, column 46
    function sortValue_2 (riskUnitRow :  dynamic.Dynamic) : java.lang.Object {
      return riskUnitRow.Subtype
    }
    
    // 'value' attribute on RowIterator (id=LocationBasedRUIterator) at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 50, column 81
    function sortValue_4 (riskUnitRow :  dynamic.Dynamic) : java.lang.Object {
      return riskUnitRow.Building.BuildingNumber
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 121, column 86
    function sortValue_43 (PropertyOwner :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(PropertyOwner.Lienholder)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 125, column 85
    function sortValue_44 (PropertyOwner :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(PropertyOwner.OwnerType)
    }
    
    // 'value' attribute on RowIterator (id=LocationBasedRUIterator) at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 55, column 81
    function sortValue_6 (riskUnitRow :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(getRULienHolders(riskUnitRow))
    }
    
    // 'value' attribute on TextInput (id=Number) at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 72, column 46
    function valueRoot_26 () : java.lang.Object {
      return riskUnitSelection
    }
    
    // 'value' attribute on TextInput (id=BuildingNumber) at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 94, column 48
    function valueRoot_37 () : java.lang.Object {
      return riskUnitSelection.Building
    }
    
    // 'value' attribute on TextInput (id=Code) at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 142, column 50
    function valueRoot_53 () : java.lang.Object {
      return riskUnitSelection.ClassCode
    }
    
    // 'value' attribute on RowIterator (id=LocationBasedRUIterator) at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 28, column 41
    function value_23 () : dynamic.Dynamic {
      return PolicyLocation.LocationBasedRisks
    }
    
    // 'value' attribute on TextInput (id=Number) at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 72, column 46
    function value_24 () : dynamic.Dynamic {
      return riskUnitSelection.RUNumber
    }
    
    // 'value' attribute on TextInput (id=OtherRiskType) at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 78, column 123
    function value_28 () : dynamic.Dynamic {
      return riskUnitSelection.OtherRiskType
    }
    
    // 'value' attribute on TextInput (id=Description) at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 83, column 46
    function value_32 () : dynamic.Dynamic {
      return riskUnitSelection.Description
    }
    
    // 'value' attribute on TextInput (id=BuildingNumber) at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 94, column 48
    function value_35 () : dynamic.Dynamic {
      return riskUnitSelection.Building.BuildingNumber
    }
    
    // 'value' attribute on TextInput (id=Notes) at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 99, column 48
    function value_38 () : dynamic.Dynamic {
      return riskUnitSelection.Building.Notes
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 116, column 49
    function value_49 () : dynamic.Dynamic {
      return riskUnitSelection.Lienholders
    }
    
    // 'value' attribute on TextInput (id=Code) at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 142, column 50
    function value_51 () : dynamic.Dynamic {
      return riskUnitSelection.ClassCode.Code
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 148, column 50
    function value_54 () : dynamic.Dynamic {
      return riskUnitSelection.ClassCode.Description
    }
    
    // 'value' attribute on TextAreaInput (id=Comments) at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 154, column 50
    function value_57 () : dynamic.Dynamic {
      return riskUnitSelection.ClassCode.Comments
    }
    
    // 'visible' attribute on TextInput (id=OtherRiskType) at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 78, column 123
    function visible_27 () : java.lang.Boolean {
      return (riskUnitSelection.Subtype as String).contains(typekey.RiskUnit.TC_LOCATIONMISCRU.DisplayName)
    }
    
    // 'visible' attribute on RowIterator (id=LocationBasedRUIterator) at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 50, column 81
    function visible_3 () : java.lang.Boolean {
      return Claim.Policy.PolicyType != PolicyType.TC_WORKERSCOMP
    }
    
    // 'visible' attribute on InputSet at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 87, column 119
    function visible_41 () : java.lang.Boolean {
      return riskUnitSelection.Building != null and Claim.Policy.PolicyType != PolicyType.TC_WORKERSCOMP
    }
    
    // 'visible' attribute on InputDivider at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 102, column 63
    function visible_42 () : java.lang.Boolean {
      return riskUnitSelection.Building != null
    }
    
    // 'childrenVisible' attribute on InputGroup (id=ClassCodeInputGroup) at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 135, column 80
    function visible_60 () : java.lang.Boolean {
      return riskUnitSelection.ClassCode != null
    }
    
    // 'visible' attribute on InputGroup (id=ClassCodeInputGroup) at ClaimSnapshotPolicyLocation800PanelSet.pcf: line 135, column 80
    function visible_62 () : java.lang.Boolean {
      return Claim.Policy.PolicyType == PolicyType.TC_WORKERSCOMP
    }
    
    property get riskUnitSelection () : dynamic.Dynamic {
      return getCurrentSelection(1) as dynamic.Dynamic
    }
    
    property set riskUnitSelection ($arg :  dynamic.Dynamic) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  
}