package gw.plugin.policy.refresh.matcher.jp

uses gw.plugin.policy.refresh.matcher.AddressMatcher

/**
 * Address matcher for Japanese addresses.
 */
@Export
class JapaneseAddressMatcher extends AddressMatcher {

    override function doEntitiesMatch(a1 : Address, a2 : Address) : boolean {
        if(areBothNotNull(a1.AddressBookUID, a2.AddressBookUID)) {
          return a1.AddressBookUID==a2.AddressBookUID
        }
        return doAddressFieldsMatch(a1, a2) and
               areBothNullOrEqual(a1.AddressLine1Kanji, a2.AddressLine1Kanji) and
               areBothNullOrEqual(a1.AddressLine2Kanji, a2.AddressLine2Kanji) and
               areBothNullOrEqual(a1.CityKanji, a2.CityKanji)
    }
}