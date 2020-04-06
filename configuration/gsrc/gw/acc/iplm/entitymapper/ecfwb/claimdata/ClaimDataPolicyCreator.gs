package gw.acc.iplm.entitymapper.ecfwb.claimdata

uses gw.acc.iplm.dto.ClaimMessageDTO
uses gw.acc.iplm.entitymapper.ecfwb.claimnotify.ClaimMovementAmountItemMapper
uses gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Contract_ContractMarket
uses gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Contract_ContractMarket_InsurerOrReinsurer
uses gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Contract_ContractMarket
uses gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Contract_ContractMarket_InsurerOrReinsurer

class ClaimDataPolicyCreator {

  private static final var CASH_SETTLEMENT_AMOUNT = "Cash_Settlement_Amount"
  private static final var LETTER_OF_CREDIT_AMOUNT = "Letter_Of_Credit_Amount"
  public static final var POLICY_TYPE_MAX_WIDTH: int = 40

  public static function createPolicies(final claimData: ECFMessageClaimData_Ext, final claimMessageDTO: ClaimMessageDTO) {
    var claimNotifyRq = claimMessageDTO.ClaimNotifyEventRq
    var claimRetrieveRs = claimMessageDTO.ClaimRetrieveRs

    claimData.Insured = claimNotifyRq.InsuredName?:claimRetrieveRs.InsuredName
    claimData.Policyholder = claimNotifyRq.ClaimOriginalPolicyName?:claimRetrieveRs.ClaimOriginalPolicyName
    claimData.PolicyNumber = claimNotifyRq.PolicyNumber?:claimRetrieveRs.PolicyNumber
    claimData.RiskReference = claimNotifyRq.RiskReference?:claimRetrieveRs.RiskReference
    claimData.BrokerReference = claimNotifyRq.BrokerPolicyReference?:claimRetrieveRs.BrokerPolicyReference
    claimData.RiskDescription = claimNotifyRq.RiskDescription?:claimRetrieveRs.RiskDescription
    claimData.RiskLocation = claimNotifyRq.RiskLocation?:claimRetrieveRs.RiskLocation
    claimData.PolicyType = claimNotifyRq.PolicyType?:claimRetrieveRs.PolicyType
    claimData.CoverType = claimNotifyRq.CoverType?:claimRetrieveRs.CoverType
    claimData.RiskCode = claimNotifyRq.RiskCode?:claimRetrieveRs.RiskCode

    claimData.BrokerId = claimNotifyRq.BrokerId?:claimRetrieveRs.BrokerId
    claimData.BrokerName = claimNotifyRq.BrokerName?:claimRetrieveRs.BrokerName
    claimData.BrokerContact = claimNotifyRq.BrokerContact?:claimRetrieveRs.BrokerContact
    claimData.BrokerPhone = claimNotifyRq.BrokerPhone?:claimRetrieveRs.BrokerPhone
    claimData.BrokerEmail = claimNotifyRq.BrokerEmail?:claimRetrieveRs.BrokerEmail

    claimData.CoLeadIndicator = claimNotifyRq.CoLeadIndicator?:claimRetrieveRs.CoLeadIndicator
    claimData.LeadName = claimNotifyRq.LeadName?:claimRetrieveRs.LeadName

    createCarriers(claimData, claimNotifyRq.ClaimMovement?.Extension.Contract.ContractMarket,
        claimRetrieveRs.ClaimMovement?.Extension.Contract.ContractMarket)
  }

  private static function createCarriers(claimData: ECFMessageClaimData_Ext,
                                         notifyReqContractMarket: List<ClaimNotifyEventRqType_ClaimMovement_Extension_Contract_ContractMarket>,
                                         claimRetrieveRsContractMarket: List<RetrieveClaimRs_ClaimMovement_Extension_Contract_ContractMarket>): void {
    if (notifyReqContractMarket != null) {
      notifyReqContractMarket.each(\market -> {
        market.InsurerOrReinsurer.each(\insurerOrReinsurer -> {
          final var carrier = convertCarrier(insurerOrReinsurer, null)
          carrier.ECFMsg = claimData
        })
      })
    }

    if (claimRetrieveRsContractMarket != null) {
      claimRetrieveRsContractMarket.each(\market -> {
        market.InsurerOrReinsurer.each(\insurerOrReinsurer -> {
          final var carrier = convertCarrier(null, insurerOrReinsurer)
          carrier.ECFMsg = claimData
        })
      })
    }
  }


  private static function convertCarrier(final cnInsurer: ClaimNotifyEventRqType_ClaimMovement_Extension_Contract_ContractMarket_InsurerOrReinsurer,
                                         final rcInsurer: RetrieveClaimRs_ClaimMovement_Extension_Contract_ContractMarket_InsurerOrReinsurer): ECFMessageClaimDataCarrier_Ext {
    final var carrier = new ECFMessageClaimDataCarrier_Ext()
    carrier.Market = cnInsurer.Market?:rcInsurer.Market
    carrier.Contact = cnInsurer.ContactName?:rcInsurer.ContactName
    carrier.Name = cnInsurer.PartyName?:rcInsurer.PartyName
    carrier.Email = cnInsurer.ContactEmail?:rcInsurer.ContactEmail
    carrier.Phone = cnInsurer.ContactTelephone?:rcInsurer.ContactTelephone
    carrier.Share = cnInsurer.ShareRate?:rcInsurer.ShareRate
    carrier.Reference1 = cnInsurer.Reference1?:rcInsurer.Reference2
    carrier.Reference2 = cnInsurer.Reference2?:rcInsurer.Reference2
    carrier.Role = cnInsurer.Role?:rcInsurer.Role
    carrier.Code = cnInsurer.Code?:rcInsurer.Code
    carrier.Consortium = cnInsurer.ConsortiumNumber?:rcInsurer.ConsortiumNumber
    carrier.ClaimLineNumber = cnInsurer.ClaimLineNumber?:rcInsurer.ClaimLineNumber

    if (cnInsurer != null) {
      cnInsurer.MarketFinancialAmounts.each(\xmlMarketFinancialAmount -> {
        final var ccy = Currency.get(xmlMarketFinancialAmount.Ccy)
        final var marketFinancialAmount = new ECFMarketFinancialAmount_Ext()
        marketFinancialAmount.CashSettlementAmount = ClaimMovementAmountItemMapper.getClaimAmtMovementValue(xmlMarketFinancialAmount.ClaimMovementAmtItem, CASH_SETTLEMENT_AMOUNT, ccy)
        marketFinancialAmount.LetterOfCreditAmount = ClaimMovementAmountItemMapper.getClaimAmtMovementValue(xmlMarketFinancialAmount.ClaimMovementAmtItem, LETTER_OF_CREDIT_AMOUNT, ccy)
        marketFinancialAmount.Carrier = carrier
      })
    }
    if (rcInsurer != null) {
      rcInsurer.MarketFinancialAmounts.each(\xmlMarketFinancialAmount -> {
        final var ccy = Currency.get(xmlMarketFinancialAmount.Ccy)
        final var marketFinancialAmount = new ECFMarketFinancialAmount_Ext()
        marketFinancialAmount.CashSettlementAmount = ClaimMovementAmountItemMapper.getClaimAmtMovementValue(xmlMarketFinancialAmount.ClaimMovementAmtItem, CASH_SETTLEMENT_AMOUNT, ccy)
        marketFinancialAmount.LetterOfCreditAmount = ClaimMovementAmountItemMapper.getClaimAmtMovementValue(xmlMarketFinancialAmount.ClaimMovementAmtItem, LETTER_OF_CREDIT_AMOUNT, ccy)
        marketFinancialAmount.Carrier = carrier
      })
    }

    return carrier
  }
}