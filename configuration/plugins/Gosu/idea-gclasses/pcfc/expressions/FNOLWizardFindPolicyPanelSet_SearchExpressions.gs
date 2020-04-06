package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Search.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FNOLWizardFindPolicyPanelSet_SearchExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Search.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FNOLWizardFindPolicyPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on DateInput (id=Claim_LossDate) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 205, column 43
    function defaultSetter_105 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimLossDate.LossDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateInput (id=Claim_lossTime) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 211, column 43
    function defaultSetter_109 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimLossDate.LossTime = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on RangeRadioInput (id=ClaimMode) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 223, column 49
    function defaultSetter_115 (__VALUE_TO_SET :  java.lang.Object) : void {
      Wizard.ClaimMode = (__VALUE_TO_SET as gw.api.claim.NewClaimMode)
    }
    
    // 'value' attribute on TextInput (id=ClaimNumber2) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 195, column 58
    function defaultSetter_98 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.ClaimNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'initialValue' attribute on Variable at FNOLWizardFindPolicyPanelSet.Search.pcf: line 17, column 42
    function initialValue_0 () : gw.pcf.FNOLFindPolicyUtils {
      Wizard.FindPolicyUtils = new gw.pcf.FNOLFindPolicyUtils(Wizard, Claim); return Wizard.FindPolicyUtils
    }
    
    // 'initialValue' attribute on Variable at FNOLWizardFindPolicyPanelSet.Search.pcf: line 21, column 47
    function initialValue_1 () : gw.api.claim.ClaimLossDateProxy {
      return new gw.api.claim.ClaimLossDateProxy(Claim)
    }
    
    // 'onChange' attribute on PostOnChange at FNOLWizardFindPolicyPanelSet.Search.pcf: line 225, column 68
    function onChange_111 () : void {
      FindPolicyUtils.onClaimModeSelectionMade()
    }
    
    // 'showConfirmMessage' attribute on DateInput (id=Claim_LossDate) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 205, column 43
    function showConfirmMessage_103 () : java.lang.Boolean {
      return not Wizard.AtHighWaterMark
    }
    
    // 'showConfirmMessage' attribute on RangeRadioInput (id=ClaimMode) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 223, column 49
    function showConfirmMessage_113 () : java.lang.Boolean {
      return !Wizard.AtHighWaterMark
    }
    
    // 'sortBy' attribute on IteratorSort at FNOLWizardFindPolicyPanelSet.Search.pcf: line 246, column 32
    function sortBy_121 (otherClaim :  entity.PriorClaimView) : java.lang.Object {
      return otherClaim.LossDate
    }
    
    // 'value' attribute on RowIterator at FNOLWizardFindPolicyPanelSet.Search.pcf: line 253, column 51
    function sortValue_122 (otherClaim :  entity.PriorClaimView) : java.lang.Object {
      return otherClaim.State
    }
    
    // 'value' attribute on RowIterator at FNOLWizardFindPolicyPanelSet.Search.pcf: line 258, column 51
    function sortValue_123 (otherClaim :  entity.PriorClaimView) : java.lang.Object {
      return otherClaim.ClaimNumber
    }
    
    // 'value' attribute on RowIterator at FNOLWizardFindPolicyPanelSet.Search.pcf: line 263, column 48
    function sortValue_124 (otherClaim :  entity.PriorClaimView) : java.lang.Object {
      return otherClaim.LossDate
    }
    
    // 'value' attribute on RowIterator at FNOLWizardFindPolicyPanelSet.Search.pcf: line 268, column 32
    function sortValue_125 (otherClaim :  entity.PriorClaimView) : java.lang.Object {
      return otherClaim.Description
    }
    
    // 'validationExpression' attribute on DateInput (id=Claim_LossDate) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 205, column 43
    function validationExpression_100 () : java.lang.Object {
      return Claim.validateLossDate()
    }
    
    // 'validationExpression' attribute on TextInput (id=ClaimNumber2) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 195, column 58
    function validationExpression_92 () : java.lang.Object {
      return !Claim.DuplicateClaimNumber ? null : DisplayKey.get("Java.NewClaimWizard.Error.ClaimNumberNotUnique", Claim.ClaimNumber)
    }
    
    // 'valueRange' attribute on RangeRadioInput (id=ClaimMode) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 223, column 49
    function valueRange_117 () : java.lang.Object {
      return FindPolicyUtils.ClaimModeArray
    }
    
    // 'value' attribute on DateInput (id=Claim_LossDate) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 205, column 43
    function valueRoot_106 () : java.lang.Object {
      return claimLossDate
    }
    
    // 'value' attribute on RangeRadioInput (id=ClaimMode) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 223, column 49
    function valueRoot_116 () : java.lang.Object {
      return Wizard
    }
    
    // 'value' attribute on TextInput (id=ClaimNumber2) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 195, column 58
    function valueRoot_99 () : java.lang.Object {
      return Claim
    }
    
    // 'value' attribute on DateInput (id=Claim_LossDate) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 205, column 43
    function value_101 () : java.util.Date {
      return claimLossDate.LossDate
    }
    
    // 'value' attribute on DateInput (id=Claim_lossTime) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 211, column 43
    function value_107 () : java.util.Date {
      return claimLossDate.LossTime
    }
    
    // 'value' attribute on RangeRadioInput (id=ClaimMode) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 223, column 49
    function value_112 () : gw.api.claim.NewClaimMode {
      return Wizard.ClaimMode
    }
    
    // 'value' attribute on RowIterator at FNOLWizardFindPolicyPanelSet.Search.pcf: line 242, column 89
    function value_148 () : gw.api.database.IQueryBeanResult<entity.PriorClaimView> {
      return Claim.findPriorClaimsByPolicyNumber(FindPolicyUtils.SelectedPolicySummary.PolicyNumber, {}) as gw.api.database.IQueryBeanResult<PriorClaimView>
    }
    
    // 'value' attribute on TextInput (id=ClaimNumber2) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 195, column 58
    function value_94 () : java.lang.String {
      return Claim.ClaimNumber
    }
    
    // 'valueRange' attribute on RangeRadioInput (id=ClaimMode) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 223, column 49
    function verifyValueRangeIsAllowedType_118 ($$arg :  gw.api.claim.NewClaimMode[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeRadioInput (id=ClaimMode) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 223, column 49
    function verifyValueRangeIsAllowedType_118 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeRadioInput (id=ClaimMode) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 223, column 49
    function verifyValueRange_119 () : void {
      var __valueRangeArg = FindPolicyUtils.ClaimModeArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_118(__valueRangeArg)
    }
    
    // 'visible' attribute on Label at FNOLWizardFindPolicyPanelSet.Search.pcf: line 231, column 62
    function visible_120 () : java.lang.Boolean {
      return FindPolicyUtils.isClaimHistoryVisible()
    }
    
    // 'visible' attribute on DetailViewPanel at FNOLWizardFindPolicyPanelSet.Search.pcf: line 184, column 63
    function visible_150 () : java.lang.Boolean {
      return FindPolicyUtils.SelectedPolicySummary != null
    }
    
    // 'visible' attribute on TextInput (id=ClaimNumber2) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 195, column 58
    function visible_93 () : java.lang.Boolean {
      return !Claim.ClaimNumberGenerationEnabled
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get FindPolicyUtils () : gw.pcf.FNOLFindPolicyUtils {
      return getVariableValue("FindPolicyUtils", 0) as gw.pcf.FNOLFindPolicyUtils
    }
    
    property set FindPolicyUtils ($arg :  gw.pcf.FNOLFindPolicyUtils) {
      setVariableValue("FindPolicyUtils", 0, $arg)
    }
    
    property get Wizard () : gw.api.claim.NewClaimWizardInfo {
      return getRequireValue("Wizard", 0) as gw.api.claim.NewClaimWizardInfo
    }
    
    property set Wizard ($arg :  gw.api.claim.NewClaimWizardInfo) {
      setRequireValue("Wizard", 0, $arg)
    }
    
    property get claimLossDate () : gw.api.claim.ClaimLossDateProxy {
      return getVariableValue("claimLossDate", 0) as gw.api.claim.ClaimLossDateProxy
    }
    
    property set claimLossDate ($arg :  gw.api.claim.ClaimLossDateProxy) {
      setVariableValue("claimLossDate", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Search.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends FNOLWizardFindPolicyPanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=otherID) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 258, column 51
    function action_130 () : void {
      FindPolicyUtils.gotoClaimFile(CurrentLocation as pcf.api.Wizard, otherClaim.Claim)
    }
    
    // 'action' attribute on TextCell (id=otherClaimant) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 279, column 63
    function action_143 () : void {
      UserContactDetailPopup.push(otherClaim.Claim.AssignedUser)
    }
    
    // 'action' attribute on TextCell (id=otherClaimant) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 279, column 63
    function action_dest_144 () : pcf.api.Destination {
      return pcf.UserContactDetailPopup.createDestination(otherClaim.Claim.AssignedUser)
    }
    
    // 'highlighted' attribute on Row at FNOLWizardFindPolicyPanelSet.Search.pcf: line 248, column 61
    function highlighted_147 () : java.lang.Boolean {
      return otherClaim.State != TC_CLOSED
    }
    
    // 'value' attribute on TypeKeyCell (id=otherStatus) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 253, column 51
    function valueRoot_128 () : java.lang.Object {
      return otherClaim
    }
    
    // 'value' attribute on TypeKeyCell (id=otherStatus) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 253, column 51
    function value_126 () : typekey.ClaimState {
      return otherClaim.State
    }
    
    // 'value' attribute on TextCell (id=otherID) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 258, column 51
    function value_129 () : java.lang.String {
      return otherClaim.ClaimNumber
    }
    
    // 'value' attribute on DateCell (id=otherLossDate) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 263, column 48
    function value_133 () : java.util.Date {
      return otherClaim.LossDate
    }
    
    // 'value' attribute on TextCell (id=otherInsured) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 268, column 32
    function value_136 () : java.lang.String {
      return otherClaim.Description
    }
    
    // 'value' attribute on DateCell (id=otherPolicyID) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 273, column 52
    function value_139 () : java.util.Date {
      return otherClaim.ReportedDate
    }
    
    // 'value' attribute on TextCell (id=otherClaimant) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 279, column 63
    function value_142 () : java.lang.String {
      return otherClaim.AssignedUserDisplayName
    }
    
    property get otherClaim () : entity.PriorClaimView {
      return getIteratedValue(1) as entity.PriorClaimView
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Search.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends SearchPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on Link (id=selectButton) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 120, column 76
    function action_49 () : void {
      FindPolicyUtils.selectPolicyRow(PolicySummary, CurrentLocation as pcf.api.Wizard)
    }
    
    // 'action' attribute on Link (id=unselectButton) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 129, column 76
    function action_52 () : void {
      FindPolicyUtils.resetVariables(); Wizard.resetSteps(); gw.api.util.SearchUtil.search();
    }
    
    // 'action' attribute on TextCell (id=PolicyNumber) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 135, column 53
    function action_55 () : void {
      PolicySummaryInfoPopup.push(FindPolicyUtils.SelectedPolicySummary == null ? PolicySummary : FindPolicyUtils.SelectedPolicySummary)
    }
    
    // 'action' attribute on TextCell (id=PolicyNumber) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 135, column 53
    function action_dest_56 () : pcf.api.Destination {
      return pcf.PolicySummaryInfoPopup.createDestination(FindPolicyUtils.SelectedPolicySummary == null ? PolicySummary : FindPolicyUtils.SelectedPolicySummary)
    }
    
    // 'highlighted' attribute on Row at FNOLWizardFindPolicyPanelSet.Search.pcf: line 108, column 103
    function highlighted_87 () : java.lang.Boolean {
      return PolicySummary.isSamePolicySummary( FindPolicyUtils.SelectedPolicySummary)
    }
    
    // 'showConfirmMessage' attribute on Link (id=selectButton) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 120, column 76
    function showConfirmMessage_50 () : java.lang.Boolean {
      return Claim.Policy != null and Claim.Policy.PolicyType != PolicySummary.PolicyType
    }
    
    // 'showConfirmMessage' attribute on Link (id=unselectButton) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 129, column 76
    function showConfirmMessage_53 () : java.lang.Boolean {
      return Claim.Policy != null
    }
    
    // 'value' attribute on TextCell (id=PolicyNumber) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 135, column 53
    function valueRoot_58 () : java.lang.Object {
      return PolicySummary
    }
    
    // 'value' attribute on TextCell (id=PolicyNumber) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 135, column 53
    function value_54 () : java.lang.String {
      return PolicySummary.PolicyNumber
    }
    
    // 'value' attribute on TextCell (id=Insured) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 139, column 52
    function value_59 () : java.lang.String {
      return PolicySummary.InsuredName
    }
    
    // 'value' attribute on TextCell (id=Address) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 144, column 55
    function value_62 () : java.lang.String {
      return PolicySummary.DisplayAddress
    }
    
    // 'value' attribute on TextCell (id=City) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 149, column 52
    function value_65 () : java.lang.String {
      return PolicySummary.DisplayCity
    }
    
    // 'value' attribute on TypeKeyCell (id=State) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 154, column 44
    function value_68 () : typekey.State {
      return PolicySummary.State
    }
    
    // 'value' attribute on TextCell (id=Zip) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 158, column 51
    function value_71 () : java.lang.String {
      return PolicySummary.PostalCode
    }
    
    // 'value' attribute on DateCell (id=Effective) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 162, column 54
    function value_74 () : java.util.Date {
      return PolicySummary.EffectiveDate
    }
    
    // 'value' attribute on DateCell (id=Expiration) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 166, column 55
    function value_77 () : java.util.Date {
      return PolicySummary.ExpirationDate
    }
    
    // 'value' attribute on TypeKeyCell (id=Type) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 171, column 49
    function value_80 () : typekey.PolicyType {
      return PolicySummary.PolicyType
    }
    
    // 'value' attribute on TypeKeyCell (id=Status) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 177, column 73
    function value_84 () : typekey.PolicyStatus {
      return PolicySummary.Status
    }
    
    // 'visible' attribute on Link (id=selectButton) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 120, column 76
    function visible_48 () : java.lang.Boolean {
      return FindPolicyUtils.SelectedPolicySummary == null
    }
    
    // 'visible' attribute on Link (id=unselectButton) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 129, column 76
    function visible_51 () : java.lang.Boolean {
      return FindPolicyUtils.SelectedPolicySummary != null
    }
    
    // 'visible' attribute on TypeKeyCell (id=Status) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 177, column 73
    function visible_83 () : java.lang.Boolean {
      return policySearchCriteria.IncludeArchived == true
    }
    
    property get PolicySummary () : entity.PolicySummary {
      return getIteratedValue(2) as entity.PolicySummary
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Search.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SearchPanelExpressionsImpl extends FNOLWizardFindPolicyPanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on Link (id=Search) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 84, column 33
    function action_34 () : void {
      FindPolicyUtils.resetVariables(); gw.api.util.SearchUtil.search(); if (PolicySummaryList.getCount() == 1) {FindPolicyUtils.selectPolicyRow(PolicySummaryList.getFirstResult(), CurrentLocation as pcf.api.Wizard);}
    }
    
    // 'action' attribute on Link (id=Reset) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 92, column 33
    function action_36 () : void {
      gw.api.util.SearchUtil.reset(); FindPolicyUtils.resetVariables(); FindPolicyUtils.PolicySearchCriteria.resetPolicySearchCriteria(); 
    }
    
    // 'available' attribute on Link (id=Search) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 84, column 33
    function available_33 () : java.lang.Boolean {
      return FindPolicyUtils.SelectedPolicySummary == null
    }
    
    // 'def' attribute on InputSetRef at FNOLWizardFindPolicyPanelSet.Search.pcf: line 46, column 60
    function def_onEnter_11 (def :  pcf.GlobalContactNameInputSet_Japan) : void {
      def.onEnter(new gw.api.name.SearchNameOwner(policySearchCriteria))
    }
    
    // 'def' attribute on InputSetRef at FNOLWizardFindPolicyPanelSet.Search.pcf: line 46, column 60
    function def_onEnter_13 (def :  pcf.GlobalContactNameInputSet_default) : void {
      def.onEnter(new gw.api.name.SearchNameOwner(policySearchCriteria))
    }
    
    // 'def' attribute on InputSetRef at FNOLWizardFindPolicyPanelSet.Search.pcf: line 69, column 200
    function def_onEnter_30 (def :  pcf.FNOLWizard_PolicySearchInputSet_default) : void {
      def.onEnter(Claim, FindPolicyUtils.PolicySearchCriteria)
    }
    
    // 'def' attribute on InputSetRef at FNOLWizardFindPolicyPanelSet.Search.pcf: line 43, column 60
    function def_onEnter_6 (def :  pcf.GlobalPersonNameInputSet_Japan) : void {
      def.onEnter(new gw.api.name.SearchNameOwner(policySearchCriteria))
    }
    
    // 'def' attribute on InputSetRef at FNOLWizardFindPolicyPanelSet.Search.pcf: line 43, column 60
    function def_onEnter_8 (def :  pcf.GlobalPersonNameInputSet_default) : void {
      def.onEnter(new gw.api.name.SearchNameOwner(policySearchCriteria))
    }
    
    // 'def' attribute on InputSetRef at FNOLWizardFindPolicyPanelSet.Search.pcf: line 46, column 60
    function def_refreshVariables_12 (def :  pcf.GlobalContactNameInputSet_Japan) : void {
      def.refreshVariables(new gw.api.name.SearchNameOwner(policySearchCriteria))
    }
    
    // 'def' attribute on InputSetRef at FNOLWizardFindPolicyPanelSet.Search.pcf: line 46, column 60
    function def_refreshVariables_14 (def :  pcf.GlobalContactNameInputSet_default) : void {
      def.refreshVariables(new gw.api.name.SearchNameOwner(policySearchCriteria))
    }
    
    // 'def' attribute on InputSetRef at FNOLWizardFindPolicyPanelSet.Search.pcf: line 69, column 200
    function def_refreshVariables_31 (def :  pcf.FNOLWizard_PolicySearchInputSet_default) : void {
      def.refreshVariables(Claim, FindPolicyUtils.PolicySearchCriteria)
    }
    
    // 'def' attribute on InputSetRef at FNOLWizardFindPolicyPanelSet.Search.pcf: line 43, column 60
    function def_refreshVariables_7 (def :  pcf.GlobalPersonNameInputSet_Japan) : void {
      def.refreshVariables(new gw.api.name.SearchNameOwner(policySearchCriteria))
    }
    
    // 'def' attribute on InputSetRef at FNOLWizardFindPolicyPanelSet.Search.pcf: line 43, column 60
    function def_refreshVariables_9 (def :  pcf.GlobalPersonNameInputSet_default) : void {
      def.refreshVariables(new gw.api.name.SearchNameOwner(policySearchCriteria))
    }
    
    // 'value' attribute on TypeKeyInput (id=PolicyType) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 52, column 45
    function defaultSetter_18 (__VALUE_TO_SET :  java.lang.Object) : void {
      policySearchCriteria.PolicyType = (__VALUE_TO_SET as typekey.PolicyType)
    }
    
    // 'value' attribute on DateInput (id=date) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 58, column 52
    function defaultSetter_22 (__VALUE_TO_SET :  java.lang.Object) : void {
      policySearchCriteria.LossDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on CheckBoxInput (id=IncludeArchivedPolicies) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 64, column 92
    function defaultSetter_28 (__VALUE_TO_SET :  java.lang.Object) : void {
      policySearchCriteria.IncludeArchived = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextInput (id=policyNumber) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 40, column 56
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      policySearchCriteria.PolicyNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'mode' attribute on InputSetRef at FNOLWizardFindPolicyPanelSet.Search.pcf: line 43, column 60
    function mode_10 () : java.lang.Object {
      return gw.api.name.NameLocaleSettings.PCFMode
    }
    
    // 'mode' attribute on InputSetRef at FNOLWizardFindPolicyPanelSet.Search.pcf: line 69, column 200
    function mode_32 () : java.lang.Object {
      return FindPolicyUtils.PolicySearchCriteria.InsuredAddress.Country != null ? FindPolicyUtils.PolicySearchCriteria.InsuredAddress.Country : gw.api.admin.BaseAdminUtil.getDefaultCountry()
    }
    
    // 'searchCriteria' attribute on SearchPanel at FNOLWizardFindPolicyPanelSet.Search.pcf: line 31, column 81
    function searchCriteria_90 () : entity.PolicySearchCriteria {
      return FindPolicyUtils.PolicySearchCriteria
    }
    
    // 'searchOnEnter' attribute on SearchPanel at FNOLWizardFindPolicyPanelSet.Search.pcf: line 31, column 81
    function searchOnEnter_91 () : java.lang.Boolean {
      return Claim.LossType != null
    }
    
    // 'search' attribute on SearchPanel at FNOLWizardFindPolicyPanelSet.Search.pcf: line 31, column 81
    function search_89 () : java.lang.Object {
      return FindPolicyUtils.performSearch()
    }
    
    // 'value' attribute on RowIterator at FNOLWizardFindPolicyPanelSet.Search.pcf: line 135, column 53
    function sortValue_37 (PolicySummary :  entity.PolicySummary) : java.lang.Object {
      return PolicySummary.PolicyNumber
    }
    
    // 'value' attribute on RowIterator at FNOLWizardFindPolicyPanelSet.Search.pcf: line 139, column 52
    function sortValue_38 (PolicySummary :  entity.PolicySummary) : java.lang.Object {
      return PolicySummary.InsuredName
    }
    
    // 'sortBy' attribute on RowIterator at FNOLWizardFindPolicyPanelSet.Search.pcf: line 144, column 55
    function sortValue_39 (PolicySummary :  entity.PolicySummary) : java.lang.Object {
      return PolicySummary.AddressLine1
    }
    
    // 'sortBy' attribute on RowIterator at FNOLWizardFindPolicyPanelSet.Search.pcf: line 149, column 52
    function sortValue_40 (PolicySummary :  entity.PolicySummary) : java.lang.Object {
      return PolicySummary.City
    }
    
    // 'value' attribute on RowIterator at FNOLWizardFindPolicyPanelSet.Search.pcf: line 154, column 44
    function sortValue_41 (PolicySummary :  entity.PolicySummary) : java.lang.Object {
      return PolicySummary.State
    }
    
    // 'value' attribute on RowIterator at FNOLWizardFindPolicyPanelSet.Search.pcf: line 158, column 51
    function sortValue_42 (PolicySummary :  entity.PolicySummary) : java.lang.Object {
      return PolicySummary.PostalCode
    }
    
    // 'value' attribute on RowIterator at FNOLWizardFindPolicyPanelSet.Search.pcf: line 162, column 54
    function sortValue_43 (PolicySummary :  entity.PolicySummary) : java.lang.Object {
      return PolicySummary.EffectiveDate
    }
    
    // 'value' attribute on RowIterator at FNOLWizardFindPolicyPanelSet.Search.pcf: line 166, column 55
    function sortValue_44 (PolicySummary :  entity.PolicySummary) : java.lang.Object {
      return PolicySummary.ExpirationDate
    }
    
    // 'value' attribute on RowIterator at FNOLWizardFindPolicyPanelSet.Search.pcf: line 171, column 49
    function sortValue_45 (PolicySummary :  entity.PolicySummary) : java.lang.Object {
      return PolicySummary.PolicyType
    }
    
    // 'value' attribute on RowIterator at FNOLWizardFindPolicyPanelSet.Search.pcf: line 177, column 73
    function sortValue_47 (PolicySummary :  entity.PolicySummary) : java.lang.Object {
      return PolicySummary.Status
    }
    
    // 'value' attribute on TextInput (id=policyNumber) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 40, column 56
    function valueRoot_5 () : java.lang.Object {
      return policySearchCriteria
    }
    
    // 'value' attribute on TypeKeyInput (id=PolicyType) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 52, column 45
    function value_16 () : typekey.PolicyType {
      return policySearchCriteria.PolicyType
    }
    
    // 'value' attribute on TextInput (id=policyNumber) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 40, column 56
    function value_2 () : java.lang.String {
      return policySearchCriteria.PolicyNumber
    }
    
    // 'value' attribute on DateInput (id=date) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 58, column 52
    function value_20 () : java.util.Date {
      return policySearchCriteria.LossDate
    }
    
    // 'value' attribute on CheckBoxInput (id=IncludeArchivedPolicies) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 64, column 92
    function value_25 () : java.lang.Boolean {
      return policySearchCriteria.IncludeArchived
    }
    
    // 'value' attribute on RowIterator at FNOLWizardFindPolicyPanelSet.Search.pcf: line 106, column 86
    function value_88 () : gw.api.database.IQueryBeanResult<entity.PolicySummary> {
      FindPolicyUtils.saveSearch(policySearchCriteria, PolicySummaryList); return Wizard.getPolicySummariesOrSelected(PolicySummaryList, FindPolicyUtils.SelectedPolicySummary)
    }
    
    // 'visible' attribute on CheckBoxInput (id=IncludeArchivedPolicies) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 64, column 92
    function visible_24 () : java.lang.Boolean {
      return gw.api.system.CCConfigParameters.PolicySystemArchivingEnabled.Value
    }
    
    // 'visible' attribute on RowIterator at FNOLWizardFindPolicyPanelSet.Search.pcf: line 177, column 73
    function visible_46 () : java.lang.Boolean {
      return policySearchCriteria.IncludeArchived == true
    }
    
    property get PolicySummaryList () : gw.api.database.IQueryBeanResult<PolicySummary> {
      return getResultsValue(1) as gw.api.database.IQueryBeanResult<PolicySummary>
    }
    
    property get policySearchCriteria () : entity.PolicySearchCriteria {
      return getCriteriaValue(1) as entity.PolicySearchCriteria
    }
    
    property set policySearchCriteria ($arg :  entity.PolicySearchCriteria) {
      setCriteriaValue(1, $arg)
    }
    
    
  }
  
  
}