package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimExposureDV.Wcinjurydamage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewClaimExposureDV_WcinjurydamageExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimExposureDV.Wcinjurydamage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimExposureDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on PolicyStatCodePickerInput (id=StatLine) at NewClaimExposureDV.Wcinjurydamage.pcf: line 36, column 63
    function action_17 () : void {
      ClaimPolicyStatCodePickerPopup.push(Exposure.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=AltContact_Name) at ClaimContactWidget.xml: line 16, column 225
    function action_31 () : void {
      AddressBookPickerPopup.push(statictypeof (Exposure.altcontact), Exposure.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=AltContact_Name) at ClaimContactWidget.xml: line 18, column 285
    function action_33 () : void {
      if (Exposure.altcontact != null) { ClaimContactDetailPopup.push(Exposure.altcontact, Exposure.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=AltContact_Name) at ClaimContactWidget.xml: line 12, column 273
    function action_34 () : void {
      ClaimContactDetailPopup.push(Exposure.altcontact, Exposure.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Exposure_Doctor) at ClaimContactWidget.xml: line 16, column 225
    function action_51 () : void {
      AddressBookPickerPopup.push(statictypeof (Exposure.InjuryIncident.PrimaryDoctor), Exposure.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Exposure_Doctor) at ClaimContactWidget.xml: line 18, column 285
    function action_53 () : void {
      if (Exposure.InjuryIncident.PrimaryDoctor != null) { ClaimContactDetailPopup.push(Exposure.InjuryIncident.PrimaryDoctor, Exposure.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Exposure_Doctor) at ClaimContactWidget.xml: line 12, column 273
    function action_54 () : void {
      ClaimContactDetailPopup.push(Exposure.InjuryIncident.PrimaryDoctor, Exposure.Claim)
    }
    
    // 'action' attribute on MenuItem (id=StatLine_PickerButton) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function action_7 () : void {
      ClaimPolicyStatCodePickerPopup.push(Exposure.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Hospital) at ClaimContactWidget.xml: line 16, column 225
    function action_71 () : void {
      AddressBookPickerPopup.push(statictypeof (Exposure.hospital), Exposure.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Hospital) at ClaimContactWidget.xml: line 18, column 285
    function action_73 () : void {
      if (Exposure.hospital != null) { ClaimContactDetailPopup.push(Exposure.hospital, Exposure.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Hospital) at ClaimContactWidget.xml: line 12, column 273
    function action_74 () : void {
      ClaimContactDetailPopup.push(Exposure.hospital, Exposure.Claim)
    }
    
    // 'action' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function action_9 () : void {
      ClaimPolicyStatCodePickerPopup.push(Exposure.Claim)
    }
    
    // 'action' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function action_dest_10 () : pcf.api.Destination {
      return pcf.ClaimPolicyStatCodePickerPopup.createDestination(Exposure.Claim)
    }
    
    // 'action' attribute on PolicyStatCodePickerInput (id=StatLine) at NewClaimExposureDV.Wcinjurydamage.pcf: line 36, column 63
    function action_dest_18 () : pcf.api.Destination {
      return pcf.ClaimPolicyStatCodePickerPopup.createDestination(Exposure.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=AltContact_Name) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_32 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Exposure.altcontact), Exposure.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=AltContact_Name) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_35 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Exposure.altcontact, Exposure.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Exposure_Doctor) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_52 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Exposure.InjuryIncident.PrimaryDoctor), Exposure.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Exposure_Doctor) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_55 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Exposure.InjuryIncident.PrimaryDoctor, Exposure.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Hospital) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_72 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Exposure.hospital), Exposure.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Hospital) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_75 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Exposure.hospital, Exposure.Claim)
    }
    
    // 'action' attribute on MenuItem (id=StatLine_PickerButton) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function action_dest_8 () : pcf.api.Destination {
      return pcf.ClaimPolicyStatCodePickerPopup.createDestination(Exposure.Claim)
    }
    
    // 'def' attribute on ListViewInput at NewClaimExposureDV.Wcinjurydamage.pcf: line 127, column 27
    function def_onEnter_113 (def :  pcf.EditableMedicalActionsLV) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on ClaimContactInput (id=AltContact_Name) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_28 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Exposure.altcontact), null, Exposure.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Exposure_Doctor) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_48 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Exposure.InjuryIncident.PrimaryDoctor), null, Exposure.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Hospital) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_68 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Exposure.hospital), null, Exposure.Claim)
    }
    
    // 'def' attribute on ListViewInput at NewClaimExposureDV.Wcinjurydamage.pcf: line 127, column 27
    function def_refreshVariables_114 (def :  pcf.EditableMedicalActionsLV) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on ClaimContactInput (id=AltContact_Name) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_29 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Exposure.altcontact), null, Exposure.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Exposure_Doctor) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_49 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Exposure.InjuryIncident.PrimaryDoctor), null, Exposure.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Hospital) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_69 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Exposure.hospital), null, Exposure.Claim)
    }
    
    // 'value' attribute on DateInput (id=SettlementDate) at NewClaimExposureDV.Wcinjurydamage.pcf: line 102, column 38
    function defaultSetter_102 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.SettleDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TypeKeyInput (id=SettlementMethod) at NewClaimExposureDV.Wcinjurydamage.pcf: line 108, column 43
    function defaultSetter_106 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.SettleMethod = (__VALUE_TO_SET as typekey.SettleMethod)
    }
    
    // 'value' attribute on TypeKeyInput (id=JurisdictionState) at NewClaimExposureDV.Wcinjurydamage.pcf: line 118, column 43
    function defaultSetter_110 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.JurisdictionState = (__VALUE_TO_SET as typekey.Jurisdiction)
    }
    
    // 'value' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function defaultSetter_12 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.StatLine = (__VALUE_TO_SET as entity.StatCode)
    }
    
    // 'value' attribute on ClaimContactInput (id=AltContact_Name) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_38 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.altcontact = (__VALUE_TO_SET as entity.Person)
    }
    
    // 'value' attribute on ClaimContactInput (id=Exposure_Doctor) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_58 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.InjuryIncident.PrimaryDoctor = (__VALUE_TO_SET as entity.Doctor)
    }
    
    // 'value' attribute on ClaimContactInput (id=Hospital) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_78 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.hospital = (__VALUE_TO_SET as entity.MedicalCareOrg)
    }
    
    // 'value' attribute on TypeKeyInput (id=MedicalTreatment) at NewClaimExposureDV.Wcinjurydamage.pcf: line 81, column 51
    function defaultSetter_88 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.InjuryIncident.MedicalTreatmentType = (__VALUE_TO_SET as typekey.MedicalTreatmentType)
    }
    
    // 'value' attribute on BooleanRadioInput (id=PreexDisability) at NewClaimExposureDV.Wcinjurydamage.pcf: line 86, column 42
    function defaultSetter_92 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.WCPreexDisblty = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextInput (id=PreexDisabilityInfo) at NewClaimExposureDV.Wcinjurydamage.pcf: line 91, column 46
    function defaultSetter_96 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.WCPreexDisbltyInfo = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'filter' attribute on TypeKeyInput (id=JurisdictionState) at NewClaimExposureDV.Wcinjurydamage.pcf: line 118, column 43
    function filter_112 (VALUE :  typekey.Jurisdiction, VALUES :  typekey.Jurisdiction[]) : java.lang.Boolean {
      return VALUE.hasCategory(JurisdictionType.TC_INSURANCE)
    }
    
    // 'onPick' attribute on ClaimContactInput (id=AltContact_Name) at ClaimContactWidget.xml: line 12, column 273
    function onPick_36 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Exposure.altcontact); var result = eval("Exposure.altcontact = Exposure.Claim.resolveContact(Exposure.altcontact) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Exposure_Doctor) at ClaimContactWidget.xml: line 12, column 273
    function onPick_56 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Exposure.InjuryIncident.PrimaryDoctor); var result = eval("Exposure.InjuryIncident.PrimaryDoctor = Exposure.Claim.resolveContact(Exposure.InjuryIncident.PrimaryDoctor) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Hospital) at ClaimContactWidget.xml: line 12, column 273
    function onPick_76 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Exposure.hospital); var result = eval("Exposure.hospital = Exposure.Claim.resolveContact(Exposure.hospital) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'validationExpression' attribute on DateInput (id=SettlementDate) at NewClaimExposureDV.Wcinjurydamage.pcf: line 102, column 38
    function validationExpression_98 () : java.lang.Object {
      return Exposure.SettleDate == null || Exposure.SettleDate < gw.api.util.DateUtil.currentDate() ? null : DisplayKey.get("Java.Validation.Date.ForbidFuture")
    }
    
    // 'valueRange' attribute on PolicyStatCodePickerInput (id=StatLine) at PolicyStatCodePickerWidget.xml: line 5, column 25
    function valueRange_14 () : java.lang.Object {
      return Exposure.Claim.Policy.CappedStatCodes
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=AltContact_Name) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_40 () : java.lang.Object {
      return Exposure.Claim.RelatedPersonArray
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Exposure_Doctor) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_60 () : java.lang.Object {
      return Exposure.Claim.getRelatedContacts(Exposure.Claim.getContactType(TC_DOCTOR)) as Doctor[]
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Hospital) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_80 () : java.lang.Object {
      return Exposure.Claim.RelatedMedicalCareOrgArray
    }
    
    // 'value' attribute on TypeKeyInput (id=LossParty) at NewClaimExposureDV.Wcinjurydamage.pcf: line 22, column 44
    function valueRoot_2 () : java.lang.Object {
      return Exposure
    }
    
    // 'value' attribute on ClaimContactInput (id=Exposure_Doctor) at ClaimContactWidget.xml: line 12, column 273
    function valueRoot_59 () : java.lang.Object {
      return Exposure.InjuryIncident
    }
    
    // 'value' attribute on TypeKeyInput (id=LossParty) at NewClaimExposureDV.Wcinjurydamage.pcf: line 22, column 44
    function value_0 () : typekey.LossPartyType {
      return Exposure.LossParty
    }
    
    // 'value' attribute on TypeKeyInput (id=SettlementMethod) at NewClaimExposureDV.Wcinjurydamage.pcf: line 108, column 43
    function value_104 () : typekey.SettleMethod {
      return Exposure.SettleMethod
    }
    
    // 'value' attribute on TypeKeyInput (id=JurisdictionState) at NewClaimExposureDV.Wcinjurydamage.pcf: line 118, column 43
    function value_108 () : typekey.Jurisdiction {
      return Exposure.JurisdictionState
    }
    
    // 'value' attribute on TextInput (id=StatLine_Warning) at NewClaimExposureDV.Wcinjurydamage.pcf: line 43, column 65
    function value_22 () : java.lang.String {
      return DisplayKey.get("Java.StatCodes.StatCodeListCappedWarning", Exposure.Claim.Policy.StatCodeListCap, Exposure.Claim.Policy.StatCodes.length)
    }
    
    // 'value' attribute on ClaimContactInput (id=AltContact_Name) at NewClaimExposureDV.Wcinjurydamage.pcf: line 54, column 36
    function value_26 () : entity.Person {
      return Exposure.altcontact
    }
    
    // 'value' attribute on TypeKeyInput (id=PrimaryCoverage) at NewClaimExposureDV.Wcinjurydamage.pcf: line 27, column 43
    function value_3 () : typekey.CoverageType {
      return Exposure.PrimaryCoverage
    }
    
    // 'value' attribute on ClaimContactInput (id=Exposure_Doctor) at NewClaimExposureDV.Wcinjurydamage.pcf: line 66, column 36
    function value_46 () : entity.Doctor {
      return Exposure.InjuryIncident.PrimaryDoctor
    }
    
    // 'value' attribute on PolicyStatCodePickerInput (id=StatLine) at NewClaimExposureDV.Wcinjurydamage.pcf: line 36, column 63
    function value_6 () : entity.StatCode {
      return Exposure.StatLine
    }
    
    // 'value' attribute on ClaimContactInput (id=Hospital) at NewClaimExposureDV.Wcinjurydamage.pcf: line 75, column 44
    function value_66 () : entity.MedicalCareOrg {
      return Exposure.hospital
    }
    
    // 'value' attribute on TypeKeyInput (id=MedicalTreatment) at NewClaimExposureDV.Wcinjurydamage.pcf: line 81, column 51
    function value_86 () : typekey.MedicalTreatmentType {
      return Exposure.InjuryIncident.MedicalTreatmentType
    }
    
    // 'value' attribute on BooleanRadioInput (id=PreexDisability) at NewClaimExposureDV.Wcinjurydamage.pcf: line 86, column 42
    function value_90 () : java.lang.Boolean {
      return Exposure.WCPreexDisblty
    }
    
    // 'value' attribute on TextInput (id=PreexDisabilityInfo) at NewClaimExposureDV.Wcinjurydamage.pcf: line 91, column 46
    function value_94 () : java.lang.String {
      return Exposure.WCPreexDisbltyInfo
    }
    
    // 'value' attribute on DateInput (id=SettlementDate) at NewClaimExposureDV.Wcinjurydamage.pcf: line 102, column 38
    function value_99 () : java.util.Date {
      return Exposure.SettleDate
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
    
    // 'valueRange' attribute on ClaimContactInput (id=AltContact_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_41 ($$arg :  entity.Person[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=AltContact_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_41 ($$arg :  gw.api.database.IQueryBeanResult<entity.Person>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=AltContact_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_41 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Exposure_Doctor) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_61 ($$arg :  entity.Doctor[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Exposure_Doctor) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_61 ($$arg :  gw.api.database.IQueryBeanResult<entity.Doctor>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Exposure_Doctor) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_61 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Hospital) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_81 ($$arg :  entity.MedicalCareOrg[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Hospital) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_81 ($$arg :  gw.api.database.IQueryBeanResult<entity.MedicalCareOrg>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Hospital) at ClaimContactWidget.xml: line 12, column 273
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
    
    // 'valueRange' attribute on ClaimContactInput (id=AltContact_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_42 () : void {
      var __valueRangeArg = Exposure.Claim.RelatedPersonArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_41(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Exposure_Doctor) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_62 () : void {
      var __valueRangeArg = Exposure.Claim.getRelatedContacts(Exposure.Claim.getContactType(TC_DOCTOR)) as Doctor[]
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_61(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Hospital) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_82 () : void {
      var __valueRangeArg = Exposure.Claim.RelatedMedicalCareOrgArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_81(__valueRangeArg)
    }
    
    // 'valueType' attribute on ClaimContactInput (id=AltContact_Name) at NewClaimExposureDV.Wcinjurydamage.pcf: line 54, column 36
    function verifyValueType_45 () : void {
      var __valueTypeArg : entity.Person
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'valueType' attribute on ClaimContactInput (id=Exposure_Doctor) at NewClaimExposureDV.Wcinjurydamage.pcf: line 66, column 36
    function verifyValueType_65 () : void {
      var __valueTypeArg : entity.Doctor
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'valueType' attribute on ClaimContactInput (id=Hospital) at NewClaimExposureDV.Wcinjurydamage.pcf: line 75, column 44
    function verifyValueType_85 () : void {
      var __valueTypeArg : entity.MedicalCareOrg
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'visible' attribute on TextInput (id=StatLine_Warning) at NewClaimExposureDV.Wcinjurydamage.pcf: line 43, column 65
    function visible_21 () : java.lang.Boolean {
      return Exposure.Claim.Policy.StatCodeListCapped
    }
    
    // 'visible' attribute on InputSet at NewClaimExposureDV.Wcinjurydamage.pcf: line 29, column 59
    function visible_25 () : java.lang.Boolean {
      return Exposure.Claim.Policy.StatCodingEnabled
    }
    
    // 'visible' attribute on ClaimContactInput (id=AltContact_Name) at ClaimContactWidget.xml: line 14, column 229
    function visible_27 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactInput (id=AltContact_Name) at ClaimContactWidget.xml: line 16, column 225
    function visible_30 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Exposure.altcontact), Exposure.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on ClaimContactInput (id=Exposure_Doctor) at ClaimContactWidget.xml: line 16, column 225
    function visible_50 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Exposure.InjuryIncident.PrimaryDoctor), Exposure.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on ClaimContactInput (id=Hospital) at ClaimContactWidget.xml: line 16, column 225
    function visible_70 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Exposure.hospital), Exposure.Claim, null as List<SpecialistService>)" != "" && true
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