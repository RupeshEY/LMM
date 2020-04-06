package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/TowOnlyDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TowOnlyDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/exposures/TowOnlyDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TowOnlyDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=TowOnlyDV_NewIncidentMenuItem) at TowOnlyDV.pcf: line 166, column 98
    function action_104 () : void {
      NewVehicleIncidentPopup.push(Exposure.Claim)
    }
    
    // 'action' attribute on MenuItem (id=TowOnlyDV_EditIncidentMenuItem) at TowOnlyDV.pcf: line 171, column 99
    function action_106 () : void {
      EditVehicleIncidentPopup.push(Exposure.VehicleIncident, true)
    }
    
    // 'action' attribute on MenuItem (id=TowOnlyDV_ViewIncidentMenuItem) at TowOnlyDV.pcf: line 176, column 99
    function action_108 () : void {
      EditVehicleIncidentPopup.push(Exposure.VehicleIncident, false)
    }
    
    // 'action' attribute on ClaimContactInput (id=RecovAgcy_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_160 () : void {
      AddressBookPickerPopup.push(statictypeof (asVehicleIncident().recoveryagent), Exposure.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=RecovAgcy_Picker) at ClaimContactWidget.xml: line 18, column 285
    function action_162 () : void {
      if (asVehicleIncident().recoveryagent != null) { ClaimContactDetailPopup.push(asVehicleIncident().recoveryagent, Exposure.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=RecovAgcy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_164 () : void {
      ClaimContactDetailPopup.push(asVehicleIncident().recoveryagent, Exposure.Claim)
    }
    
    // 'action' attribute on MenuItem (id=Exposure_StatLine_PickerButton) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function action_29 () : void {
      ClaimPolicyStatCodePickerPopup.push(Exposure.Claim)
    }
    
    // 'action' attribute on PolicyStatCodePickerInput (id=Exposure_StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function action_31 () : void {
      ClaimPolicyStatCodePickerPopup.push(Exposure.Claim)
    }
    
    // 'action' attribute on PolicyStatCodePickerInput (id=Exposure_StatLine) at TowOnlyDV.pcf: line 62, column 63
    function action_39 () : void {
      ClaimPolicyStatCodePickerPopup.push(Exposure.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_69 () : void {
      AddressBookPickerPopup.push(statictypeof (Exposure.Claimant), Exposure.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 18, column 285
    function action_71 () : void {
      if (Exposure.Claimant != null) { ClaimContactDetailPopup.push(Exposure.Claimant, Exposure.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_72 () : void {
      ClaimContactDetailPopup.push(Exposure.Claimant, Exposure.Claim)
    }
    
    // 'action' attribute on MenuItem (id=TowOnlyDV_NewIncidentMenuItem) at TowOnlyDV.pcf: line 166, column 98
    function action_dest_105 () : pcf.api.Destination {
      return pcf.NewVehicleIncidentPopup.createDestination(Exposure.Claim)
    }
    
    // 'action' attribute on MenuItem (id=TowOnlyDV_EditIncidentMenuItem) at TowOnlyDV.pcf: line 171, column 99
    function action_dest_107 () : pcf.api.Destination {
      return pcf.EditVehicleIncidentPopup.createDestination(Exposure.VehicleIncident, true)
    }
    
    // 'action' attribute on MenuItem (id=TowOnlyDV_ViewIncidentMenuItem) at TowOnlyDV.pcf: line 176, column 99
    function action_dest_109 () : pcf.api.Destination {
      return pcf.EditVehicleIncidentPopup.createDestination(Exposure.VehicleIncident, false)
    }
    
    // 'action' attribute on ClaimContactInput (id=RecovAgcy_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_161 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (asVehicleIncident().recoveryagent), Exposure.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=RecovAgcy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_165 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(asVehicleIncident().recoveryagent, Exposure.Claim)
    }
    
    // 'action' attribute on MenuItem (id=Exposure_StatLine_PickerButton) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function action_dest_30 () : pcf.api.Destination {
      return pcf.ClaimPolicyStatCodePickerPopup.createDestination(Exposure.Claim)
    }
    
    // 'action' attribute on PolicyStatCodePickerInput (id=Exposure_StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function action_dest_32 () : pcf.api.Destination {
      return pcf.ClaimPolicyStatCodePickerPopup.createDestination(Exposure.Claim)
    }
    
    // 'action' attribute on PolicyStatCodePickerInput (id=Exposure_StatLine) at TowOnlyDV.pcf: line 62, column 63
    function action_dest_40 () : pcf.api.Destination {
      return pcf.ClaimPolicyStatCodePickerPopup.createDestination(Exposure.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_70 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Exposure.Claimant), Exposure.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_73 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Exposure.Claimant, Exposure.Claim)
    }
    
    // 'condition' attribute on ReflectCondition at TowOnlyDV.pcf: line 103, column 45
    function condition_61 (TRIGGER_INDEX :  int, VALUE :  typekey.LossPartyType) : java.lang.Boolean {
      return VALUE == TC_INSURED
    }
    
    // 'condition' attribute on ReflectCondition at TowOnlyDV.pcf: line 120, column 42
    function condition_83 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Boolean {
      return Exposure.Claim.Insured==VALUE
    }
    
    // 'def' attribute on InputSetRef at TowOnlyDV.pcf: line 212, column 51
    function def_onEnter_136 (def :  pcf.ExposureWorkloadInputSet) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on ClaimContactInput (id=RecovAgcy_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_157 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (asVehicleIncident().recoveryagent), null, Exposure.Claim)
    }
    
    // 'def' attribute on InputSetRef (id=RecoveryAddress) at TowOnlyDV.pcf: line 258, column 167
    function def_onEnter_183 (def :  pcf.CCAddressInputSet) : void {
      def.onEnter(asVehicleIncident().RecoveryAddressOwner)
    }
    
    // 'def' attribute on ListViewInput at TowOnlyDV.pcf: line 298, column 104
    function def_onEnter_206 (def :  pcf.EditableOtherCoverageDetailsLV) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_66 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Exposure.Claimant), null, Exposure.Claim)
    }
    
    // 'def' attribute on InputSetRef at TowOnlyDV.pcf: line 212, column 51
    function def_refreshVariables_137 (def :  pcf.ExposureWorkloadInputSet) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on ClaimContactInput (id=RecovAgcy_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_158 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (asVehicleIncident().recoveryagent), null, Exposure.Claim)
    }
    
    // 'def' attribute on InputSetRef (id=RecoveryAddress) at TowOnlyDV.pcf: line 258, column 167
    function def_refreshVariables_184 (def :  pcf.CCAddressInputSet) : void {
      def.refreshVariables(asVehicleIncident().RecoveryAddressOwner)
    }
    
    // 'def' attribute on ListViewInput at TowOnlyDV.pcf: line 298, column 104
    function def_refreshVariables_207 (def :  pcf.EditableOtherCoverageDetailsLV) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_67 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Exposure.Claimant), null, Exposure.Claim)
    }
    
    // 'value' attribute on RangeInput (id=Exposure_Coverage) at TowOnlyDV.pcf: line 36, column 38
    function defaultSetter_11 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.Coverage = (__VALUE_TO_SET as entity.Coverage)
    }
    
    // 'value' attribute on RangeInput (id=Vehicle_Incident) at TowOnlyDV.pcf: line 158, column 44
    function defaultSetter_111 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.VehicleIncident = (__VALUE_TO_SET as entity.VehicleIncident)
    }
    
    // 'value' attribute on TypeKeyInput (id=Recovery_RecovInd) at TowOnlyDV.pcf: line 222, column 35
    function defaultSetter_140 (__VALUE_TO_SET :  java.lang.Object) : void {
      asVehicleIncident().RecovInd = (__VALUE_TO_SET as typekey.YesNo)
    }
    
    // 'value' attribute on DateInput (id=Recovery_RecovDate) at TowOnlyDV.pcf: line 230, column 61
    function defaultSetter_146 (__VALUE_TO_SET :  java.lang.Object) : void {
      asVehicleIncident().RecovDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TypeKeyInput (id=Recovery_RecovState) at TowOnlyDV.pcf: line 237, column 61
    function defaultSetter_152 (__VALUE_TO_SET :  java.lang.Object) : void {
      asVehicleIncident().RecovState = (__VALUE_TO_SET as typekey.State)
    }
    
    // 'value' attribute on ClaimContactInput (id=RecovAgcy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_168 (__VALUE_TO_SET :  java.lang.Object) : void {
      asVehicleIncident().recoveryagent = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on TypeKeyInput (id=Recovery_RecovCondType) at TowOnlyDV.pcf: line 252, column 60
    function defaultSetter_180 (__VALUE_TO_SET :  java.lang.Object) : void {
      asVehicleIncident().RecovCondType = (__VALUE_TO_SET as typekey.RecovCondType)
    }
    
    // 'value' attribute on TypeKeyInput (id=Recovery_RecovClassType) at TowOnlyDV.pcf: line 265, column 60
    function defaultSetter_189 (__VALUE_TO_SET :  java.lang.Object) : void {
      asVehicleIncident().RecovClassType = (__VALUE_TO_SET as typekey.RecovClassType)
    }
    
    // 'value' attribute on TypeKeyInput (id=JurisdictionState) at TowOnlyDV.pcf: line 285, column 43
    function defaultSetter_199 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.JurisdictionState = (__VALUE_TO_SET as typekey.Jurisdiction)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claimant_OtherCoverage) at TowOnlyDV.pcf: line 294, column 41
    function defaultSetter_204 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.OtherCoverage = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on PolicyStatCodePickerInput (id=Exposure_StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function defaultSetter_34 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.StatLine = (__VALUE_TO_SET as entity.StatCode)
    }
    
    // 'value' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_76 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.Claimant = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on TypeKeyInput (id=Claimant_Type) at TowOnlyDV.pcf: line 115, column 42
    function defaultSetter_87 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.ClaimantType = (__VALUE_TO_SET as typekey.ClaimantType)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claimant_ContactPermitted) at TowOnlyDV.pcf: line 130, column 36
    function defaultSetter_91 (__VALUE_TO_SET :  java.lang.Object) : void {
      ContactProhibited = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'filter' attribute on TypeKeyInput (id=JurisdictionState) at TowOnlyDV.pcf: line 285, column 43
    function filter_201 (VALUE :  typekey.Jurisdiction, VALUES :  typekey.Jurisdiction[]) : java.lang.Boolean {
      return VALUE.hasCategory(JurisdictionType.TC_INSURANCE)
    }
    
    // 'onPick' attribute on ClaimContactInput (id=RecovAgcy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function onPick_166 (PickedValue :  Contact) : void {
      var contactType = statictypeof (asVehicleIncident().recoveryagent); var result = eval("asVehicleIncident().recoveryagent = Exposure.Claim.resolveContact(asVehicleIncident().recoveryagent) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function onPick_74 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Exposure.Claimant); var result = eval("Exposure.Claimant = Exposure.Claim.resolveContact(Exposure.Claimant) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'value' attribute on Reflect at TowOnlyDV.pcf: line 185, column 33
    function reflectionValue_116 (TRIGGER_INDEX :  int, VALUE :  entity.VehicleIncident) : java.lang.Object {
      return VALUE.driver
    }
    
    // 'value' attribute on Reflect at TowOnlyDV.pcf: line 193, column 38
    function reflectionValue_121 (TRIGGER_INDEX :  int, VALUE :  entity.VehicleIncident) : java.lang.Object {
      return VALUE.Description
    }
    
    // 'value' attribute on Reflect at TowOnlyDV.pcf: line 201, column 42
    function reflectionValue_126 (TRIGGER_INDEX :  int, VALUE :  entity.VehicleIncident) : java.lang.Object {
      return VALUE.VehicleOperable
    }
    
    // 'value' attribute on Reflect at TowOnlyDV.pcf: line 209, column 39
    function reflectionValue_131 (TRIGGER_INDEX :  int, VALUE :  entity.VehicleIncident) : java.lang.Object {
      return VALUE.LossEstimate
    }
    
    // Reflect at TowOnlyDV.pcf: line 100, column 43
    function reflectionValue_63 (TRIGGER_INDEX :  int, VALUE :  typekey.LossPartyType) : java.lang.Object {
      return (VALUE == TC_INSURED) ? (Exposure.Claim.Insured) : (true) ? ("") : "<NOCHANGE>"
    }
    
    // Reflect at TowOnlyDV.pcf: line 117, column 40
    function reflectionValue_84 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Object {
      return (Exposure.Claim.Insured==VALUE) ? ("insured") : (true) ? ("") : "<NOCHANGE>"
    }
    
    // 'value' attribute on Reflect at TowOnlyDV.pcf: line 137, column 44
    function reflectionValue_92 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Object {
      return VALUE.PrimaryPhoneValue
    }
    
    // 'value' attribute on Reflect at TowOnlyDV.pcf: line 145, column 53
    function reflectionValue_97 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Object {
      return VALUE.PrimaryAddressDisplayValue
    }
    
    // 'valueRange' attribute on Reflect at TowOnlyDV.pcf: line 161, column 82
    function valueRange_102 (TRIGGER_INDEX :  int, VALUE :  typekey.LossPartyType) : java.lang.Object {
      return Exposure.getVehicleIncidentsWithMatchingLossParty(VALUE)
    }
    
    // 'valueRange' attribute on RangeInput (id=Vehicle_Incident) at TowOnlyDV.pcf: line 158, column 44
    function valueRange_113 () : java.lang.Object {
      return Exposure.getVehicleIncidentsWithMatchingLossParty(Exposure.LossParty)
    }
    
    // 'valueRange' attribute on RangeInput (id=Exposure_Coverage) at TowOnlyDV.pcf: line 36, column 38
    function valueRange_13 () : java.lang.Object {
      return Exposure.Claim.Policy.getCoveragesByCoverageType(Exposure.PrimaryCoverage)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=RecovAgcy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_170 () : java.lang.Object {
      return Exposure.Claim.RelatedContacts
    }
    
    // 'valueRange' attribute on PolicyStatCodePickerInput (id=Exposure_StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function valueRange_36 () : java.lang.Object {
      return Exposure.Claim.Policy.CappedStatCodes
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_78 () : java.lang.Object {
      return Exposure.Claim.getRelatedContacts(Exposure.getContactType(TC_CLAIMANT))
    }
    
    // 'value' attribute on TextInput (id=Incident_Driver) at TowOnlyDV.pcf: line 182, column 35
    function valueRoot_120 () : java.lang.Object {
      return Exposure.VehicleIncident
    }
    
    // 'value' attribute on TypeKeyInput (id=Recovery_RecovInd) at TowOnlyDV.pcf: line 222, column 35
    function valueRoot_141 () : java.lang.Object {
      return asVehicleIncident()
    }
    
    // 'value' attribute on TypeKeyInput (id=Exposure_LossParty) at TowOnlyDV.pcf: line 18, column 44
    function valueRoot_2 () : java.lang.Object {
      return Exposure
    }
    
    // 'value' attribute on CurrencyInput (id=Exposure_RemainingReserves) at TowOnlyDV.pcf: line 311, column 57
    function valueRoot_210 () : java.lang.Object {
      return Exposure.ExposureRpt
    }
    
    // 'value' attribute on TextInput (id=Claimant_PrimaryPhone) at TowOnlyDV.pcf: line 134, column 53
    function valueRoot_96 () : java.lang.Object {
      return Exposure.Claimant
    }
    
    // 'value' attribute on TypeKeyInput (id=Exposure_LossParty) at TowOnlyDV.pcf: line 18, column 44
    function value_0 () : typekey.LossPartyType {
      return Exposure.LossParty
    }
    
    // 'value' attribute on RangeInput (id=Vehicle_Incident) at TowOnlyDV.pcf: line 158, column 44
    function value_103 () : entity.VehicleIncident {
      return Exposure.VehicleIncident
    }
    
    // 'value' attribute on TextInput (id=Incident_Driver) at TowOnlyDV.pcf: line 182, column 35
    function value_118 () : entity.Person {
      return Exposure.VehicleIncident.driver
    }
    
    // 'value' attribute on TextInput (id=Incident_Description) at TowOnlyDV.pcf: line 190, column 54
    function value_123 () : java.lang.String {
      return Exposure.VehicleIncident.Description
    }
    
    // 'value' attribute on BooleanRadioInput (id=Incident_VehicleOperable) at TowOnlyDV.pcf: line 198, column 58
    function value_128 () : java.lang.Boolean {
      return Exposure.VehicleIncident.VehicleOperable
    }
    
    // 'value' attribute on CurrencyInput (id=Incident_LossEstimate) at TowOnlyDV.pcf: line 206, column 55
    function value_133 () : gw.api.financials.CurrencyAmount {
      return Exposure.VehicleIncident.LossEstimate
    }
    
    // 'value' attribute on TypeKeyInput (id=Recovery_RecovInd) at TowOnlyDV.pcf: line 222, column 35
    function value_138 () : typekey.YesNo {
      return asVehicleIncident().RecovInd
    }
    
    // 'value' attribute on DateInput (id=Recovery_RecovDate) at TowOnlyDV.pcf: line 230, column 61
    function value_143 () : java.util.Date {
      return asVehicleIncident().RecovDate
    }
    
    // 'value' attribute on TypeKeyInput (id=Recovery_RecovState) at TowOnlyDV.pcf: line 237, column 61
    function value_149 () : typekey.State {
      return asVehicleIncident().RecovState
    }
    
    // 'value' attribute on ClaimContactInput (id=RecovAgcy_Picker) at TowOnlyDV.pcf: line 245, column 61
    function value_155 () : entity.Contact {
      return asVehicleIncident().recoveryagent
    }
    
    // 'value' attribute on TextInput (id=AssignedUser_Name) at TowOnlyDV.pcf: line 40, column 49
    function value_16 () : java.lang.String {
      return Exposure.AssigneeDisplayString
    }
    
    // 'value' attribute on TypeKeyInput (id=Recovery_RecovCondType) at TowOnlyDV.pcf: line 252, column 60
    function value_177 () : typekey.RecovCondType {
      return asVehicleIncident().RecovCondType
    }
    
    // 'value' attribute on TypeKeyInput (id=Recovery_RecovClassType) at TowOnlyDV.pcf: line 265, column 60
    function value_186 () : typekey.RecovClassType {
      return asVehicleIncident().RecovClassType
    }
    
    // 'value' attribute on TextInput (id=AssignedGroup_Name) at TowOnlyDV.pcf: line 44, column 58
    function value_19 () : java.lang.String {
      return Exposure.AssigneeGroupOnlyDisplayString
    }
    
    // 'value' attribute on TypeKeyInput (id=Exposure_Segment) at TowOnlyDV.pcf: line 273, column 43
    function value_191 () : typekey.ClaimSegment {
      return Exposure.Segment
    }
    
    // 'value' attribute on TypeKeyInput (id=Exposure_Strategy) at TowOnlyDV.pcf: line 278, column 44
    function value_194 () : typekey.ClaimStrategy {
      return Exposure.Strategy
    }
    
    // 'value' attribute on TypeKeyInput (id=JurisdictionState) at TowOnlyDV.pcf: line 285, column 43
    function value_197 () : typekey.Jurisdiction {
      return Exposure.JurisdictionState
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claimant_OtherCoverage) at TowOnlyDV.pcf: line 294, column 41
    function value_202 () : java.lang.Boolean {
      return Exposure.OtherCoverage
    }
    
    // 'value' attribute on CurrencyInput (id=Exposure_RemainingReserves) at TowOnlyDV.pcf: line 311, column 57
    function value_208 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.RemainingReserves
    }
    
    // 'value' attribute on CurrencyInput (id=Exposure_FuturePayments) at TowOnlyDV.pcf: line 315, column 54
    function value_211 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.FuturePayments
    }
    
    // 'value' attribute on CurrencyInput (id=Exposure_TotalPayments) at TowOnlyDV.pcf: line 319, column 53
    function value_214 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.TotalPayments
    }
    
    // 'value' attribute on CurrencyInput (id=Exposure_TotalRecoveries) at TowOnlyDV.pcf: line 323, column 55
    function value_217 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.TotalRecoveries
    }
    
    // 'value' attribute on TypeKeyInput (id=State) at TowOnlyDV.pcf: line 49, column 44
    function value_22 () : typekey.ExposureState {
      return Exposure.State
    }
    
    // 'value' attribute on CurrencyInput (id=Exposure_TotalIncurredNet) at TowOnlyDV.pcf: line 328, column 56
    function value_220 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.TotalIncurredNet
    }
    
    // 'value' attribute on DateInput (id=CreateTime) at TowOnlyDV.pcf: line 53, column 38
    function value_25 () : java.util.Date {
      return Exposure.CreateTime
    }
    
    // 'value' attribute on PolicyStatCodePickerInput (id=Exposure_StatLine) at TowOnlyDV.pcf: line 62, column 63
    function value_28 () : entity.StatCode {
      return Exposure.StatLine
    }
    
    // 'value' attribute on TypeKeyInput (id=Exposure_PrimaryCoverage) at TowOnlyDV.pcf: line 23, column 43
    function value_3 () : typekey.CoverageType {
      return Exposure.PrimaryCoverage
    }
    
    // 'value' attribute on TextInput (id=StatLine_Warning) at TowOnlyDV.pcf: line 69, column 65
    function value_44 () : java.lang.String {
      return DisplayKey.get("Java.StatCodes.StatCodeListCappedWarning", Exposure.Claim.Policy.StatCodeListCap, Exposure.Claim.Policy.StatCodes.length)
    }
    
    // 'value' attribute on DateInput (id=ClosedDate) at TowOnlyDV.pcf: line 76, column 48
    function value_49 () : java.util.Date {
      return Exposure.CloseDate
    }
    
    // 'value' attribute on TypeKeyInput (id=ClosedOutcome) at TowOnlyDV.pcf: line 82, column 49
    function value_54 () : typekey.ExposureClosedOutcomeType {
      return Exposure.ClosedOutcome
    }
    
    // 'value' attribute on TypeKeyInput (id=ValidationLevel) at TowOnlyDV.pcf: line 87, column 46
    function value_58 () : typekey.ValidationLevel {
      return Exposure.ValidationLevel
    }
    
    // 'value' attribute on TypeKeyInput (id=Exposure_CoverageSubType) at TowOnlyDV.pcf: line 28, column 46
    function value_6 () : typekey.CoverageSubtype {
      return Exposure.CoverageSubType
    }
    
    // 'value' attribute on ReflectCondition at TowOnlyDV.pcf: line 103, column 45
    function value_62 (TRIGGER_INDEX :  int, VALUE :  typekey.LossPartyType) : java.lang.Object {
      return Exposure.Claim.Insured
    }
    
    // 'value' attribute on ClaimContactInput (id=Claimant_Picker) at TowOnlyDV.pcf: line 98, column 94
    function value_64 () : entity.Contact {
      return Exposure.Claimant
    }
    
    // 'value' attribute on TypeKeyInput (id=Claimant_Type) at TowOnlyDV.pcf: line 115, column 42
    function value_85 () : typekey.ClaimantType {
      return Exposure.ClaimantType
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claimant_ContactPermitted) at TowOnlyDV.pcf: line 130, column 36
    function value_89 () : java.lang.Boolean {
      return ContactProhibited
    }
    
    // 'value' attribute on RangeInput (id=Exposure_Coverage) at TowOnlyDV.pcf: line 36, column 38
    function value_9 () : entity.Coverage {
      return Exposure.Coverage
    }
    
    // 'value' attribute on TextInput (id=Claimant_PrimaryPhone) at TowOnlyDV.pcf: line 134, column 53
    function value_94 () : java.lang.String {
      return Exposure.Claimant.PrimaryPhoneValue
    }
    
    // 'value' attribute on TextInput (id=Claimant_Address) at TowOnlyDV.pcf: line 142, column 62
    function value_99 () : java.lang.String {
      return Exposure.Claimant.PrimaryAddressDisplayValue
    }
    
    // 'valueRange' attribute on RangeInput (id=Vehicle_Incident) at TowOnlyDV.pcf: line 158, column 44
    function verifyValueRangeIsAllowedType_114 ($$arg :  entity.VehicleIncident[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Vehicle_Incident) at TowOnlyDV.pcf: line 158, column 44
    function verifyValueRangeIsAllowedType_114 ($$arg :  gw.api.database.IQueryBeanResult<entity.VehicleIncident>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Vehicle_Incident) at TowOnlyDV.pcf: line 158, column 44
    function verifyValueRangeIsAllowedType_114 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Exposure_Coverage) at TowOnlyDV.pcf: line 36, column 38
    function verifyValueRangeIsAllowedType_14 ($$arg :  entity.Coverage[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Exposure_Coverage) at TowOnlyDV.pcf: line 36, column 38
    function verifyValueRangeIsAllowedType_14 ($$arg :  gw.api.database.IQueryBeanResult<entity.Coverage>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Exposure_Coverage) at TowOnlyDV.pcf: line 36, column 38
    function verifyValueRangeIsAllowedType_14 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=RecovAgcy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_171 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=RecovAgcy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_171 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=RecovAgcy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_171 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on PolicyStatCodePickerInput (id=Exposure_StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function verifyValueRangeIsAllowedType_37 ($$arg :  entity.StatCode[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on PolicyStatCodePickerInput (id=Exposure_StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function verifyValueRangeIsAllowedType_37 ($$arg :  gw.api.database.IQueryBeanResult<entity.StatCode>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on PolicyStatCodePickerInput (id=Exposure_StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function verifyValueRangeIsAllowedType_37 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_79 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_79 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_79 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Vehicle_Incident) at TowOnlyDV.pcf: line 158, column 44
    function verifyValueRange_115 () : void {
      var __valueRangeArg = Exposure.getVehicleIncidentsWithMatchingLossParty(Exposure.LossParty)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_114(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=Exposure_Coverage) at TowOnlyDV.pcf: line 36, column 38
    function verifyValueRange_15 () : void {
      var __valueRangeArg = Exposure.Claim.Policy.getCoveragesByCoverageType(Exposure.PrimaryCoverage)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_14(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=RecovAgcy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_172 () : void {
      var __valueRangeArg = Exposure.Claim.RelatedContacts
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_171(__valueRangeArg)
    }
    
    // 'valueRange' attribute on PolicyStatCodePickerInput (id=Exposure_StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function verifyValueRange_38 () : void {
      var __valueRangeArg = Exposure.Claim.Policy.CappedStatCodes
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_37(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_80 () : void {
      var __valueRangeArg = Exposure.Claim.getRelatedContacts(Exposure.getContactType(TC_CLAIMANT))
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_79(__valueRangeArg)
    }
    
    // 'visible' attribute on DateInput (id=Recovery_RecovDate) at TowOnlyDV.pcf: line 230, column 61
    function visible_142 () : java.lang.Boolean {
      return  asVehicleIncident().RecovInd == TC_YES 
    }
    
    // 'visible' attribute on ClaimContactInput (id=RecovAgcy_Picker) at ClaimContactWidget.xml: line 16, column 225
    function visible_159 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (asVehicleIncident().recoveryagent), Exposure.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on InputSetRef (id=RecoveryAddress) at TowOnlyDV.pcf: line 258, column 167
    function visible_182 () : java.lang.Boolean {
      return asVehicleIncident().RecovInd == YesNo.TC_YES and (asVehicleIncident().RecovCondType != null and asVehicleIncident().RecovCondType != TC_NOT_RECOV)
    }
    
    // 'visible' attribute on TypeKeyInput (id=Recovery_RecovClassType) at TowOnlyDV.pcf: line 265, column 60
    function visible_185 () : java.lang.Boolean {
      return asVehicleIncident().RecovInd == TC_YES 
    }
    
    // 'visible' attribute on TextInput (id=StatLine_Warning) at TowOnlyDV.pcf: line 69, column 65
    function visible_43 () : java.lang.Boolean {
      return Exposure.Claim.Policy.StatCodeListCapped
    }
    
    // 'visible' attribute on InputSet at TowOnlyDV.pcf: line 55, column 59
    function visible_47 () : java.lang.Boolean {
      return Exposure.Claim.Policy.StatCodingEnabled
    }
    
    // 'visible' attribute on DateInput (id=ClosedDate) at TowOnlyDV.pcf: line 76, column 48
    function visible_48 () : java.lang.Boolean {
      return Exposure.State == TC_CLOSED
    }
    
    // 'visible' attribute on TypeKeyInput (id=ClosedOutcome) at TowOnlyDV.pcf: line 82, column 49
    function visible_53 () : java.lang.Boolean {
      return Exposure.State == TC_CLOSED 
    }
    
    // 'visible' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 14, column 229
    function visible_65 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 16, column 225
    function visible_68 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Exposure.Claimant), Exposure.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    property get Exposure () : Exposure {
      return getRequireValue("Exposure", 0) as Exposure
    }
    
    property set Exposure ($arg :  Exposure) {
      setRequireValue("Exposure", 0, $arg)
    }
    
    
    function asVehicleIncident() : VehicleIncident {
            return Exposure.Incident as VehicleIncident;
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