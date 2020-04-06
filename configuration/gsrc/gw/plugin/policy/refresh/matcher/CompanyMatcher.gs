package gw.plugin.policy.refresh.matcher


/**
 * Entity matcher for Companies.
 */
@Export
class CompanyMatcher extends PolicyGraphMatcherBase<Company>
{
  /**
   * Attempts to match on any identifying information, then
   * on company name.
   */
  override function doEntitiesMatch(c1:Company, c2:Company) : boolean 
  {      
    if(areBothNotNull(c1.AddressBookUID, c2.AddressBookUID)) {
      return c1.AddressBookUID==c2.AddressBookUID
    }
    
    if (areBothNotNull(c1.PolicySystemId, c2.PolicySystemId)) {
      return c1.PolicySystemId == c2.PolicySystemId
    }
    
    if(c1.Subtype!=c2.Subtype) {
      return false
    }
    
    if(areBothNotNull(c1.TaxID, c2.TaxID)) {
      return c1.TaxID==c2.TaxID
    }
    if(areBothNotNull(c1.DUNSOfficialID, c2.DUNSOfficialID)) {
      return c1.DUNSOfficialID==c2.DUNSOfficialID
    }
    
    return c1.Name==c2.Name
  }
}
