package gw.fnolmapper.acord.ext
uses java.lang.String
uses java.util.Set
uses java.util.HashSet

/**
 * Enhancement for the ACORD's ClaimsParty.
 */
@Export
enhancement ClaimsPartyEnhancement : xsd.acord.ClaimsParty {
  /**
   * Checks to see if this ClaimsParty has the given role (corresponding to the
   * ACORD ClaimsPartyRoleCd).
   */
  function hasRole(roleName:String) : boolean {
    return this.RoleCodes.contains(roleName)
  }
  
  /**
   * Returns the role codes (ClaimsPartyRoleCd) for this ClaimsParty.
   */
  property get RoleCodes() : Set<String> {
    var names = new HashSet<String>()
    this.ClaimsPartyInfo.ClaimsPartyRoleCd.each(\ c -> {
      names.add(c.StringValue)
    })
    return names
  }
}
