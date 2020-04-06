package gw.plugin.policy.refresh.matcher.fr

uses gw.plugin.policy.refresh.matcher.AddressMatcher
/**
 * Address matcher for French addresses.
 */
@Export
class FrenchAddressMatcher extends AddressMatcher {
     override function doEntitiesMatch(a1 : Address, a2 : Address) : boolean {
       if(areBothNotNull(a1.AddressBookUID, a2.AddressBookUID)) {
         return a1.AddressBookUID==a2.AddressBookUID
       }
       return doAddressFieldsMatch(a1, a2) and areBothNullOrEqual(a1.CEDEXBureau, a2.CEDEXBureau)
     }
}