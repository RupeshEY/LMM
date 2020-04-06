package gw.entity
uses gw.api.database.Query
uses java.util.Date
uses gw.api.database.ValueRange

@Export
enhancement GWCatastropheEnhancement : entity.Catastrophe {
  
  public function findClaimsByCatastropheZone() : gw.api.database.IQueryBeanResult<entity.Claim> {
    var q = findClaims()
    if (this.CatastropheZones.Count > 0) {
      q = this.addCatastropheZoneFilter(q)
    }
    return q.select()
  }
  
  /**
   * Finds all claims related to the catastrophe by the base criteria. A matched is determined by:
   *   - the claim does not have the "catastrophe_review" activity pattern with the skipped or compete status
   *   - the claim's loss date falls within the catastrophe's valid dates
   *   - the claim's loss type and loss cause is listed in the catastrophe's perils
   *   - the claim has not already been associated with a catastrophe
   * 
   * @return all claims related to the catastrophe
   */
  private function findClaims() : gw.api.database.Query<entity.Claim> {  
    var catastropherReviewActivityPattern = ActivityPattern.finder.getActivityPatternByCode("catastrophe_review")
    var q = Query.make(Claim)
    
    // filter out claims with the 'catastrophe_review' activity completed or skipped
    q.subselect("ID", CompareNotIn, Activity, "Claim").and(\ theAnd -> {
      theAnd.compare("ActivityPattern", Equals , catastropherReviewActivityPattern)
      theAnd.compareIn("Status", {ActivityStatus.TC_SKIPPED, ActivityStatus.TC_COMPLETE})
    })

    // loss date is between the catastrophe effective date range
    q.compare("LossDate", new ValueRange<Date>(this.CatastropheValidFrom, this.CatastropheValidTo))
    
    // loss type and loss cause is listed in the catastrophe's coverage perils
    if(this.Perils.Count > 0){
      q.and( \ and1 -> {
        and1.or( \ or1 -> {
          for(catPeril in this.Perils) {
            or1.and( \ and2 -> {
              and2.compare("LossCause", Equals, catPeril.LossCause )
              and2.compare("LossType", Equals, catPeril.LossType )
            })
          }
        })
      })
    }

    // claim must not already be associated with a catastrophe
    q.compare( "Catastrophe", Equals, null )
    
    return q
  }
}
