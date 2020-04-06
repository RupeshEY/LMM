package gw.acc.iplm.xmlmapper.writeback.lloyds

uses gw.acc.iplm.xmlmapper.writeback.SAPClaimResponseRequestMapper

class LloydsSAPClaimResponseRqMapper extends SAPClaimResponseRequestMapper {

  construct(ecfClaimResponseMessage: ECFMessageClaimResponseRq_Ext) {
    super(ecfClaimResponseMessage)
    createPcsReference()
    createLcoCatastropheReference()
    createInsurerOrReinsurerClaimReferences()
    createPrivateComments()
    createPublicComments()
    createQueryReasons()
  }

  override protected function createResponseCode() {
    _claimResponseRq.ClaimResponse.AgreementPartyResponse.LloydsAgreeementPartyResponse = _ecfClaimResponseMessage.ResponseCode.Code
  }

  private function createPcsReference() {
    _claimResponseRq.Claim.PcsReference = _ecfClaimResponseMessage.PcsCatastropheCode.Code
  }

  private function createLcoCatastropheReference() {
    _claimResponseRq.Claim.LcoCatastropheReference = _ecfClaimResponseMessage.LcoCatastropheCode.Code
  }

}