package gw.plugin.policy.refresh.relink.handler

uses gw.api.policy.refresh.relink.RelinkHandler

/**
 * Custom relinker for Contacts.
 */
@Export
class ContactRelinkHandler implements RelinkHandler<Contact> {

  delegate _handler represents RelinkHandler<Contact>

  construct() {
    _handler = new RelinkHandlerBuilder<Contact>(Contact)
                .withLinkHandler("PrimaryAddress", new SharedAddressLinkHandler<Contact>())
                .build()
  }

}
