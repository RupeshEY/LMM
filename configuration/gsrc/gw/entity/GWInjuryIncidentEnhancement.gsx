package gw.entity

@Export
enhancement GWInjuryIncidentEnhancement : entity.InjuryIncident
{
  property get ComplexInjury() : boolean 
  {
    
    if (this.Subtype ==TC_INJURYINCIDENT  and 
    this.Severity == TC_FATAL or this.Severity == TC_MAJOR_INJURY or this.Severity ==TC_SEVERE_INJURY)
    {
    return true
    } 
    else return false
  }
  
  function setPrimaryDiagnosisToFalse(){
    for (aDiagnosis in this.InjuryDiagnoses.where( \ i -> i.IsPrimary == true ))
    {
      aDiagnosis.IsPrimary = false
    }
  }
}
