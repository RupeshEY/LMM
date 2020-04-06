package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.WC.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FNOLWizard_NewLossDetailsScreen_WCExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.WC.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FNOLWizard_NewLossDetailsScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ClaimContactInput (id=MedCase_FirstIntakeDoctor) at ClaimContactWidget.xml: line 16, column 225
    function action_120 () : void {
      AddressBookPickerPopup.push(statictypeof (Claim.FirstIntakeDoctor), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=MedCase_FirstIntakeDoctor) at ClaimContactWidget.xml: line 18, column 285
    function action_122 () : void {
      if (Claim.FirstIntakeDoctor != null) { ClaimContactDetailPopup.push(Claim.FirstIntakeDoctor, Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=MedCase_FirstIntakeDoctor) at ClaimContactWidget.xml: line 12, column 273
    function action_123 () : void {
      ClaimContactDetailPopup.push(Claim.FirstIntakeDoctor, Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=MedCase_Hospital) at ClaimContactWidget.xml: line 16, column 225
    function action_160 () : void {
      AddressBookPickerPopup.push(statictypeof (Claim.hospital), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=MedCase_Hospital) at ClaimContactWidget.xml: line 18, column 285
    function action_162 () : void {
      if (Claim.hospital != null) { ClaimContactDetailPopup.push(Claim.hospital, Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=MedCase_Hospital) at ClaimContactWidget.xml: line 12, column 273
    function action_163 () : void {
      ClaimContactDetailPopup.push(Claim.hospital, Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_243 () : void {
      AddressBookPickerPopup.push(statictypeof (Claim.claimant), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 18, column 285
    function action_245 () : void {
      if (Claim.claimant != null) { ClaimContactDetailPopup.push(Claim.claimant, Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_246 () : void {
      ClaimContactDetailPopup.push(Claim.claimant, Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=EmploymentData_SupervisorPicker) at ClaimContactWidget.xml: line 16, column 225
    function action_335 () : void {
      AddressBookPickerPopup.push(statictypeof (Claim.supervisor), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=EmploymentData_SupervisorPicker) at ClaimContactWidget.xml: line 18, column 285
    function action_337 () : void {
      if (Claim.supervisor != null) { ClaimContactDetailPopup.push(Claim.supervisor, Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=EmploymentData_SupervisorPicker) at ClaimContactWidget.xml: line 12, column 273
    function action_338 () : void {
      ClaimContactDetailPopup.push(Claim.supervisor, Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=MedCase_FirstIntakeDoctor) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_121 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Claim.FirstIntakeDoctor), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=MedCase_FirstIntakeDoctor) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_124 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Claim.FirstIntakeDoctor, Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=MedCase_Hospital) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_161 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Claim.hospital), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=MedCase_Hospital) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_164 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Claim.hospital, Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_244 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Claim.claimant), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_247 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Claim.claimant, Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=EmploymentData_SupervisorPicker) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_336 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Claim.supervisor), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=EmploymentData_SupervisorPicker) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_339 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Claim.supervisor, Claim)
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=MakeFirstButton) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 202, column 113
    function checkedRowAction_108 (element :  entity.BodyPartDetails, CheckedValue :  entity.BodyPartDetails) : void {
      Claim.ClaimInjuryIncident.FirstBodyPart = CheckedValue
    }
    
    // 'def' attribute on ListViewInput at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 189, column 29
    function def_onEnter_109 (def :  pcf.EditableBodyPartDetailsLV) : void {
      def.onEnter(Claim.ClaimInjuryIncident, false)
    }
    
    // 'def' attribute on ClaimContactInput (id=MedCase_FirstIntakeDoctor) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_117 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Claim.FirstIntakeDoctor), null, Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=MedCase_Hospital) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_157 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Claim.hospital), null, Claim)
    }
    
    // 'def' attribute on ListViewInput at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 301, column 31
    function def_onEnter_188 (def :  pcf.EditableWorkStatusChangesLV) : void {
      def.onEnter(Claim.EmploymentData)
    }
    
    // 'def' attribute on ListViewInput at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 374, column 33
    function def_onEnter_232 (def :  pcf.EditableConcurrentEmploymentLV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on ListViewInput at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 390, column 29
    function def_onEnter_236 (def :  pcf.EditableOfficialsLV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_240 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Claim.claimant), null, Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=EmploymentData_SupervisorPicker) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_332 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Claim.supervisor), null, Claim)
    }
    
    // 'def' attribute on InputSetRef at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 86, column 56
    function def_onEnter_41 (def :  pcf.CCAddressInputSet) : void {
      def.onEnter(Claim.AddressOwner)
    }
    
    // 'def' attribute on ListViewInput at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 189, column 29
    function def_refreshVariables_110 (def :  pcf.EditableBodyPartDetailsLV) : void {
      def.refreshVariables(Claim.ClaimInjuryIncident, false)
    }
    
    // 'def' attribute on ClaimContactInput (id=MedCase_FirstIntakeDoctor) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_118 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Claim.FirstIntakeDoctor), null, Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=MedCase_Hospital) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_158 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Claim.hospital), null, Claim)
    }
    
    // 'def' attribute on ListViewInput at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 301, column 31
    function def_refreshVariables_189 (def :  pcf.EditableWorkStatusChangesLV) : void {
      def.refreshVariables(Claim.EmploymentData)
    }
    
    // 'def' attribute on ListViewInput at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 374, column 33
    function def_refreshVariables_233 (def :  pcf.EditableConcurrentEmploymentLV) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on ListViewInput at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 390, column 29
    function def_refreshVariables_237 (def :  pcf.EditableOfficialsLV) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_241 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Claim.claimant), null, Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=EmploymentData_SupervisorPicker) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_333 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Claim.supervisor), null, Claim)
    }
    
    // 'def' attribute on InputSetRef at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 86, column 56
    function def_refreshVariables_42 (def :  pcf.CCAddressInputSet) : void {
      def.refreshVariables(Claim.AddressOwner)
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_PrimaryInjury) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 176, column 43
    function defaultSetter_102 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.ClaimInjuryIncident.GeneralInjuryType = (__VALUE_TO_SET as typekey.InjuryType)
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_DetailedInjury) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 183, column 51
    function defaultSetter_106 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.ClaimInjuryIncident.DetailedInjuryType = (__VALUE_TO_SET as typekey.DetailedInjuryType)
    }
    
    // 'value' attribute on TextAreaInput (id=Claim_OccurrenceDescription) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 43, column 38
    function defaultSetter_11 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on BooleanRadioInput (id=InjurySeverity_MedicalReport) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 214, column 39
    function defaultSetter_113 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.MedicalReport = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on ClaimContactInput (id=MedCase_FirstIntakeDoctor) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_127 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.FirstIntakeDoctor = (__VALUE_TO_SET as entity.Doctor)
    }
    
    // 'value' attribute on TextInput (id=MedCase_MedicalDiagnosis) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 233, column 45
    function defaultSetter_137 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.MedicalDiagnosis = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on DateInput (id=MedCase_ExaminationDate) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 239, column 44
    function defaultSetter_141 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.ExaminationDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TypeKeyInput (id=MedCase_InitialTreatment) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 246, column 51
    function defaultSetter_145 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.ClaimWorkComp.InitialTreatment = (__VALUE_TO_SET as typekey.InitialTreatment)
    }
    
    // 'value' attribute on TypeKeyInput (id=MedCase_MedicalTreatment) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 252, column 55
    function defaultSetter_149 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.ClaimInjuryIncident.MedicalTreatmentType = (__VALUE_TO_SET as typekey.MedicalTreatmentType)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claim_EmploymentInjury) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 48, column 43
    function defaultSetter_15 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.EmploymentInjury = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextAreaInput (id=MedCase_TreatmentRend) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 259, column 42
    function defaultSetter_153 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.TreatmentRend = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on ClaimContactInput (id=MedCase_Hospital) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_167 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.hospital = (__VALUE_TO_SET as entity.MedicalCareOrg)
    }
    
    // 'value' attribute on DateInput (id=MedCase_HospitalDate) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 273, column 41
    function defaultSetter_177 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.HospitalDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TextInput (id=MedCase_HospitalDays) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 279, column 44
    function defaultSetter_181 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.HospitalDays = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on BooleanRadioInput (id=InjurySeverity_TimeLossReport) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 290, column 40
    function defaultSetter_186 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.TimeLossReport = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextInput (id=EmploymentData_NumDaysWorkedPerWeek) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 312, column 47
    function defaultSetter_192 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.EmploymentData.NumDaysWorked = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on TextInput (id=EmploymentData_NumHoursWorkedPerDay) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 318, column 47
    function defaultSetter_196 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.EmploymentData.NumHoursWorked = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on BooleanRadioInput (id=InjurySeverity_IncidentReport) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 27, column 41
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.IncidentReport = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CurrencyInput (id=EmploymentData_WageAmount) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 323, column 54
    function defaultSetter_200 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.EmploymentData.WageAmount = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on TypeKeyInput (id=EmploymentData_PayPeriod) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 329, column 48
    function defaultSetter_204 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.EmploymentData.PayPeriod = (__VALUE_TO_SET as typekey.PayPeriodType)
    }
    
    // 'value' attribute on BooleanRadioInput (id=EmploymentData_PaidFullWages) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 334, column 52
    function defaultSetter_208 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.EmploymentData.PaidFull = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=EmploymentData_WagePaymentContinued) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 339, column 59
    function defaultSetter_212 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.EmploymentData.WagePaymentCont = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claim_ModifiedDutyAvailable) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 345, column 51
    function defaultSetter_218 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.ModifiedDutyAvail = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CurrencyInput (id=EmploymentData_DiscontinuedFringeBenefits) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 351, column 69
    function defaultSetter_222 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.ClaimWorkComp.DiscontinuedFringeBenefits = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claim_InjuredOnRegularJob) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 356, column 46
    function defaultSetter_226 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.InjuredRegularJob = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on DateInput (id=EmploymentData_InjuryStartDate) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 55, column 56
    function defaultSetter_23 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.EmploymentData.InjuryStartTime = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_ConcurrentEmployment) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 362, column 39
    function defaultSetter_230 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.ConcurrentEmp = (__VALUE_TO_SET as typekey.YesNo)
    }
    
    // 'value' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_250 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.claimant = (__VALUE_TO_SET as entity.Person)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claimant_ContactProhibited) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 416, column 38
    function defaultSetter_260 (__VALUE_TO_SET :  java.lang.Object) : void {
      ContactProhibited = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=EmploymentData_ClassCodeByLocation) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 481, column 59
    function defaultSetter_297 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.ClaimWorkComp.ClassCodeByLocation = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on RangeInput (id=EmploymentData_ClassCode) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 491, column 41
    function defaultSetter_301 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.EmploymentData.ClassCode = (__VALUE_TO_SET as entity.ClassCode)
    }
    
    // 'value' attribute on TextInput (id=EmploymentData_Occupation) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 496, column 45
    function defaultSetter_310 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.claimant.Occupation = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=EmploymentData_DepartmentCode) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 505, column 56
    function defaultSetter_314 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.EmploymentData.DepartmentCode = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on DateInput (id=EmploymentData_HireDate) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 513, column 50
    function defaultSetter_320 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.EmploymentData.HireDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TypeKeyInput (id=EmploymentData_HireState) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 519, column 38
    function defaultSetter_324 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.EmploymentData.HireState = (__VALUE_TO_SET as typekey.State)
    }
    
    // 'value' attribute on TypeKeyInput (id=EmploymentData_EmploymentStatus) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 525, column 53
    function defaultSetter_328 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.EmploymentData.EmploymentStatus = (__VALUE_TO_SET as typekey.EmploymentStatusType)
    }
    
    // 'value' attribute on DateInput (id=DateReportedtoEmployer) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 74, column 45
    function defaultSetter_33 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.DateRptdToEmployer = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on ClaimContactInput (id=EmploymentData_SupervisorPicker) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_342 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.supervisor = (__VALUE_TO_SET as entity.Person)
    }
    
    // 'value' attribute on DateInput (id=Claim_ReportedDate) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 84, column 39
    function defaultSetter_39 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.ReportedDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_AccidentPremises) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 92, column 49
    function defaultSetter_45 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.ClaimWorkComp.AccidentPremises = (__VALUE_TO_SET as typekey.AccidentPremises)
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_JurisdictionState) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 99, column 45
    function defaultSetter_49 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.JurisdictionState = (__VALUE_TO_SET as typekey.Jurisdiction)
    }
    
    // 'value' attribute on TextInput (id=Claim_EquipmentUsed) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 104, column 40
    function defaultSetter_54 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.EquipmentUsed = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=Claim_ActivityPerformed) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 109, column 44
    function defaultSetter_58 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.ActivityPerformed = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_DrugsInvolved) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 115, column 38
    function defaultSetter_62 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.DrugsInvolved = (__VALUE_TO_SET as typekey.YesNo)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claim_SafetyEquipmentProvided) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 120, column 42
    function defaultSetter_66 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.SafetyEquipProv = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claim_SafetyEquipmentUsed) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 125, column 42
    function defaultSetter_70 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.SafetyEquipUsed = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 133, column 43
    function defaultSetter_74 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.Catastrophe = (__VALUE_TO_SET as entity.Catastrophe)
    }
    
    // 'value' attribute on TextInput (id=Claim_InjuryDescription) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 142, column 58
    function defaultSetter_81 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.ClaimInjuryIncident.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_Severity) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 149, column 45
    function defaultSetter_85 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.ClaimInjuryIncident.Severity = (__VALUE_TO_SET as typekey.SeverityType)
    }
    
    // 'value' attribute on BooleanRadioInput (id=InjurySeverity_DeathReport) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 155, column 38
    function defaultSetter_90 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.DeathReport = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_InjuryIllnessCause) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 162, column 42
    function defaultSetter_94 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.LossCause = (__VALUE_TO_SET as typekey.LossCause)
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_AccidentType) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 169, column 45
    function defaultSetter_98 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.AccidentType = (__VALUE_TO_SET as typekey.AccidentType)
    }
    
    // 'encryptionExpression' attribute on PrivacyInput (id=Claimant_TaxNumber) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 445, column 40
    function encryptionExpression_281 (VALUE :  java.lang.String) : java.lang.String {
      return Claim.claimant.maskTaxId(VALUE)
    }
    
    // 'filter' attribute on TypeKeyInput (id=Claim_JurisdictionState) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 99, column 45
    function filter_51 (VALUE :  typekey.Jurisdiction, VALUES :  typekey.Jurisdiction[]) : java.lang.Boolean {
      return VALUE.hasCategory(JurisdictionType.TC_INSURANCE)
    }
    
    // 'filter' attribute on TypeKeyInput (id=Claim_Severity) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 149, column 45
    function filter_87 (VALUE :  typekey.SeverityType, VALUES :  typekey.SeverityType[]) : java.lang.Boolean {
      return VALUE.hasCategory( typekey.LossType.TC_WC )
    }
    
    // 'onPick' attribute on ClaimContactInput (id=MedCase_FirstIntakeDoctor) at ClaimContactWidget.xml: line 12, column 273
    function onPick_125 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Claim.FirstIntakeDoctor); var result = eval("Claim.FirstIntakeDoctor = Claim.resolveContact(Claim.FirstIntakeDoctor) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=MedCase_Hospital) at ClaimContactWidget.xml: line 12, column 273
    function onPick_165 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Claim.hospital); var result = eval("Claim.hospital = Claim.resolveContact(Claim.hospital) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function onPick_248 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Claim.claimant); var result = eval("Claim.claimant = Claim.resolveContact(Claim.claimant) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=EmploymentData_SupervisorPicker) at ClaimContactWidget.xml: line 12, column 273
    function onPick_340 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Claim.supervisor); var result = eval("Claim.supervisor = Claim.resolveContact(Claim.supervisor) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'value' attribute on Reflect at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 58, column 28
    function reflectionValue_17 (TRIGGER_INDEX :  int, VALUE :  Object) : java.lang.Object {
      return VALUE
    }
    
    // 'value' attribute on Reflect at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 423, column 46
    function reflectionValue_261 (TRIGGER_INDEX :  int, VALUE :  entity.Person) : java.lang.Object {
      return VALUE.PrimaryPhoneValue
    }
    
    // 'value' attribute on Reflect at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 431, column 55
    function reflectionValue_266 (TRIGGER_INDEX :  int, VALUE :  entity.Person) : java.lang.Object {
      return VALUE.PrimaryAddressDisplayValue
    }
    
    // 'value' attribute on Reflect at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 439, column 40
    function reflectionValue_271 (TRIGGER_INDEX :  int, VALUE :  entity.Person) : java.lang.Object {
      return VALUE.DateOfBirth
    }
    
    // 'value' attribute on Reflect at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 448, column 34
    function reflectionValue_276 (TRIGGER_INDEX :  int, VALUE :  entity.Person) : java.lang.Object {
      return VALUE.TaxID
    }
    
    // 'value' attribute on Reflect at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 457, column 35
    function reflectionValue_282 (TRIGGER_INDEX :  int, VALUE :  entity.Person) : java.lang.Object {
      return VALUE.Gender
    }
    
    // 'value' attribute on Reflect at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 466, column 42
    function reflectionValue_287 (TRIGGER_INDEX :  int, VALUE :  entity.Person) : java.lang.Object {
      return VALUE.MaritalStatus
    }
    
    // 'value' attribute on Reflect at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 499, column 39
    function reflectionValue_306 (TRIGGER_INDEX :  int, VALUE :  entity.Person) : java.lang.Object {
      return VALUE.Occupation
    }
    
    // 'validationExpression' attribute on DateInput (id=EmploymentData_InjuryStartDate) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 55, column 56
    function validationExpression_19 () : java.lang.Object {
      return Claim.EmploymentData.InjuryStartTime == null || Claim.EmploymentData.InjuryStartTime < gw.api.util.DateUtil.currentDate() ? null : DisplayKey.get("Java.Validation.Date.ForbidFuture")
    }
    
    // 'validationExpression' attribute on DateInput (id=EmploymentData_HireDate) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 513, column 50
    function validationExpression_316 () : java.lang.Object {
      return Claim.EmploymentData.HireDate == null || Claim.EmploymentData.HireDate < gw.api.util.DateUtil.currentDate() ? null : DisplayKey.get("Java.Validation.Date.ForbidFuture")
    }
    
    // 'validationExpression' attribute on DateInput (id=Claim_ReportedDate) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 84, column 39
    function validationExpression_35 () : java.lang.Object {
      return Claim.ReportedDate == null || Claim.ReportedDate < gw.api.util.DateUtil.currentDate() ? null : DisplayKey.get("Java.Validation.Date.ForbidFuture")
    }
    
    // 'validationExpression' attribute on DateInput (id=Claim_InjuryIllnessDate) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 34, column 35
    function validationExpression_4 () : java.lang.Object {
      return Claim.LossDate == null || Claim.LossDate < gw.api.util.DateUtil.currentDate() ? null : DisplayKey.get("Java.Validation.Date.ForbidFuture")
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MedCase_FirstIntakeDoctor) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_129 () : java.lang.Object {
      return Claim.getRelatedContacts(Claim.getContactType(ContactRole.TC_FIRSTINTAKEDOCTOR)) as Doctor[]
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MedCase_Hospital) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_169 () : java.lang.Object {
      return Claim.RelatedMedicalCareOrgArray
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_252 () : java.lang.Object {
      return Claim.RelatedPersonArray
    }
    
    // 'valueRange' attribute on RangeInput (id=EmploymentData_ClassCode) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 491, column 41
    function valueRange_303 () : java.lang.Object {
      return FilteredClassCodes
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 133, column 43
    function valueRange_76 () : java.lang.Object {
      return gw.api.admin.CatastropheUtil.getCatastrophes()
    }
    
    // 'value' attribute on DateInput (id=EmploymentData_InjuryStartDate) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 55, column 56
    function valueRoot_24 () : java.lang.Object {
      return Claim.EmploymentData
    }
    
    // 'value' attribute on TextInput (id=Claimant_Phone) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 420, column 52
    function valueRoot_265 () : java.lang.Object {
      return Claim.claimant
    }
    
    // 'value' attribute on BooleanRadioInput (id=InjurySeverity_IncidentReport) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 27, column 41
    function valueRoot_3 () : java.lang.Object {
      return Claim
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_AccidentPremises) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 92, column 49
    function valueRoot_46 () : java.lang.Object {
      return Claim.ClaimWorkComp
    }
    
    // 'value' attribute on TextInput (id=Claim_InjuryDescription) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 142, column 58
    function valueRoot_82 () : java.lang.Object {
      return Claim.ClaimInjuryIncident
    }
    
    // 'value' attribute on BooleanRadioInput (id=InjurySeverity_IncidentReport) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 27, column 41
    function value_0 () : java.lang.Boolean {
      return Claim.IncidentReport
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_PrimaryInjury) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 176, column 43
    function value_100 () : typekey.InjuryType {
      return Claim.ClaimInjuryIncident.GeneralInjuryType
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_DetailedInjury) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 183, column 51
    function value_104 () : typekey.DetailedInjuryType {
      return Claim.ClaimInjuryIncident.DetailedInjuryType
    }
    
    // 'value' attribute on BooleanRadioInput (id=InjurySeverity_MedicalReport) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 214, column 39
    function value_111 () : java.lang.Boolean {
      return Claim.MedicalReport
    }
    
    // 'value' attribute on ClaimContactInput (id=MedCase_FirstIntakeDoctor) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 228, column 40
    function value_115 () : entity.Doctor {
      return Claim.FirstIntakeDoctor
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claim_EmploymentInjury) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 48, column 43
    function value_13 () : java.lang.Boolean {
      return Claim.EmploymentInjury
    }
    
    // 'value' attribute on TextInput (id=MedCase_MedicalDiagnosis) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 233, column 45
    function value_135 () : java.lang.String {
      return Claim.MedicalDiagnosis
    }
    
    // 'value' attribute on DateInput (id=MedCase_ExaminationDate) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 239, column 44
    function value_139 () : java.util.Date {
      return Claim.ExaminationDate
    }
    
    // 'value' attribute on TypeKeyInput (id=MedCase_InitialTreatment) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 246, column 51
    function value_143 () : typekey.InitialTreatment {
      return Claim.ClaimWorkComp.InitialTreatment
    }
    
    // 'value' attribute on TypeKeyInput (id=MedCase_MedicalTreatment) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 252, column 55
    function value_147 () : typekey.MedicalTreatmentType {
      return Claim.ClaimInjuryIncident.MedicalTreatmentType
    }
    
    // 'value' attribute on TextAreaInput (id=MedCase_TreatmentRend) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 259, column 42
    function value_151 () : java.lang.String {
      return Claim.TreatmentRend
    }
    
    // 'value' attribute on ClaimContactInput (id=MedCase_Hospital) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 267, column 48
    function value_155 () : entity.MedicalCareOrg {
      return Claim.hospital
    }
    
    // 'value' attribute on DateInput (id=MedCase_HospitalDate) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 273, column 41
    function value_175 () : java.util.Date {
      return Claim.HospitalDate
    }
    
    // 'value' attribute on TextInput (id=MedCase_HospitalDays) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 279, column 44
    function value_179 () : java.lang.Integer {
      return Claim.HospitalDays
    }
    
    // 'value' attribute on BooleanRadioInput (id=InjurySeverity_TimeLossReport) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 290, column 40
    function value_184 () : java.lang.Boolean {
      return Claim.TimeLossReport
    }
    
    // 'value' attribute on TextInput (id=EmploymentData_NumDaysWorkedPerWeek) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 312, column 47
    function value_190 () : java.math.BigDecimal {
      return Claim.EmploymentData.NumDaysWorked
    }
    
    // 'value' attribute on TextInput (id=EmploymentData_NumHoursWorkedPerDay) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 318, column 47
    function value_194 () : java.math.BigDecimal {
      return Claim.EmploymentData.NumHoursWorked
    }
    
    // 'value' attribute on CurrencyInput (id=EmploymentData_WageAmount) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 323, column 54
    function value_198 () : gw.api.financials.CurrencyAmount {
      return Claim.EmploymentData.WageAmount
    }
    
    // 'value' attribute on DateInput (id=EmploymentData_InjuryStartDate) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 55, column 56
    function value_20 () : java.util.Date {
      return Claim.EmploymentData.InjuryStartTime
    }
    
    // 'value' attribute on TypeKeyInput (id=EmploymentData_PayPeriod) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 329, column 48
    function value_202 () : typekey.PayPeriodType {
      return Claim.EmploymentData.PayPeriod
    }
    
    // 'value' attribute on BooleanRadioInput (id=EmploymentData_PaidFullWages) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 334, column 52
    function value_206 () : java.lang.Boolean {
      return Claim.EmploymentData.PaidFull
    }
    
    // 'value' attribute on BooleanRadioInput (id=EmploymentData_WagePaymentContinued) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 339, column 59
    function value_210 () : java.lang.Boolean {
      return Claim.EmploymentData.WagePaymentCont
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claim_ModifiedDutyAvailable) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 345, column 51
    function value_215 () : java.lang.Boolean {
      return Claim.ModifiedDutyAvail
    }
    
    // 'value' attribute on CurrencyInput (id=EmploymentData_DiscontinuedFringeBenefits) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 351, column 69
    function value_220 () : gw.api.financials.CurrencyAmount {
      return Claim.ClaimWorkComp.DiscontinuedFringeBenefits
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claim_InjuredOnRegularJob) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 356, column 46
    function value_224 () : java.lang.Boolean {
      return Claim.InjuredRegularJob
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_ConcurrentEmployment) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 362, column 39
    function value_228 () : typekey.YesNo {
      return Claim.ConcurrentEmp
    }
    
    // 'value' attribute on ClaimContactInput (id=Claimant_Picker) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 411, column 38
    function value_238 () : entity.Person {
      return Claim.claimant
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claimant_ContactProhibited) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 416, column 38
    function value_258 () : java.lang.Boolean {
      return ContactProhibited
    }
    
    // 'value' attribute on TextInput (id=Claimant_Phone) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 420, column 52
    function value_263 () : java.lang.String {
      return Claim.claimant.PrimaryPhoneValue
    }
    
    // 'value' attribute on TextInput (id=Claimant_Address) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 428, column 61
    function value_268 () : java.lang.String {
      return Claim.claimant.PrimaryAddressDisplayValue
    }
    
    // 'value' attribute on DateInput (id=Claimant_DateOfBirth) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 436, column 46
    function value_273 () : java.util.Date {
      return Claim.claimant.DateOfBirth
    }
    
    // 'value' attribute on PrivacyInput (id=Claimant_TaxNumber) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 445, column 40
    function value_278 () : java.lang.String {
      return Claim.claimant.TaxID
    }
    
    // 'value' attribute on TypeKeyInput (id=Claimant_Gender) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 454, column 42
    function value_284 () : typekey.GenderType {
      return Claim.claimant.Gender
    }
    
    // 'value' attribute on TypeKeyInput (id=Claimant_MaritalStatus) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 463, column 45
    function value_289 () : typekey.MaritalStatus {
      return Claim.claimant.MaritalStatus
    }
    
    // 'value' attribute on TextInput (id=EmploymentData_EmploymentLocation) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 476, column 46
    function value_292 () : entity.PolicyLocation {
      return Claim.LocationCode
    }
    
    // 'value' attribute on BooleanRadioInput (id=EmploymentData_ClassCodeByLocation) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 481, column 59
    function value_295 () : java.lang.Boolean {
      return Claim.ClaimWorkComp.ClassCodeByLocation
    }
    
    // 'value' attribute on RangeInput (id=EmploymentData_ClassCode) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 491, column 41
    function value_299 () : entity.ClassCode {
      return Claim.EmploymentData.ClassCode
    }
    
    // 'value' attribute on TextInput (id=EmploymentData_Occupation) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 496, column 45
    function value_308 () : java.lang.String {
      return Claim.claimant.Occupation
    }
    
    // 'value' attribute on DateInput (id=DateReportedtoEmployer) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 74, column 45
    function value_31 () : java.util.Date {
      return Claim.DateRptdToEmployer
    }
    
    // 'value' attribute on TextInput (id=EmploymentData_DepartmentCode) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 505, column 56
    function value_312 () : java.lang.String {
      return Claim.EmploymentData.DepartmentCode
    }
    
    // 'value' attribute on DateInput (id=EmploymentData_HireDate) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 513, column 50
    function value_317 () : java.util.Date {
      return Claim.EmploymentData.HireDate
    }
    
    // 'value' attribute on TypeKeyInput (id=EmploymentData_HireState) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 519, column 38
    function value_322 () : typekey.State {
      return Claim.EmploymentData.HireState
    }
    
    // 'value' attribute on TypeKeyInput (id=EmploymentData_EmploymentStatus) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 525, column 53
    function value_326 () : typekey.EmploymentStatusType {
      return Claim.EmploymentData.EmploymentStatus
    }
    
    // 'value' attribute on ClaimContactInput (id=EmploymentData_SupervisorPicker) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 534, column 38
    function value_330 () : entity.Person {
      return Claim.supervisor
    }
    
    // 'value' attribute on DateInput (id=Claim_ReportedDate) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 84, column 39
    function value_36 () : java.util.Date {
      return Claim.ReportedDate
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_AccidentPremises) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 92, column 49
    function value_43 () : typekey.AccidentPremises {
      return Claim.ClaimWorkComp.AccidentPremises
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_JurisdictionState) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 99, column 45
    function value_47 () : typekey.Jurisdiction {
      return Claim.JurisdictionState
    }
    
    // 'value' attribute on DateInput (id=Claim_InjuryIllnessDate) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 34, column 35
    function value_5 () : java.util.Date {
      return Claim.LossDate
    }
    
    // 'value' attribute on TextInput (id=Claim_EquipmentUsed) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 104, column 40
    function value_52 () : java.lang.String {
      return Claim.EquipmentUsed
    }
    
    // 'value' attribute on TextInput (id=Claim_ActivityPerformed) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 109, column 44
    function value_56 () : java.lang.String {
      return Claim.ActivityPerformed
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_DrugsInvolved) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 115, column 38
    function value_60 () : typekey.YesNo {
      return Claim.DrugsInvolved
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claim_SafetyEquipmentProvided) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 120, column 42
    function value_64 () : java.lang.Boolean {
      return Claim.SafetyEquipProv
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claim_SafetyEquipmentUsed) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 125, column 42
    function value_68 () : java.lang.Boolean {
      return Claim.SafetyEquipUsed
    }
    
    // 'value' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 133, column 43
    function value_72 () : entity.Catastrophe {
      return Claim.Catastrophe
    }
    
    // 'value' attribute on TextInput (id=Claim_InjuryDescription) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 142, column 58
    function value_79 () : java.lang.String {
      return Claim.ClaimInjuryIncident.Description
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_Severity) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 149, column 45
    function value_83 () : typekey.SeverityType {
      return Claim.ClaimInjuryIncident.Severity
    }
    
    // 'value' attribute on BooleanRadioInput (id=InjurySeverity_DeathReport) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 155, column 38
    function value_88 () : java.lang.Boolean {
      return Claim.DeathReport
    }
    
    // 'value' attribute on TextAreaInput (id=Claim_OccurrenceDescription) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 43, column 38
    function value_9 () : java.lang.String {
      return Claim.Description
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_InjuryIllnessCause) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 162, column 42
    function value_92 () : typekey.LossCause {
      return Claim.LossCause
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_AccidentType) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 169, column 45
    function value_96 () : typekey.AccidentType {
      return Claim.AccidentType
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MedCase_FirstIntakeDoctor) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_130 ($$arg :  entity.Doctor[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MedCase_FirstIntakeDoctor) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_130 ($$arg :  gw.api.database.IQueryBeanResult<entity.Doctor>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MedCase_FirstIntakeDoctor) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_130 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MedCase_Hospital) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_170 ($$arg :  entity.MedicalCareOrg[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MedCase_Hospital) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_170 ($$arg :  gw.api.database.IQueryBeanResult<entity.MedicalCareOrg>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MedCase_Hospital) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_170 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_253 ($$arg :  entity.Person[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_253 ($$arg :  gw.api.database.IQueryBeanResult<entity.Person>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_253 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=EmploymentData_ClassCode) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 491, column 41
    function verifyValueRangeIsAllowedType_304 ($$arg :  entity.ClassCode[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=EmploymentData_ClassCode) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 491, column 41
    function verifyValueRangeIsAllowedType_304 ($$arg :  gw.api.database.IQueryBeanResult<entity.ClassCode>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=EmploymentData_ClassCode) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 491, column 41
    function verifyValueRangeIsAllowedType_304 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=EmploymentData_SupervisorPicker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_345 ($$arg :  entity.Person[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=EmploymentData_SupervisorPicker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_345 ($$arg :  gw.api.database.IQueryBeanResult<entity.Person>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=EmploymentData_SupervisorPicker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_345 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 133, column 43
    function verifyValueRangeIsAllowedType_77 ($$arg :  entity.Catastrophe[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 133, column 43
    function verifyValueRangeIsAllowedType_77 ($$arg :  gw.api.database.IQueryBeanResult<entity.Catastrophe>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 133, column 43
    function verifyValueRangeIsAllowedType_77 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MedCase_FirstIntakeDoctor) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_131 () : void {
      var __valueRangeArg = Claim.getRelatedContacts(Claim.getContactType(ContactRole.TC_FIRSTINTAKEDOCTOR)) as Doctor[]
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_130(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MedCase_Hospital) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_171 () : void {
      var __valueRangeArg = Claim.RelatedMedicalCareOrgArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_170(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_254 () : void {
      var __valueRangeArg = Claim.RelatedPersonArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_253(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=EmploymentData_ClassCode) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 491, column 41
    function verifyValueRange_305 () : void {
      var __valueRangeArg = FilteredClassCodes
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_304(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=EmploymentData_SupervisorPicker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_346 () : void {
      var __valueRangeArg = Claim.RelatedPersonArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_345(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 133, column 43
    function verifyValueRange_78 () : void {
      var __valueRangeArg = gw.api.admin.CatastropheUtil.getCatastrophes()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_77(__valueRangeArg)
    }
    
    // 'valueType' attribute on ClaimContactInput (id=MedCase_FirstIntakeDoctor) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 228, column 40
    function verifyValueType_134 () : void {
      var __valueTypeArg : entity.Doctor
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'valueType' attribute on ClaimContactInput (id=MedCase_Hospital) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 267, column 48
    function verifyValueType_174 () : void {
      var __valueTypeArg : entity.MedicalCareOrg
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'valueType' attribute on ClaimContactInput (id=Claimant_Picker) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 411, column 38
    function verifyValueType_257 () : void {
      var __valueTypeArg : entity.Person
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'valueType' attribute on ClaimContactInput (id=EmploymentData_SupervisorPicker) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 534, column 38
    function verifyValueType_349 () : void {
      var __valueTypeArg : entity.Person
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'visible' attribute on ClaimContactInput (id=MedCase_FirstIntakeDoctor) at ClaimContactWidget.xml: line 14, column 229
    function visible_116 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactInput (id=MedCase_FirstIntakeDoctor) at ClaimContactWidget.xml: line 16, column 225
    function visible_119 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Claim.FirstIntakeDoctor), Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on ClaimContactInput (id=MedCase_Hospital) at ClaimContactWidget.xml: line 16, column 225
    function visible_159 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Claim.hospital), Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on InputSet (id=MedicalReport_InputSet) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 220, column 47
    function visible_183 () : java.lang.Boolean {
      return Claim.MedicalReport==true
    }
    
    // 'visible' attribute on BooleanRadioInput (id=Claim_ModifiedDutyAvailable) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 345, column 51
    function visible_214 () : java.lang.Boolean {
      return Claim.TimeLossReport==true
    }
    
    // 'visible' attribute on InputSet (id=Claim_ConcurrentEmploymentLV) at FNOLWizard_NewLossDetailsScreen.WC.pcf: line 368, column 59
    function visible_234 () : java.lang.Boolean {
      return Claim.ConcurrentEmp == YesNo.TC_YES
    }
    
    // 'visible' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 16, column 225
    function visible_242 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Claim.claimant), Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on ClaimContactInput (id=EmploymentData_SupervisorPicker) at ClaimContactWidget.xml: line 16, column 225
    function visible_334 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Claim.supervisor), Claim, null as List<SpecialistService>)" != "" && true
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get Wizard () : gw.api.claim.NewClaimWizardInfo {
      return getRequireValue("Wizard", 0) as gw.api.claim.NewClaimWizardInfo
    }
    
    property set Wizard ($arg :  gw.api.claim.NewClaimWizardInfo) {
      setRequireValue("Wizard", 0, $arg)
    }
    
    property get ContactProhibited() : boolean {
      return Claim.getClaimContact(Claim.claimant).ContactProhibited
    }
    property set ContactProhibited(prohibited : boolean) {
      var claimContact = Claim.getClaimContact(Claim.claimant)
      if (claimContact != null) claimContact.ContactProhibited = prohibited
    }
    
    property get FilteredClassCodes() : ClassCode[] {
      if(Claim.ClaimWorkComp.ClassCodeByLocation) {
        return Claim.Policy.ClassCodes.where( \ code -> Claim.LocationCode.LocationBasedRisks*.ClassCode.contains(code) )
      }
      else {
        return Claim.Policy.ClassCodes
      }
    }
    
    
  }
  
  
}