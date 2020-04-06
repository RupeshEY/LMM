package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotGeneral400DV.wc.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotGeneral400DV_wcExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotGeneral400DV.wc.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotGeneral400DVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'encryptionExpression' attribute on PrivacyInput (id=TaxID) at ClaimSnapshotGeneral400DV.wc.pcf: line 82, column 38
    function encryptionExpression_33 (VALUE :  dynamic.Dynamic) : java.lang.String {
      return gw.api.privacy.EncryptionMaskExpressions.maskTaxId(VALUE as String)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral400DV.wc.pcf: line 421, column 46
    function sortValue_208 (ConcurrentEmpl :  dynamic.Dynamic) : java.lang.Object {
      return ConcurrentEmpl.CompanyName
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral400DV.wc.pcf: line 425, column 78
    function sortValue_209 (ConcurrentEmpl :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(ConcurrentEmpl.StartDate)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral400DV.wc.pcf: line 429, column 76
    function sortValue_210 (ConcurrentEmpl :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(ConcurrentEmpl.EndDate)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral400DV.wc.pcf: line 433, column 77
    function sortValue_211 (ConcurrentEmpl :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(ConcurrentEmpl.FullTime)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral400DV.wc.pcf: line 438, column 46
    function sortValue_212 (ConcurrentEmpl :  dynamic.Dynamic) : java.lang.Object {
      return ConcurrentEmpl.WeeklyWage
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral400DV.wc.pcf: line 443, column 46
    function sortValue_213 (ConcurrentEmpl :  dynamic.Dynamic) : java.lang.Object {
      return ConcurrentEmpl.JobTitle
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral400DV.wc.pcf: line 465, column 81
    function sortValue_230 (WorkStatusChange :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(WorkStatusChange.StatusDate)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral400DV.wc.pcf: line 470, column 46
    function sortValue_231 (WorkStatusChange :  dynamic.Dynamic) : java.lang.Object {
      return WorkStatusChange.Status
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral400DV.wc.pcf: line 475, column 46
    function sortValue_232 (WorkStatusChange :  dynamic.Dynamic) : java.lang.Object {
      return WorkStatusChange.Comments
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral400DV.wc.pcf: line 644, column 46
    function sortValue_317 (Official :  dynamic.Dynamic) : java.lang.Object {
      return Official.OfficialType
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral400DV.wc.pcf: line 649, column 46
    function sortValue_318 (Official :  dynamic.Dynamic) : java.lang.Object {
      return Official.Name
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral400DV.wc.pcf: line 654, column 46
    function sortValue_319 (Official :  dynamic.Dynamic) : java.lang.Object {
      return Official.ReportNumber
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral400DV.wc.pcf: line 691, column 46
    function sortValue_336 (OtherBenefit :  dynamic.Dynamic) : java.lang.Object {
      return OtherBenefit.ReferenceNumber
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral400DV.wc.pcf: line 696, column 46
    function sortValue_337 (OtherBenefit :  dynamic.Dynamic) : java.lang.Object {
      return OtherBenefit.Amount
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral400DV.wc.pcf: line 700, column 76
    function sortValue_338 (OtherBenefit :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(OtherBenefit.StartDate)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral400DV.wc.pcf: line 704, column 74
    function sortValue_339 (OtherBenefit :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(OtherBenefit.EndDate)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral400DV.wc.pcf: line 709, column 46
    function sortValue_340 (OtherBenefit :  dynamic.Dynamic) : java.lang.Object {
      return OtherBenefit.InitialContact
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral400DV.wc.pcf: line 714, column 46
    function sortValue_341 (OtherBenefit :  dynamic.Dynamic) : java.lang.Object {
      return OtherBenefit.Comments
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral400DV.wc.pcf: line 736, column 46
    function sortValue_359 (MetroReport :  dynamic.Dynamic) : java.lang.Object {
      return MetroReport.MetroReportType
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral400DV.wc.pcf: line 741, column 46
    function sortValue_360 (MetroReport :  dynamic.Dynamic) : java.lang.Object {
      return MetroReport.Status
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral400DV.wc.pcf: line 746, column 46
    function sortValue_361 (MetroReport :  dynamic.Dynamic) : java.lang.Object {
      return MetroReport.CreateTime
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral400DV.wc.pcf: line 185, column 46
    function sortValue_78 (BodyPart :  dynamic.Dynamic) : java.lang.Object {
      return BodyPart.PrimaryBodyPart
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral400DV.wc.pcf: line 190, column 46
    function sortValue_79 (BodyPart :  dynamic.Dynamic) : java.lang.Object {
      return BodyPart.DetailedBodyPart
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral400DV.wc.pcf: line 195, column 46
    function sortValue_80 (BodyPart :  dynamic.Dynamic) : java.lang.Object {
      return BodyPart.Compensability
    }
    
    // 'value' attribute on TextInput (id=Catastrophe) at ClaimSnapshotGeneral400DV.wc.pcf: line 36, column 38
    function valueRoot_11 () : java.lang.Object {
      return Snapshot.Catastrophe
    }
    
    // 'value' attribute on TextInput (id=MedCase_Hospital) at ClaimSnapshotGeneral400DV.wc.pcf: line 263, column 38
    function valueRoot_126 () : java.lang.Object {
      return Snapshot.Hospital
    }
    
    // 'value' attribute on TextInput (id=DepartmentCode) at ClaimSnapshotGeneral400DV.wc.pcf: line 304, column 38
    function valueRoot_148 () : java.lang.Object {
      return Snapshot.EmploymentData
    }
    
    // 'value' attribute on TextInput (id=Supervisor) at ClaimSnapshotGeneral400DV.wc.pcf: line 326, column 38
    function valueRoot_160 () : java.lang.Object {
      return Snapshot.Supervisor
    }
    
    // 'value' attribute on TextInput (id=LossType) at ClaimSnapshotGeneral400DV.wc.pcf: line 21, column 38
    function valueRoot_2 () : java.lang.Object {
      return Snapshot
    }
    
    // 'value' attribute on TextInput (id=Claimant) at ClaimSnapshotGeneral400DV.wc.pcf: line 58, column 38
    function valueRoot_20 () : java.lang.Object {
      return Snapshot.Claimant
    }
    
    // 'value' attribute on TextInput (id=Reporter) at ClaimSnapshotGeneral400DV.wc.pcf: line 514, column 38
    function valueRoot_256 () : java.lang.Object {
      return Snapshot.Reporter
    }
    
    // 'value' attribute on TextInput (id=MainContact) at ClaimSnapshotGeneral400DV.wc.pcf: line 524, column 38
    function valueRoot_262 () : java.lang.Object {
      return Snapshot.MainContact
    }
    
    // 'value' attribute on TextInput (id=PrimaryAddress) at ClaimSnapshotGeneral400DV.wc.pcf: line 72, column 38
    function valueRoot_27 () : java.lang.Object {
      return Snapshot.Claimant.PrimaryAddress
    }
    
    // 'value' attribute on TextInput (id=LossLocation) at ClaimSnapshotGeneral400DV.wc.pcf: line 585, column 38
    function valueRoot_292 () : java.lang.Object {
      return Snapshot.LossLocation
    }
    
    // 'value' attribute on TextInput (id=NurseCaseMgr) at ClaimSnapshotGeneral400DV.wc.pcf: line 31, column 38
    function valueRoot_8 () : java.lang.Object {
      return Snapshot.NurseCaseMgr
    }
    
    // 'value' attribute on TextInput (id=MedCase_FirstIntakeDoctor) at ClaimSnapshotGeneral400DV.wc.pcf: line 207, column 38
    function valueRoot_93 () : java.lang.Object {
      return Snapshot.FirstIntakeDoctor
    }
    
    // 'value' attribute on TextInput (id=LossType) at ClaimSnapshotGeneral400DV.wc.pcf: line 21, column 38
    function value_0 () : dynamic.Dynamic {
      return Snapshot.LossType
    }
    
    // 'value' attribute on BooleanRadioInput (id=MedCase_TreatedPatientBefore) at ClaimSnapshotGeneral400DV.wc.pcf: line 223, column 38
    function value_100 () : dynamic.Dynamic {
      return Snapshot.TreatedPatientBfr
    }
    
    // 'value' attribute on TextAreaInput (id=MedCase_SubjComplaints) at ClaimSnapshotGeneral400DV.wc.pcf: line 228, column 38
    function value_103 () : dynamic.Dynamic {
      return Snapshot.SubjComplaints
    }
    
    // 'value' attribute on TextAreaInput (id=MedCase_ObjFindings) at ClaimSnapshotGeneral400DV.wc.pcf: line 233, column 38
    function value_106 () : dynamic.Dynamic {
      return Snapshot.ObjFindings
    }
    
    // 'value' attribute on BooleanRadioInput (id=MedCase_DiagnosticConsistent) at ClaimSnapshotGeneral400DV.wc.pcf: line 238, column 38
    function value_109 () : dynamic.Dynamic {
      return Snapshot.DiagnosticCnsistnt
    }
    
    // 'value' attribute on BooleanRadioInput (id=MedCase_CurrentConditions) at ClaimSnapshotGeneral400DV.wc.pcf: line 243, column 38
    function value_112 () : dynamic.Dynamic {
      return Snapshot.CurrentConditions
    }
    
    // 'value' attribute on TextInput (id=MedCase_MedicalTreatment) at ClaimSnapshotGeneral400DV.wc.pcf: line 248, column 38
    function value_115 () : dynamic.Dynamic {
      return Snapshot.MedicalTreatmentType
    }
    
    // 'value' attribute on TextAreaInput (id=MedCase_TreatmentRend) at ClaimSnapshotGeneral400DV.wc.pcf: line 253, column 38
    function value_118 () : dynamic.Dynamic {
      return Snapshot.TreatmentRend
    }
    
    // 'value' attribute on TextInput (id=PermissionRequired) at ClaimSnapshotGeneral400DV.wc.pcf: line 41, column 38
    function value_12 () : dynamic.Dynamic {
      return Snapshot.PermissionRequired
    }
    
    // 'value' attribute on BooleanRadioInput (id=MedCase_FurtherTreatment) at ClaimSnapshotGeneral400DV.wc.pcf: line 258, column 38
    function value_121 () : dynamic.Dynamic {
      return Snapshot.FurtherTreatment
    }
    
    // 'value' attribute on TextInput (id=MedCase_Hospital) at ClaimSnapshotGeneral400DV.wc.pcf: line 263, column 38
    function value_124 () : dynamic.Dynamic {
      return Snapshot.Hospital.DisplayName
    }
    
    // 'value' attribute on DateInput (id=MedCase_HospitalDate) at ClaimSnapshotGeneral400DV.wc.pcf: line 269, column 38
    function value_127 () : dynamic.Dynamic {
      return Snapshot.HospitalDate
    }
    
    // 'value' attribute on TextInput (id=MedCase_HospitalDays) at ClaimSnapshotGeneral400DV.wc.pcf: line 274, column 38
    function value_130 () : dynamic.Dynamic {
      return Snapshot.HospitalDays
    }
    
    // 'value' attribute on BooleanRadioInput (id=MedCase_PreexDisability) at ClaimSnapshotGeneral400DV.wc.pcf: line 279, column 38
    function value_133 () : dynamic.Dynamic {
      return Snapshot.PreexDisblty
    }
    
    // 'value' attribute on TextInput (id=MedCase_PreexDisabilityInfo) at ClaimSnapshotGeneral400DV.wc.pcf: line 285, column 42
    function value_137 () : dynamic.Dynamic {
      return Snapshot.PreexDisbltyInfo
    }
    
    // 'value' attribute on TextInput (id=Occupation) at ClaimSnapshotGeneral400DV.wc.pcf: line 295, column 38
    function value_141 () : dynamic.Dynamic {
      return Snapshot.Claimant.Occupation
    }
    
    // 'value' attribute on TextInput (id=EmpClass) at ClaimSnapshotGeneral400DV.wc.pcf: line 299, column 78
    function value_144 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.EmploymentData.EmpClass)
    }
    
    // 'value' attribute on TextInput (id=DepartmentCode) at ClaimSnapshotGeneral400DV.wc.pcf: line 304, column 38
    function value_146 () : dynamic.Dynamic {
      return Snapshot.EmploymentData.DepartmentCode
    }
    
    // 'value' attribute on DateInput (id=HireDate) at ClaimSnapshotGeneral400DV.wc.pcf: line 311, column 38
    function value_149 () : dynamic.Dynamic {
      return Snapshot.EmploymentData.HireDate
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at ClaimSnapshotGeneral400DV.wc.pcf: line 50, column 38
    function value_15 () : dynamic.Dynamic {
      return Snapshot.Description
    }
    
    // 'value' attribute on TextInput (id=HireState) at ClaimSnapshotGeneral400DV.wc.pcf: line 316, column 38
    function value_152 () : dynamic.Dynamic {
      return Snapshot.EmploymentData.HireState
    }
    
    // 'value' attribute on TextInput (id=EmploymentStatus) at ClaimSnapshotGeneral400DV.wc.pcf: line 321, column 38
    function value_155 () : dynamic.Dynamic {
      return Snapshot.EmploymentData.EmploymentStatus
    }
    
    // 'value' attribute on TextInput (id=Supervisor) at ClaimSnapshotGeneral400DV.wc.pcf: line 326, column 38
    function value_158 () : dynamic.Dynamic {
      return Snapshot.Supervisor.DisplayName
    }
    
    // 'value' attribute on TextInput (id=NumDaysWorked) at ClaimSnapshotGeneral400DV.wc.pcf: line 331, column 38
    function value_161 () : dynamic.Dynamic {
      return Snapshot.EmploymentData.NumDaysWorked
    }
    
    // 'value' attribute on TextInput (id=NumHoursWorked) at ClaimSnapshotGeneral400DV.wc.pcf: line 336, column 38
    function value_164 () : dynamic.Dynamic {
      return Snapshot.EmploymentData.NumHoursWorked
    }
    
    // 'value' attribute on TextInput (id=WageAmount) at ClaimSnapshotGeneral400DV.wc.pcf: line 341, column 38
    function value_167 () : dynamic.Dynamic {
      return Snapshot.EmploymentData.WageAmount
    }
    
    // 'value' attribute on TextInput (id=PayPeriod) at ClaimSnapshotGeneral400DV.wc.pcf: line 346, column 38
    function value_170 () : dynamic.Dynamic {
      return Snapshot.EmploymentData.PayPeriod
    }
    
    // 'value' attribute on DateInput (id=InjuryStartTime) at ClaimSnapshotGeneral400DV.wc.pcf: line 352, column 38
    function value_173 () : dynamic.Dynamic {
      return Snapshot.EmploymentData.InjuryStartTime
    }
    
    // 'value' attribute on BooleanRadioInput (id=PaidFull) at ClaimSnapshotGeneral400DV.wc.pcf: line 357, column 38
    function value_176 () : dynamic.Dynamic {
      return Snapshot.EmploymentData.PaidFull
    }
    
    // 'value' attribute on BooleanRadioInput (id=WagePaymentCont) at ClaimSnapshotGeneral400DV.wc.pcf: line 362, column 38
    function value_179 () : dynamic.Dynamic {
      return Snapshot.EmploymentData.WagePaymentCont
    }
    
    // 'value' attribute on TextInput (id=Claimant) at ClaimSnapshotGeneral400DV.wc.pcf: line 58, column 38
    function value_18 () : dynamic.Dynamic {
      return Snapshot.Claimant.DisplayName
    }
    
    // 'value' attribute on BooleanRadioInput (id=ModifiedDutyAvail) at ClaimSnapshotGeneral400DV.wc.pcf: line 367, column 38
    function value_182 () : dynamic.Dynamic {
      return Snapshot.ModifiedDutyAvail
    }
    
    // 'value' attribute on BooleanRadioInput (id=InjuredRegularJob) at ClaimSnapshotGeneral400DV.wc.pcf: line 372, column 38
    function value_185 () : dynamic.Dynamic {
      return Snapshot.InjuredRegularJob
    }
    
    // 'value' attribute on TextInput (id=EmpQusValidity) at ClaimSnapshotGeneral400DV.wc.pcf: line 377, column 38
    function value_188 () : dynamic.Dynamic {
      return Snapshot.EmpQusValidity
    }
    
    // 'value' attribute on TextInput (id=EmployerValidityReason) at ClaimSnapshotGeneral400DV.wc.pcf: line 383, column 73
    function value_192 () : dynamic.Dynamic {
      return Snapshot.EmployerValidityReason
    }
    
    // 'value' attribute on TextInput (id=DrugsInvolved) at ClaimSnapshotGeneral400DV.wc.pcf: line 388, column 38
    function value_196 () : dynamic.Dynamic {
      return Snapshot.DrugsInvolved
    }
    
    // 'value' attribute on BooleanRadioInput (id=SafetyEquipProv) at ClaimSnapshotGeneral400DV.wc.pcf: line 393, column 38
    function value_199 () : dynamic.Dynamic {
      return Snapshot.SafetyEquipProv
    }
    
    // 'value' attribute on BooleanRadioInput (id=SafetyEquipUsed) at ClaimSnapshotGeneral400DV.wc.pcf: line 398, column 38
    function value_202 () : dynamic.Dynamic {
      return Snapshot.SafetyEquipUsed
    }
    
    // 'value' attribute on TextInput (id=ConcurrentEmployment) at ClaimSnapshotGeneral400DV.wc.pcf: line 403, column 38
    function value_205 () : dynamic.Dynamic {
      return Snapshot.ConcurrentEmp
    }
    
    // 'value' attribute on BooleanRadioInput (id=ContactProhibited) at ClaimSnapshotGeneral400DV.wc.pcf: line 63, column 38
    function value_21 () : dynamic.Dynamic {
      return util.Snapshot.getClaimant(Snapshot, null)["ContactProhibited"]
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral400DV.wc.pcf: line 415, column 41
    function value_229 () : dynamic.Dynamic {
      return Snapshot.ConcurrentEmpl
    }
    
    // 'value' attribute on TextInput (id=PrimaryPhone) at ClaimSnapshotGeneral400DV.wc.pcf: line 67, column 67
    function value_23 () : java.lang.String {
      return util.Snapshot.getPrimaryPhone(Snapshot.Claimant)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral400DV.wc.pcf: line 460, column 41
    function value_241 () : dynamic.Dynamic {
      return Snapshot.EmploymentData.WorkStatusChanges
    }
    
    // 'value' attribute on DateInput (id=DateCompDcsnDue) at ClaimSnapshotGeneral400DV.wc.pcf: line 488, column 38
    function value_242 () : dynamic.Dynamic {
      return Snapshot.DateCompDcsnDue
    }
    
    // 'value' attribute on BooleanRadioInput (id=BenefitsStatusDcsn) at ClaimSnapshotGeneral400DV.wc.pcf: line 493, column 38
    function value_245 () : dynamic.Dynamic {
      return Snapshot.BenefitsStatusDcsn
    }
    
    // 'value' attribute on DateInput (id=DateCompDcsnMade) at ClaimSnapshotGeneral400DV.wc.pcf: line 499, column 38
    function value_248 () : dynamic.Dynamic {
      return Snapshot.DateCompDcsnMade
    }
    
    // 'value' attribute on TextInput (id=PrimaryAddress) at ClaimSnapshotGeneral400DV.wc.pcf: line 72, column 38
    function value_25 () : dynamic.Dynamic {
      return Snapshot.Claimant.PrimaryAddress.DisplayName
    }
    
    // 'value' attribute on TextAreaInput (id=Reason) at ClaimSnapshotGeneral400DV.wc.pcf: line 506, column 38
    function value_251 () : dynamic.Dynamic {
      return Snapshot.BenefitsDecisionReason
    }
    
    // 'value' attribute on TextInput (id=Reporter) at ClaimSnapshotGeneral400DV.wc.pcf: line 514, column 38
    function value_254 () : dynamic.Dynamic {
      return Snapshot.Reporter.DisplayName
    }
    
    // 'value' attribute on TextInput (id=ReportedByType) at ClaimSnapshotGeneral400DV.wc.pcf: line 519, column 38
    function value_257 () : dynamic.Dynamic {
      return Snapshot.ReportedByType
    }
    
    // 'value' attribute on TextInput (id=MainContact) at ClaimSnapshotGeneral400DV.wc.pcf: line 524, column 38
    function value_260 () : dynamic.Dynamic {
      return Snapshot.MainContact.DisplayName
    }
    
    // 'value' attribute on TextInput (id=MainContactType) at ClaimSnapshotGeneral400DV.wc.pcf: line 529, column 38
    function value_263 () : dynamic.Dynamic {
      return Snapshot.MainContactType
    }
    
    // 'value' attribute on DateInput (id=ReportedDate) at ClaimSnapshotGeneral400DV.wc.pcf: line 536, column 38
    function value_266 () : dynamic.Dynamic {
      return Snapshot.ReportedDate
    }
    
    // 'value' attribute on BooleanRadioInput (id=FirstNoticeSuit) at ClaimSnapshotGeneral400DV.wc.pcf: line 541, column 38
    function value_269 () : dynamic.Dynamic {
      return Snapshot.FirstNoticeSuit
    }
    
    // 'value' attribute on TextInput (id=HowReported) at ClaimSnapshotGeneral400DV.wc.pcf: line 546, column 38
    function value_272 () : dynamic.Dynamic {
      return Snapshot.HowReported
    }
    
    // 'value' attribute on BooleanRadioInput (id=CoverageInQuestion) at ClaimSnapshotGeneral400DV.wc.pcf: line 551, column 38
    function value_275 () : dynamic.Dynamic {
      return Snapshot.CoverageInQuestion
    }
    
    // 'value' attribute on DateInput (id=ClaimantRprtdDate) at ClaimSnapshotGeneral400DV.wc.pcf: line 558, column 38
    function value_278 () : dynamic.Dynamic {
      return Snapshot.ClaimantRprtdDate
    }
    
    // 'value' attribute on TextInput (id=DateOfBirth) at ClaimSnapshotGeneral400DV.wc.pcf: line 76, column 74
    function value_28 () : java.lang.String {
      return util.Snapshot.renderDate(Snapshot.Claimant.DateOfBirth)
    }
    
    // 'value' attribute on DateInput (id=DateRptdToEmployer) at ClaimSnapshotGeneral400DV.wc.pcf: line 565, column 38
    function value_281 () : dynamic.Dynamic {
      return Snapshot.DateRptdToEmployer
    }
    
    // 'value' attribute on DateInput (id=DateFormGivenToEmp) at ClaimSnapshotGeneral400DV.wc.pcf: line 571, column 38
    function value_284 () : dynamic.Dynamic {
      return Snapshot.DateFormGivenToEmp
    }
    
    // 'value' attribute on DateInput (id=DateFormRetByEmp) at ClaimSnapshotGeneral400DV.wc.pcf: line 577, column 38
    function value_287 () : dynamic.Dynamic {
      return Snapshot.DateFormRetByEmp
    }
    
    // 'value' attribute on TextInput (id=LossLocation) at ClaimSnapshotGeneral400DV.wc.pcf: line 585, column 38
    function value_290 () : dynamic.Dynamic {
      return Snapshot.LossLocation.DisplayName
    }
    
    // 'value' attribute on TextInput (id=AddressLine1) at ClaimSnapshotGeneral400DV.wc.pcf: line 590, column 38
    function value_293 () : dynamic.Dynamic {
      return Snapshot.LossLocation.AddressLine1
    }
    
    // 'value' attribute on TextInput (id=AddressLine2) at ClaimSnapshotGeneral400DV.wc.pcf: line 595, column 38
    function value_296 () : dynamic.Dynamic {
      return Snapshot.LossLocation.AddressLine2
    }
    
    // 'value' attribute on TextInput (id=City) at ClaimSnapshotGeneral400DV.wc.pcf: line 600, column 38
    function value_299 () : dynamic.Dynamic {
      return Snapshot.LossLocation.City
    }
    
    // 'value' attribute on TextInput (id=LOBCode) at ClaimSnapshotGeneral400DV.wc.pcf: line 26, column 38
    function value_3 () : dynamic.Dynamic {
      return Snapshot.LOBCode
    }
    
    // 'value' attribute on PrivacyInput (id=TaxID) at ClaimSnapshotGeneral400DV.wc.pcf: line 82, column 38
    function value_30 () : dynamic.Dynamic {
      return Snapshot.Claimant.TaxID
    }
    
    // 'value' attribute on TextInput (id=State) at ClaimSnapshotGeneral400DV.wc.pcf: line 605, column 38
    function value_302 () : dynamic.Dynamic {
      return Snapshot.LossLocation.State
    }
    
    // 'value' attribute on TextInput (id=PostalCode) at ClaimSnapshotGeneral400DV.wc.pcf: line 610, column 38
    function value_305 () : dynamic.Dynamic {
      return Snapshot.LossLocation.PostalCode
    }
    
    // 'value' attribute on TextInput (id=County) at ClaimSnapshotGeneral400DV.wc.pcf: line 615, column 38
    function value_308 () : dynamic.Dynamic {
      return Snapshot.LossLocation.County
    }
    
    // 'value' attribute on TextInput (id=Country) at ClaimSnapshotGeneral400DV.wc.pcf: line 620, column 38
    function value_311 () : dynamic.Dynamic {
      return Snapshot.LossLocation.Country
    }
    
    // 'value' attribute on TextInput (id=LocationDescription) at ClaimSnapshotGeneral400DV.wc.pcf: line 625, column 38
    function value_314 () : dynamic.Dynamic {
      return Snapshot.LossLocation.Description
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral400DV.wc.pcf: line 638, column 41
    function value_329 () : dynamic.Dynamic {
      return Snapshot.Officials
    }
    
    // 'value' attribute on DateInput (id=CreateTime) at ClaimSnapshotGeneral400DV.wc.pcf: line 666, column 38
    function value_330 () : dynamic.Dynamic {
      return Snapshot.CreateTime
    }
    
    // 'value' attribute on TextInput (id=ValidationLevel) at ClaimSnapshotGeneral400DV.wc.pcf: line 671, column 38
    function value_333 () : dynamic.Dynamic {
      return Snapshot.ValidationLevel
    }
    
    // 'value' attribute on DateInput (id=DateOfInjury) at ClaimSnapshotGeneral400DV.wc.pcf: line 92, column 38
    function value_34 () : dynamic.Dynamic {
      return Snapshot.LossDate
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral400DV.wc.pcf: line 685, column 41
    function value_358 () : dynamic.Dynamic {
      return Snapshot.OtherBenefits
    }
    
    // 'value' attribute on DateInput (id=ExposureBegan) at ClaimSnapshotGeneral400DV.wc.pcf: line 99, column 38
    function value_37 () : dynamic.Dynamic {
      return Snapshot.ExposureBegan
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral400DV.wc.pcf: line 730, column 41
    function value_371 () : dynamic.Dynamic {
      return Snapshot.MetroReports
    }
    
    // 'value' attribute on DateInput (id=ExposureEnded) at ClaimSnapshotGeneral400DV.wc.pcf: line 106, column 38
    function value_40 () : dynamic.Dynamic {
      return Snapshot.ExposureEnded
    }
    
    // 'value' attribute on BooleanRadioInput (id=EmploymentInjury) at ClaimSnapshotGeneral400DV.wc.pcf: line 111, column 38
    function value_43 () : dynamic.Dynamic {
      return Snapshot.EmploymentInjury
    }
    
    // 'value' attribute on TextInput (id=LocationCode) at ClaimSnapshotGeneral400DV.wc.pcf: line 115, column 67
    function value_46 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.LocationCode)
    }
    
    // 'value' attribute on TextInput (id=JurisdictionState) at ClaimSnapshotGeneral400DV.wc.pcf: line 120, column 38
    function value_48 () : dynamic.Dynamic {
      return Snapshot.JurisdictionState
    }
    
    // 'value' attribute on BooleanRadioInput (id=InsuredPremises) at ClaimSnapshotGeneral400DV.wc.pcf: line 125, column 38
    function value_51 () : dynamic.Dynamic {
      return Snapshot.InsuredPremises
    }
    
    // 'value' attribute on TextInput (id=Severity) at ClaimSnapshotGeneral400DV.wc.pcf: line 130, column 38
    function value_54 () : dynamic.Dynamic {
      return Snapshot.Severity
    }
    
    // 'value' attribute on TextInput (id=LossCause) at ClaimSnapshotGeneral400DV.wc.pcf: line 138, column 38
    function value_57 () : dynamic.Dynamic {
      return Snapshot.LossCause
    }
    
    // 'value' attribute on TextInput (id=NurseCaseMgr) at ClaimSnapshotGeneral400DV.wc.pcf: line 31, column 38
    function value_6 () : dynamic.Dynamic {
      return Snapshot.NurseCaseMgr.DisplayName
    }
    
    // 'value' attribute on TextInput (id=AccidentType) at ClaimSnapshotGeneral400DV.wc.pcf: line 143, column 38
    function value_60 () : dynamic.Dynamic {
      return Snapshot.AccidentType
    }
    
    // 'value' attribute on TextInput (id=PrimaryInjury) at ClaimSnapshotGeneral400DV.wc.pcf: line 148, column 38
    function value_63 () : dynamic.Dynamic {
      return Snapshot.PrimaryInjury
    }
    
    // 'value' attribute on TextInput (id=DetailedInjury) at ClaimSnapshotGeneral400DV.wc.pcf: line 153, column 38
    function value_66 () : dynamic.Dynamic {
      return Snapshot.DetailedInjury
    }
    
    // 'value' attribute on TextInput (id=PrimaryBodyPart) at ClaimSnapshotGeneral400DV.wc.pcf: line 158, column 38
    function value_69 () : dynamic.Dynamic {
      return Snapshot.PrimaryBodyPart
    }
    
    // 'value' attribute on TextInput (id=DetailedBodyPart) at ClaimSnapshotGeneral400DV.wc.pcf: line 163, column 38
    function value_72 () : dynamic.Dynamic {
      return Snapshot.DetailedBodyPart
    }
    
    // 'value' attribute on TextInput (id=InjuryDescription) at ClaimSnapshotGeneral400DV.wc.pcf: line 168, column 38
    function value_75 () : dynamic.Dynamic {
      return Snapshot.InjuryDescription
    }
    
    // 'value' attribute on TextInput (id=Catastrophe) at ClaimSnapshotGeneral400DV.wc.pcf: line 36, column 38
    function value_9 () : dynamic.Dynamic {
      return Snapshot.Catastrophe.DisplayName
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral400DV.wc.pcf: line 179, column 41
    function value_90 () : dynamic.Dynamic {
      return Snapshot.BodyPartDetails
    }
    
    // 'value' attribute on TextInput (id=MedCase_FirstIntakeDoctor) at ClaimSnapshotGeneral400DV.wc.pcf: line 207, column 38
    function value_91 () : dynamic.Dynamic {
      return Snapshot.FirstIntakeDoctor.DisplayName
    }
    
    // 'value' attribute on TextInput (id=MedCase_MedicalDiagnosis) at ClaimSnapshotGeneral400DV.wc.pcf: line 212, column 38
    function value_94 () : dynamic.Dynamic {
      return Snapshot.MedicalDiagnosis
    }
    
    // 'value' attribute on DateInput (id=MedCase_ExaminationDate) at ClaimSnapshotGeneral400DV.wc.pcf: line 218, column 38
    function value_97 () : dynamic.Dynamic {
      return Snapshot.ExaminationDate
    }
    
    // 'visible' attribute on TextInput (id=MedCase_PreexDisabilityInfo) at ClaimSnapshotGeneral400DV.wc.pcf: line 285, column 42
    function visible_136 () : java.lang.Boolean {
      return Snapshot.PreexDisblty
    }
    
    // 'visible' attribute on TextInput (id=EmployerValidityReason) at ClaimSnapshotGeneral400DV.wc.pcf: line 383, column 73
    function visible_191 () : java.lang.Boolean {
      return Snapshot.EmpQusValidity as String == "Yes"
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
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotGeneral400DV.wc.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends ClaimSnapshotGeneral400DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=CompanyName) at ClaimSnapshotGeneral400DV.wc.pcf: line 421, column 46
    function valueRoot_216 () : java.lang.Object {
      return ConcurrentEmpl
    }
    
    // 'value' attribute on TextCell (id=CompanyName) at ClaimSnapshotGeneral400DV.wc.pcf: line 421, column 46
    function value_214 () : dynamic.Dynamic {
      return ConcurrentEmpl.CompanyName
    }
    
    // 'value' attribute on TextCell (id=StartDate) at ClaimSnapshotGeneral400DV.wc.pcf: line 425, column 78
    function value_217 () : java.lang.String {
      return util.Snapshot.renderValue(ConcurrentEmpl.StartDate)
    }
    
    // 'value' attribute on TextCell (id=EndDate) at ClaimSnapshotGeneral400DV.wc.pcf: line 429, column 76
    function value_219 () : java.lang.String {
      return util.Snapshot.renderValue(ConcurrentEmpl.EndDate)
    }
    
    // 'value' attribute on TextCell (id=FullTime) at ClaimSnapshotGeneral400DV.wc.pcf: line 433, column 77
    function value_221 () : java.lang.String {
      return util.Snapshot.renderValue(ConcurrentEmpl.FullTime)
    }
    
    // 'value' attribute on TextCell (id=WeeklyWage) at ClaimSnapshotGeneral400DV.wc.pcf: line 438, column 46
    function value_223 () : dynamic.Dynamic {
      return ConcurrentEmpl.WeeklyWage
    }
    
    // 'value' attribute on TextCell (id=JobTitle) at ClaimSnapshotGeneral400DV.wc.pcf: line 443, column 46
    function value_226 () : dynamic.Dynamic {
      return ConcurrentEmpl.JobTitle
    }
    
    property get ConcurrentEmpl () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotGeneral400DV.wc.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry3ExpressionsImpl extends ClaimSnapshotGeneral400DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Status) at ClaimSnapshotGeneral400DV.wc.pcf: line 470, column 46
    function valueRoot_237 () : java.lang.Object {
      return WorkStatusChange
    }
    
    // 'value' attribute on TextCell (id=StatusDate) at ClaimSnapshotGeneral400DV.wc.pcf: line 465, column 81
    function value_233 () : java.lang.String {
      return util.Snapshot.renderValue(WorkStatusChange.StatusDate)
    }
    
    // 'value' attribute on TextCell (id=Status) at ClaimSnapshotGeneral400DV.wc.pcf: line 470, column 46
    function value_235 () : dynamic.Dynamic {
      return WorkStatusChange.Status
    }
    
    // 'value' attribute on TextCell (id=Comments) at ClaimSnapshotGeneral400DV.wc.pcf: line 475, column 46
    function value_238 () : dynamic.Dynamic {
      return WorkStatusChange.Comments
    }
    
    property get WorkStatusChange () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotGeneral400DV.wc.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry4ExpressionsImpl extends ClaimSnapshotGeneral400DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Type) at ClaimSnapshotGeneral400DV.wc.pcf: line 644, column 46
    function valueRoot_322 () : java.lang.Object {
      return Official
    }
    
    // 'value' attribute on TextCell (id=Type) at ClaimSnapshotGeneral400DV.wc.pcf: line 644, column 46
    function value_320 () : dynamic.Dynamic {
      return Official.OfficialType
    }
    
    // 'value' attribute on TextCell (id=Name) at ClaimSnapshotGeneral400DV.wc.pcf: line 649, column 46
    function value_323 () : dynamic.Dynamic {
      return Official.Name
    }
    
    // 'value' attribute on TextCell (id=ReportNumber) at ClaimSnapshotGeneral400DV.wc.pcf: line 654, column 46
    function value_326 () : dynamic.Dynamic {
      return Official.ReportNumber
    }
    
    property get Official () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotGeneral400DV.wc.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry5ExpressionsImpl extends ClaimSnapshotGeneral400DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=ReferenceNumber) at ClaimSnapshotGeneral400DV.wc.pcf: line 691, column 46
    function valueRoot_344 () : java.lang.Object {
      return OtherBenefit
    }
    
    // 'value' attribute on TextCell (id=ReferenceNumber) at ClaimSnapshotGeneral400DV.wc.pcf: line 691, column 46
    function value_342 () : dynamic.Dynamic {
      return OtherBenefit.ReferenceNumber
    }
    
    // 'value' attribute on TextCell (id=Amount) at ClaimSnapshotGeneral400DV.wc.pcf: line 696, column 46
    function value_345 () : dynamic.Dynamic {
      return OtherBenefit.Amount
    }
    
    // 'value' attribute on TextCell (id=StartDate) at ClaimSnapshotGeneral400DV.wc.pcf: line 700, column 76
    function value_348 () : java.lang.String {
      return util.Snapshot.renderValue(OtherBenefit.StartDate)
    }
    
    // 'value' attribute on TextCell (id=EndDate) at ClaimSnapshotGeneral400DV.wc.pcf: line 704, column 74
    function value_350 () : java.lang.String {
      return util.Snapshot.renderValue(OtherBenefit.EndDate)
    }
    
    // 'value' attribute on TextCell (id=InitialContact) at ClaimSnapshotGeneral400DV.wc.pcf: line 709, column 46
    function value_352 () : dynamic.Dynamic {
      return OtherBenefit.InitialContact
    }
    
    // 'value' attribute on TextCell (id=Comments) at ClaimSnapshotGeneral400DV.wc.pcf: line 714, column 46
    function value_355 () : dynamic.Dynamic {
      return OtherBenefit.Comments
    }
    
    property get OtherBenefit () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotGeneral400DV.wc.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry6ExpressionsImpl extends ClaimSnapshotGeneral400DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=MetroReportType) at ClaimSnapshotGeneral400DV.wc.pcf: line 736, column 46
    function valueRoot_364 () : java.lang.Object {
      return MetroReport
    }
    
    // 'value' attribute on TextCell (id=MetroReportType) at ClaimSnapshotGeneral400DV.wc.pcf: line 736, column 46
    function value_362 () : dynamic.Dynamic {
      return MetroReport.MetroReportType
    }
    
    // 'value' attribute on TextCell (id=MetroReportStatus) at ClaimSnapshotGeneral400DV.wc.pcf: line 741, column 46
    function value_365 () : dynamic.Dynamic {
      return MetroReport.Status
    }
    
    // 'value' attribute on TextCell (id=MetroReportOrderDate) at ClaimSnapshotGeneral400DV.wc.pcf: line 746, column 46
    function value_368 () : dynamic.Dynamic {
      return MetroReport.CreateTime
    }
    
    property get MetroReport () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotGeneral400DV.wc.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotGeneral400DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=PrimaryBodyPart) at ClaimSnapshotGeneral400DV.wc.pcf: line 185, column 46
    function valueRoot_83 () : java.lang.Object {
      return BodyPart
    }
    
    // 'value' attribute on TextCell (id=PrimaryBodyPart) at ClaimSnapshotGeneral400DV.wc.pcf: line 185, column 46
    function value_81 () : dynamic.Dynamic {
      return BodyPart.PrimaryBodyPart
    }
    
    // 'value' attribute on TextCell (id=DetailedBodyPart) at ClaimSnapshotGeneral400DV.wc.pcf: line 190, column 46
    function value_84 () : dynamic.Dynamic {
      return BodyPart.DetailedBodyPart
    }
    
    // 'value' attribute on TextCell (id=Compensability) at ClaimSnapshotGeneral400DV.wc.pcf: line 195, column 46
    function value_87 () : dynamic.Dynamic {
      return BodyPart.Compensability
    }
    
    property get BodyPart () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}