package gw.acc.iplm.xmlmapper.writeback.ilu

uses gw.acc.iplm.xmlmapper.writeback.SAPClaimResponseRequestMapper

class ILUSAPClaimResponseRqMapper extends SAPClaimResponseRequestMapper {

  construct(ecfClaimResponseMessage: ECFMessageClaimResponseRq_Ext) {
    super(ecfClaimResponseMessage)
    createPrivateComments()
    createPublicComments()
    createQueryReasons()
  }

  protected override function createResponseCode() {
    _claimResponseRq.ClaimResponse.AgreementPartyResponse.IluAgreementPartyResponse = _ecfClaimResponseMessage.ResponseCode.Code
  }

}