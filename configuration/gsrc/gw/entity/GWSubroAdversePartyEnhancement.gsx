package gw.entity
uses entity.Transaction
uses gw.api.database.Queries
uses gw.api.database.Relop
uses gw.api.financials.CurrencyAmount
uses gw.pl.persistence.core.Key
uses gw.subrogation.financials.SubroFinsCalculations
uses gw.subrogation.financials.SubrogationFinancialsHelper
uses org.apache.commons.collections.keyvalue.MultiKey

uses java.math.BigDecimal

@Export
enhancement GWSubroAdversePartyEnhancement : entity.SubroAdverseParty {

  function getTotAmountRecoveredForParty() : CurrencyAmount {
    var TotAmountRec = getRecoveriesForParty().sumCurrencyAmount(\ t -> t.ClaimAmount )
    return (TotAmountRec == null) ? new CurrencyAmount( BigDecimal.ZERO, this.getClaim().Currency ) : TotAmountRec
  }


  function getTotClaimCostSubroRecoveryForParty() : CurrencyAmount {
    var TotAmountRec = getSubroRecoveriesForParty().sumCurrencyAmount(\ t -> t.ClaimAmount )
    return (TotAmountRec == null) ? new CurrencyAmount( BigDecimal.ZERO, this.getClaim().Currency ) : TotAmountRec
  }

  function getSubroRecoveriesForParty(reserveLine : ReserveLine = null) : List<Recovery> {
    return getRecoveriesForParty(:reserveLine = reserveLine, :recoveryCategory = RecoveryCategory.TC_SUBRO)
  }

  function getRecoveriesForParty(reserveLine : ReserveLine = null,  recoveryCategory : RecoveryCategory = null) : List<Recovery> {
    var cache = SubrogationFinancialsHelper.Cache
    var cacheKey = new MultiKey(this, reserveLine, recoveryCategory)
    if (cache != null and cache.get(cacheKey) != null) {
      return cache.get(cacheKey) as List<Recovery>
    }
    var recoveries = new ArrayList<Recovery>()

    var updatedRecoveries = new HashSet<Key>()
    for (recovery in this.Bundle.getInsertedAndUpdatedBeansOfType(Recovery)) {
      if (recoveryApplies(recovery, reserveLine, recoveryCategory)) {
        recoveries.add(recovery)
        if (not recovery.New) {
          updatedRecoveries.add(recovery.ID)
        }
      }
    }

    var recoveryQuery = Queries.createQuery<Recovery>(Recovery)
    recoveryQuery.compare(Recovery#Status, Relop.NotEquals, TransactionStatus.TC_DRAFT)
    recoveryQuery.compare(Recovery#CostType, Relop.Equals, CostType.TC_CLAIMCOST)
    if (not updatedRecoveries.Empty) {
      recoveryQuery.compareNotIn(Transaction#ID, updatedRecoveries.toTypedArray())
    }
    if (reserveLine != null) {
      recoveryQuery.compare(Recovery#ReserveLine, Relop.Equals, reserveLine)
    } else {
      recoveryQuery.compare(Recovery#Claim, Relop.Equals, this.Claim)
    }
    if (recoveryCategory != null) {
      recoveryQuery.compare(Recovery#RecoveryCategory, Relop.Equals, recoveryCategory)
    }
    if (this.SubrogationSummary.SubrogateIndividualExposures) {
      recoveryQuery.compareIn(Recovery#Exposure, this.SubrogationSummary.Subrogations*.Exposure.where(\exposure -> exposure != null))
    }

    for (var recovery in recoveryQuery.select()) {
      if(recoveryApplies(recovery, reserveLine, recoveryCategory)) {
        recoveries.add(recovery)
      }
    }
    if (cache != null) {
      cache.put(cacheKey, recoveries)
    }
    return recoveries
  }

  private function recoveryApplies(t: Transaction, reserveLine : ReserveLine = null, recoveryCategory : RecoveryCategory = null) : boolean {
    if(t typeis Recovery) {
      if (t.Status == TC_DRAFT) {
        return false
      }
      if(reserveLine != null and t.ReserveLine != reserveLine) {
        return false
      }
      if (t.CostType != CostType.TC_CLAIMCOST) {
        return false
      }
      if (recoveryCategory != null and t.RecoveryCategory != recoveryCategory) {
        return false
      }
      if (this.SubrogationSummary.SubrogateIndividualExposures and not this.SubrogationSummary.Subrogations*.Exposure.contains(t.Exposure)) {
        return false
      }
      if (t.OnBehalfOf != null and this.AdverseParty == t.OnBehalfOf) {
        return true
      } else if (this.AdverseParty == t.Payer) {
        return true
      }
    }
    return false
  }

  function TotPromissoryAmount() : CurrencyAmount {
    var TotCalculatedAmount = this.ScheduledPayments.toList()
                                  .sumCurrencyAmount( \ s -> s.SubroInstallmentAmount )

    return (TotCalculatedAmount == null) ? new CurrencyAmount( BigDecimal.ZERO, this.getClaim().Currency ) : TotCalculatedAmount
  }


  function PromissoryAmountDueAsOf() : CurrencyAmount {
    //Calculates total amount of estimated payments
    var TotCalculatedAmount = this.ScheduledPayments.toList()
                                  .sumCurrencyAmount( \ s -> {
                                                               if (s.PaymentExpDate  < gw.api.util.DateUtil.currentDate()) {
                                                                 return s.SubroInstallmentAmount
                                                               } else {
                                                                 return null
                                                               }
                                                             } )

    return (TotCalculatedAmount == null) ? new CurrencyAmount( BigDecimal.ZERO, this.getClaim().Currency ) : TotCalculatedAmount
  }

  /**
   * Returns an array of potential SubroAdversePartyOverrides for this party.
   * Looks for all subrogations that have at least one override, and for each one,
   * includes the override matching this party (which may be a temporary one if there is no such match).
   */
  property get OverridesForAllExposures() : SubroAdversePartyOverride[] {
    return this
        .SubrogationSummary
        .Subrogations
        .where(\subrogation -> not subrogation.SubroAdversePartyOverrides.IsEmpty)
        *.OverridesForAllParties
        .where(\partyOverride -> partyOverride.SubroAdverseParty == this)
  }

  /**
   * Returns the expected recovery amount for this party.
   * This is calculated by adding up the expected recovery per subrogation for all subrogations,
   * using this party's expected recovery percentages for each subrogation.
   * @return expected recovery amount for this party
   */
  property get ExpectedRecoveryAmount() : CurrencyAmount {
    var summary = this.SubrogationSummary
    var result = 0bd.ofCurrency(summary.Claim.Currency)
    for (subrogation in summary.Subrogations) {
      result = result.addStrict(SubroFinsCalculations.getExpectedRecoveryAmountInClaimCurency(subrogation, this))
    }
    return result
  }

  /**
   * Creates a SubroAdversePartyOverride for the specified subrogation and this party,
   * using this party's Fault and Expected Recovery as the initial override values.
   */
  function createOverride(subrogation : Subrogation): SubroAdversePartyOverride {
    var subroAdversePartyOverride = new SubroAdversePartyOverride(this.Bundle)
    subroAdversePartyOverride.Subrogation = subrogation
    subroAdversePartyOverride.SubroAdverseParty = this
    subroAdversePartyOverride.Fault = this.Fault ?: 0
    subroAdversePartyOverride.ExpectedRecovery = this.ExpectedRecovery ?: 0
    return subroAdversePartyOverride
  }
}
