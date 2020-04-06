package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimLostWagesSummaryDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewClaimLostWagesSummaryDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimLostWagesSummaryDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimLostWagesSummaryDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextInput (id=AssignedUser_Name) at NewClaimLostWagesSummaryDV.pcf: line 41, column 49
    function action_19 () : void {
      UserContactDetailPopup.push(Exposure.AssignedUser)
    }
    
    // 'action' attribute on MenuItem (id=StatLine_PickerButton) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function action_43 () : void {
      ClaimPolicyStatCodePickerPopup.push(Exposure.Claim)
    }
    
    // 'action' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function action_45 () : void {
      ClaimPolicyStatCodePickerPopup.push(Exposure.Claim)
    }
    
    // 'action' attribute on PolicyStatCodePickerInput (id=StatLine) at NewClaimLostWagesSummaryDV.pcf: line 75, column 63
    function action_53 () : void {
      ClaimPolicyStatCodePickerPopup.push(Exposure.Claim)
    }
    
    // 'action' attribute on TextInput (id=AssignedUser_Name) at NewClaimLostWagesSummaryDV.pcf: line 41, column 49
    function action_dest_20 () : pcf.api.Destination {
      return pcf.UserContactDetailPopup.createDestination(Exposure.AssignedUser)
    }
    
    // 'action' attribute on MenuItem (id=StatLine_PickerButton) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function action_dest_44 () : pcf.api.Destination {
      return pcf.ClaimPolicyStatCodePickerPopup.createDestination(Exposure.Claim)
    }
    
    // 'action' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function action_dest_46 () : pcf.api.Destination {
      return pcf.ClaimPolicyStatCodePickerPopup.createDestination(Exposure.Claim)
    }
    
    // 'action' attribute on PolicyStatCodePickerInput (id=StatLine) at NewClaimLostWagesSummaryDV.pcf: line 75, column 63
    function action_dest_54 () : pcf.api.Destination {
      return pcf.ClaimPolicyStatCodePickerPopup.createDestination(Exposure.Claim)
    }
    
    // 'available' attribute on TextInput (id=AssignedUser_Name) at NewClaimLostWagesSummaryDV.pcf: line 41, column 49
    function available_16 () : java.lang.Boolean {
      return Exposure.AssignedUser.Contact != null
    }
    
    // 'def' attribute on ListViewInput at NewClaimLostWagesSummaryDV.pcf: line 92, column 27
    function def_onEnter_62 (def :  pcf.EditableClaimantDependentsLV) : void {
      def.onEnter(Exposure.getClaimContactRolesByRole(TC_CLAIMANTDEP), Exposure, TC_CLAIMANTDEP)
    }
    
    // 'def' attribute on ListViewInput at NewClaimLostWagesSummaryDV.pcf: line 92, column 27
    function def_refreshVariables_63 (def :  pcf.EditableClaimantDependentsLV) : void {
      def.refreshVariables(Exposure.getClaimContactRolesByRole(TC_CLAIMANTDEP), Exposure, TC_CLAIMANTDEP)
    }
    
    // 'value' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function defaultSetter_48 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.StatLine = (__VALUE_TO_SET as entity.StatCode)
    }
    
    // 'value' attribute on CurrencyInput (id=AverageWeeklyWages) at NewClaimLostWagesSummaryDV.pcf: line 105, column 46
    function defaultSetter_66 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.AverageWeeklyWages = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on TypeKeyInput (id=DaysInWeek) at NewClaimLostWagesSummaryDV.pcf: line 111, column 45
    function defaultSetter_70 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.DaysInWeek = (__VALUE_TO_SET as typekey.DaysInWeekType)
    }
    
    // 'value' attribute on DateInput (id=LastDayWorked) at NewClaimLostWagesSummaryDV.pcf: line 116, column 41
    function defaultSetter_74 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.LastDayWorked = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TextInput (id=LWImpairment) at NewClaimLostWagesSummaryDV.pcf: line 122, column 43
    function defaultSetter_78 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.InjuryIncident.Impairment = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on TypeKeyInput (id=JurisdictionState) at NewClaimLostWagesSummaryDV.pcf: line 134, column 43
    function defaultSetter_82 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.JurisdictionState = (__VALUE_TO_SET as typekey.Jurisdiction)
    }
    
    // 'filter' attribute on TypeKeyInput (id=JurisdictionState) at NewClaimLostWagesSummaryDV.pcf: line 134, column 43
    function filter_84 (VALUE :  typekey.Jurisdiction, VALUES :  typekey.Jurisdiction[]) : java.lang.Boolean {
      return VALUE.hasCategory(JurisdictionType.TC_INSURANCE)
    }
    
    // 'valueRange' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function valueRange_50 () : java.lang.Object {
      return Exposure.Claim.Policy.CappedStatCodes
    }
    
    // 'value' attribute on TypeKeyInput (id=LossParty) at NewClaimLostWagesSummaryDV.pcf: line 18, column 44
    function valueRoot_2 () : java.lang.Object {
      return Exposure
    }
    
    // 'value' attribute on TextInput (id=LWImpairment) at NewClaimLostWagesSummaryDV.pcf: line 122, column 43
    function valueRoot_79 () : java.lang.Object {
      return Exposure.InjuryIncident
    }
    
    // 'value' attribute on CurrencyInput (id=RemainingReserves) at NewClaimLostWagesSummaryDV.pcf: line 157, column 57
    function valueRoot_96 () : java.lang.Object {
      return Exposure.ExposureRpt
    }
    
    // 'value' attribute on TypeKeyInput (id=LossParty) at NewClaimLostWagesSummaryDV.pcf: line 18, column 44
    function value_0 () : typekey.LossPartyType {
      return Exposure.LossParty
    }
    
    // 'value' attribute on CurrencyInput (id=TotalPayments) at NewClaimLostWagesSummaryDV.pcf: line 165, column 53
    function value_100 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.TotalPayments
    }
    
    // 'value' attribute on CurrencyInput (id=TotalRecoveries) at NewClaimLostWagesSummaryDV.pcf: line 169, column 55
    function value_103 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.TotalRecoveries
    }
    
    // 'value' attribute on CurrencyInput (id=TotalIncurredNet) at NewClaimLostWagesSummaryDV.pcf: line 174, column 56
    function value_106 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.TotalIncurredNet
    }
    
    // 'value' attribute on TypeKeyInput (id=ClosedOutcome) at NewClaimLostWagesSummaryDV.pcf: line 34, column 50
    function value_12 () : typekey.ExposureClosedOutcomeType {
      return Exposure.ClosedOutcome
    }
    
    // 'value' attribute on TextInput (id=AssignedUser_Name) at NewClaimLostWagesSummaryDV.pcf: line 41, column 49
    function value_17 () : java.lang.String {
      return Exposure.AssigneeDisplayString
    }
    
    // 'value' attribute on DateInput (id=ReOpenDate) at NewClaimLostWagesSummaryDV.pcf: line 47, column 50
    function value_24 () : java.util.Date {
      return Exposure.ReOpenDate
    }
    
    // 'value' attribute on TextInput (id=AssignedGroup_Name) at NewClaimLostWagesSummaryDV.pcf: line 51, column 58
    function value_28 () : java.lang.String {
      return Exposure.AssigneeGroupOnlyDisplayString
    }
    
    // 'value' attribute on TypeKeyInput (id=ReopenedReason) at NewClaimLostWagesSummaryDV.pcf: line 57, column 50
    function value_32 () : typekey.ExposureReopenedReason {
      return Exposure.ReopenedReason
    }
    
    // 'value' attribute on TypeKeyInput (id=State) at NewClaimLostWagesSummaryDV.pcf: line 62, column 44
    function value_36 () : typekey.ExposureState {
      return Exposure.State
    }
    
    // 'value' attribute on DateInput (id=CreateTime) at NewClaimLostWagesSummaryDV.pcf: line 66, column 38
    function value_39 () : java.util.Date {
      return Exposure.CreateTime
    }
    
    // 'value' attribute on DateInput (id=ClosedDate) at NewClaimLostWagesSummaryDV.pcf: line 23, column 50
    function value_4 () : java.util.Date {
      return Exposure.CloseDate
    }
    
    // 'value' attribute on PolicyStatCodePickerInput (id=StatLine) at NewClaimLostWagesSummaryDV.pcf: line 75, column 63
    function value_42 () : entity.StatCode {
      return Exposure.StatLine
    }
    
    // 'value' attribute on TextInput (id=StatLine_Warning) at NewClaimLostWagesSummaryDV.pcf: line 82, column 65
    function value_58 () : java.lang.String {
      return DisplayKey.get("Java.StatCodes.StatCodeListCappedWarning", Exposure.Claim.Policy.StatCodeListCap, Exposure.Claim.Policy.StatCodes.length)
    }
    
    // 'value' attribute on CurrencyInput (id=AverageWeeklyWages) at NewClaimLostWagesSummaryDV.pcf: line 105, column 46
    function value_64 () : gw.api.financials.CurrencyAmount {
      return Exposure.AverageWeeklyWages
    }
    
    // 'value' attribute on TypeKeyInput (id=DaysInWeek) at NewClaimLostWagesSummaryDV.pcf: line 111, column 45
    function value_68 () : typekey.DaysInWeekType {
      return Exposure.DaysInWeek
    }
    
    // 'value' attribute on DateInput (id=LastDayWorked) at NewClaimLostWagesSummaryDV.pcf: line 116, column 41
    function value_72 () : java.util.Date {
      return Exposure.LastDayWorked
    }
    
    // 'value' attribute on TextInput (id=LWImpairment) at NewClaimLostWagesSummaryDV.pcf: line 122, column 43
    function value_76 () : java.math.BigDecimal {
      return Exposure.InjuryIncident.Impairment
    }
    
    // 'value' attribute on TypeKeyInput (id=PrimaryCoverage) at NewClaimLostWagesSummaryDV.pcf: line 28, column 43
    function value_8 () : typekey.CoverageType {
      return Exposure.PrimaryCoverage
    }
    
    // 'value' attribute on TypeKeyInput (id=JurisdictionState) at NewClaimLostWagesSummaryDV.pcf: line 134, column 43
    function value_80 () : typekey.Jurisdiction {
      return Exposure.JurisdictionState
    }
    
    // 'value' attribute on TypeKeyInput (id=Segment) at NewClaimLostWagesSummaryDV.pcf: line 139, column 43
    function value_85 () : typekey.ClaimSegment {
      return Exposure.Segment
    }
    
    // 'value' attribute on TypeKeyInput (id=Strategy) at NewClaimLostWagesSummaryDV.pcf: line 144, column 44
    function value_88 () : typekey.ClaimStrategy {
      return Exposure.Strategy
    }
    
    // 'value' attribute on TypeKeyInput (id=ValidationLevel) at NewClaimLostWagesSummaryDV.pcf: line 149, column 46
    function value_91 () : typekey.ValidationLevel {
      return Exposure.ValidationLevel
    }
    
    // 'value' attribute on CurrencyInput (id=RemainingReserves) at NewClaimLostWagesSummaryDV.pcf: line 157, column 57
    function value_94 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.RemainingReserves
    }
    
    // 'value' attribute on CurrencyInput (id=FuturePayments) at NewClaimLostWagesSummaryDV.pcf: line 161, column 54
    function value_97 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.FuturePayments
    }
    
    // 'valueRange' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function verifyValueRangeIsAllowedType_51 ($$arg :  entity.StatCode[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function verifyValueRangeIsAllowedType_51 ($$arg :  gw.api.database.IQueryBeanResult<entity.StatCode>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function verifyValueRangeIsAllowedType_51 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function verifyValueRange_52 () : void {
      var __valueRangeArg = Exposure.Claim.Policy.CappedStatCodes
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_51(__valueRangeArg)
    }
    
    // 'visible' attribute on DateInput (id=ReOpenDate) at NewClaimLostWagesSummaryDV.pcf: line 47, column 50
    function visible_23 () : java.lang.Boolean {
      return  Exposure.ReOpenDate != null 
    }
    
    // 'visible' attribute on DateInput (id=ClosedDate) at NewClaimLostWagesSummaryDV.pcf: line 23, column 50
    function visible_3 () : java.lang.Boolean {
      return  Exposure.State == TC_CLOSED 
    }
    
    // 'visible' attribute on TextInput (id=StatLine_Warning) at NewClaimLostWagesSummaryDV.pcf: line 82, column 65
    function visible_57 () : java.lang.Boolean {
      return Exposure.Claim.Policy.StatCodeListCapped
    }
    
    // 'visible' attribute on InputSet at NewClaimLostWagesSummaryDV.pcf: line 68, column 59
    function visible_61 () : java.lang.Boolean {
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