package gw.acc.iplm.entitymapper

uses entity.LMMessage_Ext
uses gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Jv_Ins_Reinsurance

abstract class LMMessageBaseEntityMapper extends LMMessageMapperAbstract {

  /**
   * Maps all the common fields on LMMessage_Ext for London Market messages
   * @param message - Initial LMMessage Entity
   * @param xmlContent - Parsed Xml Content of the message
   * @return LMMessage_Ext - modified LMMessage
   */
  function mapCommonFields(message: LMMessage_Ext, xmlContent: Jv_Ins_Reinsurance): LMMessage_Ext {
    message.MessageType = ECFMessageType_Ext.TC_LLOYDSSYNDICATECLAIM
    message.MessageCategory = LMMessageCategory_Ext.TC_LLOYDSSCM
    message.MessageDirection = ECFMessageDirectionType_Ext.TC_INBOUND
    message.UUID = xmlContent.UUID
    message.UCR = xmlContent.UCR
    message.UMR = xmlContent.UMR
    message.OriginTimeStamp = xmlContent.OriginTimestamp

    message = mapReceiverData(message, xmlContent)
    message = mapSenderData(message, xmlContent)

    return message
  }

  /**
   * Maps the Sender elements of LMMessage_Ext for London Market messages
   * @param message - Initial LMMessage Entity
   * @param xmlContent - Parsed Xml Content of the message
   * @return LMMessage_Ext - modified LMMessage
   */
  private function mapSenderData(message: LMMessage_Ext, xmlContent: Jv_Ins_Reinsurance) : LMMessage_Ext {
    message.SenderPartyRoleCd = xmlContent.SenderPartyRoleCd
    message.SenderPartyId = xmlContent.SenderElement.FirstId
    message.SenderPartyAgency = xmlContent.SenderElement.FirstAgency
    message.SenderPartyName = xmlContent.SenderElement.Name

    return message
  }

  /**
   * Maps the Receiver elements of LMMessage_Ext for London Market messages
   * @param message - Initial LMMessage Entity
   * @param xmlContent - Parsed Xml Content of the message
   * @return LMMessage_Ext - modified LMMessage
   */
  private function mapReceiverData(message: LMMessage_Ext, xmlContent: Jv_Ins_Reinsurance) : LMMessage_Ext {
    message.ReceiverPartyRoleCd = xmlContent.ReceiverPartyRoleCd
    message.ReceiverPartyId = xmlContent.ReceiverElement.FirstId
    message.ReceiverPartyAgency = xmlContent.ReceiverElement.FirstAgency
    message.ReceiverPartyName = xmlContent.ReceiverElement.Name

    return message
  }

}