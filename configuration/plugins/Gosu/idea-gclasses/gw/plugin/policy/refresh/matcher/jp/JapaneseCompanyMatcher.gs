package gw.plugin.policy.refresh.matcher.jp

uses gw.plugin.policy.refresh.matcher.PolicyGraphMatcherBase

/**
 * Matcher for the Company entity in the Japanese locale.
 */
@Export
class JapaneseCompanyMatcher extends PolicyGraphMatcherBase<Company> {

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

      return doesNameMatch(c1, c2)
    }

    private function doesNameMatch(c1:Company, c2:Company) : boolean {
      return areBothNullOrEqual(c1.NameKanji, c2.NameKanji)
          and areBothNullOrEqual(c1.Name, c2.Name)
    }
}