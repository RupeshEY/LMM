package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/500/ClaimSnapshotGeneral500DV.wc.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotGeneral500DV_wcExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/500/ClaimSnapshotGeneral500DV.wc.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotGeneral500DVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'encryptionExpression' attribute on PrivacyInput (id=TaxID) at ClaimSnapshotGeneral500DV.wc.pcf: line 277, column 38
    function encryptionExpression_134 (VALUE :  dynamic.Dynamic) : java.lang.String {
      return gw.api.privacy.EncryptionMaskExpressions.maskTaxId(VALUE as String)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral500DV.wc.pcf: line 405, column 46
    function sortValue_197 (ConcurrentEmpl :  dynamic.Dynamic) : java.lang.Object {
      return ConcurrentEmpl.CompanyName
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral500DV.wc.pcf: line 409, column 78
    function sortValue_198 (ConcurrentEmpl :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(ConcurrentEmpl.StartDate)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral500DV.wc.pcf: line 413, column 76
    function sortValue_199 (ConcurrentEmpl :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(ConcurrentEmpl.EndDate)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral500DV.wc.pcf: line 417, column 77
    function sortValue_200 (ConcurrentEmpl :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(ConcurrentEmpl.FullTime)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral500DV.wc.pcf: line 422, column 46
    function sortValue_201 (ConcurrentEmpl :  dynamic.Dynamic) : java.lang.Object {
      return ConcurrentEmpl.WeeklyWage
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral500DV.wc.pcf: line 427, column 46
    function sortValue_202 (ConcurrentEmpl :  dynamic.Dynamic) : java.lang.Object {
      return ConcurrentEmpl.JobTitle
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral500DV.wc.pcf: line 449, column 81
    function sortValue_219 (WorkStatusChange :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(WorkStatusChange.StatusDate)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral500DV.wc.pcf: line 454, column 46
    function sortValue_220 (WorkStatusChange :  dynamic.Dynamic) : java.lang.Object {
      return WorkStatusChange.Status
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral500DV.wc.pcf: line 459, column 46
    function sortValue_221 (WorkStatusChange :  dynamic.Dynamic) : java.lang.Object {
      return WorkStatusChange.Comments
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral500DV.wc.pcf: line 531, column 46
    function sortValue_255 (Official :  dynamic.Dynamic) : java.lang.Object {
      return Official.OfficialType
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral500DV.wc.pcf: line 536, column 46
    function sortValue_256 (Official :  dynamic.Dynamic) : java.lang.Object {
      return Official.Name
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral500DV.wc.pcf: line 541, column 46
    function sortValue_257 (Official :  dynamic.Dynamic) : java.lang.Object {
      return Official.ReportNumber
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral500DV.wc.pcf: line 189, column 46
    function sortValue_86 (BodyPart :  dynamic.Dynamic) : java.lang.Object {
      return BodyPart.PrimaryBodyPart
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral500DV.wc.pcf: line 194, column 46
    function sortValue_87 (BodyPart :  dynamic.Dynamic) : java.lang.Object {
      return BodyPart.DetailedBodyPart
    }
    
    // 'value' attribute on TextInput (id=Catastrophe) at ClaimSnapshotGeneral500DV.wc.pcf: line 35, column 38
    function valueRoot_10 () : java.lang.Object {
      return Snapshot.Catastrophe
    }
    
    // 'value' attribute on TextInput (id=MedCase_Hospital) at ClaimSnapshotGeneral500DV.wc.pcf: line 232, column 38
    function valueRoot_112 () : java.lang.Object {
      return Snapshot.Hospital
    }
    
    // 'value' attribute on TextInput (id=Claimant) at ClaimSnapshotGeneral500DV.wc.pcf: line 253, column 38
    function valueRoot_121 () : java.lang.Object {
      return Snapshot.Claimant
    }
    
    // 'value' attribute on TextInput (id=PrimaryAddress) at ClaimSnapshotGeneral500DV.wc.pcf: line 267, column 38
    function valueRoot_128 () : java.lang.Object {
      return Snapshot.Claimant.PrimaryAddress
    }
    
    // 'value' attribute on DateInput (id=HireDate) at ClaimSnapshotGeneral500DV.wc.pcf: line 296, column 38
    function valueRoot_142 () : java.lang.Object {
      return Snapshot.EmploymentData
    }
    
    // 'value' attribute on TextInput (id=Supervisor) at ClaimSnapshotGeneral500DV.wc.pcf: line 311, column 38
    function valueRoot_151 () : java.lang.Object {
      return Snapshot.Supervisor
    }
    
    // 'value' attribute on TextInput (id=LossLocation) at ClaimSnapshotGeneral500DV.wc.pcf: line 59, column 38
    function valueRoot_19 () : java.lang.Object {
      return Snapshot.LossLocation
    }
    
    // 'value' attribute on TextInput (id=LossType) at ClaimSnapshotGeneral500DV.wc.pcf: line 21, column 38
    function valueRoot_2 () : java.lang.Object {
      return Snapshot
    }
    
    // 'value' attribute on TextInput (id=Reporter) at ClaimSnapshotGeneral500DV.wc.pcf: line 471, column 38
    function valueRoot_233 () : java.lang.Object {
      return Snapshot.Reporter
    }
    
    // 'value' attribute on TextInput (id=MainContact) at ClaimSnapshotGeneral500DV.wc.pcf: line 481, column 38
    function valueRoot_239 () : java.lang.Object {
      return Snapshot.MainContact
    }
    
    // 'value' attribute on TextInput (id=Severity) at ClaimSnapshotGeneral500DV.wc.pcf: line 147, column 38
    function valueRoot_70 () : java.lang.Object {
      return Snapshot.ClaimInjuryIncident
    }
    
    // 'value' attribute on TextInput (id=MedCase_FirstIntakeDoctor) at ClaimSnapshotGeneral500DV.wc.pcf: line 206, column 38
    function valueRoot_97 () : java.lang.Object {
      return Snapshot.FirstIntakeDoctor
    }
    
    // 'value' attribute on TextInput (id=LossType) at ClaimSnapshotGeneral500DV.wc.pcf: line 21, column 38
    function value_0 () : dynamic.Dynamic {
      return Snapshot.LossType
    }
    
    // 'value' attribute on DateInput (id=MedCase_ExaminationDate) at ClaimSnapshotGeneral500DV.wc.pcf: line 217, column 38
    function value_101 () : dynamic.Dynamic {
      return Snapshot.ExaminationDate
    }
    
    // 'value' attribute on TextInput (id=MedCase_MedicalTreatment) at ClaimSnapshotGeneral500DV.wc.pcf: line 222, column 38
    function value_104 () : dynamic.Dynamic {
      return Snapshot.ClaimInjuryIncident.MedicalTreatmentType
    }
    
    // 'value' attribute on TextAreaInput (id=MedCase_TreatmentRend) at ClaimSnapshotGeneral500DV.wc.pcf: line 227, column 38
    function value_107 () : dynamic.Dynamic {
      return Snapshot.TreatmentRend
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at ClaimSnapshotGeneral500DV.wc.pcf: line 44, column 38
    function value_11 () : dynamic.Dynamic {
      return Snapshot.Description
    }
    
    // 'value' attribute on TextInput (id=MedCase_Hospital) at ClaimSnapshotGeneral500DV.wc.pcf: line 232, column 38
    function value_110 () : dynamic.Dynamic {
      return Snapshot.Hospital.DisplayName
    }
    
    // 'value' attribute on DateInput (id=MedCase_HospitalDate) at ClaimSnapshotGeneral500DV.wc.pcf: line 238, column 38
    function value_113 () : dynamic.Dynamic {
      return Snapshot.HospitalDate
    }
    
    // 'value' attribute on TextInput (id=MedCase_HospitalDays) at ClaimSnapshotGeneral500DV.wc.pcf: line 243, column 38
    function value_116 () : dynamic.Dynamic {
      return Snapshot.HospitalDays
    }
    
    // 'value' attribute on TextInput (id=Claimant) at ClaimSnapshotGeneral500DV.wc.pcf: line 253, column 38
    function value_119 () : dynamic.Dynamic {
      return Snapshot.Claimant.DisplayName
    }
    
    // 'value' attribute on BooleanRadioInput (id=ContactProhibited) at ClaimSnapshotGeneral500DV.wc.pcf: line 258, column 38
    function value_122 () : dynamic.Dynamic {
      return util.Snapshot.getClaimant(Snapshot, null)["ContactProhibited"]
    }
    
    // 'value' attribute on TextInput (id=PrimaryPhone) at ClaimSnapshotGeneral500DV.wc.pcf: line 262, column 67
    function value_124 () : java.lang.String {
      return util.Snapshot.getPrimaryPhone(Snapshot.Claimant)
    }
    
    // 'value' attribute on TextInput (id=PrimaryAddress) at ClaimSnapshotGeneral500DV.wc.pcf: line 267, column 38
    function value_126 () : dynamic.Dynamic {
      return Snapshot.Claimant.PrimaryAddress.DisplayName
    }
    
    // 'value' attribute on TextInput (id=DateOfBirth) at ClaimSnapshotGeneral500DV.wc.pcf: line 271, column 74
    function value_129 () : java.lang.String {
      return util.Snapshot.renderDate(Snapshot.Claimant.DateOfBirth)
    }
    
    // 'value' attribute on PrivacyInput (id=TaxID) at ClaimSnapshotGeneral500DV.wc.pcf: line 277, column 38
    function value_131 () : dynamic.Dynamic {
      return Snapshot.Claimant.TaxID
    }
    
    // 'value' attribute on TextInput (id=Occupation) at ClaimSnapshotGeneral500DV.wc.pcf: line 285, column 38
    function value_135 () : dynamic.Dynamic {
      return Snapshot.Claimant.Occupation
    }
    
    // 'value' attribute on TextInput (id=EmpClass) at ClaimSnapshotGeneral500DV.wc.pcf: line 289, column 79
    function value_138 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.EmploymentData.ClassCode)
    }
    
    // 'value' attribute on DateInput (id=DateOfInjury) at ClaimSnapshotGeneral500DV.wc.pcf: line 54, column 38
    function value_14 () : dynamic.Dynamic {
      return Snapshot.LossDate
    }
    
    // 'value' attribute on DateInput (id=HireDate) at ClaimSnapshotGeneral500DV.wc.pcf: line 296, column 38
    function value_140 () : dynamic.Dynamic {
      return Snapshot.EmploymentData.HireDate
    }
    
    // 'value' attribute on TextInput (id=HireState) at ClaimSnapshotGeneral500DV.wc.pcf: line 301, column 38
    function value_143 () : dynamic.Dynamic {
      return Snapshot.EmploymentData.HireState
    }
    
    // 'value' attribute on TextInput (id=EmploymentStatus) at ClaimSnapshotGeneral500DV.wc.pcf: line 306, column 38
    function value_146 () : dynamic.Dynamic {
      return Snapshot.EmploymentData.EmploymentStatus
    }
    
    // 'value' attribute on TextInput (id=Supervisor) at ClaimSnapshotGeneral500DV.wc.pcf: line 311, column 38
    function value_149 () : dynamic.Dynamic {
      return Snapshot.Supervisor.DisplayName
    }
    
    // 'value' attribute on TextInput (id=NumDaysWorked) at ClaimSnapshotGeneral500DV.wc.pcf: line 316, column 38
    function value_152 () : dynamic.Dynamic {
      return Snapshot.EmploymentData.NumDaysWorked
    }
    
    // 'value' attribute on TextInput (id=NumHoursWorked) at ClaimSnapshotGeneral500DV.wc.pcf: line 321, column 38
    function value_155 () : dynamic.Dynamic {
      return Snapshot.EmploymentData.NumHoursWorked
    }
    
    // 'value' attribute on TextInput (id=WageAmount) at ClaimSnapshotGeneral500DV.wc.pcf: line 326, column 38
    function value_158 () : dynamic.Dynamic {
      return Snapshot.EmploymentData.WageAmount
    }
    
    // 'value' attribute on TextInput (id=PayPeriod) at ClaimSnapshotGeneral500DV.wc.pcf: line 331, column 38
    function value_161 () : dynamic.Dynamic {
      return Snapshot.EmploymentData.PayPeriod
    }
    
    // 'value' attribute on DateInput (id=InjuryStartTime) at ClaimSnapshotGeneral500DV.wc.pcf: line 337, column 38
    function value_164 () : dynamic.Dynamic {
      return Snapshot.EmploymentData.InjuryStartTime
    }
    
    // 'value' attribute on BooleanRadioInput (id=PaidFull) at ClaimSnapshotGeneral500DV.wc.pcf: line 342, column 38
    function value_167 () : dynamic.Dynamic {
      return Snapshot.EmploymentData.PaidFull
    }
    
    // 'value' attribute on TextInput (id=LossLocation) at ClaimSnapshotGeneral500DV.wc.pcf: line 59, column 38
    function value_17 () : dynamic.Dynamic {
      return Snapshot.LossLocation.DisplayName
    }
    
    // 'value' attribute on BooleanRadioInput (id=WagePaymentCont) at ClaimSnapshotGeneral500DV.wc.pcf: line 347, column 38
    function value_170 () : dynamic.Dynamic {
      return Snapshot.EmploymentData.WagePaymentCont
    }
    
    // 'value' attribute on BooleanRadioInput (id=ModifiedDutyAvail) at ClaimSnapshotGeneral500DV.wc.pcf: line 352, column 38
    function value_173 () : dynamic.Dynamic {
      return Snapshot.ModifiedDutyAvail
    }
    
    // 'value' attribute on BooleanRadioInput (id=InjuredRegularJob) at ClaimSnapshotGeneral500DV.wc.pcf: line 357, column 38
    function value_176 () : dynamic.Dynamic {
      return Snapshot.InjuredRegularJob
    }
    
    // 'value' attribute on TextInput (id=EquipmentUsed) at ClaimSnapshotGeneral500DV.wc.pcf: line 362, column 38
    function value_179 () : dynamic.Dynamic {
      return Snapshot.EquipmentUsed
    }
    
    // 'value' attribute on TextInput (id=ActivityPerformed) at ClaimSnapshotGeneral500DV.wc.pcf: line 367, column 38
    function value_182 () : dynamic.Dynamic {
      return Snapshot.ActivityPerformed
    }
    
    // 'value' attribute on TextInput (id=DrugsInvolved) at ClaimSnapshotGeneral500DV.wc.pcf: line 372, column 38
    function value_185 () : dynamic.Dynamic {
      return Snapshot.DrugsInvolved
    }
    
    // 'value' attribute on BooleanRadioInput (id=SafetyEquipProv) at ClaimSnapshotGeneral500DV.wc.pcf: line 377, column 38
    function value_188 () : dynamic.Dynamic {
      return Snapshot.SafetyEquipProv
    }
    
    // 'value' attribute on BooleanRadioInput (id=SafetyEquipUsed) at ClaimSnapshotGeneral500DV.wc.pcf: line 382, column 38
    function value_191 () : dynamic.Dynamic {
      return Snapshot.SafetyEquipUsed
    }
    
    // 'value' attribute on TextInput (id=ConcurrentEmployment) at ClaimSnapshotGeneral500DV.wc.pcf: line 387, column 38
    function value_194 () : dynamic.Dynamic {
      return Snapshot.ConcurrentEmp
    }
    
    // 'value' attribute on TextInput (id=AddressLine1) at ClaimSnapshotGeneral500DV.wc.pcf: line 64, column 38
    function value_20 () : dynamic.Dynamic {
      return Snapshot.LossLocation.AddressLine1
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral500DV.wc.pcf: line 399, column 41
    function value_218 () : dynamic.Dynamic {
      return Snapshot.ConcurrentEmpl
    }
    
    // 'value' attribute on TextInput (id=AddressLine2) at ClaimSnapshotGeneral500DV.wc.pcf: line 69, column 38
    function value_23 () : dynamic.Dynamic {
      return Snapshot.LossLocation.AddressLine2
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral500DV.wc.pcf: line 444, column 41
    function value_230 () : dynamic.Dynamic {
      return Snapshot.EmploymentData.WorkStatusChanges
    }
    
    // 'value' attribute on TextInput (id=Reporter) at ClaimSnapshotGeneral500DV.wc.pcf: line 471, column 38
    function value_231 () : dynamic.Dynamic {
      return Snapshot.Reporter.DisplayName
    }
    
    // 'value' attribute on TextInput (id=ReportedByType) at ClaimSnapshotGeneral500DV.wc.pcf: line 476, column 38
    function value_234 () : dynamic.Dynamic {
      return Snapshot.ReportedByType
    }
    
    // 'value' attribute on TextInput (id=MainContact) at ClaimSnapshotGeneral500DV.wc.pcf: line 481, column 38
    function value_237 () : dynamic.Dynamic {
      return Snapshot.MainContact.DisplayName
    }
    
    // 'value' attribute on TextInput (id=MainContactType) at ClaimSnapshotGeneral500DV.wc.pcf: line 486, column 38
    function value_240 () : dynamic.Dynamic {
      return Snapshot.MainContactType
    }
    
    // 'value' attribute on DateInput (id=ReportedDate) at ClaimSnapshotGeneral500DV.wc.pcf: line 493, column 38
    function value_243 () : dynamic.Dynamic {
      return Snapshot.ReportedDate
    }
    
    // 'value' attribute on BooleanRadioInput (id=FirstNoticeSuit) at ClaimSnapshotGeneral500DV.wc.pcf: line 498, column 38
    function value_246 () : dynamic.Dynamic {
      return Snapshot.FirstNoticeSuit
    }
    
    // 'value' attribute on DateInput (id=ClaimantRprtdDate) at ClaimSnapshotGeneral500DV.wc.pcf: line 505, column 38
    function value_249 () : dynamic.Dynamic {
      return Snapshot.ClaimantRprtdDate
    }
    
    // 'value' attribute on DateInput (id=DateRptdToEmployer) at ClaimSnapshotGeneral500DV.wc.pcf: line 512, column 38
    function value_252 () : dynamic.Dynamic {
      return Snapshot.DateRptdToEmployer
    }
    
    // 'value' attribute on TextInput (id=City) at ClaimSnapshotGeneral500DV.wc.pcf: line 74, column 38
    function value_26 () : dynamic.Dynamic {
      return Snapshot.LossLocation.City
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral500DV.wc.pcf: line 525, column 41
    function value_267 () : dynamic.Dynamic {
      return Snapshot.Officials
    }
    
    // 'value' attribute on DateInput (id=CreateTime) at ClaimSnapshotGeneral500DV.wc.pcf: line 553, column 38
    function value_268 () : dynamic.Dynamic {
      return Snapshot.CreateTime
    }
    
    // 'value' attribute on TextInput (id=ValidationLevel) at ClaimSnapshotGeneral500DV.wc.pcf: line 558, column 38
    function value_271 () : dynamic.Dynamic {
      return Snapshot.ValidationLevel
    }
    
    // 'value' attribute on TextInput (id=State) at ClaimSnapshotGeneral500DV.wc.pcf: line 79, column 38
    function value_29 () : dynamic.Dynamic {
      return Snapshot.LossLocation.State
    }
    
    // 'value' attribute on TextInput (id=LOBCode) at ClaimSnapshotGeneral500DV.wc.pcf: line 26, column 38
    function value_3 () : dynamic.Dynamic {
      return Snapshot.LOBCode
    }
    
    // 'value' attribute on TextInput (id=PostalCode) at ClaimSnapshotGeneral500DV.wc.pcf: line 84, column 38
    function value_32 () : dynamic.Dynamic {
      return Snapshot.LossLocation.PostalCode
    }
    
    // 'value' attribute on TextInput (id=County) at ClaimSnapshotGeneral500DV.wc.pcf: line 89, column 38
    function value_35 () : dynamic.Dynamic {
      return Snapshot.LossLocation.County
    }
    
    // 'value' attribute on TextInput (id=Country) at ClaimSnapshotGeneral500DV.wc.pcf: line 94, column 38
    function value_38 () : dynamic.Dynamic {
      return Snapshot.LossLocation.Country
    }
    
    // 'value' attribute on TextInput (id=LocationDescription) at ClaimSnapshotGeneral500DV.wc.pcf: line 99, column 38
    function value_41 () : dynamic.Dynamic {
      return Snapshot.LossLocation.Description
    }
    
    // 'value' attribute on BooleanRadioInput (id=InsuredPremises) at ClaimSnapshotGeneral500DV.wc.pcf: line 104, column 38
    function value_44 () : dynamic.Dynamic {
      return Snapshot.InsuredPremises
    }
    
    // 'value' attribute on BooleanRadioInput (id=EmploymentInjury) at ClaimSnapshotGeneral500DV.wc.pcf: line 109, column 38
    function value_47 () : dynamic.Dynamic {
      return Snapshot.EmploymentInjury
    }
    
    // 'value' attribute on TextInput (id=JurisdictionState) at ClaimSnapshotGeneral500DV.wc.pcf: line 114, column 38
    function value_50 () : dynamic.Dynamic {
      return Snapshot.JurisdictionState
    }
    
    // 'value' attribute on BooleanRadioInput (id=IncidentReport) at ClaimSnapshotGeneral500DV.wc.pcf: line 122, column 38
    function value_53 () : dynamic.Dynamic {
      return Snapshot.IncidentReport
    }
    
    // 'value' attribute on BooleanRadioInput (id=MedicalReport) at ClaimSnapshotGeneral500DV.wc.pcf: line 127, column 38
    function value_56 () : dynamic.Dynamic {
      return Snapshot.MedicalReport
    }
    
    // 'value' attribute on BooleanRadioInput (id=TimeLossReport) at ClaimSnapshotGeneral500DV.wc.pcf: line 132, column 38
    function value_59 () : dynamic.Dynamic {
      return Snapshot.TimeLossReport
    }
    
    // 'value' attribute on TextInput (id=LocationCode) at ClaimSnapshotGeneral500DV.wc.pcf: line 30, column 67
    function value_6 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.LocationCode)
    }
    
    // 'value' attribute on BooleanRadioInput (id=DeathReport) at ClaimSnapshotGeneral500DV.wc.pcf: line 137, column 38
    function value_62 () : dynamic.Dynamic {
      return Snapshot.DeathReport
    }
    
    // 'value' attribute on TextInput (id=DeathDate) at ClaimSnapshotGeneral500DV.wc.pcf: line 142, column 38
    function value_65 () : dynamic.Dynamic {
      return Snapshot.DeathDate
    }
    
    // 'value' attribute on TextInput (id=Severity) at ClaimSnapshotGeneral500DV.wc.pcf: line 147, column 38
    function value_68 () : dynamic.Dynamic {
      return Snapshot.ClaimInjuryIncident.Severity
    }
    
    // 'value' attribute on TextInput (id=LossCause) at ClaimSnapshotGeneral500DV.wc.pcf: line 152, column 38
    function value_71 () : dynamic.Dynamic {
      return Snapshot.LossCause
    }
    
    // 'value' attribute on TextInput (id=AccidentType) at ClaimSnapshotGeneral500DV.wc.pcf: line 157, column 38
    function value_74 () : dynamic.Dynamic {
      return Snapshot.AccidentType
    }
    
    // 'value' attribute on TextInput (id=PrimaryInjury) at ClaimSnapshotGeneral500DV.wc.pcf: line 162, column 38
    function value_77 () : dynamic.Dynamic {
      return Snapshot.ClaimInjuryIncident.GeneralInjuryType
    }
    
    // 'value' attribute on TextInput (id=Catastrophe) at ClaimSnapshotGeneral500DV.wc.pcf: line 35, column 38
    function value_8 () : dynamic.Dynamic {
      return Snapshot.Catastrophe.DisplayName
    }
    
    // 'value' attribute on TextInput (id=DetailedInjury) at ClaimSnapshotGeneral500DV.wc.pcf: line 167, column 38
    function value_80 () : dynamic.Dynamic {
      return Snapshot.ClaimInjuryIncident.DetailedInjuryType
    }
    
    // 'value' attribute on TextInput (id=InjuryDescription) at ClaimSnapshotGeneral500DV.wc.pcf: line 172, column 38
    function value_83 () : dynamic.Dynamic {
      return Snapshot.ClaimInjuryIncident.Description
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral500DV.wc.pcf: line 183, column 41
    function value_94 () : dynamic.Dynamic {
      return Snapshot.ClaimInjuryIncident.BodyParts
    }
    
    // 'value' attribute on TextInput (id=MedCase_FirstIntakeDoctor) at ClaimSnapshotGeneral500DV.wc.pcf: line 206, column 38
    function value_95 () : dynamic.Dynamic {
      return Snapshot.FirstIntakeDoctor.DisplayName
    }
    
    // 'value' attribute on TextInput (id=MedCase_MedicalDiagnosis) at ClaimSnapshotGeneral500DV.wc.pcf: line 211, column 38
    function value_98 () : dynamic.Dynamic {
      return Snapshot.MedicalDiagnosis
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
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/500/ClaimSnapshotGeneral500DV.wc.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends ClaimSnapshotGeneral500DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=CompanyName) at ClaimSnapshotGeneral500DV.wc.pcf: line 405, column 46
    function valueRoot_205 () : java.lang.Object {
      return ConcurrentEmpl
    }
    
    // 'value' attribute on TextCell (id=CompanyName) at ClaimSnapshotGeneral500DV.wc.pcf: line 405, column 46
    function value_203 () : dynamic.Dynamic {
      return ConcurrentEmpl.CompanyName
    }
    
    // 'value' attribute on TextCell (id=StartDate) at ClaimSnapshotGeneral500DV.wc.pcf: line 409, column 78
    function value_206 () : java.lang.String {
      return util.Snapshot.renderValue(ConcurrentEmpl.StartDate)
    }
    
    // 'value' attribute on TextCell (id=EndDate) at ClaimSnapshotGeneral500DV.wc.pcf: line 413, column 76
    function value_208 () : java.lang.String {
      return util.Snapshot.renderValue(ConcurrentEmpl.EndDate)
    }
    
    // 'value' attribute on TextCell (id=FullTime) at ClaimSnapshotGeneral500DV.wc.pcf: line 417, column 77
    function value_210 () : java.lang.String {
      return util.Snapshot.renderValue(ConcurrentEmpl.FullTime)
    }
    
    // 'value' attribute on TextCell (id=WeeklyWage) at ClaimSnapshotGeneral500DV.wc.pcf: line 422, column 46
    function value_212 () : dynamic.Dynamic {
      return ConcurrentEmpl.WeeklyWage
    }
    
    // 'value' attribute on TextCell (id=JobTitle) at ClaimSnapshotGeneral500DV.wc.pcf: line 427, column 46
    function value_215 () : dynamic.Dynamic {
      return ConcurrentEmpl.JobTitle
    }
    
    property get ConcurrentEmpl () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/500/ClaimSnapshotGeneral500DV.wc.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry3ExpressionsImpl extends ClaimSnapshotGeneral500DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Status) at ClaimSnapshotGeneral500DV.wc.pcf: line 454, column 46
    function valueRoot_226 () : java.lang.Object {
      return WorkStatusChange
    }
    
    // 'value' attribute on TextCell (id=StatusDate) at ClaimSnapshotGeneral500DV.wc.pcf: line 449, column 81
    function value_222 () : java.lang.String {
      return util.Snapshot.renderValue(WorkStatusChange.StatusDate)
    }
    
    // 'value' attribute on TextCell (id=Status) at ClaimSnapshotGeneral500DV.wc.pcf: line 454, column 46
    function value_224 () : dynamic.Dynamic {
      return WorkStatusChange.Status
    }
    
    // 'value' attribute on TextCell (id=Comments) at ClaimSnapshotGeneral500DV.wc.pcf: line 459, column 46
    function value_227 () : dynamic.Dynamic {
      return WorkStatusChange.Comments
    }
    
    property get WorkStatusChange () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/500/ClaimSnapshotGeneral500DV.wc.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry4ExpressionsImpl extends ClaimSnapshotGeneral500DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Type) at ClaimSnapshotGeneral500DV.wc.pcf: line 531, column 46
    function valueRoot_260 () : java.lang.Object {
      return Official
    }
    
    // 'value' attribute on TextCell (id=Type) at ClaimSnapshotGeneral500DV.wc.pcf: line 531, column 46
    function value_258 () : dynamic.Dynamic {
      return Official.OfficialType
    }
    
    // 'value' attribute on TextCell (id=Name) at ClaimSnapshotGeneral500DV.wc.pcf: line 536, column 46
    function value_261 () : dynamic.Dynamic {
      return Official.Name
    }
    
    // 'value' attribute on TextCell (id=ReportNumber) at ClaimSnapshotGeneral500DV.wc.pcf: line 541, column 46
    function value_264 () : dynamic.Dynamic {
      return Official.ReportNumber
    }
    
    property get Official () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/500/ClaimSnapshotGeneral500DV.wc.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotGeneral500DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=PrimaryBodyPart) at ClaimSnapshotGeneral500DV.wc.pcf: line 189, column 46
    function valueRoot_90 () : java.lang.Object {
      return BodyPart
    }
    
    // 'value' attribute on TextCell (id=PrimaryBodyPart) at ClaimSnapshotGeneral500DV.wc.pcf: line 189, column 46
    function value_88 () : dynamic.Dynamic {
      return BodyPart.PrimaryBodyPart
    }
    
    // 'value' attribute on TextCell (id=DetailedBodyPart) at ClaimSnapshotGeneral500DV.wc.pcf: line 194, column 46
    function value_91 () : dynamic.Dynamic {
      return BodyPart.DetailedBodyPart
    }
    
    property get BodyPart () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}