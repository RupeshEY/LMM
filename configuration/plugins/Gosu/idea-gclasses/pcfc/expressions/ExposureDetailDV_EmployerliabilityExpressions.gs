package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/ExposureDetailDV.Employerliability.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ExposureDetailDV_EmployerliabilityExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/exposures/ExposureDetailDV.Employerliability.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExposureDetailDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextInput (id=AssignedUser_Name) at ExposureDetailDV.Employerliability.pcf: line 53, column 49
    function action_26 () : void {
      UserContactDetailPopup.push(Exposure.AssignedUser)
    }
    
    // 'action' attribute on MenuItem (id=StatLine_PickerButton) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function action_50 () : void {
      ClaimPolicyStatCodePickerPopup.push(Exposure.Claim)
    }
    
    // 'action' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function action_52 () : void {
      ClaimPolicyStatCodePickerPopup.push(Exposure.Claim)
    }
    
    // 'action' attribute on PolicyStatCodePickerInput (id=StatLine) at ExposureDetailDV.Employerliability.pcf: line 87, column 63
    function action_60 () : void {
      ClaimPolicyStatCodePickerPopup.push(Exposure.Claim)
    }
    
    // 'action' attribute on TextInput (id=AssignedUser_Name) at ExposureDetailDV.Employerliability.pcf: line 53, column 49
    function action_dest_27 () : pcf.api.Destination {
      return pcf.UserContactDetailPopup.createDestination(Exposure.AssignedUser)
    }
    
    // 'action' attribute on MenuItem (id=StatLine_PickerButton) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function action_dest_51 () : pcf.api.Destination {
      return pcf.ClaimPolicyStatCodePickerPopup.createDestination(Exposure.Claim)
    }
    
    // 'action' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function action_dest_53 () : pcf.api.Destination {
      return pcf.ClaimPolicyStatCodePickerPopup.createDestination(Exposure.Claim)
    }
    
    // 'action' attribute on PolicyStatCodePickerInput (id=StatLine) at ExposureDetailDV.Employerliability.pcf: line 87, column 63
    function action_dest_61 () : pcf.api.Destination {
      return pcf.ClaimPolicyStatCodePickerPopup.createDestination(Exposure.Claim)
    }
    
    // 'available' attribute on TextInput (id=AssignedUser_Name) at ExposureDetailDV.Employerliability.pcf: line 53, column 49
    function available_23 () : java.lang.Boolean {
      return Exposure.AssignedUser.Contact != null
    }
    
    // 'def' attribute on InputSetRef at ExposureDetailDV.Employerliability.pcf: line 118, column 51
    function def_onEnter_80 (def :  pcf.ExposureWorkloadInputSet) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on InputSetRef at ExposureDetailDV.Employerliability.pcf: line 118, column 51
    function def_refreshVariables_81 (def :  pcf.ExposureWorkloadInputSet) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'value' attribute on RangeInput (id=Exposure_Coverage) at ExposureDetailDV.Employerliability.pcf: line 30, column 38
    function defaultSetter_5 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.Coverage = (__VALUE_TO_SET as entity.Coverage)
    }
    
    // 'value' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function defaultSetter_55 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.StatLine = (__VALUE_TO_SET as entity.StatCode)
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at ExposureDetailDV.Employerliability.pcf: line 111, column 48
    function defaultSetter_74 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.Incident.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on CurrencyInput (id=LossEstimate) at ExposureDetailDV.Employerliability.pcf: line 116, column 49
    function defaultSetter_78 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.Incident.LossEstimate = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on DateInput (id=SettlementDate) at ExposureDetailDV.Employerliability.pcf: line 129, column 38
    function defaultSetter_86 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.SettleDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TypeKeyInput (id=SettlementMethod) at ExposureDetailDV.Employerliability.pcf: line 135, column 43
    function defaultSetter_90 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.SettleMethod = (__VALUE_TO_SET as typekey.SettleMethod)
    }
    
    // 'value' attribute on TypeKeyInput (id=JurisdictionState) at ExposureDetailDV.Employerliability.pcf: line 145, column 43
    function defaultSetter_94 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.JurisdictionState = (__VALUE_TO_SET as typekey.Jurisdiction)
    }
    
    // 'filter' attribute on TypeKeyInput (id=JurisdictionState) at ExposureDetailDV.Employerliability.pcf: line 145, column 43
    function filter_96 (VALUE :  typekey.Jurisdiction, VALUES :  typekey.Jurisdiction[]) : java.lang.Boolean {
      return VALUE.hasCategory(JurisdictionType.TC_INSURANCE)
    }
    
    // 'validationExpression' attribute on DateInput (id=SettlementDate) at ExposureDetailDV.Employerliability.pcf: line 129, column 38
    function validationExpression_82 () : java.lang.Object {
      return Exposure.SettleDate == null || Exposure.SettleDate < gw.api.util.DateUtil.currentDate() ? null : DisplayKey.get("Java.Validation.Date.ForbidFuture")
    }
    
    // 'valueRange' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function valueRange_57 () : java.lang.Object {
      return Exposure.Claim.Policy.CappedStatCodes
    }
    
    // 'valueRange' attribute on RangeInput (id=Exposure_Coverage) at ExposureDetailDV.Employerliability.pcf: line 30, column 38
    function valueRange_7 () : java.lang.Object {
      return Exposure.Claim.Policy.getCoveragesByCoverageType(Exposure.PrimaryCoverage)
    }
    
    // 'value' attribute on CurrencyInput (id=RemainingReserves) at ExposureDetailDV.Employerliability.pcf: line 165, column 60
    function valueRoot_108 () : java.lang.Object {
      return Exposure.ExposureRpt
    }
    
    // 'value' attribute on TypeKeyInput (id=LossParty) at ExposureDetailDV.Employerliability.pcf: line 22, column 44
    function valueRoot_2 () : java.lang.Object {
      return Exposure
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at ExposureDetailDV.Employerliability.pcf: line 111, column 48
    function valueRoot_75 () : java.lang.Object {
      return Exposure.Incident
    }
    
    // 'value' attribute on TypeKeyInput (id=LossParty) at ExposureDetailDV.Employerliability.pcf: line 22, column 44
    function value_0 () : typekey.LossPartyType {
      return Exposure.LossParty
    }
    
    // 'value' attribute on TypeKeyInput (id=Strategy) at ExposureDetailDV.Employerliability.pcf: line 155, column 44
    function value_100 () : typekey.ClaimStrategy {
      return Exposure.Strategy
    }
    
    // 'value' attribute on CurrencyInput (id=RemainingReserves) at ExposureDetailDV.Employerliability.pcf: line 165, column 60
    function value_105 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.RemainingReserves
    }
    
    // 'value' attribute on DateInput (id=ClosedDate) at ExposureDetailDV.Employerliability.pcf: line 35, column 50
    function value_11 () : java.util.Date {
      return Exposure.CloseDate
    }
    
    // 'value' attribute on CurrencyInput (id=FuturePayments) at ExposureDetailDV.Employerliability.pcf: line 170, column 60
    function value_110 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.FuturePayments
    }
    
    // 'value' attribute on CurrencyInput (id=TotalPayments) at ExposureDetailDV.Employerliability.pcf: line 175, column 60
    function value_115 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.TotalPayments
    }
    
    // 'value' attribute on CurrencyInput (id=TotalRecoveries) at ExposureDetailDV.Employerliability.pcf: line 180, column 62
    function value_120 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.TotalRecoveries
    }
    
    // 'value' attribute on CurrencyInput (id=TotalIncurredNet) at ExposureDetailDV.Employerliability.pcf: line 186, column 68
    function value_125 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.TotalIncurredNet
    }
    
    // 'value' attribute on TypeKeyInput (id=PrimaryCoverage) at ExposureDetailDV.Employerliability.pcf: line 40, column 43
    function value_15 () : typekey.CoverageType {
      return Exposure.PrimaryCoverage
    }
    
    // 'value' attribute on TypeKeyInput (id=ClosedOutcome) at ExposureDetailDV.Employerliability.pcf: line 46, column 50
    function value_19 () : typekey.ExposureClosedOutcomeType {
      return Exposure.ClosedOutcome
    }
    
    // 'value' attribute on TextInput (id=AssignedUser_Name) at ExposureDetailDV.Employerliability.pcf: line 53, column 49
    function value_24 () : java.lang.String {
      return Exposure.AssigneeDisplayString
    }
    
    // 'value' attribute on RangeInput (id=Exposure_Coverage) at ExposureDetailDV.Employerliability.pcf: line 30, column 38
    function value_3 () : entity.Coverage {
      return Exposure.Coverage
    }
    
    // 'value' attribute on DateInput (id=ReOpenDate) at ExposureDetailDV.Employerliability.pcf: line 59, column 50
    function value_31 () : java.util.Date {
      return Exposure.ReOpenDate
    }
    
    // 'value' attribute on TextInput (id=AssignedGroup_Name) at ExposureDetailDV.Employerliability.pcf: line 63, column 58
    function value_35 () : java.lang.String {
      return Exposure.AssigneeGroupOnlyDisplayString
    }
    
    // 'value' attribute on TypeKeyInput (id=ReopenedReason) at ExposureDetailDV.Employerliability.pcf: line 69, column 50
    function value_39 () : typekey.ExposureReopenedReason {
      return Exposure.ReopenedReason
    }
    
    // 'value' attribute on TypeKeyInput (id=State) at ExposureDetailDV.Employerliability.pcf: line 74, column 44
    function value_43 () : typekey.ExposureState {
      return Exposure.State
    }
    
    // 'value' attribute on DateInput (id=CreateTime) at ExposureDetailDV.Employerliability.pcf: line 78, column 38
    function value_46 () : java.util.Date {
      return Exposure.CreateTime
    }
    
    // 'value' attribute on PolicyStatCodePickerInput (id=StatLine) at ExposureDetailDV.Employerliability.pcf: line 87, column 63
    function value_49 () : entity.StatCode {
      return Exposure.StatLine
    }
    
    // 'value' attribute on TextInput (id=StatLine_Warning) at ExposureDetailDV.Employerliability.pcf: line 94, column 65
    function value_65 () : java.lang.String {
      return DisplayKey.get("Java.StatCodes.StatCodeListCappedWarning", Exposure.Claim.Policy.StatCodeListCap, Exposure.Claim.Policy.StatCodes.length)
    }
    
    // 'value' attribute on TypeKeyInput (id=ValidationLevel) at ExposureDetailDV.Employerliability.pcf: line 101, column 46
    function value_69 () : typekey.ValidationLevel {
      return Exposure.ValidationLevel
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at ExposureDetailDV.Employerliability.pcf: line 111, column 48
    function value_72 () : java.lang.String {
      return Exposure.Incident.Description
    }
    
    // 'value' attribute on CurrencyInput (id=LossEstimate) at ExposureDetailDV.Employerliability.pcf: line 116, column 49
    function value_76 () : gw.api.financials.CurrencyAmount {
      return Exposure.Incident.LossEstimate
    }
    
    // 'value' attribute on DateInput (id=SettlementDate) at ExposureDetailDV.Employerliability.pcf: line 129, column 38
    function value_83 () : java.util.Date {
      return Exposure.SettleDate
    }
    
    // 'value' attribute on TypeKeyInput (id=SettlementMethod) at ExposureDetailDV.Employerliability.pcf: line 135, column 43
    function value_88 () : typekey.SettleMethod {
      return Exposure.SettleMethod
    }
    
    // 'value' attribute on TypeKeyInput (id=JurisdictionState) at ExposureDetailDV.Employerliability.pcf: line 145, column 43
    function value_92 () : typekey.Jurisdiction {
      return Exposure.JurisdictionState
    }
    
    // 'value' attribute on TypeKeyInput (id=Segment) at ExposureDetailDV.Employerliability.pcf: line 150, column 43
    function value_97 () : typekey.ClaimSegment {
      return Exposure.Segment
    }
    
    // 'valueRange' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function verifyValueRangeIsAllowedType_58 ($$arg :  entity.StatCode[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function verifyValueRangeIsAllowedType_58 ($$arg :  gw.api.database.IQueryBeanResult<entity.StatCode>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function verifyValueRangeIsAllowedType_58 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Exposure_Coverage) at ExposureDetailDV.Employerliability.pcf: line 30, column 38
    function verifyValueRangeIsAllowedType_8 ($$arg :  entity.Coverage[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Exposure_Coverage) at ExposureDetailDV.Employerliability.pcf: line 30, column 38
    function verifyValueRangeIsAllowedType_8 ($$arg :  gw.api.database.IQueryBeanResult<entity.Coverage>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Exposure_Coverage) at ExposureDetailDV.Employerliability.pcf: line 30, column 38
    function verifyValueRangeIsAllowedType_8 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function verifyValueRange_59 () : void {
      var __valueRangeArg = Exposure.Claim.Policy.CappedStatCodes
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_58(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=Exposure_Coverage) at ExposureDetailDV.Employerliability.pcf: line 30, column 38
    function verifyValueRange_9 () : void {
      var __valueRangeArg = Exposure.Claim.Policy.getCoveragesByCoverageType(Exposure.PrimaryCoverage)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_8(__valueRangeArg)
    }
    
    // 'visible' attribute on DateInput (id=ClosedDate) at ExposureDetailDV.Employerliability.pcf: line 35, column 50
    function visible_10 () : java.lang.Boolean {
      return  Exposure.State == TC_CLOSED 
    }
    
    // 'visible' attribute on Label at ExposureDetailDV.Employerliability.pcf: line 159, column 70
    function visible_103 () : java.lang.Boolean {
      return perm.Claim.viewtransactiondetails(Exposure.Claim)
    }
    
    // 'visible' attribute on CurrencyInput (id=RemainingReserves) at ExposureDetailDV.Employerliability.pcf: line 165, column 60
    function visible_104 () : java.lang.Boolean {
      return perm.Claim.viewreserves(Exposure.Claim)
    }
    
    // 'visible' attribute on CurrencyInput (id=FuturePayments) at ExposureDetailDV.Employerliability.pcf: line 170, column 60
    function visible_109 () : java.lang.Boolean {
      return perm.Claim.viewpayments(Exposure.Claim)
    }
    
    // 'visible' attribute on CurrencyInput (id=TotalRecoveries) at ExposureDetailDV.Employerliability.pcf: line 180, column 62
    function visible_119 () : java.lang.Boolean {
      return perm.Claim.viewrecoveries(Exposure.Claim)
    }
    
    // 'visible' attribute on CurrencyInput (id=TotalIncurredNet) at ExposureDetailDV.Employerliability.pcf: line 186, column 68
    function visible_124 () : java.lang.Boolean {
      return perm.Claim.viewnettotalincurred(Exposure.Claim)
    }
    
    // 'visible' attribute on DateInput (id=ReOpenDate) at ExposureDetailDV.Employerliability.pcf: line 59, column 50
    function visible_30 () : java.lang.Boolean {
      return  Exposure.ReOpenDate != null 
    }
    
    // 'visible' attribute on TextInput (id=StatLine_Warning) at ExposureDetailDV.Employerliability.pcf: line 94, column 65
    function visible_64 () : java.lang.Boolean {
      return Exposure.Claim.Policy.StatCodeListCapped
    }
    
    // 'visible' attribute on InputSet at ExposureDetailDV.Employerliability.pcf: line 80, column 59
    function visible_68 () : java.lang.Boolean {
      return Exposure.Claim.Policy.StatCodingEnabled
    }
    
    property get Exposure () : Exposure {
      return getRequireValue("Exposure", 0) as Exposure
    }
    
    property set Exposure ($arg :  Exposure) {
      setRequireValue("Exposure", 0, $arg)
    }
    
    property get unusedServiceRequests () : java.util.Set<ServiceRequest> {
      return getRequireValue("unusedServiceRequests", 0) as java.util.Set<ServiceRequest>
    }
    
    property set unusedServiceRequests ($arg :  java.util.Set<ServiceRequest>) {
      setRequireValue("unusedServiceRequests", 0, $arg)
    }
    
    
  }
  
  
}