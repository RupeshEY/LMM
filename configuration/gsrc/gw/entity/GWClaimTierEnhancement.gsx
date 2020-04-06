package gw.entity
uses java.lang.Integer
@Export

enhancement GWClaimTierEnhancement : entity.Claim {
   
  /**
   * The goal is to set the appropriate tier for the Claim
   * <ul>
   * <li>First, the claim's tier is set based upon its most complex exposure as
   *    determined by the exposure's ExposureTier priority
   * <li>Second, the claim's Tier may be escalated because of a variety of
   *     special conditions
   * </ul>
   */ 
  function setClaimTier() : void {
    var maxTierTypeKey = this.Exposures.maxBy(\ e ->  e.ExposureTier).ExposureTier
    var maxTier = (maxTierTypeKey == null ? null : maxTierTypeKey.Priority as Integer)
    if (this.Claim.Policy.PolicyType == TC_WORKERSCOMP) {
      setWCClaimTier(maxTier)
    } else {
      setNonCompClaimTier(maxTier)
    }
  }
  
  private function setWCClaimTier(maxTier: Integer) : void {
    switch (maxTier) {
      case 100:
        this.ClaimTier = TC_MEDICALONLY
        break
      case 200:
        this.ClaimTier = TC_INDEMNITY
        break
      case 300:
        this.ClaimTier = TC_EL
        break
      default:
        this.ClaimTier = TC_INCIDENTREPORT
    }
    if (this.ClaimTier == TC_INCIDENTREPORT and not this.IncidentReport) {
      this.ClaimTier = TC_MEDICALONLY
    }
  }

  private function setNonCompClaimTier(maxTier: Integer) : void {
    switch (maxTier) {
      case 200:
        this.ClaimTier = TC_MEDIUM
        break
      case 300:
        this.ClaimTier = TC_HIGH
        break
      default:
       this.ClaimTier = TC_LOW
    }

    if (this.ClaimTier != TC_HIGH
            and (this.LitigationClaimIndicator.IsOn
                    or this.FatalityClaimIndicator.IsOn
                    or this.IsVeryComplexProperty)) {
      this.ClaimTier = TC_HIGH        
    } 
    if (this.ClaimTier == TC_LOW
            and (this.VehicleIncidentsOnly.Count > 2
                    or this.CoverageInQuestionClaimIndicator.IsOn
                    or this.VehicleIncidentsOnly.hasMatch(\ v -> v.TotalLoss)
                    or this.IsComplexProperty)) {
      this.ClaimTier = TC_MEDIUM     
    }
  } 

  property get IsVeryComplexProperty() : boolean {
    return this.LossType ==TC_PR and this.LossCause == TC_FIRE and
            (this.Policy.PolicyType != TC_HOMEOWNERS
            or (this.PropertyFireDamage.FireDeptResponded and not this.PropertyFireDamage.SmokeDamageOnly))
  }

  property get IsComplexProperty() : boolean {
    return this.LossType ==TC_PR
            and (this.LossCause == TC_MOLD or this.LossCause == TC_BURGLARY)
  }
}
