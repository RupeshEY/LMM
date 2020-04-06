package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimPIPSummaryDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewClaimPIPSummaryDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimPIPSummaryDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimPIPSummaryDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on PolicyStatCodePickerInput (id=StatLine) at NewClaimPIPSummaryDV.pcf: line 32, column 63
    function action_17 () : void {
      ClaimPolicyStatCodePickerPopup.push(Exposure.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=PIPDamages_Claimant) at ClaimContactWidget.xml: line 16, column 225
    function action_38 () : void {
      AddressBookPickerPopup.push(statictypeof (Exposure.Claimant), Exposure.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=PIPDamages_Claimant) at ClaimContactWidget.xml: line 18, column 285
    function action_40 () : void {
      if (Exposure.Claimant != null) { ClaimContactDetailPopup.push(Exposure.Claimant, Exposure.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=PIPDamages_Claimant) at ClaimContactWidget.xml: line 12, column 273
    function action_41 () : void {
      ClaimContactDetailPopup.push(Exposure.Claimant, Exposure.Claim)
    }
    
    // 'action' attribute on MenuItem (id=StatLine_PickerButton) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function action_7 () : void {
      ClaimPolicyStatCodePickerPopup.push(Exposure.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=DisBenefits_Provider) at ClaimContactWidget.xml: line 16, column 225
    function action_71 () : void {
      AddressBookPickerPopup.push(statictypeof (Exposure.disbenprovider), Exposure.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=DisBenefits_Provider) at ClaimContactWidget.xml: line 18, column 285
    function action_73 () : void {
      if (Exposure.disbenprovider != null) { ClaimContactDetailPopup.push(Exposure.disbenprovider, Exposure.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=DisBenefits_Provider) at ClaimContactWidget.xml: line 12, column 273
    function action_74 () : void {
      ClaimContactDetailPopup.push(Exposure.disbenprovider, Exposure.Claim)
    }
    
    // 'action' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function action_9 () : void {
      ClaimPolicyStatCodePickerPopup.push(Exposure.Claim)
    }
    
    // 'action' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function action_dest_10 () : pcf.api.Destination {
      return pcf.ClaimPolicyStatCodePickerPopup.createDestination(Exposure.Claim)
    }
    
    // 'action' attribute on PolicyStatCodePickerInput (id=StatLine) at NewClaimPIPSummaryDV.pcf: line 32, column 63
    function action_dest_18 () : pcf.api.Destination {
      return pcf.ClaimPolicyStatCodePickerPopup.createDestination(Exposure.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=PIPDamages_Claimant) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_39 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Exposure.Claimant), Exposure.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=PIPDamages_Claimant) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_42 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Exposure.Claimant, Exposure.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=DisBenefits_Provider) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_72 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Exposure.disbenprovider), Exposure.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=DisBenefits_Provider) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_75 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Exposure.disbenprovider, Exposure.Claim)
    }
    
    // 'action' attribute on MenuItem (id=StatLine_PickerButton) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function action_dest_8 () : pcf.api.Destination {
      return pcf.ClaimPolicyStatCodePickerPopup.createDestination(Exposure.Claim)
    }
    
    // 'condition' attribute on ReflectCondition at NewClaimPIPSummaryDV.pcf: line 69, column 45
    function condition_30 (TRIGGER_INDEX :  int, VALUE :  typekey.LossPartyType) : java.lang.Boolean {
      return VALUE == TC_INSURED
    }
    
    // 'condition' attribute on ReflectCondition at NewClaimPIPSummaryDV.pcf: line 91, column 42
    function condition_56 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Boolean {
      return Exposure.Claim.Insured==VALUE
    }
    
    // 'def' attribute on InputSetRef at NewClaimPIPSummaryDV.pcf: line 43, column 43
    function def_onEnter_26 (def :  pcf.BIDamageInputSet) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on ListViewInput at NewClaimPIPSummaryDV.pcf: line 48, column 101
    function def_onEnter_28 (def :  pcf.IMEPerformedLV) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on ClaimContactInput (id=PIPDamages_Claimant) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_35 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Exposure.Claimant), null, Exposure.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=DisBenefits_Provider) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_68 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Exposure.disbenprovider), null, Exposure.Claim)
    }
    
    // 'def' attribute on InputSetRef at NewClaimPIPSummaryDV.pcf: line 43, column 43
    function def_refreshVariables_27 (def :  pcf.BIDamageInputSet) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on ListViewInput at NewClaimPIPSummaryDV.pcf: line 48, column 101
    function def_refreshVariables_29 (def :  pcf.IMEPerformedLV) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on ClaimContactInput (id=PIPDamages_Claimant) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_36 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Exposure.Claimant), null, Exposure.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=DisBenefits_Provider) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_69 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Exposure.disbenprovider), null, Exposure.Claim)
    }
    
    // 'value' attribute on CurrencyInput (id=LostWagesBenefits_WeeklyCompRate) at NewClaimPIPSummaryDV.pcf: line 141, column 54
    function defaultSetter_103 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.DisBenefits.WeeklyCompRate = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on TextInput (id=LostWagesBenefits_Description) at NewClaimPIPSummaryDV.pcf: line 146, column 51
    function defaultSetter_107 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.DisBenefits.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function defaultSetter_12 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.StatLine = (__VALUE_TO_SET as entity.StatCode)
    }
    
    // 'value' attribute on ClaimContactInput (id=PIPDamages_Claimant) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_45 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.Claimant = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claimant_ContactPermitted) at NewClaimPIPSummaryDV.pcf: line 79, column 44
    function defaultSetter_54 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.ContactPermitted = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TypeKeyInput (id=Exposure_ClaimantType) at NewClaimPIPSummaryDV.pcf: line 86, column 42
    function defaultSetter_60 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.ClaimantType = (__VALUE_TO_SET as typekey.ClaimantType)
    }
    
    // 'value' attribute on BooleanRadioInput (id=PIPDamages_SSDIEligible) at NewClaimPIPSummaryDV.pcf: line 104, column 40
    function defaultSetter_64 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.SSDIEligible = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on ClaimContactInput (id=DisBenefits_Provider) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_78 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.disbenprovider = (__VALUE_TO_SET as entity.Company)
    }
    
    // 'onPick' attribute on ClaimContactInput (id=PIPDamages_Claimant) at ClaimContactWidget.xml: line 12, column 273
    function onPick_43 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Exposure.Claimant); var result = eval("Exposure.Claimant = Exposure.Claim.resolveContact(Exposure.Claimant) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=DisBenefits_Provider) at ClaimContactWidget.xml: line 12, column 273
    function onPick_76 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Exposure.disbenprovider); var result = eval("Exposure.disbenprovider = Exposure.Claim.resolveContact(Exposure.disbenprovider) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'value' attribute on Reflect at NewClaimPIPSummaryDV.pcf: line 155, column 44
    function reflectionValue_109 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Object {
      return VALUE.PrimaryPhoneValue
    }
    
    // 'value' attribute on Reflect at NewClaimPIPSummaryDV.pcf: line 164, column 53
    function reflectionValue_114 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Object {
      return VALUE.PrimaryAddressDisplayValue
    }
    
    // Reflect at NewClaimPIPSummaryDV.pcf: line 66, column 34
    function reflectionValue_32 (TRIGGER_INDEX :  int, VALUE :  typekey.LossPartyType) : java.lang.Object {
      return (VALUE == TC_INSURED) ? (Exposure.Claim.Insured) : (true) ? ("") : "<NOCHANGE>"
    }
    
    // Reflect at NewClaimPIPSummaryDV.pcf: line 88, column 44
    function reflectionValue_57 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Object {
      return (Exposure.Claim.Insured==VALUE) ? ("insured") : (true) ? ("") : "<NOCHANGE>"
    }
    
    // 'value' attribute on Reflect at NewClaimPIPSummaryDV.pcf: line 119, column 53
    function reflectionValue_86 (TRIGGER_INDEX :  int, VALUE :  entity.Company) : java.lang.Object {
      return VALUE.PrimaryAddressDisplayValue
    }
    
    // 'value' attribute on Reflect at NewClaimPIPSummaryDV.pcf: line 127, column 53
    function reflectionValue_91 (TRIGGER_INDEX :  int, VALUE :  entity.Company) : java.lang.Object {
      return VALUE.PrimaryContact.DisplayName
    }
    
    // 'value' attribute on Reflect at NewClaimPIPSummaryDV.pcf: line 135, column 44
    function reflectionValue_96 (TRIGGER_INDEX :  int, VALUE :  entity.Company) : java.lang.Object {
      return VALUE.PrimaryPhoneValue
    }
    
    // 'valueRange' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function valueRange_14 () : java.lang.Object {
      return Exposure.Claim.Policy.CappedStatCodes
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=PIPDamages_Claimant) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_47 () : java.lang.Object {
      return Exposure.Claim.getRelatedContacts(Exposure.getContactType(TC_CLAIMANT))
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=DisBenefits_Provider) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_80 () : java.lang.Object {
      return Exposure.Claim.RelatedCompanyArray
    }
    
    // 'value' attribute on CurrencyInput (id=LostWagesBenefits_WeeklyCompRate) at NewClaimPIPSummaryDV.pcf: line 141, column 54
    function valueRoot_104 () : java.lang.Object {
      return Exposure.DisBenefits
    }
    
    // 'value' attribute on TextInput (id=Claimant_PrimaryPhone) at NewClaimPIPSummaryDV.pcf: line 152, column 53
    function valueRoot_113 () : java.lang.Object {
      return Exposure.Claimant
    }
    
    // 'value' attribute on TypeKeyInput (id=LossParty) at NewClaimPIPSummaryDV.pcf: line 18, column 44
    function valueRoot_2 () : java.lang.Object {
      return Exposure
    }
    
    // 'value' attribute on TextInput (id=Provider_PrimaryAddress) at NewClaimPIPSummaryDV.pcf: line 116, column 68
    function valueRoot_90 () : java.lang.Object {
      return Exposure.disbenprovider
    }
    
    // 'value' attribute on TextInput (id=Provider_PrimaryContact) at NewClaimPIPSummaryDV.pcf: line 124, column 68
    function valueRoot_95 () : java.lang.Object {
      return Exposure.disbenprovider.PrimaryContact
    }
    
    // 'value' attribute on TypeKeyInput (id=LossParty) at NewClaimPIPSummaryDV.pcf: line 18, column 44
    function value_0 () : typekey.LossPartyType {
      return Exposure.LossParty
    }
    
    // 'value' attribute on CurrencyInput (id=LostWagesBenefits_WeeklyCompRate) at NewClaimPIPSummaryDV.pcf: line 141, column 54
    function value_101 () : gw.api.financials.CurrencyAmount {
      return Exposure.DisBenefits.WeeklyCompRate
    }
    
    // 'value' attribute on TextInput (id=LostWagesBenefits_Description) at NewClaimPIPSummaryDV.pcf: line 146, column 51
    function value_105 () : java.lang.String {
      return Exposure.DisBenefits.Description
    }
    
    // 'value' attribute on TextInput (id=Claimant_PrimaryPhone) at NewClaimPIPSummaryDV.pcf: line 152, column 53
    function value_111 () : java.lang.String {
      return Exposure.Claimant.PrimaryPhoneValue
    }
    
    // 'value' attribute on TextInput (id=Claimant_PrimaryAddress) at NewClaimPIPSummaryDV.pcf: line 161, column 62
    function value_116 () : java.lang.String {
      return Exposure.Claimant.PrimaryAddressDisplayValue
    }
    
    // 'value' attribute on TextInput (id=StatLine_Warning) at NewClaimPIPSummaryDV.pcf: line 39, column 65
    function value_22 () : java.lang.String {
      return DisplayKey.get("Java.StatCodes.StatCodeListCappedWarning", Exposure.Claim.Policy.StatCodeListCap, Exposure.Claim.Policy.StatCodes.length)
    }
    
    // 'value' attribute on TypeKeyInput (id=PrimaryCoverage) at NewClaimPIPSummaryDV.pcf: line 23, column 43
    function value_3 () : typekey.CoverageType {
      return Exposure.PrimaryCoverage
    }
    
    // 'value' attribute on ReflectCondition at NewClaimPIPSummaryDV.pcf: line 69, column 45
    function value_31 (TRIGGER_INDEX :  int, VALUE :  typekey.LossPartyType) : java.lang.Object {
      return Exposure.Claim.Insured
    }
    
    // 'value' attribute on ClaimContactInput (id=PIPDamages_Claimant) at NewClaimPIPSummaryDV.pcf: line 64, column 94
    function value_33 () : entity.Contact {
      return Exposure.Claimant
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claimant_ContactPermitted) at NewClaimPIPSummaryDV.pcf: line 79, column 44
    function value_52 () : java.lang.Boolean {
      return Exposure.ContactPermitted
    }
    
    // 'value' attribute on TypeKeyInput (id=Exposure_ClaimantType) at NewClaimPIPSummaryDV.pcf: line 86, column 42
    function value_58 () : typekey.ClaimantType {
      return Exposure.ClaimantType
    }
    
    // 'value' attribute on PolicyStatCodePickerInput (id=StatLine) at NewClaimPIPSummaryDV.pcf: line 32, column 63
    function value_6 () : entity.StatCode {
      return Exposure.StatLine
    }
    
    // 'value' attribute on BooleanRadioInput (id=PIPDamages_SSDIEligible) at NewClaimPIPSummaryDV.pcf: line 104, column 40
    function value_62 () : java.lang.Boolean {
      return Exposure.SSDIEligible
    }
    
    // 'value' attribute on ClaimContactInput (id=DisBenefits_Provider) at NewClaimPIPSummaryDV.pcf: line 112, column 37
    function value_66 () : entity.Company {
      return Exposure.disbenprovider
    }
    
    // 'value' attribute on TextInput (id=Provider_PrimaryAddress) at NewClaimPIPSummaryDV.pcf: line 116, column 68
    function value_88 () : java.lang.String {
      return Exposure.disbenprovider.PrimaryAddressDisplayValue
    }
    
    // 'value' attribute on TextInput (id=Provider_PrimaryContact) at NewClaimPIPSummaryDV.pcf: line 124, column 68
    function value_93 () : java.lang.String {
      return Exposure.disbenprovider.PrimaryContact.DisplayName
    }
    
    // 'value' attribute on TextInput (id=Provider_PrimaryPhone) at NewClaimPIPSummaryDV.pcf: line 132, column 59
    function value_98 () : java.lang.String {
      return Exposure.disbenprovider.PrimaryPhoneValue
    }
    
    // 'valueRange' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function verifyValueRangeIsAllowedType_15 ($$arg :  entity.StatCode[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function verifyValueRangeIsAllowedType_15 ($$arg :  gw.api.database.IQueryBeanResult<entity.StatCode>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function verifyValueRangeIsAllowedType_15 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=PIPDamages_Claimant) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_48 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=PIPDamages_Claimant) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_48 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=PIPDamages_Claimant) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_48 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=DisBenefits_Provider) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_81 ($$arg :  entity.Company[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=DisBenefits_Provider) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_81 ($$arg :  gw.api.database.IQueryBeanResult<entity.Company>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=DisBenefits_Provider) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_81 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function verifyValueRange_16 () : void {
      var __valueRangeArg = Exposure.Claim.Policy.CappedStatCodes
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_15(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=PIPDamages_Claimant) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_49 () : void {
      var __valueRangeArg = Exposure.Claim.getRelatedContacts(Exposure.getContactType(TC_CLAIMANT))
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_48(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=DisBenefits_Provider) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_82 () : void {
      var __valueRangeArg = Exposure.Claim.RelatedCompanyArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_81(__valueRangeArg)
    }
    
    // 'valueType' attribute on ClaimContactInput (id=DisBenefits_Provider) at NewClaimPIPSummaryDV.pcf: line 112, column 37
    function verifyValueType_85 () : void {
      var __valueTypeArg : entity.Company
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'visible' attribute on TextInput (id=StatLine_Warning) at NewClaimPIPSummaryDV.pcf: line 39, column 65
    function visible_21 () : java.lang.Boolean {
      return Exposure.Claim.Policy.StatCodeListCapped
    }
    
    // 'visible' attribute on InputSet at NewClaimPIPSummaryDV.pcf: line 25, column 59
    function visible_25 () : java.lang.Boolean {
      return Exposure.Claim.Policy.StatCodingEnabled
    }
    
    // 'visible' attribute on ClaimContactInput (id=PIPDamages_Claimant) at ClaimContactWidget.xml: line 14, column 229
    function visible_34 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactInput (id=PIPDamages_Claimant) at ClaimContactWidget.xml: line 16, column 225
    function visible_37 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Exposure.Claimant), Exposure.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on ClaimContactInput (id=DisBenefits_Provider) at ClaimContactWidget.xml: line 16, column 225
    function visible_70 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Exposure.disbenprovider), Exposure.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    property get Exposure () : Exposure {
      return getRequireValue("Exposure", 0) as Exposure
    }
    
    property set Exposure ($arg :  Exposure) {
      setRequireValue("Exposure", 0, $arg)
    }
    
    
  }
  
  
}