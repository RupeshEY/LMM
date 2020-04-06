package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/PIPSummaryDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PIPSummaryDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/exposures/PIPSummaryDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PIPSummaryDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ClaimContactInput (id=DisBenefits_Provider) at ClaimContactWidget.xml: line 16, column 225
    function action_112 () : void {
      AddressBookPickerPopup.push(statictypeof (Exposure.disbenprovider), Exposure.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=DisBenefits_Provider) at ClaimContactWidget.xml: line 18, column 285
    function action_114 () : void {
      if (Exposure.disbenprovider != null) { ClaimContactDetailPopup.push(Exposure.disbenprovider, Exposure.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=DisBenefits_Provider) at ClaimContactWidget.xml: line 12, column 273
    function action_115 () : void {
      ClaimContactDetailPopup.push(Exposure.disbenprovider, Exposure.Claim)
    }
    
    // 'action' attribute on MenuItem (id=StatLine_PickerButton) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function action_19 () : void {
      ClaimPolicyStatCodePickerPopup.push(Exposure.Claim)
    }
    
    // 'action' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function action_21 () : void {
      ClaimPolicyStatCodePickerPopup.push(Exposure.Claim)
    }
    
    // 'action' attribute on PolicyStatCodePickerInput (id=StatLine) at PIPSummaryDV.pcf: line 45, column 63
    function action_29 () : void {
      ClaimPolicyStatCodePickerPopup.push(Exposure.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=PIPDamages_Claimant) at ClaimContactWidget.xml: line 16, column 225
    function action_64 () : void {
      AddressBookPickerPopup.push(statictypeof (Exposure.Claimant), Exposure.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=PIPDamages_Claimant) at ClaimContactWidget.xml: line 18, column 285
    function action_66 () : void {
      if (Exposure.Claimant != null) { ClaimContactDetailPopup.push(Exposure.Claimant, Exposure.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=PIPDamages_Claimant) at ClaimContactWidget.xml: line 12, column 273
    function action_67 () : void {
      ClaimContactDetailPopup.push(Exposure.Claimant, Exposure.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=DisBenefits_Provider) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_113 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Exposure.disbenprovider), Exposure.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=DisBenefits_Provider) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_116 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Exposure.disbenprovider, Exposure.Claim)
    }
    
    // 'action' attribute on MenuItem (id=StatLine_PickerButton) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function action_dest_20 () : pcf.api.Destination {
      return pcf.ClaimPolicyStatCodePickerPopup.createDestination(Exposure.Claim)
    }
    
    // 'action' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function action_dest_22 () : pcf.api.Destination {
      return pcf.ClaimPolicyStatCodePickerPopup.createDestination(Exposure.Claim)
    }
    
    // 'action' attribute on PolicyStatCodePickerInput (id=StatLine) at PIPSummaryDV.pcf: line 45, column 63
    function action_dest_30 () : pcf.api.Destination {
      return pcf.ClaimPolicyStatCodePickerPopup.createDestination(Exposure.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=PIPDamages_Claimant) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_65 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Exposure.Claimant), Exposure.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=PIPDamages_Claimant) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_68 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Exposure.Claimant, Exposure.Claim)
    }
    
    // 'condition' attribute on ReflectCondition at PIPSummaryDV.pcf: line 96, column 45
    function condition_56 (TRIGGER_INDEX :  int, VALUE :  typekey.LossPartyType) : java.lang.Boolean {
      return VALUE == TC_INSURED
    }
    
    // 'condition' attribute on ReflectCondition at PIPSummaryDV.pcf: line 113, column 42
    function condition_78 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Boolean {
      return Exposure.Claim.Insured==VALUE
    }
    
    // 'def' attribute on InputSetRef at PIPSummaryDV.pcf: line 155, column 51
    function def_onEnter_101 (def :  pcf.ExposureWorkloadInputSet) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on ClaimContactInput (id=DisBenefits_Provider) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_109 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Exposure.disbenprovider), null, Exposure.Claim)
    }
    
    // 'def' attribute on ListViewInput at PIPSummaryDV.pcf: line 245, column 90
    function def_onEnter_168 (def :  pcf.EditableOtherCoverageDetailsLV) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on ClaimContactInput (id=PIPDamages_Claimant) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_61 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Exposure.Claimant), null, Exposure.Claim)
    }
    
    // 'def' attribute on InputSetRef at PIPSummaryDV.pcf: line 144, column 43
    function def_onEnter_97 (def :  pcf.BIDamageInputSet) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on ListViewInput at PIPSummaryDV.pcf: line 148, column 93
    function def_onEnter_99 (def :  pcf.IMEPerformedLV) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on ListViewInput at PIPSummaryDV.pcf: line 148, column 93
    function def_refreshVariables_100 (def :  pcf.IMEPerformedLV) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on InputSetRef at PIPSummaryDV.pcf: line 155, column 51
    function def_refreshVariables_102 (def :  pcf.ExposureWorkloadInputSet) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on ClaimContactInput (id=DisBenefits_Provider) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_110 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Exposure.disbenprovider), null, Exposure.Claim)
    }
    
    // 'def' attribute on ListViewInput at PIPSummaryDV.pcf: line 245, column 90
    function def_refreshVariables_169 (def :  pcf.EditableOtherCoverageDetailsLV) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on ClaimContactInput (id=PIPDamages_Claimant) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_62 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Exposure.Claimant), null, Exposure.Claim)
    }
    
    // 'def' attribute on InputSetRef at PIPSummaryDV.pcf: line 144, column 43
    function def_refreshVariables_98 (def :  pcf.BIDamageInputSet) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'value' attribute on BooleanRadioInput (id=PIPDamages_SSDIEligible) at PIPSummaryDV.pcf: line 165, column 40
    function defaultSetter_105 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.SSDIEligible = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on ClaimContactInput (id=DisBenefits_Provider) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_119 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.disbenprovider = (__VALUE_TO_SET as entity.Company)
    }
    
    // 'value' attribute on RangeInput (id=Title_Coverage) at PIPSummaryDV.pcf: line 36, column 38
    function defaultSetter_13 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.Coverage = (__VALUE_TO_SET as entity.Coverage)
    }
    
    // 'value' attribute on CurrencyInput (id=LostWagesBenefits_WeeklyCompRate) at PIPSummaryDV.pcf: line 202, column 54
    function defaultSetter_144 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.DisBenefits.WeeklyCompRate = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on TextInput (id=LostWagesBenefits_Description) at PIPSummaryDV.pcf: line 207, column 51
    function defaultSetter_148 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.DisBenefits.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=JurisdictionState) at PIPSummaryDV.pcf: line 232, column 43
    function defaultSetter_161 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.JurisdictionState = (__VALUE_TO_SET as typekey.Jurisdiction)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claimant_OtherCoverage) at PIPSummaryDV.pcf: line 241, column 41
    function defaultSetter_166 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.OtherCoverage = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function defaultSetter_24 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.StatLine = (__VALUE_TO_SET as entity.StatCode)
    }
    
    // 'value' attribute on ClaimContactInput (id=PIPDamages_Claimant) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_71 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.Claimant = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on TypeKeyInput (id=Exposure_ClaimantType) at PIPSummaryDV.pcf: line 108, column 42
    function defaultSetter_82 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.ClaimantType = (__VALUE_TO_SET as typekey.ClaimantType)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claimant_ContactProhibited) at PIPSummaryDV.pcf: line 123, column 36
    function defaultSetter_86 (__VALUE_TO_SET :  java.lang.Object) : void {
      ContactProhibited = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'editable' attribute on RangeInput (id=Title_Coverage) at PIPSummaryDV.pcf: line 36, column 38
    function editable_9 () : java.lang.Boolean {
      return !Exposure.New
    }
    
    // 'filter' attribute on TypeKeyInput (id=JurisdictionState) at PIPSummaryDV.pcf: line 232, column 43
    function filter_163 (VALUE :  typekey.Jurisdiction, VALUES :  typekey.Jurisdiction[]) : java.lang.Boolean {
      return VALUE.hasCategory(JurisdictionType.TC_INSURANCE)
    }
    
    // 'onPick' attribute on ClaimContactInput (id=DisBenefits_Provider) at ClaimContactWidget.xml: line 12, column 273
    function onPick_117 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Exposure.disbenprovider); var result = eval("Exposure.disbenprovider = Exposure.Claim.resolveContact(Exposure.disbenprovider) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=PIPDamages_Claimant) at ClaimContactWidget.xml: line 12, column 273
    function onPick_69 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Exposure.Claimant); var result = eval("Exposure.Claimant = Exposure.Claim.resolveContact(Exposure.Claimant) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'value' attribute on Reflect at PIPSummaryDV.pcf: line 180, column 53
    function reflectionValue_127 (TRIGGER_INDEX :  int, VALUE :  entity.Company) : java.lang.Object {
      return VALUE.PrimaryAddressDisplayValue
    }
    
    // 'value' attribute on Reflect at PIPSummaryDV.pcf: line 188, column 53
    function reflectionValue_132 (TRIGGER_INDEX :  int, VALUE :  entity.Company) : java.lang.Object {
      return VALUE.PrimaryContact.DisplayName
    }
    
    // 'value' attribute on Reflect at PIPSummaryDV.pcf: line 196, column 44
    function reflectionValue_137 (TRIGGER_INDEX :  int, VALUE :  entity.Company) : java.lang.Object {
      return VALUE.PrimaryPhoneValue
    }
    
    // Reflect at PIPSummaryDV.pcf: line 93, column 34
    function reflectionValue_58 (TRIGGER_INDEX :  int, VALUE :  typekey.LossPartyType) : java.lang.Object {
      return (VALUE == TC_INSURED) ? (Exposure.Claim.Insured) : (true) ? ("") : "<NOCHANGE>"
    }
    
    // Reflect at PIPSummaryDV.pcf: line 110, column 44
    function reflectionValue_79 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Object {
      return (Exposure.Claim.Insured==VALUE) ? ("insured") : (true) ? ("") : "<NOCHANGE>"
    }
    
    // 'value' attribute on Reflect at PIPSummaryDV.pcf: line 130, column 44
    function reflectionValue_87 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Object {
      return VALUE.PrimaryPhoneValue
    }
    
    // 'value' attribute on Reflect at PIPSummaryDV.pcf: line 140, column 53
    function reflectionValue_92 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Object {
      return VALUE.PrimaryAddressDisplayValue
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=DisBenefits_Provider) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_121 () : java.lang.Object {
      return Exposure.Claim.RelatedCompanyArray
    }
    
    // 'valueRange' attribute on RangeInput (id=Title_Coverage) at PIPSummaryDV.pcf: line 36, column 38
    function valueRange_15 () : java.lang.Object {
      return Exposure.Claim.Policy.getCoveragesByCoverageType(Exposure.PrimaryCoverage)
    }
    
    // 'valueRange' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function valueRange_26 () : java.lang.Object {
      return Exposure.Claim.Policy.CappedStatCodes
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=PIPDamages_Claimant) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_73 () : java.lang.Object {
      return Exposure.Claim.getRelatedContacts(Exposure.getContactType(TC_CLAIMANT))
    }
    
    // 'value' attribute on TextInput (id=Provider_PrimaryAddress) at PIPSummaryDV.pcf: line 177, column 68
    function valueRoot_131 () : java.lang.Object {
      return Exposure.disbenprovider
    }
    
    // 'value' attribute on TextInput (id=Provider_PrimaryContact) at PIPSummaryDV.pcf: line 185, column 68
    function valueRoot_136 () : java.lang.Object {
      return Exposure.disbenprovider.PrimaryContact
    }
    
    // 'value' attribute on CurrencyInput (id=LostWagesBenefits_WeeklyCompRate) at PIPSummaryDV.pcf: line 202, column 54
    function valueRoot_145 () : java.lang.Object {
      return Exposure.DisBenefits
    }
    
    // 'value' attribute on CurrencyInput (id=RemainingReserves) at PIPSummaryDV.pcf: line 258, column 57
    function valueRoot_172 () : java.lang.Object {
      return Exposure.ExposureRpt
    }
    
    // 'value' attribute on TypeKeyInput (id=LossParty) at PIPSummaryDV.pcf: line 18, column 44
    function valueRoot_2 () : java.lang.Object {
      return Exposure
    }
    
    // 'value' attribute on TextInput (id=Claimant_PrimaryPhone) at PIPSummaryDV.pcf: line 127, column 53
    function valueRoot_91 () : java.lang.Object {
      return Exposure.Claimant
    }
    
    // 'value' attribute on TypeKeyInput (id=LossParty) at PIPSummaryDV.pcf: line 18, column 44
    function value_0 () : typekey.LossPartyType {
      return Exposure.LossParty
    }
    
    // 'value' attribute on RangeInput (id=Title_Coverage) at PIPSummaryDV.pcf: line 36, column 38
    function value_10 () : entity.Coverage {
      return Exposure.Coverage
    }
    
    // 'value' attribute on BooleanRadioInput (id=PIPDamages_SSDIEligible) at PIPSummaryDV.pcf: line 165, column 40
    function value_103 () : java.lang.Boolean {
      return Exposure.SSDIEligible
    }
    
    // 'value' attribute on ClaimContactInput (id=DisBenefits_Provider) at PIPSummaryDV.pcf: line 173, column 37
    function value_107 () : entity.Company {
      return Exposure.disbenprovider
    }
    
    // 'value' attribute on TextInput (id=Provider_PrimaryAddress) at PIPSummaryDV.pcf: line 177, column 68
    function value_129 () : java.lang.String {
      return Exposure.disbenprovider.PrimaryAddressDisplayValue
    }
    
    // 'value' attribute on TextInput (id=Provider_PrimaryContact) at PIPSummaryDV.pcf: line 185, column 68
    function value_134 () : java.lang.String {
      return Exposure.disbenprovider.PrimaryContact.DisplayName
    }
    
    // 'value' attribute on TextInput (id=Provider_PrimaryPhone) at PIPSummaryDV.pcf: line 193, column 59
    function value_139 () : java.lang.String {
      return Exposure.disbenprovider.PrimaryPhoneValue
    }
    
    // 'value' attribute on CurrencyInput (id=LostWagesBenefits_WeeklyCompRate) at PIPSummaryDV.pcf: line 202, column 54
    function value_142 () : gw.api.financials.CurrencyAmount {
      return Exposure.DisBenefits.WeeklyCompRate
    }
    
    // 'value' attribute on TextInput (id=LostWagesBenefits_Description) at PIPSummaryDV.pcf: line 207, column 51
    function value_146 () : java.lang.String {
      return Exposure.DisBenefits.Description
    }
    
    // 'value' attribute on TypeKeyInput (id=Exposure_Segment) at PIPSummaryDV.pcf: line 215, column 43
    function value_150 () : typekey.ClaimSegment {
      return Exposure.Segment
    }
    
    // 'value' attribute on TypeKeyInput (id=Exposure_Strategy) at PIPSummaryDV.pcf: line 220, column 44
    function value_153 () : typekey.ClaimStrategy {
      return Exposure.Strategy
    }
    
    // 'value' attribute on TypeKeyInput (id=Exposure_ValidationLevel) at PIPSummaryDV.pcf: line 225, column 46
    function value_156 () : typekey.ValidationLevel {
      return Exposure.ValidationLevel
    }
    
    // 'value' attribute on TypeKeyInput (id=JurisdictionState) at PIPSummaryDV.pcf: line 232, column 43
    function value_159 () : typekey.Jurisdiction {
      return Exposure.JurisdictionState
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claimant_OtherCoverage) at PIPSummaryDV.pcf: line 241, column 41
    function value_164 () : java.lang.Boolean {
      return Exposure.OtherCoverage
    }
    
    // 'value' attribute on CurrencyInput (id=RemainingReserves) at PIPSummaryDV.pcf: line 258, column 57
    function value_170 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.RemainingReserves
    }
    
    // 'value' attribute on CurrencyInput (id=FuturePayments) at PIPSummaryDV.pcf: line 262, column 54
    function value_173 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.FuturePayments
    }
    
    // 'value' attribute on CurrencyInput (id=TotalPayments) at PIPSummaryDV.pcf: line 266, column 53
    function value_176 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.TotalPayments
    }
    
    // 'value' attribute on CurrencyInput (id=TotalRecoveries) at PIPSummaryDV.pcf: line 270, column 55
    function value_179 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.TotalRecoveries
    }
    
    // 'value' attribute on PolicyStatCodePickerInput (id=StatLine) at PIPSummaryDV.pcf: line 45, column 63
    function value_18 () : entity.StatCode {
      return Exposure.StatLine
    }
    
    // 'value' attribute on CurrencyInput (id=TotalIncurredNet) at PIPSummaryDV.pcf: line 275, column 56
    function value_182 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.TotalIncurredNet
    }
    
    // 'value' attribute on TypeKeyInput (id=Title_CoverageSubType) at PIPSummaryDV.pcf: line 23, column 46
    function value_3 () : typekey.CoverageSubtype {
      return Exposure.CoverageSubType
    }
    
    // 'value' attribute on TextInput (id=StatLine_Warning) at PIPSummaryDV.pcf: line 52, column 65
    function value_34 () : java.lang.String {
      return DisplayKey.get("Java.StatCodes.StatCodeListCappedWarning", Exposure.Claim.Policy.StatCodeListCap, Exposure.Claim.Policy.StatCodes.length)
    }
    
    // 'value' attribute on TextInput (id=AssignedUser_Name) at PIPSummaryDV.pcf: line 58, column 49
    function value_38 () : java.lang.String {
      return Exposure.AssigneeDisplayString
    }
    
    // 'value' attribute on TextInput (id=AssignedGroup_Name) at PIPSummaryDV.pcf: line 62, column 58
    function value_41 () : java.lang.String {
      return Exposure.AssigneeGroupOnlyDisplayString
    }
    
    // 'value' attribute on TypeKeyInput (id=State) at PIPSummaryDV.pcf: line 67, column 44
    function value_44 () : typekey.ExposureState {
      return Exposure.State
    }
    
    // 'value' attribute on DateInput (id=CreateTime) at PIPSummaryDV.pcf: line 71, column 38
    function value_47 () : java.util.Date {
      return Exposure.CreateTime
    }
    
    // 'value' attribute on DateInput (id=ClosedDate) at PIPSummaryDV.pcf: line 75, column 37
    function value_50 () : java.util.Date {
      return Exposure.CloseDate
    }
    
    // 'value' attribute on TypeKeyInput (id=ClosedOutcome) at PIPSummaryDV.pcf: line 80, column 56
    function value_53 () : typekey.ExposureClosedOutcomeType {
      return Exposure.ClosedOutcome
    }
    
    // 'value' attribute on ReflectCondition at PIPSummaryDV.pcf: line 96, column 45
    function value_57 (TRIGGER_INDEX :  int, VALUE :  typekey.LossPartyType) : java.lang.Object {
      return Exposure.Claim.Insured
    }
    
    // 'value' attribute on ClaimContactInput (id=PIPDamages_Claimant) at PIPSummaryDV.pcf: line 91, column 94
    function value_59 () : entity.Contact {
      return Exposure.Claimant
    }
    
    // 'value' attribute on TypeKeyInput (id=PrimaryCoverage) at PIPSummaryDV.pcf: line 28, column 43
    function value_6 () : typekey.CoverageType {
      return Exposure.PrimaryCoverage
    }
    
    // 'value' attribute on TypeKeyInput (id=Exposure_ClaimantType) at PIPSummaryDV.pcf: line 108, column 42
    function value_80 () : typekey.ClaimantType {
      return Exposure.ClaimantType
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claimant_ContactProhibited) at PIPSummaryDV.pcf: line 123, column 36
    function value_84 () : java.lang.Boolean {
      return ContactProhibited
    }
    
    // 'value' attribute on TextInput (id=Claimant_PrimaryPhone) at PIPSummaryDV.pcf: line 127, column 53
    function value_89 () : java.lang.String {
      return Exposure.Claimant.PrimaryPhoneValue
    }
    
    // 'value' attribute on TextAreaInput (id=Claimant_PrimaryAddress) at PIPSummaryDV.pcf: line 137, column 62
    function value_94 () : java.lang.String {
      return Exposure.Claimant.PrimaryAddressDisplayValue
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=DisBenefits_Provider) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_122 ($$arg :  entity.Company[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=DisBenefits_Provider) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_122 ($$arg :  gw.api.database.IQueryBeanResult<entity.Company>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=DisBenefits_Provider) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_122 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Title_Coverage) at PIPSummaryDV.pcf: line 36, column 38
    function verifyValueRangeIsAllowedType_16 ($$arg :  entity.Coverage[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Title_Coverage) at PIPSummaryDV.pcf: line 36, column 38
    function verifyValueRangeIsAllowedType_16 ($$arg :  gw.api.database.IQueryBeanResult<entity.Coverage>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Title_Coverage) at PIPSummaryDV.pcf: line 36, column 38
    function verifyValueRangeIsAllowedType_16 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function verifyValueRangeIsAllowedType_27 ($$arg :  entity.StatCode[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function verifyValueRangeIsAllowedType_27 ($$arg :  gw.api.database.IQueryBeanResult<entity.StatCode>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function verifyValueRangeIsAllowedType_27 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=PIPDamages_Claimant) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_74 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=PIPDamages_Claimant) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_74 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=PIPDamages_Claimant) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_74 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=DisBenefits_Provider) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_123 () : void {
      var __valueRangeArg = Exposure.Claim.RelatedCompanyArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_122(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=Title_Coverage) at PIPSummaryDV.pcf: line 36, column 38
    function verifyValueRange_17 () : void {
      var __valueRangeArg = Exposure.Claim.Policy.getCoveragesByCoverageType(Exposure.PrimaryCoverage)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_16(__valueRangeArg)
    }
    
    // 'valueRange' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function verifyValueRange_28 () : void {
      var __valueRangeArg = Exposure.Claim.Policy.CappedStatCodes
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_27(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=PIPDamages_Claimant) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_75 () : void {
      var __valueRangeArg = Exposure.Claim.getRelatedContacts(Exposure.getContactType(TC_CLAIMANT))
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_74(__valueRangeArg)
    }
    
    // 'valueType' attribute on ClaimContactInput (id=DisBenefits_Provider) at PIPSummaryDV.pcf: line 173, column 37
    function verifyValueType_126 () : void {
      var __valueTypeArg : entity.Company
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'visible' attribute on ClaimContactInput (id=DisBenefits_Provider) at ClaimContactWidget.xml: line 16, column 225
    function visible_111 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Exposure.disbenprovider), Exposure.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on TextInput (id=StatLine_Warning) at PIPSummaryDV.pcf: line 52, column 65
    function visible_33 () : java.lang.Boolean {
      return Exposure.Claim.Policy.StatCodeListCapped
    }
    
    // 'visible' attribute on InputSet at PIPSummaryDV.pcf: line 38, column 59
    function visible_37 () : java.lang.Boolean {
      return Exposure.Claim.Policy.StatCodingEnabled
    }
    
    // 'visible' attribute on ClaimContactInput (id=PIPDamages_Claimant) at ClaimContactWidget.xml: line 14, column 229
    function visible_60 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactInput (id=PIPDamages_Claimant) at ClaimContactWidget.xml: line 16, column 225
    function visible_63 () : java.lang.Boolean {
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