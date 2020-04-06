package gw.acc.iplm.messageidentifier.ecfwriteback

uses gw.acc.iplm.messageidentifier.BaseMessageIdentifier
uses gw.acc.iplm.utils.ECFMessageConstants
uses gw.acc.iplm.utils.ECFXmlFileReader
uses gw.xml.XmlElement

class ClaimRetrieveRsMessageIdentifier extends BaseMessageIdentifier {

  override function messageType(): LMMessageTypeString_Ext {
    return LMMessageTypeString_Ext.TC_ECFMESSAGECLAIMRETRIEVERS_EXT
  }

  override function canHandle(element: XmlElement): Boolean {
    var xmlPayload = ECFXmlFileReader.getPayloadObject(element)
    var messageType = xmlPayload.$QName.LocalPart

    return messageType == ECFMessageConstants.CLAIM_RETRIEVE_RS_QNAME_LP
  }
}