package gw.acc.iplm.xmlmapper.writeback.lloyds

uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.xmlmapper.writeback.LeadClaimResponseRequestMapper
uses gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_LeadResponse_ClaimEntryAmounts
uses gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_LeadResponse_LloydsLead_PrivateComments
uses gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_LeadResponse_LloydsLead_PublicComments
uses gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_LeadResponse_LloydsLead_QueryReason
uses gw.pl.currency.MonetaryAmount

class LloydsLeadClaimResponseRqMapper extends LeadClaimResponseRequestMapper {

  construct(ecfClaimResponseMessage: ECFMessageClaimResponseRq_Ext) {
    super(ecfClaimResponseMessage)
    createLeadContractMarket()
    createClaimScheme()
    createTriagecategory()
    createRiskCode()
    createCauseOfLoss()
    createOutstandingAmountQualifier()
    createPcsReference()
    createLcoCatastropheReference()
    createInsurerOrReinsurerClaimReferences()
    createPrivateComments()
    createPublicComments()
    createQueryReasons()
    createXcsToAgreeIndicator()
  }

  /**
   * Create Lead role ClaimEntryAmounts For Bureau - Lloyds
   */
  protected function createLeadClaimEntryAmountsForBureau(newClaimEntryAmount: ClaimResponseRq_ClaimResponse_LeadResponse_ClaimEntryAmounts,
                                                          claimEntryAmount: ECFMessageClaimDataFinancial_Ext) {

    var indexWithCcy = getIndexForFinancialCurrency(claimEntryAmount.Currency)

    if (indexWithCcy > 0) {
      var vatAmount = _ecfClaimResponseMessage.getFieldValue("VATAmount" + indexWithCcy) as MonetaryAmount
      var leadReserveAmount = _ecfClaimResponseMessage.getFieldValue("LeadReserveAmount" + indexWithCcy) as MonetaryAmount
      var leadReserveFees = _ecfClaimResponseMessage.getFieldValue("LeadReserveFees" + indexWithCcy) as MonetaryAmount
      var targetCCy = _ecfClaimResponseMessage.getFieldValue("TargetCurrency" + indexWithCcy) as String

      if (targetCCy != null) {
        newClaimEntryAmount.TargetCurrency.Ccy = targetCCy
      }

      var zeroValue = 0bd.setScale(ECFConstants.DEFAULT_MONETARY_AMOUNT_SCALE)
      if (financialValueHasChanged(claimEntryAmount.SettlementVat_amt, vatAmount.Amount)) {
        newClaimEntryAmount.VatAmount = vatAmount.Amount?:zeroValue
      }
      if (financialValueHasChanged(claimEntryAmount.LeadReserveAmount_amt, leadReserveAmount.Amount)) {
        newClaimEntryAmount.LeadReserveAmount = leadReserveAmount.Amount?:zeroValue
      }
      if (financialValueHasChanged(claimEntryAmount.LeadReserveFees_amt, leadReserveFees.Amount)) {
        newClaimEntryAmount.LeadReserveFees = leadReserveFees.Amount?:zeroValue
      }

      if (newClaimEntryAmount.VatAmount != null
          or newClaimEntryAmount.LeadReserveAmount != null
          or newClaimEntryAmount.LeadReserveFees != null) {
        _claimResponseRq.ClaimResponse.LeadResponse.ClaimEntryAmounts.add(newClaimEntryAmount)
      }
    }
  }

  override protected function createResponseCode() {
    _claimResponseRq.ClaimResponse.LeadResponse.LloydsLead.LloydsResponse = _ecfClaimResponseMessage.ResponseCode.Code
  }

  private function createClaimScheme() {
    _claimResponseRq.Claim.ClaimsScheme = _ecfClaimResponseMessage.ClaimsScheme?.DisplayName
  }

  private function createTriagecategory() {
    _claimResponseRq.Claim.TriageCategory = _ecfClaimResponseMessage.TriageCategory?.Code
  }

  private function createRiskCode() {
    _claimResponseRq.ContractSection.RiskCode = _ecfClaimResponseMessage.RiskCode.DisplayName
  }

  private function createCauseOfLoss() {
    _claimResponseRq.ClaimResponse.LeadResponse.LloydsLead.CauseOfLoss = _ecfClaimResponseMessage.CauseOfLossCode.DisplayName
  }

  private function createOutstandingAmountQualifier() {
    _claimResponseRq.ClaimResponse.LeadResponse.LloydsLead.OutstandingAmountQualifier = _ecfClaimResponseMessage.OutstandingQualifierCode.Code
  }

  private function createPcsReference() {
    _claimResponseRq.Claim.PcsReference = _ecfClaimResponseMessage.PcsCatastropheCode.Code
  }

  private function createLcoCatastropheReference() {
    _claimResponseRq.Claim.LcoCatastropheReference = _ecfClaimResponseMessage.LcoCatastropheCode.Code
  }

  private function createPrivateComments() {
    var privateCommentsXml = new ArrayList<ClaimResponseRq_ClaimResponse_LeadResponse_LloydsLead_PrivateComments>()
    var privateComments = _ecfClaimResponseMessage.PrivateComments
    for (comment in privateComments) {
      var commentXml = new ClaimResponseRq_ClaimResponse_LeadResponse_LloydsLead_PrivateComments()
      commentXml.CommentDetails = comment.Detail
      privateCommentsXml.add(commentXml)
    }

    _claimResponseRq.ClaimResponse.LeadResponse.LloydsLead.PrivateComments = privateCommentsXml
  }

  private function createPublicComments() {
    var publicCommentsXml = new ArrayList<ClaimResponseRq_ClaimResponse_LeadResponse_LloydsLead_PublicComments>()
    var publicComments = _ecfClaimResponseMessage.PublicComments
    for (comment in publicComments) {
      var commentXml = new ClaimResponseRq_ClaimResponse_LeadResponse_LloydsLead_PublicComments()
      commentXml.CommentDetails = comment.Detail
      publicCommentsXml.add(commentXml)
    }

    _claimResponseRq.ClaimResponse.LeadResponse.LloydsLead.PublicComments = publicCommentsXml
  }

  internal function createQueryReasons() {
    if (not _ecfClaimResponseMessage.QueryReasonAvailable) {
      return
    }

    var queryReasonXml = new ArrayList<ClaimResponseRq_ClaimResponse_LeadResponse_LloydsLead_QueryReason>()
    for (reason in _ecfClaimResponseMessage.QueryReasons) {
      var reasonXml = new ClaimResponseRq_ClaimResponse_LeadResponse_LloydsLead_QueryReason()
      reasonXml.Value = reason.Reason.Code
      queryReasonXml.add(reasonXml)
    }

    _claimResponseRq.ClaimResponse.LeadResponse.LloydsLead.QueryReason_elem = queryReasonXml
  }

  internal function createXcsToAgreeIndicator() {
    _claimResponseRq.ClaimResponse.LeadResponse.LloydsLead.XcsToAgreeIndicator = _ecfClaimResponseMessage.XcsToAgreeIndicator
  }
}