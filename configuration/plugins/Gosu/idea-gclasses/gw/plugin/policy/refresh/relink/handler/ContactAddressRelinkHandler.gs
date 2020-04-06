package gw.plugin.policy.refresh.relink.handler

uses gw.api.policy.refresh.relink.RelinkHandler

/**
 * RelinkHandler for ContactAddresses.
 */
@Export
class ContactAddressRelinkHandler implements RelinkHandler<ContactAddress> {

  delegate _handler represents RelinkHandler<ContactAddress>

  construct() {
    _handler = new RelinkHandlerBuilder<ContactAddress>(ContactAddress)
                .withLinkHandler("Address", new SharedAddressLinkHandler<ContactAddress>())
                .build()
  }

}
