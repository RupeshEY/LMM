package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/default/ClaimSnapshotGeneralPanelSet.wc.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotGeneralPanelSet_wcExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/default/ClaimSnapshotGeneralPanelSet.wc.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotGeneralPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotGeneralPanelSet.wc.pcf: line 60, column 29
    function def_onEnter_17 (def :  pcf.AddressSnapshotInputSet) : void {
      def.onEnter(Snapshot.LossLocation, Snapshot)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotGeneralPanelSet.wc.pcf: line 60, column 29
    function def_refreshVariables_18 (def :  pcf.AddressSnapshotInputSet) : void {
      def.refreshVariables(Snapshot.LossLocation, Snapshot)
    }
    
    // 'encryptionExpression' attribute on PrivacyInput (id=TaxID) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 270, column 40
    function encryptionExpression_131 (VALUE :  dynamic.Dynamic) : java.lang.String {
      return gw.api.privacy.EncryptionMaskExpressions.maskTaxId(VALUE as String)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPanelSet.wc.pcf: line 419, column 48
    function sortValue_206 (ConcurrentEmpl :  dynamic.Dynamic) : java.lang.Object {
      return ConcurrentEmpl.CompanyName
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPanelSet.wc.pcf: line 423, column 80
    function sortValue_207 (ConcurrentEmpl :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(ConcurrentEmpl.StartDate)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPanelSet.wc.pcf: line 427, column 78
    function sortValue_208 (ConcurrentEmpl :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(ConcurrentEmpl.EndDate)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPanelSet.wc.pcf: line 431, column 79
    function sortValue_209 (ConcurrentEmpl :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(ConcurrentEmpl.FullTime)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPanelSet.wc.pcf: line 436, column 48
    function sortValue_210 (ConcurrentEmpl :  dynamic.Dynamic) : java.lang.Object {
      return ConcurrentEmpl.WeeklyWage
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPanelSet.wc.pcf: line 441, column 48
    function sortValue_211 (ConcurrentEmpl :  dynamic.Dynamic) : java.lang.Object {
      return ConcurrentEmpl.JobTitle
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPanelSet.wc.pcf: line 446, column 48
    function sortValue_212 (ConcurrentEmpl :  dynamic.Dynamic) : java.lang.Object {
      return ConcurrentEmpl.ContactNumber
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPanelSet.wc.pcf: line 468, column 83
    function sortValue_232 (WorkStatusChange :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(WorkStatusChange.StatusDate)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPanelSet.wc.pcf: line 473, column 48
    function sortValue_233 (WorkStatusChange :  dynamic.Dynamic) : java.lang.Object {
      return WorkStatusChange.Status
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPanelSet.wc.pcf: line 478, column 48
    function sortValue_234 (WorkStatusChange :  dynamic.Dynamic) : java.lang.Object {
      return WorkStatusChange.Comments
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPanelSet.wc.pcf: line 543, column 48
    function sortValue_265 (Official :  dynamic.Dynamic) : java.lang.Object {
      return Official.OfficialType
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPanelSet.wc.pcf: line 548, column 48
    function sortValue_266 (Official :  dynamic.Dynamic) : java.lang.Object {
      return Official.Name
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPanelSet.wc.pcf: line 553, column 48
    function sortValue_267 (Official :  dynamic.Dynamic) : java.lang.Object {
      return Official.ReportNumber
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPanelSet.wc.pcf: line 158, column 36
    function sortValue_64 (BodyPart :  dynamic.Dynamic) : java.lang.Object {
      return BodyPart.Ordering
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPanelSet.wc.pcf: line 163, column 48
    function sortValue_65 (BodyPart :  dynamic.Dynamic) : java.lang.Object {
      return BodyPart.PrimaryBodyPart
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPanelSet.wc.pcf: line 168, column 48
    function sortValue_66 (BodyPart :  dynamic.Dynamic) : java.lang.Object {
      return BodyPart.DetailedBodyPart
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPanelSet.wc.pcf: line 173, column 48
    function sortValue_67 (BodyPart :  dynamic.Dynamic) : java.lang.Object {
      return BodyPart.DetailedBodyPartDesc
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPanelSet.wc.pcf: line 178, column 48
    function sortValue_68 (BodyPart :  dynamic.Dynamic) : java.lang.Object {
      return BodyPart.SideOfBody
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPanelSet.wc.pcf: line 184, column 48
    function sortValue_69 (BodyPart :  dynamic.Dynamic) : java.lang.Object {
      return BodyPart.ImpairmentPercentage
    }
    
    // 'value' attribute on TextInput (id=Catastrophe) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 37, column 40
    function valueRoot_10 () : java.lang.Object {
      return Snapshot.Catastrophe
    }
    
    // 'value' attribute on TextInput (id=MedCase_Hospital) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 227, column 40
    function valueRoot_109 () : java.lang.Object {
      return Snapshot.Hospital
    }
    
    // 'value' attribute on TextInput (id=Claimant) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 246, column 40
    function valueRoot_118 () : java.lang.Object {
      return Snapshot.Claimant
    }
    
    // 'value' attribute on TextInput (id=PrimaryAddress) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 260, column 40
    function valueRoot_125 () : java.lang.Object {
      return Snapshot.Claimant.PrimaryAddress
    }
    
    // 'value' attribute on TextInput (id=Gender) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 275, column 40
    function valueRoot_134 () : java.lang.Object {
      return Snapshot.claimant
    }
    
    // 'value' attribute on DateInput (id=HireDate) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 299, column 40
    function valueRoot_145 () : java.lang.Object {
      return Snapshot.EmploymentData
    }
    
    // 'value' attribute on TextInput (id=Supervisor) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 314, column 40
    function valueRoot_154 () : java.lang.Object {
      return Snapshot.Supervisor
    }
    
    // 'value' attribute on TextInput (id=LossType) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 23, column 40
    function valueRoot_2 () : java.lang.Object {
      return Snapshot
    }
    
    // 'value' attribute on TextInput (id=LocationDescription) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 65, column 40
    function valueRoot_21 () : java.lang.Object {
      return Snapshot.LossLocation
    }
    
    // 'value' attribute on TextInput (id=Reporter) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 490, column 40
    function valueRoot_246 () : java.lang.Object {
      return Snapshot.Reporter
    }
    
    // 'value' attribute on TextInput (id=MainContact) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 500, column 40
    function valueRoot_252 () : java.lang.Object {
      return Snapshot.MainContact
    }
    
    // 'value' attribute on TextInput (id=AccidentPremises) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 75, column 40
    function valueRoot_27 () : java.lang.Object {
      return Snapshot.ClaimWorkComp
    }
    
    // 'value' attribute on TextInput (id=InjuryDescription) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 88, column 40
    function valueRoot_33 () : java.lang.Object {
      return Snapshot.ClaimInjuryIncident
    }
    
    // 'value' attribute on TextInput (id=MedCase_FirstIntakeDoctor) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 196, column 40
    function valueRoot_91 () : java.lang.Object {
      return Snapshot.FirstIntakeDoctor
    }
    
    // 'value' attribute on TextInput (id=LossType) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 23, column 40
    function value_0 () : dynamic.Dynamic {
      return Snapshot.LossType
    }
    
    // 'value' attribute on TextInput (id=MedCase_MedicalTreatment) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 217, column 40
    function value_101 () : dynamic.Dynamic {
      return Snapshot.ClaimInjuryIncident.MedicalTreatmentType
    }
    
    // 'value' attribute on TextAreaInput (id=MedCase_TreatmentRend) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 222, column 40
    function value_104 () : dynamic.Dynamic {
      return Snapshot.TreatmentRend
    }
    
    // 'value' attribute on TextInput (id=MedCase_Hospital) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 227, column 40
    function value_107 () : dynamic.Dynamic {
      return Snapshot.Hospital.DisplayName
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 47, column 40
    function value_11 () : dynamic.Dynamic {
      return Snapshot.Description
    }
    
    // 'value' attribute on DateInput (id=MedCase_HospitalDate) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 233, column 40
    function value_110 () : dynamic.Dynamic {
      return Snapshot.HospitalDate
    }
    
    // 'value' attribute on TextInput (id=MedCase_HospitalDays) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 238, column 40
    function value_113 () : dynamic.Dynamic {
      return Snapshot.HospitalDays
    }
    
    // 'value' attribute on TextInput (id=Claimant) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 246, column 40
    function value_116 () : dynamic.Dynamic {
      return Snapshot.Claimant.DisplayName
    }
    
    // 'value' attribute on BooleanRadioInput (id=ContactProhibited) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 251, column 40
    function value_119 () : dynamic.Dynamic {
      return util.Snapshot.getClaimant(Snapshot, null)["ContactProhibited"]
    }
    
    // 'value' attribute on TextInput (id=PrimaryPhone) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 255, column 69
    function value_121 () : java.lang.String {
      return util.Snapshot.getPrimaryPhone(Snapshot.Claimant)
    }
    
    // 'value' attribute on TextInput (id=PrimaryAddress) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 260, column 40
    function value_123 () : dynamic.Dynamic {
      return Snapshot.Claimant.PrimaryAddress.DisplayName
    }
    
    // 'value' attribute on TextInput (id=DateOfBirth) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 264, column 76
    function value_126 () : java.lang.String {
      return util.Snapshot.renderDate(Snapshot.Claimant.DateOfBirth)
    }
    
    // 'value' attribute on PrivacyInput (id=TaxID) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 270, column 40
    function value_128 () : dynamic.Dynamic {
      return Snapshot.Claimant.TaxID
    }
    
    // 'value' attribute on TextInput (id=Gender) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 275, column 40
    function value_132 () : dynamic.Dynamic {
      return Snapshot.claimant.Gender
    }
    
    // 'value' attribute on TextInput (id=MaritalStatus) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 280, column 40
    function value_135 () : dynamic.Dynamic {
      return Snapshot.claimant.MaritalStatus
    }
    
    // 'value' attribute on TextInput (id=Occupation) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 288, column 40
    function value_138 () : dynamic.Dynamic {
      return Snapshot.Claimant.Occupation
    }
    
    // 'value' attribute on DateInput (id=DateOfInjury) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 57, column 40
    function value_14 () : dynamic.Dynamic {
      return Snapshot.LossDate
    }
    
    // 'value' attribute on TextInput (id=EmpClass) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 292, column 81
    function value_141 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.EmploymentData.ClassCode)
    }
    
    // 'value' attribute on DateInput (id=HireDate) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 299, column 40
    function value_143 () : dynamic.Dynamic {
      return Snapshot.EmploymentData.HireDate
    }
    
    // 'value' attribute on TextInput (id=HireState) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 304, column 40
    function value_146 () : dynamic.Dynamic {
      return Snapshot.EmploymentData.HireState
    }
    
    // 'value' attribute on TextInput (id=EmploymentStatus) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 309, column 40
    function value_149 () : dynamic.Dynamic {
      return Snapshot.EmploymentData.EmploymentStatus
    }
    
    // 'value' attribute on TextInput (id=Supervisor) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 314, column 40
    function value_152 () : dynamic.Dynamic {
      return Snapshot.Supervisor.DisplayName
    }
    
    // 'value' attribute on TextInput (id=NumDaysWorked) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 319, column 40
    function value_155 () : dynamic.Dynamic {
      return Snapshot.EmploymentData.NumDaysWorked
    }
    
    // 'value' attribute on TextInput (id=NumHoursWorked) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 324, column 40
    function value_158 () : dynamic.Dynamic {
      return Snapshot.EmploymentData.NumHoursWorked
    }
    
    // 'value' attribute on TextInput (id=WageAmount) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 329, column 40
    function value_161 () : dynamic.Dynamic {
      return Snapshot.EmploymentData.WageAmount
    }
    
    // 'value' attribute on TextInput (id=PayPeriod) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 334, column 40
    function value_164 () : dynamic.Dynamic {
      return Snapshot.EmploymentData.PayPeriod
    }
    
    // 'value' attribute on DateInput (id=InjuryStartDate) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 340, column 40
    function value_167 () : dynamic.Dynamic {
      return Snapshot.EmploymentData.InjuryStartTime
    }
    
    // 'value' attribute on BooleanRadioInput (id=PaidFull) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 351, column 40
    function value_173 () : dynamic.Dynamic {
      return Snapshot.EmploymentData.PaidFull
    }
    
    // 'value' attribute on BooleanRadioInput (id=WagePaymentCont) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 356, column 40
    function value_176 () : dynamic.Dynamic {
      return Snapshot.EmploymentData.WagePaymentCont
    }
    
    // 'value' attribute on BooleanRadioInput (id=ModifiedDutyAvail) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 361, column 40
    function value_179 () : dynamic.Dynamic {
      return Snapshot.ModifiedDutyAvail
    }
    
    // 'value' attribute on TextInput (id=DiscontinuedFringeBenefits) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 366, column 40
    function value_182 () : dynamic.Dynamic {
      return Snapshot.ClaimWorkComp.DiscontinuedFringeBenefits
    }
    
    // 'value' attribute on BooleanRadioInput (id=InjuredRegularJob) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 371, column 40
    function value_185 () : dynamic.Dynamic {
      return Snapshot.InjuredRegularJob
    }
    
    // 'value' attribute on TextInput (id=EquipmentUsed) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 376, column 40
    function value_188 () : dynamic.Dynamic {
      return Snapshot.EquipmentUsed
    }
    
    // 'value' attribute on TextInput (id=LocationDescription) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 65, column 40
    function value_19 () : dynamic.Dynamic {
      return Snapshot.LossLocation.Description
    }
    
    // 'value' attribute on TextInput (id=ActivityPerformed) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 381, column 40
    function value_191 () : dynamic.Dynamic {
      return Snapshot.ActivityPerformed
    }
    
    // 'value' attribute on TextInput (id=DrugsInvolved) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 386, column 40
    function value_194 () : dynamic.Dynamic {
      return Snapshot.DrugsInvolved
    }
    
    // 'value' attribute on BooleanRadioInput (id=SafetyEquipProv) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 391, column 40
    function value_197 () : dynamic.Dynamic {
      return Snapshot.SafetyEquipProv
    }
    
    // 'value' attribute on BooleanRadioInput (id=SafetyEquipUsed) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 396, column 40
    function value_200 () : dynamic.Dynamic {
      return Snapshot.SafetyEquipUsed
    }
    
    // 'value' attribute on TextInput (id=ConcurrentEmployment) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 401, column 40
    function value_203 () : dynamic.Dynamic {
      return Snapshot.ConcurrentEmp
    }
    
    // 'value' attribute on BooleanRadioInput (id=EmploymentInjury) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 70, column 40
    function value_22 () : dynamic.Dynamic {
      return Snapshot.EmploymentInjury
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPanelSet.wc.pcf: line 413, column 43
    function value_231 () : dynamic.Dynamic {
      return Snapshot.ConcurrentEmpl
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPanelSet.wc.pcf: line 463, column 43
    function value_243 () : dynamic.Dynamic {
      return Snapshot.EmploymentData.WorkStatusChanges
    }
    
    // 'value' attribute on TextInput (id=Reporter) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 490, column 40
    function value_244 () : dynamic.Dynamic {
      return Snapshot.Reporter.DisplayName
    }
    
    // 'value' attribute on TextInput (id=ReportedByType) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 495, column 40
    function value_247 () : dynamic.Dynamic {
      return Snapshot.ReportedByType
    }
    
    // 'value' attribute on TextInput (id=AccidentPremises) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 75, column 40
    function value_25 () : dynamic.Dynamic {
      return Snapshot.ClaimWorkComp.AccidentPremises
    }
    
    // 'value' attribute on TextInput (id=MainContact) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 500, column 40
    function value_250 () : dynamic.Dynamic {
      return Snapshot.MainContact.DisplayName
    }
    
    // 'value' attribute on TextInput (id=MainContactType) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 505, column 40
    function value_253 () : dynamic.Dynamic {
      return Snapshot.MainContactType
    }
    
    // 'value' attribute on DateInput (id=ReportedDate) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 512, column 40
    function value_256 () : dynamic.Dynamic {
      return Snapshot.ReportedDate
    }
    
    // 'value' attribute on BooleanRadioInput (id=FirstNoticeSuit) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 517, column 40
    function value_259 () : dynamic.Dynamic {
      return Snapshot.FirstNoticeSuit
    }
    
    // 'value' attribute on DateInput (id=DateRptdToEmployer) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 524, column 40
    function value_262 () : dynamic.Dynamic {
      return Snapshot.DateRptdToEmployer
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPanelSet.wc.pcf: line 537, column 43
    function value_277 () : dynamic.Dynamic {
      return Snapshot.Officials
    }
    
    // 'value' attribute on DateInput (id=CreateTime) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 565, column 40
    function value_278 () : dynamic.Dynamic {
      return Snapshot.CreateTime
    }
    
    // 'value' attribute on TextInput (id=JurisdictionState) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 80, column 40
    function value_28 () : dynamic.Dynamic {
      return Snapshot.JurisdictionState
    }
    
    // 'value' attribute on TextInput (id=ValidationLevel) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 570, column 40
    function value_281 () : dynamic.Dynamic {
      return Snapshot.ValidationLevel
    }
    
    // 'value' attribute on TextInput (id=LOBCode) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 28, column 40
    function value_3 () : dynamic.Dynamic {
      return Snapshot.LOBCode
    }
    
    // 'value' attribute on TextInput (id=InjuryDescription) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 88, column 40
    function value_31 () : dynamic.Dynamic {
      return Snapshot.ClaimInjuryIncident.Description
    }
    
    // 'value' attribute on BooleanRadioInput (id=IncidentReport) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 93, column 40
    function value_34 () : dynamic.Dynamic {
      return Snapshot.IncidentReport
    }
    
    // 'value' attribute on BooleanRadioInput (id=MedicalReport) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 98, column 40
    function value_37 () : dynamic.Dynamic {
      return Snapshot.MedicalReport
    }
    
    // 'value' attribute on BooleanRadioInput (id=TimeLossReport) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 103, column 40
    function value_40 () : dynamic.Dynamic {
      return Snapshot.TimeLossReport
    }
    
    // 'value' attribute on BooleanRadioInput (id=DeathReport) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 108, column 40
    function value_43 () : dynamic.Dynamic {
      return Snapshot.DeathReport
    }
    
    // 'value' attribute on TextInput (id=DeathDate) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 113, column 40
    function value_46 () : dynamic.Dynamic {
      return Snapshot.DeathDate
    }
    
    // 'value' attribute on TextInput (id=Severity) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 118, column 40
    function value_49 () : dynamic.Dynamic {
      return Snapshot.ClaimInjuryIncident.Severity
    }
    
    // 'value' attribute on TextInput (id=LossCause) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 123, column 40
    function value_52 () : dynamic.Dynamic {
      return Snapshot.LossCause
    }
    
    // 'value' attribute on TextInput (id=AccidentType) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 128, column 40
    function value_55 () : dynamic.Dynamic {
      return Snapshot.AccidentType
    }
    
    // 'value' attribute on TextInput (id=PrimaryInjury) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 133, column 40
    function value_58 () : dynamic.Dynamic {
      return Snapshot.ClaimInjuryIncident.GeneralInjuryType
    }
    
    // 'value' attribute on TextInput (id=LocationCode) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 32, column 69
    function value_6 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.LocationCode)
    }
    
    // 'value' attribute on TextInput (id=DetailedInjury) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 138, column 40
    function value_61 () : dynamic.Dynamic {
      return Snapshot.ClaimInjuryIncident.DetailedInjuryType
    }
    
    // 'value' attribute on TextInput (id=Catastrophe) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 37, column 40
    function value_8 () : dynamic.Dynamic {
      return Snapshot.Catastrophe.DisplayName
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPanelSet.wc.pcf: line 150, column 43
    function value_88 () : dynamic.Dynamic {
      return Snapshot.ClaimInjuryIncident.BodyParts
    }
    
    // 'value' attribute on TextInput (id=MedCase_FirstIntakeDoctor) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 196, column 40
    function value_89 () : dynamic.Dynamic {
      return Snapshot.FirstIntakeDoctor.DisplayName
    }
    
    // 'value' attribute on TextInput (id=MedCase_MedicalDiagnosis) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 201, column 40
    function value_92 () : dynamic.Dynamic {
      return Snapshot.MedicalDiagnosis
    }
    
    // 'value' attribute on DateInput (id=MedCase_ExaminationDate) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 207, column 40
    function value_95 () : dynamic.Dynamic {
      return Snapshot.ExaminationDate
    }
    
    // 'value' attribute on TextInput (id=MedCase_InitialTreatment) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 212, column 40
    function value_98 () : dynamic.Dynamic {
      return Snapshot.ClaimWorkComp.InitialTreatment
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get Snapshot () : dynamic.Dynamic {
      return getRequireValue("Snapshot", 0) as dynamic.Dynamic
    }
    
    property set Snapshot ($arg :  dynamic.Dynamic) {
      setRequireValue("Snapshot", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/default/ClaimSnapshotGeneralPanelSet.wc.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends ClaimSnapshotGeneralPanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=CompanyName) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 419, column 48
    function valueRoot_215 () : java.lang.Object {
      return ConcurrentEmpl
    }
    
    // 'value' attribute on TextCell (id=CompanyName) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 419, column 48
    function value_213 () : dynamic.Dynamic {
      return ConcurrentEmpl.CompanyName
    }
    
    // 'value' attribute on TextCell (id=StartDate) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 423, column 80
    function value_216 () : java.lang.String {
      return util.Snapshot.renderValue(ConcurrentEmpl.StartDate)
    }
    
    // 'value' attribute on TextCell (id=EndDate) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 427, column 78
    function value_218 () : java.lang.String {
      return util.Snapshot.renderValue(ConcurrentEmpl.EndDate)
    }
    
    // 'value' attribute on TextCell (id=FullTime) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 431, column 79
    function value_220 () : java.lang.String {
      return util.Snapshot.renderValue(ConcurrentEmpl.FullTime)
    }
    
    // 'value' attribute on TextCell (id=WeeklyWage) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 436, column 48
    function value_222 () : dynamic.Dynamic {
      return ConcurrentEmpl.WeeklyWage
    }
    
    // 'value' attribute on TextCell (id=JobTitle) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 441, column 48
    function value_225 () : dynamic.Dynamic {
      return ConcurrentEmpl.JobTitle
    }
    
    // 'value' attribute on TextCell (id=ContactNumber) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 446, column 48
    function value_228 () : dynamic.Dynamic {
      return ConcurrentEmpl.ContactNumber
    }
    
    property get ConcurrentEmpl () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/default/ClaimSnapshotGeneralPanelSet.wc.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry3ExpressionsImpl extends ClaimSnapshotGeneralPanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Status) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 473, column 48
    function valueRoot_239 () : java.lang.Object {
      return WorkStatusChange
    }
    
    // 'value' attribute on TextCell (id=StatusDate) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 468, column 83
    function value_235 () : java.lang.String {
      return util.Snapshot.renderValue(WorkStatusChange.StatusDate)
    }
    
    // 'value' attribute on TextCell (id=Status) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 473, column 48
    function value_237 () : dynamic.Dynamic {
      return WorkStatusChange.Status
    }
    
    // 'value' attribute on TextCell (id=Comments) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 478, column 48
    function value_240 () : dynamic.Dynamic {
      return WorkStatusChange.Comments
    }
    
    property get WorkStatusChange () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/default/ClaimSnapshotGeneralPanelSet.wc.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry4ExpressionsImpl extends ClaimSnapshotGeneralPanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Type) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 543, column 48
    function valueRoot_270 () : java.lang.Object {
      return Official
    }
    
    // 'value' attribute on TextCell (id=Type) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 543, column 48
    function value_268 () : dynamic.Dynamic {
      return Official.OfficialType
    }
    
    // 'value' attribute on TextCell (id=Name) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 548, column 48
    function value_271 () : dynamic.Dynamic {
      return Official.Name
    }
    
    // 'value' attribute on TextCell (id=ReportNumber) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 553, column 48
    function value_274 () : dynamic.Dynamic {
      return Official.ReportNumber
    }
    
    property get Official () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/default/ClaimSnapshotGeneralPanelSet.wc.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotGeneralPanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Ordering) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 158, column 36
    function valueRoot_72 () : java.lang.Object {
      return BodyPart
    }
    
    // 'value' attribute on TextCell (id=Ordering) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 158, column 36
    function value_70 () : dynamic.Dynamic {
      return BodyPart.Ordering
    }
    
    // 'value' attribute on TextCell (id=PrimaryBodyPart) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 163, column 48
    function value_73 () : dynamic.Dynamic {
      return BodyPart.PrimaryBodyPart
    }
    
    // 'value' attribute on TextCell (id=DetailedBodyPart) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 168, column 48
    function value_76 () : dynamic.Dynamic {
      return BodyPart.DetailedBodyPart
    }
    
    // 'value' attribute on TextCell (id=BodyPartDescription) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 173, column 48
    function value_79 () : dynamic.Dynamic {
      return BodyPart.DetailedBodyPartDesc
    }
    
    // 'value' attribute on TextCell (id=BodyPartSide) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 178, column 48
    function value_82 () : dynamic.Dynamic {
      return BodyPart.SideOfBody
    }
    
    // 'value' attribute on TextCell (id=PermamentImpairmentPercentage) at ClaimSnapshotGeneralPanelSet.wc.pcf: line 184, column 48
    function value_85 () : dynamic.Dynamic {
      return BodyPart.ImpairmentPercentage
    }
    
    property get BodyPart () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}