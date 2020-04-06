package gw.plugin.policy.refresh.matcher


/**
 * Entity matcher for Persons.
 */
@Export
class PersonMatcher extends PolicyGraphMatcherBase<Person>
{
  /**
   * Attempts to match on identifying information (AddressBook UID,
   * TaxID), then on name/gender/DOB.
   */
  override function doEntitiesMatch(p1:Person, p2:Person) : boolean {
       
    if(areBothNotNull(p1.AddressBookUID, p2.AddressBookUID)) {
      return p1.AddressBookUID==p2.AddressBookUID
    }
    
    if (areBothNotNull(p1.PolicySystemId, p2.PolicySystemId)) {
      return p1.PolicySystemId == p2.PolicySystemId
    }
    
    //must be same subtype
    if(p1.Subtype!=p2.Subtype) {
      return false
    }
    
    if(areBothNotNull(p1.TaxID, p2.TaxID)) {
      return p1.TaxID==p2.TaxID
    }
    
    return p1.FirstName==p2.FirstName and p1.LastName==p2.LastName and
        areBothNullOrEqual(p1.Particle, p2.Particle) and
        areBothEqualOrAtLeastOneNull(p1.MiddleName, p2.MiddleName) and
        areBothEqualOrAtLeastOneNull(p1.Gender, p2.Gender) and 
        areBothEqualOrAtLeastOneNull(p1.DateOfBirth, p2.DateOfBirth) and
        areBothEqualOrAtLeastOneNull(p1.Suffix, p2.Suffix)
  }

}
