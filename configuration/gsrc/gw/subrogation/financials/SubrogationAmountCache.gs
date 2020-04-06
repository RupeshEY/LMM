package gw.subrogation.financials

uses gw.api.financials.CurrencyAmount

uses java.util.HashMap

/**
 * Simple cache to save calculated amounts by SubroAdverseParty, intended to be used by EditableAdverseGeneralLV.pcf and SubrogationDetail.pcf.
 * ExpectedRecoveryAmount and Recovered may be expensive operations, while Pending is the difference between the two.
 * By caching the first two we can avoid recomputing them when calculating the third; caching also helps when computing sums for total rows.
 */
@Export
class SubrogationAmountCache {
  private var _subrogation : Subrogation
  private var _expectedRecoveryAmount = new HashMap<SubroAdverseParty, CurrencyAmount>()
  private var _recovered = new HashMap<SubroAdverseParty, CurrencyAmount>()
  private var _pending = new HashMap<SubroAdverseParty, CurrencyAmount>()

  /**
   * Constructs a cache to hold calculated amounts for the entire claim.
   * All relevant transactions (all transactions on the claim if subrogation is claim-level, or all transactions on subrogated exposures)
   * will be considered.
   */
  construct() {}

  /**
   * Constructs a cache to hold calculated amounts for the given subrogation.
   * That is, only transactions for the subrogation's exposures will be considered.
   *
   * @param subrogation only transactions on this subrogation's exposure will be considered
   */
  construct(subrogation : Subrogation) {
    _subrogation = subrogation
  }

  /**
   * Returns the amount expected to be recovered from the given party.
   * Generally, this is the party's ExpectedRecovery (percentage) multiplied by the total claimcost payments minus deductibles.
   * If exposures have customized liabilities, this calculation is done on a per-expsoure basis.
   * The amount is returned in the claim currency.
   *
   * @param party the responsible party for which to compute expected recovery
   * @return epxected recovery amount in the claim currency
   */
  public function getExpectedRecoveryAmount(party : SubroAdverseParty) : CurrencyAmount {
    if (_expectedRecoveryAmount.get(party) == null) {
      _expectedRecoveryAmount.put(party, SubroFinsCalculations.getExpectedRecoveryAmountInClaimCurency(_subrogation, party))
    }
    return _expectedRecoveryAmount.get(party)
  }

  /**
   * Returns the amount recovered from the given party.
   * This includes all recoveries paid by or on behalf of the given party with cost type claimcost and recovery category subro.
   * The amount is returned in the claim currency.
   *
   * @param party the responsible party for which to compute recovered amount
   * @return recovered amount in the claim currency
   */
  public function getRecovered(party : SubroAdverseParty) : CurrencyAmount {
    if (_recovered.get(party) == null) {
      var amount = _subrogation == null ?
          party.getTotClaimCostSubroRecoveryForParty() :
          party.getSubroRecoveriesForParty().where(\recovery -> recovery.Exposure == _subrogation.Exposure).sumCurrencyAmount(\recovery -> recovery.ClaimAmount)
      _recovered.put(party, amount ?: 0bd.ofCurrency(party.Claim.Currency))
    }
    return _recovered.get(party)
  }

  /**
   * Returns the amount still to be recovered from the given party.
   * This is the party's ExpectedRecoveryAmount minus Recovered amount.
   *
   * @param party the responsible party for which to compute pending recovery amount
   * @return pending recovery amount in the claim currency
   */
  public function getPending(party : SubroAdverseParty) : CurrencyAmount {
    if (_pending.get(party) == null) {
      _pending.put(party, getExpectedRecoveryAmount(party).subtractStrict(getRecovered(party)))
    }
    return _pending.get(party)
  }
}