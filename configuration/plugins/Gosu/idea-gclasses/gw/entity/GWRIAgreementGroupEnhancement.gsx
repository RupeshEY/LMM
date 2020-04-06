package gw.entity

uses gw.api.locale.DisplayKey
uses java.math.BigDecimal
uses gw.api.financials.FinancialsCalculations
uses gw.api.financials.FinancialsCalculator
uses gw.api.financials.CurrencyAmount
uses gw.api.util.CurrencyUtil
uses gw.datatype.annotation.DataType

/**
 * Enhancement methods on RIAgreementGroup, mostly used for the Reinsurance
 * Financials Summary UI. You may want override the AgreementGroupSummaryString
 * property.
 */
@Export
enhancement GWRIAgreementGroupEnhancement : entity.RIAgreementGroup {

  property get isUserEditable() : Boolean {
    return !this.isManagedInExternalSystem
  }
    
  property get isManagedInExternalSystem() : Boolean {
    for (var exposure in this.Exposures) {
      if (exposure.RIGroupSetExternally) {
        return true;
      }
    }
    for (var agreement in this.Agreements) {
      if (agreement.ManagedInExternalSystem) {
        return true;
      }
    }
    return false;
  }
    
    
  property get OpenReserves() : CurrencyAmount {
    var calc = FinancialsCalculations.getSubmittedOpenReserves()
    return sumOverExposures(calc)
  }

  property get TotalPayments() : CurrencyAmount {
    var calc = FinancialsCalculations.getSubmittedTotalPayments()
    return sumOverExposures(calc)
  }

  property get TotalRecoveries() : CurrencyAmount {
    var calc = FinancialsCalculations.getTotalRecoveries()
    return sumOverExposures(calc)
  }
  
  property get NetPayments() : CurrencyAmount {
    var calc = FinancialsCalculations.getSubmittedNetPayments()
    return sumOverExposures(calc)
  }
  
  function sumOverExposures(calc : FinancialsCalculator) : CurrencyAmount {
    var val = this.Exposures.reduce(new CurrencyAmount(0, this.Claim.Currency), \ v, e -> v + nullToZero(calc.withExposure(e).Amount))
    return nullToZero(val)
  }

  private function nullToZero(val : CurrencyAmount) : CurrencyAmount {
    return val==null ? new CurrencyAmount(0, this.Claim.Currency) : val
  }
  
  @DataType("ripercentagedec")
  property get ProportionalShare () : BigDecimal {
    var propAgreements = this.Agreements.whereTypeIs(entity.ProportionalRIAgreement)
    if ( propAgreements.HasElements) {
      return propAgreements.reduce(0 as BigDecimal, \ v, p -> v + p.ProportionalShare)
    }
    return null
  }

  property get AgreementGroupSummaryString () : String {
    return
      DisplayKey.get("Web.Claim.Reinsurance.ReinsuranceSummary.GroupSubHeader", 
        this.Exposures.sortBy(\ e -> e.ClaimOrder).map(\ e -> e.PrimaryCoverage.DisplayName).join(", "),
        CurrencyUtil.renderAsCurrency(this.TotalPayments - this.TotalRecoveries),
        CurrencyUtil.renderAsCurrency(this.OpenReserves))
  }
}
