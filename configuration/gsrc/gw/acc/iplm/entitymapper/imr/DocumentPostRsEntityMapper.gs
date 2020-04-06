package gw.acc.iplm.entitymapper.imr

uses entity.LMMessage_Ext
uses gw.acc.iplm.dto.LMMessageDTO
uses gw.acc.iplm.entitymapper.LMMessageMapperAbstract
uses gw.acc.iplm.utils.ECFUtils
uses gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.PostRs
uses gw.xml.XmlElement

class DocumentPostRsEntityMapper extends LMMessageMapperAbstract {

  override function isCorrectMessageType(messageType: XmlElement): boolean {
    return messageType.$QName.LocalPart == PostRs.$QNAME.LocalPart
  }

  override function createNewLMMessage(messageDTO: LMMessageDTO): LMMessage_Ext {
    if (not isCorrectMessageType(messageDTO.XMLPayLoad)) {
      return null
    }

    var xmlMessage = messageDTO.XMLPayLoad.asUTFString()
    var postRs = PostRs.parse(xmlMessage)

    var message = new ECFMessageDocumentPostRs_Ext()

    message = mapSenderDetails(message, postRs)
    message = mapReceiverDetails(message, postRs)
    message = mapPostRsFields(message, postRs, messageDTO.MessageType)
    message = mapReferredMessageFields(message, postRs)
    message = mapClaim(message)

    return message
  }

  private function mapSenderDetails(message: ECFMessageDocumentPostRs_Ext, xmlContent: PostRs) : ECFMessageDocumentPostRs_Ext {
    message.SenderPartyId = xmlContent.Sender.PartyId
    message.SenderPartyName = xmlContent.Sender.PartyName
    message.SenderPartyRoleCd = xmlContent.Sender.PartyRoleCd

    return message
  }

  private function mapReceiverDetails(message: ECFMessageDocumentPostRs_Ext, xmlContent: PostRs) : ECFMessageDocumentPostRs_Ext {
    message.ReceiverPartyId = xmlContent.Receiver.PartyId
    message.ReceiverPartyName = xmlContent.Receiver.PartyName
    message.ReceiverPartyRoleCd = xmlContent.Receiver.PartyRoleCd

    return message
  }

  private function mapReferredMessageFields(message: ECFMessageDocumentPostRs_Ext, xmlContent: PostRs) : ECFMessageDocumentPostRs_Ext {
    final var msgItem = xmlContent.MsgItems.MsgItem.first()
    message.ReferredUUID = msgItem.MsgId
    message.OperationStatus = ECFDocumentMsgStatus_Ext.get(msgItem.MsgStatusCd.Value)

    return message
  }

  private function mapPostRsFields(message: ECFMessageDocumentPostRs_Ext, xmlContent: PostRs, messageType: LMMessageTypeString_Ext) : ECFMessageDocumentPostRs_Ext {
    // We create a new UUID here because the PostRs does not include its own UUID and it is a required field
    message.UUID = java.util.UUID.randomUUID().toString()
    message.OriginTimeStamp = ECFUtils.parseFlexibleDateType(xmlContent.TimeStamp.toString())
    message.MessageType = ECFMessageType_Ext.get(messageType.Code)
    message.MessageCategory = getMessageCategory(messageType)
    message.MessageDirection = ECFMessageDirectionType_Ext.TC_INBOUND
    return message
  }

  private function getMessageCategory(messageType : LMMessageTypeString_Ext) : LMMessageCategory_Ext{
    switch(messageType){
      case LMMessageTypeString_Ext.TC_REPOSITORYDOWNLOADRECEIPT:
        return LMMessageCategory_Ext.TC_IMRDOCUMENTDOWNLOAD
      case LMMessageTypeString_Ext.TC_REPOSITORYUPLOADRECEIPT:
        return LMMessageCategory_Ext.TC_IMRDOCUMENTUPLOAD
      case LMMessageTypeString_Ext.TC_REPOSITORYSEARCHRECEIPT:
        return LMMessageCategory_Ext.TC_IMRDOCUMENTSEARCH
      default:
        return null
    }
  }

  private function mapClaim(message: ECFMessageDocumentPostRs_Ext): ECFMessageDocumentPostRs_Ext {
    message.Claim = message.ReferredMessage.Claim
    return message
  }
}