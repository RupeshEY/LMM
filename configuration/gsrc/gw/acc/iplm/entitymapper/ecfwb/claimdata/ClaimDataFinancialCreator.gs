package gw.acc.iplm.entitymapper.ecfwb.claimdata

uses gw.acc.iplm.dto.ClaimMessageDTO
uses gw.acc.iplm.entitymapper.ecfwb.claimnotify.ClaimMovementAmountItemMapper
uses gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_ClaimAmounts
uses gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_ClaimEntryFinancialAmounts
uses gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_ClaimAmounts
uses gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_ClaimEntryFinancialAmounts
uses gw.pl.currency.MonetaryAmount
uses typekey.Currency

class ClaimDataFinancialCreator {

  private static final var LEAD_RESERVE_AMOUNT = "Lead_Reserve_Amount"
  private static final var LEAD_RESERVE_FEES = "Lead_Reserve_Fees"
  private static final var RESERVE_RELEASED_AMOUNT = "Reserve_Released_Amount"
  private static final var RESERVE_RETAINED_AMOUNT = "Reserve_Retained_Amount"
  private static final var INTEREST_ON_RESERVE_AMOUNT = "Interest_On_Reserve_Amount"
  private static final var TAX_ON_INTEREST_AMOUNT = "Tax_On_Interest_Amount"
  private static final var VAT_AMOUNT = "Vat_Amount"
  private static final var IMPORTED_SERVICES_AMOUNT = "Imported_Services_Amount"
  private static final var LETTER_OF_CREDIT_AMOUNT = "Letter_Of_Credit_Amount"
  private static final var OUTSTANDING_AMOUNT = "Outstanding_Amount"
  private static final var PREVIOUSLY_PAID_AMOUNT = "Previously_Paid_Amount"
  private static final var INCURRED_AMOUNT = "Incurred_Amount"
  private static final var PAID_THIS_TIME_AMOUNT = "Paid_This_Time_Amount"
  private static final var AGREE_THIS_TIME_AMOUNT = "Agree_This_Time_Amount"
  private static final var REV_AGREED_NOT_COLLECTED_AMOUNT = "Prev_Agreed_Not_Collected_Amount"
  private static final var PREVIOUSLY_PAID_AMOUNT_CLAIM = "Previously_Paid_Amount_Claim"
  private static final var PREV_AGREED_NOT_COLLECTED_AMOUNT_CLAIM = "Prev_Agreed_Not_Collected_Amount_Claim"
  private static final var FGU_AMOUNT_OF_LOSS_INCURRED_BY_ALL_LAYERS_OR_POLICIES_FROM_ZERO = "fgu_amount_of_loss_incurred_by_all_layers_or_policies_from_zero"
  private static final var LOSS_AND_EXPENSE_INCURRED_FOR_CONTRACT_BEFORE_RETENTION = "loss_and_expense_incurred_for_contract_before_retention"
  private static final var OUTSTANDING_LOSS_PLUS_EXPENSE_FOR_CONTRACT_BEFORE_RETENTION = "outstanding_loss_plus_expense_for_contract_before_retention"
  private static final var _100_PERCENT_LOSSES_AND_EXPENSES_PAID_FOR_CONTRACT_BEFORE_RETENTION = "100_percent_losses_and_expenses_paid_for_contract_before_retention"
  private static final var CURRENT_PAYMENT_LOSSES_AND_EXPENSES_FOR_CONTRACT = "current_payment_losses_and_expenses_for_contract"
  private static final var CURRENT_PAYMENT_LOSSES_FOR_THE_CONTRACT = "current_payment_losses_for_the_contract"
  private static final var PROFESSIONAL_ADVISOR_FEES_OUTSTANDING = "professional_advisor_fees_outstanding"
  private static final var PROFESSIONAL_ADVISOR_FEES_CURRENT_PAYMENT = "professional_advisor_fees_current_payment"

  public static function createFinancials(final ecfClaimData: ECFMessageClaimData_Ext, claimMessageDTO: ClaimMessageDTO) {

    var doc: ECFMessageClaimDataFinancial_Ext
    if (claimMessageDTO.ClaimNotifyEventRq != null) {
      var xmlClaimAmounts: List<ClaimNotifyEventRqType_ClaimMovement_ClaimAmounts> = null
      var xmlFinancials: List<ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_ClaimEntryFinancialAmounts>

      xmlClaimAmounts = claimMessageDTO.ClaimNotifyEventRq.ClaimMovement.ClaimAmounts
      xmlFinancials = claimMessageDTO.ClaimNotifyEventRq.ClaimMovement.Extension.ClaimEntry.ClaimEntryFinancialAmounts

      final var firstXmlFinancialAmount = xmlFinancials?.first()
      if (firstXmlFinancialAmount != null) {
        ecfClaimData.SettlementCurrency = settlementCurrency(firstXmlFinancialAmount, null)
        ecfClaimData.OriginalSplitReferenceCSV = firstXmlFinancialAmount.ServiceProviderOriginalSplitReference.join(",")
        ecfClaimData.OutstandingAmountQualifier = ECFOutstandingQualifierCode_Ext.get(firstXmlFinancialAmount.OutstandingAmountQualifier)
      }

      var matchedFinancials = xmlFinancials?.where(\xmlFin -> !xmlClaimAmounts?.where(\amt -> amt.Ccy == xmlFin.Ccy).isEmpty())
      matchedFinancials?.each(\xmlFin -> {
        final var xmlClaimAmt = xmlClaimAmounts.firstWhere(\amt -> amt.Ccy == xmlFin.Ccy)
        doc = convertFinancial(xmlClaimAmt, xmlFin, null, null)
        doc.ECFMsg = ecfClaimData
      })

      var unmatchedFinancials = xmlFinancials?.where(\xmlFin -> xmlClaimAmounts?.where(\amt -> amt.Ccy == xmlFin.Ccy).isEmpty())
      unmatchedFinancials?.each(\xmlFin -> {
        doc = convertFinancial(null, xmlFin, null, null)
        doc.ECFMsg = ecfClaimData
      })

      var unmatchedXmlClaimAmounts = xmlClaimAmounts?.where(\amt -> xmlFinancials?.where(\xmlFin -> amt.Ccy == xmlFin.Ccy).isEmpty())
      unmatchedXmlClaimAmounts?.each(\amt -> {
        doc = convertFinancial(amt, null, null, null)
        doc.ECFMsg = ecfClaimData
      })

    } else if (claimMessageDTO.ClaimRetrieveRs != null) {
      var xmlClaimAmounts: List<RetrieveClaimRs_ClaimMovement_ClaimAmounts> = null
      var xmlFinancials: List<RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_ClaimEntryFinancialAmounts>
      xmlClaimAmounts = claimMessageDTO.ClaimRetrieveRs.ClaimMovement.ClaimAmounts
      xmlFinancials = claimMessageDTO.ClaimRetrieveRs.ClaimMovement.Extension.ClaimEntry.ClaimEntryFinancialAmounts

      final var firstXmlFinancialAmount = xmlFinancials?.first()
      if (firstXmlFinancialAmount != null) {
        ecfClaimData.SettlementCurrency = settlementCurrency(null, firstXmlFinancialAmount)
        ecfClaimData.OriginalSplitReferenceCSV = firstXmlFinancialAmount.ServiceProviderOriginalSplitReference.join(",")
        ecfClaimData.OutstandingAmountQualifier = ECFOutstandingQualifierCode_Ext.get(firstXmlFinancialAmount.OutstandingAmountQualifier)
      }
      var matchedFinancials = xmlFinancials?.where(\xmlFin -> !xmlClaimAmounts?.where(\amt -> amt.Ccy == xmlFin.Ccy).isEmpty())
      matchedFinancials?.each(\xmlFin -> {
        final var xmlClaimAmt = xmlClaimAmounts.firstWhere(\amt -> amt.Ccy == xmlFin.Ccy)
        doc = convertFinancial(null, null, xmlClaimAmt, xmlFin)
        doc.ECFMsg = ecfClaimData
      })

      var unmatchedFinancials = xmlFinancials?.where(\xmlFin -> xmlClaimAmounts?.where(\amt -> amt.Ccy == xmlFin.Ccy).isEmpty())
      unmatchedFinancials?.each(\xmlFin -> {
        doc = convertFinancial(null, null, null, xmlFin)
        doc.ECFMsg = ecfClaimData
      })

      var unmatchedXmlClaimAmounts = xmlClaimAmounts?.where(\amt -> xmlFinancials?.where(\xmlFin -> amt.Ccy == xmlFin.Ccy).isEmpty())
      unmatchedXmlClaimAmounts?.each(\amt -> {
        doc = convertFinancial(null, null, amt, null)
        doc.ECFMsg = ecfClaimData
      })

    }
  }

  private static function convertFinancial(final cnClaimAmt: ClaimNotifyEventRqType_ClaimMovement_ClaimAmounts,
                                           final cnFinancialAmount: ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_ClaimEntryFinancialAmounts,
                                           final crClaimAmt: RetrieveClaimRs_ClaimMovement_ClaimAmounts,
                                           final crFinancialAmount: RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_ClaimEntryFinancialAmounts): ECFMessageClaimDataFinancial_Ext {
    final var financial = new ECFMessageClaimDataFinancial_Ext()
    final var financialsCcy = Currency.get(cnFinancialAmount.Ccy?:crFinancialAmount.Ccy)
    final var settlementCcy = settlementCurrency(cnFinancialAmount, null)?:settlementCurrency(null, crFinancialAmount)?:financialsCcy
    final var claimAmountsCcy = Currency.get(cnClaimAmt.Ccy?:crClaimAmt.Ccy)
    final var claimAmtMovement = cnClaimAmt.ClaimMovementAmtItem?:crClaimAmt.ClaimMovementAmtItem
    final var financialMovement = cnFinancialAmount.ClaimMovementAmtItem?:crFinancialAmount.ClaimMovementAmtItem
    if (financialsCcy != null) {
      financial.Currency = financialsCcy
    } else {
      financial.Currency = Currency.get(cnClaimAmt.Ccy)
    }

    if (claimAmountsCcy != null and claimAmtMovement != null) {
      financial.FguAmountIncurred = ClaimMovementAmountItemMapper.getClaimAmtMovementValue(claimAmtMovement, FGU_AMOUNT_OF_LOSS_INCURRED_BY_ALL_LAYERS_OR_POLICIES_FROM_ZERO, claimAmountsCcy)
      financial.LossAndExpensesIncurred = ClaimMovementAmountItemMapper.getClaimAmtMovementValue(claimAmtMovement, LOSS_AND_EXPENSE_INCURRED_FOR_CONTRACT_BEFORE_RETENTION, claimAmountsCcy)
      financial.OutstandingLossPlus = ClaimMovementAmountItemMapper.getClaimAmtMovementValue(claimAmtMovement, OUTSTANDING_LOSS_PLUS_EXPENSE_FOR_CONTRACT_BEFORE_RETENTION, claimAmountsCcy)
      financial.FullCostsPaidBefoRetent = ClaimMovementAmountItemMapper.getClaimAmtMovementValue(claimAmtMovement, _100_PERCENT_LOSSES_AND_EXPENSES_PAID_FOR_CONTRACT_BEFORE_RETENTION, claimAmountsCcy)
      financial.CurrentCostsForContract = ClaimMovementAmountItemMapper.getClaimAmtMovementValue(claimAmtMovement, CURRENT_PAYMENT_LOSSES_AND_EXPENSES_FOR_CONTRACT, claimAmountsCcy)
      financial.CurrentLossesForContract = ClaimMovementAmountItemMapper.getClaimAmtMovementValue(claimAmtMovement, CURRENT_PAYMENT_LOSSES_FOR_THE_CONTRACT, claimAmountsCcy)
      financial.ProfAdvisorFeesOutstanding = ClaimMovementAmountItemMapper.getClaimAmtMovementValue(claimAmtMovement, PROFESSIONAL_ADVISOR_FEES_OUTSTANDING, claimAmountsCcy)
      financial.ProfAdvisorFeesCurPayment = ClaimMovementAmountItemMapper.getClaimAmtMovementValue(claimAmtMovement, PROFESSIONAL_ADVISOR_FEES_CURRENT_PAYMENT, claimAmountsCcy)
    }
    if (financialsCcy != null and financialMovement!= null) {
      financial.LeadReserveAmount = ClaimMovementAmountItemMapper.getClaimAmtMovementValue(financialMovement, LEAD_RESERVE_AMOUNT, financialsCcy)
      financial.LeadReserveFees = ClaimMovementAmountItemMapper.getClaimAmtMovementValue(financialMovement, LEAD_RESERVE_FEES, financialsCcy)
      financial.ReinsuredReleasedAmount = ClaimMovementAmountItemMapper.getClaimAmtMovementValue(financialMovement, RESERVE_RELEASED_AMOUNT, financialsCcy)
      financial.ReinsuredRetainedAmount = ClaimMovementAmountItemMapper.getClaimAmtMovementValue(financialMovement, RESERVE_RETAINED_AMOUNT, financialsCcy)
      financial.ReinsuredRetainedInterest = ClaimMovementAmountItemMapper.getClaimAmtMovementValue(financialMovement, INTEREST_ON_RESERVE_AMOUNT, financialsCcy)
      financial.SettlementTax = ClaimMovementAmountItemMapper.getClaimAmtMovementValue(financialMovement, TAX_ON_INTEREST_AMOUNT, financialsCcy)
      financial.SettlementVat = ClaimMovementAmountItemMapper.getClaimAmtMovementValue(financialMovement, VAT_AMOUNT, financialsCcy)
      financial.ImportedServicesAmount = ClaimMovementAmountItemMapper.getClaimAmtMovementValue(financialMovement, IMPORTED_SERVICES_AMOUNT, financialsCcy)
    }
    if (settlementCcy != null) {
      financial.LetterOfCreditAmount = ClaimMovementAmountItemMapper.getClaimAmtMovementValue(financialMovement, LETTER_OF_CREDIT_AMOUNT, settlementCcy)
    }

    if (cnFinancialAmount != null) {
      financial.ImportedServicesNarrative = cnFinancialAmount.ImportedServicesNarrative?:crFinancialAmount.ImportedServicesNarrative
      financial.LetterOfCreditReference = cnFinancialAmount.LetterOfCreditReference?:crFinancialAmount.LetterOfCreditReference
      financial.FguNarrative = cnFinancialAmount.FguNarrative?:crFinancialAmount.FguNarrative
      if(cnFinancialAmount.SettlementAmount != null or crFinancialAmount.SettlementAmount != null) {
        financial.SettlementAmount = new MonetaryAmount(cnFinancialAmount.SettlementAmount?:crFinancialAmount.SettlementAmount, financialsCcy)
      }
      financial.ExchangeRate = cnFinancialAmount.ExchangeRate?:cnFinancialAmount.ExchangeRate
      final var cnfinancialAmountInfo = cnFinancialAmount.FinancialAmountInformation
      if (cnfinancialAmountInfo != null) {
        final var financialAmountInfoMovement = cnfinancialAmountInfo.ClaimMovementAmtItem
        createClaimMovementAmtItem(financial, financialAmountInfoMovement, financialsCcy)
      }
    }

    final var crfinancialAmountInfo = crFinancialAmount.FinancialAmountInformation
    if (crfinancialAmountInfo != null) {
      final var financialAmountInfoMovement = crfinancialAmountInfo.ClaimMovementAmtItem
      createClaimMovementAmtItem(financial, financialAmountInfoMovement, financialsCcy)
    }
    return financial
  }

  private static function createClaimMovementAmtItem(financial: ECFMessageClaimDataFinancial_Ext,
                                                     financialAmountInfoMovement: List<gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ClaimMovementAmtItem>, financialsCcy: Currency) {
    financial.Outstanding = ClaimMovementAmountItemMapper.getClaimAmtMovementValue(financialAmountInfoMovement, OUTSTANDING_AMOUNT, financialsCcy)
    financial.PreviouslyPaid = ClaimMovementAmountItemMapper.getClaimAmtMovementValue(financialAmountInfoMovement, PREVIOUSLY_PAID_AMOUNT, financialsCcy)
    financial.Incurred = ClaimMovementAmountItemMapper.getClaimAmtMovementValue(financialAmountInfoMovement, INCURRED_AMOUNT, financialsCcy)
    financial.Vat = ClaimMovementAmountItemMapper.getClaimAmtMovementValue(financialAmountInfoMovement, VAT_AMOUNT, financialsCcy)
    financial.CurrentPaid = ClaimMovementAmountItemMapper.getClaimAmtMovementValue(financialAmountInfoMovement, PAID_THIS_TIME_AMOUNT, financialsCcy)
    financial.CurrentAgreeded = ClaimMovementAmountItemMapper.getClaimAmtMovementValue(financialAmountInfoMovement, AGREE_THIS_TIME_AMOUNT, financialsCcy)
    financial.AgreedNotSettled = ClaimMovementAmountItemMapper.getClaimAmtMovementValue(financialAmountInfoMovement, REV_AGREED_NOT_COLLECTED_AMOUNT, financialsCcy)
    financial.ClaimLastPaid = ClaimMovementAmountItemMapper.getClaimAmtMovementValue(financialAmountInfoMovement, PREVIOUSLY_PAID_AMOUNT_CLAIM, financialsCcy)
    financial.ClaimAgreedNotSettled = ClaimMovementAmountItemMapper.getClaimAmtMovementValue(financialAmountInfoMovement, PREV_AGREED_NOT_COLLECTED_AMOUNT_CLAIM, financialsCcy)
  }


  private static function settlementCurrency(final cnFinancialAmount: ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_ClaimEntryFinancialAmounts,
                                             final crFinancialAmount: RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_ClaimEntryFinancialAmounts): Currency {
    if (cnFinancialAmount != null) {
      return cnFinancialAmount.TargetCurrency.Ccy == null ? null : Currency.get(cnFinancialAmount.TargetCurrency.Ccy)
    }
    if (crFinancialAmount != null) {
      return crFinancialAmount.TargetCurrency.Ccy == null ? null : Currency.get(crFinancialAmount.TargetCurrency.Ccy)
    }
    return null
  }

}