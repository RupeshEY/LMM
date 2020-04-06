package gw.entity

@Export
enhancement GWPolicyLocationEnhancement : entity.PolicyLocation {
  /**
   * Add a new risk unit and associate it with the policy location as well as the policy
   * Select the risk unit type based on policy type except if a LocationMiscRU needs to be 
   * associated with the location in question
   */
  function addLocationBasedRU(ruSubtype : String) : LocationBasedRU {
    var newRU : LocationBasedRU
    if(ruSubtype == typekey.RiskUnit.TC_LOCATIONMISCRU.Description){
      newRU = new LocationMiscRU()
    } else {
      switch(this.Policy.PolicyType){
        case TC_COMMERCIALPROPERTY: 
          newRU = new PropertyRU()
          break
        case TC_GENERALLIABILITY: 
          newRU = new GeneralLiabilityRU()
          break        
        case TC_WORKERSCOMP: 
          newRU = new WCCovEmpRU()
          break
        default:
          newRU = new LocationBasedRU()
          break
      }
    }
    this.addToLocationBasedRisks(newRU)
    this.Policy.addToRiskUnits(newRU)
    return newRU
  }
  
  /**
   * Remove the risk unit from the policy location as well as the policy. This will also remove 
   * and associated building if one exists
   */
  function removeLocationBasedRU(RU : LocationBasedRU){
    if(RU.Building != null)
      RU.Policy.removeBuilding(RU)
      
    this.removeFromLocationBasedRisks(RU)
    this.Policy.removeFromRiskUnits(RU)    
  }
  
  /**
   * Retrieve only lien holders for the policy location.
   * Ignores ones associated with the risk unit.
   */  
  property get policyLocationLienHoldersOnly() : PropertyOwner[] {
    return this.Lienholders.where(\ p -> p.LocationBasedRU == null)
  }
}
