package libraries

uses gw.api.locale.DisplayKey

@Export
enhancement ICDActionHelper : entity.InjuryDiagnosis
{
  // Creates a new medical note with a medical security type. Only visible by users with medical note permissions
  function reconfirmDiagnosis()
  {
    var person = this.InjuryIncident.Claim.LossType == TC_WC ? this.InjuryIncident.Claim.claimant : this.InjuryIncident.injured
    var subject = DisplayKey.get("NVV.Claim.MedCaseMgrDetails.MedicalDiagnosis.DiagnosisConfirmation", person)
    var body =  DisplayKey.get("NVV.Claim.MedCaseMgrDetails.MedicalDiagnosis.ReconfirmDiagnosisNoteBody", this.ICDCode.Code, this.Contact)
    var aNote = this.InjuryIncident.Claim.addNote( TC_MEDICAL, subject, body)
    aNote.SecurityType = TC_MEDICAL
  }
  
  // This method nulls out the primary diagnosis set for the injury incident and creates a medical note
  function addNoteIfPrimaryDiagnosisIsRemoved()
  {
    var person = this.InjuryIncident.Claim.LossType == TC_WC ? this.InjuryIncident.Claim.claimant : this.InjuryIncident.injured
    var subject = DisplayKey.get("NVV.Claim.MedCaseMgrDetails.MedicalDiagnosis.DiagnosisChangeNoteSubject", person)
    var body =  DisplayKey.get("NVV.Claim.MedCaseMgrDetails.MedicalDiagnosis.DiagnosisChangeNoteBody", this.ICDCode.Code)
    if(this.IsPrimary)
    {
      this.IsPrimary = false
      var aNote = this.InjuryIncident.Claim.addNote( TC_MEDICAL, subject, body)
      aNote.SecurityType = TC_MEDICAL
    }
  }
}
