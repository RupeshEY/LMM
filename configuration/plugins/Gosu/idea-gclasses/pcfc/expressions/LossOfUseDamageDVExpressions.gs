package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/LossOfUseDamageDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class LossOfUseDamageDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/exposures/LossOfUseDamageDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LossOfUseDamageDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextInput (id=AssignedUser_Name) at LossOfUseDamageDV.pcf: line 67, column 49
    function action_39 () : void {
      UserContactDetailPopup.push(Exposure.AssignedUser)
    }
    
    // 'action' attribute on MenuItem (id=StatLine_PickerButton) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function action_53 () : void {
      ClaimPolicyStatCodePickerPopup.push(Exposure.Claim)
    }
    
    // 'action' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function action_55 () : void {
      ClaimPolicyStatCodePickerPopup.push(Exposure.Claim)
    }
    
    // 'action' attribute on PolicyStatCodePickerInput (id=StatLine) at LossOfUseDamageDV.pcf: line 89, column 63
    function action_63 () : void {
      ClaimPolicyStatCodePickerPopup.push(Exposure.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_83 () : void {
      AddressBookPickerPopup.push(statictypeof (Exposure.Claimant), Exposure.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 18, column 285
    function action_85 () : void {
      if (Exposure.Claimant != null) { ClaimContactDetailPopup.push(Exposure.Claimant, Exposure.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_86 () : void {
      ClaimContactDetailPopup.push(Exposure.Claimant, Exposure.Claim)
    }
    
    // 'action' attribute on TextInput (id=AssignedUser_Name) at LossOfUseDamageDV.pcf: line 67, column 49
    function action_dest_40 () : pcf.api.Destination {
      return pcf.UserContactDetailPopup.createDestination(Exposure.AssignedUser)
    }
    
    // 'action' attribute on MenuItem (id=StatLine_PickerButton) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function action_dest_54 () : pcf.api.Destination {
      return pcf.ClaimPolicyStatCodePickerPopup.createDestination(Exposure.Claim)
    }
    
    // 'action' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function action_dest_56 () : pcf.api.Destination {
      return pcf.ClaimPolicyStatCodePickerPopup.createDestination(Exposure.Claim)
    }
    
    // 'action' attribute on PolicyStatCodePickerInput (id=StatLine) at LossOfUseDamageDV.pcf: line 89, column 63
    function action_dest_64 () : pcf.api.Destination {
      return pcf.ClaimPolicyStatCodePickerPopup.createDestination(Exposure.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_84 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Exposure.Claimant), Exposure.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_87 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Exposure.Claimant, Exposure.Claim)
    }
    
    // 'available' attribute on TextInput (id=AssignedUser_Name) at LossOfUseDamageDV.pcf: line 67, column 49
    function available_36 () : java.lang.Boolean {
      return Exposure.AssignedUser.Contact != null
    }
    
    // 'condition' attribute on ReflectCondition at LossOfUseDamageDV.pcf: line 119, column 45
    function condition_75 (TRIGGER_INDEX :  int, VALUE :  typekey.LossPartyType) : java.lang.Boolean {
      return VALUE == TC_INSURED
    }
    
    // 'condition' attribute on ReflectCondition at LossOfUseDamageDV.pcf: line 136, column 42
    function condition_97 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Boolean {
      return Exposure.Claim.Insured==VALUE
    }
    
    // 'def' attribute on InputSetRef at LossOfUseDamageDV.pcf: line 165, column 57
    function def_onEnter_116 (def :  pcf.CCAddressInputSet) : void {
      def.onEnter(Exposure.AddressOwner)
    }
    
    // 'def' attribute on InputSetRef at LossOfUseDamageDV.pcf: line 167, column 51
    function def_onEnter_118 (def :  pcf.ExposureWorkloadInputSet) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on ListViewInput at LossOfUseDamageDV.pcf: line 244, column 112
    function def_onEnter_165 (def :  pcf.EditableOtherCoverageDetailsLV) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on InputSetRef at LossOfUseDamageDV.pcf: line 264, column 144
    function def_onEnter_171 (def :  pcf.OtherServicesLVInputSet) : void {
      def.onEnter(Exposure.Claim, Exposure.PropertyIncident, Exposure.PropertyIncident.ServiceRequests.toSet(), null, {})
    }
    
    // 'def' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_80 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Exposure.Claimant), null, Exposure.Claim)
    }
    
    // 'def' attribute on InputSetRef at LossOfUseDamageDV.pcf: line 165, column 57
    function def_refreshVariables_117 (def :  pcf.CCAddressInputSet) : void {
      def.refreshVariables(Exposure.AddressOwner)
    }
    
    // 'def' attribute on InputSetRef at LossOfUseDamageDV.pcf: line 167, column 51
    function def_refreshVariables_119 (def :  pcf.ExposureWorkloadInputSet) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on ListViewInput at LossOfUseDamageDV.pcf: line 244, column 112
    function def_refreshVariables_166 (def :  pcf.EditableOtherCoverageDetailsLV) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on InputSetRef at LossOfUseDamageDV.pcf: line 264, column 144
    function def_refreshVariables_172 (def :  pcf.OtherServicesLVInputSet) : void {
      def.refreshVariables(Exposure.Claim, Exposure.PropertyIncident, Exposure.PropertyIncident.ServiceRequests.toSet(), null, {})
    }
    
    // 'def' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_81 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Exposure.Claimant), null, Exposure.Claim)
    }
    
    // 'value' attribute on TypeKeyInput (id=Claimant_Type) at LossOfUseDamageDV.pcf: line 131, column 42
    function defaultSetter_101 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.ClaimantType = (__VALUE_TO_SET as typekey.ClaimantType)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claimant_ContactProhibited) at LossOfUseDamageDV.pcf: line 146, column 36
    function defaultSetter_105 (__VALUE_TO_SET :  java.lang.Object) : void {
      ContactProhibited = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at LossOfUseDamageDV.pcf: line 179, column 48
    function defaultSetter_122 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.Incident.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Exposure_LossofUse) at LossOfUseDamageDV.pcf: line 184, column 53
    function defaultSetter_126 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.PropertyIncident.LossofUse = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CurrencyInput (id=LossEstimate) at LossOfUseDamageDV.pcf: line 191, column 49
    function defaultSetter_130 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.Incident.LossEstimate = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on TextInput (id=Exposure_ALEMealsDays) at LossOfUseDamageDV.pcf: line 199, column 64
    function defaultSetter_136 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.PropertyIncident.MealsDays = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on TextInput (id=Exposure_ALEMealsPeople) at LossOfUseDamageDV.pcf: line 206, column 64
    function defaultSetter_142 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.PropertyIncident.MealsPeople = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on CurrencyInput (id=Exposure_ALEMealsRate) at LossOfUseDamageDV.pcf: line 212, column 64
    function defaultSetter_148 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.PropertyIncident.MealsRate = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on TypeKeyInput (id=JurisdictionState) at LossOfUseDamageDV.pcf: line 221, column 43
    function defaultSetter_152 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.JurisdictionState = (__VALUE_TO_SET as typekey.Jurisdiction)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claimant_OtherCoverage) at LossOfUseDamageDV.pcf: line 240, column 41
    function defaultSetter_163 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.OtherCoverage = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on RangeInput (id=Coverage) at LossOfUseDamageDV.pcf: line 55, column 38
    function defaultSetter_26 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.Coverage = (__VALUE_TO_SET as entity.Coverage)
    }
    
    // 'value' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function defaultSetter_58 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.StatLine = (__VALUE_TO_SET as entity.StatCode)
    }
    
    // 'value' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_90 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.Claimant = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'filter' attribute on TypeKeyInput (id=JurisdictionState) at LossOfUseDamageDV.pcf: line 221, column 43
    function filter_154 (VALUE :  typekey.Jurisdiction, VALUES :  typekey.Jurisdiction[]) : java.lang.Boolean {
      return VALUE.hasCategory(JurisdictionType.TC_INSURANCE)
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function onPick_88 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Exposure.Claimant); var result = eval("Exposure.Claimant = Exposure.Claim.resolveContact(Exposure.Claimant) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'value' attribute on Reflect at LossOfUseDamageDV.pcf: line 153, column 44
    function reflectionValue_106 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Object {
      return VALUE.PrimaryPhoneValue
    }
    
    // 'value' attribute on Reflect at LossOfUseDamageDV.pcf: line 161, column 53
    function reflectionValue_111 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Object {
      return VALUE.PrimaryAddressDisplayValue
    }
    
    // Reflect at LossOfUseDamageDV.pcf: line 116, column 34
    function reflectionValue_77 (TRIGGER_INDEX :  int, VALUE :  typekey.LossPartyType) : java.lang.Object {
      return (VALUE == TC_INSURED) ? (Exposure.Claim.Insured) : (true) ? ("") : "<NOCHANGE>"
    }
    
    // Reflect at LossOfUseDamageDV.pcf: line 133, column 40
    function reflectionValue_98 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Object {
      return (Exposure.Claim.Insured==VALUE) ? ("insured") : (true) ? ("") : "<NOCHANGE>"
    }
    
    // 'valueRange' attribute on RangeInput (id=Coverage) at LossOfUseDamageDV.pcf: line 55, column 38
    function valueRange_28 () : java.lang.Object {
      return Exposure.Claim.Policy.getCoveragesByCoverageType(Exposure.PrimaryCoverage)
    }
    
    // 'valueRange' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function valueRange_60 () : java.lang.Object {
      return Exposure.Claim.Policy.CappedStatCodes
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_92 () : java.lang.Object {
      return Exposure.Claim.getRelatedContacts(Exposure.getContactType(TC_CLAIMANT))
    }
    
    // 'value' attribute on TextInput (id=Claimant_PrimaryPhone) at LossOfUseDamageDV.pcf: line 150, column 53
    function valueRoot_110 () : java.lang.Object {
      return Exposure.Claimant
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at LossOfUseDamageDV.pcf: line 179, column 48
    function valueRoot_123 () : java.lang.Object {
      return Exposure.Incident
    }
    
    // 'value' attribute on BooleanRadioInput (id=Exposure_LossofUse) at LossOfUseDamageDV.pcf: line 184, column 53
    function valueRoot_127 () : java.lang.Object {
      return Exposure.PropertyIncident
    }
    
    // 'value' attribute on CurrencyInput (id=RemainingReserves) at LossOfUseDamageDV.pcf: line 272, column 57
    function valueRoot_175 () : java.lang.Object {
      return Exposure.ExposureRpt
    }
    
    // 'value' attribute on TypeKeyInput (id=LossParty) at LossOfUseDamageDV.pcf: line 21, column 44
    function valueRoot_2 () : java.lang.Object {
      return Exposure
    }
    
    // 'value' attribute on TypeKeyInput (id=LossParty) at LossOfUseDamageDV.pcf: line 21, column 44
    function value_0 () : typekey.LossPartyType {
      return Exposure.LossParty
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claimant_ContactProhibited) at LossOfUseDamageDV.pcf: line 146, column 36
    function value_103 () : java.lang.Boolean {
      return ContactProhibited
    }
    
    // 'value' attribute on TextInput (id=Claimant_PrimaryPhone) at LossOfUseDamageDV.pcf: line 150, column 53
    function value_108 () : java.lang.String {
      return Exposure.Claimant.PrimaryPhoneValue
    }
    
    // 'value' attribute on TextInput (id=Claimant_Address) at LossOfUseDamageDV.pcf: line 158, column 62
    function value_113 () : java.lang.String {
      return Exposure.Claimant.PrimaryAddressDisplayValue
    }
    
    // 'value' attribute on TypeKeyInput (id=ClosedOutcome) at LossOfUseDamageDV.pcf: line 37, column 50
    function value_12 () : typekey.ExposureClosedOutcomeType {
      return Exposure.ClosedOutcome
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at LossOfUseDamageDV.pcf: line 179, column 48
    function value_120 () : java.lang.String {
      return Exposure.Incident.Description
    }
    
    // 'value' attribute on BooleanRadioInput (id=Exposure_LossofUse) at LossOfUseDamageDV.pcf: line 184, column 53
    function value_124 () : java.lang.Boolean {
      return Exposure.PropertyIncident.LossofUse
    }
    
    // 'value' attribute on CurrencyInput (id=LossEstimate) at LossOfUseDamageDV.pcf: line 191, column 49
    function value_128 () : gw.api.financials.CurrencyAmount {
      return Exposure.Incident.LossEstimate
    }
    
    // 'value' attribute on TextInput (id=Exposure_ALEMealsDays) at LossOfUseDamageDV.pcf: line 199, column 64
    function value_133 () : java.lang.Integer {
      return Exposure.PropertyIncident.MealsDays
    }
    
    // 'value' attribute on TextInput (id=Exposure_ALEMealsPeople) at LossOfUseDamageDV.pcf: line 206, column 64
    function value_139 () : java.lang.Integer {
      return Exposure.PropertyIncident.MealsPeople
    }
    
    // 'value' attribute on CurrencyInput (id=Exposure_ALEMealsRate) at LossOfUseDamageDV.pcf: line 212, column 64
    function value_145 () : gw.api.financials.CurrencyAmount {
      return Exposure.PropertyIncident.MealsRate
    }
    
    // 'value' attribute on TypeKeyInput (id=JurisdictionState) at LossOfUseDamageDV.pcf: line 221, column 43
    function value_150 () : typekey.Jurisdiction {
      return Exposure.JurisdictionState
    }
    
    // 'value' attribute on TypeKeyInput (id=Segment) at LossOfUseDamageDV.pcf: line 226, column 43
    function value_155 () : typekey.ClaimSegment {
      return Exposure.Segment
    }
    
    // 'value' attribute on TypeKeyInput (id=Strategy) at LossOfUseDamageDV.pcf: line 231, column 44
    function value_158 () : typekey.ClaimStrategy {
      return Exposure.Strategy
    }
    
    // 'value' attribute on TypeKeyInput (id=CoverageSubType) at LossOfUseDamageDV.pcf: line 42, column 46
    function value_16 () : typekey.CoverageSubtype {
      return Exposure.CoverageSubType
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claimant_OtherCoverage) at LossOfUseDamageDV.pcf: line 240, column 41
    function value_161 () : java.lang.Boolean {
      return Exposure.OtherCoverage
    }
    
    // 'value' attribute on CurrencyInput (id=RemainingReserves) at LossOfUseDamageDV.pcf: line 272, column 57
    function value_173 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.RemainingReserves
    }
    
    // 'value' attribute on CurrencyInput (id=FuturePayments) at LossOfUseDamageDV.pcf: line 276, column 54
    function value_176 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.FuturePayments
    }
    
    // 'value' attribute on CurrencyInput (id=TotalPayments) at LossOfUseDamageDV.pcf: line 280, column 53
    function value_179 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.TotalPayments
    }
    
    // 'value' attribute on CurrencyInput (id=TotalRecoveries) at LossOfUseDamageDV.pcf: line 284, column 55
    function value_182 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.TotalRecoveries
    }
    
    // 'value' attribute on CurrencyInput (id=TotalIncurredNet) at LossOfUseDamageDV.pcf: line 289, column 56
    function value_185 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.TotalIncurredNet
    }
    
    // 'value' attribute on DateInput (id=ReOpenDate) at LossOfUseDamageDV.pcf: line 48, column 50
    function value_20 () : java.util.Date {
      return Exposure.ReOpenDate
    }
    
    // 'value' attribute on RangeInput (id=Coverage) at LossOfUseDamageDV.pcf: line 55, column 38
    function value_24 () : entity.Coverage {
      return Exposure.Coverage
    }
    
    // 'value' attribute on TypeKeyInput (id=ReopenedReason) at LossOfUseDamageDV.pcf: line 61, column 50
    function value_32 () : typekey.ExposureReopenedReason {
      return Exposure.ReopenedReason
    }
    
    // 'value' attribute on TextInput (id=AssignedUser_Name) at LossOfUseDamageDV.pcf: line 67, column 49
    function value_37 () : java.lang.String {
      return Exposure.AssigneeDisplayString
    }
    
    // 'value' attribute on DateInput (id=ClosedDate) at LossOfUseDamageDV.pcf: line 26, column 50
    function value_4 () : java.util.Date {
      return Exposure.CloseDate
    }
    
    // 'value' attribute on TextInput (id=AssignedGroup_Name) at LossOfUseDamageDV.pcf: line 71, column 58
    function value_43 () : java.lang.String {
      return Exposure.AssigneeGroupOnlyDisplayString
    }
    
    // 'value' attribute on TypeKeyInput (id=State) at LossOfUseDamageDV.pcf: line 76, column 44
    function value_46 () : typekey.ExposureState {
      return Exposure.State
    }
    
    // 'value' attribute on DateInput (id=CreateTime) at LossOfUseDamageDV.pcf: line 80, column 38
    function value_49 () : java.util.Date {
      return Exposure.CreateTime
    }
    
    // 'value' attribute on PolicyStatCodePickerInput (id=StatLine) at LossOfUseDamageDV.pcf: line 89, column 63
    function value_52 () : entity.StatCode {
      return Exposure.StatLine
    }
    
    // 'value' attribute on TextInput (id=StatLine_Warning) at LossOfUseDamageDV.pcf: line 96, column 65
    function value_68 () : java.lang.String {
      return DisplayKey.get("Java.StatCodes.StatCodeListCappedWarning", Exposure.Claim.Policy.StatCodeListCap, Exposure.Claim.Policy.StatCodes.length)
    }
    
    // 'value' attribute on TypeKeyInput (id=ValidationLevel) at LossOfUseDamageDV.pcf: line 103, column 46
    function value_72 () : typekey.ValidationLevel {
      return Exposure.ValidationLevel
    }
    
    // 'value' attribute on ReflectCondition at LossOfUseDamageDV.pcf: line 119, column 45
    function value_76 (TRIGGER_INDEX :  int, VALUE :  typekey.LossPartyType) : java.lang.Object {
      return Exposure.Claim.Insured
    }
    
    // 'value' attribute on ClaimContactInput (id=Claimant_Picker) at LossOfUseDamageDV.pcf: line 114, column 94
    function value_78 () : entity.Contact {
      return Exposure.Claimant
    }
    
    // 'value' attribute on TypeKeyInput (id=PrimaryCoverage) at LossOfUseDamageDV.pcf: line 31, column 43
    function value_8 () : typekey.CoverageType {
      return Exposure.PrimaryCoverage
    }
    
    // 'value' attribute on TypeKeyInput (id=Claimant_Type) at LossOfUseDamageDV.pcf: line 131, column 42
    function value_99 () : typekey.ClaimantType {
      return Exposure.ClaimantType
    }
    
    // 'valueRange' attribute on RangeInput (id=Coverage) at LossOfUseDamageDV.pcf: line 55, column 38
    function verifyValueRangeIsAllowedType_29 ($$arg :  entity.Coverage[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Coverage) at LossOfUseDamageDV.pcf: line 55, column 38
    function verifyValueRangeIsAllowedType_29 ($$arg :  gw.api.database.IQueryBeanResult<entity.Coverage>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Coverage) at LossOfUseDamageDV.pcf: line 55, column 38
    function verifyValueRangeIsAllowedType_29 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function verifyValueRangeIsAllowedType_61 ($$arg :  entity.StatCode[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function verifyValueRangeIsAllowedType_61 ($$arg :  gw.api.database.IQueryBeanResult<entity.StatCode>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function verifyValueRangeIsAllowedType_61 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_93 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_93 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_93 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Coverage) at LossOfUseDamageDV.pcf: line 55, column 38
    function verifyValueRange_30 () : void {
      var __valueRangeArg = Exposure.Claim.Policy.getCoveragesByCoverageType(Exposure.PrimaryCoverage)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_29(__valueRangeArg)
    }
    
    // 'valueRange' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function verifyValueRange_62 () : void {
      var __valueRangeArg = Exposure.Claim.Policy.CappedStatCodes
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_61(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_94 () : void {
      var __valueRangeArg = Exposure.Claim.getRelatedContacts(Exposure.getContactType(TC_CLAIMANT))
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_93(__valueRangeArg)
    }
    
    // 'visible' attribute on TextInput (id=Exposure_ALEMealsDays) at LossOfUseDamageDV.pcf: line 199, column 64
    function visible_132 () : java.lang.Boolean {
      return Exposure.PropertyIncident.LossofUse == true
    }
    
    // 'visible' attribute on TextInput (id=ServiceRequestSubmitMessageFNOL) at LossOfUseDamageDV.pcf: line 257, column 46
    function visible_167 () : java.lang.Boolean {
      return Exposure.Claim.DraftClaim
    }
    
    // 'visible' attribute on TextInput (id=ServiceRequestSubmitMessage) at LossOfUseDamageDV.pcf: line 262, column 81
    function visible_169 () : java.lang.Boolean {
      return not Exposure.Claim.DraftClaim and CurrentLocation.InEditMode
    }
    
    // 'visible' attribute on DateInput (id=ReOpenDate) at LossOfUseDamageDV.pcf: line 48, column 50
    function visible_19 () : java.lang.Boolean {
      return  Exposure.ReOpenDate != null 
    }
    
    // 'visible' attribute on DateInput (id=ClosedDate) at LossOfUseDamageDV.pcf: line 26, column 50
    function visible_3 () : java.lang.Boolean {
      return  Exposure.State == TC_CLOSED 
    }
    
    // 'visible' attribute on TextInput (id=StatLine_Warning) at LossOfUseDamageDV.pcf: line 96, column 65
    function visible_67 () : java.lang.Boolean {
      return Exposure.Claim.Policy.StatCodeListCapped
    }
    
    // 'visible' attribute on InputSet at LossOfUseDamageDV.pcf: line 82, column 59
    function visible_71 () : java.lang.Boolean {
      return Exposure.Claim.Policy.StatCodingEnabled
    }
    
    // 'visible' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 14, column 229
    function visible_79 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 16, column 225
    function visible_82 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Exposure.Claimant), Exposure.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    property get Exposure () : Exposure {
      return getRequireValue("Exposure", 0) as Exposure
    }
    
    property set Exposure ($arg :  Exposure) {
      setRequireValue("Exposure", 0, $arg)
    }
    
    
    property get ContactProhibited() : boolean {
        return Exposure.Claim.getClaimContact(Exposure.Claimant).ContactProhibited
    }
      
    property set ContactProhibited(prohibited : boolean) {
      var claimContact = Exposure.Claim.getClaimContact(Exposure.Claimant) 
      if (claimContact != null) claimContact.ContactProhibited = prohibited 
    }
          
        
    
    
  }
  
  
}