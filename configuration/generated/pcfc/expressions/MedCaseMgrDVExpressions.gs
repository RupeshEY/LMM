package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/medicalcasemgmt/MedCaseMgrDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class MedCaseMgrDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/medicalcasemgmt/MedCaseMgrDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MedCaseMgrDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=Make_Primary) at MedCaseMgrDV.pcf: line 72, column 137
    function checkedRowAction_13 (element :  entity.InjuryDiagnosis, CheckedValue :  entity.InjuryDiagnosis) : void {
      CheckedValue.InjuryIncident.setPrimaryDiagnosisToFalse(); CheckedValue.IsPrimary = true
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=Reconfirmed_Diagnosis) at MedCaseMgrDV.pcf: line 79, column 114
    function checkedRowAction_14 (element :  entity.InjuryDiagnosis, CheckedValue :  entity.InjuryDiagnosis) : void {
      CheckedValue.reconfirmDiagnosis()
    }
    
    // 'confirmMessage' attribute on CheckedValuesToolbarButton (id=Make_Primary) at MedCaseMgrDV.pcf: line 72, column 137
    function confirmMessage_11 () : java.lang.String {
      return DisplayKey.get("NVV.Claim.MedCaseMgrDetails.MedicalDiagnosis.MakePrimary.Confirm",  Claim.ensureClaimInjuryIncident().InjuryDiagnoses.firstWhere( \ i -> i.IsPrimary == true ).ICDCode.Code + " : " +  Claim.ensureClaimInjuryIncident().InjuryDiagnoses.firstWhere( \ i -> i.IsPrimary == true ).ICDCode.CodeDesc)
    }
    
    // 'def' attribute on ListViewInput at MedCaseMgrDV.pcf: line 21, column 27
    function def_onEnter_1 (def :  pcf.MedicalPersonnelLV) : void {
      def.onEnter(Claim.getAllContactsWithRoles((new ContactRole[] {TC_DOCTOR,TC_FIRSTINTAKEDOCTOR,TC_PRIMARYDOCTOR,TC_OCCTHERAPIST,TC_PHYSTHERAPIST,TC_NURSECASEMGR,TC_CASEMGR,TC_CASEMGMTCO,TC_HOSPITAL})?.toList()))
    }
    
    // 'def' attribute on ListViewInput (id=MedicalDiagnosisLVInput) at MedCaseMgrDV.pcf: line 58, column 27
    function def_onEnter_15 (def :  pcf.MedicalDiagnosisLV) : void {
      def.onEnter(Claim.ensureClaimInjuryIncident(), true)
    }
    
    // 'def' attribute on ListViewInput (id=NotesLVInput) at MedCaseMgrDV.pcf: line 89, column 74
    function def_onEnter_18 (def :  pcf.NotesLV) : void {
      def.onEnter(Claim.getAllNotesWithTopicAndSubject(NoteTopicType.TC_MEDICAL, DisplayKey.get("NVV.Claim.MedCaseMgrDetails.MedicalDiagnosis.DiagnosisConfirmation", Claim.claimant)))
    }
    
    // 'def' attribute on ListViewInput at MedCaseMgrDV.pcf: line 98, column 27
    function def_onEnter_20 (def :  pcf.EditableMedicalActionsLV) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on ListViewInput at MedCaseMgrDV.pcf: line 111, column 50
    function def_onEnter_24 (def :  pcf.DrugsPrescribedLV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on ListViewInput at MedCaseMgrDV.pcf: line 33, column 50
    function def_onEnter_5 (def :  pcf.MedicalTreatmentsLV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on ListViewInput at MedCaseMgrDV.pcf: line 45, column 50
    function def_onEnter_9 (def :  pcf.MedicalContactStatusLV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on ListViewInput at MedCaseMgrDV.pcf: line 45, column 50
    function def_refreshVariables_10 (def :  pcf.MedicalContactStatusLV) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on ListViewInput (id=MedicalDiagnosisLVInput) at MedCaseMgrDV.pcf: line 58, column 27
    function def_refreshVariables_16 (def :  pcf.MedicalDiagnosisLV) : void {
      def.refreshVariables(Claim.ensureClaimInjuryIncident(), true)
    }
    
    // 'def' attribute on ListViewInput (id=NotesLVInput) at MedCaseMgrDV.pcf: line 89, column 74
    function def_refreshVariables_19 (def :  pcf.NotesLV) : void {
      def.refreshVariables(Claim.getAllNotesWithTopicAndSubject(NoteTopicType.TC_MEDICAL, DisplayKey.get("NVV.Claim.MedCaseMgrDetails.MedicalDiagnosis.DiagnosisConfirmation", Claim.claimant)))
    }
    
    // 'def' attribute on ListViewInput at MedCaseMgrDV.pcf: line 21, column 27
    function def_refreshVariables_2 (def :  pcf.MedicalPersonnelLV) : void {
      def.refreshVariables(Claim.getAllContactsWithRoles((new ContactRole[] {TC_DOCTOR,TC_FIRSTINTAKEDOCTOR,TC_PRIMARYDOCTOR,TC_OCCTHERAPIST,TC_PHYSTHERAPIST,TC_NURSECASEMGR,TC_CASEMGR,TC_CASEMGMTCO,TC_HOSPITAL})?.toList()))
    }
    
    // 'def' attribute on ListViewInput at MedCaseMgrDV.pcf: line 98, column 27
    function def_refreshVariables_21 (def :  pcf.EditableMedicalActionsLV) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on ListViewInput at MedCaseMgrDV.pcf: line 111, column 50
    function def_refreshVariables_25 (def :  pcf.DrugsPrescribedLV) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on ListViewInput at MedCaseMgrDV.pcf: line 33, column 50
    function def_refreshVariables_6 (def :  pcf.MedicalTreatmentsLV) : void {
      def.refreshVariables(Claim)
    }
    
    // 'editable' attribute on ListViewInput at MedCaseMgrDV.pcf: line 33, column 50
    function editable_3 () : java.lang.Boolean {
      return perm.System.editSensMCMdetails
    }
    
    // 'initialValue' attribute on Variable at MedCaseMgrDV.pcf: line 14, column 21
    function initialValue_0 () : Claim {
      return Exposure.Claim
    }
    
    // 'showConfirmMessage' attribute on CheckedValuesToolbarButton (id=Make_Primary) at MedCaseMgrDV.pcf: line 72, column 137
    function showConfirmMessage_12 () : java.lang.Boolean {
      return Claim.ensureClaimInjuryIncident().InjuryDiagnoses.where( \ i -> i.IsPrimary == true ).Count > 0
    }
    
    // 'visible' attribute on ListViewInput (id=NotesLVInput) at MedCaseMgrDV.pcf: line 89, column 74
    function visible_17 () : java.lang.Boolean {
      return perm.System.viewmednote and perm.System.viewclaimnotes
    }
    
    // 'visible' attribute on ListViewInput at MedCaseMgrDV.pcf: line 33, column 50
    function visible_4 () : java.lang.Boolean {
      return perm.System.viewSensMCMdetails
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    property get Exposure () : Exposure {
      return getRequireValue("Exposure", 0) as Exposure
    }
    
    property set Exposure ($arg :  Exposure) {
      setRequireValue("Exposure", 0, $arg)
    }
    
    
  }
  
  
}