package gw.entity

@Export
enhancement GWPolicyCoveragesEnhancement : entity.Policy {

  /**
   * Returns the appropriate Rental coverage type for this type of policy.
   */
  property get RentalCoverageType() : CoverageType {
    if (this.PolicyType == PolicyType.TC_BUSINESSAUTO) {
      return CoverageType.TC_BARENTALCOV
    } else if (this.PolicyType == PolicyType.TC_PERSONALAUTO) {
      return CoverageType.TC_PARENTALCOV
    }
    
    return null
  }
  
  /**
   * Returns the appropriate Auto Bodily Injury coverage type for this type of policy.
   */
  property get AutoBodilyInjuryCoverageType() : CoverageType {
    if (this.PolicyType == PolicyType.TC_BUSINESSAUTO) {
      return CoverageType.TC_BAOWNEDLIABILITYCOV
    } else if (this.PolicyType == PolicyType.TC_PERSONALAUTO) {
      return CoverageType.TC_PALIABILITYCOV
    }  

    return null
  }

  /**
   * Returns the appropriate Auto Partial Disability coverage type for this type of policy.
   */
  property get AutoPartialDisabilityCoverageType() : CoverageType {
    if (this.PolicyType == PolicyType.TC_BUSINESSAUTO) {
      return CoverageType.TC_BAOWNEDLIABILITYCOV
    } else if (this.PolicyType == PolicyType.TC_PERSONALAUTO) {
      return CoverageType.TC_PALIABILITYCOV
    }
    
    return null
  }
  
  /**
   * Returns the appropriate Death coverage type for this type of policy.
   */
  property get DeathCoverageType() : CoverageType {
    if (this.PolicyType == PolicyType.TC_BUSINESSAUTO) {
      return CoverageType.TC_CADEATHDISABILITYCOV
    } else if (this.PolicyType == PolicyType.TC_PERSONALAUTO) {
      return CoverageType.TC_PADEATHDISABILITYCOV
    }
    
    return null
  }

  /**
   * Returns the appropriate Property Protection coverage type for this type of policy.
   */
  property get PropertyProtectionCoverageType() : CoverageType {
    if (this.PolicyType == PolicyType.TC_BUSINESSAUTO) {
      return CoverageType.TC_BAPROPPROTECTIONCOV    
    } else if (this.PolicyType == PolicyType.TC_PERSONALAUTO) {
      return CoverageType.TC_PAPROPPROTECTIONCOV  
    }
    
    return null
  }
  
  /**
   * Returns the appropriate Collision coverage type for this type of policy.
   */
  property get CollisionCoverageType() : CoverageType {
    if (this.PolicyType == PolicyType.TC_BUSINESSAUTO) {
      return CoverageType.TC_BACOLLISIONCOV    
    } else if (this.PolicyType == PolicyType.TC_PERSONALAUTO) {
      return CoverageType.TC_PACOLLISIONCOV  
    }
    
    return null
  }
  
  /**
   * Returns the appropriate Underinsured Motorist Injury coverage type for this type of policy.
   */
  property get UnderinsuredMotoristBodilyInjuryCoverageType() : CoverageType {
    if (this.PolicyType == PolicyType.TC_BUSINESSAUTO) {
      return CoverageType.TC_BAOWNEDUIMBICOV
    } else if (this.PolicyType == PolicyType.TC_PERSONALAUTO) {
      return CoverageType.TC_PAUMBICOV    
    }
    
    return null  
  }
  
  /**
   * Returns the appropriate Uninsured Motorist Injury coverage type for this type of policy.
   */
  property get UninsuredMotoristBodilyInjuryCoverageType() : CoverageType {
    if (this.PolicyType == PolicyType.TC_BUSINESSAUTO) {
      return CoverageType.TC_BAOWNEDUIMPDCOV
    } else if (this.PolicyType == PolicyType.TC_PERSONALAUTO) {
      return CoverageType.TC_PAUMPDCOV    
    }
    
    return null  
  }
  
  /**
   * Returns the appropriate Comprehensive coverage type for this type of policy.
   */
  property get ComprehensiveCoverageType() : CoverageType {
    if (this.PolicyType == PolicyType.TC_BUSINESSAUTO) {
      return CoverageType.TC_BACOMPREHENSIVECOV
    } else if (this.PolicyType == PolicyType.TC_PERSONALAUTO) {
      return CoverageType.TC_PACOMPREHENSIVECOV    
    }
    
    return null
  }
  
  /**
   * Returns the appropriate Towing coverage type for this type of policy.
   */
  property get TowingCoverageType() : CoverageType {
    if (this.PolicyType == PolicyType.TC_BUSINESSAUTO) {
      return CoverageType.TC_BATOWINGLABORCOV
    } else if (this.PolicyType == PolicyType.TC_PERSONALAUTO) {
      return CoverageType.TC_PATOWINGLABORCOV
    }
    
    return null  
  }
  
  /**
   * Returns the appropriate Loss of Use coverage type for this type of policy.
   */
  property get LossOfUseCoverage() : CoverageType {
    if (this.PolicyType == PolicyType.TC_BUSINESSAUTO) {
      return CoverageType.TC_BALOSSOFUSECOV
    } else if (this.PolicyType == PolicyType.TC_PERSONALAUTO) {
      return CoverageType.TC_PALOSSOFUSECOV
    }
    
    return null        
  }
  
}
