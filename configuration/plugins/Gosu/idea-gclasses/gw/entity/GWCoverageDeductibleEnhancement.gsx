package gw.entity
uses gw.util.DeductibleCalculator

@Export
enhancement GWCoverageDeductibleEnhancement : entity.Coverage {

  /**
   * Returns true if this Coverage's deductible amount 
   * (Coverage.Deductible) is changing
   * and its calculated deductible (Coverage.ClaimDeductible) is either null or unpaid.
   */
  public function shouldUpdateDeductible() : boolean {
    return gw.api.financials.FinancialsUtil.isUseDeductibleHandling()
      and this.Policy.PolicyType == TC_PERSONALAUTO
      and (this.New or this.isFieldChanged(Coverage#Deductible) or this.isFieldChanged(Coverage#Currency))
      and (this.ClaimDeductible == null
        or !this.ClaimDeductible.Paid)
  }
  
 

/**
 * If the coverage's new deductible amount is null,
 * then the deductible entity storing its calculated deductible 
 * (if one exists) is removed.
 *
 * If the coverage's new deductible amount is not null, then its
 * calculated deductible's amount is recalculated based on the
 * coverage's new deductible, and set to unoverridden.
 * A new deductible entity is created if it does not yet exist.
 *
 * This rule will execute once for every exposure on a coverage
 * whose deductible amount is updated. This is redundant, but
 * safe because the actions in this rule are idempotent, unless
 * the coverage's deductible amount is subsequently updated before
 * being committed, in which case this rule should be re-examined.
 */
  public function updateDeductibleEntry(claim : Claim) {
    var deductibleEntity = this.ClaimDeductible

    if (HasDeductibleAmount) {
      deductibleEntity = ensureDeductible(claim)
      deductibleEntity.Currency = this.Currency
      deductibleEntity.Amount = DeductibleCalculator.calculateDeductibleAmountForCoverage(this)
      deductibleEntity.Overridden = false
      deductibleEntity.EditReason = null
    } else {
      if (deductibleEntity != null) {
        deductibleEntity.remove()
      }
    }
  }

  public function ensureDeductible(claim : Claim) : Deductible {
    if (this.ClaimDeductible == null) {
      return createDeductible(claim)
    }
    return this.ClaimDeductible
  }
  /**
  * Creates a deductible and associates it with the given claim (expecting it to be related to the coverage as well)
  **/
  public function createDeductible(claim : Claim) : Deductible {
    var result = (this.ClaimDeductible == null ? new Deductible() : this.ClaimDeductible)
    result.Claim = claim
    result.Coverage = this
    result.Currency = this.Currency
    result.Amount = DeductibleCalculator.calculateDeductibleAmountForCoverage(this)
    return result
  }
 
  public property get HasDeductibleAmount() : boolean {
    return this.Deductible != null and
      not this.Deductible.Amount.IsZero
  }
}
