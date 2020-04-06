package gw.acc.iplm.entitymapper.ecfwb.claimnotify

uses gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ClaimMovementAmtItem
uses gw.pl.currency.MonetaryAmount
uses typekey.Currency

uses java.math.BigDecimal

class ClaimMovementAmountItemMapper {

  public static function getClaimMovementValue(claimAmtMovement: List<ClaimMovementAmtItem>, type: String): BigDecimal {
    final var item = claimAmtMovement.firstWhere(\finAmt -> finAmt.Type == type)
    return item?.Amt?.first()
  }

  public static function getClaimAmtMovementValue(claimAmtMovement: List<ClaimMovementAmtItem>, type: String, ccy: Currency): MonetaryAmount {
    final var amt = getClaimMovementValue(claimAmtMovement, type)
    return amt == null ? null : new MonetaryAmount(amt, ccy)
  }
}