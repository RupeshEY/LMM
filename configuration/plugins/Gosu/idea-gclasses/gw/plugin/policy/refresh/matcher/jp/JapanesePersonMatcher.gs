package gw.plugin.policy.refresh.matcher.jp

uses gw.plugin.policy.refresh.matcher.PolicyGraphMatcherBase

/**
 *  Matcher for the Person entity in the Japanese locale.
 */
@Export
class JapanesePersonMatcher extends PolicyGraphMatcherBase<Person> {

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

    return doesFirstNameMatch(p1, p2) and doesLastNameMatch(p1, p2) and
        areBothEqualOrAtLeastOneNull(p1.Gender, p2.Gender) and
        areBothEqualOrAtLeastOneNull(p1.DateOfBirth, p2.DateOfBirth)
  }

  private function  doesFirstNameMatch(p1:Person, p2:Person) : boolean {
    return areBothNullOrEqual(p1.FirstNameKanji, p2.FirstNameKanji) and
        areBothNullOrEqual(p1.FirstName, p2.FirstName)
  }

  private function doesLastNameMatch(p1:Person, p2:Person) : boolean {
    return areBothNullOrEqual(p1.LastNameKanji,p2.LastNameKanji) and
        areBothNullOrEqual(p1.LastName, p2.LastName)
  }
}