package gw.plugin.financials.reinsurance
uses gw.pl.util.BigDecimalUtil
uses gw.api.financials.FinancialsCalculations
uses gw.api.util.CurrencyUtil
uses gw.api.financials.CurrencyAmount
uses gw.api.util.CCCurrencyUtil
uses java.math.BigDecimal
uses gw.entity.IEntityType
uses gw.api.financials.FinancialsCalculator

@Export
class ReinsuranceTransactionPluginImpl implements IReinsuranceTransactionPlugin {

  private static function unadjustedCededReservesCalc() : FinancialsCalculator {
    return FinancialsCalculations.getRITotalCededReservesNonAdjustments()
  }
  private static function unadjustedRecoverablesCalc() : FinancialsCalculator {
    return FinancialsCalculations.getRITotalRecoverablesNonAdjustments()
  }
  private static function committedOpenReservesCalc(): FinancialsCalculator {
    return FinancialsCalculations.getSubmittedOpenReserves()
  }
  private static function committedNetPaymentsCalc() : FinancialsCalculator {
    return FinancialsCalculations.getSubmittedNetPayments()
  }

  private static function safeMultiply(amount : CurrencyAmount, factor : BigDecimal, type : IEntityType) : BigDecimal {
    if (amount==null) {
      return BigDecimal.ZERO
    } else {
      return amount.multiplyStrict(factor, CCCurrencyUtil.getRoundingMode(type)).Amount
    }
  }

  private static function hasContributingReservesWithoutRITransactions(reserveLine : ReserveLine) : Boolean {
    // If there are reserves that contribute to the agreement's exposures and there are no ri transactions, create a RI transaction
    return !isNullOrZero(committedOpenReservesCalc().withReserveLine(reserveLine).Amount) and unadjustedCededReservesCalc().withReserveLine(reserveLine).Amount == null
  }  
  
  private static function hasContributingRecoverablesWithoutRITransactions(reserveLine : ReserveLine) : Boolean {
    // If there are recoverables that contribute to the agreement's exposures and there are no ri transactions, create a RI transaction
    return !isNullOrZero(committedNetPaymentsCalc().withReserveLine(reserveLine).Amount) and unadjustedRecoverablesCalc().withReserveLine(reserveLine).Amount == null
  }
  
  private static function isNullOrZero(amount : CurrencyAmount) : Boolean {
    return amount == null or BigDecimalUtil.isZero(amount.Amount)
  }
  
  private static function setToTarget( newRITransactionSet : RITransactionSet,
                                       riCoding : RICoding,
                                       targetTotalCededReserves : BigDecimal,
                                       targetTotalRecoverables : BigDecimal) {
    var currentTotalCededReserves = CurrencyUtil.nz(unadjustedCededReservesCalc().withRICoding(riCoding).Amount)
    var currentTotalRecoverables = CurrencyUtil.nz(unadjustedRecoverablesCalc().withRICoding(riCoding).Amount)
    var reserveLine = riCoding.ReserveLine
    var agreement = riCoding.RIAgreement
    if (currentTotalCededReserves.compareTo(targetTotalCededReserves) != 0 or
        hasContributingReservesWithoutRITransactions(reserveLine)) {
      newRITransactionSet.newCededReserve(agreement, reserveLine,
          targetTotalCededReserves.subtract(currentTotalCededReserves), false)
    }

    if (currentTotalRecoverables.compareTo(targetTotalRecoverables) != 0 or
        hasContributingRecoverablesWithoutRITransactions(reserveLine)) {
      newRITransactionSet.newRecoverable(agreement, reserveLine,
          targetTotalRecoverables.subtract(currentTotalRecoverables), false)
    }                                         
   }
  
  private static function setToTarget( newRITransactionSet : RITransactionSet,
                                       agreement : RIAgreement,
                                       reserveLine : ReserveLine,
                                       targetTotalCededReserves : BigDecimal,
                                       targetTotalRecoverables : BigDecimal ) {
    var currentTotalCededReserves = CurrencyUtil.nz(unadjustedCededReservesCalc().withReserveLine(reserveLine).withRIAgreement(agreement).Amount)
    var currentTotalRecoverables = CurrencyUtil.nz(unadjustedRecoverablesCalc().withReserveLine(reserveLine).withRIAgreement(agreement).Amount)

    if (currentTotalCededReserves.compareTo(targetTotalCededReserves) != 0 or
        hasContributingReservesWithoutRITransactions(reserveLine)) {
      newRITransactionSet.newCededReserve(agreement, reserveLine,
          targetTotalCededReserves.subtract(currentTotalCededReserves), false)
    }
    if (currentTotalRecoverables.compareTo(targetTotalRecoverables) != 0 or
        hasContributingRecoverablesWithoutRITransactions(reserveLine)) {
      newRITransactionSet.newRecoverable(agreement, reserveLine,
          targetTotalRecoverables.subtract(currentTotalRecoverables), false)
    }
  }


  override function claimOrNullNeedingRITransactionsCreatedFor( bean : KeyableBean) : Claim {

    if (bean typeis Transaction) {
      var claim = bean.Claim
      if( claim.getRIAgreementGroups().length > 0 ) {
        return claim
      }
    } else if (bean typeis TransactionLineItem) {
        var claim = bean.Transaction.Claim
        if( claim.getRIAgreementGroups().length > 0 ) {
          return claim
        }
    } else if (bean typeis Exposure) {
      var claim = bean.getClaim()
      if( bean.isFieldChanged("RIAgreementGroup") ) {
        return claim
      }
    } else if (bean typeis RIAgreement) {
      return bean.Claim
    } else if (bean typeis RIAgreementGroup) {
      return bean.Claim
    }

    return null
  }

  override function createRITransactions(claim : Claim) : RITransactionSet {
    var newRITransactionSet = claim.newRITransactionSet()
    for (group in claim.RIAgreementGroups) {
      for (exposure in group.Exposures) {
        for (reserveLine in exposure.ReserveLines) {
          var committedOpenReserves = committedOpenReservesCalc().withReserveLine(reserveLine).Amount
          var committedNetPayments = committedNetPaymentsCalc().withReserveLine(reserveLine).Amount
          for (agreement in reserveLine.Exposure.RIAgreementGroup.Agreements.whereTypeIs(ProportionalRIAgreement)) {
            // dividing by 100 always results in a number with a finite number of digits, so it's safe to not provide a rounding mode
            var share = agreement.ProportionalShare.divide(100)
            setToTarget( newRITransactionSet,
                         agreement,
                         reserveLine,
                         safeMultiply(committedOpenReserves,share,RICededReserve).max(0),
                         safeMultiply(committedNetPayments,share,RIRecoverable))
          }
        }
      }
    }

    for (riCoding in claim.RICodings) {
      // RICodings with inconsistent agreement groups (i.e., where riCoding.RIAgreement.RIAgreementGroup != riCoding.ReserveLine.Exposure.RIAgreementGroup)
      // must have TotalCededReserves and TotalRecoverables of zero, and they will not have been handled by the previous loop.
      // 
      // run the calculations for any RICodings that wouldn't have been updated in the loop above
      // every RICoding has a ReserveLine on this claim
      // i.e., any RICoding where ric.ReserveLine.Exposure.RIAgreementGroup.Agreements doesn't contain ric.Agreement
      // that can happen, for example, when an Exposure's RIAgreementGroup changes
      if( !riCoding.AgreementGroupsConsistent and riCoding.RIAgreement typeis ProportionalRIAgreement) {
        setToTarget( newRITransactionSet,
                     riCoding,
                     0,
                     0 )
      }
    }

    if (newRITransactionSet.RITransactions.IsEmpty) {
      newRITransactionSet.remove()
      return null
    } else {
      return newRITransactionSet
    }
  }
}
