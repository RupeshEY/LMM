package gw.entity

@Export
enhancement GWServiceRequestTierEnhancement : entity.ServiceRequest {
  
  function setServiceRequestTier() {
    if (this.Tier == null) {
      this.Tier = TC_LOW
    }
    
    if (this.LatestQuote != null and this.LatestQuote.ExpectedDaysToPerformService >= 10) {
      this.Tier = TC_HIGH
    }
  }
}
