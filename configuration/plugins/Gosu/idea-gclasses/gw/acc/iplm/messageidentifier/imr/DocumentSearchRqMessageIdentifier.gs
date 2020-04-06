package gw.acc.iplm.messageidentifier.imr

uses gw.acc.iplm.messageidentifier.BaseMessageIdentifier
uses gw.acc.iplm.utils.ECFMessageConstants
uses gw.acc.iplm.utils.ECFXmlFileReader
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.RepositoryOperationRq
uses gw.xml.XmlElement

class DocumentSearchRqMessageIdentifier extends BaseMessageIdentifier {

  override function messageType(): LMMessageTypeString_Ext {
    return LMMessageTypeString_Ext.TC_ECFMESSAGEDOCUMENTSEARCHRQ_EXT
  }

  override function canHandle(element: XmlElement): Boolean {
    var xmlPayload = ECFXmlFileReader.getPayloadObject(element)
    var superMessageType = xmlPayload.$QName.LocalPart
    var messageType : String

    if (superMessageType != ECFMessageConstants.REPOSITORY_OPERATION_RQ_QNAME_LP) {
      return false
    }

    try {
      messageType = RepositoryOperationRq.parse(xmlPayload.asUTFString()).RepositoryOperationTypeCd.toString()
    } catch (e: Exception) {
      LOGGER.error("Fail to parse RepositoryOperationRq", e)
    }

    return messageType == ECFMessageConstants.DocumentSearchType
  }
}