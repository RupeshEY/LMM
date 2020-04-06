package gw.acc.iplm.messageidentifier

uses gw.acc.iplm.ChainOfResponsibility
uses gw.xml.XmlElement

abstract class BaseMessageIdentifier extends ChainOfResponsibility<XmlElement> {

  function add(handler: BaseMessageIdentifier) : BaseMessageIdentifier {
    return super.add(handler) as BaseMessageIdentifier
  }

  override function execute(element: XmlElement) {
    // Purposefully don't do anything here, the important part of this chain is returning the correct messageType()
  }

  /**
   * Abstract function that returns the message type this identifier can correctly identify
   *
   * @return LMMessageTypeString_Ext - The correct message type
   */
  abstract function messageType() : LMMessageTypeString_Ext

  /**
   * Iterates through the chain and return the first LMMessageTypeString_Ext that was correctly identified
   *
   * @param element - message under analysis
   * @return - LMMessageTypeString_Ext object identified by this chain
   */
  function identifyMessageType(element: XmlElement) : LMMessageTypeString_Ext {
    return (super.handle(element) as BaseMessageIdentifier).messageType()
  }

}