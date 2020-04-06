package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/WCInjuryDamageDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class WCInjuryDamageDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/exposures/WCInjuryDamageDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WCInjuryDamageDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ClaimContactInput (id=Hospital_Hospital) at ClaimContactWidget.xml: line 16, column 225
    function action_101 () : void {
      AddressBookPickerPopup.push(statictypeof (Exposure.Claim.hospital), Exposure.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Hospital_Hospital) at ClaimContactWidget.xml: line 18, column 285
    function action_103 () : void {
      if (Exposure.Claim.hospital != null) { ClaimContactDetailPopup.push(Exposure.Claim.hospital, Exposure.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Hospital_Hospital) at ClaimContactWidget.xml: line 12, column 273
    function action_104 () : void {
      ClaimContactDetailPopup.push(Exposure.Claim.hospital, Exposure.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=FirstNotice_FirstIntakeDoctor) at ClaimContactWidget.xml: line 16, column 225
    function action_53 () : void {
      AddressBookPickerPopup.push(statictypeof (Exposure.Claim.FirstIntakeDoctor), Exposure.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=FirstNotice_FirstIntakeDoctor) at ClaimContactWidget.xml: line 18, column 285
    function action_55 () : void {
      if (Exposure.Claim.FirstIntakeDoctor != null) { ClaimContactDetailPopup.push(Exposure.Claim.FirstIntakeDoctor, Exposure.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=FirstNotice_FirstIntakeDoctor) at ClaimContactWidget.xml: line 12, column 273
    function action_56 () : void {
      ClaimContactDetailPopup.push(Exposure.Claim.FirstIntakeDoctor, Exposure.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Hospital_Hospital) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_102 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Exposure.Claim.hospital), Exposure.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Hospital_Hospital) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_105 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Exposure.Claim.hospital, Exposure.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=FirstNotice_FirstIntakeDoctor) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_54 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Exposure.Claim.FirstIntakeDoctor), Exposure.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=FirstNotice_FirstIntakeDoctor) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_57 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Exposure.Claim.FirstIntakeDoctor, Exposure.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=FirstNotice_FirstIntakeDoctor) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_50 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Exposure.Claim.FirstIntakeDoctor), null, Exposure.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Hospital_Hospital) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_98 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Exposure.Claim.hospital), null, Exposure.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=FirstNotice_FirstIntakeDoctor) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_51 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Exposure.Claim.FirstIntakeDoctor), null, Exposure.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Hospital_Hospital) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_99 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Exposure.Claim.hospital), null, Exposure.Claim)
    }
    
    // 'value' attribute on DateInput (id=MPN_EmpSentMPNNotice) at WCInjuryDamageDV.pcf: line 32, column 50
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.Claim.EmpSentMPNNotice = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on ClaimContactInput (id=Hospital_Hospital) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_108 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.Claim.hospital = (__VALUE_TO_SET as entity.MedicalCareOrg)
    }
    
    // 'value' attribute on DateInput (id=Hospital_HospitalDate) at WCInjuryDamageDV.pcf: line 157, column 46
    function defaultSetter_118 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.Claim.HospitalDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TextInput (id=Hospital_HospitalDays) at WCInjuryDamageDV.pcf: line 163, column 40
    function defaultSetter_122 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.Claim.HospitalDays = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Hospital_PreexDisability) at WCInjuryDamageDV.pcf: line 168, column 45
    function defaultSetter_126 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.Claim.PreexDisblty = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextInput (id=Hospital_PreexDisabilityInfo) at WCInjuryDamageDV.pcf: line 176, column 56
    function defaultSetter_132 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.Claim.PreexDisbltyInfo = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on DateInput (id=SettlementDate) at WCInjuryDamageDV.pcf: line 185, column 38
    function defaultSetter_138 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.SettleDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateInput (id=MPN_InjWkrInMPN) at WCInjuryDamageDV.pcf: line 38, column 45
    function defaultSetter_14 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.Claim.InjWkrInMPN = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TypeKeyInput (id=SettlementMethod) at WCInjuryDamageDV.pcf: line 191, column 43
    function defaultSetter_142 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.SettleMethod = (__VALUE_TO_SET as typekey.SettleMethod)
    }
    
    // 'value' attribute on BooleanRadioInput (id=MPN_PTPinMPN) at WCInjuryDamageDV.pcf: line 20, column 42
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.Claim.PTPinMPN = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on DateInput (id=MMI_MMIdate) at WCInjuryDamageDV.pcf: line 47, column 41
    function defaultSetter_20 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.Claim.MMIdate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TextAreaInput (id=MMI_MMInote) at WCInjuryDamageDV.pcf: line 54, column 41
    function defaultSetter_26 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.Claim.MMInote = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextAreaInput (id=FirstNotice_SubjComplaints) at WCInjuryDamageDV.pcf: line 65, column 48
    function defaultSetter_30 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.Claim.SubjComplaints = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextAreaInput (id=FirstNotice_ObjFindings) at WCInjuryDamageDV.pcf: line 72, column 45
    function defaultSetter_34 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.Claim.ObjFindings = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on BooleanRadioInput (id=FirstNotice_DiagnosticConsistent) at WCInjuryDamageDV.pcf: line 77, column 52
    function defaultSetter_38 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.Claim.DiagnosticCnsistnt = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=FirstNotice_CurrentConditions) at WCInjuryDamageDV.pcf: line 82, column 51
    function defaultSetter_42 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.Claim.CurrentConditions = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=FirstNotice_TreatedPatientBefore) at WCInjuryDamageDV.pcf: line 87, column 51
    function defaultSetter_46 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.Claim.TreatedPatientBfr = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on DateInput (id=MPN_InsurerSentMPNNotice) at WCInjuryDamageDV.pcf: line 26, column 54
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.Claim.InsurerSentMPNNotice = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on ClaimContactInput (id=FirstNotice_FirstIntakeDoctor) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_60 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.Claim.FirstIntakeDoctor = (__VALUE_TO_SET as entity.Doctor)
    }
    
    // 'value' attribute on BooleanRadioInput (id=FirstNotice_EmployeeAuthorizationToReleaseMedicalRecords) at WCInjuryDamageDV.pcf: line 106, column 65
    function defaultSetter_70 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.Claim.ClaimWorkComp.MedRecReleaseAuth = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextInput (id=FirstNotice_MedicalDiagnosis) at WCInjuryDamageDV.pcf: line 111, column 50
    function defaultSetter_74 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.Claim.MedicalDiagnosis = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on DateInput (id=FirstNotice_ExaminationDate) at WCInjuryDamageDV.pcf: line 117, column 49
    function defaultSetter_78 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.Claim.ExaminationDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TypeKeyInput (id=FirstNotice_InitialTreatment) at WCInjuryDamageDV.pcf: line 124, column 47
    function defaultSetter_82 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.Claim.ClaimWorkComp.InitialTreatment = (__VALUE_TO_SET as typekey.InitialTreatment)
    }
    
    // 'value' attribute on TypeKeyInput (id=FirstNotice_MedicalTreatment) at WCInjuryDamageDV.pcf: line 130, column 51
    function defaultSetter_86 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.Claim.ClaimInjuryIncident.MedicalTreatmentType = (__VALUE_TO_SET as typekey.MedicalTreatmentType)
    }
    
    // 'value' attribute on TextAreaInput (id=FirstNotice_TreatmentRend) at WCInjuryDamageDV.pcf: line 138, column 47
    function defaultSetter_90 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.Claim.TreatmentRend = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on BooleanRadioInput (id=FirstNotice_FurtherTreatment) at WCInjuryDamageDV.pcf: line 143, column 50
    function defaultSetter_94 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.Claim.FurtherTreatment = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'editable' attribute on DateInput (id=MMI_MMIdate) at WCInjuryDamageDV.pcf: line 47, column 41
    function editable_16 () : java.lang.Boolean {
      return perm.System.editSensMCMdetails
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Hospital_Hospital) at ClaimContactWidget.xml: line 12, column 273
    function onPick_106 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Exposure.Claim.hospital); var result = eval("Exposure.Claim.hospital = Exposure.Claim.resolveContact(Exposure.Claim.hospital) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=FirstNotice_FirstIntakeDoctor) at ClaimContactWidget.xml: line 12, column 273
    function onPick_58 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Exposure.Claim.FirstIntakeDoctor); var result = eval("Exposure.Claim.FirstIntakeDoctor = Exposure.Claim.resolveContact(Exposure.Claim.FirstIntakeDoctor) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'validationExpression' attribute on DateInput (id=SettlementDate) at WCInjuryDamageDV.pcf: line 185, column 38
    function validationExpression_134 () : java.lang.Object {
      return Exposure.SettleDate == null || Exposure.SettleDate < gw.api.util.DateUtil.currentDate() ? null : DisplayKey.get("Java.Validation.Date.ForbidFuture")
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Hospital_Hospital) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_110 () : java.lang.Object {
      return Exposure.Claim.RelatedMedicalCareOrgArray
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=FirstNotice_FirstIntakeDoctor) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_62 () : java.lang.Object {
      return Exposure.Claim.getRelatedContacts(Exposure.Claim.getContactType(TC_FIRSTINTAKEDOCTOR)) as Doctor[]
    }
    
    // 'value' attribute on DateInput (id=SettlementDate) at WCInjuryDamageDV.pcf: line 185, column 38
    function valueRoot_139 () : java.lang.Object {
      return Exposure
    }
    
    // 'value' attribute on BooleanRadioInput (id=MPN_PTPinMPN) at WCInjuryDamageDV.pcf: line 20, column 42
    function valueRoot_3 () : java.lang.Object {
      return Exposure.Claim
    }
    
    // 'value' attribute on BooleanRadioInput (id=FirstNotice_EmployeeAuthorizationToReleaseMedicalRecords) at WCInjuryDamageDV.pcf: line 106, column 65
    function valueRoot_71 () : java.lang.Object {
      return Exposure.Claim.ClaimWorkComp
    }
    
    // 'value' attribute on TypeKeyInput (id=FirstNotice_MedicalTreatment) at WCInjuryDamageDV.pcf: line 130, column 51
    function valueRoot_87 () : java.lang.Object {
      return Exposure.Claim.ClaimInjuryIncident
    }
    
    // 'value' attribute on BooleanRadioInput (id=MPN_PTPinMPN) at WCInjuryDamageDV.pcf: line 20, column 42
    function value_0 () : java.lang.Boolean {
      return Exposure.Claim.PTPinMPN
    }
    
    // 'value' attribute on DateInput (id=Hospital_HospitalDate) at WCInjuryDamageDV.pcf: line 157, column 46
    function value_116 () : java.util.Date {
      return Exposure.Claim.HospitalDate
    }
    
    // 'value' attribute on DateInput (id=MPN_InjWkrInMPN) at WCInjuryDamageDV.pcf: line 38, column 45
    function value_12 () : java.util.Date {
      return Exposure.Claim.InjWkrInMPN
    }
    
    // 'value' attribute on TextInput (id=Hospital_HospitalDays) at WCInjuryDamageDV.pcf: line 163, column 40
    function value_120 () : java.lang.Integer {
      return Exposure.Claim.HospitalDays
    }
    
    // 'value' attribute on BooleanRadioInput (id=Hospital_PreexDisability) at WCInjuryDamageDV.pcf: line 168, column 45
    function value_124 () : java.lang.Boolean {
      return Exposure.Claim.PreexDisblty
    }
    
    // 'value' attribute on TextInput (id=Hospital_PreexDisabilityInfo) at WCInjuryDamageDV.pcf: line 176, column 56
    function value_129 () : java.lang.String {
      return Exposure.Claim.PreexDisbltyInfo
    }
    
    // 'value' attribute on DateInput (id=SettlementDate) at WCInjuryDamageDV.pcf: line 185, column 38
    function value_135 () : java.util.Date {
      return Exposure.SettleDate
    }
    
    // 'value' attribute on TypeKeyInput (id=SettlementMethod) at WCInjuryDamageDV.pcf: line 191, column 43
    function value_140 () : typekey.SettleMethod {
      return Exposure.SettleMethod
    }
    
    // 'value' attribute on DateInput (id=MMI_MMIdate) at WCInjuryDamageDV.pcf: line 47, column 41
    function value_17 () : java.util.Date {
      return Exposure.Claim.MMIdate
    }
    
    // 'value' attribute on TextAreaInput (id=MMI_MMInote) at WCInjuryDamageDV.pcf: line 54, column 41
    function value_23 () : java.lang.String {
      return Exposure.Claim.MMInote
    }
    
    // 'value' attribute on TextAreaInput (id=FirstNotice_SubjComplaints) at WCInjuryDamageDV.pcf: line 65, column 48
    function value_28 () : java.lang.String {
      return Exposure.Claim.SubjComplaints
    }
    
    // 'value' attribute on TextAreaInput (id=FirstNotice_ObjFindings) at WCInjuryDamageDV.pcf: line 72, column 45
    function value_32 () : java.lang.String {
      return Exposure.Claim.ObjFindings
    }
    
    // 'value' attribute on BooleanRadioInput (id=FirstNotice_DiagnosticConsistent) at WCInjuryDamageDV.pcf: line 77, column 52
    function value_36 () : java.lang.Boolean {
      return Exposure.Claim.DiagnosticCnsistnt
    }
    
    // 'value' attribute on DateInput (id=MPN_InsurerSentMPNNotice) at WCInjuryDamageDV.pcf: line 26, column 54
    function value_4 () : java.util.Date {
      return Exposure.Claim.InsurerSentMPNNotice
    }
    
    // 'value' attribute on BooleanRadioInput (id=FirstNotice_CurrentConditions) at WCInjuryDamageDV.pcf: line 82, column 51
    function value_40 () : java.lang.Boolean {
      return Exposure.Claim.CurrentConditions
    }
    
    // 'value' attribute on BooleanRadioInput (id=FirstNotice_TreatedPatientBefore) at WCInjuryDamageDV.pcf: line 87, column 51
    function value_44 () : java.lang.Boolean {
      return Exposure.Claim.TreatedPatientBfr
    }
    
    // 'value' attribute on ClaimContactInput (id=FirstNotice_FirstIntakeDoctor) at WCInjuryDamageDV.pcf: line 100, column 36
    function value_48 () : entity.Doctor {
      return Exposure.Claim.FirstIntakeDoctor
    }
    
    // 'value' attribute on BooleanRadioInput (id=FirstNotice_EmployeeAuthorizationToReleaseMedicalRecords) at WCInjuryDamageDV.pcf: line 106, column 65
    function value_68 () : java.lang.Boolean {
      return Exposure.Claim.ClaimWorkComp.MedRecReleaseAuth
    }
    
    // 'value' attribute on TextInput (id=FirstNotice_MedicalDiagnosis) at WCInjuryDamageDV.pcf: line 111, column 50
    function value_72 () : java.lang.String {
      return Exposure.Claim.MedicalDiagnosis
    }
    
    // 'value' attribute on DateInput (id=FirstNotice_ExaminationDate) at WCInjuryDamageDV.pcf: line 117, column 49
    function value_76 () : java.util.Date {
      return Exposure.Claim.ExaminationDate
    }
    
    // 'value' attribute on DateInput (id=MPN_EmpSentMPNNotice) at WCInjuryDamageDV.pcf: line 32, column 50
    function value_8 () : java.util.Date {
      return Exposure.Claim.EmpSentMPNNotice
    }
    
    // 'value' attribute on TypeKeyInput (id=FirstNotice_InitialTreatment) at WCInjuryDamageDV.pcf: line 124, column 47
    function value_80 () : typekey.InitialTreatment {
      return Exposure.Claim.ClaimWorkComp.InitialTreatment
    }
    
    // 'value' attribute on TypeKeyInput (id=FirstNotice_MedicalTreatment) at WCInjuryDamageDV.pcf: line 130, column 51
    function value_84 () : typekey.MedicalTreatmentType {
      return Exposure.Claim.ClaimInjuryIncident.MedicalTreatmentType
    }
    
    // 'value' attribute on TextAreaInput (id=FirstNotice_TreatmentRend) at WCInjuryDamageDV.pcf: line 138, column 47
    function value_88 () : java.lang.String {
      return Exposure.Claim.TreatmentRend
    }
    
    // 'value' attribute on BooleanRadioInput (id=FirstNotice_FurtherTreatment) at WCInjuryDamageDV.pcf: line 143, column 50
    function value_92 () : java.lang.Boolean {
      return Exposure.Claim.FurtherTreatment
    }
    
    // 'value' attribute on ClaimContactInput (id=Hospital_Hospital) at WCInjuryDamageDV.pcf: line 151, column 44
    function value_96 () : entity.MedicalCareOrg {
      return Exposure.Claim.hospital
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Hospital_Hospital) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_111 ($$arg :  entity.MedicalCareOrg[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Hospital_Hospital) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_111 ($$arg :  gw.api.database.IQueryBeanResult<entity.MedicalCareOrg>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Hospital_Hospital) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_111 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=FirstNotice_FirstIntakeDoctor) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_63 ($$arg :  entity.Doctor[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=FirstNotice_FirstIntakeDoctor) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_63 ($$arg :  gw.api.database.IQueryBeanResult<entity.Doctor>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=FirstNotice_FirstIntakeDoctor) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_63 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Hospital_Hospital) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_112 () : void {
      var __valueRangeArg = Exposure.Claim.RelatedMedicalCareOrgArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_111(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=FirstNotice_FirstIntakeDoctor) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_64 () : void {
      var __valueRangeArg = Exposure.Claim.getRelatedContacts(Exposure.Claim.getContactType(TC_FIRSTINTAKEDOCTOR)) as Doctor[]
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_63(__valueRangeArg)
    }
    
    // 'valueType' attribute on ClaimContactInput (id=Hospital_Hospital) at WCInjuryDamageDV.pcf: line 151, column 44
    function verifyValueType_115 () : void {
      var __valueTypeArg : entity.MedicalCareOrg
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'valueType' attribute on ClaimContactInput (id=FirstNotice_FirstIntakeDoctor) at WCInjuryDamageDV.pcf: line 100, column 36
    function verifyValueType_67 () : void {
      var __valueTypeArg : entity.Doctor
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'visible' attribute on ClaimContactInput (id=Hospital_Hospital) at ClaimContactWidget.xml: line 16, column 225
    function visible_100 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Exposure.Claim.hospital), Exposure.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on TextInput (id=Hospital_PreexDisabilityInfo) at WCInjuryDamageDV.pcf: line 176, column 56
    function visible_128 () : java.lang.Boolean {
      return Exposure.Claim.PreexDisblty == true
    }
    
    // 'visible' attribute on ClaimContactInput (id=FirstNotice_FirstIntakeDoctor) at ClaimContactWidget.xml: line 14, column 229
    function visible_49 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactInput (id=FirstNotice_FirstIntakeDoctor) at ClaimContactWidget.xml: line 16, column 225
    function visible_52 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Exposure.Claim.FirstIntakeDoctor), Exposure.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    property get Exposure () : Exposure {
      return getRequireValue("Exposure", 0) as Exposure
    }
    
    property set Exposure ($arg :  Exposure) {
      setRequireValue("Exposure", 0, $arg)
    }
    
    
  }
  
  
}