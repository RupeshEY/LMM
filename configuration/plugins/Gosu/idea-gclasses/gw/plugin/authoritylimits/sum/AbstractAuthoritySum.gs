package gw.plugin.authoritylimits.sum

uses gw.api.financials.CurrencyAmount
uses gw.api.financials.FinancialsCalculator
uses gw.pl.util.Assert
uses gw.plugin.authoritylimits.AuthorityLimitsConfiguration
uses gw.plugin.authoritylimits.AuthorityLimitsUtil

uses java.math.BigDecimal
uses java.math.RoundingMode
uses java.util.Collection
uses java.util.HashSet

/**
 * Abstract implementation of IAuthoritySum with convenience methods.
 */
@Export
abstract class AbstractAuthoritySum implements IAuthoritySum {
  /**
   * Sums up the claim amounts of the given reserves matching the given exposures and costType.
   *
   * @param reserves array of reserves whose claim amounts are to be summed
   * @param exposures only reserves on these Exposures should be considered in the sum,
   *                  unless this is null in which case all reserves are considered
   * @param limit only reserves that match the attributes of the limit should be included in the sum
   * @return the sum of the claim amounts of the given reserves matching the given exposures and costType
   */
  function sumReserves(reserves: Reserve[], exposures: Collection<Exposure>, limit : AuthorityLimit): CurrencyAmount {
    Assert.check(reserves.length > 0 ? null : "There must be at least one reserve in the ReserveSet.")
    var sum = new CurrencyAmount(BigDecimal.ZERO, reserves[0].Claim.Currency);

    for (var reserve in reserves) {
      if (isNullOrEquals(limit.CostType, reserve.CostType)) {
        if (exposures == null) {
          sum = sum.addStrict(reserve.ClaimAmount);
        } else {
          for (var exposure in exposures) {
            if (AuthorityLimitsConfiguration.reserveMatchesExposureAttributes(reserve, limit) && (reserve.Exposure == exposure)) {
              sum = sum.addStrict(reserve.ClaimAmount);
            }
          }
        }
      }
    }

    return sum;
  }

  /**
   * Sums up reserves from a checkSet that match a reserve line
   *
   * @param checkSet a check set
   * @param reserveLine a reserve line to compare the reserves from the checkset against
   * @return the sum of the reserves from the checkSet that match a reserve line
   */
  function sumReserves(checkSet : CheckSet, reserveLine : ReserveLine) : CurrencyAmount {
    var sum = CurrencyAmount.getStrict(BigDecimal.ZERO, checkSet.Claim.getCurrency());

    var reserves = checkSet.Reserves;
    for (var csr in reserves) {
      var r = csr.Reserve;
      if (matches(reserveLine, r.ReserveLine)) {
        sum = sum.addStrict(r.getClaimAmount());
      }
    }

    return sum;
  }

  /**
   * Returns an array of the reserve lines from a checkSet
   *
   * @param checkSet a check set
   * @return an array of the reserve lines from the check set
   */
  function getReserveLines(checkSet : CheckSet) : ReserveLine[] {
    var transactions = checkSet.Transactions
    var resLines = new HashSet<ReserveLine>(transactions.length);
    for (var transaction in transactions) {
      var reserveLine = transaction.getReserveLine();
      if (null != reserveLine) {
        resLines.add(reserveLine);
      }
    }
    return resLines.toArray(new ReserveLine[resLines.size()]);
  }

  function sumPaymentsAmount(checkSet : CheckSet, amountTypeEnum : AuthorityLimitsUtil.AmountTypeEnum, exposures : Collection<Exposure>, costType : CostType) : CurrencyAmount {
    var sum : CurrencyAmount
    if (exposures == null) {
      sum = AuthorityLimitsUtil.sumPaymentsAmount(checkSet, amountTypeEnum, null, costType);
    } else {
      for (var exposure in exposures) {
        if (sum == null) {
          sum = AuthorityLimitsUtil.sumPaymentsAmount(checkSet, amountTypeEnum, exposure, costType);
        } else {
          sum = sum.addStrict(AuthorityLimitsUtil.sumPaymentsAmount(checkSet, amountTypeEnum, exposure, costType))
        }
      }
    }
    return sum;
  }

  function sumPaymentsAmount(checkSet : CheckSet, amountTypeEnum : AuthorityLimitsUtil.AmountTypeEnum, reserveLine : ReserveLine) : CurrencyAmount {
    return AuthorityLimitsUtil.sumPaymentsAmount(checkSet, amountTypeEnum, reserveLine);
  }

  function sumPaymentsChangeAmount(transactionSet : TransactionSet, amountType : AuthorityLimitsUtil.AmountTypeEnum, exposures : Collection<Exposure>, costType : CostType) : CurrencyAmount {
    var sum : CurrencyAmount
    if (exposures == null) {
      sum = sumPaymentsChangeAmount(transactionSet, amountType, null as Exposure, costType);
    } else {
      for (var exposure in exposures) {
        if (sum == null) {
          sum = sumPaymentsChangeAmount(transactionSet, amountType, exposure, costType);
        } else {
          sum = sum.addStrict(sum);
        }
      }
    }
    return sum;
  }

  function sumPaymentsChangeAmount(transactionSet : TransactionSet, amountTypeEnum : AuthorityLimitsUtil.AmountTypeEnum, exposure : Exposure, costType : CostType) : CurrencyAmount {
    return AuthorityLimitsUtil.sumPaymentsChangeAmount(transactionSet, amountTypeEnum, exposure, costType);
  }

  function sumExisting(financialsCalculator: FinancialsCalculator, exposure: Exposure, limit: AuthorityLimit): CurrencyAmount {
    return financialsCalculator.withExposure(exposure).withCostType(limit.CostType).noNulls().Amount
  }

  /**
   * Use the specified financial calculator to calculate the desired sum
   *
   * @param financialsCalculator the specified financial calculator
   * @param claim claim to be used to determine the candidacy of an amount for the sum
   * @param limit authority limit used to determine the candidacy of an amount for the sum
   * @param expoosures exposures used to determine the candidacy of an amount for the sum (if null, all exposures are applicable)
   * @return the sum
   */
  function sumExisting(financialsCalculator: FinancialsCalculator, claim: Claim, limit: AuthorityLimit, exposures: Collection<Exposure>): CurrencyAmount {
    financialsCalculator.withClaim(claim).withCostType(limit.CostType).noNulls()
    var sum: CurrencyAmount = null

    if (exposures == null) {
      sum = financialsCalculator.Amount
    } else {
      for (var exposure in exposures) {
        if (sum == null) {
          sum = financialsCalculator.withExposure(exposure).Amount
        } else {
          sum = sum.addStrict(financialsCalculator.withExposure(exposure).Amount)
        }
      }
    }

    return sum
  }

  /**
   * Generic function for determining whether a sum exceeds an authority limit amount
   *
   * @param sum the sum
   * @param limit the authority limit
   * @return an integer representing the outcome of the comparison
   */
  function testLimit(sum: CurrencyAmount, limit: AuthorityLimit): boolean {
    var limitAmount = limit.LimitAmount
    if (sum.Currency != limitAmount.Currency) {
      limitAmount = limitAmount.convert(sum.Currency, RoundingMode.UP)
    }
    return sum.compareTo(limitAmount) > 0
  }

  private function matches(reserveLine1 : ReserveLine, reserveLine2 : ReserveLine) : boolean {
    if ((reserveLine1.Claim != null && reserveLine1.Claim.ID != reserveLine2.Claim.ID ||
        (reserveLine1.Claim == null && reserveLine2.Claim.ID != null))) {
      return false;
    }
    if ((reserveLine1.Exposure != null && reserveLine1.Exposure.ID != reserveLine2.Exposure.ID ||
        (reserveLine1.Exposure == null && reserveLine2.Exposure.ID != null))) {
      return false;
    }
    if ((reserveLine1.CostType != null && reserveLine1.CostType != reserveLine2.CostType ||
        (reserveLine1.CostType == null && reserveLine2.CostType != null))) {
      return false;
    }
    if ((reserveLine1.CostCategory != null && reserveLine1.CostCategory != reserveLine2.CostCategory ||
        (reserveLine1.CostCategory == null && reserveLine2.CostCategory != null))) {
      return false;
    }
    if (reserveLine1.ReservingCurrency != null && reserveLine1.ReservingCurrency != reserveLine2.ReservingCurrency) {
      return false;
    }
    return true;
  }

  private function isNullOrEquals(o1: Object, o2: Object): boolean {
    return (o1 == null) || o1 == o2
  }
}