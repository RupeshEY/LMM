package gw.acc.iplm.services.claim.lm.mapper

uses gw.acc.iplm.utils.ECFConstants
uses gw.api.financials.CurrencyAmount
uses gw.api.financials.FinancialsCalculationUtil
uses gw.api.financials.ReserveWizardHelper
uses gw.api.util.CurrencyUtil
uses gw.pl.currency.MonetaryAmount
uses org.slf4j.Logger
uses typekey.Currency

uses java.math.RoundingMode

class SCMReserveMapper {

  protected static final var LOGGER : Logger = ECFConstants.LOGGER_BLOCK()
  private var _reserveCurrency : Currency

  /**
   * Maps reserves from the financials in the SCM message to Reserves on the Claim
   *
   * @param message to map from
   * @param claim   to map reserves to
   * @return the updated Claim
   */
  public function mapReserve(message : LMMessageLloydsSCM_Ext, claim : Claim) : Claim {
    LOGGER.debug("Mapping reserves for Claim {}", claim.ClaimNumber)
    _reserveCurrency = message.OriginalCurrency

    if (hasReserves(message)) {
      var exposureToUpdate = claim.Exposures.firstWhere(\elt -> elt.OCR_Ext == message.OCR)
      mapIndemnityReserve(message, exposureToUpdate)
      mapFeeReserve(message, exposureToUpdate)
    }
    return claim
  }

  private function hasReserves(message : LMMessageLloydsSCM_Ext) : boolean {
    return hasIndemnity(message) or hasFees(message)
  }

  private function hasIndemnity(message : LMMessageLloydsSCM_Ext) : boolean {
    return message.OutstandingIndemnity != null and message.OutstandingIndemnity != 0
  }

  private function hasFees(message : LMMessageLloydsSCM_Ext) : boolean {
    return message.OutstandingFees != null and message.OutstandingFees != 0
  }

  private function getReserveHelper(exposure : Exposure) : ReserveWizardHelper {
    var reserveHelper = ReserveWizardHelper.createReserveWizardHelper()
    reserveHelper.initializeTransactionSet(exposure.Claim)
    reserveHelper.showAll()
    return reserveHelper
  }

  private function mapIndemnityReserve(message : LMMessageLloydsSCM_Ext, exposure : Exposure) {
    if (not hasIndemnity(message)) {
      return
    }
    var indemnityAmt = getSyndicateShareCurrencyAmount(message, message.OutstandingIndemnity)
    createReserve(indemnityAmt, exposure, CostCategory.TC_IPLMINDEMNITY, CostType.TC_CLAIMCOST)
  }

  private function mapFeeReserve(message : LMMessageLloydsSCM_Ext, exposure : Exposure) {
    if (not hasFees(message)) {
      return
    }
    var feeAmt = getSyndicateShareCurrencyAmount(message, message.OutstandingFees)
    createReserve(feeAmt, exposure, CostCategory.TC_IPLMFEE, CostType.TC_AOEXPENSE)
  }

  private function createReserve(amt : CurrencyAmount, exposure : Exposure, category : CostCategory, type : CostType) {
    var reserveHelper = getReserveHelper(exposure)
    var reserveWrapper = reserveHelper.getTransactionWrappers()
                          .where(\t -> t.Transaction.CostType == type &&
                              t.Transaction.CostCategory == category &&
                              t.Transaction.Exposure == exposure)
                                  .first()

    if (reserveWrapper == null) {
      reserveWrapper = reserveHelper.addNewTransactionWrapper(exposure)
      reserveWrapper.Transaction.CostType = type
      reserveWrapper.Transaction.CostCategory = category
    }

    reserveWrapper.NewAmountInTransactionCurrency.Amount = amt
    reserveWrapper.Currency = _reserveCurrency

    reserveHelper.beforeCommitWithoutRefreshingExposures()
  }

  private function getSyndicateShareCurrencyAmount(message : LMMessageLloydsSCM_Ext, amt : MonetaryAmount) : CurrencyAmount {
    return CurrencyAmount.getStrict((amt * message.ReceiverShare / 100).setScale(2, RoundingMode.HALF_UP), message.OriginalCurrency)
  }
}