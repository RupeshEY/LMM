package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/summary/ClaimStatus.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimStatusExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/summary/ClaimStatus.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimStatusExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=RemoveFlagButton) at ClaimStatus.pcf: line 37, column 148
    function action_5 () : void {
      TeamClaimRemoveFlagPopup.push(claim, false)
    }
    
    // 'action' attribute on TextInput (id=PrimaryUser) at ClaimStatus.pcf: line 128, column 56
    function action_63 () : void {
      UserContactDetailPopup.push(claim.AssignedUser)
    }
    
    // 'action' attribute on ToolbarButton (id=RemoveFlagButton) at ClaimStatus.pcf: line 37, column 148
    function action_dest_6 () : pcf.api.Destination {
      return pcf.TeamClaimRemoveFlagPopup.createDestination(claim, false)
    }
    
    // 'action' attribute on TextInput (id=PrimaryUser) at ClaimStatus.pcf: line 128, column 56
    function action_dest_64 () : pcf.api.Destination {
      return pcf.UserContactDetailPopup.createDestination(claim.AssignedUser)
    }
    
    // 'afterCommit' attribute on Page (id=ClaimStatus) at ClaimStatus.pcf: line 10, column 69
    function afterCommit_141 (TopLocation :  pcf.api.Location) : void {
      ClaimStatusForward.go(claim)
    }
    
    // 'available' attribute on TextInput (id=PrimaryUser) at ClaimStatus.pcf: line 128, column 56
    function available_60 () : java.lang.Boolean {
      return claim.AssignedUser.Contact != null
    }
    
    // 'canEdit' attribute on Page (id=ClaimStatus) at ClaimStatus.pcf: line 10, column 69
    function canEdit_142 () : java.lang.Boolean {
      return perm.Claim.edit(claim)
    }
    
    // 'canVisit' attribute on Page (id=ClaimStatus) at ClaimStatus.pcf: line 10, column 69
    static function canVisit_143 (claim :  Claim) : java.lang.Boolean {
      return perm.Claim.view(claim) and perm.System.viewclaimsummary and (claim.State != ClaimState.TC_DRAFT)
    }
    
    // 'def' attribute on InputSetRef at ClaimStatus.pcf: line 165, column 55
    function def_onEnter_95 (def :  pcf.ReinsuranceInputSet) : void {
      def.onEnter( claim )
    }
    
    // 'def' attribute on InputSetRef at ClaimStatus.pcf: line 168, column 49
    function def_onEnter_97 (def :  pcf.StorageInputSet) : void {
      def.onEnter(claim)
    }
    
    // 'def' attribute on InputSetRef at ClaimStatus.pcf: line 165, column 55
    function def_refreshVariables_96 (def :  pcf.ReinsuranceInputSet) : void {
      def.refreshVariables( claim )
    }
    
    // 'def' attribute on InputSetRef at ClaimStatus.pcf: line 168, column 49
    function def_refreshVariables_98 (def :  pcf.StorageInputSet) : void {
      def.refreshVariables(claim)
    }
    
    // 'value' attribute on TextInput (id=SupplementalWorkloadWeight) at ClaimStatus.pcf: line 194, column 121
    function defaultSetter_115 (__VALUE_TO_SET :  java.lang.Object) : void {
      claim.SupplementalWorkloadWeight = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on TypeKeyInput (id=LineOfBusiness) at ClaimStatus.pcf: line 57, column 48
    function defaultSetter_12 (__VALUE_TO_SET :  java.lang.Object) : void {
      claim.LOBCode = (__VALUE_TO_SET as typekey.LOBCode)
    }
    
    // 'value' attribute on BooleanRadioInput (id=IncidentOnly) at ClaimStatus.pcf: line 74, column 49
    function defaultSetter_22 (__VALUE_TO_SET :  java.lang.Object) : void {
      claim.IncidentReport = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on DateInput (id=DateReported) at ClaimStatus.pcf: line 90, column 47
    function defaultSetter_32 (__VALUE_TO_SET :  java.lang.Object) : void {
      claim.ReportedDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TypeKeyInput (id=SpecialClaimPermission) at ClaimStatus.pcf: line 138, column 58
    function defaultSetter_72 (__VALUE_TO_SET :  java.lang.Object) : void {
      claim.PermissionRequired = (__VALUE_TO_SET as typekey.ClaimSecurityType)
    }
    
    // 'value' attribute on BooleanRadioInput (id=ISOEnabled) at ClaimStatus.pcf: line 150, column 53
    function defaultSetter_83 (__VALUE_TO_SET :  java.lang.Object) : void {
      claim.ISOEnabled = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TypeKeyInput (id=SalvageStatus) at ClaimStatus.pcf: line 157, column 54
    function defaultSetter_89 (__VALUE_TO_SET :  java.lang.Object) : void {
      claim.SalvageStatus = (__VALUE_TO_SET as typekey.SalvageStatus)
    }
    
    // 'value' attribute on TypeKeyInput (id=OtherRecoverableStatus) at ClaimStatus.pcf: line 163, column 63
    function defaultSetter_93 (__VALUE_TO_SET :  java.lang.Object) : void {
      claim.OtherRecovStatus = (__VALUE_TO_SET as typekey.OtherRecoverableStatus)
    }
    
    // 'editable' attribute on TextInput (id=SupplementalWorkloadWeight) at ClaimStatus.pcf: line 194, column 121
    function editable_109 () : java.lang.Boolean {
      return perm.System.wwlmanage
    }
    
    // 'editable' attribute on BooleanRadioInput (id=ISOEnabled) at ClaimStatus.pcf: line 150, column 53
    function editable_77 () : java.lang.Boolean {
      return perm.System.integadmin
    }
    
    // 'initialValue' attribute on Variable at ClaimStatus.pcf: line 19, column 39
    function initialValue_0 () : entity.ClaimIndicator[] {
      return claim.OrderedIndicators
    }
    
    // 'initialValue' attribute on Variable at ClaimStatus.pcf: line 23, column 37
    function initialValue_1 () : entity.ClaimIndicator {
      return indicators.first()
    }
    
    // 'initialValue' attribute on Variable at ClaimStatus.pcf: line 28, column 45
    function initialValue_2 () : entity.WorkloadClassification {
      return claim.findMatchingClassification()
    }
    
    // EditButtons at ClaimStatus.pcf: line 32, column 23
    function label_3 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'optionIcon' attribute on TypeKeyRadioInput (id=ClaimStatus) at ClaimStatus.pcf: line 81, column 51
    function optionIcon_27 (VALUE :  typekey.ClaimState) : java.lang.String {
      return VALUE == TC_OPEN ? "icon_claimOpen.png" : "icon_claimClosed.png"
    }
    
    // Page (id=ClaimStatus) at ClaimStatus.pcf: line 10, column 69
    static function parent_144 (claim :  Claim) : pcf.api.Destination {
      return pcf.ClaimSummaryGroup.createDestination(claim)
    }
    
    // 'validationExpression' attribute on DateInput (id=DateReported) at ClaimStatus.pcf: line 90, column 47
    function validationExpression_28 () : java.lang.Object {
      return claim.ReportedDate == null || claim.ReportedDate < gw.api.util.DateUtil.currentDate() ? null : DisplayKey.get("Java.Validation.Date.ForbidFuture")
    }
    
    // 'value' attribute on TextInput (id=ClassificationWorkload) at ClaimStatus.pcf: line 187, column 142
    function valueRoot_108 () : java.lang.Object {
      return classification
    }
    
    // 'value' attribute on TextInput (id=DaysOpen) at ClaimStatus.pcf: line 98, column 67
    function valueRoot_39 () : java.lang.Object {
      return claim.DaysOpenClaimMetric
    }
    
    // 'value' attribute on TypeKeyInput (id=LossType) at ClaimStatus.pcf: line 50, column 49
    function valueRoot_9 () : java.lang.Object {
      return claim
    }
    
    // 'value' attribute on TypeKeyInput (id=LineOfBusiness) at ClaimStatus.pcf: line 57, column 48
    function value_10 () : typekey.LOBCode {
      return claim.LOBCode
    }
    
    // 'value' attribute on TextInput (id=Classification) at ClaimStatus.pcf: line 181, column 142
    function value_101 () : entity.WorkloadClassification {
      return classification
    }
    
    // 'value' attribute on TextInput (id=ClassificationWorkload) at ClaimStatus.pcf: line 187, column 142
    function value_105 () : java.lang.Integer {
      return classification.Weight
    }
    
    // 'value' attribute on TextInput (id=SupplementalWorkloadWeight) at ClaimStatus.pcf: line 194, column 121
    function value_111 () : java.lang.Integer {
      return claim.SupplementalWorkloadWeight
    }
    
    // 'value' attribute on TextInput (id=TotalWorkloadWeight) at ClaimStatus.pcf: line 200, column 121
    function value_118 () : java.lang.Integer {
      return claim.WorkloadWeight
    }
    
    // 'value' attribute on TypeKeyInput (id=ClaimSegment) at ClaimStatus.pcf: line 62, column 53
    function value_14 () : typekey.ClaimSegment {
      return claim.Segment
    }
    
    // 'value' attribute on InputIterator (id=Indicators) at ClaimStatus.pcf: line 216, column 55
    function value_140 () : entity.ClaimIndicator[] {
      return indicators
    }
    
    // 'value' attribute on TypeKeyInput (id=ClaimStrategy) at ClaimStatus.pcf: line 67, column 54
    function value_17 () : typekey.ClaimStrategy {
      return claim.Strategy
    }
    
    // 'value' attribute on BooleanRadioInput (id=IncidentOnly) at ClaimStatus.pcf: line 74, column 49
    function value_20 () : java.lang.Boolean {
      return claim.IncidentReport
    }
    
    // 'value' attribute on TypeKeyRadioInput (id=ClaimStatus) at ClaimStatus.pcf: line 81, column 51
    function value_24 () : typekey.ClaimState {
      return claim.State
    }
    
    // 'value' attribute on DateInput (id=DateReported) at ClaimStatus.pcf: line 90, column 47
    function value_29 () : java.util.Date {
      return claim.ReportedDate
    }
    
    // 'value' attribute on DateInput (id=CreateDate) at ClaimStatus.pcf: line 94, column 45
    function value_34 () : java.util.Date {
      return claim.CreateTime
    }
    
    // 'value' attribute on TextInput (id=DaysOpen) at ClaimStatus.pcf: line 98, column 67
    function value_37 () : java.lang.String {
      return claim.DaysOpenClaimMetric.DisplayValue
    }
    
    // 'value' attribute on DateInput (id=CloseDate) at ClaimStatus.pcf: line 103, column 56
    function value_41 () : java.util.Date {
      return claim.CloseDate
    }
    
    // 'value' attribute on TypeKeyInput (id=Resolution) at ClaimStatus.pcf: line 109, column 56
    function value_46 () : typekey.ClaimClosedOutcomeType {
      return claim.ClosedOutcome
    }
    
    // 'value' attribute on TypeKeyInput (id=ReopenedReason) at ClaimStatus.pcf: line 115, column 56
    function value_51 () : typekey.ClaimReopenedReason {
      return claim.ReopenedReason
    }
    
    // 'value' attribute on DateInput (id=ReOpenDate) at ClaimStatus.pcf: line 121, column 56
    function value_56 () : java.util.Date {
      return claim.ReOpenDate
    }
    
    // 'value' attribute on TextInput (id=PrimaryUser) at ClaimStatus.pcf: line 128, column 56
    function value_61 () : java.lang.String {
      return claim.AssigneeDisplayString
    }
    
    // 'value' attribute on TextInput (id=PrimaryGroup) at ClaimStatus.pcf: line 132, column 65
    function value_67 () : java.lang.String {
      return claim.AssigneeGroupOnlyDisplayString
    }
    
    // 'value' attribute on TypeKeyInput (id=LossType) at ClaimStatus.pcf: line 50, column 49
    function value_7 () : typekey.LossType {
      return claim.LossType
    }
    
    // 'value' attribute on TypeKeyInput (id=SpecialClaimPermission) at ClaimStatus.pcf: line 138, column 58
    function value_70 () : typekey.ClaimSecurityType {
      return claim.PermissionRequired
    }
    
    // 'value' attribute on TypeKeyInput (id=ClaimValidationLevel) at ClaimStatus.pcf: line 144, column 56
    function value_74 () : typekey.ValidationLevel {
      return claim.ValidationLevel
    }
    
    // 'value' attribute on BooleanRadioInput (id=ISOEnabled) at ClaimStatus.pcf: line 150, column 53
    function value_79 () : java.lang.Boolean {
      return claim.ISOEnabled
    }
    
    // 'value' attribute on TypeKeyInput (id=SalvageStatus) at ClaimStatus.pcf: line 157, column 54
    function value_86 () : typekey.SalvageStatus {
      return claim.SalvageStatus
    }
    
    // 'value' attribute on TypeKeyInput (id=OtherRecoverableStatus) at ClaimStatus.pcf: line 163, column 63
    function value_91 () : typekey.OtherRecoverableStatus {
      return claim.OtherRecovStatus
    }
    
    // 'visible' attribute on TextInput (id=Classification) at ClaimStatus.pcf: line 181, column 142
    function visible_100 () : java.lang.Boolean {
      return gw.api.system.CCConfigParameters.WeightedAssignmentEnabled.Value and perm.System.wwlview and not claim.Closed
    }
    
    // 'visible' attribute on ToolbarButton (id=RemoveFlagButton) at ClaimStatus.pcf: line 37, column 148
    function visible_4 () : java.lang.Boolean {
      return (User.util.CurrentUser as User).hasClaimBasedPermission(claim, TC_CLAIMREMFLAG) and claim.Flagged == FlaggedType.TC_ISFLAGGED
    }
    
    // 'visible' attribute on DateInput (id=CloseDate) at ClaimStatus.pcf: line 103, column 56
    function visible_40 () : java.lang.Boolean {
      return claim.State == TC_CLOSED 
    }
    
    // 'visible' attribute on TypeKeyInput (id=ReopenedReason) at ClaimStatus.pcf: line 115, column 56
    function visible_50 () : java.lang.Boolean {
      return claim.ReOpenDate != null 
    }
    
    // 'visible' attribute on TypeKeyInput (id=SalvageStatus) at ClaimStatus.pcf: line 157, column 54
    function visible_85 () : java.lang.Boolean {
      return claim.LossType != TC_WC
    }
    
    // 'visible' attribute on InputDivider at ClaimStatus.pcf: line 170, column 119
    function visible_99 () : java.lang.Boolean {
      return gw.api.system.CCConfigParameters.WeightedAssignmentEnabled.Value and perm.System.wwlview
    }
    
    override property get CurrentLocation () : pcf.ClaimStatus {
      return super.CurrentLocation as pcf.ClaimStatus
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    property get classification () : entity.WorkloadClassification {
      return getVariableValue("classification", 0) as entity.WorkloadClassification
    }
    
    property set classification ($arg :  entity.WorkloadClassification) {
      setVariableValue("classification", 0, $arg)
    }
    
    property get firstIndicator () : entity.ClaimIndicator {
      return getVariableValue("firstIndicator", 0) as entity.ClaimIndicator
    }
    
    property set firstIndicator ($arg :  entity.ClaimIndicator) {
      setVariableValue("firstIndicator", 0, $arg)
    }
    
    property get indicators () : entity.ClaimIndicator[] {
      return getVariableValue("indicators", 0) as entity.ClaimIndicator[]
    }
    
    property set indicators ($arg :  entity.ClaimIndicator[]) {
      setVariableValue("indicators", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/summary/ClaimStatus.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimStatusExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at ClaimStatus.pcf: line 225, column 47
    function def_onEnter_125 (def :  pcf.ClaimIndicatorInputSet_CoverageInQuestionClaimIndicator) : void {
      def.onEnter(indicator)
    }
    
    // 'def' attribute on InputSetRef at ClaimStatus.pcf: line 225, column 47
    function def_onEnter_127 (def :  pcf.ClaimIndicatorInputSet_FatalityClaimIndicator) : void {
      def.onEnter(indicator)
    }
    
    // 'def' attribute on InputSetRef at ClaimStatus.pcf: line 225, column 47
    function def_onEnter_129 (def :  pcf.ClaimIndicatorInputSet_FlagClaimIndicator) : void {
      def.onEnter(indicator)
    }
    
    // 'def' attribute on InputSetRef at ClaimStatus.pcf: line 225, column 47
    function def_onEnter_131 (def :  pcf.ClaimIndicatorInputSet_LargeLossClaimIndicator) : void {
      def.onEnter(indicator)
    }
    
    // 'def' attribute on InputSetRef at ClaimStatus.pcf: line 225, column 47
    function def_onEnter_133 (def :  pcf.ClaimIndicatorInputSet_LitigationClaimIndicator) : void {
      def.onEnter(indicator)
    }
    
    // 'def' attribute on InputSetRef at ClaimStatus.pcf: line 225, column 47
    function def_onEnter_135 (def :  pcf.ClaimIndicatorInputSet_SIUClaimIndicator) : void {
      def.onEnter(indicator)
    }
    
    // 'def' attribute on InputSetRef at ClaimStatus.pcf: line 225, column 47
    function def_onEnter_137 (def :  pcf.ClaimIndicatorInputSet_SubrogationClaimIndicator) : void {
      def.onEnter(indicator)
    }
    
    // 'def' attribute on InputSetRef at ClaimStatus.pcf: line 225, column 47
    function def_refreshVariables_126 (def :  pcf.ClaimIndicatorInputSet_CoverageInQuestionClaimIndicator) : void {
      def.refreshVariables(indicator)
    }
    
    // 'def' attribute on InputSetRef at ClaimStatus.pcf: line 225, column 47
    function def_refreshVariables_128 (def :  pcf.ClaimIndicatorInputSet_FatalityClaimIndicator) : void {
      def.refreshVariables(indicator)
    }
    
    // 'def' attribute on InputSetRef at ClaimStatus.pcf: line 225, column 47
    function def_refreshVariables_130 (def :  pcf.ClaimIndicatorInputSet_FlagClaimIndicator) : void {
      def.refreshVariables(indicator)
    }
    
    // 'def' attribute on InputSetRef at ClaimStatus.pcf: line 225, column 47
    function def_refreshVariables_132 (def :  pcf.ClaimIndicatorInputSet_LargeLossClaimIndicator) : void {
      def.refreshVariables(indicator)
    }
    
    // 'def' attribute on InputSetRef at ClaimStatus.pcf: line 225, column 47
    function def_refreshVariables_134 (def :  pcf.ClaimIndicatorInputSet_LitigationClaimIndicator) : void {
      def.refreshVariables(indicator)
    }
    
    // 'def' attribute on InputSetRef at ClaimStatus.pcf: line 225, column 47
    function def_refreshVariables_136 (def :  pcf.ClaimIndicatorInputSet_SIUClaimIndicator) : void {
      def.refreshVariables(indicator)
    }
    
    // 'def' attribute on InputSetRef at ClaimStatus.pcf: line 225, column 47
    function def_refreshVariables_138 (def :  pcf.ClaimIndicatorInputSet_SubrogationClaimIndicator) : void {
      def.refreshVariables(indicator)
    }
    
    // 'label' attribute on Label (id=IndicatorType) at ClaimStatus.pcf: line 221, column 60
    function label_124 () : java.lang.String {
      return indicator.Subtype.DisplayName
    }
    
    // 'mode' attribute on InputSetRef at ClaimStatus.pcf: line 225, column 47
    function mode_139 () : java.lang.Object {
      return indicator.Subtype
    }
    
    // 'visible' attribute on InputDivider at ClaimStatus.pcf: line 218, column 60
    function visible_123 () : java.lang.Boolean {
      return indicator != firstIndicator
    }
    
    property get indicator () : entity.ClaimIndicator {
      return getIteratedValue(1) as entity.ClaimIndicator
    }
    
    
  }
  
  
}