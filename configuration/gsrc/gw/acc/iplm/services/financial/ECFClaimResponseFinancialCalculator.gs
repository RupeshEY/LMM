package gw.acc.iplm.services.financial

uses gw.api.financials.CurrencyAmount
uses gw.pl.currency.MonetaryAmount
uses typekey.Currency

uses java.math.RoundingMode

class ECFClaimResponseFinancialCalculator {

  /**
   * Get the sum of financials in the Transaction this Claim Response is responding to
   * Sums the total financials currently on the Transaction, only including:
   * - LeadReserveAmount
   * - LeadReserveFees
   * - VatAmount
   * - ImportedServicesAmount
   * - LossAndExpensesIncurred
   * - ProfAdvisorFeesOutstanding
   * Currencies in the message will be converted to the currency parameter
   * The total amount is then multiplied by the carrier's percentage share on the claim to get the carrier's total amount
   *
   * @param msg      the Claim Response message the user is sending
   * @param currency the currency to convert multi-currency amounts to
   * @return the total financial amount converted to currency, multiplied by carrier's percentage share on the Claim
   */
  public static function getMessageSum(msg: ECFMessageClaimResponseRq_Ext, currency: Currency): CurrencyAmount {

    var carrierShare = msg.ClaimDataResponded.InsurerSharePercentage

    var total = new CurrencyAmount(0, currency)

    for (claimEntryAmounts in msg.ClaimDataResponded.Financials) {
      var currecyIndex = getCurrencyIndex(msg, claimEntryAmounts.Currency)

      //Lead Reserve Amount - LLOYDS and LIRMA only
      if (msg.BureauType != ECFBureauType_Ext.TC_ILU) {
        var resLeadReserveAmount = currecyIndex > 0 ? msg.getFieldValue("LeadReserveAmount" + currecyIndex) as MonetaryAmount : null
        var cnLeadReserveAmount = claimEntryAmounts.LeadReserveAmount
        var convertedLeadReserveAmount = getLeadReserveAmountConvertedToCurrency(resLeadReserveAmount, cnLeadReserveAmount, currency)
        total = total.add(convertedLeadReserveAmount)
      }

      //Lead Reserve Fees - LLOYDS only
      if (msg.BureauType == ECFBureauType_Ext.TC_LLOYDS) {
        var resLeadReserveFees = currecyIndex > 0 ? msg.getFieldValue("LeadReserveFees" + currecyIndex) as MonetaryAmount : null
        var cnLeadReserveFees = claimEntryAmounts.LeadReserveFees
        var convertedLeadReserveFees = getLeadReserveAmountConvertedToCurrency(resLeadReserveFees, cnLeadReserveFees, currency)
        total = total.add(convertedLeadReserveFees)
      }

      //Vat Amount
      var resVatAmount = currecyIndex > 0 ? msg.getFieldValue("VATAmount" + currecyIndex) as MonetaryAmount : null
      var cnVatAmount = claimEntryAmounts.SettlementVat
      var convertedVatAmount = getLeadReserveAmountConvertedToCurrency(resVatAmount, cnVatAmount, currency)
      total = total.add(convertedVatAmount)

      //Imported Services Amount - LIRMA and ILU only
      if (msg.BureauType != ECFBureauType_Ext.TC_LLOYDS) {
        var resImportedServicesAmount = currecyIndex > 0 ? msg.getFieldValue("ImportedServicesAmount" + currecyIndex) as MonetaryAmount : null
        var cnImportedServicesAmount = claimEntryAmounts.ImportedServicesAmount
        var convertedImportedServicesAmount = getLeadReserveAmountConvertedToCurrency(resImportedServicesAmount, cnImportedServicesAmount, currency)
        total = total.add(convertedImportedServicesAmount)
      }

      //Loss And Expense Incurred For Contract Before Retention
      var cnLossAndExpensesIncurred = claimEntryAmounts.LossAndExpensesIncurred
      var convertedLossAndExpensesIncurred = getLeadReserveAmountConvertedToCurrency(null, cnLossAndExpensesIncurred, currency)
      total = total.add(convertedLossAndExpensesIncurred)

      //Professional Advisor Fees Outstanding - LIRMA and ILU only
      if (msg.BureauType != ECFBureauType_Ext.TC_LLOYDS) {
        var cnProfAdvisorFeesOutstanding = claimEntryAmounts.ProfAdvisorFeesOutstanding
        var convertedProfAdvisorFeesOutstanding = getLeadReserveAmountConvertedToCurrency(null, cnProfAdvisorFeesOutstanding, currency)
        total = total.add(convertedProfAdvisorFeesOutstanding)
      }
    }

    return total?.divide(100)?.multiply(carrierShare)
  }

  private static function getLeadReserveAmountConvertedToCurrency(resAmt: MonetaryAmount, trAmt: MonetaryAmount, ccy: Currency): CurrencyAmount {
    if (resAmt != null) {
      return resAmt.toCurrencyAmount().convert(ccy, RoundingMode.UP)
    } else if (trAmt != null) {
      return trAmt.toCurrencyAmount().convert(ccy, RoundingMode.UP)
    } else {
      return new CurrencyAmount(0, ccy)
    }
  }

  private static function getCurrencyIndex(msg: ECFMessageClaimResponseRq_Ext, ccy: Currency): int {
    var currencies = {msg.Currency1, msg.Currency2, msg.Currency3}
    var indexWithCcy: int

    currencies.eachWithIndex(\currency, index -> {
      if (currency == ccy) {
        indexWithCcy = index + 1
      }
    })

    return indexWithCcy
  }

}