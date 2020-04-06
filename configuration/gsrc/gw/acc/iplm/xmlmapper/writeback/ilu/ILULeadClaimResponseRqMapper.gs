package gw.acc.iplm.xmlmapper.writeback.ilu

uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.xmlmapper.writeback.LeadClaimResponseRequestMapper
uses gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_LeadResponse_ClaimEntryAmounts
uses gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_LeadResponse_IluLead_PrivateComments
uses gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_LeadResponse_IluLead_PublicComments
uses gw.pl.currency.MonetaryAmount


class ILULeadClaimResponseRqMapper extends LeadClaimResponseRequestMapper {

  construct(ecfClaimResponseMessage: ECFMessageClaimResponseRq_Ext) {
    super(ecfClaimResponseMessage)
    createChaseUpIndicator()
    createJvClassOfBusiness()
    createCedantInLiquidationIndicator()
    createPrivateComments()
    createPublicComments()
  }

  /**
   * Create Lead role ClaimEntryAmounts For Bureau - ILU
   */
  protected function createLeadClaimEntryAmountsForBureau(newClaimEntryAmount: ClaimResponseRq_ClaimResponse_LeadResponse_ClaimEntryAmounts,
                                                          claimEntryAmount: ECFMessageClaimDataFinancial_Ext) {
    var indexWithCcy = getIndexForFinancialCurrency(claimEntryAmount.Currency)

    if (indexWithCcy > 0) {
      var vatAmount = _ecfClaimResponseMessage.getFieldValue("VATAmount" + indexWithCcy) as MonetaryAmount
      var importedServicesAmount = _ecfClaimResponseMessage.getFieldValue("ImportedServicesAmount" + indexWithCcy) as MonetaryAmount
      var importedServicesNarrative = _ecfClaimResponseMessage.getFieldValue("ImportedServicesNarrative" + indexWithCcy) as String
      var targetCCy = _ecfClaimResponseMessage.getFieldValue("TargetCurrency" + indexWithCcy) as String

      if (targetCCy != null) {
        newClaimEntryAmount.TargetCurrency.Ccy = targetCCy
      }

      var zeroValue = 0bd.setScale(ECFConstants.DEFAULT_MONETARY_AMOUNT_SCALE)
      if (financialValueHasChanged(claimEntryAmount.SettlementVat_amt, vatAmount.Amount)) {
        newClaimEntryAmount.VatAmount = vatAmount.Amount?:zeroValue
      }
      if (financialValueHasChanged(claimEntryAmount.ImportedServicesAmount_amt, importedServicesAmount.Amount)) {
        newClaimEntryAmount.ImportedServicesAmount = importedServicesAmount.Amount?:zeroValue
      }
      newClaimEntryAmount.ImportedServicesNarrative = importedServicesNarrative != claimEntryAmount.ImportedServicesNarrative ? importedServicesNarrative : null

      if (newClaimEntryAmount.VatAmount != null
          or newClaimEntryAmount.ImportedServicesAmount != null
          or newClaimEntryAmount.ImportedServicesNarrative != null) {
        _claimResponseRq.ClaimResponse.LeadResponse.ClaimEntryAmounts.add(newClaimEntryAmount)
      }
    }
  }

  protected override function createResponseCode() {
    _claimResponseRq.ClaimResponse.LeadResponse.IluLead.IluResponse = _ecfClaimResponseMessage.ResponseCode.Code
  }

  private function createPrivateComments() {
    var privateCommentsXml = new ArrayList<ClaimResponseRq_ClaimResponse_LeadResponse_IluLead_PrivateComments>()
    var privateComments = _ecfClaimResponseMessage.PrivateComments
    for (comment in privateComments) {
      var commentXml = new ClaimResponseRq_ClaimResponse_LeadResponse_IluLead_PrivateComments()
      commentXml.CommentDetails = comment.Detail
      privateCommentsXml.add(commentXml)
    }

    _claimResponseRq.ClaimResponse.LeadResponse.IluLead.PrivateComments = privateCommentsXml
  }

  private function createPublicComments() {
    var publicCommentsXml = new ArrayList<ClaimResponseRq_ClaimResponse_LeadResponse_IluLead_PublicComments>()
    var publicComments = _ecfClaimResponseMessage.PublicComments
    for (comment in publicComments) {
      var commentXml = new ClaimResponseRq_ClaimResponse_LeadResponse_IluLead_PublicComments()
      commentXml.CommentDetails = comment.Detail
      publicCommentsXml.add(commentXml)
    }

    _claimResponseRq.ClaimResponse.LeadResponse.IluLead.PublicComments = publicCommentsXml
  }
}