package gw.acc.iplm.messageidentifier.imr

uses gw.acc.iplm.messageidentifier.BaseMessageIdentifier
uses gw.acc.iplm.utils.ECFMessageConstants
uses gw.acc.iplm.utils.ECFXmlFileReader
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.RepositoryOperationRs
uses gw.xml.XmlElement

class DocumentSearchRsMessageIdentifier extends BaseMessageIdentifier {

  override function messageType(): LMMessageTypeString_Ext {
    return LMMessageTypeString_Ext.TC_ECFMESSAGEDOCUMENTSEARCHRS_EXT
  }

  override function canHandle(element: XmlElement): Boolean {
    var xmlPayload = ECFXmlFileReader.getPayloadObject(element)
    var superMessageType = xmlPayload.$QName.LocalPart
    var messageType : String

    if (superMessageType != ECFMessageConstants.REPOSITORY_OPERATION_RS_QNAME_LP) {
      return false
    }

    try {
      messageType = RepositoryOperationRs.parse(xmlPayload.asUTFString()).RepositoryOperationTypeCd.toString()
    } catch (e: Exception) {
      LOGGER.error("Fail to parse RepositoryOperationRs", e)
    }

    return messageType == ECFMessageConstants.DocumentSearchType
  }
}