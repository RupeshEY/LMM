package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses java.util.Set
@javax.annotation.Generated("config/web/pcf/claim/exposures/ExposureDetailDV.Personalpropertydamage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ExposureDetailDV_PersonalpropertydamageExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/exposures/ExposureDetailDV.Personalpropertydamage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExposureDetailDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextInput (id=AssignedUser_Name) at ExposureDetailDV.Personalpropertydamage.pcf: line 81, column 53
    function action_41 () : void {
      UserContactDetailPopup.push(Exposure.AssignedUser)
    }
    
    // 'action' attribute on MenuItem (id=StatLine_PickerButton) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function action_55 () : void {
      ClaimPolicyStatCodePickerPopup.push(Exposure.Claim)
    }
    
    // 'action' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function action_57 () : void {
      ClaimPolicyStatCodePickerPopup.push(Exposure.Claim)
    }
    
    // 'action' attribute on PolicyStatCodePickerInput (id=StatLine) at ExposureDetailDV.Personalpropertydamage.pcf: line 103, column 67
    function action_65 () : void {
      ClaimPolicyStatCodePickerPopup.push(Exposure.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_85 () : void {
      AddressBookPickerPopup.push(statictypeof (Exposure.Claimant), Exposure.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 18, column 285
    function action_87 () : void {
      if (Exposure.Claimant != null) { ClaimContactDetailPopup.push(Exposure.Claimant, Exposure.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_88 () : void {
      ClaimContactDetailPopup.push(Exposure.Claimant, Exposure.Claim)
    }
    
    // 'action' attribute on TextInput (id=AssignedUser_Name) at ExposureDetailDV.Personalpropertydamage.pcf: line 81, column 53
    function action_dest_42 () : pcf.api.Destination {
      return pcf.UserContactDetailPopup.createDestination(Exposure.AssignedUser)
    }
    
    // 'action' attribute on MenuItem (id=StatLine_PickerButton) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function action_dest_56 () : pcf.api.Destination {
      return pcf.ClaimPolicyStatCodePickerPopup.createDestination(Exposure.Claim)
    }
    
    // 'action' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function action_dest_58 () : pcf.api.Destination {
      return pcf.ClaimPolicyStatCodePickerPopup.createDestination(Exposure.Claim)
    }
    
    // 'action' attribute on PolicyStatCodePickerInput (id=StatLine) at ExposureDetailDV.Personalpropertydamage.pcf: line 103, column 67
    function action_dest_66 () : pcf.api.Destination {
      return pcf.ClaimPolicyStatCodePickerPopup.createDestination(Exposure.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_86 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Exposure.Claimant), Exposure.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_89 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Exposure.Claimant, Exposure.Claim)
    }
    
    // 'available' attribute on TextInput (id=AssignedUser_Name) at ExposureDetailDV.Personalpropertydamage.pcf: line 81, column 53
    function available_38 () : java.lang.Boolean {
      return Exposure.AssignedUser.Contact != null
    }
    
    // 'condition' attribute on ReflectCondition at ExposureDetailDV.Personalpropertydamage.pcf: line 133, column 49
    function condition_77 (TRIGGER_INDEX :  int, VALUE :  typekey.LossPartyType) : java.lang.Boolean {
      return VALUE == TC_INSURED
    }
    
    // 'condition' attribute on ReflectCondition at ExposureDetailDV.Personalpropertydamage.pcf: line 150, column 46
    function condition_99 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Boolean {
      return Exposure.Claim.Insured==VALUE
    }
    
    // 'def' attribute on InputSetRef at ExposureDetailDV.Personalpropertydamage.pcf: line 198, column 55
    function def_onEnter_130 (def :  pcf.ExposureWorkloadInputSet) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on ListViewInput at ExposureDetailDV.Personalpropertydamage.pcf: line 252, column 125
    function def_onEnter_159 (def :  pcf.EditableOtherCoverageDetailsLV) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on InputSetRef (id=AppraisalServiceInputSet) at ExposureDetailDV.Personalpropertydamage.pcf: line 273, column 44
    function def_onEnter_165 (def :  pcf.AppraisalServiceInputSet) : void {
      def.onEnter(AppraisalServiceRequest, Exposure.MobilePropertyIncident, unusedServiceRequests, appraisalIncidentCode)
    }
    
    // 'def' attribute on InputSetRef at ExposureDetailDV.Personalpropertydamage.pcf: line 275, column 197
    function def_onEnter_167 (def :  pcf.OtherServicesLVInputGroupInputSet) : void {
      def.onEnter(Exposure.MobilePropertyIncident.Claim, Exposure.MobilePropertyIncident, otherServiceRequests, otherServiceRequests, unusedServiceRequests, {})
    }
    
    // 'def' attribute on PanelRef at ExposureDetailDV.Personalpropertydamage.pcf: line 315, column 39
    function def_onEnter_195 (def :  pcf.ISODetailsDV) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_82 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Exposure.Claimant), null, Exposure.Claim)
    }
    
    // 'def' attribute on InputSetRef at ExposureDetailDV.Personalpropertydamage.pcf: line 198, column 55
    function def_refreshVariables_131 (def :  pcf.ExposureWorkloadInputSet) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on ListViewInput at ExposureDetailDV.Personalpropertydamage.pcf: line 252, column 125
    function def_refreshVariables_160 (def :  pcf.EditableOtherCoverageDetailsLV) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on InputSetRef (id=AppraisalServiceInputSet) at ExposureDetailDV.Personalpropertydamage.pcf: line 273, column 44
    function def_refreshVariables_166 (def :  pcf.AppraisalServiceInputSet) : void {
      def.refreshVariables(AppraisalServiceRequest, Exposure.MobilePropertyIncident, unusedServiceRequests, appraisalIncidentCode)
    }
    
    // 'def' attribute on InputSetRef at ExposureDetailDV.Personalpropertydamage.pcf: line 275, column 197
    function def_refreshVariables_168 (def :  pcf.OtherServicesLVInputGroupInputSet) : void {
      def.refreshVariables(Exposure.MobilePropertyIncident.Claim, Exposure.MobilePropertyIncident, otherServiceRequests, otherServiceRequests, unusedServiceRequests, {})
    }
    
    // 'def' attribute on PanelRef at ExposureDetailDV.Personalpropertydamage.pcf: line 315, column 39
    function def_refreshVariables_196 (def :  pcf.ISODetailsDV) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_83 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Exposure.Claimant), null, Exposure.Claim)
    }
    
    // 'value' attribute on TypeKeyInput (id=Claimant_Type) at ExposureDetailDV.Personalpropertydamage.pcf: line 145, column 46
    function defaultSetter_103 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.ClaimantType = (__VALUE_TO_SET as typekey.ClaimantType)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claimant_ContactProhibited) at ExposureDetailDV.Personalpropertydamage.pcf: line 160, column 40
    function defaultSetter_107 (__VALUE_TO_SET :  java.lang.Object) : void {
      ContactProhibited = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextInput (id=ThirdPartyPropertyDamage_PropertyDescription) at ExposureDetailDV.Personalpropertydamage.pcf: line 184, column 67
    function defaultSetter_120 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.MobilePropertyIncident.PropertyDesc = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextAreaInput (id=ThirdPartyPropertyDamage_Description) at ExposureDetailDV.Personalpropertydamage.pcf: line 191, column 52
    function defaultSetter_124 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.Incident.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on CurrencyInput (id=ThirdPartyPropertyDamage_LossEstimate) at ExposureDetailDV.Personalpropertydamage.pcf: line 196, column 53
    function defaultSetter_128 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.Incident.LossEstimate = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on TypeKeyInput (id=ThirdPartyPropertyDamage_EstimatedReceived) at ExposureDetailDV.Personalpropertydamage.pcf: line 209, column 40
    function defaultSetter_134 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.MobilePropertyIncident.EstimatesReceived = (__VALUE_TO_SET as typekey.YesNo)
    }
    
    // 'value' attribute on CurrencyInput (id=ThirdPartyPropertyDamage_EstimateCost) at ExposureDetailDV.Personalpropertydamage.pcf: line 214, column 68
    function defaultSetter_138 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.MobilePropertyIncident.EstRepairCost = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on TextInput (id=ThirdPartyPropertyDamage_EstimateTime) at ExposureDetailDV.Personalpropertydamage.pcf: line 219, column 68
    function defaultSetter_142 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.MobilePropertyIncident.EstRepairTime = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=JurisdictionState) at ExposureDetailDV.Personalpropertydamage.pcf: line 239, column 47
    function defaultSetter_152 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.JurisdictionState = (__VALUE_TO_SET as typekey.Jurisdiction)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claimant_OtherCoverage) at ExposureDetailDV.Personalpropertydamage.pcf: line 248, column 45
    function defaultSetter_157 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.OtherCoverage = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on RangeInput (id=Coverage) at ExposureDetailDV.Personalpropertydamage.pcf: line 69, column 42
    function defaultSetter_28 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.Coverage = (__VALUE_TO_SET as entity.Coverage)
    }
    
    // 'value' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function defaultSetter_60 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.StatLine = (__VALUE_TO_SET as entity.StatCode)
    }
    
    // 'value' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_92 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.Claimant = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'filter' attribute on TypeKeyInput (id=JurisdictionState) at ExposureDetailDV.Personalpropertydamage.pcf: line 239, column 47
    function filter_154 (VALUE :  typekey.Jurisdiction, VALUES :  typekey.Jurisdiction[]) : java.lang.Boolean {
      return VALUE.hasCategory(JurisdictionType.TC_INSURANCE)
    }
    
    // 'initialValue' attribute on Variable at ExposureDetailDV.Personalpropertydamage.pcf: line 17, column 22
    function initialValue_0 () : String {
      return gw.vendormanagement.SpecialistServiceCodeConstants.PROPINSPECTAPPRAISAL
    }
    
    // 'initialValue' attribute on Variable at ExposureDetailDV.Personalpropertydamage.pcf: line 21, column 51
    function initialValue_1 () : java.util.Set<ServiceRequest> {
      return createOtherServiceRequests()
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function onPick_90 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Exposure.Claimant); var result = eval("Exposure.Claimant = Exposure.Claim.resolveContact(Exposure.Claimant) as " + contactType.Name + ";return null;"); ;
    }
    
    // Reflect at ExposureDetailDV.Personalpropertydamage.pcf: line 147, column 44
    function reflectionValue_100 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Object {
      return (Exposure.Claim.Insured==VALUE) ? ("insured") : (true) ? ("") : "<NOCHANGE>"
    }
    
    // 'value' attribute on Reflect at ExposureDetailDV.Personalpropertydamage.pcf: line 167, column 48
    function reflectionValue_108 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Object {
      return VALUE.PrimaryPhoneValue
    }
    
    // 'value' attribute on Reflect at ExposureDetailDV.Personalpropertydamage.pcf: line 175, column 57
    function reflectionValue_113 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Object {
      return VALUE.PrimaryAddressDisplayValue
    }
    
    // Reflect at ExposureDetailDV.Personalpropertydamage.pcf: line 130, column 38
    function reflectionValue_79 (TRIGGER_INDEX :  int, VALUE :  typekey.LossPartyType) : java.lang.Object {
      return (VALUE == TC_INSURED) ? (Exposure.Claim.Insured) : (true) ? ("") : "<NOCHANGE>"
    }
    
    // 'valueRange' attribute on RangeInput (id=Coverage) at ExposureDetailDV.Personalpropertydamage.pcf: line 69, column 42
    function valueRange_30 () : java.lang.Object {
      return Exposure.Claim.Policy.getCoveragesByCoverageType(Exposure.PrimaryCoverage)
    }
    
    // 'valueRange' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function valueRange_62 () : java.lang.Object {
      return Exposure.Claim.Policy.CappedStatCodes
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_94 () : java.lang.Object {
      return Exposure.Claim.getRelatedContacts(Exposure.getContactType(TC_CLAIMANT))
    }
    
    // 'value' attribute on TextInput (id=Claimant_PrimaryPhone) at ExposureDetailDV.Personalpropertydamage.pcf: line 164, column 57
    function valueRoot_112 () : java.lang.Object {
      return Exposure.Claimant
    }
    
    // 'value' attribute on TextInput (id=ThirdPartyPropertyDamage_PropertyDescription) at ExposureDetailDV.Personalpropertydamage.pcf: line 184, column 67
    function valueRoot_121 () : java.lang.Object {
      return Exposure.MobilePropertyIncident
    }
    
    // 'value' attribute on TextAreaInput (id=ThirdPartyPropertyDamage_Description) at ExposureDetailDV.Personalpropertydamage.pcf: line 191, column 52
    function valueRoot_125 () : java.lang.Object {
      return Exposure.Incident
    }
    
    // 'value' attribute on CurrencyInput (id=RemainingReserves) at ExposureDetailDV.Personalpropertydamage.pcf: line 285, column 64
    function valueRoot_174 () : java.lang.Object {
      return Exposure.ExposureRpt
    }
    
    // 'value' attribute on TypeKeyInput (id=LossParty) at ExposureDetailDV.Personalpropertydamage.pcf: line 35, column 48
    function valueRoot_4 () : java.lang.Object {
      return Exposure
    }
    
    // 'value' attribute on TypeKeyInput (id=PrimaryCoverage) at ExposureDetailDV.Personalpropertydamage.pcf: line 45, column 47
    function value_10 () : typekey.CoverageType {
      return Exposure.PrimaryCoverage
    }
    
    // 'value' attribute on TypeKeyInput (id=Claimant_Type) at ExposureDetailDV.Personalpropertydamage.pcf: line 145, column 46
    function value_101 () : typekey.ClaimantType {
      return Exposure.ClaimantType
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claimant_ContactProhibited) at ExposureDetailDV.Personalpropertydamage.pcf: line 160, column 40
    function value_105 () : java.lang.Boolean {
      return ContactProhibited
    }
    
    // 'value' attribute on TextInput (id=Claimant_PrimaryPhone) at ExposureDetailDV.Personalpropertydamage.pcf: line 164, column 57
    function value_110 () : java.lang.String {
      return Exposure.Claimant.PrimaryPhoneValue
    }
    
    // 'value' attribute on TextInput (id=Claimant_Address) at ExposureDetailDV.Personalpropertydamage.pcf: line 172, column 66
    function value_115 () : java.lang.String {
      return Exposure.Claimant.PrimaryAddressDisplayValue
    }
    
    // 'value' attribute on TextInput (id=ThirdPartyPropertyDamage_PropertyDescription) at ExposureDetailDV.Personalpropertydamage.pcf: line 184, column 67
    function value_118 () : java.lang.String {
      return Exposure.MobilePropertyIncident.PropertyDesc
    }
    
    // 'value' attribute on TextAreaInput (id=ThirdPartyPropertyDamage_Description) at ExposureDetailDV.Personalpropertydamage.pcf: line 191, column 52
    function value_122 () : java.lang.String {
      return Exposure.Incident.Description
    }
    
    // 'value' attribute on CurrencyInput (id=ThirdPartyPropertyDamage_LossEstimate) at ExposureDetailDV.Personalpropertydamage.pcf: line 196, column 53
    function value_126 () : gw.api.financials.CurrencyAmount {
      return Exposure.Incident.LossEstimate
    }
    
    // 'value' attribute on TypeKeyInput (id=ThirdPartyPropertyDamage_EstimatedReceived) at ExposureDetailDV.Personalpropertydamage.pcf: line 209, column 40
    function value_132 () : typekey.YesNo {
      return Exposure.MobilePropertyIncident.EstimatesReceived
    }
    
    // 'value' attribute on CurrencyInput (id=ThirdPartyPropertyDamage_EstimateCost) at ExposureDetailDV.Personalpropertydamage.pcf: line 214, column 68
    function value_136 () : gw.api.financials.CurrencyAmount {
      return Exposure.MobilePropertyIncident.EstRepairCost
    }
    
    // 'value' attribute on TypeKeyInput (id=ClosedOutcome) at ExposureDetailDV.Personalpropertydamage.pcf: line 51, column 54
    function value_14 () : typekey.ExposureClosedOutcomeType {
      return Exposure.ClosedOutcome
    }
    
    // 'value' attribute on TextInput (id=ThirdPartyPropertyDamage_EstimateTime) at ExposureDetailDV.Personalpropertydamage.pcf: line 219, column 68
    function value_140 () : java.lang.String {
      return Exposure.MobilePropertyIncident.EstRepairTime
    }
    
    // 'value' attribute on TypeKeyInput (id=Segment) at ExposureDetailDV.Personalpropertydamage.pcf: line 227, column 47
    function value_144 () : typekey.ClaimSegment {
      return Exposure.Segment
    }
    
    // 'value' attribute on TypeKeyInput (id=Strategy) at ExposureDetailDV.Personalpropertydamage.pcf: line 232, column 48
    function value_147 () : typekey.ClaimStrategy {
      return Exposure.Strategy
    }
    
    // 'value' attribute on TypeKeyInput (id=JurisdictionState) at ExposureDetailDV.Personalpropertydamage.pcf: line 239, column 47
    function value_150 () : typekey.Jurisdiction {
      return Exposure.JurisdictionState
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claimant_OtherCoverage) at ExposureDetailDV.Personalpropertydamage.pcf: line 248, column 45
    function value_155 () : java.lang.Boolean {
      return Exposure.OtherCoverage
    }
    
    // 'value' attribute on CurrencyInput (id=RemainingReserves) at ExposureDetailDV.Personalpropertydamage.pcf: line 285, column 64
    function value_171 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.RemainingReserves
    }
    
    // 'value' attribute on CurrencyInput (id=FuturePayments) at ExposureDetailDV.Personalpropertydamage.pcf: line 290, column 64
    function value_176 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.FuturePayments
    }
    
    // 'value' attribute on TypeKeyInput (id=CoverageSubType) at ExposureDetailDV.Personalpropertydamage.pcf: line 56, column 50
    function value_18 () : typekey.CoverageSubtype {
      return Exposure.CoverageSubType
    }
    
    // 'value' attribute on CurrencyInput (id=TotalPayments) at ExposureDetailDV.Personalpropertydamage.pcf: line 295, column 64
    function value_181 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.TotalPayments
    }
    
    // 'value' attribute on CurrencyInput (id=TotalRecoveries) at ExposureDetailDV.Personalpropertydamage.pcf: line 300, column 66
    function value_186 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.TotalRecoveries
    }
    
    // 'value' attribute on CurrencyInput (id=TotalIncurredNet) at ExposureDetailDV.Personalpropertydamage.pcf: line 306, column 72
    function value_191 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.TotalIncurredNet
    }
    
    // 'value' attribute on TypeKeyInput (id=LossParty) at ExposureDetailDV.Personalpropertydamage.pcf: line 35, column 48
    function value_2 () : typekey.LossPartyType {
      return Exposure.LossParty
    }
    
    // 'value' attribute on DateInput (id=ReOpenDate) at ExposureDetailDV.Personalpropertydamage.pcf: line 62, column 54
    function value_22 () : java.util.Date {
      return Exposure.ReOpenDate
    }
    
    // 'value' attribute on RangeInput (id=Coverage) at ExposureDetailDV.Personalpropertydamage.pcf: line 69, column 42
    function value_26 () : entity.Coverage {
      return Exposure.Coverage
    }
    
    // 'value' attribute on TypeKeyInput (id=ReopenedReason) at ExposureDetailDV.Personalpropertydamage.pcf: line 75, column 54
    function value_34 () : typekey.ExposureReopenedReason {
      return Exposure.ReopenedReason
    }
    
    // 'value' attribute on TextInput (id=AssignedUser_Name) at ExposureDetailDV.Personalpropertydamage.pcf: line 81, column 53
    function value_39 () : java.lang.String {
      return Exposure.AssigneeDisplayString
    }
    
    // 'value' attribute on TextInput (id=AssignedGroup_Name) at ExposureDetailDV.Personalpropertydamage.pcf: line 85, column 62
    function value_45 () : java.lang.String {
      return Exposure.AssigneeGroupOnlyDisplayString
    }
    
    // 'value' attribute on TypeKeyInput (id=State) at ExposureDetailDV.Personalpropertydamage.pcf: line 90, column 48
    function value_48 () : typekey.ExposureState {
      return Exposure.State
    }
    
    // 'value' attribute on DateInput (id=CreateTime) at ExposureDetailDV.Personalpropertydamage.pcf: line 94, column 42
    function value_51 () : java.util.Date {
      return Exposure.CreateTime
    }
    
    // 'value' attribute on PolicyStatCodePickerInput (id=StatLine) at ExposureDetailDV.Personalpropertydamage.pcf: line 103, column 67
    function value_54 () : entity.StatCode {
      return Exposure.StatLine
    }
    
    // 'value' attribute on DateInput (id=ClosedDate) at ExposureDetailDV.Personalpropertydamage.pcf: line 40, column 54
    function value_6 () : java.util.Date {
      return Exposure.CloseDate
    }
    
    // 'value' attribute on TextInput (id=StatLine_Warning) at ExposureDetailDV.Personalpropertydamage.pcf: line 110, column 69
    function value_70 () : java.lang.String {
      return DisplayKey.get("Java.StatCodes.StatCodeListCappedWarning", Exposure.Claim.Policy.StatCodeListCap, Exposure.Claim.Policy.StatCodes.length)
    }
    
    // 'value' attribute on TypeKeyInput (id=ValidationLevel) at ExposureDetailDV.Personalpropertydamage.pcf: line 117, column 50
    function value_74 () : typekey.ValidationLevel {
      return Exposure.ValidationLevel
    }
    
    // 'value' attribute on ReflectCondition at ExposureDetailDV.Personalpropertydamage.pcf: line 133, column 49
    function value_78 (TRIGGER_INDEX :  int, VALUE :  typekey.LossPartyType) : java.lang.Object {
      return Exposure.Claim.Insured
    }
    
    // 'value' attribute on ClaimContactInput (id=Claimant_Picker) at ExposureDetailDV.Personalpropertydamage.pcf: line 128, column 98
    function value_80 () : entity.Contact {
      return Exposure.Claimant
    }
    
    // 'valueRange' attribute on RangeInput (id=Coverage) at ExposureDetailDV.Personalpropertydamage.pcf: line 69, column 42
    function verifyValueRangeIsAllowedType_31 ($$arg :  entity.Coverage[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Coverage) at ExposureDetailDV.Personalpropertydamage.pcf: line 69, column 42
    function verifyValueRangeIsAllowedType_31 ($$arg :  gw.api.database.IQueryBeanResult<entity.Coverage>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Coverage) at ExposureDetailDV.Personalpropertydamage.pcf: line 69, column 42
    function verifyValueRangeIsAllowedType_31 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function verifyValueRangeIsAllowedType_63 ($$arg :  entity.StatCode[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function verifyValueRangeIsAllowedType_63 ($$arg :  gw.api.database.IQueryBeanResult<entity.StatCode>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function verifyValueRangeIsAllowedType_63 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_95 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_95 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_95 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Coverage) at ExposureDetailDV.Personalpropertydamage.pcf: line 69, column 42
    function verifyValueRange_32 () : void {
      var __valueRangeArg = Exposure.Claim.Policy.getCoveragesByCoverageType(Exposure.PrimaryCoverage)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_31(__valueRangeArg)
    }
    
    // 'valueRange' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function verifyValueRange_64 () : void {
      var __valueRangeArg = Exposure.Claim.Policy.CappedStatCodes
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_63(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_96 () : void {
      var __valueRangeArg = Exposure.Claim.getRelatedContacts(Exposure.getContactType(TC_CLAIMANT))
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_95(__valueRangeArg)
    }
    
    // 'visible' attribute on TextInput (id=ServiceRequestSubmitMessageFNOL) at ExposureDetailDV.Personalpropertydamage.pcf: line 265, column 50
    function visible_161 () : java.lang.Boolean {
      return Exposure.Claim.DraftClaim
    }
    
    // 'visible' attribute on TextInput (id=ServiceRequestSubmitMessage) at ExposureDetailDV.Personalpropertydamage.pcf: line 270, column 85
    function visible_163 () : java.lang.Boolean {
      return not Exposure.Claim.DraftClaim and CurrentLocation.InEditMode
    }
    
    // 'visible' attribute on Label at ExposureDetailDV.Personalpropertydamage.pcf: line 279, column 74
    function visible_169 () : java.lang.Boolean {
      return perm.Claim.viewtransactiondetails(Exposure.Claim)
    }
    
    // 'visible' attribute on CurrencyInput (id=RemainingReserves) at ExposureDetailDV.Personalpropertydamage.pcf: line 285, column 64
    function visible_170 () : java.lang.Boolean {
      return perm.Claim.viewreserves(Exposure.Claim)
    }
    
    // 'visible' attribute on CurrencyInput (id=FuturePayments) at ExposureDetailDV.Personalpropertydamage.pcf: line 290, column 64
    function visible_175 () : java.lang.Boolean {
      return perm.Claim.viewpayments(Exposure.Claim)
    }
    
    // 'visible' attribute on CurrencyInput (id=TotalRecoveries) at ExposureDetailDV.Personalpropertydamage.pcf: line 300, column 66
    function visible_185 () : java.lang.Boolean {
      return perm.Claim.viewrecoveries(Exposure.Claim)
    }
    
    // 'visible' attribute on CurrencyInput (id=TotalIncurredNet) at ExposureDetailDV.Personalpropertydamage.pcf: line 306, column 72
    function visible_190 () : java.lang.Boolean {
      return perm.Claim.viewnettotalincurred(Exposure.Claim)
    }
    
    // 'visible' attribute on Card (id=Exposure_ISOCard) at ExposureDetailDV.Personalpropertydamage.pcf: line 313, column 56
    function visible_197 () : java.lang.Boolean {
      return !Exposure.Claim.ISOClaimLevelMessaging
    }
    
    // 'visible' attribute on DateInput (id=ReOpenDate) at ExposureDetailDV.Personalpropertydamage.pcf: line 62, column 54
    function visible_21 () : java.lang.Boolean {
      return  Exposure.ReOpenDate != null 
    }
    
    // 'visible' attribute on DateInput (id=ClosedDate) at ExposureDetailDV.Personalpropertydamage.pcf: line 40, column 54
    function visible_5 () : java.lang.Boolean {
      return  Exposure.State == TC_CLOSED 
    }
    
    // 'visible' attribute on TextInput (id=StatLine_Warning) at ExposureDetailDV.Personalpropertydamage.pcf: line 110, column 69
    function visible_69 () : java.lang.Boolean {
      return Exposure.Claim.Policy.StatCodeListCapped
    }
    
    // 'visible' attribute on InputSet at ExposureDetailDV.Personalpropertydamage.pcf: line 96, column 63
    function visible_73 () : java.lang.Boolean {
      return Exposure.Claim.Policy.StatCodingEnabled
    }
    
    // 'visible' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 14, column 229
    function visible_81 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 16, column 225
    function visible_84 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Exposure.Claimant), Exposure.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    property get Exposure () : Exposure {
      return getRequireValue("Exposure", 0) as Exposure
    }
    
    property set Exposure ($arg :  Exposure) {
      setRequireValue("Exposure", 0, $arg)
    }
    
    property get appraisalIncidentCode () : String {
      return getVariableValue("appraisalIncidentCode", 0) as String
    }
    
    property set appraisalIncidentCode ($arg :  String) {
      setVariableValue("appraisalIncidentCode", 0, $arg)
    }
    
    property get otherServiceRequests () : java.util.Set<ServiceRequest> {
      return getVariableValue("otherServiceRequests", 0) as java.util.Set<ServiceRequest>
    }
    
    property set otherServiceRequests ($arg :  java.util.Set<ServiceRequest>) {
      setVariableValue("otherServiceRequests", 0, $arg)
    }
    
    property get unusedServiceRequests () : java.util.Set<ServiceRequest> {
      return getRequireValue("unusedServiceRequests", 0) as java.util.Set<ServiceRequest>
    }
    
    property set unusedServiceRequests ($arg :  java.util.Set<ServiceRequest>) {
      setRequireValue("unusedServiceRequests", 0, $arg)
    }
    
    
    function findServiceRequest(serviceCode : String) : ServiceRequest {
      return Exposure.MobilePropertyIncident.ServiceRequests.firstWhere(\ sr ->
          sr.Instruction.Services.Count == 1
              and sr.Instruction.Services.single().Service.Code == serviceCode
              and (otherServiceRequests == null or not otherServiceRequests.contains(sr))
      )
    }
    
    property get AppraisalServiceRequest() : ServiceRequest {
      return findServiceRequest(appraisalIncidentCode)
    }
    
    function createOtherServiceRequests() :  Set<ServiceRequest> {
      return Exposure.MobilePropertyIncident.ServiceRequests.where(\sr -> sr != AppraisalServiceRequest).toSet()
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