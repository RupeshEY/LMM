package gw.api.financials

uses java.math.BigDecimal

@Export
class FinancialsPieChartIconUtil {

  static function getFinancialsPercentageIcon(claim : Claim) : String {
    var totalPaid = claim.TotalPaidClaimMetric.Value as BigDecimal
    var totalIncurred = claim.ClaimRpt.TotalIncurredGross.Amount
    return getFinancialsPercentageIcon(totalPaid, totalIncurred)
  }

  internal static function getFinancialsPercentageIcon(totalPaid : BigDecimal, totalIncurred : BigDecimal) : String {
    var percentString : String

    if (totalPaid == null or totalPaid <= 0bd or totalIncurred == null or totalIncurred <= 0bd) {
      percentString = "0"
    } else if (totalPaid >= totalIncurred) {
      percentString = "100"
    } else {
      // roundedPercent is the percentage * 100, rounded up to the nearest multiple of 5
      var roundedPercent = totalPaid.multiply(20bd).divide(totalIncurred, 0, CEILING).multiply(5bd)
      if (roundedPercent == 100bd) {
        // rounding back down if rounded up to 100 so 95-99% doesn't look complete
        percentString = "95"
      } else {
        percentString = roundedPercent as String
      }
    }

    return "pie_" + percentString + ".png"
  }

}
