package gw.acc.iplm.xmlmapper.writeback

uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.utils.ECFIndicatorEnum
uses gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_LeadResponse_ClaimEntryAmounts
uses gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_LeadResponse_ContractMarket
uses gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_LeadResponse_ContractMarket_InsurerOrReinsurer
uses gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_LeadResponse_LeadContact
uses gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_Claim_Indicators
uses gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_Claim_Indicators_ChaseUpIndicator
uses gw.acc.iplm.xsd.claimresponse.claimresponserq.enums.ClaimResponseRq_ClaimResponse_LeadResponse_ContractMarket_InsurerOrReinsurer_AgreementPartyModifiedIndicator
uses gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Party
uses gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.TargetCurrency
uses org.apache.commons.lang3.StringUtils
uses typekey.Currency

uses java.math.BigDecimal

/**
 * Common methods for mapping ClaimResponseRq XML across all bureau for Lead role
 */
abstract class LeadClaimResponseRequestMapper extends ClaimResponseRequestMapper {

  construct(ecfClaimResponseMessage: ECFMessageClaimResponseRq_Ext) {
    super(ecfClaimResponseMessage)
    initialiseMandatoryLeadDetails()
  }

  private function initialiseMandatoryLeadDetails() {
    createLeadClaimEntryAmounts()
    createClaimIndicators()
    createSimultaneousRIPIndicator()
    createLeadContactDetails()
    createLeadContractMarket()
  }

  /**
   * Create Lead role ClaimEntryAmounts
   */
  protected function createLeadClaimEntryAmounts() {
    var claimDataFinancials = _ecfClaimResponseMessage?.ClaimDataResponded?.Financials
    for (claimEntryAmount in claimDataFinancials) {
      var newClaimEntryAmount = new ClaimResponseRq_ClaimResponse_LeadResponse_ClaimEntryAmounts()
      newClaimEntryAmount.Ccy = claimEntryAmount.Currency.DisplayName
      createLeadClaimEntryAmountsForBureau(newClaimEntryAmount, claimEntryAmount)
    }
  }

  /**
   * Gets the index of the currency in _ecfClaimResponseMessage that matches ccy
   * For example if ccy is GBP and Currency1 in _ecfClaimResponseMessage is GBP this returns 1
   *
   * @param ccy Currency to check for
   * @return the index of the currency in _ecfClaimResponseMessage that matches ccy
   */
  protected function getIndexForFinancialCurrency(ccy: Currency): int {
    var currencies = {_ecfClaimResponseMessage.Currency1, _ecfClaimResponseMessage.Currency2, _ecfClaimResponseMessage.Currency3}
    var indexWithCcy: int

    currencies.eachWithIndex(\currency, index -> {
      if (currency == ccy) {
        indexWithCcy = index + 1
      }
    })

    return indexWithCcy
  }

  protected abstract function createLeadClaimEntryAmountsForBureau(newClaimEntryAmount: ClaimResponseRq_ClaimResponse_LeadResponse_ClaimEntryAmounts, claimEntryAmount: ECFMessageClaimDataFinancial_Ext)

  /**
   * The XML at wb:ClaimResponseRq/wb:Claim/wb:Indicators is mandatory Lloyds Lead responses.
   * <p>
   * It is option for ILU and LIRMA lead responses.
   */
  private function createSimultaneousRIPIndicator() {
    if (_ecfClaimResponseMessage.BureauType == ECFBureauType_Ext.TC_LLOYDS) {
      var simultaneousRIPIndicator = _ecfClaimResponseMessage.SimultaneousRIPIndicator

      if (simultaneousRIPIndicator == null) {
        var previousValue = _ecfClaimResponseMessage.ClaimDataResponded?.SimultaneousReinstatementReqBoolean?.booleanValue()
        simultaneousRIPIndicator = ECFIndicatorEnum.findByBooleanValue(previousValue).IntegrationCode
      }

      _claimResponseRq.Claim.Indicators.SimultaneousRIPIndicator = simultaneousRIPIndicator
    } else {
      _claimResponseRq.Claim.Indicators.SimultaneousRIPIndicator = _ecfClaimResponseMessage.SimultaneousRIPIndicator
    }
  }

  /**
   * This method will create the LeadContact element based on the details in the message entity
   * ClaimResponseRq.ClaimResponse.LeadResponse.LeadContact
   */
  protected function createLeadContactDetails() {
    var leadContact = new ClaimResponseRq_ClaimResponse_LeadResponse_LeadContact()
    leadContact.PersonName = _ecfClaimResponseMessage.LeadContactName
    leadContact.Telephone = _ecfClaimResponseMessage.LeadContactTelephone
    leadContact.Email = _ecfClaimResponseMessage.LeadContactEmail

    final var leadContactFields = {leadContact.PersonName, leadContact.Telephone, leadContact.Email}
    final var hasLeadContact = leadContactFields.hasMatch(\contactField -> StringUtils.isNotBlank(contactField))

    if (hasLeadContact) {
      _claimResponseRq.ClaimResponse.LeadResponse.LeadContact = leadContact
    }
  }

  protected function financialValueHasChanged(originalValue: BigDecimal, newValue: BigDecimal): Boolean {
    var defaultValue = 0bd.setScale(ECFConstants.DEFAULT_MONETARY_AMOUNT_SCALE)

    return not((originalValue == null and newValue == defaultValue) or (originalValue == newValue))
  }

  /**
   * Create ChaseUpIndicator XML. Only applies to ILU and LIRMA Lead
   */
  protected function createChaseUpIndicator() {
    if (_ecfClaimResponseMessage.ChaseUpIndicator == null) {
      return
    }

    var chaseUpIndicator = new ClaimResponseRq_Claim_Indicators_ChaseUpIndicator()

    chaseUpIndicator.Indicator = _ecfClaimResponseMessage.ChaseUpIndicator
    if (_ecfClaimResponseMessage.ChaseUpIndicatorBoolean) {
      chaseUpIndicator.Interval = _ecfClaimResponseMessage.ChaseUpIndicatorInterval
    }

    _claimResponseRq.Claim.Indicators.ChaseUpIndicator = chaseUpIndicator
  }

  /**
   * Create ContractMarket for Agreement Party modifications in this response.
   * Only applies to ILU and Lloyd's Lead
   */
  protected function createLeadContractMarket() {
    var contractMarket = new ClaimResponseRq_ClaimResponse_LeadResponse_ContractMarket()
    var insurerOrReinsurers = new ArrayList<ClaimResponseRq_ClaimResponse_LeadResponse_ContractMarket_InsurerOrReinsurer>()
    for (party in _ecfClaimResponseMessage.ClaimParticipantRoles) {
      if (party.ParticipantFunctionChanged) {
        var modifiedInsurerOrReinsurer = new ClaimResponseRq_ClaimResponse_LeadResponse_ContractMarket_InsurerOrReinsurer()
        if (party.NewParticipantFunction == ECFParticipantFunction_Ext.TC_AGREEMENTPARTY) {
          modifiedInsurerOrReinsurer.AgreementPartyModifiedIndicator = ClaimResponseRq_ClaimResponse_LeadResponse_ContractMarket_InsurerOrReinsurer_AgreementPartyModifiedIndicator.Add
        } else if (party.NewParticipantFunction == ECFParticipantFunction_Ext.TC_FOLLOWER) {
          modifiedInsurerOrReinsurer.AgreementPartyModifiedIndicator = ClaimResponseRq_ClaimResponse_LeadResponse_ContractMarket_InsurerOrReinsurer_AgreementPartyModifiedIndicator.Rem
        }
        modifiedInsurerOrReinsurer.Party = new Party()
        modifiedInsurerOrReinsurer.Party.Id = {party.PartyID}
        modifiedInsurerOrReinsurer.Party.FirstAgency = party.BureauType.Code
        modifiedInsurerOrReinsurer.Party.Name = party.PartyName
        insurerOrReinsurers.add(modifiedInsurerOrReinsurer)
      }
    }
    if (insurerOrReinsurers.HasElements) {
      contractMarket.InsurerOrReinsurer = insurerOrReinsurers
      _claimResponseRq.ClaimResponse.LeadResponse.ContractMarket = contractMarket
    }
  }

  /**
   * Create Bulk List details
   * Only applies to ILU and LIRMA Lead
   */
  protected function createLeadResponseBulkList() {
    // TODO: Implement this for ILU/LIRMA Leads. Wanted behaviour needs to be confirmed with PM
  }

  protected function createClaimIndicators() {
    _claimResponseRq.Claim.Indicators = new ClaimResponseRq_Claim_Indicators()
  }

  protected function createJvClassOfBusiness() {
    _claimResponseRq.ContractSection = new gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ContractSection()
    _claimResponseRq.ContractSection.JvClassOfBusiness = _ecfClaimResponseMessage.ClassOfBusiness.Code
  }

  protected function createCedantInLiquidationIndicator() {
    _claimResponseRq.Claim.Indicators.CedantInLiquidationIndicator = _ecfClaimResponseMessage.CedantInLiquidationIndicator
  }

}