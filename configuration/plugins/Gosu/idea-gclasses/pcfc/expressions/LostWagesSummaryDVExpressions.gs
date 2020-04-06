package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/LostWagesSummaryDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class LostWagesSummaryDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/exposures/LostWagesSummaryDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LostWagesSummaryDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=StatLine_PickerButton) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function action_40 () : void {
      ClaimPolicyStatCodePickerPopup.push(Exposure.Claim)
    }
    
    // 'action' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function action_42 () : void {
      ClaimPolicyStatCodePickerPopup.push(Exposure.Claim)
    }
    
    // 'action' attribute on PolicyStatCodePickerInput (id=StatLine) at LostWagesSummaryDV.pcf: line 72, column 63
    function action_50 () : void {
      ClaimPolicyStatCodePickerPopup.push(Exposure.Claim)
    }
    
    // 'action' attribute on TextInput (id=AssignedUser_Name) at LostWagesSummaryDV.pcf: line 27, column 49
    function action_6 () : void {
      UserContactDetailPopup.push(Exposure.AssignedUser)
    }
    
    // 'action' attribute on MenuItem (id=StatLine_PickerButton) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function action_dest_41 () : pcf.api.Destination {
      return pcf.ClaimPolicyStatCodePickerPopup.createDestination(Exposure.Claim)
    }
    
    // 'action' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function action_dest_43 () : pcf.api.Destination {
      return pcf.ClaimPolicyStatCodePickerPopup.createDestination(Exposure.Claim)
    }
    
    // 'action' attribute on PolicyStatCodePickerInput (id=StatLine) at LostWagesSummaryDV.pcf: line 72, column 63
    function action_dest_51 () : pcf.api.Destination {
      return pcf.ClaimPolicyStatCodePickerPopup.createDestination(Exposure.Claim)
    }
    
    // 'action' attribute on TextInput (id=AssignedUser_Name) at LostWagesSummaryDV.pcf: line 27, column 49
    function action_dest_7 () : pcf.api.Destination {
      return pcf.UserContactDetailPopup.createDestination(Exposure.AssignedUser)
    }
    
    // 'available' attribute on TextInput (id=AssignedUser_Name) at LostWagesSummaryDV.pcf: line 27, column 49
    function available_3 () : java.lang.Boolean {
      return Exposure.AssignedUser.Contact != null
    }
    
    // 'def' attribute on InputSetRef (id=RTW) at LostWagesSummaryDV.pcf: line 89, column 32
    function def_onEnter_59 (def :  pcf.ReturnToWorkInputSet_WC) : void {
      def.onEnter(Exposure.Claim.ensureClaimInjuryIncident(), true)
    }
    
    // 'def' attribute on ListViewInput at LostWagesSummaryDV.pcf: line 120, column 25
    function def_onEnter_72 (def :  pcf.EditableClaimantDependentsLV) : void {
      def.onEnter(Exposure.getClaimContactRolesByRole(TC_CLAIMANTDEP), Exposure, TC_CLAIMANTDEP)
    }
    
    // 'def' attribute on ListViewInput at LostWagesSummaryDV.pcf: line 132, column 27
    function def_onEnter_74 (def :  pcf.EditableWorkStatusChangesLV) : void {
      def.onEnter(Exposure.Claim.EmploymentData)
    }
    
    // 'def' attribute on InputSetRef at LostWagesSummaryDV.pcf: line 139, column 51
    function def_onEnter_76 (def :  pcf.ExposureWorkloadInputSet) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on InputSetRef (id=RTW) at LostWagesSummaryDV.pcf: line 89, column 32
    function def_refreshVariables_60 (def :  pcf.ReturnToWorkInputSet_WC) : void {
      def.refreshVariables(Exposure.Claim.ensureClaimInjuryIncident(), true)
    }
    
    // 'def' attribute on ListViewInput at LostWagesSummaryDV.pcf: line 120, column 25
    function def_refreshVariables_73 (def :  pcf.EditableClaimantDependentsLV) : void {
      def.refreshVariables(Exposure.getClaimContactRolesByRole(TC_CLAIMANTDEP), Exposure, TC_CLAIMANTDEP)
    }
    
    // 'def' attribute on ListViewInput at LostWagesSummaryDV.pcf: line 132, column 27
    function def_refreshVariables_75 (def :  pcf.EditableWorkStatusChangesLV) : void {
      def.refreshVariables(Exposure.Claim.EmploymentData)
    }
    
    // 'def' attribute on InputSetRef at LostWagesSummaryDV.pcf: line 139, column 51
    function def_refreshVariables_77 (def :  pcf.ExposureWorkloadInputSet) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'value' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function defaultSetter_45 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.StatLine = (__VALUE_TO_SET as entity.StatCode)
    }
    
    // 'value' attribute on TypeKeyInput (id=DaysInWeek) at LostWagesSummaryDV.pcf: line 102, column 45
    function defaultSetter_66 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.DaysInWeek = (__VALUE_TO_SET as typekey.DaysInWeekType)
    }
    
    // 'value' attribute on TextInput (id=LWImpairment) at LostWagesSummaryDV.pcf: line 109, column 43
    function defaultSetter_70 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.InjuryIncident.Impairment = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on DateInput (id=Exposure_WageStmtSent) at LostWagesSummaryDV.pcf: line 148, column 40
    function defaultSetter_80 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.WageStmtSent = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateInput (id=Exposure_WageStmtRecd) at LostWagesSummaryDV.pcf: line 153, column 40
    function defaultSetter_84 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.WageStmtRecd = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'valueRange' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function valueRange_47 () : java.lang.Object {
      return Exposure.Claim.Policy.CappedStatCodes
    }
    
    // 'value' attribute on TypeKeyInput (id=PrimaryCoverage) at LostWagesSummaryDV.pcf: line 20, column 43
    function valueRoot_2 () : java.lang.Object {
      return Exposure
    }
    
    // 'value' attribute on CurrencyInput (id=Exposure_WorkCompAWW) at LostWagesSummaryDV.pcf: line 96, column 59
    function valueRoot_63 () : java.lang.Object {
      return Exposure.Claim.EmploymentData
    }
    
    // 'value' attribute on TextInput (id=LWImpairment) at LostWagesSummaryDV.pcf: line 109, column 43
    function valueRoot_71 () : java.lang.Object {
      return Exposure.InjuryIncident
    }
    
    // 'value' attribute on CurrencyInput (id=RemainingReserves) at LostWagesSummaryDV.pcf: line 179, column 57
    function valueRoot_97 () : java.lang.Object {
      return Exposure.ExposureRpt
    }
    
    // 'value' attribute on TypeKeyInput (id=PrimaryCoverage) at LostWagesSummaryDV.pcf: line 20, column 43
    function value_0 () : typekey.CoverageType {
      return Exposure.PrimaryCoverage
    }
    
    // 'value' attribute on TextInput (id=AssignedGroup_Name) at LostWagesSummaryDV.pcf: line 31, column 58
    function value_10 () : java.lang.String {
      return Exposure.AssigneeGroupOnlyDisplayString
    }
    
    // 'value' attribute on CurrencyInput (id=TotalPayments) at LostWagesSummaryDV.pcf: line 187, column 53
    function value_101 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.TotalPayments
    }
    
    // 'value' attribute on CurrencyInput (id=TotalRecoveries) at LostWagesSummaryDV.pcf: line 191, column 55
    function value_104 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.TotalRecoveries
    }
    
    // 'value' attribute on CurrencyInput (id=TotalIncurredNet) at LostWagesSummaryDV.pcf: line 196, column 56
    function value_107 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.TotalIncurredNet
    }
    
    // 'value' attribute on TypeKeyInput (id=State) at LostWagesSummaryDV.pcf: line 36, column 44
    function value_13 () : typekey.ExposureState {
      return Exposure.State
    }
    
    // 'value' attribute on DateInput (id=ReOpenDate) at LostWagesSummaryDV.pcf: line 42, column 50
    function value_17 () : java.util.Date {
      return Exposure.ReOpenDate
    }
    
    // 'value' attribute on TypeKeyInput (id=ReopenedReason) at LostWagesSummaryDV.pcf: line 48, column 50
    function value_22 () : typekey.ExposureReopenedReason {
      return Exposure.ReopenedReason
    }
    
    // 'value' attribute on DateInput (id=ClosedDate) at LostWagesSummaryDV.pcf: line 53, column 50
    function value_27 () : java.util.Date {
      return Exposure.CloseDate
    }
    
    // 'value' attribute on TypeKeyInput (id=ClosedOutcome) at LostWagesSummaryDV.pcf: line 59, column 50
    function value_32 () : typekey.ExposureClosedOutcomeType {
      return Exposure.ClosedOutcome
    }
    
    // 'value' attribute on DateInput (id=CreateTime) at LostWagesSummaryDV.pcf: line 63, column 38
    function value_36 () : java.util.Date {
      return Exposure.CreateTime
    }
    
    // 'value' attribute on PolicyStatCodePickerInput (id=StatLine) at LostWagesSummaryDV.pcf: line 72, column 63
    function value_39 () : entity.StatCode {
      return Exposure.StatLine
    }
    
    // 'value' attribute on TextInput (id=AssignedUser_Name) at LostWagesSummaryDV.pcf: line 27, column 49
    function value_4 () : java.lang.String {
      return Exposure.AssigneeDisplayString
    }
    
    // 'value' attribute on TextInput (id=StatLine_Warning) at LostWagesSummaryDV.pcf: line 79, column 65
    function value_55 () : java.lang.String {
      return DisplayKey.get("Java.StatCodes.StatCodeListCappedWarning", Exposure.Claim.Policy.StatCodeListCap, Exposure.Claim.Policy.StatCodes.length)
    }
    
    // 'value' attribute on CurrencyInput (id=Exposure_WorkCompAWW) at LostWagesSummaryDV.pcf: line 96, column 59
    function value_61 () : gw.api.financials.CurrencyAmount {
      return Exposure.Claim.EmploymentData.WageAmount
    }
    
    // 'value' attribute on TypeKeyInput (id=DaysInWeek) at LostWagesSummaryDV.pcf: line 102, column 45
    function value_64 () : typekey.DaysInWeekType {
      return Exposure.DaysInWeek
    }
    
    // 'value' attribute on TextInput (id=LWImpairment) at LostWagesSummaryDV.pcf: line 109, column 43
    function value_68 () : java.math.BigDecimal {
      return Exposure.InjuryIncident.Impairment
    }
    
    // 'value' attribute on DateInput (id=Exposure_WageStmtSent) at LostWagesSummaryDV.pcf: line 148, column 40
    function value_78 () : java.util.Date {
      return Exposure.WageStmtSent
    }
    
    // 'value' attribute on DateInput (id=Exposure_WageStmtRecd) at LostWagesSummaryDV.pcf: line 153, column 40
    function value_82 () : java.util.Date {
      return Exposure.WageStmtRecd
    }
    
    // 'value' attribute on TypeKeyInput (id=Segment) at LostWagesSummaryDV.pcf: line 161, column 43
    function value_86 () : typekey.ClaimSegment {
      return Exposure.Segment
    }
    
    // 'value' attribute on TypeKeyInput (id=Strategy) at LostWagesSummaryDV.pcf: line 166, column 44
    function value_89 () : typekey.ClaimStrategy {
      return Exposure.Strategy
    }
    
    // 'value' attribute on TypeKeyInput (id=ValidationLevel) at LostWagesSummaryDV.pcf: line 171, column 46
    function value_92 () : typekey.ValidationLevel {
      return Exposure.ValidationLevel
    }
    
    // 'value' attribute on CurrencyInput (id=RemainingReserves) at LostWagesSummaryDV.pcf: line 179, column 57
    function value_95 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.RemainingReserves
    }
    
    // 'value' attribute on CurrencyInput (id=FuturePayments) at LostWagesSummaryDV.pcf: line 183, column 54
    function value_98 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.FuturePayments
    }
    
    // 'valueRange' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function verifyValueRangeIsAllowedType_48 ($$arg :  entity.StatCode[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function verifyValueRangeIsAllowedType_48 ($$arg :  gw.api.database.IQueryBeanResult<entity.StatCode>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function verifyValueRangeIsAllowedType_48 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function verifyValueRange_49 () : void {
      var __valueRangeArg = Exposure.Claim.Policy.CappedStatCodes
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_48(__valueRangeArg)
    }
    
    // 'visible' attribute on DateInput (id=ReOpenDate) at LostWagesSummaryDV.pcf: line 42, column 50
    function visible_16 () : java.lang.Boolean {
      return  Exposure.ReOpenDate != null 
    }
    
    // 'visible' attribute on DateInput (id=ClosedDate) at LostWagesSummaryDV.pcf: line 53, column 50
    function visible_26 () : java.lang.Boolean {
      return  Exposure.State == TC_CLOSED 
    }
    
    // 'visible' attribute on TextInput (id=StatLine_Warning) at LostWagesSummaryDV.pcf: line 79, column 65
    function visible_54 () : java.lang.Boolean {
      return Exposure.Claim.Policy.StatCodeListCapped
    }
    
    // 'visible' attribute on InputSet at LostWagesSummaryDV.pcf: line 65, column 59
    function visible_58 () : java.lang.Boolean {
      return Exposure.Claim.Policy.StatCodingEnabled
    }
    
    property get Exposure () : Exposure {
      return getRequireValue("Exposure", 0) as Exposure
    }
    
    property set Exposure ($arg :  Exposure) {
      setRequireValue("Exposure", 0, $arg)
    }
    
    
  }
  
  
}