package gw.entity
uses java.util.HashMap

@Export
enhancement GWExposureTierEnhancement : entity.Exposure {
  
  function setExposureTier() : void {
    
    /*  Useful debug statement for understanding the state of the data coming into this function
    print("PolicyType: " + this.Claim.Policy.PolicyType + "  LOB: " + this.Claim.LOBCode + "  Coverage: " +
       this.Coverage.Type + "  CoverageSubtype: " + this.CoverageSubType + "  ExpoType: " + this.ExposureType 
       + "  LossParty: " + this.LossParty);
    */
    
    switch (this.Claim.Policy.PolicyType) {
      case TC_PERSONALAUTO:
      case TC_BUSINESSAUTO:
      case TC_HOMEOWNERS:
      case TC_COMMERCIALPROPERTY:
        setAutoPropertyExposureTier()
        break
       case TC_WORKERSCOMP:
        setWCExposureTier()
        break  
       case TC_TRAVEL_PER:
        setTravelExposureTier()
        break  
      default:
        setOtherPolicyTypesExposureTier()
    }
  }
  
  private function setWCExposureTier() : void {
    switch (this.CoverageSubType) {
      case TC_WCWORKERSCOMPMED:
        this.ExposureTier = TC_MEDICAL
        break
      case TC_WCWORKERSCOMPWAGES:
        this.ExposureTier = TC_INDEMNITY
        break
      case TC_WCEMPLIABCOV:
        this.ExposureTier = TC_EL
        break
    }
  }

  private function setAutoPropertyExposureTier() : void {

    switch (this.ExposureType) {
      case TC_BODILYINJURYDAMAGE:
      case TC_MEDPAY: 
      case TC_PIPDAMAGES: 
        if (this.LossParty == TC_INSURED) {  // 1st party
          this.ExposureTier = TC_1P_MED_LOW;
        } else {  // 3rd party
          this.ExposureTier = TC_3P_MED_LOW;
        }
        break;      
      
      case TC_DWELLING:
      case TC_OTHERSTRUCTURE: 
      case TC_PROPERTYDAMAGE: 
        if (this.LossParty == TC_INSURED) {  // 1st party
          this.ExposureTier = TC_1P_SD_LOW;
        } else {  // 3rd party
          this.ExposureTier = TC_3P_PD_LOW;
        }
        break;      

      case TC_CONTENT:
      case TC_PERSONALPROPERTYDAMAGE: 
        if (this.LossParty == TC_INSURED) {  // 1st party
          this.ExposureTier = TC_1P_CONTENT_LOW;
        } else {  // 3rd party
          this.ExposureTier = TC_3P_PD_LOW;
        }
        break;      

      case TC_TOWONLY: 
        this.ExposureTier = TC_TOWING;
        break;
      
      case TC_LIVINGEXPENSES: 
      case TC_LOSSOFUSEDAMAGE: 
        this.ExposureTier= TC_LOSSOFUSE;
        break;
               
      case TC_VEHICLEDAMAGE: 
        if (this.LossParty == TC_INSURED) {  // 1st party
          if (this.CoverageSubType == TC_PARENTALCOV or this.CoverageSubType == TC_BARENTALCOV) {
            this.ExposureTier = TC_RENTAL;
          } else {
            this.ExposureTier = TC_1P_PD_LOW;
          }
        } else {  // 3rd party
          this.ExposureTier = TC_3P_PD_LOW;
        }
        break;      
      
      case TC_GENERALDAMAGE: 
        if (this.LossParty == TC_INSURED) {  // 1st party
          this.ExposureTier = TC_1P_PD_LOW;
        } else {  // 3rd party
          this.ExposureTier = TC_3P_PD_LOW;
        }
        break;      
      
      default:
        if (this.LossParty == TC_INSURED) {  // 1st party
          this.ExposureTier = TC_1P_PD_LOW;
        } else {  // 3rd party
          this.ExposureTier = TC_3P_PD_LOW;
        }
    }

    if (this.InjuryIncident.ComplexInjury
            or this.VehicleIncident.TotalLoss
            or this.Claim.IsVeryComplexProperty
            or this.Claim.IsComplexProperty) {
      var lowToHigh = new HashMap<ExposureTier,ExposureTier>() {
        TC_1P_PD_LOW -> TC_1P_PD_HIGH,
        TC_1P_MED_LOW -> TC_1P_MED_HIGH,
        TC_1P_SD_LOW -> TC_1P_SD_HIGH,
        TC_1P_CONTENT_LOW -> TC_1P_CONTENT_HIGH,
        TC_3P_PD_LOW -> TC_3P_PD_HIGH,
        TC_3P_MED_LOW -> TC_3P_MED_HIGH
      }
      if (lowToHigh.containsKey(this.ExposureTier)) {
        this.ExposureTier = lowToHigh[this.ExposureTier]
      }
    }
  }

  private function setTravelExposureTier() : void {
    if (this.ExposureType== TC_VEHICLEDAMAGE
            or this.ExposureType== TC_PROPERTYDAMAGE
            or this.ExposureType== TC_PERSONALPROPERTYDAMAGE
            or this.ExposureType== TC_PIPDAMAGES
            or this.Incident.Severity == TC_SEVERE_GEN
            or this.Incident.Severity == TC_MAJOR_GEN
            or this.InjuryIncident.Severity == TC_MAJOR_INJURY
            or this.InjuryIncident.Severity == TC_SEVERE_INJURY
            or this.InjuryIncident.Severity == TC_FATAL) {
      this.ExposureTier = TC_HIGH
    } else if (this.ExposureType ==TC_MEDPAY
            or this.Incident.Severity == TC_MODERATE_GEN) {
      this.ExposureTier = TC_MEDIUM
    } else {
      this.ExposureTier = TC_LOW
    }
  }

  private function setOtherPolicyTypesExposureTier() : void {
    // Specific cases
    var covSubType = this.CoverageSubType;
    if (covSubType == TC_BOPFORGEALTCOV  or 
        covSubType == TC_IMACCOUNTRECEIVABLECOV  or
        covSubType == TC_GLPOLLUTIONDESIGNATEDCOVBI or 
        covSubType == TC_GLPOLLUTIONDESIGNATEDCOVPD or 
        covSubType == TC_GLPOLLUTIONDESIGNATEDCOVGEN or 
        covSubType == TC_FARM_BID) {
      this.ExposureTier = TC_HIGH;      
    } else if (covSubType == TC_GLCGLCOV_PROD_MP) {
      this.ExposureTier = TC_MEDIUM; 
    } else {
      // General tiering
      switch (this.LossParty) {
        case TC_INSURED:
          if (this.ExposureType == TC_BODILYINJURYDAMAGE) {
            this.ExposureTier = TC_MEDIUM;
          } else {
            this.ExposureTier = TC_LOW;
          }
          break;
          
        case TC_THIRD_PARTY:
          if (this.ExposureType == TC_BODILYINJURYDAMAGE) {
            this.ExposureTier = TC_HIGH;
          } else {
            this.ExposureTier = TC_MEDIUM;
          }
          break;
          
        default:  
          // should never come here, but just in case...
          this.ExposureTier = TC_LOW;
      }
    }

    if (this.ExposureTier != TC_HIGH
            and (this.InjuryIncident.ComplexInjury
                    or this.Claim.IsVeryComplexProperty
                    or (this.Incident.Subtype == TC_INCIDENT and (this.Incident.Severity == TC_SEVERE_GEN)))) {
      this.ExposureTier = TC_HIGH        
    }
    if (this.ExposureTier == TC_LOW
            and ((this.Incident.Subtype == TC_INCIDENT and this.Incident.Severity ==TC_MAJOR_GEN)
                    or (this.LossParty ==TC_THIRD_PARTY and this.Claim.Policy.PolicyType == TC_BUSINESSOWNERS)
                    or this.Claim.IsComplexProperty
                    or this.VehicleIncident.TotalLoss)) {
        this.ExposureTier = TC_MEDIUM
    }  
  }
}
