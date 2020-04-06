package gw.subrogation.financials

uses gw.api.financials.CurrencyAmount
uses gw.api.system.CCConfigParameters


@Export
/**
 * A helper enum used by the UI to load calculations for the Subrogation Financials LV
 * Any UI specific altering of the values can be done here
 */
enum SubrogationCalculationsEnum {

  PAID(\ reserveLine, adverseParty, subrogation -> SubroFinsCalculations.getTotalPaid(reserveLine)),

  RECOVERIES( \ reserveLine, adverseParty, subrogation -> SubroFinsCalculations.getNonSubroRecoveredAmount(reserveLine)),

  NET_PAID( \ reserveLine, adverseParty, subrogation -> SubroFinsCalculations.getNetPaid(reserveLine)),

  DEDUCTIBLE( \ reserveLine, adverseParty, subrogation -> SubroFinsCalculations.getDeductibleAmount(reserveLine)),

  EXPECTED_RECOVERY( \ reserveLine, adverseParty, subrogation -> SubroFinsCalculations.getExpectedRecoveryAmount(reserveLine, subrogation, adverseParty)),

  SUBROGATION_RECOVERIES( \ reserveLine, adverseParty, subrogation -> SubroFinsCalculations.getSubroRecoveredAmount(reserveLine, adverseParty)),

  OPEN_RECOVERY_RESERVES( \ reserveLine, adverseParty, subrogation -> {
    var zeroInRLCurrency = 0bd.ofCurrency(reserveLine.ReservingCurrency)
    //If use recovery reserves is disabled, we do not show the available or apportioned amounts
    if(!CCConfigParameters.UseRecoveryReserves.getValue()) {
      return null
    }
    var openReserves = SubroFinsCalculations.getOpenRecoveryReservesAmount(reserveLine, adverseParty, subrogation)

    //We don't want to display negative apportioned amounts
    if(openReserves >= zeroInRLCurrency or adverseParty == null) {
      return openReserves
    } else {
      return zeroInRLCurrency
    }
  }),

  PENDING( \ reserveLine, adverseParty, subrogation -> {
    if(subrogation.SubrogationSummary.SubroAdverseParties.IsEmpty) {
      //If there are no Adverse Parties, the UI should show a 0
      return 0bd.ofCurrency(reserveLine.ReservingCurrency)
    }
    return SubroFinsCalculations.getPendingAmount(reserveLine, adverseParty, subrogation)
  })

  private var _block : block(reserveLine : ReserveLine, adverseParty : SubroAdverseParty, subrogation : Subrogation) : CurrencyAmount

  private construct(b : block(reserveLine : ReserveLine, adverseParty : SubroAdverseParty, subrogation : Subrogation) : CurrencyAmount) {
    _block = b
  }

  public function getCalculationValue(reserveLine : ReserveLine, adverseParty : SubroAdverseParty, subrogation : Subrogation) : CurrencyAmount {
    return _block(reserveLine, adverseParty, subrogation)
  }


}