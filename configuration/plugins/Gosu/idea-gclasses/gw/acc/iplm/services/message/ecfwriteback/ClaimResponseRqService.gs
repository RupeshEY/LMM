package gw.acc.iplm.services.message.ecfwriteback

uses gw.acc.iplm.services.api.OutboundECFService
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.utils.ECFMessageConstants
uses gw.acc.iplm.xmlmapper.writeback.ClaimResponseRqMapperFactory
uses gw.xml.XmlElement

class ClaimResponseRqService extends OutboundECFService<ECFMessageClaimResponseRq_Ext> {

  override property get SOAPHeaderMessageType(): String {
    return ECFMessageConstants.CLAIMRESPONSE_HEADER_TYPE
  }

  override function generatePayloadBody(claimResponseRqMessage: ECFMessageClaimResponseRq_Ext): XmlElement {
    return new ClaimResponseRqMapperFactory().getMapper(claimResponseRqMessage)?.createClaimResponseRq()
  }

  override function process(message: ECFMessageClaimResponseRq_Ext) {
    super.process(message)
    changeRespondedClaimDataMessageState(message)
    // TODO: US27164, Set transaction response status
  }

  /**
   * Changes the ECFClaimMessageState_Ext on the ECFMessageClaimData_Ext that this process is responding to.
   *
   * @param claimResponseRqMessage The ECFMessageClaimResponseRq_Ext that we are processing
   */
  protected function changeRespondedClaimDataMessageState(claimResponseRqMessage: ECFMessageClaimResponseRq_Ext) {
    if (claimResponseRqMessage.FinalResponse) {
      gw.transaction.Transaction.runWithNewBundle(\bundle -> {
        var claimData = claimResponseRqMessage.ClaimDataResponded
        claimData = bundle.add(claimData)
        claimData.MessageState = ECFClaimMessageState_Ext.TC_PENDING
      }, ECFConstants.ECF_SUPER_USER)
    }
  }
}