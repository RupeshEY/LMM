package gw.subrogation.financials

uses gw.api.database.Queries
uses gw.api.database.Relop
uses gw.api.financials.CurrencyAmount
uses gw.api.financials.FinancialsCalculations
uses gw.api.util.CurrencyUtil
uses gw.api.web.RequestVar
uses gw.pl.persistence.core.Key

@Export
class SubroFinsCalculations {
  private static var cachedDeductibleAmount = new RequestVar<Map<ReserveLine, CurrencyAmount>>()
  private static property get Cache() : Map<ReserveLine, CurrencyAmount> {
    if (cachedDeductibleAmount.RequestAvailable) {
      if (cachedDeductibleAmount.get() == null) {
        cachedDeductibleAmount.set(new HashMap<ReserveLine, CurrencyAmount>())
      }
      return cachedDeductibleAmount.get()
    } else {
      return null
    }
  }

  //Total Paid, makes use of Financials Calculations directly
  static function getTotalPaid(reserveLine : ReserveLine) : CurrencyAmount {
    var totalPayments = FinancialsCalculations.TotalPayments.withReserveLine(reserveLine).noNulls().ReservingAmount
    return totalPayments
  }

  /**
   * Recovered, non-subrogation, the TotalRecoveries minus the TotalRecoveries with the Subro category
   * @param reserveLine the reserveline used to find applicable transactions
   * @return the Non-Subro recovered amount
   *
   */
  static function getNonSubroRecoveredAmount(reserveLine : ReserveLine) : CurrencyAmount {
    var totalRecoveries = FinancialsCalculations.TotalRecoveries.withReserveLine(reserveLine).noNulls().ReservingAmount
    var subroRecoveries = FinancialsCalculations.TotalRecoveries.withReserveLine(reserveLine).noNulls().withRecoveryCategory(RecoveryCategory.TC_SUBRO).ReservingAmount

    return totalRecoveries.subtract(subroRecoveries)
  }

  private static function getNonSubroRecoveredAmount(subrogation : Subrogation) : CurrencyAmount {
    var totalRecoveries = FinancialsCalculations.TotalRecoveries.withClaim(subrogation.SubrogationSummary.Claim).withExposure(subrogation.Exposure).noNulls().ClaimAmount
    var subroRecoveries = FinancialsCalculations.TotalRecoveries.withClaim(subrogation.SubrogationSummary.Claim).withExposure(subrogation.Exposure).noNulls().withRecoveryCategory(RecoveryCategory.TC_SUBRO).ClaimAmount

    return totalRecoveries.subtract(subroRecoveries)
  }

  /**
   * Net paid for ReserveLine, the TotalPayments minus the TotalRecovies that do not have a type of Subro
   * @param reserveLine the reserveline used to find applicable transactions
   * @return  the Net Paid amount
   */
  static function getNetPaid(reserveLine : ReserveLine) : CurrencyAmount {
    var totalPayments = FinancialsCalculations.TotalPayments.withReserveLine(reserveLine).noNulls().ReservingAmount
    var nonSubroRecovered = getNonSubroRecoveredAmount(reserveLine)

    return totalPayments.subtract(nonSubroRecovered)
  }

  private static function getNetPaid(subrogation: Subrogation): CurrencyAmount {
    var totalPayments = FinancialsCalculations
        .TotalPayments
        .withClaim(subrogation.SubrogationSummary.Claim)
        .withExposure(subrogation.Exposure)
        .withCostType(TC_CLAIMCOST)
        .noNulls()
        .ClaimAmount
    var nonSubroRecovered = getNonSubroRecoveredAmount(subrogation)
    return totalPayments.subtract(nonSubroRecovered)
  }

  /**
   * Deductible amount, adding negated Deductible line items, negated Reimbursed Deductible line items,
   * and Deductible recoveries
   * @param reserveLine the reserveline used to find applicable transactions
   * @return the total Deductible amount for the reserve line
   */
  public static function getDeductibleAmount(reserveLine : ReserveLine) : CurrencyAmount {
    var cache = Cache
    if (cache != null and cache.get(reserveLine) != null) {
      return cache.get(reserveLine)
    }
    var total = CurrencyAmount.getStrict(0bd, reserveLine.ReservingCurrency)

    var updatedTLIs = new HashSet<Key>()
    for (tli in reserveLine.Bundle.getInsertedAndUpdatedBeansOfType(TransactionLineItem)) {
      if (tli.Transaction typeis Payment
          and tli.Transaction.CostType == CostType.TC_CLAIMCOST
          and (tli.Transaction.ReserveLine == reserveLine)
          and (tli.isDeductibleLineItem() or tli.LineCategory == LineCategory.TC_REIMBURSEDDEDUCTIBLE)) {
        //Deductible amounts are negative, so we negate them for a total
        total = total.addStrict(tli.ClaimAmount.negate())
        if (not tli.New) {
          updatedTLIs.add(tli.ID)
        }
      }
    }

    var tliQuery = Queries.createQuery<TransactionLineItem>(TransactionLineItem)
    tliQuery.compareIn(TransactionLineItem#LineCategory, {LineCategory.TC_DEDUCTIBLE, LineCategory.TC_REIMBURSEDDEDUCTIBLE})
    var txnJoin = tliQuery.join(TransactionLineItem#Transaction)
    if (not updatedTLIs.Empty) {
      txnJoin.compareNotIn(Transaction#ID, updatedTLIs.toTypedArray())
    }
    txnJoin
        .compare(Transaction#Subtype, Relop.Equals, typekey.Transaction.TC_PAYMENT)
        .compare(Transaction#CostType, Relop.Equals, CostType.TC_CLAIMCOST)
        .compare(Transaction#ReserveLine, Relop.Equals, reserveLine)

    for (tli in tliQuery.select()) {
      if (tli.isDeductibleLineItem() or tli.LineCategory == LineCategory.TC_REIMBURSEDDEDUCTIBLE) {
        //Deductible amounts are negative, so we negate them for a total
        total = total.addStrict(tli.ReservingAmount.negate())
      }
    }

    var recoveries = FinancialsCalculations.TotalRecoveries
        .withReserveLine(reserveLine)
        .withRecoveryCategory(RecoveryCategory.TC_DEDUCTIBLE).noNulls().ReservingAmount

    var result = recoveries.addStrict(total)
    if (cache != null) {
      cache.put(reserveLine, result)
    }
    return result
  }

  private static function getDeductibleAmount(subrogation : Subrogation) : CurrencyAmount {
    var claim = subrogation.SubrogationSummary.Claim
    var exposure = subrogation.Exposure
    var total = CurrencyAmount.getStrict(0bd, claim.Currency)

    var updatedTLIs = new HashSet<Key>()
    for (tli in subrogation.Bundle.getInsertedAndUpdatedBeansOfType(TransactionLineItem)) {
      if (tli.Transaction typeis Payment
          and tli.Transaction.CostType == CostType.TC_CLAIMCOST
          and (subrogation.Exposure != null ? tli.Transaction.Exposure == exposure : tli.Transaction.Claim == claim)
          and (tli.isDeductibleLineItem() or tli.LineCategory == LineCategory.TC_REIMBURSEDDEDUCTIBLE)) {
        //Deductible amounts are negative, so we negate them for a total
        total = total.addStrict(tli.ClaimAmount.negate())
        if (not tli.New) {
          updatedTLIs.add(tli.ID)
        }
      }
    }

    var tliQuery = Queries.createQuery<TransactionLineItem>(TransactionLineItem)
    tliQuery.compareIn(TransactionLineItem#LineCategory, {LineCategory.TC_DEDUCTIBLE, LineCategory.TC_REIMBURSEDDEDUCTIBLE})
    var txnJoin = tliQuery.join(TransactionLineItem#Transaction)
    if (not updatedTLIs.Empty) {
      txnJoin.compareNotIn(Transaction#ID, updatedTLIs.toTypedArray())
    }
    txnJoin.compare(Transaction#Subtype, Relop.Equals, typekey.Transaction.TC_PAYMENT).compare(Transaction#CostType, Relop.Equals, CostType.TC_CLAIMCOST)
    if (exposure != null) {
      txnJoin.compare(Transaction#Exposure, Relop.Equals, exposure)
    } else {
      txnJoin.compare(Transaction#Claim, Relop.Equals, claim)
    }

    for (tli in tliQuery.select()) {
      if (tli.isDeductibleLineItem() or tli.LineCategory == LineCategory.TC_REIMBURSEDDEDUCTIBLE) {
        //Deductible amounts are negative, so we negate them for a total
        total = total.addStrict(tli.ClaimAmount.negate())
      }
    }

    var recoveries = FinancialsCalculations.TotalRecoveries
        .withClaim(claim)
        .withExposure(subrogation.Exposure)
        .withRecoveryCategory(RecoveryCategory.TC_DEDUCTIBLE).noNulls().ClaimAmount

    return recoveries.addStrict(total)
  }

  /**
   * Expected Recovery amount, adds the Net Paid and the Deductible amount for the Claim multiplied by the Party's
   * expected recovery percentage to get a remaining value
   * @param reserveLine the reserveline used to find applicable transactions
   * @param adverseParty the adverse party whose expected recovery percentage will be used
   * @param subrogation the subrogation used to find the adverse party's expected recovery
   * @return the expected recovery amount for the reserve line from this adverse party, on this subrogation
   */
  public static function getExpectedRecoveryAmount(reserveLine : ReserveLine, subrogation : Subrogation, adverseParty : SubroAdverseParty = null) : CurrencyAmount {
    /* Expected Recovery is ((Net Paid + Deductible) * Expected Recovery %) */
    var netPaid = getNetPaid(reserveLine)
    var deductible = getDeductibleAmount(reserveLine)
    var expectedRecoveryPercent = SubrogationFinancialsHelper.getExpectedRecoveryFor(subrogation, adverseParty)?.multiply(.01bd)

    if(expectedRecoveryPercent == null) {
      expectedRecoveryPercent = 0bd
    }

    var amount = expectedRecoveryPercent.multiply(netPaid.Amount.add(deductible.Amount))

    return CurrencyUtil.roundToCurrencyScale(amount, reserveLine.ReservingCurrency, CurrencyUtil.RoundingMode)
  }

  /**
   * Returns the expected recovery amount for the given subrogation and party.
   * This is calculated by adding the net paid and deductible, and multiplying the sum by the expected recovery percentage
   * for the given party and subrogation.
   * @param subrogation the subrogation used to find the party's expected recovery
   * @param adverseParty the party whose expected recovery percentage will be used
   * @return the expected recovery amount for the given subrogation and party
   */
  public static function getExpectedRecoveryAmountInClaimCurency(subrogation : Subrogation, adverseParty : SubroAdverseParty) : CurrencyAmount {
    if (subrogation == null) {
      return adverseParty.ExpectedRecoveryAmount
    }
    var netPaid = getNetPaid(subrogation)
    var deductible = getDeductibleAmount(subrogation)
    var expectedRecoveryPercent = SubrogationFinancialsHelper.getExpectedRecoveryFor(subrogation, adverseParty)?.multiply(.01bd)
    if(expectedRecoveryPercent == null) {
      expectedRecoveryPercent = 0bd
    }
    var amount = expectedRecoveryPercent.multiply(netPaid.Amount.add(deductible.Amount))

    return CurrencyUtil.roundToCurrencyScale(amount, subrogation.SubrogationSummary.Claim.Currency, CurrencyUtil.RoundingMode)
  }

  /**
   * Subrogation recoveries, the total of recoveries with a Payer or OBOPayer of the given party, with type Subro
   * @param reserveLine the reserveline used to find applicable transactions
   * @param adverseParty the adverse party used to filter recoveries as either Payer or On Behalf Of Payer
   * @return the total subrogation recovery amount
   */
  public static function getSubroRecoveredAmount(reserveLine: ReserveLine, adverseParty: SubroAdverseParty = null) : CurrencyAmount {
    var totalRecoveries = CurrencyAmount.getStrict(0bd, reserveLine.ReservingCurrency)

    if(adverseParty == null) {
      totalRecoveries = FinancialsCalculations.getTotalRecoveries().withRecoveryCategory(RecoveryCategory.TC_SUBRO).withReserveLine(reserveLine).noNulls().ReservingAmount
    } else {
      totalRecoveries = adverseParty.getSubroRecoveriesForParty(reserveLine).sumCurrencyAmount(\t -> t.ReservingAmount)
    }

    return totalRecoveries ?: CurrencyAmount.getStrict(0bd, reserveLine.ReservingCurrency)
  }

  /**
   * Available or Apportioned recovery reserves amount, when the adverseParty or subrogation are null, this is the total Open Recovery Reserves
   * for the Claim with a category of Subro. If the adverseParty and subrogation are present, we get the total expected recovery amount
   * by adding all the individual adverseParties expected recovery amount together, then divide the given adverseParty's expected recovery amount by
   * it. This gives us what percentage the party should be paying. This percentage is applied to the Total Recovery Reserves to find this party's portion of the
   * Total Recovery Reserves. The adverseParties Recoveries are then subtracted to find their available apportioned amount
   * @param reserveLine the reserveline used to find applicable transactions
   * @param adverseParty The adverse party who's expected recovery percentage will be used
   * @param subrogation The subrogation used to find the adverse party's expected recovery
   * @return the Availble Recovery Reserves amount
   */
  static function getOpenRecoveryReservesAmount(reserveLine: ReserveLine, adverseParty: SubroAdverseParty = null, subrogation: Subrogation = null) : CurrencyAmount {
    if(adverseParty != null
        and subrogation != null) {
      var totalRecoveryReserves = FinancialsCalculations.TotalRecoveryReserves.withRecoveryCategory(RecoveryCategory.TC_SUBRO).withReserveLine(reserveLine).noNulls().ReservingAmount
      //This must be an Adverse Party calculation
      var expectedRecovery = getExpectedRecoveryAmount(reserveLine, subrogation, adverseParty)
      var totalExpectedRecovery = CurrencyAmount.getStrict(0bd, reserveLine.ReservingCurrency)

      for(party in subrogation.SubrogationSummary.SubroAdverseParties) {
        totalExpectedRecovery = totalExpectedRecovery.addStrict(getExpectedRecoveryAmount(reserveLine, subrogation, party))
      }


      var percentOfWhole = 0bd
      if(!totalExpectedRecovery.Amount.isIsZero()) {
        percentOfWhole = expectedRecovery.divide(totalExpectedRecovery)
      }
      var recovered = getSubroRecoveredAmount(reserveLine, adverseParty)

      return (totalRecoveryReserves.multiply(percentOfWhole)).subtract(recovered)

    } else {
      return FinancialsCalculations.OpenRecoveryReserves.withRecoveryCategory(RecoveryCategory.TC_SUBRO).withReserveLine(reserveLine).noNulls().ReservingAmount
    }
  }

  /**
   * Pending amount, takes the Expected Recovery amount for the given Reserve Line/Adverse Party/Subrogation and subtracts the amount recovered from the
   * Adverse Party
   * @param reserveLine the reserveline used to find applicable transactions
   * @param adverseParty The adverse party who's expected recovery percentage will be used
   * @param subrogation The subrogation used to find the adverse party's expected recovery
   * @return the pending amount
   */
  public static function getPendingAmount(reserveLine : ReserveLine, adverseParty : SubroAdverseParty, subrogation : Subrogation) : CurrencyAmount {
    var expectedRecovery = getExpectedRecoveryAmount(reserveLine, subrogation, adverseParty)
    var subroRecoveries = getSubroRecoveredAmount(reserveLine, adverseParty)

    return expectedRecovery.subtract(subroRecoveries)
  }

}