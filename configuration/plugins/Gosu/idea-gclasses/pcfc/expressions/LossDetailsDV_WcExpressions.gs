package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/LossDetailsDV.Wc.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class LossDetailsDV_WcExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/LossDetailsDV.Wc.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LossDetailsDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ClaimContactInput (id=EmploymentData_SupervisorPicker) at ClaimContactWidget.xml: line 16, column 225
    function action_168 () : void {
      AddressBookPickerPopup.push(statictypeof (Claim.supervisor), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=EmploymentData_SupervisorPicker) at ClaimContactWidget.xml: line 18, column 285
    function action_170 () : void {
      if (Claim.supervisor != null) { ClaimContactDetailPopup.push(Claim.supervisor, Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=EmploymentData_SupervisorPicker) at ClaimContactWidget.xml: line 12, column 273
    function action_171 () : void {
      ClaimContactDetailPopup.push(Claim.supervisor, Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_319 () : void {
      AddressBookPickerPopup.push(statictypeof (Claim.reporter), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 18, column 285
    function action_321 () : void {
      if (Claim.reporter != null) { ClaimContactDetailPopup.push(Claim.reporter, Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_322 () : void {
      ClaimContactDetailPopup.push(Claim.reporter, Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_345 () : void {
      AddressBookPickerPopup.push(statictypeof (Claim.maincontact), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 18, column 285
    function action_347 () : void {
      if (Claim.maincontact != null) { ClaimContactDetailPopup.push(Claim.maincontact, Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_348 () : void {
      ClaimContactDetailPopup.push(Claim.maincontact, Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_38 () : void {
      AddressBookPickerPopup.push(statictypeof (Claim.claimant), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 18, column 285
    function action_40 () : void {
      if (Claim.claimant != null) { ClaimContactDetailPopup.push(Claim.claimant, Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_41 () : void {
      ClaimContactDetailPopup.push(Claim.claimant, Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=EmploymentData_SupervisorPicker) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_169 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Claim.supervisor), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=EmploymentData_SupervisorPicker) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_172 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Claim.supervisor, Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_320 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Claim.reporter), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_323 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Claim.reporter, Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_346 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Claim.maincontact), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_349 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Claim.maincontact, Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_39 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Claim.claimant), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_42 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Claim.claimant, Claim)
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=MakeFirstButton) at LossDetailsDV.Wc.pcf: line 214, column 111
    function checkedRowAction_127 (element :  entity.BodyPartDetails, CheckedValue :  entity.BodyPartDetails) : void {
      Claim.ensureClaimInjuryIncident().FirstBodyPart = CheckedValue
    }
    
    // 'condition' attribute on ReflectCondition at LossDetailsDV.Wc.pcf: line 520, column 39
    function condition_333 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Boolean {
      return VALUE==Claim.Insured
    }
    
    // 'def' attribute on InputSetRef at LossDetailsDV.Wc.pcf: line 35, column 54
    function def_onEnter_12 (def :  pcf.CCAddressInputSet) : void {
      def.onEnter(Claim.AddressOwner)
    }
    
    // 'def' attribute on ListViewInput at LossDetailsDV.Wc.pcf: line 201, column 27
    function def_onEnter_128 (def :  pcf.EditableBodyPartDetailsLV) : void {
      def.onEnter(Claim.ensureClaimInjuryIncident(), true)
    }
    
    // 'def' attribute on ClaimContactInput (id=EmploymentData_SupervisorPicker) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_165 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Claim.supervisor), null, Claim)
    }
    
    // 'def' attribute on InputSetRef at LossDetailsDV.Wc.pcf: line 387, column 45
    function def_onEnter_245 (def :  pcf.CompensableInputSet) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_316 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Claim.reporter), null, Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_342 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Claim.maincontact), null, Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_35 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Claim.claimant), null, Claim)
    }
    
    // 'def' attribute on ListViewInput at LossDetailsDV.Wc.pcf: line 557, column 58
    function def_onEnter_369 (def :  pcf.EditableConcurrentEmploymentLV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on ListViewInput at LossDetailsDV.Wc.pcf: line 571, column 27
    function def_onEnter_371 (def :  pcf.EditableOtherBenefitsLV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on ListViewInput at LossDetailsDV.Wc.pcf: line 583, column 27
    function def_onEnter_373 (def :  pcf.EditableOfficialsLV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on ListViewInput at LossDetailsDV.Wc.pcf: line 595, column 27
    function def_onEnter_375 (def :  pcf.MetroReportsLV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on ListViewInput at LossDetailsDV.Wc.pcf: line 201, column 27
    function def_refreshVariables_129 (def :  pcf.EditableBodyPartDetailsLV) : void {
      def.refreshVariables(Claim.ensureClaimInjuryIncident(), true)
    }
    
    // 'def' attribute on InputSetRef at LossDetailsDV.Wc.pcf: line 35, column 54
    function def_refreshVariables_13 (def :  pcf.CCAddressInputSet) : void {
      def.refreshVariables(Claim.AddressOwner)
    }
    
    // 'def' attribute on ClaimContactInput (id=EmploymentData_SupervisorPicker) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_166 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Claim.supervisor), null, Claim)
    }
    
    // 'def' attribute on InputSetRef at LossDetailsDV.Wc.pcf: line 387, column 45
    function def_refreshVariables_246 (def :  pcf.CompensableInputSet) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_317 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Claim.reporter), null, Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_343 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Claim.maincontact), null, Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_36 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Claim.claimant), null, Claim)
    }
    
    // 'def' attribute on ListViewInput at LossDetailsDV.Wc.pcf: line 557, column 58
    function def_refreshVariables_370 (def :  pcf.EditableConcurrentEmploymentLV) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on ListViewInput at LossDetailsDV.Wc.pcf: line 571, column 27
    function def_refreshVariables_372 (def :  pcf.EditableOtherBenefitsLV) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on ListViewInput at LossDetailsDV.Wc.pcf: line 583, column 27
    function def_refreshVariables_374 (def :  pcf.EditableOfficialsLV) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on ListViewInput at LossDetailsDV.Wc.pcf: line 595, column 27
    function def_refreshVariables_376 (def :  pcf.MetroReportsLV) : void {
      def.refreshVariables(Claim)
    }
    
    // 'value' attribute on TextInput (id=Claim_EquipmentUsed) at LossDetailsDV.Wc.pcf: line 33, column 38
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.EquipmentUsed = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on BooleanRadioInput (id=InjurySeverity_DeathReport) at LossDetailsDV.Wc.pcf: line 161, column 36
    function defaultSetter_103 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.DeathReport = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on DateInput (id=DeathDate) at LossDetailsDV.Wc.pcf: line 167, column 47
    function defaultSetter_109 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.DeathDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_InjuryIllnessCause) at LossDetailsDV.Wc.pcf: line 175, column 40
    function defaultSetter_113 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.LossCause = (__VALUE_TO_SET as typekey.LossCause)
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_AccidentType) at LossDetailsDV.Wc.pcf: line 181, column 43
    function defaultSetter_117 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.AccidentType = (__VALUE_TO_SET as typekey.AccidentType)
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_PrimaryInjury) at LossDetailsDV.Wc.pcf: line 188, column 41
    function defaultSetter_121 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.ensureClaimInjuryIncident().GeneralInjuryType = (__VALUE_TO_SET as typekey.InjuryType)
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_DetailedInjury) at LossDetailsDV.Wc.pcf: line 195, column 49
    function defaultSetter_125 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.ensureClaimInjuryIncident().DetailedInjuryType = (__VALUE_TO_SET as typekey.DetailedInjuryType)
    }
    
    // 'value' attribute on CurrencyInput (id=EmploymentData_WorkCompAWW) at LossDetailsDV.Wc.pcf: line 224, column 50
    function defaultSetter_132 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.EmploymentData.WageAmount = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on BooleanRadioInput (id=EmploymentData_ClassCodeByLocation) at LossDetailsDV.Wc.pcf: line 229, column 57
    function defaultSetter_136 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.ClaimWorkComp.ClassCodeByLocation = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on RangeInput (id=EmploymentData_ClassCode) at LossDetailsDV.Wc.pcf: line 239, column 39
    function defaultSetter_140 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.EmploymentData.ClassCode = (__VALUE_TO_SET as entity.ClassCode)
    }
    
    // 'value' attribute on TextInput (id=EmploymentData_DepartmentCode) at LossDetailsDV.Wc.pcf: line 244, column 54
    function defaultSetter_147 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.EmploymentData.DepartmentCode = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on DateInput (id=EmploymentData_HireDate) at LossDetailsDV.Wc.pcf: line 252, column 48
    function defaultSetter_153 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.EmploymentData.HireDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TypeKeyInput (id=EmploymentData_HireState) at LossDetailsDV.Wc.pcf: line 258, column 36
    function defaultSetter_157 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.EmploymentData.HireState = (__VALUE_TO_SET as typekey.State)
    }
    
    // 'value' attribute on RangeInput (id=LocationCode) at LossDetailsDV.Wc.pcf: line 43, column 43
    function defaultSetter_16 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.LocationCode = (__VALUE_TO_SET as entity.PolicyLocation)
    }
    
    // 'value' attribute on TypeKeyInput (id=EmploymentData_EmploymentStatus) at LossDetailsDV.Wc.pcf: line 264, column 51
    function defaultSetter_161 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.EmploymentData.EmploymentStatus = (__VALUE_TO_SET as typekey.EmploymentStatusType)
    }
    
    // 'value' attribute on ClaimContactInput (id=EmploymentData_SupervisorPicker) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_175 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.supervisor = (__VALUE_TO_SET as entity.Person)
    }
    
    // 'value' attribute on TextInput (id=EmploymentData_NumDaysWorkedPerWeek) at LossDetailsDV.Wc.pcf: line 279, column 43
    function defaultSetter_185 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.EmploymentData.NumDaysWorked = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on TextInput (id=EmploymentData_NumHoursWorkedPerDay) at LossDetailsDV.Wc.pcf: line 285, column 43
    function defaultSetter_189 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.EmploymentData.NumHoursWorked = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on TypeKeyInput (id=EmploymentData_PayPeriod) at LossDetailsDV.Wc.pcf: line 291, column 44
    function defaultSetter_193 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.EmploymentData.PayPeriod = (__VALUE_TO_SET as typekey.PayPeriodType)
    }
    
    // 'value' attribute on BooleanRadioInput (id=EmploymentData_PaidFullWages) at LossDetailsDV.Wc.pcf: line 296, column 48
    function defaultSetter_197 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.EmploymentData.PaidFull = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextAreaInput (id=OccurrenceDescription) at LossDetailsDV.Wc.pcf: line 22, column 36
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on BooleanRadioInput (id=EmploymentData_WagePaymentContinued) at LossDetailsDV.Wc.pcf: line 301, column 55
    function defaultSetter_201 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.EmploymentData.WagePaymentCont = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=ModifiedDutyAvailable) at LossDetailsDV.Wc.pcf: line 306, column 42
    function defaultSetter_205 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.ModifiedDutyAvail = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CurrencyInput (id=EmploymentData_DiscontinuedFringeBenefits) at LossDetailsDV.Wc.pcf: line 313, column 55
    function defaultSetter_209 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.ClaimWorkComp.DiscontinuedFringeBenefits = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on TypeKeyInput (id=ConcurrentEmployment) at LossDetailsDV.Wc.pcf: line 319, column 35
    function defaultSetter_213 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.ConcurrentEmp = (__VALUE_TO_SET as typekey.YesNo)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claim_EmploymentInjury) at LossDetailsDV.Wc.pcf: line 334, column 42
    function defaultSetter_217 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.EmploymentInjury = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=InjuredOnRegularJob) at LossDetailsDV.Wc.pcf: line 342, column 43
    function defaultSetter_221 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.InjuredRegularJob = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TypeKeyRadioInput (id=EmployerQuestionsValidity) at LossDetailsDV.Wc.pcf: line 351, column 37
    function defaultSetter_225 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.EmpQusValidity = (__VALUE_TO_SET as typekey.YesNo)
    }
    
    // 'value' attribute on TypeKeyInput (id=AccidentPremises) at LossDetailsDV.Wc.pcf: line 52, column 47
    function defaultSetter_23 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.ClaimWorkComp.AccidentPremises = (__VALUE_TO_SET as typekey.AccidentPremises)
    }
    
    // 'value' attribute on TextInput (id=EmployerValidityReason) at LossDetailsDV.Wc.pcf: line 360, column 53
    function defaultSetter_231 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.EmployerValidityReason = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on BooleanRadioInput (id=SafetyEquipmentProvided) at LossDetailsDV.Wc.pcf: line 365, column 41
    function defaultSetter_235 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.SafetyEquipProv = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=SafetyEquipmentUsed) at LossDetailsDV.Wc.pcf: line 373, column 41
    function defaultSetter_239 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.SafetyEquipUsed = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TypeKeyRadioInput (id=DrugsInvolved) at LossDetailsDV.Wc.pcf: line 382, column 37
    function defaultSetter_243 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.DrugsInvolved = (__VALUE_TO_SET as typekey.YesNo)
    }
    
    // 'value' attribute on BooleanRadioInput (id=InjurySeverity_MedicalReport) at LossDetailsDV.Wc.pcf: line 399, column 38
    function defaultSetter_249 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.MedicalReport = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=InjurySeverity_TimeLossReport) at LossDetailsDV.Wc.pcf: line 406, column 39
    function defaultSetter_253 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.TimeLossReport = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=InjurySeverity_EmployerLiability) at LossDetailsDV.Wc.pcf: line 413, column 42
    function defaultSetter_257 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.EmployerLiability = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at LossDetailsDV.Wc.pcf: line 422, column 41
    function defaultSetter_261 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.Catastrophe = (__VALUE_TO_SET as entity.Catastrophe)
    }
    
    // 'value' attribute on TypeKeyInput (id=JurisdictionState) at LossDetailsDV.Wc.pcf: line 59, column 43
    function defaultSetter_27 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.JurisdictionState = (__VALUE_TO_SET as typekey.Jurisdiction)
    }
    
    // 'value' attribute on DateInput (id=Claim_InjuryIllnessDate) at LossDetailsDV.Wc.pcf: line 434, column 32
    function defaultSetter_271 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.LossDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateInput (id=EmploymentData_InjuryStartDate) at LossDetailsDV.Wc.pcf: line 451, column 55
    function defaultSetter_283 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.EmploymentData.InjuryStartTime = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateInput (id=Claim_DateReportedtoEmployer) at LossDetailsDV.Wc.pcf: line 466, column 43
    function defaultSetter_293 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.DateRptdToEmployer = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateInput (id=ClaimFormGiven) at LossDetailsDV.Wc.pcf: line 473, column 43
    function defaultSetter_297 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.DateFormGivenToEmp = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Notification_FirstNoticeSuit) at LossDetailsDV.Wc.pcf: line 481, column 39
    function defaultSetter_302 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.FirstNoticeSuit = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on DateInput (id=Notification_DateNotifiedOfEmployeeRepresentation) at LossDetailsDV.Wc.pcf: line 492, column 50
    function defaultSetter_308 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.ClaimWorkComp.DateOfEmployeeRepresentation = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_HowReported) at LossDetailsDV.Wc.pcf: line 498, column 46
    function defaultSetter_312 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.HowReported = (__VALUE_TO_SET as typekey.HowReportedType)
    }
    
    // 'value' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_326 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.reporter = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_ReportedByType) at LossDetailsDV.Wc.pcf: line 515, column 48
    function defaultSetter_337 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.ReportedByType = (__VALUE_TO_SET as typekey.PersonRelationType)
    }
    
    // 'value' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_352 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.maincontact = (__VALUE_TO_SET as entity.Person)
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_MainContactType) at LossDetailsDV.Wc.pcf: line 541, column 49
    function defaultSetter_362 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.MainContactType = (__VALUE_TO_SET as typekey.PersonRelationType)
    }
    
    // 'value' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_45 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.claimant = (__VALUE_TO_SET as entity.Person)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claimant_ContactProhibited) at LossDetailsDV.Wc.pcf: line 82, column 36
    function defaultSetter_55 (__VALUE_TO_SET :  java.lang.Object) : void {
      ContactProhibited = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextInput (id=Claim_ActivityPerformed) at LossDetailsDV.Wc.pcf: line 27, column 42
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.ActivityPerformed = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=InjuryDescription) at LossDetailsDV.Wc.pcf: line 131, column 64
    function defaultSetter_84 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.ensureClaimInjuryIncident().Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_Severity) at LossDetailsDV.Wc.pcf: line 138, column 43
    function defaultSetter_88 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.ensureClaimInjuryIncident().Severity = (__VALUE_TO_SET as typekey.SeverityType)
    }
    
    // 'value' attribute on DateInput (id=Claim_ExposureBegan) at LossDetailsDV.Wc.pcf: line 147, column 38
    function defaultSetter_95 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.ExposureBegan = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateInput (id=Claim_ExposureEnded) at LossDetailsDV.Wc.pcf: line 155, column 38
    function defaultSetter_99 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.ExposureEnded = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'encryptionExpression' attribute on PrivacyInput (id=Claimant_TaxNumber) at LossDetailsDV.Wc.pcf: line 111, column 38
    function encryptionExpression_76 (VALUE :  java.lang.String) : java.lang.String {
      return Claim.claimant.maskTaxId(VALUE)
    }
    
    // 'filter' attribute on TypeKeyInput (id=JurisdictionState) at LossDetailsDV.Wc.pcf: line 59, column 43
    function filter_29 (VALUE :  typekey.Jurisdiction, VALUES :  typekey.Jurisdiction[]) : java.lang.Boolean {
      return VALUE.hasCategory(JurisdictionType.TC_INSURANCE)
    }
    
    // 'filter' attribute on TypeKeyInput (id=Claim_ReportedByType) at LossDetailsDV.Wc.pcf: line 515, column 48
    function filter_339 (VALUE :  typekey.PersonRelationType, VALUES :  typekey.PersonRelationType[]) : java.lang.Boolean {
      return VALUE.hasCategory(Claim.Policy.PolicyType)
    }
    
    // 'filter' attribute on TypeKeyInput (id=Claim_Severity) at LossDetailsDV.Wc.pcf: line 138, column 43
    function filter_90 (VALUE :  typekey.SeverityType, VALUES :  typekey.SeverityType[]) : java.lang.Boolean {
      return VALUE.hasCategory(LossType.TC_WC)
    }
    
    // 'onChange' attribute on PostOnChange at LossDetailsDV.Wc.pcf: line 436, column 74
    function onChange_266 () : void {
      gw.pcf.ClaimLossDetailsUtil.changedLossDate(Claim)
    }
    
    // 'onChange' attribute on PostOnChange at LossDetailsDV.Wc.pcf: line 484, column 71
    function onChange_299 () : void {
      Claim.clearDateNotifiedOfEmployeeRepresentation()
    }
    
    // 'onPick' attribute on ClaimContactInput (id=EmploymentData_SupervisorPicker) at ClaimContactWidget.xml: line 12, column 273
    function onPick_173 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Claim.supervisor); var result = eval("Claim.supervisor = Claim.resolveContact(Claim.supervisor) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function onPick_324 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Claim.reporter); var result = eval("Claim.reporter = Claim.resolveContact(Claim.reporter) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 12, column 273
    function onPick_350 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Claim.maincontact); var result = eval("Claim.maincontact = Claim.resolveContact(Claim.maincontact) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function onPick_43 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Claim.claimant); var result = eval("Claim.claimant = Claim.resolveContact(Claim.claimant) as " + contactType.Name + ";return null;"); ;
    }
    
    // Reflect at LossDetailsDV.Wc.pcf: line 517, column 42
    function reflectionValue_334 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Object {
      return (VALUE==Claim.Insured) ? ("self") : (true) ? ("") : "<NOCHANGE>"
    }
    
    // 'value' attribute on Reflect at LossDetailsDV.Wc.pcf: line 89, column 44
    function reflectionValue_56 (TRIGGER_INDEX :  int, VALUE :  entity.Person) : java.lang.Object {
      return VALUE.PrimaryPhoneValue
    }
    
    // 'value' attribute on Reflect at LossDetailsDV.Wc.pcf: line 97, column 53
    function reflectionValue_61 (TRIGGER_INDEX :  int, VALUE :  entity.Person) : java.lang.Object {
      return VALUE.PrimaryAddressDisplayValue
    }
    
    // 'value' attribute on Reflect at LossDetailsDV.Wc.pcf: line 105, column 38
    function reflectionValue_66 (TRIGGER_INDEX :  int, VALUE :  entity.Person) : java.lang.Object {
      return VALUE.DateOfBirth
    }
    
    // 'value' attribute on Reflect at LossDetailsDV.Wc.pcf: line 114, column 32
    function reflectionValue_71 (TRIGGER_INDEX :  int, VALUE :  entity.Person) : java.lang.Object {
      return VALUE.TaxID
    }
    
    // 'value' attribute on Reflect at LossDetailsDV.Wc.pcf: line 122, column 37
    function reflectionValue_77 (TRIGGER_INDEX :  int, VALUE :  entity.Person) : java.lang.Object {
      return VALUE.Occupation
    }
    
    // 'validationExpression' attribute on DateInput (id=EmploymentData_HireDate) at LossDetailsDV.Wc.pcf: line 252, column 48
    function validationExpression_149 () : java.lang.Object {
      return Claim.EmploymentData.HireDate == null || Claim.EmploymentData.HireDate < gw.api.util.DateUtil.currentDate() ? null : DisplayKey.get("Java.Validation.Date.ForbidFuture")
    }
    
    // 'validationExpression' attribute on DateInput (id=Claim_InjuryIllnessDate) at LossDetailsDV.Wc.pcf: line 434, column 32
    function validationExpression_267 () : java.lang.Object {
      return Claim.LossDate == null || Claim.LossDate < gw.api.util.DateUtil.currentDate() ? null : DisplayKey.get("Java.Validation.Date.ForbidFuture")
    }
    
    // 'validationExpression' attribute on DateInput (id=Claim_lossTime) at LossDetailsDV.Wc.pcf: line 444, column 33
    function validationExpression_273 () : java.lang.Object {
      return Claim.LossDate != null || Claim.LossDate < gw.api.util.DateUtil.currentDate() ? null : DisplayKey.get("Java.Validation.Date.ForbidFuture")
    }
    
    // 'validationExpression' attribute on DateInput (id=EmploymentData_InjuryStartDate) at LossDetailsDV.Wc.pcf: line 451, column 55
    function validationExpression_279 () : java.lang.Object {
      return Claim.EmploymentData.InjuryStartTime == null || Claim.EmploymentData.InjuryStartTime < gw.api.util.DateUtil.currentDate() ? null : DisplayKey.get("Java.Validation.Date.ForbidFuture")
    }
    
    // 'validationExpression' attribute on DateInput (id=Claim_ExposureBegan) at LossDetailsDV.Wc.pcf: line 147, column 38
    function validationExpression_91 () : java.lang.Object {
      return Claim.ExposureBegan == null || Claim.ExposureBegan < gw.api.util.DateUtil.currentDate() ? null : DisplayKey.get("Java.Validation.Date.ForbidFuture")
    }
    
    // 'valueRange' attribute on RangeInput (id=EmploymentData_ClassCode) at LossDetailsDV.Wc.pcf: line 239, column 39
    function valueRange_142 () : java.lang.Object {
      return FilteredClassCodes
    }
    
    // 'valueRange' attribute on RangeInput (id=LocationCode) at LossDetailsDV.Wc.pcf: line 43, column 43
    function valueRange_18 () : java.lang.Object {
      return Claim.PolicyProperties
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at LossDetailsDV.Wc.pcf: line 422, column 41
    function valueRange_263 () : java.lang.Object {
      return gw.api.admin.CatastropheUtil.getCatastrophes()
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_47 () : java.lang.Object {
      return Claim.RelatedPersonArray
    }
    
    // 'value' attribute on CurrencyInput (id=EmploymentData_WorkCompAWW) at LossDetailsDV.Wc.pcf: line 224, column 50
    function valueRoot_133 () : java.lang.Object {
      return Claim.EmploymentData
    }
    
    // 'value' attribute on TypeKeyInput (id=AccidentPremises) at LossDetailsDV.Wc.pcf: line 52, column 47
    function valueRoot_24 () : java.lang.Object {
      return Claim.ClaimWorkComp
    }
    
    // 'value' attribute on TextAreaInput (id=OccurrenceDescription) at LossDetailsDV.Wc.pcf: line 22, column 36
    function valueRoot_3 () : java.lang.Object {
      return Claim
    }
    
    // 'value' attribute on TextInput (id=Claimant_Phone) at LossDetailsDV.Wc.pcf: line 86, column 50
    function valueRoot_60 () : java.lang.Object {
      return Claim.claimant
    }
    
    // 'value' attribute on TextInput (id=InjuryDescription) at LossDetailsDV.Wc.pcf: line 131, column 64
    function valueRoot_85 () : java.lang.Object {
      return Claim.ensureClaimInjuryIncident()
    }
    
    // 'value' attribute on TextAreaInput (id=OccurrenceDescription) at LossDetailsDV.Wc.pcf: line 22, column 36
    function value_0 () : java.lang.String {
      return Claim.Description
    }
    
    // 'value' attribute on BooleanRadioInput (id=InjurySeverity_DeathReport) at LossDetailsDV.Wc.pcf: line 161, column 36
    function value_101 () : java.lang.Boolean {
      return Claim.DeathReport
    }
    
    // 'value' attribute on DateInput (id=DeathDate) at LossDetailsDV.Wc.pcf: line 167, column 47
    function value_106 () : java.util.Date {
      return Claim.DeathDate
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_InjuryIllnessCause) at LossDetailsDV.Wc.pcf: line 175, column 40
    function value_111 () : typekey.LossCause {
      return Claim.LossCause
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_AccidentType) at LossDetailsDV.Wc.pcf: line 181, column 43
    function value_115 () : typekey.AccidentType {
      return Claim.AccidentType
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_PrimaryInjury) at LossDetailsDV.Wc.pcf: line 188, column 41
    function value_119 () : typekey.InjuryType {
      return Claim.ensureClaimInjuryIncident().GeneralInjuryType
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_DetailedInjury) at LossDetailsDV.Wc.pcf: line 195, column 49
    function value_123 () : typekey.DetailedInjuryType {
      return Claim.ensureClaimInjuryIncident().DetailedInjuryType
    }
    
    // 'value' attribute on CurrencyInput (id=EmploymentData_WorkCompAWW) at LossDetailsDV.Wc.pcf: line 224, column 50
    function value_130 () : gw.api.financials.CurrencyAmount {
      return Claim.EmploymentData.WageAmount
    }
    
    // 'value' attribute on BooleanRadioInput (id=EmploymentData_ClassCodeByLocation) at LossDetailsDV.Wc.pcf: line 229, column 57
    function value_134 () : java.lang.Boolean {
      return Claim.ClaimWorkComp.ClassCodeByLocation
    }
    
    // 'value' attribute on RangeInput (id=EmploymentData_ClassCode) at LossDetailsDV.Wc.pcf: line 239, column 39
    function value_138 () : entity.ClassCode {
      return Claim.EmploymentData.ClassCode
    }
    
    // 'value' attribute on RangeInput (id=LocationCode) at LossDetailsDV.Wc.pcf: line 43, column 43
    function value_14 () : entity.PolicyLocation {
      return Claim.LocationCode
    }
    
    // 'value' attribute on TextInput (id=EmploymentData_DepartmentCode) at LossDetailsDV.Wc.pcf: line 244, column 54
    function value_145 () : java.lang.String {
      return Claim.EmploymentData.DepartmentCode
    }
    
    // 'value' attribute on DateInput (id=EmploymentData_HireDate) at LossDetailsDV.Wc.pcf: line 252, column 48
    function value_150 () : java.util.Date {
      return Claim.EmploymentData.HireDate
    }
    
    // 'value' attribute on TypeKeyInput (id=EmploymentData_HireState) at LossDetailsDV.Wc.pcf: line 258, column 36
    function value_155 () : typekey.State {
      return Claim.EmploymentData.HireState
    }
    
    // 'value' attribute on TypeKeyInput (id=EmploymentData_EmploymentStatus) at LossDetailsDV.Wc.pcf: line 264, column 51
    function value_159 () : typekey.EmploymentStatusType {
      return Claim.EmploymentData.EmploymentStatus
    }
    
    // 'value' attribute on ClaimContactInput (id=EmploymentData_SupervisorPicker) at LossDetailsDV.Wc.pcf: line 273, column 36
    function value_163 () : entity.Person {
      return Claim.supervisor
    }
    
    // 'value' attribute on TextInput (id=EmploymentData_NumDaysWorkedPerWeek) at LossDetailsDV.Wc.pcf: line 279, column 43
    function value_183 () : java.math.BigDecimal {
      return Claim.EmploymentData.NumDaysWorked
    }
    
    // 'value' attribute on TextInput (id=EmploymentData_NumHoursWorkedPerDay) at LossDetailsDV.Wc.pcf: line 285, column 43
    function value_187 () : java.math.BigDecimal {
      return Claim.EmploymentData.NumHoursWorked
    }
    
    // 'value' attribute on TypeKeyInput (id=EmploymentData_PayPeriod) at LossDetailsDV.Wc.pcf: line 291, column 44
    function value_191 () : typekey.PayPeriodType {
      return Claim.EmploymentData.PayPeriod
    }
    
    // 'value' attribute on BooleanRadioInput (id=EmploymentData_PaidFullWages) at LossDetailsDV.Wc.pcf: line 296, column 48
    function value_195 () : java.lang.Boolean {
      return Claim.EmploymentData.PaidFull
    }
    
    // 'value' attribute on BooleanRadioInput (id=EmploymentData_WagePaymentContinued) at LossDetailsDV.Wc.pcf: line 301, column 55
    function value_199 () : java.lang.Boolean {
      return Claim.EmploymentData.WagePaymentCont
    }
    
    // 'value' attribute on BooleanRadioInput (id=ModifiedDutyAvailable) at LossDetailsDV.Wc.pcf: line 306, column 42
    function value_203 () : java.lang.Boolean {
      return Claim.ModifiedDutyAvail
    }
    
    // 'value' attribute on CurrencyInput (id=EmploymentData_DiscontinuedFringeBenefits) at LossDetailsDV.Wc.pcf: line 313, column 55
    function value_207 () : gw.api.financials.CurrencyAmount {
      return Claim.ClaimWorkComp.DiscontinuedFringeBenefits
    }
    
    // 'value' attribute on TypeKeyInput (id=AccidentPremises) at LossDetailsDV.Wc.pcf: line 52, column 47
    function value_21 () : typekey.AccidentPremises {
      return Claim.ClaimWorkComp.AccidentPremises
    }
    
    // 'value' attribute on TypeKeyInput (id=ConcurrentEmployment) at LossDetailsDV.Wc.pcf: line 319, column 35
    function value_211 () : typekey.YesNo {
      return Claim.ConcurrentEmp
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claim_EmploymentInjury) at LossDetailsDV.Wc.pcf: line 334, column 42
    function value_215 () : java.lang.Boolean {
      return Claim.EmploymentInjury
    }
    
    // 'value' attribute on BooleanRadioInput (id=InjuredOnRegularJob) at LossDetailsDV.Wc.pcf: line 342, column 43
    function value_219 () : java.lang.Boolean {
      return Claim.InjuredRegularJob
    }
    
    // 'value' attribute on TypeKeyRadioInput (id=EmployerQuestionsValidity) at LossDetailsDV.Wc.pcf: line 351, column 37
    function value_223 () : typekey.YesNo {
      return Claim.EmpQusValidity
    }
    
    // 'value' attribute on TextInput (id=EmployerValidityReason) at LossDetailsDV.Wc.pcf: line 360, column 53
    function value_228 () : java.lang.String {
      return Claim.EmployerValidityReason
    }
    
    // 'value' attribute on BooleanRadioInput (id=SafetyEquipmentProvided) at LossDetailsDV.Wc.pcf: line 365, column 41
    function value_233 () : java.lang.Boolean {
      return Claim.SafetyEquipProv
    }
    
    // 'value' attribute on BooleanRadioInput (id=SafetyEquipmentUsed) at LossDetailsDV.Wc.pcf: line 373, column 41
    function value_237 () : java.lang.Boolean {
      return Claim.SafetyEquipUsed
    }
    
    // 'value' attribute on TypeKeyRadioInput (id=DrugsInvolved) at LossDetailsDV.Wc.pcf: line 382, column 37
    function value_241 () : typekey.YesNo {
      return Claim.DrugsInvolved
    }
    
    // 'value' attribute on BooleanRadioInput (id=InjurySeverity_MedicalReport) at LossDetailsDV.Wc.pcf: line 399, column 38
    function value_247 () : java.lang.Boolean {
      return Claim.MedicalReport
    }
    
    // 'value' attribute on TypeKeyInput (id=JurisdictionState) at LossDetailsDV.Wc.pcf: line 59, column 43
    function value_25 () : typekey.Jurisdiction {
      return Claim.JurisdictionState
    }
    
    // 'value' attribute on BooleanRadioInput (id=InjurySeverity_TimeLossReport) at LossDetailsDV.Wc.pcf: line 406, column 39
    function value_251 () : java.lang.Boolean {
      return Claim.TimeLossReport
    }
    
    // 'value' attribute on BooleanRadioInput (id=InjurySeverity_EmployerLiability) at LossDetailsDV.Wc.pcf: line 413, column 42
    function value_255 () : java.lang.Boolean {
      return Claim.EmployerLiability
    }
    
    // 'value' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at LossDetailsDV.Wc.pcf: line 422, column 41
    function value_259 () : entity.Catastrophe {
      return Claim.Catastrophe
    }
    
    // 'value' attribute on DateInput (id=Claim_InjuryIllnessDate) at LossDetailsDV.Wc.pcf: line 434, column 32
    function value_268 () : java.util.Date {
      return Claim.LossDate
    }
    
    // 'value' attribute on DateInput (id=EmploymentData_InjuryStartDate) at LossDetailsDV.Wc.pcf: line 451, column 55
    function value_280 () : java.util.Date {
      return Claim.EmploymentData.InjuryStartTime
    }
    
    // 'value' attribute on DateInput (id=Claim_DateReportedtoEmployer) at LossDetailsDV.Wc.pcf: line 466, column 43
    function value_291 () : java.util.Date {
      return Claim.DateRptdToEmployer
    }
    
    // 'value' attribute on DateInput (id=ClaimFormGiven) at LossDetailsDV.Wc.pcf: line 473, column 43
    function value_295 () : java.util.Date {
      return Claim.DateFormGivenToEmp
    }
    
    // 'value' attribute on TextInput (id=JurisdictionClaimNumber) at LossDetailsDV.Wc.pcf: line 64, column 62
    function value_30 () : java.lang.String {
      return Claim.ClaimWorkComp.JurisdictionClaimNumber
    }
    
    // 'value' attribute on BooleanRadioInput (id=Notification_FirstNoticeSuit) at LossDetailsDV.Wc.pcf: line 481, column 39
    function value_300 () : java.lang.Boolean {
      return Claim.FirstNoticeSuit
    }
    
    // 'value' attribute on DateInput (id=Notification_DateNotifiedOfEmployeeRepresentation) at LossDetailsDV.Wc.pcf: line 492, column 50
    function value_305 () : java.util.Date {
      return Claim.ClaimWorkComp.DateOfEmployeeRepresentation
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_HowReported) at LossDetailsDV.Wc.pcf: line 498, column 46
    function value_310 () : typekey.HowReportedType {
      return Claim.HowReported
    }
    
    // 'value' attribute on ClaimContactInput (id=ReportedBy_Picker) at LossDetailsDV.Wc.pcf: line 507, column 48
    function value_314 () : entity.Contact {
      return Claim.reporter
    }
    
    // 'value' attribute on ClaimContactInput (id=Claimant_Picker) at LossDetailsDV.Wc.pcf: line 77, column 36
    function value_33 () : entity.Person {
      return Claim.claimant
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_ReportedByType) at LossDetailsDV.Wc.pcf: line 515, column 48
    function value_335 () : typekey.PersonRelationType {
      return Claim.ReportedByType
    }
    
    // 'value' attribute on ClaimContactInput (id=MainContact_Picker) at LossDetailsDV.Wc.pcf: line 534, column 36
    function value_340 () : entity.Person {
      return Claim.maincontact
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_MainContactType) at LossDetailsDV.Wc.pcf: line 541, column 49
    function value_360 () : typekey.PersonRelationType {
      return Claim.MainContactType
    }
    
    // 'value' attribute on TextInput (id=Notification_InsuredReportNumber) at LossDetailsDV.Wc.pcf: line 545, column 58
    function value_365 () : java.lang.String {
      return Claim.ClaimWorkComp.InsuredReportNumber
    }
    
    // 'value' attribute on TextInput (id=Claim_ActivityPerformed) at LossDetailsDV.Wc.pcf: line 27, column 42
    function value_4 () : java.lang.String {
      return Claim.ActivityPerformed
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claimant_ContactProhibited) at LossDetailsDV.Wc.pcf: line 82, column 36
    function value_53 () : java.lang.Boolean {
      return ContactProhibited
    }
    
    // 'value' attribute on TextInput (id=Claimant_Phone) at LossDetailsDV.Wc.pcf: line 86, column 50
    function value_58 () : java.lang.String {
      return Claim.claimant.PrimaryPhoneValue
    }
    
    // 'value' attribute on TextInput (id=Claimant_Address) at LossDetailsDV.Wc.pcf: line 94, column 59
    function value_63 () : java.lang.String {
      return Claim.claimant.PrimaryAddressDisplayValue
    }
    
    // 'value' attribute on DateInput (id=Claimant_DateOfBirth) at LossDetailsDV.Wc.pcf: line 102, column 44
    function value_68 () : java.util.Date {
      return Claim.claimant.DateOfBirth
    }
    
    // 'value' attribute on PrivacyInput (id=Claimant_TaxNumber) at LossDetailsDV.Wc.pcf: line 111, column 38
    function value_73 () : java.lang.String {
      return Claim.claimant.TaxID
    }
    
    // 'value' attribute on TextInput (id=EmploymentData_Occupation) at LossDetailsDV.Wc.pcf: line 119, column 43
    function value_79 () : java.lang.String {
      return Claim.claimant.Occupation
    }
    
    // 'value' attribute on TextInput (id=Claim_EquipmentUsed) at LossDetailsDV.Wc.pcf: line 33, column 38
    function value_8 () : java.lang.String {
      return Claim.EquipmentUsed
    }
    
    // 'value' attribute on TextInput (id=InjuryDescription) at LossDetailsDV.Wc.pcf: line 131, column 64
    function value_82 () : java.lang.String {
      return Claim.ensureClaimInjuryIncident().Description
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_Severity) at LossDetailsDV.Wc.pcf: line 138, column 43
    function value_86 () : typekey.SeverityType {
      return Claim.ensureClaimInjuryIncident().Severity
    }
    
    // 'value' attribute on DateInput (id=Claim_ExposureBegan) at LossDetailsDV.Wc.pcf: line 147, column 38
    function value_92 () : java.util.Date {
      return Claim.ExposureBegan
    }
    
    // 'value' attribute on DateInput (id=Claim_ExposureEnded) at LossDetailsDV.Wc.pcf: line 155, column 38
    function value_97 () : java.util.Date {
      return Claim.ExposureEnded
    }
    
    // 'valueRange' attribute on RangeInput (id=EmploymentData_ClassCode) at LossDetailsDV.Wc.pcf: line 239, column 39
    function verifyValueRangeIsAllowedType_143 ($$arg :  entity.ClassCode[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=EmploymentData_ClassCode) at LossDetailsDV.Wc.pcf: line 239, column 39
    function verifyValueRangeIsAllowedType_143 ($$arg :  gw.api.database.IQueryBeanResult<entity.ClassCode>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=EmploymentData_ClassCode) at LossDetailsDV.Wc.pcf: line 239, column 39
    function verifyValueRangeIsAllowedType_143 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=EmploymentData_SupervisorPicker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_178 ($$arg :  entity.Person[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=EmploymentData_SupervisorPicker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_178 ($$arg :  gw.api.database.IQueryBeanResult<entity.Person>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=EmploymentData_SupervisorPicker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_178 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=LocationCode) at LossDetailsDV.Wc.pcf: line 43, column 43
    function verifyValueRangeIsAllowedType_19 ($$arg :  entity.PolicyLocation[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=LocationCode) at LossDetailsDV.Wc.pcf: line 43, column 43
    function verifyValueRangeIsAllowedType_19 ($$arg :  gw.api.database.IQueryBeanResult<entity.PolicyLocation>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=LocationCode) at LossDetailsDV.Wc.pcf: line 43, column 43
    function verifyValueRangeIsAllowedType_19 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at LossDetailsDV.Wc.pcf: line 422, column 41
    function verifyValueRangeIsAllowedType_264 ($$arg :  entity.Catastrophe[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at LossDetailsDV.Wc.pcf: line 422, column 41
    function verifyValueRangeIsAllowedType_264 ($$arg :  gw.api.database.IQueryBeanResult<entity.Catastrophe>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at LossDetailsDV.Wc.pcf: line 422, column 41
    function verifyValueRangeIsAllowedType_264 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_329 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_329 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_329 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_355 ($$arg :  entity.Person[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_355 ($$arg :  gw.api.database.IQueryBeanResult<entity.Person>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_355 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_48 ($$arg :  entity.Person[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_48 ($$arg :  gw.api.database.IQueryBeanResult<entity.Person>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_48 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=EmploymentData_ClassCode) at LossDetailsDV.Wc.pcf: line 239, column 39
    function verifyValueRange_144 () : void {
      var __valueRangeArg = FilteredClassCodes
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_143(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=EmploymentData_SupervisorPicker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_179 () : void {
      var __valueRangeArg = Claim.RelatedPersonArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_178(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=LocationCode) at LossDetailsDV.Wc.pcf: line 43, column 43
    function verifyValueRange_20 () : void {
      var __valueRangeArg = Claim.PolicyProperties
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_19(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at LossDetailsDV.Wc.pcf: line 422, column 41
    function verifyValueRange_265 () : void {
      var __valueRangeArg = gw.api.admin.CatastropheUtil.getCatastrophes()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_264(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_330 () : void {
      var __valueRangeArg = Claim.RelatedPersonArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_329(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_356 () : void {
      var __valueRangeArg = Claim.RelatedPersonArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_355(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_49 () : void {
      var __valueRangeArg = Claim.RelatedPersonArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_48(__valueRangeArg)
    }
    
    // 'valueType' attribute on ClaimContactInput (id=EmploymentData_SupervisorPicker) at LossDetailsDV.Wc.pcf: line 273, column 36
    function verifyValueType_182 () : void {
      var __valueTypeArg : entity.Person
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'valueType' attribute on ClaimContactInput (id=MainContact_Picker) at LossDetailsDV.Wc.pcf: line 534, column 36
    function verifyValueType_359 () : void {
      var __valueTypeArg : entity.Person
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'valueType' attribute on ClaimContactInput (id=Claimant_Picker) at LossDetailsDV.Wc.pcf: line 77, column 36
    function verifyValueType_52 () : void {
      var __valueTypeArg : entity.Person
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'visible' attribute on DateInput (id=DeathDate) at LossDetailsDV.Wc.pcf: line 167, column 47
    function visible_105 () : java.lang.Boolean {
      return Claim.DeathReport == true 
    }
    
    // 'visible' attribute on ClaimContactInput (id=EmploymentData_SupervisorPicker) at ClaimContactWidget.xml: line 16, column 225
    function visible_167 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Claim.supervisor), Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on TextInput (id=EmployerValidityReason) at LossDetailsDV.Wc.pcf: line 360, column 53
    function visible_227 () : java.lang.Boolean {
      return Claim.EmpQusValidity == TC_YES
    }
    
    // 'visible' attribute on DateInput (id=Notification_DateNotifiedOfEmployeeRepresentation) at LossDetailsDV.Wc.pcf: line 492, column 50
    function visible_304 () : java.lang.Boolean {
      return Claim.FirstNoticeSuit == true
    }
    
    // 'visible' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 16, column 225
    function visible_318 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Claim.reporter), Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 14, column 229
    function visible_34 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 16, column 225
    function visible_344 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Claim.maincontact), Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on ListViewInput at LossDetailsDV.Wc.pcf: line 557, column 58
    function visible_368 () : java.lang.Boolean {
      return Claim.ConcurrentEmp == YesNo.TC_YES 
    }
    
    // 'visible' attribute on ClaimContactInput (id=Claimant_Picker) at ClaimContactWidget.xml: line 16, column 225
    function visible_37 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Claim.claimant), Claim, null as List<SpecialistService>)" != "" && true
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
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