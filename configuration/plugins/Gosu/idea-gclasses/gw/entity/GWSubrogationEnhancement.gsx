package gw.entity

uses gw.api.database.DBFunction
uses gw.api.database.QuerySelectColumns
uses gw.api.database.Relop
uses gw.api.financials.CurrencyAmount
uses gw.api.path.Paths
uses gw.api.util.CurrencyUtil

uses java.math.BigDecimal
uses java.math.RoundingMode

@Export
enhancement GWSubrogationEnhancement : entity.Subrogation {
  /**
   * Returns an array of SubroAdversePartyOverrides containing exactly one override for each existing adverse party.
   * If a party does not currently have a corresponding override row for this subrogation, a temporary row with
   * zero values for Fault and ExpectedRecovery is created and returned in the array.
   */
  property get OverridesForAllParties() : SubroAdversePartyOverride[] {
    return this.SubrogationSummary.SubroAdverseParties.map(\party -> {
      var subroAdversePartyOverride = this.SubroAdversePartyOverrides.where(\subroAdversePartyOverride -> subroAdversePartyOverride.SubroAdverseParty == party).first()
      // there should be at most one, but there may be none
      if (subroAdversePartyOverride == null) {
        subroAdversePartyOverride = new SubroAdversePartyOverride(this.Bundle)
        subroAdversePartyOverride.SubroAdverseParty = party
        subroAdversePartyOverride.Subrogation = this
        subroAdversePartyOverride.Fault = 0
        subroAdversePartyOverride.ExpectedRecovery = 0
      }
      return subroAdversePartyOverride
    })
  }

  /**
   * Returns whether this subrogation overrides liability or expected recovery.
   * Equivalently, returns whether there is at least one SubroAdversePartyOverride row.
   */
  property get CustomizedLiability() : boolean {
    return not this.SubroAdversePartyOverrides.IsEmpty
  }

  /**
   * If true, creates a SubroAdversePartyOverride for each adverse party, with Fault and Expected Recovery initialized to the default values.
   * If false, removes all SubroAdversePartyOverride rows.
   *
   * Does nothing if setting to true when VaryLiability is already true, or false when VaryLiability is already false.
   */
  property set CustomizedLiability(vary : boolean) {
    if (CustomizedLiability == vary) {
      return
    } else if (vary) {
      this.SubrogationSummary.SubroAdverseParties.each(\party -> party.createOverride(this))
    } else {
      this.SubroAdversePartyOverrides.each(\subroAdversePartyOverride -> subroAdversePartyOverride.remove())
    }
  }

  /**
   * Returns the sum of Liability percentages for this subrogation.
   */
  property get TotalLiabilityPercent() : BigDecimal {
    if (CustomizedLiability) {
      return this.SubroAdversePartyOverrides.sum(\party -> party.Fault ?: 0)
    } else {
      return this.SubrogationSummary.SubroAdverseParties.sum(\party -> party.Fault ?: 0)
    }
  }

  /**
   * Returns the sum of Expected Recovery percentages for this subrogation.
   */
  property get TotalExpectedRecoveryPercent() : BigDecimal {
    if (CustomizedLiability) {
      return this.SubroAdversePartyOverrides.sum(\party -> party.ExpectedRecovery ?: 0)
    } else {
      return this.SubrogationSummary.SubroAdverseParties.sum(\party -> party.ExpectedRecovery ?: 0)
    }
  }

  /**
   * Returns the deductible to repay in the claim currency, which is a percentage of the total deductible amount paid so far, based on third party fault.
   * This is determined by calculating the sum of deductible recoveries and payment line items, and multiplying by the sum of all adverse parties' fault ratings.
   * If deductible is not being prorated, the total deductible amount is returned without considering fault.
   * If this subrogation is on a claim-level summary, all claimcost transactions are considered.
   * If the summary is subrogating individual exposures, only claimcost transactions on this subrogation's exposure are considered.
   * If the summary is subrogating individual exposures but this subrogation's exposure is null, return 0 (this should only happen for newly added subrogations whose exposure has not been selected yet).
   *
   * @return deductible to return to the insured, in the claim currency
   */
  property get DeductibleToRepay() : CurrencyAmount {
    var deductiblePaid = 0bd.ofCurrency(this.SubrogationSummary.Claim.Currency)
    if (not this.SubrogationSummary.SubrogateIndividualExposures) {
      deductiblePaid = this.SubrogationSummary.Claim.DeductiblePaid
    } else if (this.Exposure != null) {
      deductiblePaid = this.Exposure.DeductiblePaid
    }

    if (this.SubrogationSummary.ProrateDeductible) {
      var thirdPartyFault = this.CustomizedLiability ? this.OverridesForAllParties*.Fault.sum() : this.SubrogationSummary.SubroAdverseParties*.Fault.sum()
      return CurrencyUtil.roundToCurrencyScale(deductiblePaid.multiply(thirdPartyFault).multiply(.01bd), deductiblePaid.Currency, RoundingMode.UP)
    } else {
      return deductiblePaid
    }
  }

  /**
   * Returns the amount of deductible reimbursed to the insured in the claim currency.
   * This is the total claim amount of all line items with the category Reimbursed Deductible on claimcost reservelines.
   * If this subrogation is on a claim-level summary, all claimcost transactions are considered.
   * If the summary is subrogating individual exposures, only claimcost transactions on this subrogation's exposure are considered.
   * If the summary is subrogating individual exposures but this subrogation's exposure is null, return 0 (this should only happen for newly added subrogations whose exposure has not been selected yet).
   *
   * @return the deductible amount returned to the insured
   */
  property get DeductibleRepaid() : CurrencyAmount {
    if (this.SubrogationSummary.SubrogateIndividualExposures and this.Exposure == null) {
      return 0bd.ofCurrency(this.SubrogationSummary.Claim.Currency)
    }

    var tliTable = gw.api.database.Queries.createQuery(TransactionLineItem)
        .compare(TransactionLineItem#LineCategory, Relop.Equals, LineCategory.TC_REIMBURSEDDEDUCTIBLE)
        .join(TransactionLineItem#Transaction)
        .compare(entity.Transaction#CostType, Relop.Equals, CostType.TC_CLAIMCOST)

    var restriction = this.Exposure != null ?
        tliTable.join(entity.Transaction#Exposure).compare(Exposure#ID, Relop.Equals, this.Exposure) :
        tliTable.join(entity.Transaction#Claim).compare(Claim#ID, Relop.Equals, this.SubrogationSummary.Claim)

    var amount = restriction.select({QuerySelectColumns.dbFunction(DBFunction.Sum(Paths.make(TransactionLineItem#ClaimAmount)))})
        .AtMostOneRow
        .getColumn(0) as BigDecimal
    return new CurrencyAmount(amount ?: 0, this.SubrogationSummary.Claim.Currency)
  }
}
