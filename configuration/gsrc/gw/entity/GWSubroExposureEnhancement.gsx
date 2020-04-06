package gw.entity
uses gw.api.financials.CurrencyAmount
uses gw.api.financials.FinancialsCalculations

uses java.math.BigDecimal

@Export
enhancement GWSubroExposureEnhancement : entity.Exposure {
  /**
   * Returns the total recovery amount for the given reserveline, only including claimcost and subro recoveries, in the claim currency.
   */
  function getClaimCostRecSubroOnlyCC(aReserveLine: ReserveLine) : CurrencyAmount {
     var total = this.Claim.getRecoveriesIterator( false /*newAndModifiedOnly*/ )
                     .toList().sumCurrencyAmount( \ t -> {
                                                               var rec = t
                                                               if (rec.CostType == TC_CLAIMCOST 
  	                                                           and rec.RecoveryCategory == TC_SUBRO
  	                                                           and rec.ReserveLine == aReserveLine) { 
                                                                 return rec.ClaimAmount
                                                               } else {
                                                                 return null
                                                               }
                                                             })

    return (total == null) ? new CurrencyAmount( BigDecimal.ZERO, this.getClaim().Currency ) : total
  }

  /**
   * Returns the deductible paid by the insured on this exposure in the claim currency.
   * This is the total claim amount of all recoveries and payment line items on this exposure with category deductible.
   * Only includes deductibles paid on claimcost reservelines.
   *
   * @return the deductible paid on this exposure
   */
  property get DeductiblePaid() : CurrencyAmount {
    var result = FinancialsCalculations.TotalRecoveries
        .withExposure(this)
        .withRecoveryCategory(RecoveryCategory.TC_DEDUCTIBLE)
        .withCostType(TC_CLAIMCOST)
        .noNulls()
        .ClaimAmount
    this.Claim.Deductibles*.TransactionLineItems.each(\tli -> {
      if (tli.isDeductibleLineItem() and tli.Transaction.Exposure == this and tli.Transaction.CostType == TC_CLAIMCOST) {
        //Deductible amounts are negative, so we negate them for a total
        result = result.addStrict(tli.ClaimAmount.negate())
      }
    })
    return result
  }
}
