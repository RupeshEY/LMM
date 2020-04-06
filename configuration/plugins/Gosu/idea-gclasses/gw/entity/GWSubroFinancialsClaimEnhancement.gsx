package gw.entity

uses gw.api.financials.CurrencyAmount
uses gw.api.financials.FinancialsCalculationUtil
uses gw.api.financials.FinancialsCalculations
uses gw.api.util.CurrencyUtil

uses java.lang.Double
uses java.util.List
uses gw.api.upgrade.Coercions
uses gw.subrogation.financials.SubroFinsCalculations
uses gw.subrogation.financials.SubrogationFinancialsHelper

@Export
enhancement GWSubroFinancialsClaimEnhancement : entity.Claim {

  property get ReserveLinesForClaimCost() : List<ReserveLine> {
    return this.ReserveLines.where( \ reserveLine -> reserveLine.CostType == TC_CLAIMCOST).toList()
  }

  property get ClaimNetPaidExcludingSubroRecovery() : CurrencyAmount {
    var claimNetPaidExcludingSubroRecovery = this.ReserveLinesForClaimCost.sumCurrencyAmount( \ reserveLine -> {
      return SubroFinsCalculations.getNetPaid(reserveLine)
    })

    return  (claimNetPaidExcludingSubroRecovery == null) ? ZeroInClaimCurrency : claimNetPaidExcludingSubroRecovery
  }

  /**
   * Sets open recovery reserves on claimcost reservelines to the expected recovery amount.
   */
  function AutoSetOpenRecoveryReserve() {
    //zero in claim currency

    var superUser = User.util.UnrestrictedUser

    var reservelines : List<ReserveLine> = null
    var subroSummary = this.SubrogationSummary

    // Set the recovery
    for(subrogation in subroSummary.Subrogations) {

      if(subrogation.Exposure != null) {
        reservelines = subrogation.Exposure.ReserveLines.where(\ res -> res.CostType == CostType.TC_CLAIMCOST).toList()
      } else {
        //Claim-level subrogation
        reservelines = this.ReserveLinesForClaimCost
      }

      for (reserveLine in reservelines) {
        var zeroInReserveLineCurrency = new CurrencyAmount(0bd, reserveLine.ReservingCurrency)
        //Collect needed calculation values for this reserveLine
        var subroRecoveredAmount = SubroFinsCalculations.getSubroRecoveredAmount(reserveLine)
        var expectedRecoveryAmount = SubroFinsCalculations.getExpectedRecoveryAmount(reserveLine, subrogation)

        if (expectedRecoveryAmount > zeroInReserveLineCurrency
          and subroRecoveredAmount < expectedRecoveryAmount) {
          //Set the amount to the "Pending" amount
          var newOpenReservesAmount = expectedRecoveryAmount - subroRecoveredAmount

          if (newOpenReservesAmount >= zeroInReserveLineCurrency) {
            reserveLine.setOpenRecoveryReservesInReservingCurrency(TC_SUBRO, newOpenReservesAmount, superUser)
          }
        } else if (FinancialsCalculations.OpenRecoveryReserves.withReserveLine(reserveLine)
            .withRecoveryCategory(TC_SUBRO).ReservingAmount > zeroInReserveLineCurrency) {
          // Actual Recovery must equal Expected Recovery or be greater, therefore RL should have zero Outstanding Recovery Reserves
          reserveLine.setOpenRecoveryReservesInReservingCurrency(TC_SUBRO, zeroInReserveLineCurrency, superUser)
        }
      }
    }
  }

  property get ClaimCostsSubroRecovery() : CurrencyAmount {
    var claimRecoveryForRecCatSubro = this.ReserveLinesForClaimCost.sumCurrencyAmount( \ reserveLine -> {
      return FinancialsCalculations.getFinancialsCalculation(FinancialsCalculationUtil.getTotalRecoveriesExpression())
          .withReserveLine(reserveLine)
          .withRecoveryCategory(TC_SUBRO)
          .Amount
    })

    return (claimRecoveryForRecCatSubro == null) ? ZeroInClaimCurrency : claimRecoveryForRecCatSubro
  }

  /**
   * @return Recoveries attached to this Claim with a category of Subrogation and a CostType of Claim Cost
   */
  property get SubroClaimCostRecoveries() : List<Recovery> {
    return this.getRecoveriesIterator(false).toList().where(\ rec ->
        rec.RecoveryCategory == RecoveryCategory.TC_SUBRO
          and  rec.CostType == CostType.TC_CLAIMCOST)
  }

  function getClaimLevelRecoveriesSubroOnly(aReserveLine : ReserveLine) : CurrencyAmount {
    var total = this.getRecoveriesIterator(false /*newAndModifiedOnly*/ ).toList()
        .sumCurrencyAmount( \ recovery -> {
          if (recovery.Exposure == null
              and recovery.CostType == TC_CLAIMCOST
              and aReserveLine == recovery.ReserveLine
              and recovery.RecoveryCategory == TC_SUBRO) {
            return recovery.ClaimAmount
          } else {
            return null
          }
        } )

     return (total == null) ? ZeroInClaimCurrency : total
  }

  property get TotalAmountRecoveredByAdvParties() : CurrencyAmount {
    var totalAmountRec = this.SubrogationSummary.SubroAdverseParties.toList()
        .sumCurrencyAmount( \ party -> party.getTotClaimCostSubroRecoveryForParty())
    
    return (totalAmountRec == null) ? ZeroInClaimCurrency : totalAmountRec
  }

  /**
   * Returns the deductible paid by the insured on this claim in the claim currency.
   * This is the total claim amount of all recoveries and payment line items on this claim with category deductible.
   * Only includes deductibles paid on claimcost reservelines.
   *
   * @return the deductible paid on this claim
   */
  property get DeductiblePaid() : CurrencyAmount {
    var result = FinancialsCalculations.TotalRecoveries
        .withClaim(this)
        .withRecoveryCategory(RecoveryCategory.TC_DEDUCTIBLE)
        .withCostType(TC_CLAIMCOST)
        .noNulls()
        .ClaimAmount
    this.Claim.Deductibles*.TransactionLineItems.each(\tli -> {
      if (tli.isDeductibleLineItem() and tli.Transaction.CostType == TC_CLAIMCOST) {
        //Deductible amounts are negative, so we negate them for a total
        result = result.addStrict(tli.ClaimAmount.negate())
      }
    })
    return result
  }
  
  internal property get ZeroInClaimCurrency() : CurrencyAmount {
    return 0bd.ofCurrency(this.Claim.Currency)
  }
}
