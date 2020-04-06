package gw.entity

uses gw.api.locale.DisplayKey

@Export
enhancement GWInjuryDiagnosisEnhancement : entity.InjuryDiagnosis {
  
  // Check if diagnosis start date is between code available dates
  function startDateBetweenCodeValidity() : Boolean {
    if(this.DateStarted != null) {
      if( (this.ICDCode.AvailabilityDate != null and this.DateStarted < this.ICDCode.AvailabilityDate) or (this.ICDCode.ExpiryDate != null and this.DateStarted > this.ICDCode.ExpiryDate)) {
        return false
      }
    }    
    return true
  }
  
  // Check if diagnosis end date is between code availability dates
  function endDateBetweenCodeValidity() : Boolean{
    if(this.DateEnded != null) {
      if( (this.ICDCode.AvailabilityDate != null and this.DateEnded < this.ICDCode.AvailabilityDate) or (this.ICDCode.ExpiryDate != null and this.DateEnded > this.ICDCode.ExpiryDate)) {
        return false
      }
    }    
    return true
  }
  
  // Builds string used for warning the user of invalid dates
  function diagnosisCodeWarningString() : String {
    var str = DisplayKey.get("Rules.Validation.Claim.DiagnosisCode", this.ICDCode.Code)
    
    if (this.ICDCode.AvailabilityDate != null) {
        str = str + DisplayKey.get("Rules.Validation.Claim.DiagnosisCodeNotAvailable", this.ICDCode.AvailabilityDate.format("long"))
    }
    
    if (this.ICDCode.AvailabilityDate != null and this.ICDCode.ExpiryDate != null) {
        str = str + " & "
    }
    
    if (this.ICDCode.ExpiryDate != null) {
        str = str + DisplayKey.get("Rules.Validation.Claim.DiagnosisCodeExpires", this.ICDCode.ExpiryDate.format("long"))
    }
    return str
  }
}
