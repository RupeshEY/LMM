package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimExposureDV.Lossofusedamage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewClaimExposureDV_LossofusedamageExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimExposureDV.Lossofusedamage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimExposureDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=StatLine_PickerButton) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function action_18 () : void {
      ClaimPolicyStatCodePickerPopup.push(Exposure.Claim)
    }
    
    // 'action' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function action_20 () : void {
      ClaimPolicyStatCodePickerPopup.push(Exposure.Claim)
    }
    
    // 'action' attribute on PolicyStatCodePickerInput (id=StatLine) at NewClaimExposureDV.Lossofusedamage.pcf: line 53, column 63
    function action_28 () : void {
      ClaimPolicyStatCodePickerPopup.push(Exposure.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_45 () : void {
      AddressBookPickerPopup.push(statictypeof (Exposure.Claimant), Exposure.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 18, column 285
    function action_47 () : void {
      if (Exposure.Claimant != null) { ClaimContactDetailPopup.push(Exposure.Claimant, Exposure.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_48 () : void {
      ClaimContactDetailPopup.push(Exposure.Claimant, Exposure.Claim)
    }
    
    // 'action' attribute on MenuItem (id=StatLine_PickerButton) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function action_dest_19 () : pcf.api.Destination {
      return pcf.ClaimPolicyStatCodePickerPopup.createDestination(Exposure.Claim)
    }
    
    // 'action' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function action_dest_21 () : pcf.api.Destination {
      return pcf.ClaimPolicyStatCodePickerPopup.createDestination(Exposure.Claim)
    }
    
    // 'action' attribute on PolicyStatCodePickerInput (id=StatLine) at NewClaimExposureDV.Lossofusedamage.pcf: line 53, column 63
    function action_dest_29 () : pcf.api.Destination {
      return pcf.ClaimPolicyStatCodePickerPopup.createDestination(Exposure.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_46 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Exposure.Claimant), Exposure.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_49 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Exposure.Claimant, Exposure.Claim)
    }
    
    // 'condition' attribute on ReflectCondition at NewClaimExposureDV.Lossofusedamage.pcf: line 78, column 45
    function condition_37 (TRIGGER_INDEX :  int, VALUE :  typekey.LossPartyType) : java.lang.Boolean {
      return VALUE == TC_INSURED
    }
    
    // 'condition' attribute on ReflectCondition at NewClaimExposureDV.Lossofusedamage.pcf: line 95, column 42
    function condition_59 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Boolean {
      return Exposure.Claim.Insured==VALUE
    }
    
    // 'def' attribute on ListViewInput at NewClaimExposureDV.Lossofusedamage.pcf: line 191, column 120
    function def_onEnter_119 (def :  pcf.EditableOtherCoverageDetailsLV) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on InputSetRef at NewClaimExposureDV.Lossofusedamage.pcf: line 211, column 134
    function def_onEnter_125 (def :  pcf.OtherServicesLVInputSet) : void {
      def.onEnter(PropertyIncident.Claim, PropertyIncident, PropertyIncident.ServiceRequests.toSet(), null, {})
    }
    
    // 'def' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_42 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Exposure.Claimant), null, Exposure.Claim)
    }
    
    // 'def' attribute on InputSetRef at NewClaimExposureDV.Lossofusedamage.pcf: line 124, column 57
    function def_onEnter_78 (def :  pcf.CCAddressInputSet) : void {
      def.onEnter(Exposure.AddressOwner)
    }
    
    // 'def' attribute on ListViewInput at NewClaimExposureDV.Lossofusedamage.pcf: line 191, column 120
    function def_refreshVariables_120 (def :  pcf.EditableOtherCoverageDetailsLV) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on InputSetRef at NewClaimExposureDV.Lossofusedamage.pcf: line 211, column 134
    function def_refreshVariables_126 (def :  pcf.OtherServicesLVInputSet) : void {
      def.refreshVariables(PropertyIncident.Claim, PropertyIncident, PropertyIncident.ServiceRequests.toSet(), null, {})
    }
    
    // 'def' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_43 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Exposure.Claimant), null, Exposure.Claim)
    }
    
    // 'def' attribute on InputSetRef at NewClaimExposureDV.Lossofusedamage.pcf: line 124, column 57
    function def_refreshVariables_79 (def :  pcf.CCAddressInputSet) : void {
      def.refreshVariables(Exposure.AddressOwner)
    }
    
    // 'value' attribute on TextInput (id=Exposure_ALEMealsPeople) at NewClaimExposureDV.Lossofusedamage.pcf: line 163, column 56
    function defaultSetter_102 (__VALUE_TO_SET :  java.lang.Object) : void {
      PropertyIncident.MealsPeople = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on CurrencyInput (id=Exposure_ALEMealsRate) at NewClaimExposureDV.Lossofusedamage.pcf: line 169, column 56
    function defaultSetter_108 (__VALUE_TO_SET :  java.lang.Object) : void {
      PropertyIncident.MealsRate = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on TypeKeyInput (id=JurisdictionState) at NewClaimExposureDV.Lossofusedamage.pcf: line 178, column 43
    function defaultSetter_112 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.JurisdictionState = (__VALUE_TO_SET as typekey.Jurisdiction)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claimant_OtherCoverage) at NewClaimExposureDV.Lossofusedamage.pcf: line 187, column 41
    function defaultSetter_117 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.OtherCoverage = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on RangeInput (id=Coverage) at NewClaimExposureDV.Lossofusedamage.pcf: line 44, column 38
    function defaultSetter_12 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.Coverage = (__VALUE_TO_SET as entity.Coverage)
    }
    
    // 'value' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function defaultSetter_23 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.StatLine = (__VALUE_TO_SET as entity.StatCode)
    }
    
    // 'value' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_52 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.Claimant = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on TypeKeyInput (id=Claimant_Type) at NewClaimExposureDV.Lossofusedamage.pcf: line 90, column 42
    function defaultSetter_63 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.ClaimantType = (__VALUE_TO_SET as typekey.ClaimantType)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claimant_ContactProhibited) at NewClaimExposureDV.Lossofusedamage.pcf: line 105, column 36
    function defaultSetter_67 (__VALUE_TO_SET :  java.lang.Object) : void {
      ContactProhibited = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at NewClaimExposureDV.Lossofusedamage.pcf: line 136, column 48
    function defaultSetter_82 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.Incident.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Exposure_LossofUse) at NewClaimExposureDV.Lossofusedamage.pcf: line 141, column 44
    function defaultSetter_86 (__VALUE_TO_SET :  java.lang.Object) : void {
      PropertyIncident.LossofUse = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CurrencyInput (id=LossEstimate) at NewClaimExposureDV.Lossofusedamage.pcf: line 148, column 49
    function defaultSetter_90 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.Incident.LossEstimate = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on TextInput (id=Exposure_ALEMealsDays) at NewClaimExposureDV.Lossofusedamage.pcf: line 156, column 57
    function defaultSetter_96 (__VALUE_TO_SET :  java.lang.Object) : void {
      PropertyIncident.MealsDays = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'filter' attribute on TypeKeyInput (id=JurisdictionState) at NewClaimExposureDV.Lossofusedamage.pcf: line 178, column 43
    function filter_114 (VALUE :  typekey.Jurisdiction, VALUES :  typekey.Jurisdiction[]) : java.lang.Boolean {
      return VALUE.hasCategory(JurisdictionType.TC_INSURANCE)
    }
    
    // 'initialValue' attribute on Variable at NewClaimExposureDV.Lossofusedamage.pcf: line 18, column 39
    function initialValue_0 () : entity.PropertyIncident {
      return Exposure.Incident as PropertyIncident
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function onPick_50 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Exposure.Claimant); var result = eval("Exposure.Claimant = Exposure.Claim.resolveContact(Exposure.Claimant) as " + contactType.Name + ";return null;"); ;
    }
    
    // Reflect at NewClaimExposureDV.Lossofusedamage.pcf: line 75, column 34
    function reflectionValue_39 (TRIGGER_INDEX :  int, VALUE :  typekey.LossPartyType) : java.lang.Object {
      return (VALUE == TC_INSURED) ? (Exposure.Claim.Insured) : (true) ? ("") : "<NOCHANGE>"
    }
    
    // Reflect at NewClaimExposureDV.Lossofusedamage.pcf: line 92, column 40
    function reflectionValue_60 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Object {
      return (Exposure.Claim.Insured==VALUE) ? ("insured") : (true) ? ("") : "<NOCHANGE>"
    }
    
    // 'value' attribute on Reflect at NewClaimExposureDV.Lossofusedamage.pcf: line 112, column 44
    function reflectionValue_68 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Object {
      return VALUE.PrimaryPhoneValue
    }
    
    // 'value' attribute on Reflect at NewClaimExposureDV.Lossofusedamage.pcf: line 120, column 53
    function reflectionValue_73 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Object {
      return VALUE.PrimaryAddressDisplayValue
    }
    
    // 'valueRange' attribute on RangeInput (id=Coverage) at NewClaimExposureDV.Lossofusedamage.pcf: line 44, column 38
    function valueRange_14 () : java.lang.Object {
      return Exposure.Claim.Policy.getCoveragesByCoverageType(Exposure.PrimaryCoverage)
    }
    
    // 'valueRange' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function valueRange_25 () : java.lang.Object {
      return Exposure.Claim.Policy.CappedStatCodes
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_54 () : java.lang.Object {
      return Exposure.Claim.getRelatedContacts(Exposure.getContactType(TC_CLAIMANT))
    }
    
    // 'value' attribute on TypeKeyInput (id=LossParty) at NewClaimExposureDV.Lossofusedamage.pcf: line 27, column 44
    function valueRoot_3 () : java.lang.Object {
      return Exposure
    }
    
    // 'value' attribute on TextInput (id=Claimant_PrimaryPhone) at NewClaimExposureDV.Lossofusedamage.pcf: line 109, column 53
    function valueRoot_72 () : java.lang.Object {
      return Exposure.Claimant
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at NewClaimExposureDV.Lossofusedamage.pcf: line 136, column 48
    function valueRoot_83 () : java.lang.Object {
      return Exposure.Incident
    }
    
    // 'value' attribute on BooleanRadioInput (id=Exposure_LossofUse) at NewClaimExposureDV.Lossofusedamage.pcf: line 141, column 44
    function valueRoot_87 () : java.lang.Object {
      return PropertyIncident
    }
    
    // 'value' attribute on TypeKeyInput (id=LossParty) at NewClaimExposureDV.Lossofusedamage.pcf: line 27, column 44
    function value_1 () : typekey.LossPartyType {
      return Exposure.LossParty
    }
    
    // 'value' attribute on RangeInput (id=Coverage) at NewClaimExposureDV.Lossofusedamage.pcf: line 44, column 38
    function value_10 () : entity.Coverage {
      return Exposure.Coverage
    }
    
    // 'value' attribute on CurrencyInput (id=Exposure_ALEMealsRate) at NewClaimExposureDV.Lossofusedamage.pcf: line 169, column 56
    function value_105 () : gw.api.financials.CurrencyAmount {
      return PropertyIncident.MealsRate
    }
    
    // 'value' attribute on TypeKeyInput (id=JurisdictionState) at NewClaimExposureDV.Lossofusedamage.pcf: line 178, column 43
    function value_110 () : typekey.Jurisdiction {
      return Exposure.JurisdictionState
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claimant_OtherCoverage) at NewClaimExposureDV.Lossofusedamage.pcf: line 187, column 41
    function value_115 () : java.lang.Boolean {
      return Exposure.OtherCoverage
    }
    
    // 'value' attribute on PolicyStatCodePickerInput (id=StatLine) at NewClaimExposureDV.Lossofusedamage.pcf: line 53, column 63
    function value_17 () : entity.StatCode {
      return Exposure.StatLine
    }
    
    // 'value' attribute on TextInput (id=StatLine_Warning) at NewClaimExposureDV.Lossofusedamage.pcf: line 60, column 65
    function value_33 () : java.lang.String {
      return DisplayKey.get("Java.StatCodes.StatCodeListCappedWarning", Exposure.Claim.Policy.StatCodeListCap, Exposure.Claim.Policy.StatCodes.length)
    }
    
    // 'value' attribute on ReflectCondition at NewClaimExposureDV.Lossofusedamage.pcf: line 78, column 45
    function value_38 (TRIGGER_INDEX :  int, VALUE :  typekey.LossPartyType) : java.lang.Object {
      return Exposure.Claim.Insured
    }
    
    // 'value' attribute on TypeKeyInput (id=PrimaryCoverage) at NewClaimExposureDV.Lossofusedamage.pcf: line 32, column 43
    function value_4 () : typekey.CoverageType {
      return Exposure.PrimaryCoverage
    }
    
    // 'value' attribute on ClaimContactInput (id=Claimant_Picker) at NewClaimExposureDV.Lossofusedamage.pcf: line 73, column 94
    function value_40 () : entity.Contact {
      return Exposure.Claimant
    }
    
    // 'value' attribute on TypeKeyInput (id=Claimant_Type) at NewClaimExposureDV.Lossofusedamage.pcf: line 90, column 42
    function value_61 () : typekey.ClaimantType {
      return Exposure.ClaimantType
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claimant_ContactProhibited) at NewClaimExposureDV.Lossofusedamage.pcf: line 105, column 36
    function value_65 () : java.lang.Boolean {
      return ContactProhibited
    }
    
    // 'value' attribute on TypeKeyInput (id=CoverageSubType) at NewClaimExposureDV.Lossofusedamage.pcf: line 37, column 46
    function value_7 () : typekey.CoverageSubtype {
      return Exposure.CoverageSubType
    }
    
    // 'value' attribute on TextInput (id=Claimant_PrimaryPhone) at NewClaimExposureDV.Lossofusedamage.pcf: line 109, column 53
    function value_70 () : java.lang.String {
      return Exposure.Claimant.PrimaryPhoneValue
    }
    
    // 'value' attribute on TextInput (id=Claimant_Address) at NewClaimExposureDV.Lossofusedamage.pcf: line 117, column 62
    function value_75 () : java.lang.String {
      return Exposure.Claimant.PrimaryAddressDisplayValue
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at NewClaimExposureDV.Lossofusedamage.pcf: line 136, column 48
    function value_80 () : java.lang.String {
      return Exposure.Incident.Description
    }
    
    // 'value' attribute on BooleanRadioInput (id=Exposure_LossofUse) at NewClaimExposureDV.Lossofusedamage.pcf: line 141, column 44
    function value_84 () : java.lang.Boolean {
      return PropertyIncident.LossofUse
    }
    
    // 'value' attribute on CurrencyInput (id=LossEstimate) at NewClaimExposureDV.Lossofusedamage.pcf: line 148, column 49
    function value_88 () : gw.api.financials.CurrencyAmount {
      return Exposure.Incident.LossEstimate
    }
    
    // 'value' attribute on TextInput (id=Exposure_ALEMealsDays) at NewClaimExposureDV.Lossofusedamage.pcf: line 156, column 57
    function value_93 () : java.lang.Integer {
      return PropertyIncident.MealsDays
    }
    
    // 'value' attribute on TextInput (id=Exposure_ALEMealsPeople) at NewClaimExposureDV.Lossofusedamage.pcf: line 163, column 56
    function value_99 () : java.lang.Integer {
      return PropertyIncident.MealsPeople
    }
    
    // 'valueRange' attribute on RangeInput (id=Coverage) at NewClaimExposureDV.Lossofusedamage.pcf: line 44, column 38
    function verifyValueRangeIsAllowedType_15 ($$arg :  entity.Coverage[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Coverage) at NewClaimExposureDV.Lossofusedamage.pcf: line 44, column 38
    function verifyValueRangeIsAllowedType_15 ($$arg :  gw.api.database.IQueryBeanResult<entity.Coverage>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Coverage) at NewClaimExposureDV.Lossofusedamage.pcf: line 44, column 38
    function verifyValueRangeIsAllowedType_15 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function verifyValueRangeIsAllowedType_26 ($$arg :  entity.StatCode[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function verifyValueRangeIsAllowedType_26 ($$arg :  gw.api.database.IQueryBeanResult<entity.StatCode>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function verifyValueRangeIsAllowedType_26 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_55 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_55 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_55 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Coverage) at NewClaimExposureDV.Lossofusedamage.pcf: line 44, column 38
    function verifyValueRange_16 () : void {
      var __valueRangeArg = Exposure.Claim.Policy.getCoveragesByCoverageType(Exposure.PrimaryCoverage)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_15(__valueRangeArg)
    }
    
    // 'valueRange' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function verifyValueRange_27 () : void {
      var __valueRangeArg = Exposure.Claim.Policy.CappedStatCodes
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_26(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_56 () : void {
      var __valueRangeArg = Exposure.Claim.getRelatedContacts(Exposure.getContactType(TC_CLAIMANT))
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_55(__valueRangeArg)
    }
    
    // 'visible' attribute on TextInput (id=ServiceRequestSubmitMessageFNOL) at NewClaimExposureDV.Lossofusedamage.pcf: line 204, column 54
    function visible_121 () : java.lang.Boolean {
      return PropertyIncident.Claim.DraftClaim
    }
    
    // 'visible' attribute on TextInput (id=ServiceRequestSubmitMessage) at NewClaimExposureDV.Lossofusedamage.pcf: line 209, column 89
    function visible_123 () : java.lang.Boolean {
      return not PropertyIncident.Claim.DraftClaim and CurrentLocation.InEditMode
    }
    
    // 'visible' attribute on TextInput (id=StatLine_Warning) at NewClaimExposureDV.Lossofusedamage.pcf: line 60, column 65
    function visible_32 () : java.lang.Boolean {
      return Exposure.Claim.Policy.StatCodeListCapped
    }
    
    // 'visible' attribute on InputSet at NewClaimExposureDV.Lossofusedamage.pcf: line 46, column 59
    function visible_36 () : java.lang.Boolean {
      return Exposure.Claim.Policy.StatCodingEnabled
    }
    
    // 'visible' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 14, column 229
    function visible_41 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 16, column 225
    function visible_44 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Exposure.Claimant), Exposure.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on TextInput (id=Exposure_ALEMealsDays) at NewClaimExposureDV.Lossofusedamage.pcf: line 156, column 57
    function visible_92 () : java.lang.Boolean {
      return  PropertyIncident.LossofUse == true 
    }
    
    // 'visible' attribute on TextInput (id=Exposure_ALEMealsPeople) at NewClaimExposureDV.Lossofusedamage.pcf: line 163, column 56
    function visible_98 () : java.lang.Boolean {
      return PropertyIncident.LossofUse == true 
    }
    
    property get Exposure () : Exposure {
      return getRequireValue("Exposure", 0) as Exposure
    }
    
    property set Exposure ($arg :  Exposure) {
      setRequireValue("Exposure", 0, $arg)
    }
    
    property get PropertyIncident () : entity.PropertyIncident {
      return getVariableValue("PropertyIncident", 0) as entity.PropertyIncident
    }
    
    property set PropertyIncident ($arg :  entity.PropertyIncident) {
      setVariableValue("PropertyIncident", 0, $arg)
    }
    
    property get unusedServiceRequests () : java.util.Set<ServiceRequest> {
      return getRequireValue("unusedServiceRequests", 0) as java.util.Set<ServiceRequest>
    }
    
    property set unusedServiceRequests ($arg :  java.util.Set<ServiceRequest>) {
      setRequireValue("unusedServiceRequests", 0, $arg)
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