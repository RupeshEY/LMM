package gw.plugin.policy.refresh.relink.handler

uses gw.api.policy.refresh.relink.RelinkHandler
uses gw.api.policy.refresh.relink.BaseLinkHandler
uses gw.api.policy.refresh.relink.RelinkItem
uses gw.api.policy.refresh.relink.RelinkContext

/**
 * Custom relinker for ContactFingerprints.
 */
@Export
class ContactFingerprintRelinkHandler implements RelinkHandler<ContactFingerprint> {

  delegate _handler represents RelinkHandler<ContactFingerprint>

  /**
   * Registers the custom link handler for ContactFingerprint.
   */
  construct() {
    _handler = new RelinkHandlerBuilder<ContactFingerprint>(ContactFingerprint)
        .withLinkHandler("Contact", new ContactFingerprintContactLinkHandler())
        .build()
  }

  /**
   * Custom LinkHandler that removes the ContactFingerprint, whether the owning Contact is being removed or the
   * Contact is matched. If the Contact is matched, then the fingerprint should be regenerated for the new Contact later.
   */
  class ContactFingerprintContactLinkHandler extends BaseLinkHandler<ContactFingerprint> {

    /**
     * Removes the owning ContactFingerprint.
     */
    override function handleRemovedLinkTarget(item:RelinkItem<ContactFingerprint>, ctx:RelinkContext) {
      // ContactFingerprint is editable (not retireable), so removing it actually deletes the bean
      item.Owner.remove()
    }

    /**
     * Removes the owning ContactFingerprint.
     */
    override function handleMatchedLinkTarget(relinkItem:RelinkItem<ContactFingerprint>, relinkContext:RelinkContext, newBean:KeyableBean) {
      // ContactFingerprint is editable (not retireable), so removing it actually deletes the bean
      relinkItem.Owner.remove()
    }
  }
}
