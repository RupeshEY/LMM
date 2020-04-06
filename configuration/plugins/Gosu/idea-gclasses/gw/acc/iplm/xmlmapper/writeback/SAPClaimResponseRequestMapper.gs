package gw.acc.iplm.xmlmapper.writeback

uses gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_AgreementPartyResponse_PrivateComments
uses gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_AgreementPartyResponse_PublicComments
uses gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_AgreementPartyResponse_QueryReason

abstract class SAPClaimResponseRequestMapper extends ClaimResponseRequestMapper {

  construct(ecfClaimResponseMessage: ECFMessageClaimResponseRq_Ext) {
    super(ecfClaimResponseMessage)
  }


  protected function createPrivateComments() {
    for (privateComment in _ecfClaimResponseMessage.PrivateComments) {
      var commentXml = new ClaimResponseRq_ClaimResponse_AgreementPartyResponse_PrivateComments()
      commentXml.CommentDetails = privateComment.Detail

      _claimResponseRq.ClaimResponse.AgreementPartyResponse.PrivateComments.add(commentXml)
    }
  }

  protected function createPublicComments() {
    for (publicComment in _ecfClaimResponseMessage.PublicComments) {
      var commentXml = new ClaimResponseRq_ClaimResponse_AgreementPartyResponse_PublicComments()
      commentXml.CommentDetails = publicComment.Detail

      _claimResponseRq.ClaimResponse.AgreementPartyResponse.PublicComments.add(commentXml)
    }
  }

  protected function createQueryReasons(){
    if (not _ecfClaimResponseMessage.QueryReasonAvailable) {
      return
    }

    var queryReasonXml = new ArrayList<ClaimResponseRq_ClaimResponse_AgreementPartyResponse_QueryReason>()
    for(reason in _ecfClaimResponseMessage.QueryReasons){
      var reasonXml = new ClaimResponseRq_ClaimResponse_AgreementPartyResponse_QueryReason()
      reasonXml.Value = reason.Reason.Code
      queryReasonXml.add(reasonXml)
    }

    _claimResponseRq.ClaimResponse.AgreementPartyResponse.QueryReason_elem = queryReasonXml
  }
}