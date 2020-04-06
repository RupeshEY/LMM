package gw.acc.iplm.xmlmapper.writeback.lirma

uses gw.acc.iplm.xmlmapper.writeback.SAPClaimResponseRequestMapper
uses gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_LirmaCompany_RequestToBroker

class LirmaSAPClaimResponseRqMapper extends SAPClaimResponseRequestMapper {

  construct(ecfClaimResponseMessage: ECFMessageClaimResponseRq_Ext) {
    super(ecfClaimResponseMessage)
    createMultipleResponseIndicator()
    createNoFurtherResponseIndicator()
    createImmediatePartCollectionIndicator()
    createInsurerOrReinsurerClaimReferences()
    createRequestsToBroker()
    createPrivateFootnote()
  }

  override protected function createResponseCode() {
    _claimResponseRq.ClaimResponse.LirmaCompany.LirmaCompanyResponse = _ecfClaimResponseMessage.ResponseCode.Code
  }

  private function createMultipleResponseIndicator() {
    _claimResponseRq.Claim.Indicators.MultipleResponseIndicator = _ecfClaimResponseMessage.MultipleResponseIndicator
  }

  private function createNoFurtherResponseIndicator() {
    _claimResponseRq.Claim.Indicators.NoFurtherResponseIndicator = _ecfClaimResponseMessage.NoFurtherResponseIndicator
  }

  private function createImmediatePartCollectionIndicator() {
    _claimResponseRq.Claim.Indicators.ImmediatePartCollectionIndicator = _ecfClaimResponseMessage.ImmediatePartCollectionInd
  }

  private function createRequestsToBroker() {
    if(not _ecfClaimResponseMessage.RequestToBroker1.HasContent and not _ecfClaimResponseMessage.RequestToBroker2.HasContent){
      return
    }

    var requestStrings = new ArrayList<String>()
    if(_ecfClaimResponseMessage.RequestToBroker1!=null){
      requestStrings.add(_ecfClaimResponseMessage.RequestToBroker1)
    }
    if(_ecfClaimResponseMessage.RequestToBroker2!=null){
      requestStrings.add(_ecfClaimResponseMessage.RequestToBroker2)
    }

    var requestsToBroker = new ArrayList<ClaimResponseRq_ClaimResponse_LirmaCompany_RequestToBroker>()

    for(request in requestStrings){
      var requestXml = new ClaimResponseRq_ClaimResponse_LirmaCompany_RequestToBroker()
      requestXml.Request = request
      requestsToBroker.add(requestXml)
    }

    _claimResponseRq.ClaimResponse.LirmaCompany.RequestToBroker = requestsToBroker
  }

  private function createPrivateFootnote(){
    _claimResponseRq.ClaimResponse.LirmaCompany.PrivateFootnote = _ecfClaimResponseMessage.PrivateFootnote
  }
}