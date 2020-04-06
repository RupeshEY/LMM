package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotPolicyGeneral700DetailPanelSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyGeneral700DetailPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 95, column 48
    function sortValue_31 (ClaimContactRole :  dynamic.Dynamic) : java.lang.Object {
      return ClaimContactRole.ClaimContact.Contact.DisplayName
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 100, column 48
    function sortValue_32 (ClaimContactRole :  dynamic.Dynamic) : java.lang.Object {
      return ClaimContactRole.CoveredPartyType
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 124, column 48
    function sortValue_40 (ClaimContactRole :  dynamic.Dynamic) : java.lang.Object {
      return ClaimContactRole.ClaimContact.Contact.DisplayName
    }
    
    // 'value' attribute on TextInput (id=PolicyNumber) at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 22, column 40
    function valueRoot_2 () : java.lang.Object {
      return asPolicy()
    }
    
    // 'value' attribute on TextInput (id=Insured) at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 62, column 40
    function valueRoot_24 () : java.lang.Object {
      return asPolicy().Insured
    }
    
    // 'value' attribute on TextAreaInput (id=Address) at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 69, column 40
    function valueRoot_27 () : java.lang.Object {
      return asPolicy().Insured.PrimaryAddress
    }
    
    // 'value' attribute on TextInput (id=Agent) at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 136, column 40
    function valueRoot_47 () : java.lang.Object {
      return asPolicy().Agent
    }
    
    // 'value' attribute on TextInput (id=Underwriter) at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 149, column 40
    function valueRoot_53 () : java.lang.Object {
      return asPolicy().Underwriter
    }
    
    // 'value' attribute on TextInput (id=PolicyNumber) at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 22, column 40
    function value_0 () : dynamic.Dynamic {
      return asPolicy().PolicyNumber
    }
    
    // 'value' attribute on TextInput (id=CancellationDate) at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 39, column 75
    function value_10 () : java.lang.String {
      return util.Snapshot.renderValue(asPolicy().CancellationDate)
    }
    
    // 'value' attribute on TextInput (id=OrigEffectiveDate) at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 43, column 76
    function value_12 () : java.lang.String {
      return util.Snapshot.renderValue(asPolicy().OrigEffectiveDate)
    }
    
    // 'value' attribute on TextInput (id=Status) at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 48, column 40
    function value_14 () : dynamic.Dynamic {
      return asPolicy().Status
    }
    
    // 'value' attribute on TextInput (id=Currency) at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 54, column 69
    function value_18 () : dynamic.Dynamic {
      return asPolicy().Currency
    }
    
    // 'value' attribute on TextInput (id=Insured) at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 62, column 40
    function value_22 () : dynamic.Dynamic {
      return asPolicy().Insured.DisplayName
    }
    
    // 'value' attribute on TextAreaInput (id=Address) at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 69, column 40
    function value_25 () : dynamic.Dynamic {
      return asPolicy().Insured.PrimaryAddress.DisplayName
    }
    
    // 'value' attribute on TextInput (id=Account) at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 74, column 40
    function value_28 () : dynamic.Dynamic {
      return asPolicy().AccountNumber
    }
    
    // 'value' attribute on TextInput (id=PolicyType) at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 27, column 40
    function value_3 () : dynamic.Dynamic {
      return asPolicy().PolicyType
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 89, column 46
    function value_39 () : java.lang.Object[] {
      return util.Snapshot.getClaimContactRolesByRole(SnapshotParam, ContactRole.TC_COVEREDPARTY.Code)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 118, column 46
    function value_44 () : java.lang.Object[] {
      return util.Snapshot.getClaimContactRolesByRole(SnapshotParam, ContactRole.TC_EXCLUDEDPARTY.Code)
    }
    
    // 'value' attribute on TextInput (id=Agent) at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 136, column 40
    function value_45 () : dynamic.Dynamic {
      return asPolicy().Agent.DisplayName
    }
    
    // 'value' attribute on TextInput (id=ProducerCode) at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 141, column 40
    function value_48 () : dynamic.Dynamic {
      return asPolicy().ProducerCode
    }
    
    // 'value' attribute on TextInput (id=Underwriter) at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 149, column 40
    function value_51 () : dynamic.Dynamic {
      return asPolicy().Underwriter.DisplayName
    }
    
    // 'value' attribute on TextInput (id=UnderwritingCo) at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 154, column 40
    function value_54 () : dynamic.Dynamic {
      return asPolicy().UnderwritingCo
    }
    
    // 'value' attribute on TextInput (id=UnderwritingGroup) at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 159, column 40
    function value_57 () : dynamic.Dynamic {
      return asPolicy().UnderwritingGroup
    }
    
    // 'value' attribute on TextInput (id=EffectiveDate) at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 31, column 72
    function value_6 () : java.lang.String {
      return util.Snapshot.renderValue(asPolicy().EffectiveDate)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Verified) at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 169, column 40
    function value_60 () : dynamic.Dynamic {
      return asPolicy().Verified
    }
    
    // 'value' attribute on BooleanRadioInput (id=ForeignCoverage) at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 176, column 40
    function value_63 () : dynamic.Dynamic {
      return asPolicy().ForeignCoverage
    }
    
    // 'value' attribute on TextInput (id=FinancialInterests) at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 181, column 40
    function value_66 () : dynamic.Dynamic {
      return asPolicy().FinancialInterests
    }
    
    // 'value' attribute on TextInput (id=Notes) at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 186, column 40
    function value_69 () : dynamic.Dynamic {
      return asPolicy().Notes
    }
    
    // 'value' attribute on TextInput (id=InsuredSICCode) at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 196, column 42
    function value_72 () : dynamic.Dynamic {
      return asPolicy().InsuredSICCode
    }
    
    // 'value' attribute on TextInput (id=PolicyRatingPlan) at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 201, column 42
    function value_75 () : dynamic.Dynamic {
      return asPolicy().PolicyRatingPlan
    }
    
    // 'value' attribute on TextInput (id=WCStates) at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 206, column 42
    function value_78 () : dynamic.Dynamic {
      return asPolicy().WCStates
    }
    
    // 'value' attribute on TextInput (id=ExpirationDate) at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 35, column 73
    function value_8 () : java.lang.String {
      return util.Snapshot.renderValue(asPolicy().ExpirationDate)
    }
    
    // 'value' attribute on TextInput (id=WCOtherStates) at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 211, column 42
    function value_81 () : dynamic.Dynamic {
      return asPolicy().WCOtherStates
    }
    
    // 'visible' attribute on TextInput (id=Currency) at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 54, column 69
    function visible_17 () : java.lang.Boolean {
      return gw.api.util.CurrencyUtil.isMultiCurrencyMode()
    }
    
    // 'visible' attribute on InputSet at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 188, column 85
    function visible_84 () : java.lang.Boolean {
      return "Workers' Comp" == (SnapshotParam).LossType as String
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get SnapshotParam () : dynamic.Dynamic {
      return getRequireValue("SnapshotParam", 0) as dynamic.Dynamic
    }
    
    property set SnapshotParam ($arg :  dynamic.Dynamic) {
      setRequireValue("SnapshotParam", 0, $arg)
    }
    
    function asPolicy() : dynamic.Dynamic {
            return (SnapshotParam).Policy;
          }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyGeneral700LDPExpressionsImpl extends ClaimSnapshotPolicyGeneral700DetailPanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 262, column 21
    function def_onEnter_106 (def :  pcf.ClaimSnapshotPolicyCovTermsCV_700) : void {
      def.onEnter(SelectedCoverage)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 262, column 21
    function def_onEnter_108 (def :  pcf.ClaimSnapshotPolicyCovTermsCV_800) : void {
      def.onEnter(SelectedCoverage)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 262, column 21
    function def_onEnter_110 (def :  pcf.ClaimSnapshotPolicyCovTermsCV_default) : void {
      def.onEnter(SelectedCoverage)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 262, column 21
    function def_refreshVariables_107 (def :  pcf.ClaimSnapshotPolicyCovTermsCV_700) : void {
      def.refreshVariables(SelectedCoverage)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 262, column 21
    function def_refreshVariables_109 (def :  pcf.ClaimSnapshotPolicyCovTermsCV_800) : void {
      def.refreshVariables(SelectedCoverage)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 262, column 21
    function def_refreshVariables_111 (def :  pcf.ClaimSnapshotPolicyCovTermsCV_default) : void {
      def.refreshVariables(SelectedCoverage)
    }
    
    // 'mode' attribute on PanelRef at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 262, column 21
    function mode_112 () : java.lang.Object {
      return 700
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 235, column 46
    function sortValue_85 (Coverage :  dynamic.Dynamic) : java.lang.Object {
      return Coverage.Type
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 240, column 46
    function sortValue_86 (Coverage :  dynamic.Dynamic) : java.lang.Object {
      return Coverage.Deductible
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 245, column 46
    function sortValue_87 (Coverage :  dynamic.Dynamic) : java.lang.Object {
      return Coverage.ExposureLimit
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 250, column 46
    function sortValue_88 (Coverage :  dynamic.Dynamic) : java.lang.Object {
      return Coverage.IncidentLimit
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 255, column 46
    function sortValue_89 (Coverage :  dynamic.Dynamic) : java.lang.Object {
      return Coverage.Notes
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 229, column 41
    function value_105 () : dynamic.Dynamic {
      return asPolicy().Coverages
    }
    
    property get SelectedCoverage () : dynamic.Dynamic {
      return getCurrentSelection(1) as dynamic.Dynamic
    }
    
    property set SelectedCoverage ($arg :  dynamic.Dynamic) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends ClaimSnapshotPolicyGeneral700DetailPanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Name) at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 124, column 48
    function valueRoot_43 () : java.lang.Object {
      return ClaimContactRole.ClaimContact.Contact
    }
    
    // 'value' attribute on TextCell (id=Name) at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 124, column 48
    function value_41 () : dynamic.Dynamic {
      return ClaimContactRole.ClaimContact.Contact.DisplayName
    }
    
    property get ClaimContactRole () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry3ExpressionsImpl extends ClaimSnapshotPolicyGeneral700LDPExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Type) at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 235, column 46
    function valueRoot_92 () : java.lang.Object {
      return Coverage
    }
    
    // 'value' attribute on TextCell (id=Notes) at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 255, column 46
    function value_102 () : dynamic.Dynamic {
      return Coverage.Notes
    }
    
    // 'value' attribute on TextCell (id=Type) at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 235, column 46
    function value_90 () : dynamic.Dynamic {
      return Coverage.Type
    }
    
    // 'value' attribute on TextCell (id=Deductible) at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 240, column 46
    function value_93 () : dynamic.Dynamic {
      return Coverage.Deductible
    }
    
    // 'value' attribute on TextCell (id=ExposureLimit) at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 245, column 46
    function value_96 () : dynamic.Dynamic {
      return Coverage.ExposureLimit
    }
    
    // 'value' attribute on TextCell (id=IncidentLimit) at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 250, column 46
    function value_99 () : dynamic.Dynamic {
      return Coverage.IncidentLimit
    }
    
    property get Coverage () : dynamic.Dynamic {
      return getIteratedValue(2) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotPolicyGeneral700DetailPanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Name) at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 95, column 48
    function valueRoot_35 () : java.lang.Object {
      return ClaimContactRole.ClaimContact.Contact
    }
    
    // 'value' attribute on TextCell (id=Type) at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 100, column 48
    function valueRoot_38 () : java.lang.Object {
      return ClaimContactRole
    }
    
    // 'value' attribute on TextCell (id=Name) at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 95, column 48
    function value_33 () : dynamic.Dynamic {
      return ClaimContactRole.ClaimContact.Contact.DisplayName
    }
    
    // 'value' attribute on TextCell (id=Type) at ClaimSnapshotPolicyGeneral700DetailPanelSet.pcf: line 100, column 48
    function value_36 () : dynamic.Dynamic {
      return ClaimContactRole.CoveredPartyType
    }
    
    property get ClaimContactRole () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}