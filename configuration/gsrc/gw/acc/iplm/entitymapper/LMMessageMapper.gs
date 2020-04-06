package gw.acc.iplm.entitymapper

uses entity.LMMessage_Ext
uses gw.acc.iplm.dto.LMMessageDTO
uses gw.xml.XmlElement

/**
 * Each mapper class implement this interface.
 */
interface LMMessageMapper {
  /**
   * This method returns true if entity mapper is for a particular message type.
   *
   * For example:
   *  Claim Notify Mapper returns true for Claim Notify Message
   *
   * @param xmlPayload
   * @return
   */
  function isCorrectMessageType(messageType: XmlElement): boolean

  /**
   * Creates a new subtype of LMMessage_Ext entity, which is appropriate for the message type
   * and then maps values from XML payload(A message) to newly created entity.
   *
   * @param lmMessageDTO
   * @return
   */
  function createNewLMMessage(lmMessageDTO: LMMessageDTO): LMMessage_Ext
}