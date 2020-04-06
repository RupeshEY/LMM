package gw.plugin.policy.refresh.relink.handler

uses gw.api.policy.refresh.relink.BaseLinkHandler
uses gw.api.policy.refresh.relink.RelinkItem
uses gw.api.policy.refresh.relink.RelinkContext
uses gw.api.util.Logger
uses gw.api.policy.refresh.relink.RelinkHandler

/**
 * Relinker that handles the broken link Message#Contact.
 */
@Export
class MessageRelinkHandler implements RelinkHandler<Message> {

  delegate _handler represents RelinkHandler<Message>

  construct() {
    _handler = new RelinkHandlerBuilder<Message>(Message)
                .withLinkHandler("Contact", new ContactLinkHandler())
                .build()
  }

  /**
   * Link handler for Message#Contact. In the matched or the removed case, we
   * will just want to remove the Message.
   */
  private static class ContactLinkHandler extends BaseLinkHandler<Message> {
    /**
     * Handles the case where the target Contact is removed.
     */
    override function handleRemovedLinkTarget(relinkItem:RelinkItem<Message>, relinkContext:RelinkContext) {
      var message = relinkItem.Owner
      logWarning(message)
      message.remove()
    }
    
    /**
     * Handle the case where the target Contact is matched. 
     */
    override function handleMatchedLinkTarget(relinkItem:RelinkItem<Message>, relinkContext:RelinkContext, newBean:KeyableBean) {
      var message = relinkItem.Owner
      logWarning(message)
      message.remove()
    }
    
    private function logWarning(message:Message) {
      Logger.logWarning(String.format("Message ID=%s associated with contact %s is being removed because the contact is being refreshed", 
        {message.ID, message.Contact}))
    }
  }
}
