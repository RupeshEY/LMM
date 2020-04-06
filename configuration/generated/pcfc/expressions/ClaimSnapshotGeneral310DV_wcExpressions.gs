package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotGeneral310DV_wcExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotGeneral310DVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'encryptionExpression' attribute on PrivacyInput (id=TaxID) at ClaimSnapshotGeneral310DV.wc.pcf: line 205, column 38
    function encryptionExpression_94 (VALUE :  dynamic.Dynamic) : java.lang.String {
      return gw.api.privacy.EncryptionMaskExpressions.maskTaxId(VALUE as String)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral310DV.wc.pcf: line 340, column 46
    function sortValue_155 (ConcurrentEmpl :  dynamic.Dynamic) : java.lang.Object {
      return ConcurrentEmpl.CompanyName
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral310DV.wc.pcf: line 344, column 78
    function sortValue_156 (ConcurrentEmpl :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(ConcurrentEmpl.StartDate)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral310DV.wc.pcf: line 348, column 76
    function sortValue_157 (ConcurrentEmpl :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(ConcurrentEmpl.EndDate)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral310DV.wc.pcf: line 352, column 77
    function sortValue_158 (ConcurrentEmpl :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(ConcurrentEmpl.FullTime)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral310DV.wc.pcf: line 357, column 46
    function sortValue_159 (ConcurrentEmpl :  dynamic.Dynamic) : java.lang.Object {
      return ConcurrentEmpl.WeeklyWage
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral310DV.wc.pcf: line 362, column 46
    function sortValue_160 (ConcurrentEmpl :  dynamic.Dynamic) : java.lang.Object {
      return ConcurrentEmpl.JobTitle
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral310DV.wc.pcf: line 384, column 46
    function sortValue_177 (OtherBenefit :  dynamic.Dynamic) : java.lang.Object {
      return OtherBenefit.ReferenceNumber
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral310DV.wc.pcf: line 389, column 46
    function sortValue_178 (OtherBenefit :  dynamic.Dynamic) : java.lang.Object {
      return OtherBenefit.Amount
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral310DV.wc.pcf: line 393, column 76
    function sortValue_179 (OtherBenefit :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(OtherBenefit.StartDate)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral310DV.wc.pcf: line 397, column 74
    function sortValue_180 (OtherBenefit :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(OtherBenefit.EndDate)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral310DV.wc.pcf: line 402, column 46
    function sortValue_181 (OtherBenefit :  dynamic.Dynamic) : java.lang.Object {
      return OtherBenefit.InitialContact
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral310DV.wc.pcf: line 407, column 46
    function sortValue_182 (OtherBenefit :  dynamic.Dynamic) : java.lang.Object {
      return OtherBenefit.Comments
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral310DV.wc.pcf: line 431, column 81
    function sortValue_200 (WorkStatusChange :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(WorkStatusChange.StatusDate)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral310DV.wc.pcf: line 436, column 46
    function sortValue_201 (WorkStatusChange :  dynamic.Dynamic) : java.lang.Object {
      return WorkStatusChange.Status
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral310DV.wc.pcf: line 441, column 46
    function sortValue_202 (WorkStatusChange :  dynamic.Dynamic) : java.lang.Object {
      return WorkStatusChange.Comments
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral310DV.wc.pcf: line 639, column 46
    function sortValue_298 (Official :  dynamic.Dynamic) : java.lang.Object {
      return Official.OfficialType
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral310DV.wc.pcf: line 644, column 46
    function sortValue_299 (Official :  dynamic.Dynamic) : java.lang.Object {
      return Official.Name
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral310DV.wc.pcf: line 649, column 46
    function sortValue_300 (Official :  dynamic.Dynamic) : java.lang.Object {
      return Official.ReportNumber
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral310DV.wc.pcf: line 164, column 46
    function sortValue_68 (BodyPart :  dynamic.Dynamic) : java.lang.Object {
      return BodyPart.PrimaryBodyPart
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral310DV.wc.pcf: line 169, column 46
    function sortValue_69 (BodyPart :  dynamic.Dynamic) : java.lang.Object {
      return BodyPart.DetailedBodyPart
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral310DV.wc.pcf: line 174, column 46
    function sortValue_70 (BodyPart :  dynamic.Dynamic) : java.lang.Object {
      return BodyPart.Compensability
    }
    
    // 'value' attribute on TextInput (id=DepartmentCode) at ClaimSnapshotGeneral310DV.wc.pcf: line 222, column 38
    function valueRoot_102 () : java.lang.Object {
      return Snapshot.EmploymentData
    }
    
    // 'value' attribute on TextInput (id=NurseCaseMgr) at ClaimSnapshotGeneral310DV.wc.pcf: line 36, column 38
    function valueRoot_11 () : java.lang.Object {
      return Snapshot.NurseCaseMgr
    }
    
    // 'value' attribute on TextInput (id=Supervisor) at ClaimSnapshotGeneral310DV.wc.pcf: line 241, column 38
    function valueRoot_113 () : java.lang.Object {
      return Snapshot.Supervisor
    }
    
    // 'value' attribute on TextInput (id=Catastrophe) at ClaimSnapshotGeneral310DV.wc.pcf: line 41, column 38
    function valueRoot_14 () : java.lang.Object {
      return Snapshot.Catastrophe
    }
    
    // 'value' attribute on TextInput (id=LossType) at ClaimSnapshotGeneral310DV.wc.pcf: line 21, column 38
    function valueRoot_2 () : java.lang.Object {
      return Snapshot
    }
    
    // 'value' attribute on TextInput (id=Reporter) at ClaimSnapshotGeneral310DV.wc.pcf: line 494, column 38
    function valueRoot_232 () : java.lang.Object {
      return Snapshot.Reporter
    }
    
    // 'value' attribute on TextInput (id=MainContact) at ClaimSnapshotGeneral310DV.wc.pcf: line 504, column 38
    function valueRoot_238 () : java.lang.Object {
      return Snapshot.MainContact
    }
    
    // 'value' attribute on TextInput (id=LossLocation) at ClaimSnapshotGeneral310DV.wc.pcf: line 533, column 38
    function valueRoot_252 () : java.lang.Object {
      return Snapshot.LossLocation
    }
    
    // 'value' attribute on TextInput (id=Contact) at ClaimSnapshotGeneral310DV.wc.pcf: line 31, column 38
    function valueRoot_8 () : java.lang.Object {
      return Snapshot.AssignedUser.Contact
    }
    
    // 'value' attribute on TextInput (id=Claimant) at ClaimSnapshotGeneral310DV.wc.pcf: line 186, column 38
    function valueRoot_83 () : java.lang.Object {
      return Snapshot.Claimant
    }
    
    // 'value' attribute on TextInput (id=PrimaryAddress) at ClaimSnapshotGeneral310DV.wc.pcf: line 195, column 38
    function valueRoot_88 () : java.lang.Object {
      return Snapshot.Claimant.PrimaryAddress
    }
    
    // 'value' attribute on TextInput (id=LossType) at ClaimSnapshotGeneral310DV.wc.pcf: line 21, column 38
    function value_0 () : dynamic.Dynamic {
      return Snapshot.LossType
    }
    
    // 'value' attribute on TextInput (id=DepartmentCode) at ClaimSnapshotGeneral310DV.wc.pcf: line 222, column 38
    function value_100 () : dynamic.Dynamic {
      return Snapshot.EmploymentData.DepartmentCode
    }
    
    // 'value' attribute on TextInput (id=HireDate) at ClaimSnapshotGeneral310DV.wc.pcf: line 226, column 78
    function value_103 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.EmploymentData.HireDate)
    }
    
    // 'value' attribute on TextInput (id=HireState) at ClaimSnapshotGeneral310DV.wc.pcf: line 231, column 38
    function value_105 () : dynamic.Dynamic {
      return Snapshot.EmploymentData.HireState
    }
    
    // 'value' attribute on TextInput (id=EmploymentStatus) at ClaimSnapshotGeneral310DV.wc.pcf: line 236, column 38
    function value_108 () : dynamic.Dynamic {
      return Snapshot.EmploymentData.EmploymentStatus
    }
    
    // 'value' attribute on TextInput (id=Supervisor) at ClaimSnapshotGeneral310DV.wc.pcf: line 241, column 38
    function value_111 () : dynamic.Dynamic {
      return Snapshot.Supervisor.DisplayName
    }
    
    // 'value' attribute on TextInput (id=NumDaysWorked) at ClaimSnapshotGeneral310DV.wc.pcf: line 246, column 38
    function value_114 () : dynamic.Dynamic {
      return Snapshot.EmploymentData.NumDaysWorked
    }
    
    // 'value' attribute on TextInput (id=NumHoursWorked) at ClaimSnapshotGeneral310DV.wc.pcf: line 251, column 38
    function value_117 () : dynamic.Dynamic {
      return Snapshot.EmploymentData.NumHoursWorked
    }
    
    // 'value' attribute on TextInput (id=Catastrophe) at ClaimSnapshotGeneral310DV.wc.pcf: line 41, column 38
    function value_12 () : dynamic.Dynamic {
      return Snapshot.Catastrophe.DisplayName
    }
    
    // 'value' attribute on TextInput (id=WageAmount) at ClaimSnapshotGeneral310DV.wc.pcf: line 256, column 38
    function value_120 () : dynamic.Dynamic {
      return Snapshot.EmploymentData.WageAmount
    }
    
    // 'value' attribute on TextInput (id=PayPeriod) at ClaimSnapshotGeneral310DV.wc.pcf: line 261, column 38
    function value_123 () : dynamic.Dynamic {
      return Snapshot.EmploymentData.PayPeriod
    }
    
    // 'value' attribute on TextInput (id=InjuryStartTime) at ClaimSnapshotGeneral310DV.wc.pcf: line 265, column 85
    function value_126 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.EmploymentData.InjuryStartTime)
    }
    
    // 'value' attribute on BooleanRadioInput (id=PaidFull) at ClaimSnapshotGeneral310DV.wc.pcf: line 272, column 38
    function value_128 () : dynamic.Dynamic {
      return Snapshot.EmploymentData.PaidFull
    }
    
    // 'value' attribute on BooleanRadioInput (id=WagePaymentCont) at ClaimSnapshotGeneral310DV.wc.pcf: line 279, column 38
    function value_131 () : dynamic.Dynamic {
      return Snapshot.EmploymentData.WagePaymentCont
    }
    
    // 'value' attribute on BooleanRadioInput (id=ModifiedDutyAvail) at ClaimSnapshotGeneral310DV.wc.pcf: line 286, column 38
    function value_134 () : dynamic.Dynamic {
      return Snapshot.ModifiedDutyAvail
    }
    
    // 'value' attribute on BooleanRadioInput (id=InjuredRegularJob) at ClaimSnapshotGeneral310DV.wc.pcf: line 293, column 38
    function value_137 () : dynamic.Dynamic {
      return Snapshot.InjuredRegularJob
    }
    
    // 'value' attribute on TextInput (id=EmpQusValidity) at ClaimSnapshotGeneral310DV.wc.pcf: line 298, column 38
    function value_140 () : dynamic.Dynamic {
      return Snapshot.EmpQusValidity
    }
    
    // 'value' attribute on TextInput (id=EmployerValidityReason) at ClaimSnapshotGeneral310DV.wc.pcf: line 303, column 38
    function value_143 () : dynamic.Dynamic {
      return Snapshot.EmployerValidityReason
    }
    
    // 'value' attribute on TextInput (id=DrugsInvolved) at ClaimSnapshotGeneral310DV.wc.pcf: line 308, column 38
    function value_146 () : dynamic.Dynamic {
      return Snapshot.DrugsInvolved
    }
    
    // 'value' attribute on BooleanRadioInput (id=SafetyEquipProv) at ClaimSnapshotGeneral310DV.wc.pcf: line 315, column 38
    function value_149 () : dynamic.Dynamic {
      return Snapshot.SafetyEquipProv
    }
    
    // 'value' attribute on TextInput (id=Segment) at ClaimSnapshotGeneral310DV.wc.pcf: line 46, column 38
    function value_15 () : dynamic.Dynamic {
      return Snapshot.Segment
    }
    
    // 'value' attribute on BooleanRadioInput (id=SafetyEquipUsed) at ClaimSnapshotGeneral310DV.wc.pcf: line 322, column 38
    function value_152 () : dynamic.Dynamic {
      return Snapshot.SafetyEquipUsed
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral310DV.wc.pcf: line 334, column 41
    function value_176 () : dynamic.Dynamic {
      return Snapshot.ConcurrentEmpl
    }
    
    // 'value' attribute on TextInput (id=Strategy) at ClaimSnapshotGeneral310DV.wc.pcf: line 51, column 38
    function value_18 () : dynamic.Dynamic {
      return Snapshot.Strategy
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral310DV.wc.pcf: line 378, column 41
    function value_199 () : dynamic.Dynamic {
      return Snapshot.OtherBenefits
    }
    
    // 'value' attribute on TextInput (id=PermissionRequired) at ClaimSnapshotGeneral310DV.wc.pcf: line 56, column 38
    function value_21 () : dynamic.Dynamic {
      return Snapshot.PermissionRequired
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral310DV.wc.pcf: line 426, column 41
    function value_211 () : dynamic.Dynamic {
      return Snapshot.EmploymentData.WorkStatusChanges
    }
    
    // 'value' attribute on TextInput (id=DateCompDcsnDue) at ClaimSnapshotGeneral310DV.wc.pcf: line 452, column 70
    function value_212 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.DateCompDcsnDue)
    }
    
    // 'value' attribute on BooleanRadioInput (id=BenefitsStatusDcsn) at ClaimSnapshotGeneral310DV.wc.pcf: line 459, column 38
    function value_214 () : dynamic.Dynamic {
      return Snapshot.BenefitsStatusDcsn
    }
    
    // 'value' attribute on TextInput (id=DateCompDcsnMade) at ClaimSnapshotGeneral310DV.wc.pcf: line 463, column 71
    function value_217 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.DateCompDcsnMade)
    }
    
    // 'value' attribute on TextAreaInput (id=Reason) at ClaimSnapshotGeneral310DV.wc.pcf: line 470, column 38
    function value_219 () : dynamic.Dynamic {
      return Snapshot.BenefitsDecisionReason
    }
    
    // 'value' attribute on TextInput (id=ReportedDate) at ClaimSnapshotGeneral310DV.wc.pcf: line 477, column 67
    function value_222 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.ReportedDate)
    }
    
    // 'value' attribute on BooleanRadioInput (id=FirstNoticeSuit) at ClaimSnapshotGeneral310DV.wc.pcf: line 484, column 38
    function value_224 () : dynamic.Dynamic {
      return Snapshot.FirstNoticeSuit
    }
    
    // 'value' attribute on TextInput (id=HowReported) at ClaimSnapshotGeneral310DV.wc.pcf: line 489, column 38
    function value_227 () : dynamic.Dynamic {
      return Snapshot.HowReported
    }
    
    // 'value' attribute on TextInput (id=Reporter) at ClaimSnapshotGeneral310DV.wc.pcf: line 494, column 38
    function value_230 () : dynamic.Dynamic {
      return Snapshot.Reporter.DisplayName
    }
    
    // 'value' attribute on TextInput (id=ReportedByType) at ClaimSnapshotGeneral310DV.wc.pcf: line 499, column 38
    function value_233 () : dynamic.Dynamic {
      return Snapshot.ReportedByType
    }
    
    // 'value' attribute on TextInput (id=MainContact) at ClaimSnapshotGeneral310DV.wc.pcf: line 504, column 38
    function value_236 () : dynamic.Dynamic {
      return Snapshot.MainContact.DisplayName
    }
    
    // 'value' attribute on TextInput (id=MainContactType) at ClaimSnapshotGeneral310DV.wc.pcf: line 509, column 38
    function value_239 () : dynamic.Dynamic {
      return Snapshot.MainContactType
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at ClaimSnapshotGeneral310DV.wc.pcf: line 65, column 38
    function value_24 () : dynamic.Dynamic {
      return Snapshot.Description
    }
    
    // 'value' attribute on TextInput (id=ClaimantRprtdDate) at ClaimSnapshotGeneral310DV.wc.pcf: line 513, column 72
    function value_242 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.ClaimantRprtdDate)
    }
    
    // 'value' attribute on TextInput (id=DateRptdToEmployer) at ClaimSnapshotGeneral310DV.wc.pcf: line 517, column 73
    function value_244 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.DateRptdToEmployer)
    }
    
    // 'value' attribute on TextInput (id=DateFormGivenToEmp) at ClaimSnapshotGeneral310DV.wc.pcf: line 521, column 73
    function value_246 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.DateFormGivenToEmp)
    }
    
    // 'value' attribute on TextInput (id=DateFormRetByEmp) at ClaimSnapshotGeneral310DV.wc.pcf: line 525, column 71
    function value_248 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.DateFormRetByEmp)
    }
    
    // 'value' attribute on TextInput (id=LossLocation) at ClaimSnapshotGeneral310DV.wc.pcf: line 533, column 38
    function value_250 () : dynamic.Dynamic {
      return Snapshot.LossLocation.DisplayName
    }
    
    // 'value' attribute on TextInput (id=AddressLine2) at ClaimSnapshotGeneral310DV.wc.pcf: line 538, column 38
    function value_253 () : dynamic.Dynamic {
      return Snapshot.LossLocation.AddressLine2
    }
    
    // 'value' attribute on TextInput (id=LocationDescription) at ClaimSnapshotGeneral310DV.wc.pcf: line 543, column 38
    function value_256 () : dynamic.Dynamic {
      return Snapshot.LossLocation.Description
    }
    
    // 'value' attribute on TextInput (id=CreateTime) at ClaimSnapshotGeneral310DV.wc.pcf: line 550, column 65
    function value_259 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.CreateTime)
    }
    
    // 'value' attribute on TextInput (id=CloseDate) at ClaimSnapshotGeneral310DV.wc.pcf: line 554, column 64
    function value_261 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.CloseDate)
    }
    
    // 'value' attribute on TextInput (id=ClosedOutcome) at ClaimSnapshotGeneral310DV.wc.pcf: line 559, column 38
    function value_263 () : dynamic.Dynamic {
      return Snapshot.ClosedOutcome
    }
    
    // 'value' attribute on BooleanRadioInput (id=IncidentReport) at ClaimSnapshotGeneral310DV.wc.pcf: line 566, column 38
    function value_266 () : dynamic.Dynamic {
      return Snapshot.IncidentReport
    }
    
    // 'value' attribute on BooleanRadioInput (id=CoverageInQuestion) at ClaimSnapshotGeneral310DV.wc.pcf: line 573, column 38
    function value_269 () : dynamic.Dynamic {
      return Snapshot.CoverageInQuestion
    }
    
    // 'value' attribute on TextInput (id=DateOfInjury) at ClaimSnapshotGeneral310DV.wc.pcf: line 72, column 63
    function value_27 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.LossDate)
    }
    
    // 'value' attribute on TextInput (id=DeductibleStatus) at ClaimSnapshotGeneral310DV.wc.pcf: line 578, column 38
    function value_272 () : dynamic.Dynamic {
      return Snapshot.DeductibleStatus
    }
    
    // 'value' attribute on TextInput (id=LitigationStatus) at ClaimSnapshotGeneral310DV.wc.pcf: line 583, column 38
    function value_275 () : dynamic.Dynamic {
      return Snapshot.LitigationStatus
    }
    
    // 'value' attribute on TextInput (id=SubrogationStatus) at ClaimSnapshotGeneral310DV.wc.pcf: line 588, column 38
    function value_278 () : dynamic.Dynamic {
      return Snapshot.SubrogationStatus
    }
    
    // 'value' attribute on TextInput (id=OtherRecovStatus) at ClaimSnapshotGeneral310DV.wc.pcf: line 593, column 38
    function value_281 () : dynamic.Dynamic {
      return Snapshot.OtherRecovStatus
    }
    
    // 'value' attribute on TextInput (id=SIUStatus) at ClaimSnapshotGeneral310DV.wc.pcf: line 598, column 38
    function value_284 () : dynamic.Dynamic {
      return Snapshot.SIUStatus
    }
    
    // 'value' attribute on TextInput (id=ReinsuranceStatus) at ClaimSnapshotGeneral310DV.wc.pcf: line 603, column 38
    function value_287 () : dynamic.Dynamic {
      return Snapshot.ReinsuranceStatus
    }
    
    // 'value' attribute on TextInput (id=ExposureBegan) at ClaimSnapshotGeneral310DV.wc.pcf: line 76, column 68
    function value_29 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.ExposureBegan)
    }
    
    // 'value' attribute on TextInput (id=Flagged) at ClaimSnapshotGeneral310DV.wc.pcf: line 611, column 38
    function value_290 () : dynamic.Dynamic {
      return Snapshot.Flagged
    }
    
    // 'value' attribute on TextInput (id=FlaggedDate) at ClaimSnapshotGeneral310DV.wc.pcf: line 615, column 66
    function value_293 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.FlaggedDate)
    }
    
    // 'value' attribute on TextInput (id=FlaggedReason) at ClaimSnapshotGeneral310DV.wc.pcf: line 620, column 38
    function value_295 () : dynamic.Dynamic {
      return Snapshot.FlaggedReason
    }
    
    // 'value' attribute on TextInput (id=LOBCode) at ClaimSnapshotGeneral310DV.wc.pcf: line 26, column 38
    function value_3 () : dynamic.Dynamic {
      return Snapshot.LOBCode
    }
    
    // 'value' attribute on TextInput (id=ExposureEnded) at ClaimSnapshotGeneral310DV.wc.pcf: line 80, column 68
    function value_31 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.ExposureEnded)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral310DV.wc.pcf: line 633, column 41
    function value_310 () : dynamic.Dynamic {
      return Snapshot.Officials
    }
    
    // 'value' attribute on BooleanRadioInput (id=EmploymentInjury) at ClaimSnapshotGeneral310DV.wc.pcf: line 87, column 38
    function value_33 () : dynamic.Dynamic {
      return Snapshot.EmploymentInjury
    }
    
    // 'value' attribute on TextInput (id=LocationCode) at ClaimSnapshotGeneral310DV.wc.pcf: line 91, column 67
    function value_36 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.LocationCode)
    }
    
    // 'value' attribute on TextInput (id=JurisdictionState) at ClaimSnapshotGeneral310DV.wc.pcf: line 96, column 38
    function value_38 () : dynamic.Dynamic {
      return Snapshot.JurisdictionState
    }
    
    // 'value' attribute on BooleanRadioInput (id=InsuredPremises) at ClaimSnapshotGeneral310DV.wc.pcf: line 103, column 38
    function value_41 () : dynamic.Dynamic {
      return Snapshot.InsuredPremises
    }
    
    // 'value' attribute on TextInput (id=Severity) at ClaimSnapshotGeneral310DV.wc.pcf: line 108, column 38
    function value_44 () : dynamic.Dynamic {
      return Snapshot.Severity
    }
    
    // 'value' attribute on TextInput (id=LossCause) at ClaimSnapshotGeneral310DV.wc.pcf: line 116, column 38
    function value_47 () : dynamic.Dynamic {
      return Snapshot.LossCause
    }
    
    // 'value' attribute on TextInput (id=AccidentType) at ClaimSnapshotGeneral310DV.wc.pcf: line 121, column 38
    function value_50 () : dynamic.Dynamic {
      return Snapshot.AccidentType
    }
    
    // 'value' attribute on TextInput (id=PrimaryInjury) at ClaimSnapshotGeneral310DV.wc.pcf: line 126, column 38
    function value_53 () : dynamic.Dynamic {
      return Snapshot.PrimaryInjury
    }
    
    // 'value' attribute on TextInput (id=DetailedInjury) at ClaimSnapshotGeneral310DV.wc.pcf: line 131, column 38
    function value_56 () : dynamic.Dynamic {
      return Snapshot.DetailedInjury
    }
    
    // 'value' attribute on TextInput (id=PrimaryBodyPart) at ClaimSnapshotGeneral310DV.wc.pcf: line 136, column 38
    function value_59 () : dynamic.Dynamic {
      return Snapshot.PrimaryBodyPart
    }
    
    // 'value' attribute on TextInput (id=Contact) at ClaimSnapshotGeneral310DV.wc.pcf: line 31, column 38
    function value_6 () : dynamic.Dynamic {
      return Snapshot.AssignedUser.Contact.DisplayName
    }
    
    // 'value' attribute on TextAreaInput (id=DetailedBodyPart) at ClaimSnapshotGeneral310DV.wc.pcf: line 143, column 38
    function value_62 () : dynamic.Dynamic {
      return Snapshot.DetailedBodyPart
    }
    
    // 'value' attribute on TextInput (id=InjuryDescription) at ClaimSnapshotGeneral310DV.wc.pcf: line 148, column 38
    function value_65 () : dynamic.Dynamic {
      return Snapshot.InjuryDescription
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral310DV.wc.pcf: line 158, column 41
    function value_80 () : dynamic.Dynamic {
      return Snapshot.BodyPartDetails
    }
    
    // 'value' attribute on TextInput (id=Claimant) at ClaimSnapshotGeneral310DV.wc.pcf: line 186, column 38
    function value_81 () : dynamic.Dynamic {
      return Snapshot.Claimant.DisplayName
    }
    
    // 'value' attribute on TextInput (id=PrimaryPhone) at ClaimSnapshotGeneral310DV.wc.pcf: line 190, column 67
    function value_84 () : java.lang.String {
      return util.Snapshot.getPrimaryPhone(Snapshot.Claimant)
    }
    
    // 'value' attribute on TextInput (id=PrimaryAddress) at ClaimSnapshotGeneral310DV.wc.pcf: line 195, column 38
    function value_86 () : dynamic.Dynamic {
      return Snapshot.Claimant.PrimaryAddress.DisplayName
    }
    
    // 'value' attribute on TextInput (id=DateOfBirth) at ClaimSnapshotGeneral310DV.wc.pcf: line 199, column 75
    function value_89 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.Claimant.DateOfBirth)
    }
    
    // 'value' attribute on TextInput (id=NurseCaseMgr) at ClaimSnapshotGeneral310DV.wc.pcf: line 36, column 38
    function value_9 () : dynamic.Dynamic {
      return Snapshot.NurseCaseMgr.DisplayName
    }
    
    // 'value' attribute on PrivacyInput (id=TaxID) at ClaimSnapshotGeneral310DV.wc.pcf: line 205, column 38
    function value_91 () : dynamic.Dynamic {
      return Snapshot.Claimant.TaxID
    }
    
    // 'value' attribute on TextInput (id=Occupation) at ClaimSnapshotGeneral310DV.wc.pcf: line 213, column 38
    function value_95 () : dynamic.Dynamic {
      return Snapshot.Claimant.Occupation
    }
    
    // 'value' attribute on TextInput (id=EmpClass) at ClaimSnapshotGeneral310DV.wc.pcf: line 217, column 78
    function value_98 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.EmploymentData.EmpClass)
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
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends ClaimSnapshotGeneral310DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=CompanyName) at ClaimSnapshotGeneral310DV.wc.pcf: line 340, column 46
    function valueRoot_163 () : java.lang.Object {
      return ConcurrentEmpl
    }
    
    // 'value' attribute on TextCell (id=CompanyName) at ClaimSnapshotGeneral310DV.wc.pcf: line 340, column 46
    function value_161 () : dynamic.Dynamic {
      return ConcurrentEmpl.CompanyName
    }
    
    // 'value' attribute on TextCell (id=StartDate) at ClaimSnapshotGeneral310DV.wc.pcf: line 344, column 78
    function value_164 () : java.lang.String {
      return util.Snapshot.renderValue(ConcurrentEmpl.StartDate)
    }
    
    // 'value' attribute on TextCell (id=EndDate) at ClaimSnapshotGeneral310DV.wc.pcf: line 348, column 76
    function value_166 () : java.lang.String {
      return util.Snapshot.renderValue(ConcurrentEmpl.EndDate)
    }
    
    // 'value' attribute on TextCell (id=FullTime) at ClaimSnapshotGeneral310DV.wc.pcf: line 352, column 77
    function value_168 () : java.lang.String {
      return util.Snapshot.renderValue(ConcurrentEmpl.FullTime)
    }
    
    // 'value' attribute on TextCell (id=WeeklyWage) at ClaimSnapshotGeneral310DV.wc.pcf: line 357, column 46
    function value_170 () : dynamic.Dynamic {
      return ConcurrentEmpl.WeeklyWage
    }
    
    // 'value' attribute on TextCell (id=JobTitle) at ClaimSnapshotGeneral310DV.wc.pcf: line 362, column 46
    function value_173 () : dynamic.Dynamic {
      return ConcurrentEmpl.JobTitle
    }
    
    property get ConcurrentEmpl () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry3ExpressionsImpl extends ClaimSnapshotGeneral310DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=ReferenceNumber) at ClaimSnapshotGeneral310DV.wc.pcf: line 384, column 46
    function valueRoot_185 () : java.lang.Object {
      return OtherBenefit
    }
    
    // 'value' attribute on TextCell (id=ReferenceNumber) at ClaimSnapshotGeneral310DV.wc.pcf: line 384, column 46
    function value_183 () : dynamic.Dynamic {
      return OtherBenefit.ReferenceNumber
    }
    
    // 'value' attribute on TextCell (id=Amount) at ClaimSnapshotGeneral310DV.wc.pcf: line 389, column 46
    function value_186 () : dynamic.Dynamic {
      return OtherBenefit.Amount
    }
    
    // 'value' attribute on TextCell (id=StartDate) at ClaimSnapshotGeneral310DV.wc.pcf: line 393, column 76
    function value_189 () : java.lang.String {
      return util.Snapshot.renderValue(OtherBenefit.StartDate)
    }
    
    // 'value' attribute on TextCell (id=EndDate) at ClaimSnapshotGeneral310DV.wc.pcf: line 397, column 74
    function value_191 () : java.lang.String {
      return util.Snapshot.renderValue(OtherBenefit.EndDate)
    }
    
    // 'value' attribute on TextCell (id=InitialContact) at ClaimSnapshotGeneral310DV.wc.pcf: line 402, column 46
    function value_193 () : dynamic.Dynamic {
      return OtherBenefit.InitialContact
    }
    
    // 'value' attribute on TextCell (id=Comments) at ClaimSnapshotGeneral310DV.wc.pcf: line 407, column 46
    function value_196 () : dynamic.Dynamic {
      return OtherBenefit.Comments
    }
    
    property get OtherBenefit () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry4ExpressionsImpl extends ClaimSnapshotGeneral310DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Status) at ClaimSnapshotGeneral310DV.wc.pcf: line 436, column 46
    function valueRoot_207 () : java.lang.Object {
      return WorkStatusChange
    }
    
    // 'value' attribute on TextCell (id=StatusDate) at ClaimSnapshotGeneral310DV.wc.pcf: line 431, column 81
    function value_203 () : java.lang.String {
      return util.Snapshot.renderValue(WorkStatusChange.StatusDate)
    }
    
    // 'value' attribute on TextCell (id=Status) at ClaimSnapshotGeneral310DV.wc.pcf: line 436, column 46
    function value_205 () : dynamic.Dynamic {
      return WorkStatusChange.Status
    }
    
    // 'value' attribute on TextCell (id=Comments) at ClaimSnapshotGeneral310DV.wc.pcf: line 441, column 46
    function value_208 () : dynamic.Dynamic {
      return WorkStatusChange.Comments
    }
    
    property get WorkStatusChange () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry5ExpressionsImpl extends ClaimSnapshotGeneral310DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Type) at ClaimSnapshotGeneral310DV.wc.pcf: line 639, column 46
    function valueRoot_303 () : java.lang.Object {
      return Official
    }
    
    // 'value' attribute on TextCell (id=Type) at ClaimSnapshotGeneral310DV.wc.pcf: line 639, column 46
    function value_301 () : dynamic.Dynamic {
      return Official.OfficialType
    }
    
    // 'value' attribute on TextCell (id=Name) at ClaimSnapshotGeneral310DV.wc.pcf: line 644, column 46
    function value_304 () : dynamic.Dynamic {
      return Official.Name
    }
    
    // 'value' attribute on TextCell (id=ReportNumber) at ClaimSnapshotGeneral310DV.wc.pcf: line 649, column 46
    function value_307 () : dynamic.Dynamic {
      return Official.ReportNumber
    }
    
    property get Official () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotGeneral310DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=PrimaryBodyPart) at ClaimSnapshotGeneral310DV.wc.pcf: line 164, column 46
    function valueRoot_73 () : java.lang.Object {
      return BodyPart
    }
    
    // 'value' attribute on TextCell (id=PrimaryBodyPart) at ClaimSnapshotGeneral310DV.wc.pcf: line 164, column 46
    function value_71 () : dynamic.Dynamic {
      return BodyPart.PrimaryBodyPart
    }
    
    // 'value' attribute on TextCell (id=DetailedBodyPart) at ClaimSnapshotGeneral310DV.wc.pcf: line 169, column 46
    function value_74 () : dynamic.Dynamic {
      return BodyPart.DetailedBodyPart
    }
    
    // 'value' attribute on TextCell (id=Compensability) at ClaimSnapshotGeneral310DV.wc.pcf: line 174, column 46
    function value_77 () : dynamic.Dynamic {
      return BodyPart.Compensability
    }
    
    property get BodyPart () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}