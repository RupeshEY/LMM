package gw.acc.iplm.xmlmapper.writeback.lirma

uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.xmlmapper.writeback.LeadClaimResponseRequestMapper
uses gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_LeadResponse_ClaimEntryAmounts
uses gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_LeadResponse_LirmaLead_LeadComments
uses gw.pl.currency.MonetaryAmount

class LirmaLeadClaimResponseRqMapper extends LeadClaimResponseRequestMapper {

  construct(ecfClaimResponseMessage: ECFMessageClaimResponseRq_Ext) {
    super(ecfClaimResponseMessage)
    createChaseUpIndicator()
    createLeadContractMarket()
    createContractualConditionsMayApplyIndicator()
    createMinorPrecautionaryIndicator()
    createAllUnderwritersToSeeFileIndicator()
    createClaimCategoryCode()
    createClaimSubCategoryCode()
    createJvClassOfBusiness()
    createCedantInLiquidationIndicator()
    createLeadComments()
  }

  /**
   * Create Lead role ClaimEntryAmounts For Bureau - Lirma
   */
  protected function createLeadClaimEntryAmountsForBureau(newClaimEntryAmount: ClaimResponseRq_ClaimResponse_LeadResponse_ClaimEntryAmounts,
                                                          claimEntryAmount: ECFMessageClaimDataFinancial_Ext) {

    var indexWithCcy = getIndexForFinancialCurrency(claimEntryAmount.Currency)

    if (indexWithCcy > 0) {
      var vatAmount = _ecfClaimResponseMessage.getFieldValue("VATAmount" + indexWithCcy) as MonetaryAmount
      var leadReserveAmount = _ecfClaimResponseMessage.getFieldValue("LeadReserveAmount" + indexWithCcy) as MonetaryAmount
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
      if (financialValueHasChanged(claimEntryAmount.LeadReserveAmount_amt, leadReserveAmount.Amount)) {
        newClaimEntryAmount.LeadReserveAmount = leadReserveAmount.Amount?:zeroValue
      }
      if (financialValueHasChanged(claimEntryAmount.ImportedServicesAmount_amt, importedServicesAmount.Amount)) {
        newClaimEntryAmount.ImportedServicesAmount = importedServicesAmount.Amount?:zeroValue
      }
      newClaimEntryAmount.ImportedServicesNarrative = importedServicesNarrative != claimEntryAmount.ImportedServicesNarrative ? importedServicesNarrative : null

      if (newClaimEntryAmount.VatAmount != null
          or newClaimEntryAmount.LeadReserveAmount != null
          or newClaimEntryAmount.ImportedServicesAmount != null
          or newClaimEntryAmount.ImportedServicesNarrative != null) {
        _claimResponseRq.ClaimResponse.LeadResponse.ClaimEntryAmounts.add(newClaimEntryAmount)
      }
    }
  }

  override protected function createResponseCode() {
    _claimResponseRq.ClaimResponse.LeadResponse.LirmaLead.LirmaResponse = _ecfClaimResponseMessage.ResponseCode.Code
  }

  private function createLeadComments() {
    var leadCommentsXml = new ArrayList<ClaimResponseRq_ClaimResponse_LeadResponse_LirmaLead_LeadComments>()
    var leadComments = _ecfClaimResponseMessage.PublicComments
    for (comment in leadComments) {
      var commentXml = new ClaimResponseRq_ClaimResponse_LeadResponse_LirmaLead_LeadComments()
      commentXml.CommentDetails = comment.Detail
      leadCommentsXml.add(commentXml)
    }

    _claimResponseRq.ClaimResponse.LeadResponse.LirmaLead.LeadComments = leadCommentsXml
  }

  private function createContractualConditionsMayApplyIndicator() {
    switch (_ecfClaimResponseMessage.ContractConditionsApplyInd) {
      case ECFContractConditions_Ext.TC_Y:
        _claimResponseRq.Claim.Indicators.ContractualConditionsMayApplyIndicator = gw.acc.iplm.xsd.claimresponse.claimresponserq.enums.ClaimResponseRq_Claim_Indicators_ContractualConditionsMayApplyIndicator.Y
        break
      case ECFContractConditions_Ext.TC_N:
        _claimResponseRq.Claim.Indicators.ContractualConditionsMayApplyIndicator = gw.acc.iplm.xsd.claimresponse.claimresponserq.enums.ClaimResponseRq_Claim_Indicators_ContractualConditionsMayApplyIndicator.N
        break
      case ECFContractConditions_Ext.TC_S:
        _claimResponseRq.Claim.Indicators.ContractualConditionsMayApplyIndicator = gw.acc.iplm.xsd.claimresponse.claimresponserq.enums.ClaimResponseRq_Claim_Indicators_ContractualConditionsMayApplyIndicator.S
        break
    }
  }

  private function createMinorPrecautionaryIndicator() {
    _claimResponseRq.Claim.Indicators.MinorPrecautionaryIndicator = _ecfClaimResponseMessage.MinorPrecautionaryIndicator
  }

  private function createAllUnderwritersToSeeFileIndicator() {
    _claimResponseRq.Claim.Indicators.AllUnderwritersToSeeFileIndicator = _ecfClaimResponseMessage.AllUnderwritersToSeeFileInd
  }

  private function createClaimCategoryCode() {
    _claimResponseRq.Claim.ClaimCategoryCode = _ecfClaimResponseMessage.CategoryCode.Code
  }

  private function createClaimSubCategoryCode() {
    _claimResponseRq.Claim.ClaimSubCategoryCode = _ecfClaimResponseMessage.SubCategoryCode.Code
  }

}