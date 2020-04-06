package gw.entity;
uses gw.api.locale.DisplayKey
uses java.util.ArrayList
uses gw.api.database.Query
uses gw.api.admin.CatastropheUtil
uses java.util.List

@Export
enhancement GWClaimCatastropheEnhancement : entity.Claim {
  
  /**
   * Returns a warning message listing catastrophes that might match this claim, or
   * null if no catastrophes match.
   *
   * A claim matches a catastrophe if and only if:
   *
   * - the claim's loss date lies within the date range a catastrophe applies to
   * - the claim's loss location's state is a state the catastrophe applies to
   *
   */
  @Deprecated("No longer used. A list of matching catastrophes are now listed in a list view.")
  function Msg_CatMatch() : String {
    return getMatchingCatastropheMessage()
  }

  /**
   * Returns a warning message listing catastrophes that might match this claim, or
   * null if no catastrophes match.
   *
   * A claim matches a catastrophe if and only if:
   *
   * - the claim's loss date lies within the date range a catastrophe applies to
   * - the claim's loss location's state is a state the catastrophe applies to
   *    
   */
  @Deprecated("No longer used. A list of matching catastrophes are now listed in a list view.")
  function getMatchingCatastropheMessage() : String {
    var matches = getBaseCatastropheMatchQuery().select().toCollection()
    
    if (matches.Count == 0) {
      return null
    } 
    
    var result : String
       
    matches.reverse().eachWithIndex( \ c, i -> {     
      if (i == 0) {
        result = DisplayKey.get("Warning.Catastrophe.MatchingItem.Last",  c.DisplayName )
      } else {
        result = DisplayKey.get("Warning.Catastrophe.MatchingItem",  c.DisplayName, result )
      }   
    } )
    
    return DisplayKey.get("Warning.Catastrophe.ReviewMatches",  result )
  }
  
  /**
   * Finds all catastrophes that are possible matches for this claim.
   * Match criterion:
   *
   *   - Claim Loss Date must lie within a catastrophe's valid (effective) date range
   *   - Claim Loss Location must be within the zones the catastrophe applies to
   *   - Claim loss type and loss cause must be listed in the catastrophe perils
   */  
  function getCatastropheMatchesByZone() : Catastrophe[] {
    var q = getBaseCatastropheMatchQuery()

    q.and( \ and1 -> {
      and1.or( \ or1 -> {
        if(this.LossLocation != null) {
          for(zone in CatastropheUtil.getZonesFromAddress(this.LossLocation)) {
            or1.subselect("ID", CompareIn, CatastropheZone, "Catastrophe")
              .compare("ZoneType", Equals, zone.ZoneType)
               .compare("Code", Equals, zone.Code)
          }
        }
        // include catastrophe with no catastrophe zones
        or1.subselect("ID", CompareNotIn, CatastropheZone, "Catastrophe")
      })
    })
    
    return q.select().toCollection().toTypedArray()
  }

  /**
   * Finds all catastrophes that are have a matching loss location for this claim.
   * Match criterion:
   *
   *   - Claim Loss Location must be within the zones the catastrophe applies to
   */  
  function getCatastropheMatchesByZoneOnly() : Catastrophe[] {
    var q = Query.make(Catastrophe)
    q.and( \ and1 -> {
      and1.or( \ or1 -> {
        if(this.LossLocation != null) {
          for(zone in CatastropheUtil.getZonesFromAddress(this.LossLocation)) {
            or1.subselect("ID", CompareIn, CatastropheZone, "Catastrophe")
              .compare("ZoneType", Equals, zone.ZoneType)
               .compare("Code", Equals, zone.Code)
          }
        }
        // include catastrophe with no catastrophe zones
        or1.subselect("ID", CompareNotIn, CatastropheZone, "Catastrophe")
      })
    })
    
    return q.select().toCollection().toTypedArray()
  }
  
  /**
   * Builds the base query to find all catastrophes that are possible matches for this claim.
   * Match criterion:
   *
   *   - Claim Loss Date must lie within a catastrophe's valid (effective) date range
   *   - Claim loss type and loss cause must be listed in the catastrophe perils
   */  
  function getBaseCatastropheMatchQuery() : gw.api.database.Query<entity.Catastrophe> {
    var q = Query.make(Catastrophe)

    //catastrophe must be active
    q.compare("Active", Equals, true)
    
    //loss date is between the catastrophe effective date range
    q.compare("CatastropheValidFrom", LessThanOrEquals, this.LossDate)
    q.compare("CatastropheValidTo", GreaterThanOrEquals, this.LossDate)
    
    q.and( \ and2 -> {
      and2.or( \ or2 -> {
        //loss type and loss cause is listed in the catastrophe's coverage perils
        or2.subselect("ID", CompareIn, CatastrophePeril, "Catastrophe")
          .compare("LossType", Equals, this.LossType)
          .compare("LossCause", Equals, this.LossCause) 
  
        // include catastrophe with no catastrophe perils
        or2.subselect("ID", CompareNotIn, CatastrophePeril, "Catastrophe")
      })
    })
    
    return q
  }

  /**
   * Returns a list of all zone types for the given country.
   */  
  function getRelevantZoneTypes(countryVar : Country) : List<ZoneType> {
    var allTypeKeys = typekey.ZoneType.getTypeKeys( false )
    return allTypeKeys.where( \ z -> (z.Categories.hasMatch( \ c -> c.Code == countryVar.Code) or z == ZoneType.TC_COUNTRY)).toList()
  }
}
