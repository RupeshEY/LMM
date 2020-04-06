package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotGeneral700PanelSet.wc.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotGeneral700PanelSet_wcExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotGeneral700PanelSet.wc.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotGeneral700PanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 59, column 29
    function def_onEnter_17 (def :  pcf.AddressSnapshot700InputSet) : void {
      def.onEnter(Snapshot.LossLocation, Snapshot)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 59, column 29
    function def_refreshVariables_18 (def :  pcf.AddressSnapshot700InputSet) : void {
      def.refreshVariables(Snapshot.LossLocation, Snapshot)
    }
    
    // 'encryptionExpression' attribute on PrivacyInput (id=TaxID) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 242, column 40
    function encryptionExpression_112 (VALUE :  dynamic.Dynamic) : java.lang.String {
      return gw.api.privacy.EncryptionMaskExpressions.maskTaxId(VALUE as String)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 376, column 48
    function sortValue_178 (ConcurrentEmpl :  dynamic.Dynamic) : java.lang.Object {
      return ConcurrentEmpl.CompanyName
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 380, column 80
    function sortValue_179 (ConcurrentEmpl :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(ConcurrentEmpl.StartDate)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 384, column 78
    function sortValue_180 (ConcurrentEmpl :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(ConcurrentEmpl.EndDate)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 388, column 79
    function sortValue_181 (ConcurrentEmpl :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(ConcurrentEmpl.FullTime)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 393, column 48
    function sortValue_182 (ConcurrentEmpl :  dynamic.Dynamic) : java.lang.Object {
      return ConcurrentEmpl.WeeklyWage
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 398, column 48
    function sortValue_183 (ConcurrentEmpl :  dynamic.Dynamic) : java.lang.Object {
      return ConcurrentEmpl.JobTitle
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 420, column 83
    function sortValue_200 (WorkStatusChange :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(WorkStatusChange.StatusDate)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 425, column 48
    function sortValue_201 (WorkStatusChange :  dynamic.Dynamic) : java.lang.Object {
      return WorkStatusChange.Status
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 430, column 48
    function sortValue_202 (WorkStatusChange :  dynamic.Dynamic) : java.lang.Object {
      return WorkStatusChange.Comments
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 495, column 48
    function sortValue_233 (Official :  dynamic.Dynamic) : java.lang.Object {
      return Official.OfficialType
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 500, column 48
    function sortValue_234 (Official :  dynamic.Dynamic) : java.lang.Object {
      return Official.Name
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 505, column 48
    function sortValue_235 (Official :  dynamic.Dynamic) : java.lang.Object {
      return Official.ReportNumber
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 154, column 48
    function sortValue_64 (BodyPart :  dynamic.Dynamic) : java.lang.Object {
      return BodyPart.PrimaryBodyPart
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 159, column 48
    function sortValue_65 (BodyPart :  dynamic.Dynamic) : java.lang.Object {
      return BodyPart.DetailedBodyPart
    }
    
    // 'value' attribute on TextInput (id=Catastrophe) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 37, column 40
    function valueRoot_10 () : java.lang.Object {
      return Snapshot.Catastrophe
    }
    
    // 'value' attribute on TextInput (id=PrimaryAddress) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 232, column 40
    function valueRoot_106 () : java.lang.Object {
      return Snapshot.Claimant.PrimaryAddress
    }
    
    // 'value' attribute on DateInput (id=HireDate) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 261, column 40
    function valueRoot_120 () : java.lang.Object {
      return Snapshot.EmploymentData
    }
    
    // 'value' attribute on TextInput (id=Supervisor) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 276, column 40
    function valueRoot_129 () : java.lang.Object {
      return Snapshot.Supervisor
    }
    
    // 'value' attribute on TextInput (id=LossType) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 23, column 40
    function valueRoot_2 () : java.lang.Object {
      return Snapshot
    }
    
    // 'value' attribute on TextInput (id=LocationDescription) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 64, column 40
    function valueRoot_21 () : java.lang.Object {
      return Snapshot.LossLocation
    }
    
    // 'value' attribute on TextInput (id=Reporter) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 442, column 40
    function valueRoot_214 () : java.lang.Object {
      return Snapshot.Reporter
    }
    
    // 'value' attribute on TextInput (id=MainContact) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 452, column 40
    function valueRoot_220 () : java.lang.Object {
      return Snapshot.MainContact
    }
    
    // 'value' attribute on TextInput (id=Severity) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 112, column 40
    function valueRoot_48 () : java.lang.Object {
      return Snapshot.ClaimInjuryIncident
    }
    
    // 'value' attribute on TextInput (id=MedCase_FirstIntakeDoctor) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 171, column 40
    function valueRoot_75 () : java.lang.Object {
      return Snapshot.FirstIntakeDoctor
    }
    
    // 'value' attribute on TextInput (id=MedCase_Hospital) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 197, column 40
    function valueRoot_90 () : java.lang.Object {
      return Snapshot.Hospital
    }
    
    // 'value' attribute on TextInput (id=Claimant) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 218, column 40
    function valueRoot_99 () : java.lang.Object {
      return Snapshot.Claimant
    }
    
    // 'value' attribute on TextInput (id=LossType) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 23, column 40
    function value_0 () : dynamic.Dynamic {
      return Snapshot.LossType
    }
    
    // 'value' attribute on BooleanRadioInput (id=ContactProhibited) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 223, column 40
    function value_100 () : dynamic.Dynamic {
      return util.Snapshot.getClaimant(Snapshot, null)["ContactProhibited"]
    }
    
    // 'value' attribute on TextInput (id=PrimaryPhone) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 227, column 69
    function value_102 () : java.lang.String {
      return util.Snapshot.getPrimaryPhone(Snapshot.Claimant)
    }
    
    // 'value' attribute on TextInput (id=PrimaryAddress) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 232, column 40
    function value_104 () : dynamic.Dynamic {
      return Snapshot.Claimant.PrimaryAddress.DisplayName
    }
    
    // 'value' attribute on TextInput (id=DateOfBirth) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 236, column 76
    function value_107 () : java.lang.String {
      return util.Snapshot.renderDate(Snapshot.Claimant.DateOfBirth)
    }
    
    // 'value' attribute on PrivacyInput (id=TaxID) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 242, column 40
    function value_109 () : dynamic.Dynamic {
      return Snapshot.Claimant.TaxID
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 46, column 40
    function value_11 () : dynamic.Dynamic {
      return Snapshot.Description
    }
    
    // 'value' attribute on TextInput (id=Occupation) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 250, column 40
    function value_113 () : dynamic.Dynamic {
      return Snapshot.Claimant.Occupation
    }
    
    // 'value' attribute on TextInput (id=EmpClass) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 254, column 81
    function value_116 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.EmploymentData.ClassCode)
    }
    
    // 'value' attribute on DateInput (id=HireDate) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 261, column 40
    function value_118 () : dynamic.Dynamic {
      return Snapshot.EmploymentData.HireDate
    }
    
    // 'value' attribute on TextInput (id=HireState) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 266, column 40
    function value_121 () : dynamic.Dynamic {
      return Snapshot.EmploymentData.HireState
    }
    
    // 'value' attribute on TextInput (id=EmploymentStatus) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 271, column 40
    function value_124 () : dynamic.Dynamic {
      return Snapshot.EmploymentData.EmploymentStatus
    }
    
    // 'value' attribute on TextInput (id=Supervisor) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 276, column 40
    function value_127 () : dynamic.Dynamic {
      return Snapshot.Supervisor.DisplayName
    }
    
    // 'value' attribute on TextInput (id=NumDaysWorked) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 281, column 40
    function value_130 () : dynamic.Dynamic {
      return Snapshot.EmploymentData.NumDaysWorked
    }
    
    // 'value' attribute on TextInput (id=NumHoursWorked) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 286, column 40
    function value_133 () : dynamic.Dynamic {
      return Snapshot.EmploymentData.NumHoursWorked
    }
    
    // 'value' attribute on TextInput (id=WageAmount) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 291, column 40
    function value_136 () : dynamic.Dynamic {
      return Snapshot.EmploymentData.WageAmount
    }
    
    // 'value' attribute on TextInput (id=PayPeriod) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 296, column 40
    function value_139 () : dynamic.Dynamic {
      return Snapshot.EmploymentData.PayPeriod
    }
    
    // 'value' attribute on DateInput (id=DateOfInjury) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 56, column 40
    function value_14 () : dynamic.Dynamic {
      return Snapshot.LossDate
    }
    
    // 'value' attribute on DateInput (id=InjuryStartDate) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 302, column 40
    function value_142 () : dynamic.Dynamic {
      return Snapshot.EmploymentData.InjuryStartTime
    }
    
    // 'value' attribute on BooleanRadioInput (id=PaidFull) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 313, column 40
    function value_148 () : dynamic.Dynamic {
      return Snapshot.EmploymentData.PaidFull
    }
    
    // 'value' attribute on BooleanRadioInput (id=WagePaymentCont) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 318, column 40
    function value_151 () : dynamic.Dynamic {
      return Snapshot.EmploymentData.WagePaymentCont
    }
    
    // 'value' attribute on BooleanRadioInput (id=ModifiedDutyAvail) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 323, column 40
    function value_154 () : dynamic.Dynamic {
      return Snapshot.ModifiedDutyAvail
    }
    
    // 'value' attribute on BooleanRadioInput (id=InjuredRegularJob) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 328, column 40
    function value_157 () : dynamic.Dynamic {
      return Snapshot.InjuredRegularJob
    }
    
    // 'value' attribute on TextInput (id=EquipmentUsed) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 333, column 40
    function value_160 () : dynamic.Dynamic {
      return Snapshot.EquipmentUsed
    }
    
    // 'value' attribute on TextInput (id=ActivityPerformed) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 338, column 40
    function value_163 () : dynamic.Dynamic {
      return Snapshot.ActivityPerformed
    }
    
    // 'value' attribute on TextInput (id=DrugsInvolved) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 343, column 40
    function value_166 () : dynamic.Dynamic {
      return Snapshot.DrugsInvolved
    }
    
    // 'value' attribute on BooleanRadioInput (id=SafetyEquipProv) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 348, column 40
    function value_169 () : dynamic.Dynamic {
      return Snapshot.SafetyEquipProv
    }
    
    // 'value' attribute on BooleanRadioInput (id=SafetyEquipUsed) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 353, column 40
    function value_172 () : dynamic.Dynamic {
      return Snapshot.SafetyEquipUsed
    }
    
    // 'value' attribute on TextInput (id=ConcurrentEmployment) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 358, column 40
    function value_175 () : dynamic.Dynamic {
      return Snapshot.ConcurrentEmp
    }
    
    // 'value' attribute on TextInput (id=LocationDescription) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 64, column 40
    function value_19 () : dynamic.Dynamic {
      return Snapshot.LossLocation.Description
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 370, column 43
    function value_199 () : dynamic.Dynamic {
      return Snapshot.ConcurrentEmpl
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 415, column 43
    function value_211 () : dynamic.Dynamic {
      return Snapshot.EmploymentData.WorkStatusChanges
    }
    
    // 'value' attribute on TextInput (id=Reporter) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 442, column 40
    function value_212 () : dynamic.Dynamic {
      return Snapshot.Reporter.DisplayName
    }
    
    // 'value' attribute on TextInput (id=ReportedByType) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 447, column 40
    function value_215 () : dynamic.Dynamic {
      return Snapshot.ReportedByType
    }
    
    // 'value' attribute on TextInput (id=MainContact) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 452, column 40
    function value_218 () : dynamic.Dynamic {
      return Snapshot.MainContact.DisplayName
    }
    
    // 'value' attribute on BooleanRadioInput (id=InsuredPremises) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 69, column 40
    function value_22 () : dynamic.Dynamic {
      return Snapshot.InsuredPremises
    }
    
    // 'value' attribute on TextInput (id=MainContactType) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 457, column 40
    function value_221 () : dynamic.Dynamic {
      return Snapshot.MainContactType
    }
    
    // 'value' attribute on DateInput (id=ReportedDate) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 464, column 40
    function value_224 () : dynamic.Dynamic {
      return Snapshot.ReportedDate
    }
    
    // 'value' attribute on BooleanRadioInput (id=FirstNoticeSuit) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 469, column 40
    function value_227 () : dynamic.Dynamic {
      return Snapshot.FirstNoticeSuit
    }
    
    // 'value' attribute on DateInput (id=DateRptdToEmployer) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 476, column 40
    function value_230 () : dynamic.Dynamic {
      return Snapshot.DateRptdToEmployer
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 489, column 43
    function value_245 () : dynamic.Dynamic {
      return Snapshot.Officials
    }
    
    // 'value' attribute on DateInput (id=CreateTime) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 517, column 40
    function value_246 () : dynamic.Dynamic {
      return Snapshot.CreateTime
    }
    
    // 'value' attribute on TextInput (id=ValidationLevel) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 522, column 40
    function value_249 () : dynamic.Dynamic {
      return Snapshot.ValidationLevel
    }
    
    // 'value' attribute on BooleanRadioInput (id=EmploymentInjury) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 74, column 40
    function value_25 () : dynamic.Dynamic {
      return Snapshot.EmploymentInjury
    }
    
    // 'value' attribute on TextInput (id=JurisdictionState) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 79, column 40
    function value_28 () : dynamic.Dynamic {
      return Snapshot.JurisdictionState
    }
    
    // 'value' attribute on TextInput (id=LOBCode) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 28, column 40
    function value_3 () : dynamic.Dynamic {
      return Snapshot.LOBCode
    }
    
    // 'value' attribute on BooleanRadioInput (id=IncidentReport) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 87, column 40
    function value_31 () : dynamic.Dynamic {
      return Snapshot.IncidentReport
    }
    
    // 'value' attribute on BooleanRadioInput (id=MedicalReport) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 92, column 40
    function value_34 () : dynamic.Dynamic {
      return Snapshot.MedicalReport
    }
    
    // 'value' attribute on BooleanRadioInput (id=TimeLossReport) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 97, column 40
    function value_37 () : dynamic.Dynamic {
      return Snapshot.TimeLossReport
    }
    
    // 'value' attribute on BooleanRadioInput (id=DeathReport) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 102, column 40
    function value_40 () : dynamic.Dynamic {
      return Snapshot.DeathReport
    }
    
    // 'value' attribute on TextInput (id=DeathDate) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 107, column 40
    function value_43 () : dynamic.Dynamic {
      return Snapshot.DeathDate
    }
    
    // 'value' attribute on TextInput (id=Severity) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 112, column 40
    function value_46 () : dynamic.Dynamic {
      return Snapshot.ClaimInjuryIncident.Severity
    }
    
    // 'value' attribute on TextInput (id=LossCause) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 117, column 40
    function value_49 () : dynamic.Dynamic {
      return Snapshot.LossCause
    }
    
    // 'value' attribute on TextInput (id=AccidentType) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 122, column 40
    function value_52 () : dynamic.Dynamic {
      return Snapshot.AccidentType
    }
    
    // 'value' attribute on TextInput (id=PrimaryInjury) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 127, column 40
    function value_55 () : dynamic.Dynamic {
      return Snapshot.ClaimInjuryIncident.GeneralInjuryType
    }
    
    // 'value' attribute on TextInput (id=DetailedInjury) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 132, column 40
    function value_58 () : dynamic.Dynamic {
      return Snapshot.ClaimInjuryIncident.DetailedInjuryType
    }
    
    // 'value' attribute on TextInput (id=LocationCode) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 32, column 69
    function value_6 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.LocationCode)
    }
    
    // 'value' attribute on TextInput (id=InjuryDescription) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 137, column 40
    function value_61 () : dynamic.Dynamic {
      return Snapshot.ClaimInjuryIncident.Description
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 148, column 43
    function value_72 () : dynamic.Dynamic {
      return Snapshot.ClaimInjuryIncident.BodyParts
    }
    
    // 'value' attribute on TextInput (id=MedCase_FirstIntakeDoctor) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 171, column 40
    function value_73 () : dynamic.Dynamic {
      return Snapshot.FirstIntakeDoctor.DisplayName
    }
    
    // 'value' attribute on TextInput (id=MedCase_MedicalDiagnosis) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 176, column 40
    function value_76 () : dynamic.Dynamic {
      return Snapshot.MedicalDiagnosis
    }
    
    // 'value' attribute on DateInput (id=MedCase_ExaminationDate) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 182, column 40
    function value_79 () : dynamic.Dynamic {
      return Snapshot.ExaminationDate
    }
    
    // 'value' attribute on TextInput (id=Catastrophe) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 37, column 40
    function value_8 () : dynamic.Dynamic {
      return Snapshot.Catastrophe.DisplayName
    }
    
    // 'value' attribute on TextInput (id=MedCase_MedicalTreatment) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 187, column 40
    function value_82 () : dynamic.Dynamic {
      return Snapshot.ClaimInjuryIncident.MedicalTreatmentType
    }
    
    // 'value' attribute on TextAreaInput (id=MedCase_TreatmentRend) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 192, column 40
    function value_85 () : dynamic.Dynamic {
      return Snapshot.TreatmentRend
    }
    
    // 'value' attribute on TextInput (id=MedCase_Hospital) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 197, column 40
    function value_88 () : dynamic.Dynamic {
      return Snapshot.Hospital.DisplayName
    }
    
    // 'value' attribute on DateInput (id=MedCase_HospitalDate) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 203, column 40
    function value_91 () : dynamic.Dynamic {
      return Snapshot.HospitalDate
    }
    
    // 'value' attribute on TextInput (id=MedCase_HospitalDays) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 208, column 40
    function value_94 () : dynamic.Dynamic {
      return Snapshot.HospitalDays
    }
    
    // 'value' attribute on TextInput (id=Claimant) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 218, column 40
    function value_97 () : dynamic.Dynamic {
      return Snapshot.Claimant.DisplayName
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
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotGeneral700PanelSet.wc.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends ClaimSnapshotGeneral700PanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=CompanyName) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 376, column 48
    function valueRoot_186 () : java.lang.Object {
      return ConcurrentEmpl
    }
    
    // 'value' attribute on TextCell (id=CompanyName) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 376, column 48
    function value_184 () : dynamic.Dynamic {
      return ConcurrentEmpl.CompanyName
    }
    
    // 'value' attribute on TextCell (id=StartDate) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 380, column 80
    function value_187 () : java.lang.String {
      return util.Snapshot.renderValue(ConcurrentEmpl.StartDate)
    }
    
    // 'value' attribute on TextCell (id=EndDate) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 384, column 78
    function value_189 () : java.lang.String {
      return util.Snapshot.renderValue(ConcurrentEmpl.EndDate)
    }
    
    // 'value' attribute on TextCell (id=FullTime) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 388, column 79
    function value_191 () : java.lang.String {
      return util.Snapshot.renderValue(ConcurrentEmpl.FullTime)
    }
    
    // 'value' attribute on TextCell (id=WeeklyWage) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 393, column 48
    function value_193 () : dynamic.Dynamic {
      return ConcurrentEmpl.WeeklyWage
    }
    
    // 'value' attribute on TextCell (id=JobTitle) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 398, column 48
    function value_196 () : dynamic.Dynamic {
      return ConcurrentEmpl.JobTitle
    }
    
    property get ConcurrentEmpl () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotGeneral700PanelSet.wc.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry3ExpressionsImpl extends ClaimSnapshotGeneral700PanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Status) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 425, column 48
    function valueRoot_207 () : java.lang.Object {
      return WorkStatusChange
    }
    
    // 'value' attribute on TextCell (id=StatusDate) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 420, column 83
    function value_203 () : java.lang.String {
      return util.Snapshot.renderValue(WorkStatusChange.StatusDate)
    }
    
    // 'value' attribute on TextCell (id=Status) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 425, column 48
    function value_205 () : dynamic.Dynamic {
      return WorkStatusChange.Status
    }
    
    // 'value' attribute on TextCell (id=Comments) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 430, column 48
    function value_208 () : dynamic.Dynamic {
      return WorkStatusChange.Comments
    }
    
    property get WorkStatusChange () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotGeneral700PanelSet.wc.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry4ExpressionsImpl extends ClaimSnapshotGeneral700PanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Type) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 495, column 48
    function valueRoot_238 () : java.lang.Object {
      return Official
    }
    
    // 'value' attribute on TextCell (id=Type) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 495, column 48
    function value_236 () : dynamic.Dynamic {
      return Official.OfficialType
    }
    
    // 'value' attribute on TextCell (id=Name) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 500, column 48
    function value_239 () : dynamic.Dynamic {
      return Official.Name
    }
    
    // 'value' attribute on TextCell (id=ReportNumber) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 505, column 48
    function value_242 () : dynamic.Dynamic {
      return Official.ReportNumber
    }
    
    property get Official () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotGeneral700PanelSet.wc.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotGeneral700PanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=PrimaryBodyPart) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 154, column 48
    function valueRoot_68 () : java.lang.Object {
      return BodyPart
    }
    
    // 'value' attribute on TextCell (id=PrimaryBodyPart) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 154, column 48
    function value_66 () : dynamic.Dynamic {
      return BodyPart.PrimaryBodyPart
    }
    
    // 'value' attribute on TextCell (id=DetailedBodyPart) at ClaimSnapshotGeneral700PanelSet.wc.pcf: line 159, column 48
    function value_69 () : dynamic.Dynamic {
      return BodyPart.DetailedBodyPart
    }
    
    property get BodyPart () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}