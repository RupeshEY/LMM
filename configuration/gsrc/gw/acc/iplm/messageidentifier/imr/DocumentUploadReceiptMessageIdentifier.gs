package gw.acc.iplm.messageidentifier.imr

uses gw.acc.iplm.messageidentifier.BaseMessageIdentifier
uses gw.acc.iplm.utils.ECFMessageConstants
uses gw.acc.iplm.utils.ECFXmlFileReader
uses gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.PostRs
uses gw.xml.XmlElement

class DocumentUploadReceiptMessageIdentifier extends BaseMessageIdentifier {

  override function messageType(): LMMessageTypeString_Ext {
    return LMMessageTypeString_Ext.TC_REPOSITORYUPLOADRECEIPT
  }

  override function canHandle(element: XmlElement): Boolean {
    var xmlPayload = ECFXmlFileReader.getPayloadObject(element)
    var messageType = xmlPayload.$QName.LocalPart

    if (messageType != PostRs.$QNAME.LocalPart) {
      return false
    }

    try {
      messageType = PostRs.parse(xmlPayload.asUTFString()).MsgItems.MsgItem.first().MsgTypeCd
    } catch (e: Exception) {
      LOGGER.error("Fail to parse PostRs", e)
    }

    return messageType == ECFMessageConstants.DocumentUploadType
  }
}