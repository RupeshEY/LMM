package gw.util
uses gw.api.locale.DisplayKey
uses java.math.BigDecimal
uses gw.api.util.Logger
uses gw.api.system.CCConfigParameters
uses gw.api.util.CurrencyUtil

@Export
class BackupWithholdingCalculator {
  construct () {
  }
  
  public function computeDeductions(check : Check) : Deduction[] {
    if (check == null || check.ReportableAmount == null) {
      return new Deduction[0]
    }
    
    var withholdingRate = getWithholdingRateIfReportableCheck(check)
    var roundingMode = CurrencyUtil.getRoundingMode()
    if (withholdingRate != null) {
      var withholding = new Deduction(check.Bundle)
      // withholdingRate is a percentage (0 - 100), so must move the decimal
      // point to get dollars
      withholding.Check = check
      
      // compute Deduction TransactionAmount
      var deductionTransAmount = check.ReportableAmount.multiply(withholdingRate.movePointLeft(2))
      deductionTransAmount = CurrencyUtil.roundToCurrencyScale(deductionTransAmount, check.Currency, roundingMode)
      withholding.TransactionAmount = deductionTransAmount

      // compute Deduction ClaimAmount
      var claimCurrency = check.Claim.Currency
      withholding.ClaimAmount = deductionTransAmount.convert(claimCurrency, check.TransToClaimExchangeRateEntityRate, roundingMode)

      // compute Deduction ReservingAmount
      var reservingCurrency = check.ReservingCurrency
      if (check.Claim.Currency == check.ReservingCurrency) {
        withholding.ReservingAmount = withholding.ClaimAmount
      } else {
        withholding.ReservingAmount = deductionTransAmount.convert(reservingCurrency, check.TransToReservingExchangeRateRate, roundingMode)
      }
      // compute Deduction ReportingAmount
      if( CurrencyUtil.getReportingCurrency() == check.Currency ) {
        withholding.ReportingAmount = deductionTransAmount
      } else {
        withholding.ReportingAmount = withholding.ClaimAmount.convert(CurrencyUtil.getReportingCurrency(), check.ClaimToReportingExchangeRateEntityRate, roundingMode)
      }
      withholding.DeductionType = getConfiguredWithholdingDeductionType()
      Logger.logInfo(DisplayKey.get("Java.Financials.BackupWithholding.ComputeDeductions",  withholding.ReservingAmount))
      return {withholding}
    }
    return new Deduction[0]
  }

  /**
   * Returns true if the check payee Contact is a Vendor that requires Backup Withholding.
   * Returns false if Backup Withholding is disabled in config.xml.
   * This ignores the CheckPayee.PayeeType (in case the user changed it) and instead checks
   * if the Contact is considered a Vendor by Check.getSuggestedPayeeType( Contact ).
   */
  public static function isBackupWithholdingExpected( chkPayee : CheckPayee ) : boolean {
    var payee = chkPayee.Payee
    return CCConfigParameters.CalculateBackupWithholdingDeduction.getValue()
           and chkPayee.Check.getSuggestedPayeeType( payee ) == ContactRole.TC_VENDOR
           and getWithholdingRate( payee ) != null
  }

  public static function getConfiguredWithholdingDeductionType() : DeductionType {
    return DeductionType.get( CCConfigParameters.BackupWithholdingTypeCode.Value )
  }

  public static function getConfiguredStandardWithholdingRate() : double {
    return CCConfigParameters.StandardWithholdingRate.Value
  }

  private static function getWithholdingRateIfReportableCheck(check : Check) : BigDecimal {
    // If one of the payees is a vendor, and the payment is reportable
    if ( check.Reportability == ReportabilityType.TC_REPORTABLE) {
      var vendor = check.Vendor
      if (vendor == null) {
        Logger.logWarning( DisplayKey.get("Java.Financials.BackupWithholding.GetWithholdingRate.NullVendor", check.ID))
        return null
      }
      return getWithholdingRate( vendor )
    }
    return null
  }

  /**
   * Returns the withholding rate for the given contact, if withholding applies.
   * Otherwise, returns null.
   * 
   * If vendor's withholding rate is non-null, then withholding applies, with the vendor's rate.
   * If withholding rate is null, then if tax status is not Confirmed, then apply the default rate.
   * Otherwise, no withholding so return null.
   */
  private static function getWithholdingRate( vendor : Contact) : BigDecimal {
      var rate = vendor.WithholdingRate
      if (rate == null) {
        if (!(TaxStatus.TC_CONFIRMED == vendor.TaxStatus)) {
          var standardWithholding = String.valueOf( getConfiguredStandardWithholdingRate() )
          Logger.logDebug(DisplayKey.get("Java.Financials.BackupWithholding.GetWithholdingRate.UnknownTaxStatus", vendor.DisplayName, standardWithholding))
          return new BigDecimal( standardWithholding )  // never pass double to BD constructor
        } else {
          return null
        }
      } else {
        if (rate.IsZero) {
          return null
        } else {
          Logger.logDebug(DisplayKey.get("Java.Financials.BackupWithholding.GetWithholdingRate.Rate", vendor.DisplayName, rate))
          return rate
        }
      }
  }
}
