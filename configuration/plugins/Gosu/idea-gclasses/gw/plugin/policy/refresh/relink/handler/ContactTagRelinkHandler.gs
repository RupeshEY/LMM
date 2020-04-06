package gw.plugin.policy.refresh.relink.handler

uses gw.api.policy.refresh.relink.BaseLinkHandler
uses gw.api.policy.refresh.relink.RelinkContext
uses gw.api.policy.refresh.relink.RelinkItem
uses gw.api.policy.refresh.relink.RelinkHandler

/**
 * RelinkHandler for ContactTag entities. Because the ContactTag is
 * owned by the related Contact, missing matches for the required Contact
 * property are ignored.
 */
@Export
class ContactTagRelinkHandler implements RelinkHandler<ContactTag> {

  delegate _handler represents RelinkHandler<ContactTag>

  construct() {
    _handler = new RelinkHandlerBuilder<ContactTag>(ContactTag)
                .withLinkHandler("Contact", new TagLinkHandler())
                .build()
  }

  /**
   * LinkHandler for ContactTag--(Contact)-->Contact
   */
  private class TagLinkHandler extends BaseLinkHandler<ContactTag> {

    /**
     * Handle the case where the Contact is in the removed set.
     */
    override function handleRemovedLinkTarget(relinkItem:RelinkItem<ContactTag>, relinkCtx:RelinkContext) {
      relinkItem.Owner.remove()
    }

    /**
     * Handle the case where the new Contact already has the ContactTag being relinked.
     */
    override function handleMatchedLinkTarget(relinkItem:RelinkItem<ContactTag>, relinkContext:RelinkContext, newBean:KeyableBean) {
      if(not hasContactTag(relinkItem.Owner, newBean as Contact)) {
         //relink to new bean
         relinkNewTarget(relinkItem, newBean)
      }
      //else don't relink (tag will be removed)
    }
    
    private function hasContactTag(tag:ContactTag, contact:Contact) : boolean {
      return contact.Tags.firstWhere(\ t -> t.Type==tag.Type) != null
    }
  }
}
