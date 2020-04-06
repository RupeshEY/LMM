package gw.acc.iplm.services.message.ecfwriteback

uses gw.acc.iplm.services.api.OutboundECFService
uses gw.acc.iplm.utils.ECFMessageConstants
uses gw.acc.iplm.xmlmapper.claimretrieve.RetrieveClaimRqMapper
uses gw.xml.XmlElement

class ClaimRetrieveRqService extends OutboundECFService<ECFMessageClaimRetrieveRq_Ext> {

  override property get SOAPHeaderMessageType(): String {
    return ECFMessageConstants.CLAIMRETRIEVE_HEADER_TYPE
  }

  override function generatePayloadBody(message: ECFMessageClaimRetrieveRq_Ext): XmlElement {
    return new RetrieveClaimRqMapper(message).createRetrieveClaimRq()
  }
}