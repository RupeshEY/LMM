package gw.plugin.policy.refresh.relink.handler
uses gw.api.policy.refresh.relink.DefaultLinkHandler
uses gw.api.policy.refresh.relink.RelinkItem
uses gw.api.policy.refresh.relink.RelinkContext

/**
 * An Address is prohibited from being used by two Contacts. Specifically,
 * if a Contact refers to it as its PrimaryAddress, then no other Contact may
 * use it as its PrimaryAddress and no ContactAddress may refer to it; if a
 * ContactAddress refers to it, then no other ContactAddress may refer to it
 * and no Contact may use it as its PrimaryAddress.
 *
 * This LinkHandler is intended to preserve that constraint during policy refresh.
 * The default link handler would just update the Contact.PrimaryAddress or
 * ContactAddress.Address link to point the new Address, but if the new Address
 * already has one of those incoming "owning" links, then the Address would end
 * up being used twice, violating the constraint. So, in that case, this will
 * make a copy of the new Address and relink to that, and the original Address
 * will be discarded.
 * This assumes that AddressMatcher is implemented to ensure that all fields on
 * Address matched, which should prevent information from being lost with the old
 * Address. Note that other references to the old Address will end up pointing to
 * the new Address.
 */
@Export
class SharedAddressLinkHandler<E extends KeyableBean> extends DefaultLinkHandler<E> {

  override function handleMatchedLinkTarget(relinkItem:RelinkItem<E>, relinkContext:RelinkContext, newBean:KeyableBean) {
    var newAddress = newBean as Address
    if (newAddress.ContactWhereThisIsPrimary != null  or
        newAddress.ContactAddress != null) {
      // This assumes that Address does not have any foreign keys, which is true
      // in the base ClaimCenter configuration. If you add foreign key extension fields
      // to address, carefully consider what will happen when this code makes a copy
      // of the Address (along with the values of those foreign keys).
      newAddress = newAddress.shallowCopy() as Address
    }
    relinkNewTarget(relinkItem, newAddress)
  }

}
