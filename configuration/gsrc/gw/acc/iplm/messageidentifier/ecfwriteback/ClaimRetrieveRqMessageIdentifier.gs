package gw.acc.iplm.messageidentifier.ecfwriteback

uses gw.acc.iplm.messageidentifier.BaseMessageIdentifier
uses gw.acc.iplm.utils.ECFMessageConstants
uses gw.acc.iplm.utils.ECFXmlFileReader
uses gw.xml.XmlElement

class ClaimRetrieveRqMessageIdentifier extends BaseMessageIdentifier {

  override function messageType(): LMMessageTypeString_Ext {
    return LMMessageTypeString_Ext.TC_ECFMESSAGECLAIMRETRIEVERQ_EXT
  }

  override function canHandle(element: XmlElement): Boolean {
    var xmlPayload = ECFXmlFileReader.getPayloadObject(element)
    var messageType = xmlPayload.$QName.LocalPart

    return messageType == ECFMessageConstants.CLAIM_RETRIEVE_RQ_QNAME_LP
  }
}