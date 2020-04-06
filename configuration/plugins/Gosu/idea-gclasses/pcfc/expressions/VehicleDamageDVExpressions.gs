package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/vehicle/VehicleDamageDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class VehicleDamageDVExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/vehicle/VehicleDamageDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VehicleDamageDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=VehicleDamageDV_NewIncidentMenuItem) at VehicleDamageDV.pcf: line 192, column 104
    function action_121 () : void {
      NewVehicleIncidentPopup.push(Exposure.Claim)
    }
    
    // 'action' attribute on MenuItem (id=VehicleDamageDV_EditIncidentMenuItem) at VehicleDamageDV.pcf: line 197, column 105
    function action_123 () : void {
      EditVehicleIncidentPopup.push(Exposure.VehicleIncident, true)
    }
    
    // 'action' attribute on MenuItem (id=VehicleDamageDV_ViewIncidentMenuItem) at VehicleDamageDV.pcf: line 202, column 105
    function action_125 () : void {
      EditVehicleIncidentPopup.push(Exposure.VehicleIncident, false)
    }
    
    // 'action' attribute on TextInput (id=AssignedUser_Name) at VehicleDamageDV.pcf: line 75, column 49
    function action_42 () : void {
      UserContactDetailPopup.push(Exposure.AssignedUser)
    }
    
    // 'action' attribute on MenuItem (id=StatLine_PickerButton) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function action_56 () : void {
      ClaimPolicyStatCodePickerPopup.push(Exposure.Claim)
    }
    
    // 'action' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function action_58 () : void {
      ClaimPolicyStatCodePickerPopup.push(Exposure.Claim)
    }
    
    // 'action' attribute on PolicyStatCodePickerInput (id=StatLine) at VehicleDamageDV.pcf: line 97, column 63
    function action_66 () : void {
      ClaimPolicyStatCodePickerPopup.push(Exposure.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_86 () : void {
      AddressBookPickerPopup.push(statictypeof (Exposure.Claimant), Exposure.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 18, column 285
    function action_88 () : void {
      if (Exposure.Claimant != null) { ClaimContactDetailPopup.push(Exposure.Claimant, Exposure.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_89 () : void {
      ClaimContactDetailPopup.push(Exposure.Claimant, Exposure.Claim)
    }
    
    // 'action' attribute on MenuItem (id=VehicleDamageDV_NewIncidentMenuItem) at VehicleDamageDV.pcf: line 192, column 104
    function action_dest_122 () : pcf.api.Destination {
      return pcf.NewVehicleIncidentPopup.createDestination(Exposure.Claim)
    }
    
    // 'action' attribute on MenuItem (id=VehicleDamageDV_EditIncidentMenuItem) at VehicleDamageDV.pcf: line 197, column 105
    function action_dest_124 () : pcf.api.Destination {
      return pcf.EditVehicleIncidentPopup.createDestination(Exposure.VehicleIncident, true)
    }
    
    // 'action' attribute on MenuItem (id=VehicleDamageDV_ViewIncidentMenuItem) at VehicleDamageDV.pcf: line 202, column 105
    function action_dest_126 () : pcf.api.Destination {
      return pcf.EditVehicleIncidentPopup.createDestination(Exposure.VehicleIncident, false)
    }
    
    // 'action' attribute on TextInput (id=AssignedUser_Name) at VehicleDamageDV.pcf: line 75, column 49
    function action_dest_43 () : pcf.api.Destination {
      return pcf.UserContactDetailPopup.createDestination(Exposure.AssignedUser)
    }
    
    // 'action' attribute on MenuItem (id=StatLine_PickerButton) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function action_dest_57 () : pcf.api.Destination {
      return pcf.ClaimPolicyStatCodePickerPopup.createDestination(Exposure.Claim)
    }
    
    // 'action' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function action_dest_59 () : pcf.api.Destination {
      return pcf.ClaimPolicyStatCodePickerPopup.createDestination(Exposure.Claim)
    }
    
    // 'action' attribute on PolicyStatCodePickerInput (id=StatLine) at VehicleDamageDV.pcf: line 97, column 63
    function action_dest_67 () : pcf.api.Destination {
      return pcf.ClaimPolicyStatCodePickerPopup.createDestination(Exposure.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_87 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Exposure.Claimant), Exposure.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_90 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Exposure.Claimant, Exposure.Claim)
    }
    
    // 'available' attribute on TextInput (id=AssignedUser_Name) at VehicleDamageDV.pcf: line 75, column 49
    function available_39 () : java.lang.Boolean {
      return Exposure.AssignedUser.Contact != null
    }
    
    // 'condition' attribute on ReflectCondition at VehicleDamageDV.pcf: line 144, column 42
    function condition_100 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Boolean {
      return Exposure.Claim.Insured==VALUE
    }
    
    // 'condition' attribute on ReflectCondition at VehicleDamageDV.pcf: line 127, column 45
    function condition_78 (TRIGGER_INDEX :  int, VALUE :  typekey.LossPartyType) : java.lang.Boolean {
      return VALUE == TC_INSURED
    }
    
    // 'def' attribute on InputSetRef at VehicleDamageDV.pcf: line 238, column 51
    function def_onEnter_153 (def :  pcf.ExposureWorkloadInputSet) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on ListViewInput at VehicleDamageDV.pcf: line 272, column 110
    function def_onEnter_170 (def :  pcf.EditableOtherCoverageDetailsLV) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_83 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Exposure.Claimant), null, Exposure.Claim)
    }
    
    // 'def' attribute on InputSetRef at VehicleDamageDV.pcf: line 238, column 51
    function def_refreshVariables_154 (def :  pcf.ExposureWorkloadInputSet) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on ListViewInput at VehicleDamageDV.pcf: line 272, column 110
    function def_refreshVariables_171 (def :  pcf.EditableOtherCoverageDetailsLV) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_84 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Exposure.Claimant), null, Exposure.Claim)
    }
    
    // 'value' attribute on TypeKeyInput (id=Claimant_Type) at VehicleDamageDV.pcf: line 139, column 42
    function defaultSetter_104 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.ClaimantType = (__VALUE_TO_SET as typekey.ClaimantType)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claimant_ContactProhibited) at VehicleDamageDV.pcf: line 154, column 36
    function defaultSetter_108 (__VALUE_TO_SET :  java.lang.Object) : void {
      ContactProhibited = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on RangeInput (id=Vehicle_Incident) at VehicleDamageDV.pcf: line 184, column 44
    function defaultSetter_128 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.VehicleIncident = (__VALUE_TO_SET as entity.VehicleIncident)
    }
    
    // 'value' attribute on TypeKeyInput (id=JurisdictionState) at VehicleDamageDV.pcf: line 259, column 43
    function defaultSetter_163 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.JurisdictionState = (__VALUE_TO_SET as typekey.Jurisdiction)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claimant_OtherCoverage) at VehicleDamageDV.pcf: line 268, column 41
    function defaultSetter_168 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.OtherCoverage = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=DeductibleWaived) at VehicleDamageDV.pcf: line 318, column 61
    function defaultSetter_208 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.Coverage.ClaimDeductible.Waived = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CurrencyInput (id=DeductibleAmount) at VehicleDamageDV.pcf: line 329, column 62
    function defaultSetter_218 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.Coverage.ClaimDeductible.Amount = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on BooleanRadioInput (id=DeductibleOverridden) at VehicleDamageDV.pcf: line 340, column 61
    function defaultSetter_232 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.Coverage.ClaimDeductible.Overridden = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextInput (id=DeductibleEditReason) at VehicleDamageDV.pcf: line 350, column 41
    function defaultSetter_240 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.Coverage.ClaimDeductible.EditReason = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on RangeInput (id=Coverage) at VehicleDamageDV.pcf: line 60, column 37
    function defaultSetter_30 (__VALUE_TO_SET :  java.lang.Object) : void {
      coverage = (__VALUE_TO_SET as entity.Coverage)
    }
    
    // 'value' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function defaultSetter_61 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.StatLine = (__VALUE_TO_SET as entity.StatCode)
    }
    
    // 'value' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_93 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.Claimant = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'editable' attribute on BooleanRadioInput (id=DeductibleWaived) at VehicleDamageDV.pcf: line 318, column 61
    function editable_200 () : java.lang.Boolean {
      return !Exposure.Coverage.ClaimDeductible.Paid and canEditDeductible
    }
    
    // 'editable' attribute on CurrencyInput (id=DeductibleAmount) at VehicleDamageDV.pcf: line 329, column 62
    function editable_210 () : java.lang.Boolean {
      return Exposure.Coverage.ClaimDeductible.Overridden and !Exposure.Coverage.ClaimDeductible.Paid and !Exposure.Coverage.ClaimDeductible.Waived and canEditDeductible
    }
    
    // 'editable' attribute on BooleanRadioInput (id=DeductibleOverridden) at VehicleDamageDV.pcf: line 340, column 61
    function editable_226 () : java.lang.Boolean {
      return !Exposure.Coverage.ClaimDeductible.Paid and !Exposure.Coverage.ClaimDeductible.Waived and canEditDeductible
    }
    
    // 'editable' attribute on RangeInput (id=Coverage) at VehicleDamageDV.pcf: line 60, column 37
    function editable_26 () : java.lang.Boolean {
      return Exposure.Coverage == null or Exposure.Coverage.IsEditable
    }
    
    // 'filter' attribute on TypeKeyInput (id=JurisdictionState) at VehicleDamageDV.pcf: line 259, column 43
    function filter_165 (VALUE :  typekey.Jurisdiction, VALUES :  typekey.Jurisdiction[]) : java.lang.Boolean {
      return VALUE.hasCategory(JurisdictionType.TC_INSURANCE)
    }
    
    // 'initialValue' attribute on Variable at VehicleDamageDV.pcf: line 16, column 24
    function initialValue_0 () : Coverage {
      return Exposure.Coverage
    }
    
    // 'onChange' attribute on PostOnChange at VehicleDamageDV.pcf: line 320, column 41
    function onChange_199 () : void {
      clearEditReason()
    }
    
    // 'onChange' attribute on PostOnChange at VehicleDamageDV.pcf: line 342, column 96
    function onChange_225 () : void {
      Exposure.Coverage.ClaimDeductible.recalculateAmount(); clearEditReason()
    }
    
    // 'onChange' attribute on PostOnChange at VehicleDamageDV.pcf: line 62, column 45
    function onChange_25 () : void {
      setCoverage(coverage)
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function onPick_91 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Exposure.Claimant); var result = eval("Exposure.Claimant = Exposure.Claim.resolveContact(Exposure.Claimant) as " + contactType.Name + ";return null;"); ;
    }
    
    // Reflect at VehicleDamageDV.pcf: line 141, column 40
    function reflectionValue_101 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Object {
      return (Exposure.Claim.Insured==VALUE) ? ("insured") : (true) ? ("") : "<NOCHANGE>"
    }
    
    // 'value' attribute on Reflect at VehicleDamageDV.pcf: line 161, column 44
    function reflectionValue_109 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Object {
      return VALUE.PrimaryPhoneValue
    }
    
    // 'value' attribute on Reflect at VehicleDamageDV.pcf: line 171, column 53
    function reflectionValue_114 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Object {
      return VALUE.PrimaryAddressDisplayValue
    }
    
    // 'value' attribute on Reflect at VehicleDamageDV.pcf: line 211, column 33
    function reflectionValue_133 (TRIGGER_INDEX :  int, VALUE :  entity.VehicleIncident) : java.lang.Object {
      return VALUE.driver
    }
    
    // 'value' attribute on Reflect at VehicleDamageDV.pcf: line 219, column 38
    function reflectionValue_138 (TRIGGER_INDEX :  int, VALUE :  entity.VehicleIncident) : java.lang.Object {
      return VALUE.Description
    }
    
    // 'value' attribute on Reflect at VehicleDamageDV.pcf: line 227, column 42
    function reflectionValue_143 (TRIGGER_INDEX :  int, VALUE :  entity.VehicleIncident) : java.lang.Object {
      return VALUE.VehicleOperable
    }
    
    // 'value' attribute on Reflect at VehicleDamageDV.pcf: line 235, column 39
    function reflectionValue_148 (TRIGGER_INDEX :  int, VALUE :  entity.VehicleIncident) : java.lang.Object {
      return VALUE.LossEstimate
    }
    
    // Reflect at VehicleDamageDV.pcf: line 124, column 34
    function reflectionValue_80 (TRIGGER_INDEX :  int, VALUE :  typekey.LossPartyType) : java.lang.Object {
      return (VALUE == TC_INSURED) ? (Exposure.Claim.Insured) : (true) ? ("") : "<NOCHANGE>"
    }
    
    // 'validationExpression' attribute on BooleanRadioInput (id=DeductibleWaived) at VehicleDamageDV.pcf: line 318, column 61
    function validationExpression_201 () : java.lang.Object {
      return Exposure.Coverage.ClaimDeductible.Waived ? (Exposure.Coverage.ClaimDeductible.Amount <= Exposure.Coverage.Deductible ? null : DisplayKey.get("Deductible.AmountCannotExceedOriginal", gw.api.util.CurrencyUtil.renderAsCurrency(Exposure.Coverage.Deductible))) : null
    }
    
    // 'validationExpression' attribute on CurrencyInput (id=DeductibleAmount) at VehicleDamageDV.pcf: line 329, column 62
    function validationExpression_211 () : java.lang.Object {
      return Exposure.Coverage.ClaimDeductible.Amount <= Exposure.Coverage.Deductible ? null : DisplayKey.get("Deductible.AmountCannotExceedOriginal", gw.api.util.CurrencyUtil.renderAsCurrency(Exposure.Coverage.Deductible))
    }
    
    // 'valueRange' attribute on Reflect at VehicleDamageDV.pcf: line 187, column 82
    function valueRange_119 (TRIGGER_INDEX :  int, VALUE :  typekey.LossPartyType) : java.lang.Object {
      return Exposure.getVehicleIncidentsWithMatchingLossParty(VALUE)
    }
    
    // 'valueRange' attribute on RangeInput (id=Vehicle_Incident) at VehicleDamageDV.pcf: line 184, column 44
    function valueRange_130 () : java.lang.Object {
      return Exposure.getVehicleIncidentsWithMatchingLossParty(Exposure.LossParty)
    }
    
    // 'valueRange' attribute on RangeInput (id=Coverage) at VehicleDamageDV.pcf: line 60, column 37
    function valueRange_31 () : java.lang.Object {
      return Exposure.Claim.Policy.getCoveragesByCoverageType(Exposure.PrimaryCoverage)
    }
    
    // 'valueRange' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function valueRange_63 () : java.lang.Object {
      return Exposure.Claim.Policy.CappedStatCodes
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_95 () : java.lang.Object {
      return Exposure.Claim.getRelatedContacts(Exposure.getContactType(TC_CLAIMANT))
    }
    
    // 'value' attribute on TextInput (id=Claimant_PrimaryPhone) at VehicleDamageDV.pcf: line 158, column 53
    function valueRoot_113 () : java.lang.Object {
      return Exposure.Claimant
    }
    
    // 'value' attribute on TextInput (id=Incident_Driver) at VehicleDamageDV.pcf: line 208, column 35
    function valueRoot_137 () : java.lang.Object {
      return Exposure.VehicleIncident
    }
    
    // 'value' attribute on CurrencyInput (id=RemainingReserves) at VehicleDamageDV.pcf: line 287, column 60
    function valueRoot_177 () : java.lang.Object {
      return Exposure.ExposureRpt
    }
    
    // 'value' attribute on BooleanRadioInput (id=DeductibleWaived) at VehicleDamageDV.pcf: line 318, column 61
    function valueRoot_209 () : java.lang.Object {
      return Exposure.Coverage.ClaimDeductible
    }
    
    // 'value' attribute on TypeKeyInput (id=LossParty) at VehicleDamageDV.pcf: line 25, column 44
    function valueRoot_3 () : java.lang.Object {
      return Exposure
    }
    
    // 'value' attribute on TypeKeyInput (id=LossParty) at VehicleDamageDV.pcf: line 25, column 44
    function value_1 () : typekey.LossPartyType {
      return Exposure.LossParty
    }
    
    // 'value' attribute on TypeKeyInput (id=Claimant_Type) at VehicleDamageDV.pcf: line 139, column 42
    function value_102 () : typekey.ClaimantType {
      return Exposure.ClaimantType
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claimant_ContactProhibited) at VehicleDamageDV.pcf: line 154, column 36
    function value_106 () : java.lang.Boolean {
      return ContactProhibited
    }
    
    // 'value' attribute on TextInput (id=Claimant_PrimaryPhone) at VehicleDamageDV.pcf: line 158, column 53
    function value_111 () : java.lang.String {
      return Exposure.Claimant.PrimaryPhoneValue
    }
    
    // 'value' attribute on TextAreaInput (id=Claimant_Address) at VehicleDamageDV.pcf: line 168, column 62
    function value_116 () : java.lang.String {
      return Exposure.Claimant.PrimaryAddressDisplayValue
    }
    
    // 'value' attribute on RangeInput (id=Vehicle_Incident) at VehicleDamageDV.pcf: line 184, column 44
    function value_120 () : entity.VehicleIncident {
      return Exposure.VehicleIncident
    }
    
    // 'value' attribute on TypeKeyInput (id=ClosedOutcome) at VehicleDamageDV.pcf: line 41, column 50
    function value_13 () : typekey.ExposureClosedOutcomeType {
      return Exposure.ClosedOutcome
    }
    
    // 'value' attribute on TextInput (id=Incident_Driver) at VehicleDamageDV.pcf: line 208, column 35
    function value_135 () : entity.Person {
      return Exposure.VehicleIncident.driver
    }
    
    // 'value' attribute on TextInput (id=Incident_Description) at VehicleDamageDV.pcf: line 216, column 54
    function value_140 () : java.lang.String {
      return Exposure.VehicleIncident.Description
    }
    
    // 'value' attribute on BooleanRadioInput (id=Incident_VehicleOperable) at VehicleDamageDV.pcf: line 224, column 58
    function value_145 () : java.lang.Boolean {
      return Exposure.VehicleIncident.VehicleOperable
    }
    
    // 'value' attribute on CurrencyInput (id=Incident_LossEstimate) at VehicleDamageDV.pcf: line 232, column 55
    function value_150 () : gw.api.financials.CurrencyAmount {
      return Exposure.VehicleIncident.LossEstimate
    }
    
    // 'value' attribute on TypeKeyInput (id=Segment) at VehicleDamageDV.pcf: line 247, column 43
    function value_155 () : typekey.ClaimSegment {
      return Exposure.Segment
    }
    
    // 'value' attribute on TypeKeyInput (id=Strategy) at VehicleDamageDV.pcf: line 252, column 44
    function value_158 () : typekey.ClaimStrategy {
      return Exposure.Strategy
    }
    
    // 'value' attribute on TypeKeyInput (id=JurisdictionState) at VehicleDamageDV.pcf: line 259, column 43
    function value_161 () : typekey.Jurisdiction {
      return Exposure.JurisdictionState
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claimant_OtherCoverage) at VehicleDamageDV.pcf: line 268, column 41
    function value_166 () : java.lang.Boolean {
      return Exposure.OtherCoverage
    }
    
    // 'value' attribute on TypeKeyInput (id=CoverageSubType) at VehicleDamageDV.pcf: line 46, column 46
    function value_17 () : typekey.CoverageSubtype {
      return Exposure.CoverageSubType
    }
    
    // 'value' attribute on CurrencyInput (id=RemainingReserves) at VehicleDamageDV.pcf: line 287, column 60
    function value_174 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.RemainingReserves
    }
    
    // 'value' attribute on CurrencyInput (id=FuturePayments) at VehicleDamageDV.pcf: line 292, column 60
    function value_179 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.FuturePayments
    }
    
    // 'value' attribute on CurrencyInput (id=TotalPayments) at VehicleDamageDV.pcf: line 297, column 60
    function value_184 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.TotalPayments
    }
    
    // 'value' attribute on CurrencyInput (id=TotalRecoveries) at VehicleDamageDV.pcf: line 302, column 62
    function value_189 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.TotalRecoveries
    }
    
    // 'value' attribute on CurrencyInput (id=TotalIncurredNet) at VehicleDamageDV.pcf: line 308, column 68
    function value_194 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.TotalIncurredNet
    }
    
    // 'value' attribute on BooleanRadioInput (id=DeductibleWaived) at VehicleDamageDV.pcf: line 318, column 61
    function value_203 () : java.lang.Boolean {
      return Exposure.Coverage.ClaimDeductible.Waived
    }
    
    // 'value' attribute on DateInput (id=ReOpenDate) at VehicleDamageDV.pcf: line 52, column 50
    function value_21 () : java.util.Date {
      return Exposure.ReOpenDate
    }
    
    // 'value' attribute on CurrencyInput (id=DeductibleAmount) at VehicleDamageDV.pcf: line 329, column 62
    function value_213 () : gw.api.financials.CurrencyAmount {
      return Exposure.Coverage.ClaimDeductible.Amount
    }
    
    // 'value' attribute on BooleanRadioInput (id=DeductiblePaid) at VehicleDamageDV.pcf: line 334, column 62
    function value_221 () : java.lang.Boolean {
      return Exposure.Coverage.ClaimDeductible.Paid
    }
    
    // 'value' attribute on BooleanRadioInput (id=DeductibleOverridden) at VehicleDamageDV.pcf: line 340, column 61
    function value_228 () : java.lang.Boolean {
      return Exposure.Coverage.ClaimDeductible.Overridden
    }
    
    // 'value' attribute on TextInput (id=DeductibleEditReason) at VehicleDamageDV.pcf: line 350, column 41
    function value_236 () : java.lang.String {
      return Exposure.Coverage.ClaimDeductible.EditReason
    }
    
    // 'value' attribute on RangeInput (id=Coverage) at VehicleDamageDV.pcf: line 60, column 37
    function value_27 () : entity.Coverage {
      return coverage
    }
    
    // 'value' attribute on TypeKeyInput (id=ReopenedReason) at VehicleDamageDV.pcf: line 69, column 50
    function value_35 () : typekey.ExposureReopenedReason {
      return Exposure.ReopenedReason
    }
    
    // 'value' attribute on TextInput (id=AssignedUser_Name) at VehicleDamageDV.pcf: line 75, column 49
    function value_40 () : java.lang.String {
      return Exposure.AssigneeDisplayString
    }
    
    // 'value' attribute on TextInput (id=AssignedGroup_Name) at VehicleDamageDV.pcf: line 79, column 58
    function value_46 () : java.lang.String {
      return Exposure.AssigneeGroupOnlyDisplayString
    }
    
    // 'value' attribute on TypeKeyInput (id=State) at VehicleDamageDV.pcf: line 84, column 44
    function value_49 () : typekey.ExposureState {
      return Exposure.State
    }
    
    // 'value' attribute on DateInput (id=ClosedDate) at VehicleDamageDV.pcf: line 30, column 50
    function value_5 () : java.util.Date {
      return Exposure.CloseDate
    }
    
    // 'value' attribute on DateInput (id=CreateTime) at VehicleDamageDV.pcf: line 88, column 38
    function value_52 () : java.util.Date {
      return Exposure.CreateTime
    }
    
    // 'value' attribute on PolicyStatCodePickerInput (id=StatLine) at VehicleDamageDV.pcf: line 97, column 63
    function value_55 () : entity.StatCode {
      return Exposure.StatLine
    }
    
    // 'value' attribute on TextInput (id=StatLine_Warning) at VehicleDamageDV.pcf: line 104, column 65
    function value_71 () : java.lang.String {
      return DisplayKey.get("Java.StatCodes.StatCodeListCappedWarning", Exposure.Claim.Policy.StatCodeListCap, Exposure.Claim.Policy.StatCodes.length)
    }
    
    // 'value' attribute on TypeKeyInput (id=ValidationLevel) at VehicleDamageDV.pcf: line 111, column 46
    function value_75 () : typekey.ValidationLevel {
      return Exposure.ValidationLevel
    }
    
    // 'value' attribute on ReflectCondition at VehicleDamageDV.pcf: line 127, column 45
    function value_79 (TRIGGER_INDEX :  int, VALUE :  typekey.LossPartyType) : java.lang.Object {
      return Exposure.Claim.Insured
    }
    
    // 'value' attribute on ClaimContactInput (id=Claimant_Picker) at VehicleDamageDV.pcf: line 122, column 94
    function value_81 () : entity.Contact {
      return Exposure.Claimant
    }
    
    // 'value' attribute on TypeKeyInput (id=PrimaryCoverage) at VehicleDamageDV.pcf: line 35, column 43
    function value_9 () : typekey.CoverageType {
      return Exposure.PrimaryCoverage
    }
    
    // 'valueRange' attribute on RangeInput (id=Vehicle_Incident) at VehicleDamageDV.pcf: line 184, column 44
    function verifyValueRangeIsAllowedType_131 ($$arg :  entity.VehicleIncident[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Vehicle_Incident) at VehicleDamageDV.pcf: line 184, column 44
    function verifyValueRangeIsAllowedType_131 ($$arg :  gw.api.database.IQueryBeanResult<entity.VehicleIncident>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Vehicle_Incident) at VehicleDamageDV.pcf: line 184, column 44
    function verifyValueRangeIsAllowedType_131 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Coverage) at VehicleDamageDV.pcf: line 60, column 37
    function verifyValueRangeIsAllowedType_32 ($$arg :  entity.Coverage[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Coverage) at VehicleDamageDV.pcf: line 60, column 37
    function verifyValueRangeIsAllowedType_32 ($$arg :  gw.api.database.IQueryBeanResult<entity.Coverage>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Coverage) at VehicleDamageDV.pcf: line 60, column 37
    function verifyValueRangeIsAllowedType_32 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function verifyValueRangeIsAllowedType_64 ($$arg :  entity.StatCode[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function verifyValueRangeIsAllowedType_64 ($$arg :  gw.api.database.IQueryBeanResult<entity.StatCode>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function verifyValueRangeIsAllowedType_64 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_96 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_96 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_96 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Vehicle_Incident) at VehicleDamageDV.pcf: line 184, column 44
    function verifyValueRange_132 () : void {
      var __valueRangeArg = Exposure.getVehicleIncidentsWithMatchingLossParty(Exposure.LossParty)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_131(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=Coverage) at VehicleDamageDV.pcf: line 60, column 37
    function verifyValueRange_33 () : void {
      var __valueRangeArg = Exposure.Claim.Policy.getCoveragesByCoverageType(Exposure.PrimaryCoverage)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_32(__valueRangeArg)
    }
    
    // 'valueRange' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function verifyValueRange_65 () : void {
      var __valueRangeArg = Exposure.Claim.Policy.CappedStatCodes
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_64(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_97 () : void {
      var __valueRangeArg = Exposure.Claim.getRelatedContacts(Exposure.getContactType(TC_CLAIMANT))
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_96(__valueRangeArg)
    }
    
    // 'visible' attribute on Label at VehicleDamageDV.pcf: line 281, column 70
    function visible_172 () : java.lang.Boolean {
      return perm.Claim.viewtransactiondetails(Exposure.Claim)
    }
    
    // 'visible' attribute on CurrencyInput (id=RemainingReserves) at VehicleDamageDV.pcf: line 287, column 60
    function visible_173 () : java.lang.Boolean {
      return perm.Claim.viewreserves(Exposure.Claim)
    }
    
    // 'visible' attribute on CurrencyInput (id=FuturePayments) at VehicleDamageDV.pcf: line 292, column 60
    function visible_178 () : java.lang.Boolean {
      return perm.Claim.viewpayments(Exposure.Claim)
    }
    
    // 'visible' attribute on CurrencyInput (id=TotalRecoveries) at VehicleDamageDV.pcf: line 302, column 62
    function visible_188 () : java.lang.Boolean {
      return perm.Claim.viewrecoveries(Exposure.Claim)
    }
    
    // 'visible' attribute on CurrencyInput (id=TotalIncurredNet) at VehicleDamageDV.pcf: line 308, column 68
    function visible_193 () : java.lang.Boolean {
      return perm.Claim.viewnettotalincurred(Exposure.Claim)
    }
    
    // 'visible' attribute on Label at VehicleDamageDV.pcf: line 311, column 62
    function visible_198 () : java.lang.Boolean {
      return Exposure.Coverage.ClaimDeductible != null
    }
    
    // 'visible' attribute on DateInput (id=ReOpenDate) at VehicleDamageDV.pcf: line 52, column 50
    function visible_20 () : java.lang.Boolean {
      return  Exposure.ReOpenDate != null 
    }
    
    // 'visible' attribute on TextInput (id=DeductibleEditReason) at VehicleDamageDV.pcf: line 350, column 41
    function visible_235 () : java.lang.Boolean {
      return isEditReasonRequired
    }
    
    // 'visible' attribute on DateInput (id=ClosedDate) at VehicleDamageDV.pcf: line 30, column 50
    function visible_4 () : java.lang.Boolean {
      return  Exposure.State == TC_CLOSED 
    }
    
    // 'visible' attribute on TextInput (id=StatLine_Warning) at VehicleDamageDV.pcf: line 104, column 65
    function visible_70 () : java.lang.Boolean {
      return Exposure.Claim.Policy.StatCodeListCapped
    }
    
    // 'visible' attribute on InputSet at VehicleDamageDV.pcf: line 90, column 59
    function visible_74 () : java.lang.Boolean {
      return Exposure.Claim.Policy.StatCodingEnabled
    }
    
    // 'visible' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 14, column 229
    function visible_82 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 16, column 225
    function visible_85 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Exposure.Claimant), Exposure.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    property get Exposure () : Exposure {
      return getRequireValue("Exposure", 0) as Exposure
    }
    
    property set Exposure ($arg :  Exposure) {
      setRequireValue("Exposure", 0, $arg)
    }
    
    property get coverage () : Coverage {
      return getVariableValue("coverage", 0) as Coverage
    }
    
    property set coverage ($arg :  Coverage) {
      setVariableValue("coverage", 0, $arg)
    }
    
    property get ContactProhibited() : boolean {
        return Exposure.Claim.getClaimContact(Exposure.Claimant).ContactProhibited
    }
      
    property set ContactProhibited(prohibited : boolean) {
      var claimContact = Exposure.Claim.getClaimContact(Exposure.Claimant) 
      if (claimContact != null) claimContact.ContactProhibited = prohibited 
    }
    
    property get canEditDeductible() : boolean {
      return perm.Claim.edit(Exposure.Claim) and perm.System.editdeductible and gw.api.financials.FinancialsUtil.isUseDeductibleHandling()
    }
    
    property get isEditReasonRequired() : boolean {
      return Exposure.Coverage.ClaimDeductible.Overridden or Exposure.Coverage.ClaimDeductible.Waived
    }
    
    function setCoverage(cov : Coverage) {
      var result = Exposure.updateCoverage(cov)
    
      // Display a warning if changing from a coverage with a waived deductible and the new deductible is unwaived
      if (Exposure.Coverage.ClaimDeductible != null
          and !Exposure.Coverage.ClaimDeductible.Waived
          and result.OriginalDeductibleWasWaived) {
        gw.api.util.LocationUtil.addRequestScopedInfoMessage(DisplayKey.get("Deductible.ChangingFromCoverageWithWaivedDeductible"))      
      }
      // Display a warning if changing from a coverage with a modified deductible and the new deductible is unmodified
      if (Exposure.Coverage.ClaimDeductible != null
          and !Exposure.Coverage.ClaimDeductible.Overridden
          and result.OriginalDeductibleWasOverridden) {
        gw.api.util.LocationUtil.addRequestScopedInfoMessage(DisplayKey.get("Deductible.ChangingFromCoverageWithModifiedDeductible"))      
      }
    }
    
    function clearEditReason() {
        Exposure.Coverage.ClaimDeductible.EditReason = null
    }
    
    
  }
  
  
}