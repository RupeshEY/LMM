package gw.acc.iplm.messageidentifier.ecfwriteback

uses gw.acc.iplm.messageidentifier.BaseMessageIdentifier
uses gw.acc.iplm.utils.ECFMessageConstants
uses gw.acc.iplm.utils.ECFXmlFileReader
uses gw.xml.XmlElement

class ClaimResponseRqMessageIdentifier extends BaseMessageIdentifier {

  override function messageType(): LMMessageTypeString_Ext {
    return LMMessageTypeString_Ext.TC_ECFMESSAGECLAIMRESPONSERQ_EXT
  }

  override function canHandle(element: XmlElement): Boolean {
    var xmlPayload = ECFXmlFileReader.getPayloadObject(element)
    var messageType = xmlPayload.$QName.LocalPart

    return messageType == ECFMessageConstants.CLAIM_RESPONSE_RQ_QNAME_LP
  }
}