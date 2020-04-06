package gw.acc.iplm.handler

uses gw.acc.iplm.ChainOfResponsibility
uses gw.acc.iplm.services.api.AbstractService

/**
 * Base class for each of the 'Chain of Responsibility' service handler classes.
 */
abstract class AbstractBaseHandler<T extends entity.LMMessage_Ext> extends ChainOfResponsibility<T> {

  private var _service : AbstractService<T> as Service

  construct(service: AbstractService<T>) {
    _service = service
  }

  override function canHandle(lmMessage: T) : Boolean {
    return this.canHandle(lmMessage?.Subtype)
  }

  override function execute(ecfMessage: T) {
    this.processMessage(ecfMessage)
  }

  function add(handler: AbstractBaseHandler<T>) : AbstractBaseHandler<T> {
    return super.add(handler) as AbstractBaseHandler<T>
  }

  /**
   * Abstract function to determine if this link handles this type of message
   * If true, then that specific handler is supposed to process the message.
   *
   * @param typekey.LMMessage_Ext The code that will be inspected to decide if the service handler can handle a message
   * @return boolean True if the handler can handle the provided type of message, false otherwise
   */
  abstract function canHandle(messageType: typekey.LMMessage_Ext): boolean

  /**
   * This method processes individual ECFMessage_Ext entities.
   *
   * @param ECFMessage_Ext
   */
  function processMessage(ecfMessage: T) {
    _service.process(ecfMessage)
  }

}
